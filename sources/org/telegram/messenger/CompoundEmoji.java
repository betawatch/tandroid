package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class CompoundEmoji {
    public static List<String> skinTones = Arrays.asList("🏻", "🏼", "🏽", "🏾", "🏿");
    private static Paint placeholderPaint = new Paint(2);

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class DrawableInfo {
        private static final SparseArray<Bitmap> bitmaps = new SparseArray<>();
        private static final ArrayList<Integer> loading = new ArrayList<>();
        int emoji;
        int hash;
        int place;
        boolean placeholder;
        int skin;

        public DrawableInfo(int i9, int i10, int i11) {
            if (i10 == -2) {
                this.placeholder = true;
                i10 = -1;
            }
            this.emoji = i9;
            Integer valueOf = Integer.valueOf(i9);
            this.skin = i10;
            Integer valueOf2 = Integer.valueOf(i10);
            this.place = i11;
            this.hash = Objects.hash(valueOf, valueOf2, Integer.valueOf(i11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$load$0() {
            Bitmap loadBitmap = Emoji.loadBitmap("emoji/compound/" + this.emoji + "_" + this.skin + "_" + this.place + ".png");
            if (loadBitmap != null) {
                bitmaps.put(this.hash, loadBitmap);
                Runnable runnable = Emoji.invalidateUiRunnable;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
            }
            loading.remove(Integer.valueOf(this.hash));
        }

        public Bitmap getBitmap() {
            return bitmaps.get(this.hash);
        }

        public int hashCode() {
            return this.hash;
        }

        public boolean isLoaded() {
            return bitmaps.indexOfKey(this.hash) >= 0;
        }

        public void load() {
            if (isLoaded()) {
                return;
            }
            ArrayList<Integer> arrayList = loading;
            if (arrayList.contains(Integer.valueOf(this.hash))) {
                return;
            }
            arrayList.add(Integer.valueOf(this.hash));
            Utilities.globalQueue.postRunnable(new e1(this, 0));
        }

        public DrawableInfo updateSkin(int i9) {
            return this.skin == i9 ? this : new DrawableInfo(this.emoji, i9, this.place);
        }
    }

    public static String applyColor(String str, String str2) {
        if (isHandshake(str) == null) {
            return str;
        }
        if (str2 == null) {
            return "🤝";
        }
        if (!str2.contains("\u200d")) {
            return "🤝".concat(str2);
        }
        String[] split = str2.split("\u200d");
        StringBuilder sb2 = new StringBuilder("\u1faf1");
        sb2.append(split.length >= 1 ? split[0] : "");
        sb2.append("\u200d\u1faf2");
        sb2.append(split.length >= 2 ? split[1] : "");
        return sb2.toString();
    }

    public static CompoundEmojiDrawable getCompoundEmojiDrawable(String str) {
        return getCompoundEmojiDrawable(str, null, null);
    }

    public static int getSkinTone(String str) {
        if (str == null) {
            return -1;
        }
        return skinTones.indexOf(str.substring(str.length() - 2));
    }

    public static boolean isCompound(String str) {
        return getCompoundEmojiDrawable(str) != null;
    }

    public static Pair<Integer, Integer> isHandshake(String str) {
        int i9;
        String[] split;
        if (str.startsWith("🤝")) {
            if (str.length() != 2) {
                if (str.length() == 4) {
                    i9 = getSkinTone(str);
                    r3 = i9 >= 0 ? i9 : -1;
                    split = str.split("\u200d");
                    if (split.length == 2 || !split[0].startsWith("\u1faf1") || !split[1].startsWith("\u1faf2")) {
                        return null;
                    }
                    if (split[0].length() != 2 && (split[0].length() != 4 || (i9 = getSkinTone(split[0])) < 0)) {
                        return null;
                    }
                    if (split[1].length() == 2 || (split[1].length() == 4 && (r3 = getSkinTone(split[1])) >= 0)) {
                        return new Pair<>(Integer.valueOf(i9), Integer.valueOf(r3));
                    }
                    return null;
                }
            }
            return new Pair<>(Integer.valueOf(r3), Integer.valueOf(r3));
        }
        i9 = -1;
        split = str.split("\u200d");
        return split.length == 2 ? null : null;
    }

    public static void setPlaceholderColor(int i9) {
        placeholderPaint.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
    }

    public static CompoundEmojiDrawable getCompoundEmojiDrawable(String str, Integer num, Integer num2) {
        CompoundEmojiDrawable compoundEmojiDrawable = null;
        if (str == null) {
            return null;
        }
        Pair<Integer, Integer> isHandshake = isHandshake(str);
        if (isHandshake != null) {
            if (num == null) {
                num = (Integer) isHandshake.first;
            }
            DrawableInfo drawableInfo = new DrawableInfo(0, num.intValue(), 0);
            if (num2 == null) {
                num2 = (Integer) isHandshake.second;
            }
            compoundEmojiDrawable = new CompoundEmojiDrawable(drawableInfo, new DrawableInfo(0, num2.intValue(), 1));
        }
        return compoundEmojiDrawable;
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class CompoundEmojiDrawable extends Emoji.EmojiDrawable {
        private static Paint paint = new Paint(2);
        private static Rect rect = new Rect();
        private DrawableInfo left;
        private org.telegram.ui.Components.y5 leftUpdateT;
        private DrawableInfo newLeft;
        private DrawableInfo newRight;
        private View parent;
        private DrawableInfo right;
        private org.telegram.ui.Components.y5 rightUpdateT;

        public CompoundEmojiDrawable(DrawableInfo drawableInfo, DrawableInfo drawableInfo2) {
            this.left = drawableInfo;
            this.right = drawableInfo2;
        }

        private void drawDrawableInfo(Canvas canvas, DrawableInfo drawableInfo, Rect rect2, float f10) {
            int i9;
            Bitmap bitmap = drawableInfo.getBitmap();
            if (bitmap != null) {
                Paint paint2 = drawableInfo.placeholder ? CompoundEmoji.placeholderPaint : paint;
                if (f10 < 1.0f) {
                    i9 = paint2.getAlpha();
                    paint2.setAlpha((int) (i9 * f10));
                } else {
                    i9 = 255;
                }
                canvas.drawBitmap(bitmap, (Rect) null, rect2, paint2);
                if (f10 < 1.0f) {
                    paint2.setAlpha(i9);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidate() {
            View view = this.parent;
            if (view != null) {
                view.invalidate();
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (!isLoaded()) {
                preload();
                Emoji.placeholderPaint.setColor(this.placeholderColor);
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), bounds.width() * 0.4f, Emoji.placeholderPaint);
                return;
            }
            Rect drawRect = this.fullSize ? getDrawRect() : getBounds();
            if (canvas.quickReject(drawRect.left, drawRect.top, drawRect.right, drawRect.bottom, Canvas.EdgeType.AA)) {
                return;
            }
            if (this.newLeft != null) {
                if (this.leftUpdateT == null) {
                    this.leftUpdateT = new org.telegram.ui.Components.y5(0.0f, new e1(this, 16), 0L, 320L, gr.g);
                }
                float d = this.leftUpdateT.d(1.0f, false);
                drawDrawableInfo(canvas, this.newLeft, drawRect, Math.min(1.0f, d * 1.5f));
                drawDrawableInfo(canvas, this.left, drawRect, 1.0f - d);
                if (d >= 1.0f) {
                    this.left = this.newLeft;
                    this.newLeft = null;
                }
            } else {
                drawDrawableInfo(canvas, this.left, drawRect, 1.0f);
            }
            if (this.newRight == null) {
                drawDrawableInfo(canvas, this.right, drawRect, 1.0f);
                return;
            }
            if (this.rightUpdateT == null) {
                this.rightUpdateT = new org.telegram.ui.Components.y5(0.0f, new e1(this, 16), 0L, 320L, gr.g);
            }
            float d9 = this.rightUpdateT.d(1.0f, false);
            drawDrawableInfo(canvas, this.newRight, drawRect, Math.min(1.0f, 1.5f * d9));
            drawDrawableInfo(canvas, this.right, drawRect, 1.0f - d9);
            if (d9 >= 1.0f) {
                this.right = this.newRight;
                this.newRight = null;
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

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // org.telegram.messenger.Emoji.EmojiDrawable
        public boolean isLoaded() {
            return this.left.isLoaded() && this.right.isLoaded();
        }

        @Override // org.telegram.messenger.Emoji.EmojiDrawable
        public void preload() {
            if (isLoaded()) {
                return;
            }
            this.left.load();
            this.right.load();
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i9) {
            paint.setAlpha(i9);
        }

        public void update(int i9, int i10) {
            if (this.left.skin != i9) {
                DrawableInfo drawableInfo = this.newLeft;
                if (drawableInfo != null) {
                    this.left = drawableInfo;
                }
                this.newLeft = this.left.updateSkin(i9);
                org.telegram.ui.Components.y5 y5Var = this.leftUpdateT;
                if (y5Var != null) {
                    y5Var.d(0.0f, true);
                }
            }
            if (this.right.skin != i10) {
                DrawableInfo drawableInfo2 = this.newRight;
                if (drawableInfo2 != null) {
                    this.right = drawableInfo2;
                }
                this.newRight = this.right.updateSkin(i10);
                org.telegram.ui.Components.y5 y5Var2 = this.rightUpdateT;
                if (y5Var2 != null) {
                    y5Var2.d(0.0f, true);
                }
            }
            invalidate();
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
