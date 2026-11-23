package d3;

import a8.p0;
import di.f6;
import di.fb;
import di.j2;
import di.n3;
import fi.t0;
import h2.l0;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.np;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.sy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.y91;
import zi.q0;
import zi.u0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e0(t0 t0Var, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10) {
        this.a = 2;
        this.d = t0Var;
        this.b = j3;
        this.e = tL_textWithEntities;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wf.b bVar = (wf.b) this.d;
                String str = (String) this.e;
                long j3 = this.b;
                long j10 = this.c;
                h0 h0Var = (h0) bVar.c;
                String str2 = l0.a;
                m2.d dVar = ((l2.z) h0Var).a.s;
                m2.a U = dVar.U();
                dVar.V(U, 1016, new li.c(U, str, j10, j3, 20));
                return;
            case 1:
                f6 f6Var = (f6) this.d;
                fb fbVar = new fb(f6Var.getContext(), f6Var.J0, this.b, 11, null, new j2(f6Var, new boolean[]{false}, this.c, (y10) this.e, 2), 0L);
                fbVar.setOnDismissListener(new n3(f6Var, 1));
                fbVar.show();
                return;
            case 2:
                ((t0) this.d).n(this.b, (TLRPC.TL_textWithEntities) this.e, this.c);
                return;
            case 3:
                k8.a aVar = (k8.a) this.d;
                String str3 = (String) this.e;
                long j11 = this.b;
                long j12 = this.c;
                n2.s sVar = (n2.s) aVar.c;
                String str4 = l0.a;
                m2.d dVar2 = ((l2.z) sVar).a.s;
                m2.a U2 = dVar2.U();
                dVar2.V(U2, 1008, new li.c(U2, str3, j12, j11, 8));
                return;
            case 4:
                ((GroupCallMessagesController) this.d).lambda$processUpdate$3(this.b, this.c, (byte[]) this.e);
                return;
            case 5:
                ((ro) this.d).e(this.b, this.c, (HashSet) this.e);
                return;
            case 6:
                cx cxVar = (cx) this.d;
                long j13 = this.b;
                long j14 = this.c;
                y91 y91Var = (y91) this.e;
                if (cxVar.E2 == null) {
                    cxVar.finishFragment();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(tr.a(j13, j14));
                cxVar.E2.y(cxVar, arrayList, null, false, cxVar.L2, cxVar.M2, cxVar.N2, y91Var);
                if (cxVar.k2) {
                    cxVar.E2 = null;
                    return;
                }
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j15 = this.b;
                long j16 = this.c;
                bn bnVar = (bn) this.e;
                String str5 = LaunchActivity.C1;
                TLRPC.TL_forumTopic f10 = np.u1(launchActivity.P).t7.f(j15, j16);
                StringBuilder t6 = p0.t(j15, "LaunchActivity openForum after load ", " ");
                t6.append(j16);
                t6.append(" TL_forumTopic ");
                t6.append(f10);
                a8.b(t6.toString());
                if (launchActivity.p0 != null) {
                    qg.c.a(bnVar, tr.a(-j15, j16));
                    ((ActionBarLayout) launchActivity.M()).S(bnVar);
                    return;
                }
                return;
            default:
                u0 u0Var = (u0) this.d;
                q0 q0Var = (q0) this.e;
                long j17 = this.b;
                long j18 = this.c;
                synchronized (u0Var.g) {
                    if (!q0Var.d && !q0Var.e) {
                        ((sy0) u0Var.e).a(q0Var.a, q0Var.b, j17, j18);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ e0(Object obj, long j3, long j10, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.c = j10;
        this.e = obj2;
    }

    public /* synthetic */ e0(Object obj, Object obj2, long j3, long j10, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = j3;
        this.c = j10;
    }
}
