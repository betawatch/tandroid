// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
