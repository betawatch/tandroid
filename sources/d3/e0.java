package d3;

import a8.p0;
import di.c6;
import di.cb;
import di.f2;
import di.k3;
import fi.u0;
import h2.l0;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.u91;
import org.telegram.ui.yw;
import zi.r0;
import zi.v0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e0(u0 u0Var, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10) {
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
                wf.b bVar = (wf.b) this.d;
                String str = (String) this.e;
                long j3 = this.b;
                long j10 = this.c;
                h0 h0Var = (h0) bVar.c;
                String str2 = l0.a;
                m2.e eVar = ((l2.z) h0Var).a.s;
                m2.a U = eVar.U();
                eVar.V(U, 1016, new li.p(U, str, j10, j3, 19));
                return;
            case 1:
                c6 c6Var = (c6) this.d;
                cb cbVar = new cb(c6Var.getContext(), c6Var.J0, this.b, 11, null, new f2(c6Var, new boolean[]{false}, this.c, (z10) this.e, 2), 0L);
                cbVar.setOnDismissListener(new k3(c6Var, 1));
                cbVar.show();
                return;
            case 2:
                ((u0) this.d).n(this.b, (TLRPC.TL_textWithEntities) this.e, this.c);
                return;
            case 3:
                k8.a aVar = (k8.a) this.d;
                String str3 = (String) this.e;
                long j11 = this.b;
                long j12 = this.c;
                n2.s sVar = (n2.s) aVar.c;
                String str4 = l0.a;
                m2.e eVar2 = ((l2.z) sVar).a.s;
                m2.a U2 = eVar2.U();
                eVar2.V(U2, 1008, new li.p(U2, str3, j12, j11, 7));
                return;
            case 4:
                ((GroupCallMessagesController) this.d).lambda$processUpdate$3(this.b, this.c, (byte[]) this.e);
                return;
            case 5:
                ((io) this.d).e(this.b, this.c, (HashSet) this.e);
                return;
            case 6:
                yw ywVar = (yw) this.d;
                long j13 = this.b;
                long j14 = this.c;
                u91 u91Var = (u91) this.e;
                if (ywVar.E2 == null) {
                    ywVar.finishFragment();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ur.a(j13, j14));
                ywVar.E2.y(ywVar, arrayList, null, false, ywVar.L2, ywVar.M2, ywVar.N2, u91Var);
                if (ywVar.k2) {
                    ywVar.E2 = null;
                    return;
                }
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j15 = this.b;
                long j16 = this.c;
                an anVar = (an) this.e;
                String str5 = LaunchActivity.C1;
                TLRPC.TL_forumTopic f10 = np.s1(launchActivity.P).r7.f(j15, j16);
                StringBuilder t6 = p0.t(j15, "LaunchActivity openForum after load ", " ");
                t6.append(j16);
                t6.append(" TL_forumTopic ");
                t6.append(f10);
                a8.b(t6.toString());
                if (launchActivity.p0 != null) {
                    qg.c.a(anVar, ur.a(-j15, j16));
                    ((ActionBarLayout) launchActivity.M()).S(anVar);
                    return;
                }
                return;
            default:
                v0 v0Var = (v0) this.d;
                r0 r0Var = (r0) this.e;
                long j17 = this.b;
                long j18 = this.c;
                synchronized (v0Var.g) {
                    if (!r0Var.d && !r0Var.e) {
                        ((jy0) v0Var.e).a(r0Var.a, r0Var.b, j17, j18);
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
