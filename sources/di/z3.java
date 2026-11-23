package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z3 extends zo0 {
    public final /* synthetic */ f6 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(f6 f6Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, i6Var);
        this.V2 = f6Var;
        this.W1 = true;
    }

    @Override // org.telegram.ui.Components.zo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            org.telegram.ui.Components.kc k10 = k();
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == i10.i(this.a).n) {
                    org.telegram.ui.Components.fc G = k10.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131748693, new Object[0])));
                    G.r = false;
                    G.t = true;
                    G.j();
                } else if (j3 < 0) {
                    org.telegram.ui.Components.fc G2 = k10.G(R.raw.forward, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131748697, tL_forumTopic != null ? tL_forumTopic.title : mp.u1(this.a).O0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.t = true;
                    G2.j();
                } else {
                    org.telegram.ui.Components.fc G3 = k10.G(R.raw.forward, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131748697, mp.u1(this.a).c2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.t = true;
                    G3.j();
                }
            } else {
                org.telegram.ui.Components.fc Q = k10.Q(R.raw.forward, 36, org.telegram.messenger.g0.W2(gd.G(hVar.m(), "LinkSharedToManyChats", Integer.valueOf(hVar.m()))));
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

    @Override // org.telegram.ui.Components.zo0
    public final void T0(final View view) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        hi.gb b10 = view instanceof org.telegram.ui.Cells.d7 ? hi.ib.b((org.telegram.ui.Cells.d7) view) : null;
        ArrayList arrayList = new ArrayList();
        final f6 f6Var = this.V2;
        fj fjVar = f6Var.D2;
        if (fjVar != null) {
            arrayList.add(fjVar);
        } else {
            if (!(f6Var.D1() instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            long e10 = i10.i(f6Var.a).e();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) f6Var.D1();
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.peer_id = mp.u1(f6Var.a).B1(e10);
            tL_messageService.from_id = mp.u1(f6Var.a).B1(e10);
            tL_messageService.date = ConnectionsManager.getInstance(f6Var.a).getCurrentTime();
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
            tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
            tL_messageActionStarGiftUnique.upgrade = true;
            tL_messageService.action = tL_messageActionStarGiftUnique;
            fj fjVar2 = new fj(f6Var.a, tL_messageService, false, false);
            fjVar2.L5();
            arrayList.add(fjVar2);
        }
        final hi.nb D = hi.nb.D(launchActivity, f6Var.a);
        D.S = new t10() { // from class: di.p1
            @Override // org.telegram.messenger.t10
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                hi.nb nbVar = D;
                hi.gb gbVar = null;
                if (booleanValue) {
                    f6 f6Var2 = f6.this;
                    org.telegram.messenger.g0.g3(new c1.a(28, f6Var2, l10));
                    nbVar.X(null);
                    z3 z3Var = f6Var2.V2;
                    if (z3Var != null) {
                        z3Var.dismiss();
                        f6Var2.V2 = null;
                    }
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.d7) && view2.isAttachedToWindow()) {
                        gbVar = hi.ib.b((org.telegram.ui.Cells.d7) view2);
                    }
                    nbVar.X(gbVar);
                }
                org.telegram.messenger.g0.g3(runnable);
            }
        };
        D.T(b10, hi.x7.y(arrayList));
    }
}
