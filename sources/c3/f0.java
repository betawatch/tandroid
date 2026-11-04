package c3;

import ci.l2;
import ci.l6;
import ci.mb;
import ci.t3;
import ei.w0;
import g2.n0;
import ii.y3;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.hp;
import org.telegram.messenger.pr;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m91;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import wi.p0;
import wi.t0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f0(w0 w0Var, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11) {
        this.a = 2;
        this.d = w0Var;
        this.b = j10;
        this.e = tL_textWithEntities;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tf.b bVar = (tf.b) this.d;
                String str = (String) this.e;
                long j10 = this.b;
                long j11 = this.c;
                i0 i0Var = (i0) bVar.b;
                String str2 = n0.a;
                l2.f fVar = ((k2.c0) i0Var).a.s;
                l2.a U = fVar.U();
                fVar.V(U, 1016, new l2.c(U, str, j11, j10));
                return;
            case 1:
                l6 l6Var = (l6) this.d;
                mb mbVar = new mb(l6Var.getContext(), l6Var.J0, this.b, 11, null, new l2(l6Var, new boolean[]{false}, this.c, (u10) this.e, 2), 0L);
                mbVar.setOnDismissListener(new t3(l6Var, 1));
                mbVar.show();
                return;
            case 2:
                ((w0) this.d).n(this.b, (TLRPC.TL_textWithEntities) this.e, this.c);
                return;
            case 3:
                m2.t tVar = (m2.t) this.d;
                String str3 = (String) this.e;
                long j12 = this.b;
                long j13 = this.c;
                m2.u uVar = (m2.u) tVar.c;
                String str4 = n0.a;
                l2.f fVar2 = ((k2.c0) uVar).a.s;
                l2.a U2 = fVar2.U();
                fVar2.V(U2, 1008, new y3(U2, str3, j13, j12));
                return;
            case 4:
                ((GroupCallMessagesController) this.d).lambda$processUpdate$3(this.b, this.c, (byte[]) this.e);
                return;
            case 5:
                ((xn) this.d).e(this.b, this.c, (HashSet) this.e);
                return;
            case 6:
                uw uwVar = (uw) this.d;
                long j14 = this.b;
                long j15 = this.c;
                m91 m91Var = (m91) this.e;
                if (uwVar.D2 == null) {
                    uwVar.finishFragment();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(pr.a(j14, j15));
                uwVar.D2.y(uwVar, arrayList, null, false, uwVar.K2, uwVar.L2, uwVar.M2, m91Var);
                if (uwVar.j2) {
                    uwVar.D2 = null;
                    return;
                }
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j16 = this.b;
                long j17 = this.c;
                wm wmVar = (wm) this.e;
                String str5 = LaunchActivity.E1;
                TLRPC.TL_forumTopic f10 = hp.s1(launchActivity.P).q7.f(j16, j17);
                StringBuilder t10 = a1.g.t(j16, "LaunchActivity openForum after load ", " ");
                t10.append(j17);
                t10.append(" TL_forumTopic ");
                t10.append(f10);
                a8.b(t10.toString());
                if (launchActivity.r0 != null) {
                    rg.c.a(wmVar, pr.a(-j16, j17));
                    ((ActionBarLayout) launchActivity.M()).S(wmVar);
                    return;
                }
                return;
            default:
                t0 t0Var = (t0) this.d;
                p0 p0Var = (p0) this.e;
                long j18 = this.b;
                long j19 = this.c;
                synchronized (t0Var.g) {
                    if (!p0Var.d && !p0Var.e) {
                        ((gy0) t0Var.e).a(p0Var.a, p0Var.b, j18, j19);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ f0(Object obj, long j10, long j11, Object obj2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = j10;
        this.c = j11;
        this.e = obj2;
    }

    public /* synthetic */ f0(Object obj, Object obj2, long j10, long j11, int i3) {
        this.a = i3;
        this.d = obj;
        this.e = obj2;
        this.b = j10;
        this.c = j11;
    }
}
