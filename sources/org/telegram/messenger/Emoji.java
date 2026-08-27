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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cq;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
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

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static class DrawableInfo {
        public int emojiIndex;
        public byte page;
        public short page2;

        public DrawableInfo(byte b10, short s10, int i10) {
            this.page = b10;
            this.page2 = s10;
            this.emojiIndex = i10;
        }
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static class EmojiSpanRange {
        public CharSequence code;
        public int end;
        public int start;

        public EmojiSpanRange(int i10, int i11, CharSequence charSequence) {
            this.start = i10;
            this.end = i11;
            this.code = charSequence;
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
        invalidateUiRunnable = new w1(8);
        emojiDrawingUseAlpha = true;
        DEFAULT_RECENT = new String[]{"😂", "😘", "❤", "😍", "😊", "😁", "👍", "☺", "😔", "😄", "😭", "💋", "😒", "😳", "😜", "🙈", "😉", "😃", "😢", "😝", "😱", "😡", "😏", "😞", "😅", "😚", "🙊", "😌", "😀", "😋", "😆", "👌", "😐", "😕"};
        drawImgSize = AndroidUtilities.dp(20.0f);
        bigImgSize = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 34.0f);
        int i10 = 0;
        while (true) {
            Bitmap[][] bitmapArr = emojiBmp;
            if (i10 >= bitmapArr.length) {
                break;
            }
            int i11 = emojiCounts[i10];
            bitmapArr[i10] = new Bitmap[i11];
            loadingEmoji[i10] = new boolean[i11];
            i10++;
        }
        for (int i12 = 0; i12 < EmojiData.data.length; i12++) {
            int i13 = 0;
            while (true) {
                String[] strArr2 = EmojiData.data[i12];
                if (i13 < strArr2.length) {
                    rects.put(strArr2[i13], new DrawableInfo((byte) i12, (short) i13, i13));
                    i13++;
                }
            }
        }
        Paint paint = new Paint();
        placeholderPaint = paint;
        paint.setColor(0);
    }

    public static void addRecentEmoji(String str) {
        HashMap<String, Integer> hashMap = emojiUseHistory;
        Integer num = hashMap.get(str);
        if (num == null) {
            num = 0;
        }
        if (num.intValue() == 0 && hashMap.size() >= 48) {
            ArrayList<String> arrayList = recentEmoji;
            hashMap.remove((String) i0.a.i(1, arrayList));
            arrayList.set(arrayList.size() - 1, str);
        }
        hashMap.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static void clearRecentEmoji() {
        MessagesController.getGlobalEmojiSettings().edit().putBoolean("filled_default", true).commit();
        emojiUseHistory.clear();
        recentEmoji.clear();
        saveRecentEmoji();
    }

    public static boolean endsWithRightArrow(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 2 && charSequence.charAt(charSequence.length() - 2) == 8205 && charSequence.charAt(charSequence.length() - 1) == 10145;
    }

    public static String fixEmoji(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt < 55356 || charAt > 55358) {
                if (charAt == 8419) {
                    return str;
                }
                if (charAt >= 8252 && charAt <= 12953 && EmojiData.emojiToFE0FMap.containsKey(Character.valueOf(charAt))) {
                    StringBuilder sb2 = new StringBuilder();
                    i10++;
                    sb2.append(str.substring(0, i10));
                    sb2.append("️");
                    sb2.append(str.substring(i10));
                    str = sb2.toString();
                    length++;
                }
            } else if (charAt != 55356 || i10 >= length - 1) {
                i10++;
            } else {
                int i11 = i10 + 1;
                char charAt2 = str.charAt(i11);
                if (charAt2 == 56879 || charAt2 == 56324 || charAt2 == 56858 || charAt2 == 56703) {
                    StringBuilder sb3 = new StringBuilder();
                    i10 += 2;
                    sb3.append(str.substring(0, i10));
                    sb3.append("️");
                    sb3.append(str.substring(i10));
                    str = sb3.toString();
                    length++;
                } else {
                    i10 = i11;
                }
            }
            i10++;
        }
        return str;
    }

    public static boolean fullyConsistsOfEmojis(CharSequence charSequence) {
        int[] iArr = new int[1];
        parseEmojis(charSequence, iArr);
        return iArr[0] > 0;
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

    public static Drawable getEmojiBigDrawable(String str) {
        CharSequence charSequence;
        EmojiDrawable compoundEmojiDrawable = CompoundEmoji.getCompoundEmojiDrawable(str);
        if (compoundEmojiDrawable != null) {
            int i10 = drawImgSize;
            compoundEmojiDrawable.setBounds(0, 0, i10, i10);
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
        int i11 = bigImgSize;
        compoundEmojiDrawable.setBounds(0, 0, i11, i11);
        compoundEmojiDrawable.fullSize = true;
        return compoundEmojiDrawable;
    }

    public static EmojiDrawable getEmojiDrawable(CharSequence charSequence) {
        CompoundEmoji.CompoundEmojiDrawable compoundEmojiDrawable;
        DrawableInfo drawableInfo = getDrawableInfo(charSequence);
        if (drawableInfo != null) {
            SimpleEmojiDrawable simpleEmojiDrawable = new SimpleEmojiDrawable(drawableInfo, endsWithRightArrow(charSequence));
            int i10 = drawImgSize;
            simpleEmojiDrawable.setBounds(0, 0, i10, i10);
            return simpleEmojiDrawable;
        }
        if (charSequence == null || (compoundEmojiDrawable = CompoundEmoji.getCompoundEmojiDrawable(charSequence.toString())) == null) {
            return null;
        }
        int i11 = drawImgSize;
        compoundEmojiDrawable.setBounds(0, 0, i11, i11);
        return compoundEmojiDrawable;
    }

    public static void invalidateAll(View view) {
        if (!(view instanceof ViewGroup)) {
            if (view instanceof TextView) {
                view.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                invalidateAll(viewGroup.getChildAt(i10));
            }
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$loadEmoji$1(byte b10, short s10) {
        Locale locale = Locale.US;
        Bitmap loadBitmap = loadBitmap("emoji/".concat(((int) b10) + "_" + ((int) s10) + ".png"));
        try {
            if (emojiAlphaMasks == null) {
                emojiAlphaMasks = loadEmojiAlphaMasks();
            }
            SparseIntArray sparseIntArray = emojiAlphaMasks;
            int i10 = sparseIntArray != null ? sparseIntArray.get((b10 * 4096) + s10, -1) : -1;
            if (loadBitmap != null && i10 != -1) {
                Bitmap loadBitmap2 = loadBitmap("emoji/masks/".concat(i10 + ".png"));
                if (loadBitmap2 != null) {
                    int width = loadBitmap.getWidth();
                    int height = loadBitmap.getHeight();
                    int i11 = width * height;
                    int[] iArr = new int[i11];
                    int[] iArr2 = new int[i11];
                    loadBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                    loadBitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
                    loadBitmap2.recycle();
                    for (int i12 = 0; i12 < i11; i12++) {
                        iArr[i12] = (iArr[i12] & 16777215) | ((iArr2[i12] & 255) << 24);
                    }
                    loadBitmap.recycle();
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    try {
                        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                        loadBitmap = createBitmap;
                    } catch (Exception e9) {
                        e = e9;
                        loadBitmap = createBitmap;
                        FileLog.e(e);
                        if (loadBitmap != null) {
                        }
                        loadingEmoji[b10][s10] = false;
                    }
                }
            }
        } catch (Exception e10) {
            e = e10;
        }
        if (loadBitmap != null) {
            emojiBmp[b10][s10] = loadBitmap;
            Runnable runnable = invalidateUiRunnable;
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable);
        }
        loadingEmoji[b10][s10] = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortEmoji$3(String str, String str2) {
        HashMap<String, Integer> hashMap = emojiUseHistory;
        Integer num = hashMap.get(str);
        Integer num2 = hashMap.get(str2);
        if (num == null) {
            num = r1;
        }
        r1 = num2 != null ? num2 : 0;
        if (num.intValue() > r1.intValue()) {
            return -1;
        }
        return num.intValue() < r1.intValue() ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiLoaded, new Object[0]);
    }

    public static Bitmap loadBitmap(String str) {
        Bitmap bitmap;
        try {
            int i10 = AndroidUtilities.density <= 1.0f ? 2 : 1;
            try {
                InputStream open = ApplicationLoader.applicationContext.getAssets().open(str);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                options.inSampleSize = i10;
                bitmap = BitmapFactory.decodeStream(open, null, options);
                try {
                    open.close();
                    return bitmap;
                } catch (Throwable th) {
                    th = th;
                    FileLog.e(th);
                    return bitmap;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmap = null;
            }
        } catch (Throwable th3) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Error loading emoji", th3);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void loadEmoji(final byte b10, final short s10) {
        if (emojiBmp[b10][s10] == null) {
            boolean[] zArr = loadingEmoji[b10];
            if (zArr[s10]) {
                return;
            }
            zArr[s10] = true;
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.e2
                @Override // java.lang.Runnable
                public final void run() {
                    Emoji.lambda$loadEmoji$1(b10, s10);
                }
            });
        }
    }

    private static SparseIntArray loadEmojiAlphaMasks() {
        try {
            InputStream open = ApplicationLoader.applicationContext.getAssets().open("emoji/metadata.bin");
            try {
                ArrayList arrayList = new ArrayList();
                byte[] bArr = new byte[8192];
                int i10 = 0;
                while (true) {
                    int read = open.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byte[] bArr2 = new byte[read];
                    System.arraycopy(bArr, 0, bArr2, 0, read);
                    arrayList.add(bArr2);
                    i10 += read;
                }
                byte[] bArr3 = new byte[i10];
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    byte[] bArr4 = (byte[]) obj;
                    System.arraycopy(bArr4, 0, bArr3, i11, bArr4.length);
                    i11 += bArr4.length;
                }
                ByteBuffer order = ByteBuffer.wrap(bArr3).order(ByteOrder.LITTLE_ENDIAN);
                int i13 = i10 / 4;
                SparseIntArray sparseIntArray = new SparseIntArray(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    sparseIntArray.put(order.getShort() & 65535, 65535 & order.getShort());
                }
                open.close();
                return sparseIntArray;
            } finally {
            }
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static void loadRecentEmoji() {
        String string;
        if (recentEmojiLoaded) {
            return;
        }
        recentEmojiLoaded = true;
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        try {
            emojiUseHistory.clear();
            if (globalEmojiSettings.contains("emojis")) {
                try {
                    String string2 = globalEmojiSettings.getString("emojis", "");
                    if (string2 != null && string2.length() > 0) {
                        for (String str : string2.split(",")) {
                            String[] split = str.split("=");
                            long longValue = Utilities.parseLong(split[0]).longValue();
                            StringBuilder sb2 = new StringBuilder();
                            for (int i10 = 0; i10 < 4; i10++) {
                                sb2.insert(0, (char) longValue);
                                longValue >>= 16;
                                if (longValue == 0) {
                                    break;
                                }
                            }
                            if (sb2.length() > 0) {
                                emojiUseHistory.put(sb2.toString(), Utilities.parseInt((CharSequence) split[1]));
                            }
                        }
                    }
                    globalEmojiSettings.edit().remove("emojis").commit();
                    saveRecentEmoji();
                } catch (Exception e9) {
                    e = e9;
                    FileLog.e(e);
                    string = globalEmojiSettings.getString("color", "");
                    if (string != null) {
                        return;
                    } else {
                        return;
                    }
                }
            } else {
                String string3 = globalEmojiSettings.getString("emojis2", "");
                if (string3 != null && string3.length() > 0) {
                    for (String str2 : string3.split(",")) {
                        String[] split2 = str2.split("=");
                        emojiUseHistory.put(split2[0], Utilities.parseInt((CharSequence) split2[1]));
                    }
                }
            }
            if (emojiUseHistory.isEmpty() && !globalEmojiSettings.getBoolean("filled_default", false)) {
                int i11 = 0;
                while (true) {
                    String[] strArr = DEFAULT_RECENT;
                    if (i11 >= strArr.length) {
                        break;
                    }
                    emojiUseHistory.put(strArr[i11], Integer.valueOf(strArr.length - i11));
                    i11++;
                }
                globalEmojiSettings.edit().putBoolean("filled_default", true).commit();
                saveRecentEmoji();
            }
            sortEmoji();
        } catch (Exception e10) {
            e = e10;
        }
        try {
            string = globalEmojiSettings.getString("color", "");
            if (string != null || string.length() <= 0) {
                return;
            }
            for (String str3 : string.split(",")) {
                String[] split3 = str3.split("=");
                emojiColor.put(split3[0], split3[1]);
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    public static ArrayList<EmojiSpanRange> parseEmojis(CharSequence charSequence) {
        return parseEmojis(charSequence, null);
    }

    public static void preloadEmoji(CharSequence charSequence) {
        DrawableInfo drawableInfo = getDrawableInfo(charSequence);
        if (drawableInfo != null) {
            loadEmoji(drawableInfo.page, drawableInfo.page2);
        }
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

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, (int[]) null);
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, TextView textView, Runnable runnable) {
        return replaceWithRestrictedEmoji(charSequence, textView.getPaint().getFontMetricsInt(), runnable);
    }

    public static void saveEmojiColors() {
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : emojiColor.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append(entry.getKey());
            sb2.append("=");
            sb2.append(entry.getValue());
        }
        globalEmojiSettings.edit().putString("color", sb2.toString()).commit();
    }

    public static void saveRecentEmoji() {
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, Integer> entry : emojiUseHistory.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append(entry.getKey());
            sb2.append("=");
            sb2.append(entry.getValue());
        }
        globalEmojiSettings.edit().putString("emojis2", sb2.toString()).commit();
    }

    public static void sortEmoji() {
        recentEmoji.clear();
        Iterator<Map.Entry<String, Integer>> it = emojiUseHistory.entrySet().iterator();
        while (it.hasNext()) {
            recentEmoji.add(it.next().getKey());
        }
        Collections.sort(recentEmoji, new q(4));
        while (true) {
            ArrayList<String> arrayList = recentEmoji;
            if (arrayList.size() <= 48) {
                return;
            } else {
                a9.p.s(1, arrayList);
            }
        }
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

        public EmojiSpan(Drawable drawable, int i10, Paint.FontMetricsInt fontMetricsInt) {
            super(drawable, i10);
            this.scale = 1.0f;
            this.size = AndroidUtilities.dp(20.0f);
            this.fontMetrics = fontMetricsInt;
            if (fontMetricsInt != null) {
                int abs = Math.abs(this.fontMetrics.ascent) + Math.abs(fontMetricsInt.descent);
                this.size = abs;
                if (abs == 0) {
                    this.size = AndroidUtilities.dp(20.0f);
                }
            }
        }

        private static void expandFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10) {
            int i11 = fontMetricsInt.descent;
            int i12 = fontMetricsInt.ascent;
            int i13 = i11 - i12;
            if (i10 <= i13) {
                return;
            }
            int i14 = i10 - i13;
            int i15 = (i14 + 1) / 2;
            int i16 = i12 - i15;
            fontMetricsInt.ascent = i16;
            fontMetricsInt.descent = i11 + (i14 - i15);
            fontMetricsInt.top = Math.min(fontMetricsInt.top, i16);
            fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
            boolean z10;
            this.lastDrawX = a9.p.d(this.scale, this.size, 2.0f, f10);
            this.lastDrawY = ((i14 - i12) / 2.0f) + i12;
            boolean z11 = true;
            this.drawn = true;
            if (paint.getAlpha() == 255 || !Emoji.emojiDrawingUseAlpha) {
                z10 = false;
            } else {
                getDrawable().setAlpha(paint.getAlpha());
                z10 = true;
            }
            float f11 = Emoji.emojiDrawingYOffset;
            int i15 = this.size;
            float f12 = f11 - ((i15 - (this.scale * i15)) / 2.0f);
            if (f12 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, f12);
            } else {
                z11 = false;
            }
            super.draw(canvas, charSequence, i10, i11, f10, i12, i13, i14, paint);
            if (z11) {
                canvas.restore();
            }
            if (z10) {
                getDrawable().setAlpha(255);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                EmojiSpan emojiSpan = (EmojiSpan) obj;
                if (Float.compare(this.scale, emojiSpan.scale) == 0 && this.size == emojiSpan.size && Objects.equals(this.emoji, emojiSpan.emoji)) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
            Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
            boolean z10 = this.preserveFontMetrics && fontMetricsInt2 != null;
            int i12 = z10 ? fontMetricsInt2.top : 0;
            int i13 = z10 ? fontMetricsInt2.ascent : 0;
            int i14 = z10 ? fontMetricsInt2.descent : 0;
            int i15 = z10 ? fontMetricsInt2.bottom : 0;
            int i16 = z10 ? fontMetricsInt2.leading : 0;
            if (fontMetricsInt2 == null) {
                fontMetricsInt2 = new Paint.FontMetricsInt();
            }
            Paint.FontMetricsInt fontMetricsInt3 = fontMetricsInt2;
            int i17 = (int) (this.scale * this.size);
            Paint.FontMetricsInt fontMetricsInt4 = this.fontMetrics;
            if (fontMetricsInt4 != null) {
                fontMetricsInt3.ascent = fontMetricsInt4.ascent;
                fontMetricsInt3.descent = fontMetricsInt4.descent;
                fontMetricsInt3.top = fontMetricsInt4.top;
                fontMetricsInt3.bottom = fontMetricsInt4.bottom;
                if (getDrawable() != null) {
                    getDrawable().setBounds(0, 0, i17, i17);
                }
                if (z10) {
                    fontMetricsInt3.top = i12;
                    fontMetricsInt3.ascent = i13;
                    fontMetricsInt3.descent = i14;
                    fontMetricsInt3.bottom = i15;
                    fontMetricsInt3.leading = i16;
                    expandFontMetrics(fontMetricsInt3, this.minimumLineHeight);
                }
                return i17;
            }
            int size = super.getSize(paint, charSequence, i10, i11, fontMetricsInt3);
            int dp = AndroidUtilities.dp(8.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            int i18 = (-dp2) - dp;
            fontMetricsInt3.top = i18;
            int i19 = dp2 - dp;
            fontMetricsInt3.bottom = i19;
            fontMetricsInt3.ascent = i18;
            fontMetricsInt3.leading = 0;
            fontMetricsInt3.descent = i19;
            if (z10) {
                fontMetricsInt3.top = i12;
                fontMetricsInt3.ascent = i13;
                fontMetricsInt3.descent = i14;
                fontMetricsInt3.bottom = i15;
                fontMetricsInt3.leading = i16;
                expandFontMetrics(fontMetricsInt3, this.minimumLineHeight);
            }
            return size;
        }

        public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10) {
            this.fontMetrics = fontMetricsInt;
            this.size = i10;
        }

        public EmojiSpan setMinimumLineHeight(int i10) {
            this.minimumLineHeight = i10;
            return this;
        }

        public EmojiSpan setPreserveFontMetrics(boolean z10) {
            this.preserveFontMetrics = z10;
            return this;
        }

        @Override // android.text.style.ReplacementSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            if (getDrawable() instanceof EmojiDrawable) {
                ((EmojiDrawable) getDrawable()).placeholderColor = 285212671 & textPaint.getColor();
            }
            super.updateDrawState(textPaint);
        }

        public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
            this.fontMetrics = fontMetricsInt;
            if (fontMetricsInt != null) {
                int abs = Math.abs(this.fontMetrics.ascent) + Math.abs(fontMetricsInt.descent);
                this.size = abs;
                if (abs == 0) {
                    this.size = AndroidUtilities.dp(20.0f);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0283 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00fe A[Catch: Exception -> 0x0078, TryCatch #0 {Exception -> 0x0078, blocks: (B:9:0x002e, B:15:0x006c, B:18:0x011d, B:20:0x0121, B:22:0x012e, B:26:0x013c, B:30:0x01a6, B:32:0x01aa, B:36:0x01b7, B:38:0x01bd, B:40:0x021a, B:57:0x01ec, B:59:0x01f0, B:70:0x0205, B:72:0x0209, B:85:0x0225, B:87:0x022d, B:89:0x0231, B:91:0x023c, B:95:0x024a, B:98:0x025a, B:100:0x0266, B:102:0x0269, B:103:0x027a, B:109:0x0149, B:111:0x0150, B:113:0x015c, B:117:0x016b, B:119:0x0171, B:120:0x0178, B:122:0x0180, B:123:0x0187, B:125:0x0191, B:130:0x019a, B:137:0x0042, B:139:0x004d, B:145:0x007b, B:153:0x0098, B:156:0x008f, B:161:0x00aa, B:165:0x00be, B:181:0x00fe, B:191:0x00e0, B:196:0x00f6), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011d A[Catch: Exception -> 0x0078, TryCatch #0 {Exception -> 0x0078, blocks: (B:9:0x002e, B:15:0x006c, B:18:0x011d, B:20:0x0121, B:22:0x012e, B:26:0x013c, B:30:0x01a6, B:32:0x01aa, B:36:0x01b7, B:38:0x01bd, B:40:0x021a, B:57:0x01ec, B:59:0x01f0, B:70:0x0205, B:72:0x0209, B:85:0x0225, B:87:0x022d, B:89:0x0231, B:91:0x023c, B:95:0x024a, B:98:0x025a, B:100:0x0266, B:102:0x0269, B:103:0x027a, B:109:0x0149, B:111:0x0150, B:113:0x015c, B:117:0x016b, B:119:0x0171, B:120:0x0178, B:122:0x0180, B:123:0x0187, B:125:0x0191, B:130:0x019a, B:137:0x0042, B:139:0x004d, B:145:0x007b, B:153:0x0098, B:156:0x008f, B:161:0x00aa, B:165:0x00be, B:181:0x00fe, B:191:0x00e0, B:196:0x00f6), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a6 A[Catch: Exception -> 0x0078, TryCatch #0 {Exception -> 0x0078, blocks: (B:9:0x002e, B:15:0x006c, B:18:0x011d, B:20:0x0121, B:22:0x012e, B:26:0x013c, B:30:0x01a6, B:32:0x01aa, B:36:0x01b7, B:38:0x01bd, B:40:0x021a, B:57:0x01ec, B:59:0x01f0, B:70:0x0205, B:72:0x0209, B:85:0x0225, B:87:0x022d, B:89:0x0231, B:91:0x023c, B:95:0x024a, B:98:0x025a, B:100:0x0266, B:102:0x0269, B:103:0x027a, B:109:0x0149, B:111:0x0150, B:113:0x015c, B:117:0x016b, B:119:0x0171, B:120:0x0178, B:122:0x0180, B:123:0x0187, B:125:0x0191, B:130:0x019a, B:137:0x0042, B:139:0x004d, B:145:0x007b, B:153:0x0098, B:156:0x008f, B:161:0x00aa, B:165:0x00be, B:181:0x00fe, B:191:0x00e0, B:196:0x00f6), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0223 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022d A[Catch: Exception -> 0x0078, TryCatch #0 {Exception -> 0x0078, blocks: (B:9:0x002e, B:15:0x006c, B:18:0x011d, B:20:0x0121, B:22:0x012e, B:26:0x013c, B:30:0x01a6, B:32:0x01aa, B:36:0x01b7, B:38:0x01bd, B:40:0x021a, B:57:0x01ec, B:59:0x01f0, B:70:0x0205, B:72:0x0209, B:85:0x0225, B:87:0x022d, B:89:0x0231, B:91:0x023c, B:95:0x024a, B:98:0x025a, B:100:0x0266, B:102:0x0269, B:103:0x027a, B:109:0x0149, B:111:0x0150, B:113:0x015c, B:117:0x016b, B:119:0x0171, B:120:0x0178, B:122:0x0180, B:123:0x0187, B:125:0x0191, B:130:0x019a, B:137:0x0042, B:139:0x004d, B:145:0x007b, B:153:0x0098, B:156:0x008f, B:161:0x00aa, B:165:0x00be, B:181:0x00fe, B:191:0x00e0, B:196:0x00f6), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList<EmojiSpanRange> parseEmojis(CharSequence charSequence, int[] iArr) {
        boolean z10;
        char charAt;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char charAt2;
        int i16;
        int i17;
        ArrayList<EmojiSpanRange> arrayList = new ArrayList<>();
        if (charSequence != null && charSequence.length() > 0) {
            StringBuilder sb2 = new StringBuilder(16);
            int length = charSequence.length();
            int i18 = -1;
            int[] iArr2 = iArr;
            int i19 = 0;
            int i20 = 0;
            long j10 = 0;
            int i21 = -1;
            int i22 = 0;
            boolean z12 = false;
            boolean z13 = false;
            while (i20 < length) {
                try {
                    char charAt3 = charSequence.charAt(i20);
                    if ((charAt3 < 55356 || charAt3 > 55358) && (j10 == 0 || (j10 & (-4294967296L)) != 0 || (j10 & 65535) != 55356 || charAt3 < 56806 || charAt3 > 56831)) {
                        if ((sb2.length() > 0 && (charAt3 == 9792 || charAt3 == 9794 || charAt3 == 9877)) || (j10 > 0 && (61440 & charAt3) == 53248)) {
                            sb2.append(charAt3);
                            i22++;
                            j10 = 0;
                        } else if (charAt3 != 8419) {
                            if (charAt3 != 169) {
                                if (charAt3 != 174) {
                                    if (charAt3 >= 8252 && charAt3 <= 12953) {
                                    }
                                    if (i21 == -1) {
                                        sb2.setLength(0);
                                        z10 = false;
                                        i21 = -1;
                                        i22 = 0;
                                        z12 = false;
                                        z13 = false;
                                    } else if (charAt3 != 65039 && charAt3 != '\n' && charAt3 != ' ' && charAt3 != '\t') {
                                        z10 = true;
                                    }
                                    if (z13 || (i17 = i20 + 2) >= length) {
                                        z11 = z10;
                                    } else {
                                        int i23 = i20 + 1;
                                        char charAt4 = charSequence.charAt(i23);
                                        z11 = z10;
                                        if (charAt4 == 55356) {
                                            char charAt5 = charSequence.charAt(i17);
                                            if (charAt5 >= 57339 && charAt5 <= 57343) {
                                                sb2.append(charSequence.subSequence(i23, i20 + 3));
                                                i22 += 2;
                                                i10 = i17;
                                                i11 = i10;
                                                i12 = 0;
                                                while (i12 < 3) {
                                                    int i24 = i11 + 1;
                                                    if (i24 < length) {
                                                        char charAt6 = charSequence.charAt(i24);
                                                        i16 = i10;
                                                        if (i12 == 1) {
                                                            if (charAt6 == 8205 && sb2.length() > 0) {
                                                                sb2.append(charAt6);
                                                                i22++;
                                                                i11 = i24;
                                                                z13 = false;
                                                                z11 = false;
                                                            }
                                                        } else if (charAt3 == '*' || charAt3 == '#' || (charAt3 >= '0' && charAt3 <= '9')) {
                                                            if (charAt6 >= 65024) {
                                                                if (charAt6 <= 65039) {
                                                                    i22++;
                                                                    if (!z13) {
                                                                        z13 = i11 + 2 >= length;
                                                                    }
                                                                    i11 = i24;
                                                                    i21 = i16;
                                                                    z12 = true;
                                                                }
                                                            }
                                                        } else if (i21 != -1 && charAt6 >= 65024) {
                                                            if (charAt6 <= 65039) {
                                                                i22++;
                                                                if (!z13) {
                                                                    z13 = i11 + 2 >= length;
                                                                }
                                                                i11 = i24;
                                                            }
                                                        }
                                                        i12++;
                                                        i10 = i16;
                                                    } else {
                                                        i16 = i10;
                                                    }
                                                    i12++;
                                                    i10 = i16;
                                                }
                                                int i25 = i10;
                                                if (z11 && iArr2 != null) {
                                                    iArr2[0] = 0;
                                                    iArr2 = null;
                                                }
                                                if (z13 && (i14 = i11 + 2) < length) {
                                                    i15 = i11 + 1;
                                                    if (charSequence.charAt(i15) == 55356 && (charAt2 = charSequence.charAt(i14)) >= 57339 && charAt2 <= 57343) {
                                                        sb2.append(charSequence.subSequence(i15, i11 + 3));
                                                        i22 += 2;
                                                        i11 = i14;
                                                    }
                                                }
                                                if (z13) {
                                                    if (iArr2 != null) {
                                                        iArr2[0] = iArr2[0] + 1;
                                                    }
                                                    if (i21 >= 0 && (i13 = i22 + i21) <= length) {
                                                        arrayList.add(new EmojiSpanRange(i21, i13, sb2.subSequence(0, sb2.length())));
                                                    }
                                                    sb2.setLength(0);
                                                    i21 = -1;
                                                    i22 = 0;
                                                    z12 = false;
                                                    z13 = false;
                                                }
                                                i20 = i11 + 1;
                                                i19 = i25;
                                                i18 = -1;
                                            }
                                        } else if (sb2.length() >= 2 && sb2.charAt(0) == 55356 && sb2.charAt(1) == 57332 && charAt4 == 56128) {
                                            while (true) {
                                                if (i23 < charSequence.length()) {
                                                    sb2.append(charSequence.charAt(i23));
                                                }
                                                int i26 = i23 + 1;
                                                if (i26 < charSequence.length()) {
                                                    sb2.append(charSequence.charAt(i26));
                                                }
                                                i22 += 2;
                                                int i27 = i23 + 2;
                                                if (i27 >= charSequence.length() || charSequence.charAt(i27) != 56128) {
                                                    break;
                                                }
                                                i23 = i27;
                                            }
                                            i20 = i23 + 1;
                                        }
                                    }
                                    i10 = i20;
                                    i11 = i10;
                                    i12 = 0;
                                    while (i12 < 3) {
                                    }
                                    int i252 = i10;
                                    if (z11) {
                                        iArr2[0] = 0;
                                        iArr2 = null;
                                    }
                                    if (z13) {
                                        i15 = i11 + 1;
                                        if (charSequence.charAt(i15) == 55356) {
                                            sb2.append(charSequence.subSequence(i15, i11 + 3));
                                            i22 += 2;
                                            i11 = i14;
                                        }
                                    }
                                    if (z13) {
                                    }
                                    i20 = i11 + 1;
                                    i19 = i252;
                                    i18 = -1;
                                }
                            }
                            if (EmojiData.dataCharsMap.containsKey(Character.valueOf(charAt3))) {
                                if (i21 == -1) {
                                    i21 = i20;
                                } else if (z12) {
                                    i21 = i20;
                                    i22 = 0;
                                    z12 = false;
                                }
                                i22++;
                                sb2.append(charAt3);
                            }
                            if (i21 == -1) {
                            }
                            if (z13) {
                            }
                            z11 = z10;
                            i10 = i20;
                            i11 = i10;
                            i12 = 0;
                            while (i12 < 3) {
                            }
                            int i2522 = i10;
                            if (z11) {
                            }
                            if (z13) {
                            }
                            if (z13) {
                            }
                            i20 = i11 + 1;
                            i19 = i2522;
                            i18 = -1;
                        } else if (i20 > 0 && (((charAt = charSequence.charAt(i19)) >= '0' && charAt <= '9') || charAt == '#' || charAt == '*')) {
                            i22 = (i20 - i19) + 1;
                            sb2.append(charAt);
                            sb2.append(charAt3);
                            i21 = i19;
                            z12 = false;
                            z13 = true;
                        }
                        z10 = false;
                        z13 = true;
                        if (z13) {
                        }
                        z11 = z10;
                        i10 = i20;
                        i11 = i10;
                        i12 = 0;
                        while (i12 < 3) {
                        }
                        int i25222 = i10;
                        if (z11) {
                        }
                        if (z13) {
                        }
                        if (z13) {
                        }
                        i20 = i11 + 1;
                        i19 = i25222;
                        i18 = -1;
                    } else {
                        if (i21 == i18) {
                            i21 = i20;
                        } else if (z12) {
                            i21 = i20;
                            i22 = 0;
                            z12 = false;
                        }
                        sb2.append(charAt3);
                        i22++;
                        j10 = (j10 << 16) | charAt3;
                    }
                    z10 = false;
                    if (z13) {
                    }
                    z11 = z10;
                    i10 = i20;
                    i11 = i10;
                    i12 = 0;
                    while (i12 < 3) {
                    }
                    int i252222 = i10;
                    if (z11) {
                    }
                    if (z13) {
                    }
                    if (z13) {
                    }
                    i20 = i11 + 1;
                    i19 = i252222;
                    i18 = -1;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            if (iArr2 != null && sb2.length() != 0) {
                iArr2[0] = 0;
            }
        }
        return arrayList;
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, float f10) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, null, 0, f10, 0);
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, Runnable runnable) {
        return replaceWithRestrictedEmoji(charSequence, fontMetricsInt, 20, runnable);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, iArr, 0);
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, int i10, Runnable runnable) {
        Spannable newSpannable;
        int i11;
        EmojiSpanRange emojiSpanRange;
        TLRPC.Document document;
        org.telegram.ui.Components.t5 t5Var;
        int i12;
        if (SharedConfig.useSystemEmoji || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i13 = UserConfig.selectedAccount;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i13).getStickerSet(tL_inputStickerSetShortName, 0, false, true, runnable == null ? null : new z0(runnable, 1));
        if (charSequence instanceof Spannable) {
            newSpannable = (Spannable) charSequence;
        } else {
            newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence.toString());
        }
        ArrayList<EmojiSpanRange> parseEmojis = parseEmojis(newSpannable, null);
        if (parseEmojis.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.t5.class);
        int i14 = SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50;
        for (int i15 = 0; i15 < parseEmojis.size(); i15++) {
            try {
                emojiSpanRange = parseEmojis.get(i15);
                if (t5VarArr != null) {
                    while (i12 < t5VarArr.length) {
                        org.telegram.ui.Components.t5 t5Var2 = t5VarArr[i12];
                        i12 = (t5Var2 != null && newSpannable.getSpanStart(t5Var2) == emojiSpanRange.start && newSpannable.getSpanEnd(t5Var2) == emojiSpanRange.end) ? 0 : i12 + 1;
                    }
                }
                if (stickerSet != null) {
                    ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TLRPC.Document document2 = arrayList.get(i16);
                        i16++;
                        document = document2;
                        if (MessageObject.findAnimatedEmojiEmoticon(document, null).contains(emojiSpanRange.code)) {
                            break;
                        }
                    }
                }
                document = null;
                if (document != null) {
                    t5Var = new org.telegram.ui.Components.t5(document, fontMetricsInt);
                } else {
                    t5Var = new org.telegram.ui.Components.t5(0L, fontMetricsInt);
                }
                t5Var.emoji = emojiSpanRange.code.toString();
            } catch (Exception e9) {
                e = e9;
            }
            try {
                t5Var.cacheType = i10;
                newSpannable.setSpan(t5Var, emojiSpanRange.start, emojiSpanRange.end, 33);
            } catch (Exception e10) {
                e = e10;
                FileLog.e(e);
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 23) {
                }
                break;
                return newSpannable;
            }
            i11 = Build.VERSION.SDK_INT;
            if ((i11 >= 23 || i11 >= 29) && i15 + 1 >= i14) {
                break;
            }
        }
        return newSpannable;
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i10) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, iArr, i10, 1.0f, 0);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i10, float f10, int i11) {
        Spannable newSpannable;
        int i12;
        int i13;
        if (SharedConfig.useSystemEmoji || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        if (!z10 && (charSequence instanceof Spannable)) {
            newSpannable = (Spannable) charSequence;
        } else {
            newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence);
        }
        ArrayList<EmojiSpanRange> parseEmojis = parseEmojis(newSpannable, iArr);
        if (parseEmojis.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.t5.class);
        cq[] cqVarArr = (cq[]) newSpannable.getSpans(0, newSpannable.length(), cq.class);
        int i14 = (SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50) - i11;
        for (int i15 = 0; i15 < parseEmojis.size(); i15++) {
            try {
                EmojiSpanRange emojiSpanRange = parseEmojis.get(i15);
                if (t5VarArr != null && t5VarArr.length > 0) {
                    while (i13 < t5VarArr.length) {
                        org.telegram.ui.Components.t5 t5Var = t5VarArr[i13];
                        i13 = (t5Var != null && newSpannable.getSpanStart(t5Var) == emojiSpanRange.start && newSpannable.getSpanEnd(t5Var) == emojiSpanRange.end) ? 0 : i13 + 1;
                    }
                }
                if (cqVarArr != null && cqVarArr.length > 0) {
                    while (i12 < cqVarArr.length) {
                        cq cqVar = cqVarArr[i12];
                        i12 = (cqVar != null && newSpannable.getSpanStart(cqVar) == emojiSpanRange.start && newSpannable.getSpanEnd(cqVar) == emojiSpanRange.end) ? 0 : i12 + 1;
                    }
                }
                EmojiDrawable emojiDrawable = getEmojiDrawable(emojiSpanRange.code);
                if (emojiDrawable != null) {
                    EmojiSpan emojiSpan = new EmojiSpan(emojiDrawable, i10, fontMetricsInt);
                    CharSequence charSequence2 = emojiSpanRange.code;
                    emojiSpan.emoji = charSequence2 == null ? null : charSequence2.toString();
                    emojiSpan.scale = f10;
                    newSpannable.setSpan(emojiSpan, emojiSpanRange.start, emojiSpanRange.end, 33);
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            int i16 = Build.VERSION.SDK_INT;
            if ((i16 < 23 || i16 >= 29) && i15 + 1 >= i14) {
                break;
            }
        }
        return newSpannable;
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static abstract class EmojiDrawable extends Drawable {
        public boolean fullSize = false;
        int placeholderColor = TLObject.FLAG_28;

        public boolean isLoaded() {
            return false;
        }

        public void preload() {
        }
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static class SimpleEmojiDrawable extends EmojiDrawable {
        private static Paint paint = new Paint(2);
        private static Rect rect = new Rect();
        private DrawableInfo info;
        private boolean invert;

        public SimpleEmojiDrawable(DrawableInfo drawableInfo, boolean z10) {
            this.info = drawableInfo;
            this.invert = z10;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (!isLoaded()) {
                DrawableInfo drawableInfo = this.info;
                Emoji.loadEmoji(drawableInfo.page, drawableInfo.page2);
                Emoji.placeholderPaint.setColor(this.placeholderColor);
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), bounds.width() * 0.4f, Emoji.placeholderPaint);
                return;
            }
            Rect drawRect = this.fullSize ? getDrawRect() : getBounds();
            if (canvas.quickReject(drawRect.left, drawRect.top, drawRect.right, drawRect.bottom, Canvas.EdgeType.AA)) {
                return;
            }
            if (this.invert) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, drawRect.centerX(), drawRect.centerY());
            }
            Bitmap[][] bitmapArr = Emoji.emojiBmp;
            DrawableInfo drawableInfo2 = this.info;
            canvas.drawBitmap(bitmapArr[drawableInfo2.page][drawableInfo2.page2], (Rect) null, drawRect, paint);
            if (this.invert) {
                canvas.restore();
            }
        }

        public Rect getDrawRect() {
            Rect bounds = getBounds();
            int centerX = bounds.centerX();
            int centerY = bounds.centerY();
            Rect rect2 = rect;
            boolean z10 = this.fullSize;
            rect2.left = centerX - ((z10 ? Emoji.bigImgSize : Emoji.drawImgSize) / 2);
            rect.right = ((z10 ? Emoji.bigImgSize : Emoji.drawImgSize) / 2) + centerX;
            rect.top = centerY - ((z10 ? Emoji.bigImgSize : Emoji.drawImgSize) / 2);
            rect.bottom = ((z10 ? Emoji.bigImgSize : Emoji.drawImgSize) / 2) + centerY;
            return rect;
        }

        public DrawableInfo getDrawableInfo() {
            return this.info;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
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

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            paint.setAlpha(i10);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
