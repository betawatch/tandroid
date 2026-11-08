package gg;

import android.graphics.Matrix;
import android.graphics.RectF;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
