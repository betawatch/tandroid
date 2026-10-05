package mi;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class g {
    public static final g b = new g(-1);
    public final int a;

    public g(int i10) {
        if (i10 != -1 && i10 <= 0) {
            throw new IllegalArgumentException("height must be positive or -1");
        }
        this.a = i10;
    }
}
