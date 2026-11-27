// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class cz4 {
    public static final cz4 b = new cz4(-1);
    public final int a;

    public cz4(int i) {
        if (i == -1 || i > 0) {
            this.a = i;
        } else {
            lq5.j("height must be positive or -1");
            throw null;
        }
    }
}
