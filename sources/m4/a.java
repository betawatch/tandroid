package m4;

import java.util.List;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public abstract class a {
    public static final /* synthetic */ int a = 0;

    static {
        e2.d0.J(0);
        e2.d0.J(1);
        e2.d0.J(2);
        e2.d0.J(3);
        e2.d0.J(4);
        e2.d0.J(5);
        e2.d0.J(6);
        e2.d0.J(7);
        e2.d0.J(8);
    }

    public static e9.a1 a(List list) {
        if (list.isEmpty()) {
            e9.g0 g0Var = e9.i0.b;
            return e9.a1.e;
        }
        if (list.size() > 0) {
            list.get(0).getClass();
            throw new ClassCastException();
        }
        e9.f0 u10 = e9.i0.u();
        if (list.size() <= 0) {
            return u10.i();
        }
        list.get(0).getClass();
        throw new ClassCastException();
    }
}
