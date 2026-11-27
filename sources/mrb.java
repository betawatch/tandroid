// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class mrb implements ku4 {
    public static final mrb a;
    private static final o8a descriptor;

    static {
        mrb mrbVar = new mrb();
        a = mrbVar;
        ug8 ug8Var = new ug8("com.google.firebase.sessions.Time", mrbVar, 3);
        ug8Var.j("ms", false);
        ug8Var.j("us", true);
        ug8Var.j("seconds", true);
        descriptor = ug8Var;
    }

    @Override // ku4
    public final hx5[] a() {
        yh6 yh6Var = yh6.a;
        return new hx5[]{yh6Var, yh6Var, yh6Var};
    }

    @Override // hx5
    public final void b(d30 d30Var, Object obj) {
        orb orbVar = (orb) obj;
        orbVar.getClass();
        o8a o8aVar = descriptor;
        d30 a2 = d30Var.a(o8aVar);
        long j = orbVar.a;
        long j2 = orbVar.c;
        long j3 = orbVar.b;
        a2.f(o8aVar, 0, j);
        if (a2.p(o8aVar) || j3 != j * 1000) {
            a2.f(o8aVar, 1, j3);
        }
        if (a2.p(o8aVar) || j2 != j / 1000) {
            a2.f(o8aVar, 2, j2);
        }
        a2.l(o8aVar);
    }

    @Override // hx5
    public final Object c(ykf ykfVar) {
        o8a o8aVar = descriptor;
        ykf a2 = ykfVar.a(o8aVar);
        int i = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = true;
        while (z) {
            int b = a2.b(o8aVar);
            if (b == -1) {
                z = false;
            } else if (b == 0) {
                j = a2.h(o8aVar, 0);
                i |= 1;
            } else if (b == 1) {
                j2 = a2.h(o8aVar, 1);
                i |= 2;
            } else {
                if (b != 2) {
                    throw new yw5(b);
                }
                j3 = a2.h(o8aVar, 2);
                i |= 4;
            }
        }
        a2.o(o8aVar);
        return new orb(i, j, j2, j3);
    }

    @Override // hx5
    public final o8a d() {
        return descriptor;
    }
}
