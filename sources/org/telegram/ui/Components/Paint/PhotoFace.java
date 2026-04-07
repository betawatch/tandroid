package org.telegram.ui.Components.Paint;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import org.telegram.ui.Components.Size;

/* loaded from: classes5.dex */
public class PhotoFace {
    private float angle;
    private PointF chinPoint;
    private PointF eyesCenterPoint;
    private float eyesDistance;
    private PointF foreheadPoint;
    private PointF mouthPoint;
    private float width;

    public PhotoFace(Face face, Bitmap bitmap, Size size, boolean z) {
        PointF pointF = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        for (Landmark landmark : face.getLandmarks()) {
            PointF position = landmark.getPosition();
            int type = landmark.getType();
            if (type == 4) {
                pointF = transposePoint(position, bitmap, size, z);
            } else if (type == 5) {
                pointF3 = transposePoint(position, bitmap, size, z);
            } else if (type == 10) {
                pointF2 = transposePoint(position, bitmap, size, z);
            } else if (type == 11) {
                pointF4 = transposePoint(position, bitmap, size, z);
            }
        }
        if (pointF != null && pointF2 != null) {
            if (pointF.x >= pointF2.x) {
                PointF pointF5 = pointF2;
                pointF2 = pointF;
                pointF = pointF5;
            }
            this.eyesCenterPoint = new PointF((pointF2.x * 0.5f) + (pointF.x * 0.5f), (pointF2.y * 0.5f) + (pointF.y * 0.5f));
            this.eyesDistance = (float) Math.hypot(pointF.x - pointF2.x, pointF.y - pointF2.y);
            this.angle = (float) Math.toDegrees(Math.atan2(pointF.y - pointF2.y, pointF.x - pointF2.x) + 3.141592653589793d);
            float f = this.eyesDistance;
            this.width = 2.35f * f;
            float f2 = f * 0.8f;
            double radians = (float) Math.toRadians(r12 - 90.0f);
            this.foreheadPoint = new PointF(this.eyesCenterPoint.x + (((float) Math.cos(radians)) * f2), this.eyesCenterPoint.y + (f2 * ((float) Math.sin(radians))));
        }
        if (pointF3 == null || pointF4 == null) {
            return;
        }
        if (pointF3.x < pointF4.x) {
            PointF pointF6 = pointF4;
            pointF4 = pointF3;
            pointF3 = pointF6;
        }
        this.mouthPoint = new PointF((pointF3.x * 0.5f) + (pointF4.x * 0.5f), (pointF3.y * 0.5f) + (pointF4.y * 0.5f));
        float f3 = this.eyesDistance * 0.7f;
        double radians2 = (float) Math.toRadians(this.angle + 90.0f);
        this.chinPoint = new PointF(this.mouthPoint.x + (((float) Math.cos(radians2)) * f3), this.mouthPoint.y + (f3 * ((float) Math.sin(radians2))));
    }

    public boolean isSufficient() {
        return this.eyesCenterPoint != null;
    }

    private PointF transposePoint(PointF pointF, Bitmap bitmap, Size size, boolean z) {
        return new PointF((size.width * pointF.x) / (z ? bitmap.getHeight() : bitmap.getWidth()), (size.height * pointF.y) / (z ? bitmap.getWidth() : bitmap.getHeight()));
    }

    public PointF getPointForAnchor(int i) {
        if (i == 0) {
            return this.foreheadPoint;
        }
        if (i == 1) {
            return this.eyesCenterPoint;
        }
        if (i == 2) {
            return this.mouthPoint;
        }
        if (i != 3) {
            return null;
        }
        return this.chinPoint;
    }

    public float getWidthForAnchor(int i) {
        if (i == 1) {
            return this.eyesDistance;
        }
        return this.width;
    }

    public float getAngle() {
        return this.angle;
    }
}
