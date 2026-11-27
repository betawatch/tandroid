// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class iv6 {
    public final Object a;
    public final byte b;

    public iv6(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = (byte) 1;
        } else if (obj instanceof jw6) {
            this.b = (byte) 2;
        } else {
            iy8.d();
            throw null;
        }
    }
}
