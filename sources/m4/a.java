package m4;

import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
