// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class hse {
    public static boolean a(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            float f = fArr[0];
            if (f == fArr[1] && f == fArr[2] && f == fArr[3] && f == fArr[4] && f == fArr[5] && f == fArr[6] && f == fArr[7]) {
                return true;
            }
        }
        return false;
    }
}
