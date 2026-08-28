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
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class Emoji {
    private static final String[] DEFAULT_RECENT;
    private static final int MAX_RECENT_EMOJI_COUNT = 48;
    public static int bigImgSize;
    public static int drawImgSize;
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

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class DrawableInfo {
        public int emojiIndex;
        public byte page;
        public short page2;

        public DrawableInfo(byte b10, short s10, int i9) {
            this.page = b10;
            this.page2 = s10;
            this.emojiIndex = i9;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class EmojiSpanRange {
        public CharSequence code;
        public int end;
        public int start;

        public EmojiSpanRange(int i9, int i10, CharSequence charSequence) {
            this.start = i9;
            this.end = i10;
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
        int i9 = 0;
        while (true) {
            Bitmap[][] bitmapArr = emojiBmp;
            if (i9 >= bitmapArr.length) {
                break;
            }
            int i10 = emojiCounts[i9];
            bitmapArr[i9] = new Bitmap[i10];
            loadingEmoji[i9] = new boolean[i10];
            i9++;
        }
        for (int i11 = 0; i11 < EmojiData.data.length; i11++) {
            int i12 = 0;
            while (true) {
                String[] strArr2 = EmojiData.data[i11];
                if (i12 < strArr2.length) {
                    rects.put(strArr2[i12], new DrawableInfo((byte) i11, (short) i12, i12));
                    i12++;
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
            hashMap.remove((String) j3.r0.j(1, arrayList));
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
        int i9 = 0;
        while (i9 < length) {
            char charAt = str.charAt(i9);
            if (charAt < 55356 || charAt > 55358) {
                if (charAt == 8419) {
                    return str;
                }
                if (charAt >= 8252 && charAt <= 12953 && EmojiData.emojiToFE0FMap.containsKey(Character.valueOf(charAt))) {
                    StringBuilder sb2 = new StringBuilder();
                    i9++;
                    sb2.append(str.substring(0, i9));
                    sb2.append("️");
                    sb2.append(str.substring(i9));
                    str = sb2.toString();
                    length++;
                }
            } else if (charAt != 55356 || i9 >= length - 1) {
                i9++;
            } else {
                int i10 = i9 + 1;
                char charAt2 = str.charAt(i10);
                if (charAt2 == 56879 || charAt2 == 56324 || charAt2 == 56858 || charAt2 == 56703) {
                    StringBuilder sb3 = new StringBuilder();
                    i9 += 2;
                    sb3.append(str.substring(0, i9));
                    sb3.append("️");
                    sb3.append(str.substring(i9));
                    str = sb3.toString();
                    length++;
                } else {
                    i9 = i10;
                }
            }
            i9++;
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
            int i9 = drawImgSize;
            compoundEmojiDrawable.setBounds(0, 0, i9, i9);
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
        int i10 = bigImgSize;
        compoundEmojiDrawable.setBounds(0, 0, i10, i10);
        compoundEmojiDrawable.fullSize = true;
        return compoundEmojiDrawable;
    }

    public static EmojiDrawable getEmojiDrawable(CharSequence charSequence) {
        CompoundEmoji.CompoundEmojiDrawable compoundEmojiDrawable;
        DrawableInfo drawableInfo = getDrawableInfo(charSequence);
        if (drawableInfo != null) {
            SimpleEmojiDrawable simpleEmojiDrawable = new SimpleEmojiDrawable(drawableInfo, endsWithRightArrow(charSequence));
            int i9 = drawImgSize;
            simpleEmojiDrawable.setBounds(0, 0, i9, i9);
            return simpleEmojiDrawable;
        }
        if (charSequence == null || (compoundEmojiDrawable = CompoundEmoji.getCompoundEmojiDrawable(charSequence.toString())) == null) {
            return null;
        }
        int i10 = drawImgSize;
        compoundEmojiDrawable.setBounds(0, 0, i10, i10);
        return compoundEmojiDrawable;
    }

    public static void invalidateAll(View view) {
        if (!(view instanceof ViewGroup)) {
            if (view instanceof TextView) {
                view.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                invalidateAll(viewGroup.getChildAt(i9));
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
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$loadEmoji$1(byte b10, short s10) {
        Bitmap bitmap;
        Bitmap mask;
        Bitmap bitmap2 = null;
        try {
            EmojiPack emojiPack = EmojiPack.getInstance();
            bitmap = emojiPack.getEmoji(b10, s10);
            try {
                int maskId = emojiPack.getMaskId(b10, s10);
                if (bitmap != null && maskId != -1 && (mask = emojiPack.getMask(maskId)) != null) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int i9 = width * height;
                    int[] iArr = new int[i9];
                    int[] iArr2 = new int[i9];
                    bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                    mask.getPixels(iArr2, 0, width, 0, 0, width, height);
                    mask.recycle();
                    for (int i10 = 0; i10 < i9; i10++) {
                        iArr[i10] = (iArr[i10] & 16777215) | ((iArr2[i10] & 255) << 24);
                    }
                    bitmap.recycle();
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    try {
                        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                        bitmap = createBitmap;
                    } catch (Exception e10) {
                        e = e10;
                        bitmap2 = createBitmap;
                        FileLog.e(e);
                        bitmap = bitmap2;
                        if (bitmap != null) {
                        }
                        loadingEmoji[b10][s10] = false;
                    }
                }
            } catch (Exception e11) {
                e = e11;
                bitmap2 = bitmap;
            }
        } catch (Exception e12) {
            e = e12;
        }
        if (bitmap != null) {
            emojiBmp[b10][s10] = bitmap;
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
            int i9 = AndroidUtilities.density <= 1.0f ? 2 : 1;
            try {
                InputStream open = ApplicationLoader.applicationContext.getAssets().open(str);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                options.inSampleSize = i9;
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
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.d2
                @Override // java.lang.Runnable
                public final void run() {
                    Emoji.lambda$loadEmoji$1(b10, s10);
                }
            });
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
                            for (int i9 = 0; i9 < 4; i9++) {
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
                } catch (Exception e10) {
                    e = e10;
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
                int i10 = 0;
                while (true) {
                    String[] strArr = DEFAULT_RECENT;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    emojiUseHistory.put(strArr[i10], Integer.valueOf(strArr.length - i10));
                    i10++;
                }
                globalEmojiSettings.edit().putBoolean("filled_default", true).commit();
                saveRecentEmoji();
            }
            sortEmoji();
        } catch (Exception e11) {
            e = e11;
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
        } catch (Exception e12) {
            FileLog.e(e12);
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
                aa.d.u(1, arrayList);
            }
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

        public EmojiSpan(Drawable drawable, int i9, Paint.FontMetricsInt fontMetricsInt) {
            super(drawable, i9);
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

        private static void expandFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i9) {
            int i10 = fontMetricsInt.descent;
            int i11 = fontMetricsInt.ascent;
            int i12 = i10 - i11;
            if (i9 <= i12) {
                return;
            }
            int i13 = i9 - i12;
            int i14 = (i13 + 1) / 2;
            int i15 = i11 - i14;
            fontMetricsInt.ascent = i15;
            fontMetricsInt.descent = i10 + (i13 - i14);
            fontMetricsInt.top = Math.min(fontMetricsInt.top, i15);
            fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
            boolean z10;
            this.lastDrawX = aa.d.d(this.scale, this.size, 2.0f, f10);
            this.lastDrawY = ((i13 - i11) / 2.0f) + i11;
            boolean z11 = true;
            this.drawn = true;
            if (paint.getAlpha() == 255 || !Emoji.emojiDrawingUseAlpha) {
                z10 = false;
            } else {
                getDrawable().setAlpha(paint.getAlpha());
                z10 = true;
            }
            float f11 = Emoji.emojiDrawingYOffset;
            int i14 = this.size;
            float f12 = f11 - ((i14 - (this.scale * i14)) / 2.0f);
            if (f12 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, f12);
            } else {
                z11 = false;
            }
            super.draw(canvas, charSequence, i9, i10, f10, i11, i12, i13, paint);
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
        public int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
            Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
            boolean z10 = this.preserveFontMetrics && fontMetricsInt2 != null;
            int i11 = z10 ? fontMetricsInt2.top : 0;
            int i12 = z10 ? fontMetricsInt2.ascent : 0;
            int i13 = z10 ? fontMetricsInt2.descent : 0;
            int i14 = z10 ? fontMetricsInt2.bottom : 0;
            int i15 = z10 ? fontMetricsInt2.leading : 0;
            if (fontMetricsInt2 == null) {
                fontMetricsInt2 = new Paint.FontMetricsInt();
            }
            Paint.FontMetricsInt fontMetricsInt3 = fontMetricsInt2;
            int i16 = (int) (this.scale * this.size);
            Paint.FontMetricsInt fontMetricsInt4 = this.fontMetrics;
            if (fontMetricsInt4 != null) {
                fontMetricsInt3.ascent = fontMetricsInt4.ascent;
                fontMetricsInt3.descent = fontMetricsInt4.descent;
                fontMetricsInt3.top = fontMetricsInt4.top;
                fontMetricsInt3.bottom = fontMetricsInt4.bottom;
                if (getDrawable() != null) {
                    getDrawable().setBounds(0, 0, i16, i16);
                }
                if (z10) {
                    fontMetricsInt3.top = i11;
                    fontMetricsInt3.ascent = i12;
                    fontMetricsInt3.descent = i13;
                    fontMetricsInt3.bottom = i14;
                    fontMetricsInt3.leading = i15;
                    expandFontMetrics(fontMetricsInt3, this.minimumLineHeight);
                }
                return i16;
            }
            int size = super.getSize(paint, charSequence, i9, i10, fontMetricsInt3);
            int dp = AndroidUtilities.dp(8.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            int i17 = (-dp2) - dp;
            fontMetricsInt3.top = i17;
            int i18 = dp2 - dp;
            fontMetricsInt3.bottom = i18;
            fontMetricsInt3.ascent = i17;
            fontMetricsInt3.leading = 0;
            fontMetricsInt3.descent = i18;
            if (z10) {
                fontMetricsInt3.top = i11;
                fontMetricsInt3.ascent = i12;
                fontMetricsInt3.descent = i13;
                fontMetricsInt3.bottom = i14;
                fontMetricsInt3.leading = i15;
                expandFontMetrics(fontMetricsInt3, this.minimumLineHeight);
            }
            return size;
        }

        public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i9) {
            this.fontMetrics = fontMetricsInt;
            this.size = i9;
        }

        public EmojiSpan setMinimumLineHeight(int i9) {
            this.minimumLineHeight = i9;
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
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char charAt2;
        int i15;
        int i16;
        ArrayList<EmojiSpanRange> arrayList = new ArrayList<>();
        if (charSequence != null && charSequence.length() > 0) {
            StringBuilder sb2 = new StringBuilder(16);
            int length = charSequence.length();
            int i17 = -1;
            int[] iArr2 = iArr;
            int i18 = 0;
            int i19 = 0;
            long j10 = 0;
            int i20 = -1;
            int i21 = 0;
            boolean z12 = false;
            boolean z13 = false;
            while (i19 < length) {
                try {
                    char charAt3 = charSequence.charAt(i19);
                    if ((charAt3 < 55356 || charAt3 > 55358) && (j10 == 0 || (j10 & (-4294967296L)) != 0 || (j10 & 65535) != 55356 || charAt3 < 56806 || charAt3 > 56831)) {
                        if ((sb2.length() > 0 && (charAt3 == 9792 || charAt3 == 9794 || charAt3 == 9877)) || (j10 > 0 && (61440 & charAt3) == 53248)) {
                            sb2.append(charAt3);
                            i21++;
                            j10 = 0;
                        } else if (charAt3 != 8419) {
                            if (charAt3 != 169) {
                                if (charAt3 != 174) {
                                    if (charAt3 >= 8252 && charAt3 <= 12953) {
                                    }
                                    if (i20 == -1) {
                                        sb2.setLength(0);
                                        z10 = false;
                                        i20 = -1;
                                        i21 = 0;
                                        z12 = false;
                                        z13 = false;
                                    } else if (charAt3 != 65039 && charAt3 != '\n' && charAt3 != ' ' && charAt3 != '\t') {
                                        z10 = true;
                                    }
                                    if (z13 || (i16 = i19 + 2) >= length) {
                                        z11 = z10;
                                    } else {
                                        int i22 = i19 + 1;
                                        char charAt4 = charSequence.charAt(i22);
                                        z11 = z10;
                                        if (charAt4 == 55356) {
                                            char charAt5 = charSequence.charAt(i16);
                                            if (charAt5 >= 57339 && charAt5 <= 57343) {
                                                sb2.append(charSequence.subSequence(i22, i19 + 3));
                                                i21 += 2;
                                                i9 = i16;
                                                i10 = i9;
                                                i11 = 0;
                                                while (i11 < 3) {
                                                    int i23 = i10 + 1;
                                                    if (i23 < length) {
                                                        char charAt6 = charSequence.charAt(i23);
                                                        i15 = i9;
                                                        if (i11 == 1) {
                                                            if (charAt6 == 8205 && sb2.length() > 0) {
                                                                sb2.append(charAt6);
                                                                i21++;
                                                                i10 = i23;
                                                                z13 = false;
                                                                z11 = false;
                                                            }
                                                        } else if (charAt3 == '*' || charAt3 == '#' || (charAt3 >= '0' && charAt3 <= '9')) {
                                                            if (charAt6 >= 65024) {
                                                                if (charAt6 <= 65039) {
                                                                    i21++;
                                                                    if (!z13) {
                                                                        z13 = i10 + 2 >= length;
                                                                    }
                                                                    i10 = i23;
                                                                    i20 = i15;
                                                                    z12 = true;
                                                                }
                                                            }
                                                        } else if (i20 != -1 && charAt6 >= 65024) {
                                                            if (charAt6 <= 65039) {
                                                                i21++;
                                                                if (!z13) {
                                                                    z13 = i10 + 2 >= length;
                                                                }
                                                                i10 = i23;
                                                            }
                                                        }
                                                        i11++;
                                                        i9 = i15;
                                                    } else {
                                                        i15 = i9;
                                                    }
                                                    i11++;
                                                    i9 = i15;
                                                }
                                                int i24 = i9;
                                                if (z11 && iArr2 != null) {
                                                    iArr2[0] = 0;
                                                    iArr2 = null;
                                                }
                                                if (z13 && (i13 = i10 + 2) < length) {
                                                    i14 = i10 + 1;
                                                    if (charSequence.charAt(i14) == 55356 && (charAt2 = charSequence.charAt(i13)) >= 57339 && charAt2 <= 57343) {
                                                        sb2.append(charSequence.subSequence(i14, i10 + 3));
                                                        i21 += 2;
                                                        i10 = i13;
                                                    }
                                                }
                                                if (z13) {
                                                    if (iArr2 != null) {
                                                        iArr2[0] = iArr2[0] + 1;
                                                    }
                                                    if (i20 >= 0 && (i12 = i21 + i20) <= length) {
                                                        arrayList.add(new EmojiSpanRange(i20, i12, sb2.subSequence(0, sb2.length())));
                                                    }
                                                    sb2.setLength(0);
                                                    i20 = -1;
                                                    i21 = 0;
                                                    z12 = false;
                                                    z13 = false;
                                                }
                                                i19 = i10 + 1;
                                                i18 = i24;
                                                i17 = -1;
                                            }
                                        } else if (sb2.length() >= 2 && sb2.charAt(0) == 55356 && sb2.charAt(1) == 57332 && charAt4 == 56128) {
                                            while (true) {
                                                if (i22 < charSequence.length()) {
                                                    sb2.append(charSequence.charAt(i22));
                                                }
                                                int i25 = i22 + 1;
                                                if (i25 < charSequence.length()) {
                                                    sb2.append(charSequence.charAt(i25));
                                                }
                                                i21 += 2;
                                                int i26 = i22 + 2;
                                                if (i26 >= charSequence.length() || charSequence.charAt(i26) != 56128) {
                                                    break;
                                                }
                                                i22 = i26;
                                            }
                                            i19 = i22 + 1;
                                        }
                                    }
                                    i9 = i19;
                                    i10 = i9;
                                    i11 = 0;
                                    while (i11 < 3) {
                                    }
                                    int i242 = i9;
                                    if (z11) {
                                        iArr2[0] = 0;
                                        iArr2 = null;
                                    }
                                    if (z13) {
                                        i14 = i10 + 1;
                                        if (charSequence.charAt(i14) == 55356) {
                                            sb2.append(charSequence.subSequence(i14, i10 + 3));
                                            i21 += 2;
                                            i10 = i13;
                                        }
                                    }
                                    if (z13) {
                                    }
                                    i19 = i10 + 1;
                                    i18 = i242;
                                    i17 = -1;
                                }
                            }
                            if (EmojiData.dataCharsMap.containsKey(Character.valueOf(charAt3))) {
                                if (i20 == -1) {
                                    i20 = i19;
                                } else if (z12) {
                                    i20 = i19;
                                    i21 = 0;
                                    z12 = false;
                                }
                                i21++;
                                sb2.append(charAt3);
                            }
                            if (i20 == -1) {
                            }
                            if (z13) {
                            }
                            z11 = z10;
                            i9 = i19;
                            i10 = i9;
                            i11 = 0;
                            while (i11 < 3) {
                            }
                            int i2422 = i9;
                            if (z11) {
                            }
                            if (z13) {
                            }
                            if (z13) {
                            }
                            i19 = i10 + 1;
                            i18 = i2422;
                            i17 = -1;
                        } else if (i19 > 0 && (((charAt = charSequence.charAt(i18)) >= '0' && charAt <= '9') || charAt == '#' || charAt == '*')) {
                            i21 = (i19 - i18) + 1;
                            sb2.append(charAt);
                            sb2.append(charAt3);
                            i20 = i18;
                            z12 = false;
                            z13 = true;
                        }
                        z10 = false;
                        z13 = true;
                        if (z13) {
                        }
                        z11 = z10;
                        i9 = i19;
                        i10 = i9;
                        i11 = 0;
                        while (i11 < 3) {
                        }
                        int i24222 = i9;
                        if (z11) {
                        }
                        if (z13) {
                        }
                        if (z13) {
                        }
                        i19 = i10 + 1;
                        i18 = i24222;
                        i17 = -1;
                    } else {
                        if (i20 == i17) {
                            i20 = i19;
                        } else if (z12) {
                            i20 = i19;
                            i21 = 0;
                            z12 = false;
                        }
                        sb2.append(charAt3);
                        i21++;
                        j10 = (j10 << 16) | charAt3;
                    }
                    z10 = false;
                    if (z13) {
                    }
                    z11 = z10;
                    i9 = i19;
                    i10 = i9;
                    i11 = 0;
                    while (i11 < 3) {
                    }
                    int i242222 = i9;
                    if (z11) {
                    }
                    if (z13) {
                    }
                    if (z13) {
                    }
                    i19 = i10 + 1;
                    i18 = i242222;
                    i17 = -1;
                } catch (Exception e10) {
                    FileLog.e(e10);
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

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, int i9, Runnable runnable) {
        Spannable newSpannable;
        int i10;
        EmojiSpanRange emojiSpanRange;
        TLRPC.Document document;
        org.telegram.ui.Components.t5 t5Var;
        int i11;
        if (SharedConfig.useSystemEmoji || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i12 = UserConfig.selectedAccount;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet(tL_inputStickerSetShortName, 0, false, true, runnable == null ? null : new a1(runnable, 1));
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
        int i13 = SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50;
        for (int i14 = 0; i14 < parseEmojis.size(); i14++) {
            try {
                emojiSpanRange = parseEmojis.get(i14);
                if (t5VarArr != null) {
                    while (i11 < t5VarArr.length) {
                        org.telegram.ui.Components.t5 t5Var2 = t5VarArr[i11];
                        i11 = (t5Var2 != null && newSpannable.getSpanStart(t5Var2) == emojiSpanRange.start && newSpannable.getSpanEnd(t5Var2) == emojiSpanRange.end) ? 0 : i11 + 1;
                    }
                }
                if (stickerSet != null) {
                    ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.Document document2 = arrayList.get(i15);
                        i15++;
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
            } catch (Exception e10) {
                e = e10;
            }
            try {
                t5Var.cacheType = i9;
                newSpannable.setSpan(t5Var, emojiSpanRange.start, emojiSpanRange.end, 33);
            } catch (Exception e11) {
                e = e11;
                FileLog.e(e);
                i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23) {
                }
                break;
                return newSpannable;
            }
            i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 23 || i10 >= 29) && i14 + 1 >= i13) {
                break;
            }
        }
        return newSpannable;
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i9) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, iArr, i9, 1.0f, 0);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i9, float f10, int i10) {
        Spannable newSpannable;
        int i11;
        int i12;
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
        eq[] eqVarArr = (eq[]) newSpannable.getSpans(0, newSpannable.length(), eq.class);
        int i13 = (SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50) - i10;
        for (int i14 = 0; i14 < parseEmojis.size(); i14++) {
            try {
                EmojiSpanRange emojiSpanRange = parseEmojis.get(i14);
                if (t5VarArr != null && t5VarArr.length > 0) {
                    while (i12 < t5VarArr.length) {
                        org.telegram.ui.Components.t5 t5Var = t5VarArr[i12];
                        i12 = (t5Var != null && newSpannable.getSpanStart(t5Var) == emojiSpanRange.start && newSpannable.getSpanEnd(t5Var) == emojiSpanRange.end) ? 0 : i12 + 1;
                    }
                }
                if (eqVarArr != null && eqVarArr.length > 0) {
                    while (i11 < eqVarArr.length) {
                        eq eqVar = eqVarArr[i11];
                        i11 = (eqVar != null && newSpannable.getSpanStart(eqVar) == emojiSpanRange.start && newSpannable.getSpanEnd(eqVar) == emojiSpanRange.end) ? 0 : i11 + 1;
                    }
                }
                EmojiDrawable emojiDrawable = getEmojiDrawable(emojiSpanRange.code);
                if (emojiDrawable != null) {
                    EmojiSpan emojiSpan = new EmojiSpan(emojiDrawable, i9, fontMetricsInt);
                    CharSequence charSequence2 = emojiSpanRange.code;
                    emojiSpan.emoji = charSequence2 == null ? null : charSequence2.toString();
                    emojiSpan.scale = f10;
                    newSpannable.setSpan(emojiSpan, emojiSpanRange.start, emojiSpanRange.end, 33);
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            int i15 = Build.VERSION.SDK_INT;
            if ((i15 < 23 || i15 >= 29) && i14 + 1 >= i13) {
                break;
            }
        }
        return newSpannable;
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static abstract class EmojiDrawable extends Drawable {
        public boolean fullSize = false;
        int placeholderColor = TLObject.FLAG_28;

        public boolean isLoaded() {
            return false;
        }

        public void preload() {
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        public void setAlpha(int i9) {
            paint.setAlpha(i9);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
