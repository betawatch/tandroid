// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
