package a8;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class w0 {
    public static boolean a(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            float f7 = fArr[0];
            if (f7 == fArr[1] && f7 == fArr[2] && f7 == fArr[3] && f7 == fArr[4] && f7 == fArr[5] && f7 == fArr[6] && f7 == fArr[7]) {
                return true;
            }
        }
        return false;
    }
}
