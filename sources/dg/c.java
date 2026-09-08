package dg;

import android.graphics.Matrix;
import android.graphics.RectF;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c {
    public final RectF a;
    public final Matrix b;

    public c(RectF rectF, Matrix matrix) {
        this.a = rectF;
        this.b = matrix;
    }

    public static c a(SerializedData serializedData) {
        float readFloat = serializedData.readFloat(true);
        float readFloat2 = serializedData.readFloat(true);
        float readFloat3 = serializedData.readFloat(true);
        float readFloat4 = serializedData.readFloat(true);
        float[] fArr = {serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true)};
        RectF rectF = new RectF(readFloat, readFloat2, readFloat3 + readFloat, readFloat4 + readFloat2);
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return new c(rectF, matrix);
    }
}
