// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class fsc {
    public static np3 a;
    public static final int[] b = new int[nm7.M1];

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
