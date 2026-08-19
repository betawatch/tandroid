package org.telegram.ui.Components.Paint;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes5.dex */
public abstract class Render {
    public static RectF RenderPath(Path path, RenderState renderState, boolean z) {
        renderState.baseWeight = path.getBaseWeight();
        renderState.spacing = path.getBrush().getSpacing();
        renderState.alpha = z ? 1.0f : path.getBrush().getAlpha();
        renderState.angle = path.getBrush().getAngle();
        renderState.scale = path.getBrush().getScale();
        int length = path.getLength();
        if (length == 0) {
            return null;
        }
        int i = 0;
        if (length == 1) {
            PaintStamp(path.getPoints()[0], renderState);
        } else {
            Point[] points = path.getPoints();
            renderState.prepare();
            while (i < points.length - 1) {
                Point point = points[i];
                i++;
                PaintSegment(point, points[i], renderState);
            }
        }
        path.remainder = renderState.remainder;
        return Draw(renderState);
    }

    private static void PaintSegment(Point point, Point point2, RenderState renderState) {
        float f;
        RenderState renderState2 = renderState;
        double distanceTo = point.getDistanceTo(point2);
        Point substract = point2.substract(point);
        Point point3 = new Point(1.0d, 1.0d, 0.0d);
        float atan2 = Math.abs(renderState2.angle) > 0.0f ? renderState2.angle : (float) Math.atan2(substract.y, substract.x);
        float f2 = (float) ((((renderState2.baseWeight * point2.z) * renderState2.scale) * 1.0d) / renderState2.viewportScale);
        double max = Math.max(1.0f, renderState2.spacing * f2);
        if (distanceTo > 0.0d) {
            point3 = substract.multiplyByScalar(1.0d / distanceTo);
        }
        float min = Math.min(1.0f, renderState2.alpha * 1.15f);
        boolean z = point.edge;
        boolean z2 = point2.edge;
        int ceil = (int) Math.ceil((distanceTo - renderState2.remainder) / max);
        int count = renderState2.getCount();
        renderState2.appendValuesCount(ceil);
        renderState2.setPosition(count);
        Point add = point.add(point3.multiplyByScalar(renderState2.remainder));
        double d = renderState2.remainder;
        boolean z3 = true;
        while (true) {
            if (d > distanceTo) {
                f = atan2;
                break;
            }
            z3 = renderState2.addPoint(add.toPointF(), f2, atan2, z ? min : renderState2.alpha, -1);
            f = atan2;
            if (!z3) {
                break;
            }
            add = add.add(point3.multiplyByScalar(max));
            d += max;
            atan2 = f;
            z = false;
        }
        if (z3 && z2) {
            renderState2.appendValuesCount(1);
            renderState2.addPoint(point2.toPointF(), f2, f, min, -1);
            renderState2 = renderState2;
        }
        renderState2.remainder = d - distanceTo;
    }

    private static void PaintStamp(Point point, RenderState renderState) {
        float f = ((renderState.baseWeight * renderState.scale) * 1.0f) / renderState.viewportScale;
        PointF pointF = point.toPointF();
        float f2 = Math.abs(renderState.angle) > 0.0f ? renderState.angle : 0.0f;
        float f3 = renderState.alpha;
        renderState.prepare();
        renderState.appendValuesCount(1);
        renderState.addPoint(pointF, f, f2, f3, 0);
    }

    private static RectF Draw(RenderState renderState) {
        float f;
        RectF rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        int count = renderState.getCount();
        if (count <= 0) {
            return rectF;
        }
        int i = count - 1;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((count * 4) + (i * 2)) * 20);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.position(0);
        renderState.setPosition(0);
        int i2 = 0;
        int i3 = 0;
        while (i2 < count) {
            float read = renderState.read();
            float read2 = renderState.read();
            float read3 = renderState.read();
            float read4 = renderState.read();
            float read5 = renderState.read();
            RectF rectF2 = new RectF(read - read3, read2 - read3, read + read3, read2 + read3);
            float f2 = rectF2.left;
            float f3 = rectF2.top;
            float f4 = rectF2.right;
            float f5 = rectF2.bottom;
            float[] fArr = {f2, f3, f4, f3, f2, f5, f4, f5};
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            Matrix matrix = new Matrix();
            int i4 = count;
            matrix.setRotate((float) Math.toDegrees(read4), centerX, centerY);
            matrix.mapPoints(fArr);
            matrix.mapRect(rectF2);
            Utils.RectFIntegral(rectF2);
            rectF.union(rectF2);
            if (i3 != 0) {
                asFloatBuffer.put(fArr[0]);
                asFloatBuffer.put(fArr[1]);
                f = 0.0f;
                asFloatBuffer.put(0.0f);
                asFloatBuffer.put(0.0f);
                asFloatBuffer.put(read5);
                i3++;
            } else {
                f = 0.0f;
            }
            asFloatBuffer.put(fArr[0]);
            asFloatBuffer.put(fArr[1]);
            asFloatBuffer.put(f);
            asFloatBuffer.put(f);
            asFloatBuffer.put(read5);
            asFloatBuffer.put(fArr[2]);
            asFloatBuffer.put(fArr[3]);
            asFloatBuffer.put(1.0f);
            asFloatBuffer.put(f);
            asFloatBuffer.put(read5);
            asFloatBuffer.put(fArr[4]);
            asFloatBuffer.put(fArr[5]);
            asFloatBuffer.put(f);
            asFloatBuffer.put(1.0f);
            asFloatBuffer.put(read5);
            asFloatBuffer.put(fArr[6]);
            asFloatBuffer.put(fArr[7]);
            asFloatBuffer.put(1.0f);
            asFloatBuffer.put(1.0f);
            asFloatBuffer.put(read5);
            int i5 = i3 + 4;
            if (i2 != i) {
                asFloatBuffer.put(fArr[6]);
                asFloatBuffer.put(fArr[7]);
                asFloatBuffer.put(1.0f);
                asFloatBuffer.put(1.0f);
                asFloatBuffer.put(read5);
                i3 += 5;
            } else {
                i3 = i5;
            }
            i2++;
            count = i4;
        }
        asFloatBuffer.position(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 20, (Buffer) asFloatBuffer.slice());
        GLES20.glEnableVertexAttribArray(0);
        asFloatBuffer.position(2);
        GLES20.glVertexAttribPointer(1, 2, 5126, true, 20, (Buffer) asFloatBuffer.slice());
        GLES20.glEnableVertexAttribArray(1);
        asFloatBuffer.position(4);
        GLES20.glVertexAttribPointer(2, 1, 5126, true, 20, (Buffer) asFloatBuffer.slice());
        GLES20.glEnableVertexAttribArray(2);
        GLES20.glDrawArrays(5, 0, i3);
        return rectF;
    }
}
