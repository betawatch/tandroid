package org.telegram.ui.Components;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes5.dex */
public class EightPatchDrawable extends Drawable {
    private final android.graphics.Rect dstBC;
    private final android.graphics.Rect dstBL;
    private final android.graphics.Rect dstBR;
    private final android.graphics.Rect dstML;
    private final android.graphics.Rect dstMR;
    private final android.graphics.Rect dstTC;
    private final android.graphics.Rect dstTL;
    private final android.graphics.Rect dstTR;
    private ColorFilter explicitColorFilter;
    private boolean geometryValid;
    private boolean mutated;
    private final android.graphics.Rect srcBC;
    private final android.graphics.Rect srcBL;
    private final android.graphics.Rect srcBR;
    private final android.graphics.Rect srcML;
    private final android.graphics.Rect srcMR;
    private final android.graphics.Rect srcTC;
    private final android.graphics.Rect srcTL;
    private final android.graphics.Rect srcTR;
    private EightPatchState state;
    private PorterDuffColorFilter tintFilter;

    public EightPatchDrawable(Bitmap bitmap, byte[] bArr, android.graphics.Rect rect, String str) {
        this(null, bitmap, bArr, rect, str);
    }

    public EightPatchDrawable(Resources resources, Bitmap bitmap, byte[] bArr, android.graphics.Rect rect, String str) {
        this.srcTL = new android.graphics.Rect();
        this.srcTC = new android.graphics.Rect();
        this.srcTR = new android.graphics.Rect();
        this.srcML = new android.graphics.Rect();
        this.srcMR = new android.graphics.Rect();
        this.srcBL = new android.graphics.Rect();
        this.srcBC = new android.graphics.Rect();
        this.srcBR = new android.graphics.Rect();
        this.dstTL = new android.graphics.Rect();
        this.dstTC = new android.graphics.Rect();
        this.dstTR = new android.graphics.Rect();
        this.dstML = new android.graphics.Rect();
        this.dstMR = new android.graphics.Rect();
        this.dstBL = new android.graphics.Rect();
        this.dstBC = new android.graphics.Rect();
        this.dstBR = new android.graphics.Rect();
        this.state = new EightPatchState(resources, bitmap, bArr, rect, str);
        updateLocalState();
        rebuildSourcePatches();
        rebuildDestPatches(getBounds());
    }

    private EightPatchDrawable(EightPatchState eightPatchState) {
        this.srcTL = new android.graphics.Rect();
        this.srcTC = new android.graphics.Rect();
        this.srcTR = new android.graphics.Rect();
        this.srcML = new android.graphics.Rect();
        this.srcMR = new android.graphics.Rect();
        this.srcBL = new android.graphics.Rect();
        this.srcBC = new android.graphics.Rect();
        this.srcBR = new android.graphics.Rect();
        this.dstTL = new android.graphics.Rect();
        this.dstTC = new android.graphics.Rect();
        this.dstTR = new android.graphics.Rect();
        this.dstML = new android.graphics.Rect();
        this.dstMR = new android.graphics.Rect();
        this.dstBL = new android.graphics.Rect();
        this.dstBC = new android.graphics.Rect();
        this.dstBR = new android.graphics.Rect();
        this.state = new EightPatchState(eightPatchState);
        updateLocalState();
        rebuildSourcePatches();
        rebuildDestPatches(getBounds());
    }

    private void updateLocalState() {
        EightPatchState eightPatchState = this.state;
        this.tintFilter = createTintFilter(eightPatchState.tint, eightPatchState.tintMode);
        this.geometryValid = false;
    }

    private void rebuildSourcePatches() {
        this.geometryValid = false;
        EightPatchState eightPatchState = this.state;
        Bitmap bitmap = eightPatchState.bitmap;
        ChunkInfo chunkInfo = eightPatchState.chunkInfo;
        if (bitmap == null || bitmap.isRecycled() || chunkInfo == null) {
            clearDst();
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = chunkInfo.xDivs;
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = chunkInfo.yDivs;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        this.srcTL.set(0, 0, i, i3);
        this.srcTC.set(i, 0, i2, i3);
        this.srcTR.set(i2, 0, width, i3);
        this.srcML.set(0, i3, i, i4);
        this.srcMR.set(i2, i3, width, i4);
        this.srcBL.set(0, i4, i, height);
        this.srcBC.set(i, i4, i2, height);
        this.srcBR.set(i2, i4, width, height);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        rebuildDestPatches(rect);
    }

    private void rebuildDestPatches(android.graphics.Rect rect) {
        this.geometryValid = false;
        EightPatchState eightPatchState = this.state;
        Bitmap bitmap = eightPatchState.bitmap;
        ChunkInfo chunkInfo = eightPatchState.chunkInfo;
        if (bitmap == null || bitmap.isRecycled() || chunkInfo == null || rect.isEmpty()) {
            clearDst();
            return;
        }
        float densityScale = getDensityScale();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = chunkInfo.xDivs;
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = chunkInfo.yDivs;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        int round = Math.round(i * densityScale);
        int round2 = Math.round((i2 - i) * densityScale);
        int round3 = Math.round((width - i2) * densityScale);
        int round4 = Math.round(i3 * densityScale);
        int round5 = Math.round((i4 - i3) * densityScale);
        int round6 = Math.round((height - i4) * densityScale);
        Axis computeAxis = computeAxis(rect.left, rect.width(), round, round2, round3);
        Axis computeAxis2 = computeAxis(rect.top, rect.height(), round4, round5, round6);
        int i5 = computeAxis.p0;
        int i6 = computeAxis.p1;
        int i7 = computeAxis.p2;
        int i8 = computeAxis.p3;
        int i9 = computeAxis2.p0;
        int i10 = computeAxis2.p1;
        int i11 = computeAxis2.p2;
        int i12 = computeAxis2.p3;
        this.dstTL.set(i5, i9, i6, i10);
        this.dstTC.set(i6, i9, i7, i10);
        this.dstTR.set(i7, i9, i8, i10);
        this.dstML.set(i5, i10, i6, i11);
        this.dstMR.set(i7, i10, i8, i11);
        this.dstBL.set(i5, i11, i6, i12);
        this.dstBC.set(i6, i11, i7, i12);
        this.dstBR.set(i7, i11, i8, i12);
        this.geometryValid = true;
    }

    private static Axis computeAxis(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i3 + i4 + i5;
        int i8 = i5 + i3;
        if (i2 <= 0 || i7 <= 0) {
            i3 = 0;
            i6 = 0;
        } else if (i2 >= i8) {
            i6 = i2 - i8;
        } else {
            float f = i2 / i7;
            i3 = Math.round(i3 * f);
            i6 = Math.round(i4 * f);
        }
        Axis axis = new Axis();
        axis.p0 = i;
        int i9 = i3 + i;
        axis.p1 = i9;
        axis.p2 = i9 + i6;
        axis.p3 = i + i2;
        return axis;
    }

    private void clearDst() {
        this.dstTL.setEmpty();
        this.dstTC.setEmpty();
        this.dstTR.setEmpty();
        this.dstML.setEmpty();
        this.dstMR.setEmpty();
        this.dstBL.setEmpty();
        this.dstBC.setEmpty();
        this.dstBR.setEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.geometryValid || (bitmap = this.state.bitmap) == null || bitmap.isRecycled()) {
            return;
        }
        Paint paint = this.state.paint;
        int alpha = paint.getAlpha();
        ColorFilter colorFilter = paint.getColorFilter();
        int i = (this.state.alpha * alpha) / NotificationCenter.invalidateMotionBackground;
        if (i != alpha) {
            paint.setAlpha(i);
        }
        ColorFilter colorFilter2 = this.explicitColorFilter;
        if (colorFilter2 == null) {
            colorFilter2 = this.tintFilter;
        }
        if (colorFilter != colorFilter2) {
            paint.setColorFilter(colorFilter2);
        }
        drawPatch(canvas, bitmap, this.srcTL, this.dstTL, paint);
        drawPatch(canvas, bitmap, this.srcTC, this.dstTC, paint);
        drawPatch(canvas, bitmap, this.srcTR, this.dstTR, paint);
        drawPatch(canvas, bitmap, this.srcML, this.dstML, paint);
        drawPatch(canvas, bitmap, this.srcMR, this.dstMR, paint);
        drawPatch(canvas, bitmap, this.srcBL, this.dstBL, paint);
        drawPatch(canvas, bitmap, this.srcBC, this.dstBC, paint);
        drawPatch(canvas, bitmap, this.srcBR, this.dstBR, paint);
        if (colorFilter != colorFilter2) {
            paint.setColorFilter(colorFilter);
        }
        if (i != alpha) {
            paint.setAlpha(alpha);
        }
    }

    private static void drawPatch(Canvas canvas, Bitmap bitmap, android.graphics.Rect rect, android.graphics.Rect rect2, Paint paint) {
        if (rect.isEmpty() || rect2.isEmpty()) {
            return;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        int clamp255 = clamp255(i);
        EightPatchState eightPatchState = this.state;
        if (eightPatchState.alpha != clamp255) {
            eightPatchState.alpha = clamp255;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.state.alpha;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.explicitColorFilter != colorFilter) {
            this.explicitColorFilter = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.explicitColorFilter;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        EightPatchState eightPatchState = this.state;
        if (eightPatchState.tint != colorStateList) {
            eightPatchState.tint = colorStateList;
            this.tintFilter = createTintFilter(colorStateList, eightPatchState.tintMode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        EightPatchState eightPatchState = this.state;
        if (eightPatchState.tintMode != mode) {
            eightPatchState.tintMode = mode;
            this.tintFilter = createTintFilter(eightPatchState.tint, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.state.tint;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        EightPatchState eightPatchState = this.state;
        PorterDuffColorFilter createTintFilter = createTintFilter(eightPatchState.tint, eightPatchState.tintMode);
        if (sameTintFilter(this.tintFilter, createTintFilter)) {
            return false;
        }
        this.tintFilter = createTintFilter;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.state.tint;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        EightPatchState eightPatchState = this.state;
        Bitmap bitmap = eightPatchState.bitmap;
        if (bitmap == null) {
            return -2;
        }
        return (eightPatchState.alpha < 255 || bitmap.hasAlpha() || this.state.paint.getAlpha() < 255) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.state.padding;
        if (rect2 != null) {
            rect.set(rect2);
            return (rect.bottom | ((rect.left | rect.top) | rect.right)) != 0;
        }
        rect.setEmpty();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Bitmap bitmap = this.state.bitmap;
        if (bitmap != null) {
            return scaleFromSourceDensity(bitmap.getWidth());
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Bitmap bitmap = this.state.bitmap;
        if (bitmap != null) {
            return scaleFromSourceDensity(bitmap.getHeight());
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        if (this.state.paint.isFilterBitmap() != z) {
            this.state.paint.setFilterBitmap(z);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isFilterBitmap() {
        return this.state.paint.isFilterBitmap();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        if (this.state.paint.isDither() != z) {
            this.state.paint.setDither(z);
            invalidateSelf();
        }
    }

    public void setTargetDensity(DisplayMetrics displayMetrics) {
        setTargetDensity(displayMetrics.densityDpi);
    }

    public void setTargetDensity(int i) {
        if (i == 0) {
            i = NotificationCenter.albumsDidLoad;
        }
        EightPatchState eightPatchState = this.state;
        if (eightPatchState.targetDensity != i) {
            eightPatchState.targetDensity = i;
            rebuildDestPatches(getBounds());
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        this.state.changingConfigurations = getChangingConfigurations();
        return this.state;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.mutated && super.mutate() == this) {
            this.state = new EightPatchState(this.state);
            this.mutated = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.state.changingConfigurations;
    }

    private float getDensityScale() {
        EightPatchState eightPatchState = this.state;
        int i = eightPatchState.sourceDensity;
        int i2 = NotificationCenter.albumsDidLoad;
        if (i == 0) {
            i = NotificationCenter.albumsDidLoad;
        }
        int i3 = eightPatchState.targetDensity;
        if (i3 != 0) {
            i2 = i3;
        }
        return i2 / i;
    }

    private int scaleFromSourceDensity(int i) {
        return Math.round(i * getDensityScale());
    }

    private PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), colorStateList.getDefaultColor()), mode);
    }

    private static boolean sameTintFilter(PorterDuffColorFilter porterDuffColorFilter, PorterDuffColorFilter porterDuffColorFilter2) {
        if (porterDuffColorFilter == porterDuffColorFilter2) {
            return true;
        }
        if (porterDuffColorFilter == null || porterDuffColorFilter2 == null) {
            return false;
        }
        return porterDuffColorFilter.equals(porterDuffColorFilter2);
    }

    private static int clamp255(int i) {
        return Math.max(0, Math.min(NotificationCenter.invalidateMotionBackground, i));
    }

    private static final class Axis {
        int p0;
        int p1;
        int p2;
        int p3;

        private Axis() {
        }
    }

    private static final class ChunkInfo {
        final android.graphics.Rect padding;
        final int[] xDivs;
        final int[] yDivs;

        ChunkInfo(int[] iArr, int[] iArr2, android.graphics.Rect rect) {
            this.xDivs = iArr;
            this.yDivs = iArr2;
            this.padding = rect;
        }

        static ChunkInfo parse(byte[] bArr, android.graphics.Rect rect, int i, int i2) {
            if (NinePatch.isNinePatchChunk(bArr) && bArr.length >= 32) {
                try {
                    ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
                    if (order.get() == 0) {
                        return null;
                    }
                    int i3 = order.get() & 255;
                    int i4 = order.get() & 255;
                    int i5 = order.get() & 255;
                    if (i3 != 2 || i4 != 2) {
                        throw new IllegalArgumentException("EightPatchDrawable supports only 3x3 nine-patch");
                    }
                    order.getInt();
                    order.getInt();
                    int i6 = order.getInt();
                    int i7 = order.getInt();
                    int i8 = order.getInt();
                    int i9 = order.getInt();
                    order.getInt();
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    iArr[0] = EightPatchDrawable.clamp(order.getInt(), 0, i);
                    iArr[1] = EightPatchDrawable.clamp(order.getInt(), iArr[0], i);
                    iArr2[0] = EightPatchDrawable.clamp(order.getInt(), 0, i2);
                    iArr2[1] = EightPatchDrawable.clamp(order.getInt(), iArr2[0], i2);
                    for (int i10 = 0; i10 < i5 && order.remaining() >= 4; i10++) {
                        order.getInt();
                    }
                    android.graphics.Rect rect2 = new android.graphics.Rect(i6, i8, i7, i9);
                    if (rect != null) {
                        rect2 = new android.graphics.Rect(rect);
                    }
                    return new ChunkInfo(iArr, iArr2, rect2);
                } catch (Throwable unused) {
                }
            }
            return null;
        }
    }

    static final class EightPatchState extends Drawable.ConstantState {
        int alpha;
        final Bitmap bitmap;
        int changingConfigurations;
        final byte[] chunk;
        final ChunkInfo chunkInfo;
        final android.graphics.Rect padding;
        final Paint paint;
        int sourceDensity;
        final String srcName;
        int targetDensity;
        ColorStateList tint;
        PorterDuff.Mode tintMode;

        EightPatchState(Resources resources, Bitmap bitmap, byte[] bArr, android.graphics.Rect rect, String str) {
            this.alpha = NotificationCenter.invalidateMotionBackground;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.bitmap = bitmap;
            byte[] bArr2 = (byte[]) bArr.clone();
            this.chunk = bArr2;
            this.srcName = str;
            android.graphics.Rect rect2 = rect != null ? new android.graphics.Rect(rect) : null;
            this.padding = rect2;
            this.chunkInfo = ChunkInfo.parse(bArr2, rect2, bitmap.getWidth(), bitmap.getHeight());
            Paint paint = new Paint();
            this.paint = paint;
            paint.setFilterBitmap(true);
            paint.setDither(true);
            int density = bitmap.getDensity() != 0 ? bitmap.getDensity() : NotificationCenter.albumsDidLoad;
            this.sourceDensity = density;
            this.targetDensity = resources != null ? resources.getDisplayMetrics().densityDpi : density;
        }

        EightPatchState(EightPatchState eightPatchState) {
            this.alpha = NotificationCenter.invalidateMotionBackground;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            Bitmap bitmap = eightPatchState.bitmap;
            this.bitmap = bitmap;
            byte[] bArr = (byte[]) eightPatchState.chunk.clone();
            this.chunk = bArr;
            this.srcName = eightPatchState.srcName;
            android.graphics.Rect rect = eightPatchState.padding != null ? new android.graphics.Rect(eightPatchState.padding) : null;
            this.padding = rect;
            this.chunkInfo = ChunkInfo.parse(bArr, rect, bitmap.getWidth(), bitmap.getHeight());
            this.paint = new Paint(eightPatchState.paint);
            this.sourceDensity = eightPatchState.sourceDensity;
            this.targetDensity = eightPatchState.targetDensity;
            this.alpha = eightPatchState.alpha;
            this.changingConfigurations = eightPatchState.changingConfigurations;
            this.tint = eightPatchState.tint;
            this.tintMode = eightPatchState.tintMode;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new EightPatchDrawable(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            EightPatchDrawable eightPatchDrawable = new EightPatchDrawable(this);
            if (resources != null) {
                eightPatchDrawable.setTargetDensity(resources.getDisplayMetrics());
            }
            return eightPatchDrawable;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.changingConfigurations;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int clamp(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }
}
