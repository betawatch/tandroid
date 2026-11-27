// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class ixe {
    public static final ge9 a(Throwable th) {
        th.getClass();
        return new ge9(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof ge9) {
            throw ((ge9) obj).a;
        }
    }
}
