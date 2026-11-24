// default package

import java.io.Serializable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class di1 implements zga, ed, n8c {
    public final /* synthetic */ zi1 a;

    public /* synthetic */ di1(zi1 zi1Var) {
        this.a = zi1Var;
    }

    @Override // zga
    public final int b() {
        return this.a.R0;
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        zi1 zi1Var = this.a;
        ei1 ei1Var = zi1Var.s1;
        int i = zi1Var.o0;
        long j = zi1Var.p0;
        int i2 = ((c4c) obj).d;
        if (i2 != 1) {
            if (i2 == 4) {
                zi1Var.m0.presentFragment(new eg1(j));
            }
        } else {
            if (zi1Var.r0 >= na7.q1(i).k4.T1.f()) {
                zi1Var.j1 = !zi1Var.j1;
                gl.r(ei1Var);
                gl.d3(ei1Var, 1000L);
                zi1Var.X0.g3.O(true);
                return;
            }
            if (zi1Var.q0 != null) {
                h26 h26Var = new h26(30, zi1Var.o0, zi1Var.n0, zi1Var.getContext(), zi1Var.m0);
                h26Var.s1(j);
                h26Var.q1(zi1Var.q0, true);
                na7.q1(i).E0().b(j, zi1Var.q0, new x0(zi1Var, h26Var, (byte) 16));
            }
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        this.a.m0.presentFragment(new p3c(6, null));
    }
}
