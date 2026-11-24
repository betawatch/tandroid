// default package

import java.io.IOException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class n53 implements h86 {
    public final /* synthetic */ q53 a;

    public /* synthetic */ n53(q53 q53Var) {
        this.a = q53Var;
    }

    @Override // h86
    public final void U(k86 k86Var, long j, long j2) {
        cv7 cv7Var = (cv7) k86Var;
        q53 q53Var = this.a;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        q53Var.n.getClass();
        q53Var.r.p(f86Var, cv7Var.c);
        q53Var.N = ((Long) cv7Var.f).longValue() - j;
        q53Var.z(true);
    }

    public final void a() {
        long j;
        q53 q53Var = this.a;
        synchronized (ycd.b) {
            j = ycd.c ? ycd.d : -9223372036854775807L;
        }
        q53Var.N = j;
        q53Var.z(true);
    }

    @Override // h86
    public final void v(k86 k86Var, long j, long j2, boolean z) {
        this.a.x((cv7) k86Var, j, j2);
    }

    @Override // h86
    public final i86 w1(k86 k86Var, long j, long j2, IOException iOException, int i) {
        cv7 cv7Var = (cv7) k86Var;
        q53 q53Var = this.a;
        kp kpVar = q53Var.r;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        kpVar.s(new f86(e86Var), cv7Var.c, iOException, true);
        q53Var.n.getClass();
        q53Var.y(iOException);
        return mv6.y;
    }

    @Override // h86
    public final void C0(k86 k86Var, long j, long j2, int i) {
    }
}
