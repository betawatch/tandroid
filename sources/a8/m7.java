package a8;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
