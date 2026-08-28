package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.os.Build;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ub0 extends Canvas {
    public Canvas a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.clipOutPath(path);
        }
        return false;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f10, float f11, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.clipOutRect(f10, f11, f12, f13);
        }
        return false;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        return this.a.clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f10, float f11, float f12, float f13) {
        return false;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        this.a.concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.disableZ();
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i9, int i10, int i11, int i12) {
        this.a.drawARGB(i9, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        this.a.drawArc(rectF, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        this.a.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i9, int i10, float[] fArr, int i11, int[] iArr, int i12, Paint paint) {
        this.a.drawBitmapMesh(bitmap, i9, i10, fArr, i11, iArr, i12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f10, float f11, float f12, Paint paint) {
        this.a.drawCircle(f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j10, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawColor(j10, blendMode);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i9, float[] fArr, int i10, int i11, Font font, Paint paint) {
        this.a.drawGlyphs(iArr, i9, fArr, i10, i11, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        this.a.drawLine(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i9, int i10, Paint paint) {
        this.a.drawLines(fArr, i9, i10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        this.a.drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        this.a.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.a.drawPatch(ninePatch, rectF, paint);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        this.a.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        this.a.drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f10, float f11, Paint paint) {
        this.a.drawPoint(f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i9, int i10, Paint paint) {
        this.a.drawPoints(fArr, i9, i10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        this.a.drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i9, int i10, int i11) {
        this.a.drawRGB(i9, i10, i11);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        this.a.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawRenderNode(renderNode);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        this.a.drawRoundRect(rectF, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f10, float f11, Paint paint) {
        this.a.drawText(str, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i9, int i10, Path path, float f10, float f11, Paint paint) {
        this.a.drawTextOnPath(cArr, i9, i10, path, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i9, int i10, int i11, int i12, float f10, float f11, boolean z10, Paint paint) {
        this.a.drawTextRun(cArr, i9, i10, i11, i12, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i9, float[] fArr, int i10, float[] fArr2, int i11, int[] iArr, int i12, short[] sArr, int i13, int i14, Paint paint) {
        this.a.drawVertices(vertexMode, i9, fArr, i10, fArr2, i11, iArr, i12, sArr, i13, i14, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.enableZ();
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        return this.a.getClipBounds(rect);
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return this.a.getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return this.a.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        this.a.getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return this.a.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return this.a.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return this.a.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return this.a.getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return this.a.isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f10, float f11, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.a.quickReject(f10, f11, f12, f13);
        }
        return false;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        this.a.restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i9) {
        this.a.restoreToCount(i9);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f10) {
        this.a.rotate(f10);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return this.a.save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        return this.a.saveLayer(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i9, int i10) {
        return this.a.saveLayerAlpha(rectF, i9, i10);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f10, float f11) {
        this.a.scale(f10, f11);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        this.a.setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i9) {
        this.a.setDensity(i9);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        this.a.setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        this.a.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f10, float f11) {
        this.a.skew(f10, f11);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f10, float f11) {
        this.a.translate(f10, f11);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        return this.a.clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op) {
        return false;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        this.a.drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        this.a.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        this.a.drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        this.a.drawOval(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        this.a.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        this.a.drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i9, int i10, float[] fArr, Paint paint) {
        this.a.drawPosText(cArr, i9, i10, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        this.a.drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        this.a.drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i9, int i10, float f10, float f11, Paint paint) {
        this.a.drawText(str, i9, i10, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        this.a.drawTextOnPath(str, path, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i9, int i10, int i11, int i12, float f10, float f11, boolean z10, Paint paint) {
        this.a.drawTextRun(measuredText, i9, i10, i11, i12, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        return this.a.saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i9) {
        return this.a.saveLayerAlpha(f10, f11, f12, f13, i9);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i9, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.clipOutRect(i9, i10, i11, i12);
        }
        return false;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i9, int i10, int i11, int i12) {
        return false;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i9, int i10, float f10, float f11, int i11, int i12, boolean z10, Paint paint) {
        this.a.drawBitmap(iArr, i9, i10, f10, f11, i11, i12, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i9, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawColor(i9, blendMode);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.a.drawPatch(ninePatch, rect, paint);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        this.a.drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        this.a.drawRect(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i9, int i10, float f10, float f11, Paint paint) {
        this.a.drawText(cArr, i9, i10, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i9, int i10, int i11, int i12, float f10, float f11, boolean z10, Paint paint) {
        this.a.drawTextRun(charSequence, i9, i10, i11, i12, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.a.quickReject(rectF);
        }
        return false;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i9) {
        return this.a.saveLayer(f10, f11, f12, f13, paint, i9);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i9) {
        return this.a.saveLayerAlpha(rectF, i9);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        return false;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i9, int i10, int i11, int i12, int i13, int i14, boolean z10, Paint paint) {
        this.a.drawBitmap(iArr, i9, i10, i11, i12, i13, i14, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i9, int i10, float f10, float f11, Paint paint) {
        this.a.drawText(charSequence, i9, i10, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i9) {
        return this.a.saveLayer(rectF, paint, i9);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i9, int i10) {
        return this.a.saveLayerAlpha(f10, f11, f12, f13, i9, i10);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.clipOutRect(rectF);
        }
        return false;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        return false;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        this.a.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i9) {
        this.a.drawColor(i9);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.a.quickReject(path);
        }
        return false;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        return false;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        this.a.drawBitmap(bitmap, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i9, PorterDuff.Mode mode) {
        this.a.drawColor(i9, mode);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.clipOutRect(rect);
        }
        return false;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        return false;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawColor(j10);
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return this.a.quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return this.a.quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        return this.a.quickReject(f10, f11, f12, f13, edgeType);
    }
}
