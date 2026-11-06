package a8;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class m7 {
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
