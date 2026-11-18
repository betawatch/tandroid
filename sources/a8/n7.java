package a8;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class n7 {
    public static boolean a(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            float f10 = fArr[0];
            if (f10 == fArr[1] && f10 == fArr[2] && f10 == fArr[3] && f10 == fArr[4] && f10 == fArr[5] && f10 == fArr[6] && f10 == fArr[7]) {
                return true;
            }
        }
        return false;
    }
}
