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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class oc0 extends Canvas {
    public Canvas a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.clipOutPath(path);
        }
        return false;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f7, float f10, float f11, float f12) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.clipOutRect(f7, f10, f11, f12);
        }
        return false;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        return this.a.clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f7, float f10, float f11, float f12) {
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
    public final void drawARGB(int i10, int i11, int i12, int i13) {
        this.a.drawARGB(i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f7, float f10, boolean z10, Paint paint) {
        this.a.drawArc(rectF, f7, f10, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        this.a.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        this.a.drawBitmapMesh(bitmap, i10, i11, fArr, i12, iArr, i13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f7, float f10, float f11, Paint paint) {
        this.a.drawCircle(f7, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j3, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawColor(j3, blendMode);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        this.a.drawGlyphs(iArr, i10, fArr, i11, i12, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f7, float f10, float f11, float f12, Paint paint) {
        this.a.drawLine(f7, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        this.a.drawLines(fArr, i10, i11, paint);
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
    public final void drawPoint(float f7, float f10, Paint paint) {
        this.a.drawPoint(f7, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        this.a.drawPoints(fArr, i10, i11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        this.a.drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i10, int i11, int i12) {
        this.a.drawRGB(i10, i11, i12);
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
    public final void drawRoundRect(RectF rectF, float f7, float f10, Paint paint) {
        this.a.drawRoundRect(rectF, f7, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f7, float f10, Paint paint) {
        this.a.drawText(str, f7, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f7, float f10, Paint paint) {
        this.a.drawTextOnPath(cArr, i10, i11, path, f7, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f7, float f10, boolean z10, Paint paint) {
        this.a.drawTextRun(cArr, i10, i11, i12, i13, f7, f10, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        this.a.drawVertices(vertexMode, i10, fArr, i11, fArr2, i12, iArr, i13, sArr, i14, i15, paint);
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
    public final boolean quickReject(float f7, float f10, float f11, float f12) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.a.quickReject(f7, f10, f11, f12);
        }
        return false;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        this.a.restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i10) {
        this.a.restoreToCount(i10);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f7) {
        this.a.rotate(f7);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return this.a.save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f7, float f10, float f11, float f12, Paint paint) {
        return this.a.saveLayer(f7, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10, int i11) {
        return this.a.saveLayerAlpha(rectF, i10, i11);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f7, float f10) {
        this.a.scale(f7, f10);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        this.a.setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i10) {
        this.a.setDensity(i10);
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
    public final void skew(float f7, float f10) {
        this.a.skew(f7, f10);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f7, float f10) {
        this.a.translate(f7, f10);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        return this.a.clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f7, float f10, float f11, float f12, Region.Op op) {
        return false;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f7, float f10, float f11, float f12, float f13, float f14, boolean z10, Paint paint) {
        this.a.drawArc(f7, f10, f11, f12, f13, f14, z10, paint);
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
    public final void drawOval(float f7, float f10, float f11, float f12, Paint paint) {
        this.a.drawOval(f7, f10, f11, f12, paint);
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
    public final void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        this.a.drawPosText(cArr, i10, i11, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        this.a.drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f7, float f10, float f11, float f12, float f13, float f14, Paint paint) {
        this.a.drawRoundRect(f7, f10, f11, f12, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i10, int i11, float f7, float f10, Paint paint) {
        this.a.drawText(str, i10, i11, f7, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f7, float f10, Paint paint) {
        this.a.drawTextOnPath(str, path, f7, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f7, float f10, boolean z10, Paint paint) {
        this.a.drawTextRun(measuredText, i10, i11, i12, i13, f7, f10, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        return this.a.saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f7, float f10, float f11, float f12, int i10) {
        return this.a.saveLayerAlpha(f7, f10, f11, f12, i10);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i10, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.clipOutRect(i10, i11, i12, i13);
        }
        return false;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, float f7, float f10, int i12, int i13, boolean z10, Paint paint) {
        this.a.drawBitmap(iArr, i10, i11, f7, f10, i12, i13, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawColor(i10, blendMode);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f7, float f10, RectF rectF2, float f11, float f12, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawDoubleRoundRect(rectF, f7, f10, rectF2, f11, f12, paint);
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
    public final void drawRect(float f7, float f10, float f11, float f12, Paint paint) {
        this.a.drawRect(f7, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i10, int i11, float f7, float f10, Paint paint) {
        this.a.drawText(cArr, i10, i11, f7, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f7, float f10, boolean z10, Paint paint) {
        this.a.drawTextRun(charSequence, i10, i11, i12, i13, f7, f10, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.a.quickReject(rectF);
        }
        return false;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f7, float f10, float f11, float f12, Paint paint, int i10) {
        return this.a.saveLayer(f7, f10, f11, f12, paint, i10);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10) {
        return this.a.saveLayerAlpha(rectF, i10);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        return false;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, Paint paint) {
        this.a.drawBitmap(iArr, i10, i11, i12, i13, i14, i15, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i10, int i11, float f7, float f10, Paint paint) {
        this.a.drawText(charSequence, i10, i11, f7, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i10) {
        return this.a.saveLayer(rectF, paint, i10);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f7, float f10, float f11, float f12, int i10, int i11) {
        return this.a.saveLayerAlpha(f7, f10, f11, f12, i10, i11);
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
    public final void drawColor(int i10) {
        this.a.drawColor(i10);
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
    public final void drawBitmap(Bitmap bitmap, float f7, float f10, Paint paint) {
        this.a.drawBitmap(bitmap, f7, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, PorterDuff.Mode mode) {
        this.a.drawColor(i10, mode);
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
    public final void drawColor(long j3) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.drawColor(j3);
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
    public final boolean quickReject(float f7, float f10, float f11, float f12, Canvas.EdgeType edgeType) {
        return this.a.quickReject(f7, f10, f11, f12, edgeType);
    }
}
