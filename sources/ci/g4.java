package ci;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.r10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g4 extends oo0 {
    public final /* synthetic */ l6 S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(l6 l6Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, e6Var);
        this.S2 = l6Var;
        this.T1 = true;
    }

    @Override // org.telegram.ui.Components.oo0
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            org.telegram.ui.Components.fc k10 = k();
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == h10.i(this.a).n) {
                    org.telegram.ui.Components.ac G = k10.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131748894, new Object[0])));
                    G.r = false;
                    G.t = true;
                    G.j();
                } else if (j10 < 0) {
                    org.telegram.ui.Components.ac G2 = k10.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131748898, tL_forumTopic != null ? tL_forumTopic.title : hp.s1(this.a).M0(Long.valueOf(-j10)).title)));
                    G2.r = false;
                    G2.t = true;
                    G2.j();
                } else {
                    org.telegram.ui.Components.ac G3 = k10.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131748898, hp.s1(this.a).a2(Long.valueOf(j10)).first_name)));
                    G3.r = false;
                    G3.t = true;
                    G3.j();
                }
            } else {
                org.telegram.ui.Components.ac Q = k10.Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(bd.G(hVar.m(), "LinkSharedToManyChats", Integer.valueOf(hVar.m()))));
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

    @Override // org.telegram.ui.Components.oo0
    public final void S0(final View view) {
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity == null) {
            return;
        }
        gi.oa b10 = view instanceof org.telegram.ui.Cells.c7 ? gi.qa.b((org.telegram.ui.Cells.c7) view) : null;
        ArrayList arrayList = new ArrayList();
        final l6 l6Var = this.S2;
        zi ziVar = l6Var.A2;
        if (ziVar != null) {
            arrayList.add(ziVar);
        } else {
            if (!(l6Var.y1() instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            long e10 = h10.i(l6Var.a).e();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) l6Var.y1();
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.peer_id = hp.s1(l6Var.a).z1(e10);
            tL_messageService.from_id = hp.s1(l6Var.a).z1(e10);
            tL_messageService.date = ConnectionsManager.getInstance(l6Var.a).getCurrentTime();
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
            tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
            tL_messageActionStarGiftUnique.upgrade = true;
            tL_messageService.action = tL_messageActionStarGiftUnique;
            zi ziVar2 = new zi(l6Var.a, tL_messageService, false, false);
            ziVar2.M5();
            arrayList.add(ziVar2);
        }
        final gi.va D = gi.va.D(launchActivity, l6Var.a);
        D.S = new r10() { // from class: ci.w1
            @Override // org.telegram.messenger.r10
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                gi.va vaVar = D;
                gi.oa oaVar = null;
                if (booleanValue) {
                    l6 l6Var2 = l6.this;
                    org.telegram.messenger.g0.h3(new e0(4, l6Var2, l10));
                    vaVar.X(null);
                    g4 g4Var = l6Var2.S2;
                    if (g4Var != null) {
                        g4Var.dismiss();
                        l6Var2.S2 = null;
                    }
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.c7) && view2.isAttachedToWindow()) {
                        oaVar = gi.qa.b((org.telegram.ui.Cells.c7) view2);
                    }
                    vaVar.X(oaVar);
                }
                org.telegram.messenger.g0.h3(runnable);
            }
        };
        D.T(b10, gi.f7.y(arrayList));
    }
}
