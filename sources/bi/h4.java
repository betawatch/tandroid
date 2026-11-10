package bi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.z91;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h4(di.u0 u0Var, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10) {
        this.a = 2;
        this.d = u0Var;
        this.b = j3;
        this.e = tL_textWithEntities;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.d;
                tc tcVar = new tc(k7Var.getContext(), k7Var.I0, this.b, 11, null, new w2(k7Var, new boolean[]{false}, this.c, (c20) this.e, 2), 0L);
                tcVar.setOnDismissListener(new j4(k7Var, 1));
                tcVar.show();
                return;
            case 1:
                wf.b bVar = (wf.b) this.d;
                String str = (String) this.e;
                long j3 = this.b;
                long j10 = this.c;
                d3.h0 h0Var = (d3.h0) bVar.c;
                String str2 = h2.m0.a;
                m2.e eVar = ((l2.c0) h0Var).a.s;
                m2.a U = eVar.U();
                eVar.V(U, 1016, new m2.c(U, str, j10, j3, 13));
                return;
            case 2:
                ((di.u0) this.d).n(this.b, (TLRPC.TL_textWithEntities) this.e, this.c);
                return;
            case 3:
                j2.n nVar = (j2.n) this.d;
                String str3 = (String) this.e;
                long j11 = this.b;
                long j12 = this.c;
                n2.s sVar = (n2.s) nVar.c;
                String str4 = h2.m0.a;
                m2.e eVar2 = ((l2.c0) sVar).a.s;
                m2.a U2 = eVar2.U();
                eVar2.V(U2, 1008, new m2.c(U2, str3, j12, j11, 1));
                return;
            case 4:
                ((GroupCallMessagesController) this.d).lambda$processUpdate$3(this.b, this.c, (byte[]) this.e);
                return;
            case 5:
                ((xn) this.d).e(this.b, this.c, (HashSet) this.e);
                return;
            case 6:
                zw zwVar = (zw) this.d;
                long j13 = this.b;
                long j14 = this.c;
                z91 z91Var = (z91) this.e;
                if (zwVar.D2 == null) {
                    zwVar.finishFragment();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(xr.a(j13, j14));
                zwVar.D2.y(zwVar, arrayList, null, false, zwVar.K2, zwVar.L2, zwVar.M2, z91Var);
                if (zwVar.j2) {
                    zwVar.D2 = null;
                    return;
                }
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j15 = this.b;
                long j16 = this.c;
                cn cnVar = (cn) this.e;
                String str5 = LaunchActivity.B1;
                TLRPC.TL_forumTopic f10 = qp.s1(launchActivity.O).q7.f(j15, j16);
                StringBuilder t6 = a8.p0.t(j15, "LaunchActivity openForum after load ", " ");
                t6.append(j16);
                t6.append(" TL_forumTopic ");
                t6.append(f10);
                org.telegram.messenger.a8.b(t6.toString());
                if (launchActivity.o0 != null) {
                    qg.d.a(cnVar, xr.a(-j15, j16));
                    ((ActionBarLayout) launchActivity.M()).S(cnVar);
                    return;
                }
                return;
            default:
                wi.t0 t0Var = (wi.t0) this.d;
                wi.p0 p0Var = (wi.p0) this.e;
                long j17 = this.b;
                long j18 = this.c;
                synchronized (t0Var.g) {
                    if (!p0Var.d && !p0Var.e) {
                        ((hy0) t0Var.e).a(p0Var.a, p0Var.b, j17, j18);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ h4(Object obj, long j3, long j10, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.c = j10;
        this.e = obj2;
    }

    public /* synthetic */ h4(Object obj, Object obj2, long j3, long j10, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = j3;
        this.c = j10;
    }
}
