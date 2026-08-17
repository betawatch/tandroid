package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.ColoredImageSpan;

/* loaded from: classes3.dex */
public class Emoji {
    private static final String[] DEFAULT_RECENT;
    private static final int MAX_RECENT_EMOJI_COUNT = 48;
    public static int bigImgSize;
    public static int drawImgSize;
    private static SparseIntArray emojiAlphaMasks;
    private static Bitmap[][] emojiBmp;
    public static final HashMap<String, String> emojiColor;
    private static final int[] emojiCounts;
    public static boolean emojiDrawingUseAlpha;
    public static float emojiDrawingYOffset;
    public static final HashMap<String, Integer> emojiUseHistory;
    public static final Runnable invalidateUiRunnable;
    private static boolean[][] loadingEmoji;
    public static Paint placeholderPaint;
    public static final ArrayList<String> recentEmoji;
    private static boolean recentEmojiLoaded;
    private static final HashMap<CharSequence, DrawableInfo> rects = new HashMap<>();
    private static boolean inited = false;

    public static abstract class EmojiDrawable extends Drawable {
        public boolean fullSize = false;
        int placeholderColor = TLObject.FLAG_28;

        public boolean isLoaded() {
            return false;
        }

        public void preload() {
        }
    }

    static {
        String[][] strArr = EmojiData.data;
        emojiCounts = new int[]{strArr[0].length, strArr[1].length, strArr[2].length, strArr[3].length, strArr[4].length, strArr[5].length, strArr[6].length, strArr[7].length};
        emojiBmp = new Bitmap[8][];
        loadingEmoji = new boolean[8][];
        emojiUseHistory = new HashMap<>();
        recentEmoji = new ArrayList<>();
        emojiColor = new HashMap<>();
        invalidateUiRunnable = new Runnable() { // from class: org.telegram.messenger.Emoji$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Emoji.lambda$static$0();
            }
        };
        emojiDrawingUseAlpha = true;
        DEFAULT_RECENT = new String[]{"😂", "😘", "❤", "😍", "😊", "😁", "👍", "☺", "😔", "😄", "😭", "💋", "😒", "😳", "😜", "🙈", "😉", "😃", "😢", "😝", "😱", "😡", "😏", "😞", "😅", "😚", "🙊", "😌", "😀", "😋", "😆", "👌", "😐", "😕"};
        drawImgSize = AndroidUtilities.dp(20.0f);
        bigImgSize = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 34.0f);
        int i = 0;
        while (true) {
            Bitmap[][] bitmapArr = emojiBmp;
            if (i >= bitmapArr.length) {
                break;
            }
            int i2 = emojiCounts[i];
            bitmapArr[i] = new Bitmap[i2];
            loadingEmoji[i] = new boolean[i2];
            i++;
        }
        for (int i3 = 0; i3 < EmojiData.data.length; i3++) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = EmojiData.data[i3];
                if (i4 < strArr2.length) {
                    rects.put(strArr2[i4], new DrawableInfo((byte) i3, (short) i4, i4));
                    i4++;
                }
            }
        }
        Paint paint = new Paint();
        placeholderPaint = paint;
        paint.setColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiLoaded, new Object[0]);
    }

    public static void preloadEmoji(CharSequence charSequence) {
        DrawableInfo drawableInfo = getDrawableInfo(charSequence);
        if (drawableInfo != null) {
            loadEmoji(drawableInfo.page, drawableInfo.page2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void loadEmoji(final byte b, final short s) {
        if (emojiBmp[b][s] == null) {
            boolean[] zArr = loadingEmoji[b];
            if (zArr[s]) {
                return;
            }
            zArr[s] = true;
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.Emoji$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    Emoji.lambda$loadEmoji$1(b, s);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadEmoji$1(byte b, short s) {
        StringBuilder sb = new StringBuilder();
        sb.append("emoji/");
        Locale locale = Locale.US;
        sb.append(String.format(locale, "%d_%d.png", Byte.valueOf(b), Short.valueOf(s)));
        Bitmap loadBitmap = loadBitmap(sb.toString());
        try {
            if (emojiAlphaMasks == null) {
                emojiAlphaMasks = loadEmojiAlphaMasks();
            }
            SparseIntArray sparseIntArray = emojiAlphaMasks;
            int i = sparseIntArray != null ? sparseIntArray.get((b * 4096) + s, -1) : -1;
            if (loadBitmap != null && i != -1) {
                Bitmap loadBitmap2 = loadBitmap("emoji/masks/" + String.format(locale, "%d.png", Integer.valueOf(i)));
                if (loadBitmap2 != null) {
                    int width = loadBitmap.getWidth();
                    int height = loadBitmap.getHeight();
                    int i2 = width * height;
                    int[] iArr = new int[i2];
                    int[] iArr2 = new int[i2];
                    loadBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                    loadBitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
                    loadBitmap2.recycle();
                    for (int i3 = 0; i3 < i2; i3++) {
                        iArr[i3] = (iArr[i3] & 16777215) | ((iArr2[i3] & NotificationCenter.didReceiveSmsCode) << 24);
                    }
                    loadBitmap.recycle();
                    loadBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    loadBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (loadBitmap != null) {
            emojiBmp[b][s] = loadBitmap;
            Runnable runnable = invalidateUiRunnable;
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable);
        }
        loadingEmoji[b][s] = false;
    }

    private static SparseIntArray loadEmojiAlphaMasks() {
        try {
            InputStream open = ApplicationLoader.applicationContext.getAssets().open("emoji/metadata.bin");
            try {
                ArrayList arrayList = new ArrayList();
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int read = open.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byte[] bArr2 = new byte[read];
                    System.arraycopy(bArr, 0, bArr2, 0, read);
                    arrayList.add(bArr2);
                    i += read;
                }
                byte[] bArr3 = new byte[i];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    byte[] bArr4 = (byte[]) it.next();
                    System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
                    i2 += bArr4.length;
                }
                ByteBuffer order = ByteBuffer.wrap(bArr3).order(ByteOrder.LITTLE_ENDIAN);
                int i3 = i / 4;
                SparseIntArray sparseIntArray = new SparseIntArray(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    sparseIntArray.put(order.getShort() & 65535, 65535 & order.getShort());
                }
                open.close();
                return sparseIntArray;
            } finally {
            }
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static Bitmap loadBitmap(String str) {
        Bitmap bitmap;
        try {
            int i = AndroidUtilities.density <= 1.0f ? 2 : 1;
            try {
                InputStream open = ApplicationLoader.applicationContext.getAssets().open(str);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                options.inSampleSize = i;
                bitmap = BitmapFactory.decodeStream(open, null, options);
                try {
                    open.close();
                } catch (Throwable th) {
                    th = th;
                    FileLog.e(th);
                    return bitmap;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmap = null;
            }
            return bitmap;
        } catch (Throwable th3) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Error loading emoji", th3);
            }
            return null;
        }
    }

    public static void invalidateAll(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                invalidateAll(viewGroup.getChildAt(i));
            }
            return;
        }
        if (view instanceof TextView) {
            view.invalidate();
        }
    }

    public static String fixEmoji(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 55356 || charAt > 55358) {
                if (charAt == 8419) {
                    return str;
                }
                if (charAt >= 8252 && charAt <= 12953 && EmojiData.emojiToFE0FMap.containsKey(Character.valueOf(charAt))) {
                    StringBuilder sb = new StringBuilder();
                    i++;
                    sb.append(str.substring(0, i));
                    sb.append("️");
                    sb.append(str.substring(i));
                    str = sb.toString();
                    length++;
                }
            } else if (charAt != 55356 || i >= length - 1) {
                i++;
            } else {
                int i2 = i + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 == 56879 || charAt2 == 56324 || charAt2 == 56858 || charAt2 == 56703) {
                    StringBuilder sb2 = new StringBuilder();
                    i += 2;
                    sb2.append(str.substring(0, i));
                    sb2.append("️");
                    sb2.append(str.substring(i));
                    str = sb2.toString();
                    length++;
                } else {
                    i = i2;
                }
            }
            i++;
        }
        return str;
    }

    public static EmojiDrawable getEmojiDrawable(CharSequence charSequence) {
        CompoundEmoji.CompoundEmojiDrawable compoundEmojiDrawable;
        DrawableInfo drawableInfo = getDrawableInfo(charSequence);
        if (drawableInfo != null) {
            SimpleEmojiDrawable simpleEmojiDrawable = new SimpleEmojiDrawable(drawableInfo, endsWithRightArrow(charSequence));
            int i = drawImgSize;
            simpleEmojiDrawable.setBounds(0, 0, i, i);
            return simpleEmojiDrawable;
        }
        if (charSequence == null || (compoundEmojiDrawable = CompoundEmoji.getCompoundEmojiDrawable(charSequence.toString())) == null) {
            return null;
        }
        int i2 = drawImgSize;
        compoundEmojiDrawable.setBounds(0, 0, i2, i2);
        return compoundEmojiDrawable;
    }

    public static boolean endsWithRightArrow(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 2 && charSequence.charAt(charSequence.length() - 2) == 8205 && charSequence.charAt(charSequence.length() - 1) == 10145;
    }

    private static DrawableInfo getDrawableInfo(CharSequence charSequence) {
        CharSequence charSequence2;
        if (endsWithRightArrow(charSequence)) {
            charSequence = charSequence.subSequence(0, charSequence.length() - 2);
        }
        HashMap<CharSequence, DrawableInfo> hashMap = rects;
        DrawableInfo drawableInfo = hashMap.get(charSequence);
        return (drawableInfo != null || (charSequence2 = EmojiData.emojiAliasMap.get(charSequence)) == null) ? drawableInfo : hashMap.get(charSequence2);
    }

    public static boolean isValidEmoji(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        HashMap<CharSequence, DrawableInfo> hashMap = rects;
        DrawableInfo drawableInfo = hashMap.get(charSequence);
        if (drawableInfo == null && (charSequence2 = EmojiData.emojiAliasMap.get(charSequence)) != null) {
            drawableInfo = hashMap.get(charSequence2);
        }
        return drawableInfo != null;
    }

    public static Drawable getEmojiBigDrawable(String str) {
        CharSequence charSequence;
        EmojiDrawable compoundEmojiDrawable = CompoundEmoji.getCompoundEmojiDrawable(str);
        if (compoundEmojiDrawable != null) {
            int i = drawImgSize;
            compoundEmojiDrawable.setBounds(0, 0, i, i);
        } else {
            compoundEmojiDrawable = null;
        }
        if (compoundEmojiDrawable == null) {
            compoundEmojiDrawable = getEmojiDrawable(str);
        }
        if (compoundEmojiDrawable == null && (charSequence = EmojiData.emojiAliasMap.get(str)) != null) {
            compoundEmojiDrawable = getEmojiDrawable(charSequence);
        }
        if (compoundEmojiDrawable == null) {
            return null;
        }
        int i2 = bigImgSize;
        compoundEmojiDrawable.setBounds(0, 0, i2, i2);
        compoundEmojiDrawable.fullSize = true;
        return compoundEmojiDrawable;
    }

    public static class SimpleEmojiDrawable extends EmojiDrawable {
        private static Paint paint = new Paint(2);
        private static Rect rect = new Rect();
        private DrawableInfo info;
        private boolean invert;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public SimpleEmojiDrawable(DrawableInfo drawableInfo, boolean z) {
            this.info = drawableInfo;
            this.invert = z;
        }

        public DrawableInfo getDrawableInfo() {
            return this.info;
        }

        public Rect getDrawRect() {
            Rect bounds = getBounds();
            int centerX = bounds.centerX();
            int centerY = bounds.centerY();
            Rect rect2 = rect;
            boolean z = this.fullSize;
            rect2.left = centerX - ((z ? Emoji.bigImgSize : Emoji.drawImgSize) / 2);
            rect.right = centerX + ((z ? Emoji.bigImgSize : Emoji.drawImgSize) / 2);
            rect.top = centerY - ((z ? Emoji.bigImgSize : Emoji.drawImgSize) / 2);
            rect.bottom = centerY + ((z ? Emoji.bigImgSize : Emoji.drawImgSize) / 2);
            return rect;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Rect bounds;
            if (!isLoaded()) {
                DrawableInfo drawableInfo = this.info;
                Emoji.loadEmoji(drawableInfo.page, drawableInfo.page2);
                Emoji.placeholderPaint.setColor(this.placeholderColor);
                Rect bounds2 = getBounds();
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, Emoji.placeholderPaint);
                return;
            }
            if (this.fullSize) {
                bounds = getDrawRect();
            } else {
                bounds = getBounds();
            }
            if (canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
                return;
            }
            if (this.invert) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, bounds.centerX(), bounds.centerY());
            }
            Bitmap[][] bitmapArr = Emoji.emojiBmp;
            DrawableInfo drawableInfo2 = this.info;
            canvas.drawBitmap(bitmapArr[drawableInfo2.page][drawableInfo2.page2], (Rect) null, bounds, paint);
            if (this.invert) {
                canvas.restore();
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            paint.setAlpha(i);
        }

        @Override // org.telegram.messenger.Emoji.EmojiDrawable
        public boolean isLoaded() {
            Bitmap[][] bitmapArr = Emoji.emojiBmp;
            DrawableInfo drawableInfo = this.info;
            return bitmapArr[drawableInfo.page][drawableInfo.page2] != null;
        }

        @Override // org.telegram.messenger.Emoji.EmojiDrawable
        public void preload() {
            if (isLoaded()) {
                return;
            }
            DrawableInfo drawableInfo = this.info;
            Emoji.loadEmoji(drawableInfo.page, drawableInfo.page2);
        }
    }

    private static class DrawableInfo {
        public int emojiIndex;
        public byte page;
        public short page2;

        public DrawableInfo(byte b, short s, int i) {
            this.page = b;
            this.page2 = s;
            this.emojiIndex = i;
        }
    }

    public static class EmojiSpanRange {
        public CharSequence code;
        public int end;
        public int start;

        public EmojiSpanRange(int i, int i2, CharSequence charSequence) {
            this.start = i;
            this.end = i2;
            this.code = charSequence;
        }
    }

    public static boolean fullyConsistsOfEmojis(CharSequence charSequence) {
        int[] iArr = new int[1];
        parseEmojis(charSequence, iArr);
        return iArr[0] > 0;
    }

    public static ArrayList<EmojiSpanRange> parseEmojis(CharSequence charSequence) {
        return parseEmojis(charSequence, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00fe A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:8:0x0029, B:15:0x006e, B:18:0x011d, B:20:0x0121, B:22:0x012e, B:26:0x013c, B:30:0x019f, B:32:0x01a3, B:36:0x01b0, B:38:0x01b6, B:40:0x0211, B:55:0x01e6, B:57:0x01ea, B:67:0x0200, B:69:0x0204, B:81:0x0218, B:83:0x021f, B:85:0x0223, B:87:0x022e, B:91:0x023c, B:94:0x024c, B:96:0x0255, B:98:0x0258, B:99:0x0269, B:106:0x0149, B:108:0x0150, B:110:0x015a, B:114:0x0169, B:116:0x016f, B:117:0x0176, B:119:0x017e, B:120:0x0185, B:122:0x018f, B:133:0x0043, B:135:0x004e, B:142:0x007d, B:150:0x009a, B:154:0x0091, B:159:0x00ac, B:163:0x00c0, B:179:0x00fe, B:189:0x00e1, B:194:0x00f7), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011d A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:8:0x0029, B:15:0x006e, B:18:0x011d, B:20:0x0121, B:22:0x012e, B:26:0x013c, B:30:0x019f, B:32:0x01a3, B:36:0x01b0, B:38:0x01b6, B:40:0x0211, B:55:0x01e6, B:57:0x01ea, B:67:0x0200, B:69:0x0204, B:81:0x0218, B:83:0x021f, B:85:0x0223, B:87:0x022e, B:91:0x023c, B:94:0x024c, B:96:0x0255, B:98:0x0258, B:99:0x0269, B:106:0x0149, B:108:0x0150, B:110:0x015a, B:114:0x0169, B:116:0x016f, B:117:0x0176, B:119:0x017e, B:120:0x0185, B:122:0x018f, B:133:0x0043, B:135:0x004e, B:142:0x007d, B:150:0x009a, B:154:0x0091, B:159:0x00ac, B:163:0x00c0, B:179:0x00fe, B:189:0x00e1, B:194:0x00f7), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019f A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:8:0x0029, B:15:0x006e, B:18:0x011d, B:20:0x0121, B:22:0x012e, B:26:0x013c, B:30:0x019f, B:32:0x01a3, B:36:0x01b0, B:38:0x01b6, B:40:0x0211, B:55:0x01e6, B:57:0x01ea, B:67:0x0200, B:69:0x0204, B:81:0x0218, B:83:0x021f, B:85:0x0223, B:87:0x022e, B:91:0x023c, B:94:0x024c, B:96:0x0255, B:98:0x0258, B:99:0x0269, B:106:0x0149, B:108:0x0150, B:110:0x015a, B:114:0x0169, B:116:0x016f, B:117:0x0176, B:119:0x017e, B:120:0x0185, B:122:0x018f, B:133:0x0043, B:135:0x004e, B:142:0x007d, B:150:0x009a, B:154:0x0091, B:159:0x00ac, B:163:0x00c0, B:179:0x00fe, B:189:0x00e1, B:194:0x00f7), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021f A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:8:0x0029, B:15:0x006e, B:18:0x011d, B:20:0x0121, B:22:0x012e, B:26:0x013c, B:30:0x019f, B:32:0x01a3, B:36:0x01b0, B:38:0x01b6, B:40:0x0211, B:55:0x01e6, B:57:0x01ea, B:67:0x0200, B:69:0x0204, B:81:0x0218, B:83:0x021f, B:85:0x0223, B:87:0x022e, B:91:0x023c, B:94:0x024c, B:96:0x0255, B:98:0x0258, B:99:0x0269, B:106:0x0149, B:108:0x0150, B:110:0x015a, B:114:0x0169, B:116:0x016f, B:117:0x0176, B:119:0x017e, B:120:0x0185, B:122:0x018f, B:133:0x0043, B:135:0x004e, B:142:0x007d, B:150:0x009a, B:154:0x0091, B:159:0x00ac, B:163:0x00c0, B:179:0x00fe, B:189:0x00e1, B:194:0x00f7), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList<EmojiSpanRange> parseEmojis(CharSequence charSequence, int[] iArr) {
        boolean z;
        char charAt;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt2;
        int i7;
        ArrayList<EmojiSpanRange> arrayList = new ArrayList<>();
        if (charSequence != null && charSequence.length() > 0) {
            StringBuilder sb = new StringBuilder(16);
            int length = charSequence.length();
            int[] iArr2 = iArr;
            int i8 = 0;
            int i9 = 0;
            long j = 0;
            int i10 = -1;
            int i11 = 0;
            boolean z3 = false;
            boolean z4 = false;
            while (i9 < length) {
                try {
                    char charAt3 = charSequence.charAt(i9);
                    if (charAt3 >= 55356 && charAt3 <= 55358) {
                        i = -1;
                    } else if (j == 0 || (j & (-4294967296L)) != 0 || (j & 65535) != 55356 || charAt3 < 56806 || charAt3 > 56831) {
                        if ((sb.length() <= 0 || !(charAt3 == 9792 || charAt3 == 9794 || charAt3 == 9877)) && (j <= 0 || (61440 & charAt3) != 53248)) {
                            if (charAt3 != 8419) {
                                if (charAt3 != 169) {
                                    if (charAt3 != 174) {
                                        if (charAt3 >= 8252 && charAt3 <= 12953) {
                                        }
                                        if (i10 == -1) {
                                            sb.setLength(0);
                                            z = false;
                                            i10 = -1;
                                            i11 = 0;
                                            z3 = false;
                                            z4 = false;
                                        } else if (charAt3 != 65039 && charAt3 != '\n' && charAt3 != ' ' && charAt3 != '\t') {
                                            z = true;
                                        }
                                        if (z4) {
                                        }
                                        z2 = z;
                                        i8 = i9;
                                        i2 = i8;
                                        while (i3 < 3) {
                                        }
                                        if (z2) {
                                        }
                                        if (z4) {
                                        }
                                        if (z4) {
                                        }
                                        i9 = i2 + 1;
                                    }
                                }
                                if (EmojiData.dataCharsMap.containsKey(Character.valueOf(charAt3))) {
                                    if (i10 == -1) {
                                        i10 = i9;
                                    } else if (z3) {
                                        i10 = i9;
                                        i11 = 0;
                                        z3 = false;
                                    }
                                    i11++;
                                    sb.append(charAt3);
                                }
                                if (i10 == -1) {
                                }
                                if (z4) {
                                }
                                z2 = z;
                                i8 = i9;
                                i2 = i8;
                                while (i3 < 3) {
                                }
                                if (z2) {
                                }
                                if (z4) {
                                }
                                if (z4) {
                                }
                                i9 = i2 + 1;
                            } else if (i9 > 0 && (((charAt = charSequence.charAt(i8)) >= '0' && charAt <= '9') || charAt == '#' || charAt == '*')) {
                                i11 = (i9 - i8) + 1;
                                sb.append(charAt);
                                sb.append(charAt3);
                                i10 = i8;
                                z = false;
                                z3 = false;
                                z4 = true;
                                if (z4 || (i7 = i9 + 2) >= length) {
                                    z2 = z;
                                } else {
                                    int i12 = i9 + 1;
                                    char charAt4 = charSequence.charAt(i12);
                                    z2 = z;
                                    if (charAt4 == 55356) {
                                        char charAt5 = charSequence.charAt(i7);
                                        if (charAt5 >= 57339 && charAt5 <= 57343) {
                                            sb.append(charSequence.subSequence(i12, i9 + 3));
                                            i11 += 2;
                                            i8 = i7;
                                            i2 = i8;
                                            for (i3 = 0; i3 < 3; i3++) {
                                                int i13 = i2 + 1;
                                                if (i13 < length) {
                                                    char charAt6 = charSequence.charAt(i13);
                                                    if (i3 == 1) {
                                                        if (charAt6 == 8205 && sb.length() > 0) {
                                                            sb.append(charAt6);
                                                            i11++;
                                                            i2 = i13;
                                                            z4 = false;
                                                            z2 = false;
                                                        }
                                                    } else if (charAt3 == '*' || charAt3 == '#' || (charAt3 >= '0' && charAt3 <= '9')) {
                                                        if (charAt6 >= 65024) {
                                                            if (charAt6 <= 65039) {
                                                                i11++;
                                                                if (!z4) {
                                                                    z4 = i2 + 2 >= length;
                                                                }
                                                                i10 = i8;
                                                                i2 = i13;
                                                                z3 = true;
                                                            }
                                                        }
                                                    } else if (i10 != -1 && charAt6 >= 65024) {
                                                        if (charAt6 <= 65039) {
                                                            i11++;
                                                            if (!z4) {
                                                                z4 = i2 + 2 >= length;
                                                            }
                                                            i2 = i13;
                                                        }
                                                    }
                                                }
                                            }
                                            if (z2 && iArr2 != null) {
                                                iArr2[0] = 0;
                                                iArr2 = null;
                                            }
                                            if (z4 && (i5 = i2 + 2) < length) {
                                                i6 = i2 + 1;
                                                if (charSequence.charAt(i6) == 55356 && (charAt2 = charSequence.charAt(i5)) >= 57339 && charAt2 <= 57343) {
                                                    sb.append(charSequence.subSequence(i6, i2 + 3));
                                                    i11 += 2;
                                                    i2 = i5;
                                                }
                                            }
                                            if (z4) {
                                                if (iArr2 != null) {
                                                    iArr2[0] = iArr2[0] + 1;
                                                }
                                                if (i10 >= 0 && (i4 = i11 + i10) <= length) {
                                                    arrayList.add(new EmojiSpanRange(i10, i4, sb.subSequence(0, sb.length())));
                                                }
                                                sb.setLength(0);
                                                i10 = -1;
                                                i11 = 0;
                                                z3 = false;
                                                z4 = false;
                                            }
                                            i9 = i2 + 1;
                                        }
                                    } else if (sb.length() >= 2 && sb.charAt(0) == 55356 && sb.charAt(1) == 57332 && charAt4 == 56128) {
                                        do {
                                            if (i12 < charSequence.length()) {
                                                sb.append(charSequence.charAt(i12));
                                            }
                                            i9 = i12 + 1;
                                            if (i9 < charSequence.length()) {
                                                sb.append(charSequence.charAt(i9));
                                            }
                                            i11 += 2;
                                            i12 += 2;
                                            if (i12 >= charSequence.length()) {
                                                break;
                                            }
                                        } while (charSequence.charAt(i12) == 56128);
                                    }
                                }
                                i8 = i9;
                                i2 = i8;
                                while (i3 < 3) {
                                }
                                if (z2) {
                                    iArr2[0] = 0;
                                    iArr2 = null;
                                }
                                if (z4) {
                                    i6 = i2 + 1;
                                    if (charSequence.charAt(i6) == 55356) {
                                        sb.append(charSequence.subSequence(i6, i2 + 3));
                                        i11 += 2;
                                        i2 = i5;
                                    }
                                }
                                if (z4) {
                                }
                                i9 = i2 + 1;
                            }
                            z = false;
                            if (z4) {
                            }
                            z2 = z;
                            i8 = i9;
                            i2 = i8;
                            while (i3 < 3) {
                            }
                            if (z2) {
                            }
                            if (z4) {
                            }
                            if (z4) {
                            }
                            i9 = i2 + 1;
                        } else {
                            sb.append(charAt3);
                            i11++;
                            j = 0;
                        }
                        z = false;
                        z4 = true;
                        if (z4) {
                        }
                        z2 = z;
                        i8 = i9;
                        i2 = i8;
                        while (i3 < 3) {
                        }
                        if (z2) {
                        }
                        if (z4) {
                        }
                        if (z4) {
                        }
                        i9 = i2 + 1;
                    } else {
                        i = -1;
                    }
                    if (i10 == i) {
                        i10 = i9;
                    } else if (z3) {
                        i10 = i9;
                        i11 = 0;
                        z3 = false;
                    }
                    sb.append(charAt3);
                    i11++;
                    j = (j << 16) | charAt3;
                    z = false;
                    if (z4) {
                    }
                    z2 = z;
                    i8 = i9;
                    i2 = i8;
                    while (i3 < 3) {
                    }
                    if (z2) {
                    }
                    if (z4) {
                    }
                    if (z4) {
                    }
                    i9 = i2 + 1;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (iArr2 != null && sb.length() != 0) {
                iArr2[0] = 0;
            }
        }
        return arrayList;
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z) {
        return replaceEmoji(charSequence, fontMetricsInt, z, (int[]) null);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z, float f) {
        return replaceEmoji(charSequence, fontMetricsInt, z, null, 0, f, 0);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z, int[] iArr) {
        return replaceEmoji(charSequence, fontMetricsInt, z, iArr, 0);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z, int[] iArr, int i) {
        return replaceEmoji(charSequence, fontMetricsInt, z, iArr, i, 1.0f, 0);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z, int[] iArr, int i, float f, int i2) {
        Spannable newSpannable;
        int i3;
        int i4;
        if (SharedConfig.useSystemEmoji || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        if (!z && (charSequence instanceof Spannable)) {
            newSpannable = (Spannable) charSequence;
        } else {
            newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence);
        }
        ArrayList<EmojiSpanRange> parseEmojis = parseEmojis(newSpannable, iArr);
        if (parseEmojis.isEmpty()) {
            return charSequence;
        }
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) newSpannable.getSpans(0, newSpannable.length(), AnimatedEmojiSpan.class);
        ColoredImageSpan[] coloredImageSpanArr = (ColoredImageSpan[]) newSpannable.getSpans(0, newSpannable.length(), ColoredImageSpan.class);
        int i5 = (SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50) - i2;
        for (int i6 = 0; i6 < parseEmojis.size(); i6++) {
            try {
                EmojiSpanRange emojiSpanRange = parseEmojis.get(i6);
                if (animatedEmojiSpanArr != null && animatedEmojiSpanArr.length > 0) {
                    while (i4 < animatedEmojiSpanArr.length) {
                        AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[i4];
                        i4 = (animatedEmojiSpan != null && newSpannable.getSpanStart(animatedEmojiSpan) == emojiSpanRange.start && newSpannable.getSpanEnd(animatedEmojiSpan) == emojiSpanRange.end) ? 0 : i4 + 1;
                    }
                }
                if (coloredImageSpanArr != null && coloredImageSpanArr.length > 0) {
                    while (i3 < coloredImageSpanArr.length) {
                        ColoredImageSpan coloredImageSpan = coloredImageSpanArr[i3];
                        i3 = (coloredImageSpan != null && newSpannable.getSpanStart(coloredImageSpan) == emojiSpanRange.start && newSpannable.getSpanEnd(coloredImageSpan) == emojiSpanRange.end) ? 0 : i3 + 1;
                    }
                }
                EmojiDrawable emojiDrawable = getEmojiDrawable(emojiSpanRange.code);
                if (emojiDrawable != null) {
                    EmojiSpan emojiSpan = new EmojiSpan(emojiDrawable, i, fontMetricsInt);
                    CharSequence charSequence2 = emojiSpanRange.code;
                    emojiSpan.emoji = charSequence2 == null ? null : charSequence2.toString();
                    emojiSpan.scale = f;
                    newSpannable.setSpan(emojiSpan, emojiSpanRange.start, emojiSpanRange.end, 33);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            int i7 = Build.VERSION.SDK_INT;
            if ((i7 < 23 || i7 >= 29) && i6 + 1 >= i5) {
                break;
            }
        }
        return newSpannable;
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, TextView textView, Runnable runnable) {
        return replaceWithRestrictedEmoji(charSequence, textView.getPaint().getFontMetricsInt(), runnable);
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, Runnable runnable) {
        return replaceWithRestrictedEmoji(charSequence, fontMetricsInt, 20, runnable);
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, int i, final Runnable runnable) {
        Spannable newSpannable;
        TLRPC.Document document;
        AnimatedEmojiSpan animatedEmojiSpan;
        int i2;
        if (SharedConfig.useSystemEmoji || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i3 = UserConfig.selectedAccount;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i3).getStickerSet(tL_inputStickerSetShortName, 0, false, true, runnable == null ? null : new Utilities.Callback() { // from class: org.telegram.messenger.Emoji$$ExternalSyntheticLambda3
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                runnable.run();
            }
        });
        if (charSequence instanceof Spannable) {
            newSpannable = (Spannable) charSequence;
        } else {
            newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence.toString());
        }
        ArrayList<EmojiSpanRange> parseEmojis = parseEmojis(newSpannable, null);
        if (parseEmojis.isEmpty()) {
            return charSequence;
        }
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) newSpannable.getSpans(0, newSpannable.length(), AnimatedEmojiSpan.class);
        int i4 = SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50;
        for (int i5 = 0; i5 < parseEmojis.size(); i5++) {
            try {
                EmojiSpanRange emojiSpanRange = parseEmojis.get(i5);
                if (animatedEmojiSpanArr != null) {
                    while (i2 < animatedEmojiSpanArr.length) {
                        AnimatedEmojiSpan animatedEmojiSpan2 = animatedEmojiSpanArr[i2];
                        i2 = (animatedEmojiSpan2 != null && newSpannable.getSpanStart(animatedEmojiSpan2) == emojiSpanRange.start && newSpannable.getSpanEnd(animatedEmojiSpan2) == emojiSpanRange.end) ? 0 : i2 + 1;
                    }
                }
                if (stickerSet != null) {
                    Iterator<TLRPC.Document> it = stickerSet.documents.iterator();
                    while (it.hasNext()) {
                        document = it.next();
                        if (MessageObject.findAnimatedEmojiEmoticon(document, null).contains(emojiSpanRange.code)) {
                            break;
                        }
                    }
                }
                document = null;
                if (document != null) {
                    animatedEmojiSpan = new AnimatedEmojiSpan(document, fontMetricsInt);
                } else {
                    animatedEmojiSpan = new AnimatedEmojiSpan(0L, fontMetricsInt);
                }
                animatedEmojiSpan.emoji = emojiSpanRange.code.toString();
                animatedEmojiSpan.cacheType = i;
                newSpannable.setSpan(animatedEmojiSpan, emojiSpanRange.start, emojiSpanRange.end, 33);
            } catch (Exception e) {
                FileLog.e(e);
            }
            int i6 = Build.VERSION.SDK_INT;
            if ((i6 < 23 || i6 >= 29) && i5 + 1 >= i4) {
                break;
            }
        }
        return newSpannable;
    }

    public static class EmojiSpan extends ImageSpan {
        public boolean drawn;
        public String emoji;
        public Paint.FontMetricsInt fontMetrics;
        public float lastDrawX;
        public float lastDrawY;
        private int minimumLineHeight;
        private boolean preserveFontMetrics;
        public float scale;
        public int size;

        public EmojiSpan(Drawable drawable, int i, Paint.FontMetricsInt fontMetricsInt) {
            super(drawable, i);
            this.scale = 1.0f;
            this.size = AndroidUtilities.dp(20.0f);
            this.fontMetrics = fontMetricsInt;
            if (fontMetricsInt != null) {
                int abs = Math.abs(fontMetricsInt.descent) + Math.abs(this.fontMetrics.ascent);
                this.size = abs;
                if (abs == 0) {
                    this.size = AndroidUtilities.dp(20.0f);
                }
            }
        }

        public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i) {
            this.fontMetrics = fontMetricsInt;
            this.size = i;
        }

        public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
            this.fontMetrics = fontMetricsInt;
            if (fontMetricsInt != null) {
                int abs = Math.abs(fontMetricsInt.descent) + Math.abs(this.fontMetrics.ascent);
                this.size = abs;
                if (abs == 0) {
                    this.size = AndroidUtilities.dp(20.0f);
                }
            }
        }

        public EmojiSpan setPreserveFontMetrics(boolean z) {
            this.preserveFontMetrics = z;
            return this;
        }

        public EmojiSpan setMinimumLineHeight(int i) {
            this.minimumLineHeight = i;
            return this;
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
            boolean z = this.preserveFontMetrics && fontMetricsInt2 != null;
            int i3 = z ? fontMetricsInt2.top : 0;
            int i4 = z ? fontMetricsInt2.ascent : 0;
            int i5 = z ? fontMetricsInt2.descent : 0;
            int i6 = z ? fontMetricsInt2.bottom : 0;
            int i7 = z ? fontMetricsInt2.leading : 0;
            if (fontMetricsInt2 == null) {
                fontMetricsInt2 = new Paint.FontMetricsInt();
            }
            Paint.FontMetricsInt fontMetricsInt3 = fontMetricsInt2;
            int i8 = (int) (this.scale * this.size);
            Paint.FontMetricsInt fontMetricsInt4 = this.fontMetrics;
            if (fontMetricsInt4 == null) {
                int size = super.getSize(paint, charSequence, i, i2, fontMetricsInt3);
                int dp = AndroidUtilities.dp(8.0f);
                int dp2 = AndroidUtilities.dp(10.0f);
                int i9 = (-dp2) - dp;
                fontMetricsInt3.top = i9;
                int i10 = dp2 - dp;
                fontMetricsInt3.bottom = i10;
                fontMetricsInt3.ascent = i9;
                fontMetricsInt3.leading = 0;
                fontMetricsInt3.descent = i10;
                if (z) {
                    fontMetricsInt3.top = i3;
                    fontMetricsInt3.ascent = i4;
                    fontMetricsInt3.descent = i5;
                    fontMetricsInt3.bottom = i6;
                    fontMetricsInt3.leading = i7;
                    expandFontMetrics(fontMetricsInt3, this.minimumLineHeight);
                }
                return size;
            }
            fontMetricsInt3.ascent = fontMetricsInt4.ascent;
            fontMetricsInt3.descent = fontMetricsInt4.descent;
            fontMetricsInt3.top = fontMetricsInt4.top;
            fontMetricsInt3.bottom = fontMetricsInt4.bottom;
            if (getDrawable() != null) {
                getDrawable().setBounds(0, 0, i8, i8);
            }
            if (z) {
                fontMetricsInt3.top = i3;
                fontMetricsInt3.ascent = i4;
                fontMetricsInt3.descent = i5;
                fontMetricsInt3.bottom = i6;
                fontMetricsInt3.leading = i7;
                expandFontMetrics(fontMetricsInt3, this.minimumLineHeight);
            }
            return i8;
        }

        private static void expandFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i) {
            int i2 = fontMetricsInt.descent;
            int i3 = fontMetricsInt.ascent;
            int i4 = i2 - i3;
            if (i <= i4) {
                return;
            }
            int i5 = i - i4;
            int i6 = (i5 + 1) / 2;
            int i7 = i3 - i6;
            fontMetricsInt.ascent = i7;
            fontMetricsInt.descent = i2 + (i5 - i6);
            fontMetricsInt.top = Math.min(fontMetricsInt.top, i7);
            fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            boolean z;
            this.lastDrawX = ((this.scale * this.size) / 2.0f) + f;
            this.lastDrawY = i3 + ((i5 - i3) / 2.0f);
            boolean z2 = true;
            this.drawn = true;
            if (paint.getAlpha() == 255 || !Emoji.emojiDrawingUseAlpha) {
                z = false;
            } else {
                getDrawable().setAlpha(paint.getAlpha());
                z = true;
            }
            float f2 = Emoji.emojiDrawingYOffset;
            float f3 = this.size;
            float f4 = f2 - ((f3 - (this.scale * f3)) / 2.0f);
            if (f4 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, f4);
            } else {
                z2 = false;
            }
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
            if (z2) {
                canvas.restore();
            }
            if (z) {
                getDrawable().setAlpha(NotificationCenter.didReceiveSmsCode);
            }
        }

        @Override // android.text.style.ReplacementSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            if (getDrawable() instanceof EmojiDrawable) {
                ((EmojiDrawable) getDrawable()).placeholderColor = textPaint.getColor() & 285212671;
            }
            super.updateDrawState(textPaint);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EmojiSpan emojiSpan = (EmojiSpan) obj;
            return Float.compare(this.scale, emojiSpan.scale) == 0 && this.size == emojiSpan.size && Objects.equals(this.emoji, emojiSpan.emoji);
        }
    }

    public static void addRecentEmoji(String str) {
        HashMap<String, Integer> hashMap = emojiUseHistory;
        Integer num = hashMap.get(str);
        if (num == null) {
            num = 0;
        }
        if (num.intValue() == 0 && hashMap.size() >= 48) {
            ArrayList<String> arrayList = recentEmoji;
            hashMap.remove(arrayList.get(arrayList.size() - 1));
            arrayList.set(arrayList.size() - 1, str);
        }
        hashMap.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static void removeRecentEmoji(String str) {
        HashMap<String, Integer> hashMap = emojiUseHistory;
        hashMap.remove(str);
        ArrayList<String> arrayList = recentEmoji;
        arrayList.remove(str);
        if (hashMap.isEmpty() || arrayList.isEmpty()) {
            addRecentEmoji(DEFAULT_RECENT[0]);
        }
    }

    public static void sortEmoji() {
        recentEmoji.clear();
        Iterator<Map.Entry<String, Integer>> it = emojiUseHistory.entrySet().iterator();
        while (it.hasNext()) {
            recentEmoji.add(it.next().getKey());
        }
        Collections.sort(recentEmoji, new Comparator() { // from class: org.telegram.messenger.Emoji$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$sortEmoji$3;
                lambda$sortEmoji$3 = Emoji.lambda$sortEmoji$3((String) obj, (String) obj2);
                return lambda$sortEmoji$3;
            }
        });
        while (true) {
            ArrayList<String> arrayList = recentEmoji;
            if (arrayList.size() <= 48) {
                return;
            } else {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortEmoji$3(String str, String str2) {
        HashMap<String, Integer> hashMap = emojiUseHistory;
        Integer num = hashMap.get(str);
        Integer num2 = hashMap.get(str2);
        if (num == null) {
            num = 0;
        }
        if (num2 == null) {
            num2 = 0;
        }
        if (num.intValue() > num2.intValue()) {
            return -1;
        }
        return num.intValue() < num2.intValue() ? 1 : 0;
    }

    public static void saveRecentEmoji() {
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : emojiUseHistory.entrySet()) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        globalEmojiSettings.edit().putString("emojis2", sb.toString()).commit();
    }

    public static void clearRecentEmoji() {
        MessagesController.getGlobalEmojiSettings().edit().putBoolean("filled_default", true).commit();
        emojiUseHistory.clear();
        recentEmoji.clear();
        saveRecentEmoji();
    }

    public static void loadRecentEmoji() {
        if (recentEmojiLoaded) {
            return;
        }
        recentEmojiLoaded = true;
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        try {
            emojiUseHistory.clear();
            if (globalEmojiSettings.contains("emojis")) {
                String string = globalEmojiSettings.getString("emojis", "");
                if (string != null && string.length() > 0) {
                    for (String str : string.split(",")) {
                        String[] split = str.split("=");
                        long longValue = Utilities.parseLong(split[0]).longValue();
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < 4; i++) {
                            sb.insert(0, (char) longValue);
                            longValue >>= 16;
                            if (longValue == 0) {
                                break;
                            }
                        }
                        if (sb.length() > 0) {
                            emojiUseHistory.put(sb.toString(), Utilities.parseInt((CharSequence) split[1]));
                        }
                    }
                }
                globalEmojiSettings.edit().remove("emojis").commit();
                saveRecentEmoji();
            } else {
                String string2 = globalEmojiSettings.getString("emojis2", "");
                if (string2 != null && string2.length() > 0) {
                    for (String str2 : string2.split(",")) {
                        String[] split2 = str2.split("=");
                        emojiUseHistory.put(split2[0], Utilities.parseInt((CharSequence) split2[1]));
                    }
                }
            }
            if (emojiUseHistory.isEmpty() && !globalEmojiSettings.getBoolean("filled_default", false)) {
                int i2 = 0;
                while (true) {
                    String[] strArr = DEFAULT_RECENT;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    emojiUseHistory.put(strArr[i2], Integer.valueOf(strArr.length - i2));
                    i2++;
                }
                globalEmojiSettings.edit().putBoolean("filled_default", true).commit();
                saveRecentEmoji();
            }
            sortEmoji();
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            String string3 = globalEmojiSettings.getString("color", "");
            if (string3 == null || string3.length() <= 0) {
                return;
            }
            for (String str3 : string3.split(",")) {
                String[] split3 = str3.split("=");
                emojiColor.put(split3[0], split3[1]);
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public static void saveEmojiColors() {
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : emojiColor.entrySet()) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        globalEmojiSettings.edit().putString("color", sb.toString()).commit();
    }
}
