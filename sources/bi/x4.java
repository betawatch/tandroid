package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x4 extends mo0 {
    public final /* synthetic */ k7 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(k7 k7Var, Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, h6Var);
        this.U2 = k7Var;
        this.V1 = true;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (z9) {
            org.telegram.ui.Components.gc k10 = k();
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == p10.i(this.a).n) {
                    org.telegram.ui.Components.bc G = k10.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131748886, new Object[0])));
                    G.r = false;
                    G.t = true;
                    G.j();
                } else if (j3 < 0) {
                    org.telegram.ui.Components.bc G2 = k10.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131748890, tL_forumTopic != null ? tL_forumTopic.title : qp.s1(this.a).M0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.t = true;
                    G2.j();
                } else {
                    org.telegram.ui.Components.bc G3 = k10.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131748890, qp.s1(this.a).a2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.t = true;
                    G3.j();
                }
            } else {
                org.telegram.ui.Components.bc Q = k10.Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(hVar.m(), "LinkSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.r = false;
                Q.t = true;
                Q.j();
            }
            try {
                this.c.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.mo0
    public final void S0(final View view) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        fi.oa b10 = view instanceof org.telegram.ui.Cells.d7 ? fi.qa.b((org.telegram.ui.Cells.d7) view) : null;
        ArrayList arrayList = new ArrayList();
        final k7 k7Var = this.U2;
        ij ijVar = k7Var.C2;
        if (ijVar != null) {
            arrayList.add(ijVar);
        } else {
            if (!(k7Var.x1() instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            long e10 = p10.i(k7Var.a).e();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) k7Var.x1();
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.peer_id = qp.s1(k7Var.a).z1(e10);
            tL_messageService.from_id = qp.s1(k7Var.a).z1(e10);
            tL_messageService.date = ConnectionsManager.getInstance(k7Var.a).getCurrentTime();
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
            tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
            tL_messageActionStarGiftUnique.upgrade = true;
            tL_messageService.action = tL_messageActionStarGiftUnique;
            ij ijVar2 = new ij(k7Var.a, tL_messageService, false, false);
            ijVar2.L5();
            arrayList.add(ijVar2);
        }
        final fi.va D = fi.va.D(launchActivity, k7Var.a);
        D.R = new z10() { // from class: bi.d2
            @Override // org.telegram.messenger.z10
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                fi.va vaVar = D;
                fi.oa oaVar = null;
                if (booleanValue) {
                    k7 k7Var2 = k7.this;
                    org.telegram.messenger.g0.h3(new a1.e(27, k7Var2, l10));
                    vaVar.X(null);
                    x4 x4Var = k7Var2.U2;
                    if (x4Var != null) {
                        x4Var.dismiss();
                        k7Var2.U2 = null;
                    }
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.d7) && view2.isAttachedToWindow()) {
                        oaVar = fi.qa.b((org.telegram.ui.Cells.d7) view2);
                    }
                    vaVar.X(oaVar);
                }
                org.telegram.messenger.g0.h3(runnable);
            }
        };
        D.T(b10, fi.e7.y(arrayList));
    }
}
