// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class j9a implements ku4 {
    public static final j9a a;
    private static final o8a descriptor;

    static {
        j9a j9aVar = new j9a();
        a = j9aVar;
        ug8 ug8Var = new ug8("com.google.firebase.sessions.settings.SessionConfigs", j9aVar, 5);
        ug8Var.j("sessionsEnabled", false);
        ug8Var.j("sessionSamplingRate", false);
        ug8Var.j("sessionTimeoutSeconds", false);
        ug8Var.j("cacheDurationSeconds", false);
        ug8Var.j("cacheUpdatedTimeSeconds", false);
        descriptor = ug8Var;
    }

    @Override // ku4
    public final hx5[] a() {
        hx5 a2 = lud.a(hm0.a);
        hx5 a3 = lud.a(vp3.a);
        jr5 jr5Var = jr5.a;
        return new hx5[]{a2, a3, lud.a(jr5Var), lud.a(jr5Var), lud.a(yh6.a)};
    }

    @Override // hx5
    public final void b(d30 d30Var, Object obj) {
        l9a l9aVar = (l9a) obj;
        l9aVar.getClass();
        o8a o8aVar = descriptor;
        d30 a2 = d30Var.a(o8aVar);
        a2.h(o8aVar, 0, hm0.a, l9aVar.a);
        a2.h(o8aVar, 1, vp3.a, l9aVar.b);
        jr5 jr5Var = jr5.a;
        a2.h(o8aVar, 2, jr5Var, l9aVar.c);
        a2.h(o8aVar, 3, jr5Var, l9aVar.d);
        a2.h(o8aVar, 4, yh6.a, l9aVar.e);
        a2.l(o8aVar);
    }

    @Override // hx5
    public final Object c(ykf ykfVar) {
        o8a o8aVar = descriptor;
        ykf a2 = ykfVar.a(o8aVar);
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        boolean z = true;
        while (z) {
            int b = a2.b(o8aVar);
            if (b == -1) {
                z = false;
            } else if (b == 0) {
                bool = (Boolean) a2.j(o8aVar, 0, hm0.a, bool);
                i |= 1;
            } else if (b == 1) {
                d = (Double) a2.j(o8aVar, 1, vp3.a, d);
                i |= 2;
            } else if (b == 2) {
                num = (Integer) a2.j(o8aVar, 2, jr5.a, num);
                i |= 4;
            } else if (b == 3) {
                num2 = (Integer) a2.j(o8aVar, 3, jr5.a, num2);
                i |= 8;
            } else {
                if (b != 4) {
                    throw new yw5(b);
                }
                l = (Long) a2.j(o8aVar, 4, yh6.a, l);
                i |= 16;
            }
        }
        a2.o(o8aVar);
        return new l9a(i, bool, d, num, num2, l);
    }

    @Override // hx5
    public final o8a d() {
        return descriptor;
    }
}
