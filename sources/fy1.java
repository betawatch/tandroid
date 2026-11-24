// default package

import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fy1 extends i98 {
    public boolean a;
    public final /* synthetic */ jm6 b;
    public final /* synthetic */ File c;
    public final /* synthetic */ gy1 d;

    public fy1(gy1 gy1Var, jm6 jm6Var, File file) {
        this.d = gy1Var;
        this.b = jm6Var;
        this.c = file;
    }

    @Override // i98, o98
    public final void F() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // i98, o98
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        k27 threadMessage;
        String str;
        mu1 mu1Var;
        ChatActivityEnterView chatActivityEnterView = this.d.f2;
        bu1 bu1Var = chatActivityEnterView.L3;
        if (bu1Var != null && (mu1Var = chatActivityEnterView.F3) != null && bu1Var.f) {
            mu1Var.ic();
            return;
        }
        ArrayList arrayList = new ArrayList();
        y3a y3aVar = new y3a();
        jm6 jm6Var = this.b;
        if (jm6Var.b || (str = jm6Var.h) == null) {
            String str2 = jm6Var.I;
            if (str2 != null) {
                y3aVar.c = str2;
            }
        } else {
            y3aVar.c = str;
        }
        y3aVar.e = jm6Var.c;
        y3aVar.p = jm6Var.d();
        y3aVar.o = jm6Var.b;
        y3aVar.q = jm6Var.j();
        y3aVar.z = jm6Var.m;
        y3aVar.A = jm6Var.P;
        CharSequence charSequence = jm6Var.a;
        y3aVar.d = charSequence != null ? charSequence.toString() : null;
        y3aVar.i = jm6Var.n;
        y3aVar.j = jm6Var.r;
        y3aVar.h = jm6Var.x;
        y3aVar.k = oacVar;
        y3aVar.r = true;
        arrayList.add(y3aVar);
        jm6Var.e();
        this.a = true;
        boolean h = z3a.h(y3aVar.d);
        j5 j5Var = chatActivityEnterView.S;
        u47 u47Var = null;
        long j = chatActivityEnterView.G3;
        k27 k27Var = chatActivityEnterView.J3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        bu1 bu1Var2 = chatActivityEnterView.L3;
        k27 k27Var2 = chatActivityEnterView.P2;
        mu1 mu1Var2 = chatActivityEnterView.F3;
        j1a Q6 = mu1Var2 != null ? mu1Var2.Q6() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        mu1 mu1Var3 = chatActivityEnterView.F3;
        if (mu1Var3 != null) {
            u47Var = mu1Var3.y5;
        }
        z3a.W(j5Var, arrayList, j, k27Var, threadMessage, null, bu1Var2, false, false, k27Var2, null, z, i2, i3, h, null, Q6, 0L, false, 0L, sendMonoForumPeerId, u47Var, null, false);
        hy1 hy1Var = chatActivityEnterView.P3;
        if (hy1Var != null) {
            hy1Var.u(null, true, i2, i3, 0L);
        }
    }

    @Override // i98, o98
    public final boolean h() {
        return false;
    }
}
