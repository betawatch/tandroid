// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class dqc {
    public static do3 a;
    public static final int[] b = new int[kk7.M1];

    static {
        int i = 0;
        while (true) {
            int[] iArr = b;
            if (i >= 129) {
                return;
            }
            iArr[i] = (int) (Math.max(0.0d, Math.min(1.0d, 7.5d - Math.sqrt(i))) * 255.0d);
            i++;
        }
    }
}
