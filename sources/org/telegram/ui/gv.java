package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class gv extends jg.n {
    public final /* synthetic */ vw b0;
    public final /* synthetic */ ww c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv(ww wwVar, ww wwVar2, Context context, int i7, int i10, boolean z9, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, vw vwVar) {
        super(wwVar2, context, i7, i10, z9, arrayList, i11, requestPeerType);
        this.c0 = wwVar;
        this.b0 = vwVar;
    }

    @Override // jg.n
    public final void K() {
        this.c0.presentFragment(new k());
    }

    @Override // jg.n
    public final void L() {
        ww wwVar = this.c0;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, wwVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = wwVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f10 = rf.b.f(0, "step");
            Boolean bool = wwVar.G.has_username;
            if (bool != null) {
                f10.putBoolean("forcePublic", bool.booleanValue());
            }
            bd bdVar = new bd(f10);
            bdVar.u0 = new n6(wwVar, bdVar, u1Var, 2);
            wwVar.presentFragment(bdVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = wwVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{wwVar.getUserConfig().e()} : new long[]{wwVar.getUserConfig().e(), wwVar.H});
            Boolean bool3 = wwVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            d50 d50Var = new d50(bundle);
            d50Var.Y = new xv(wwVar, u1Var);
            wwVar.presentFragment(d50Var);
        }
    }

    @Override // jg.n
    public final void M(TLRPC.User user) {
        int i7;
        i7 = ((org.telegram.ui.ActionBar.f2) this.c0).currentAccount;
        org.telegram.messenger.qp.s1(i7).x3(null, user, null, 0, null, false, false);
    }

    @Override // jg.n
    public final boolean T() {
        return this.c0.R0 == 0;
    }

    @Override // jg.n, v4.g0
    public final void f() {
        b();
        int i7 = vw.L;
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ww wwVar = this.c0;
        if (wwVar.R0 == 15) {
            wwVar.j0.setVisibility(this.U ? 8 : 0);
        }
    }

    @Override // jg.n, org.telegram.ui.Cells.p2
    public final void l(org.telegram.ui.Cells.t2 t2Var) {
        vw vwVar = this.b0;
        vwVar.a.getClass();
        this.c0.A4(t2Var, RecyclerView.R(t2Var), 0.0f, vwVar.d);
    }

    @Override // jg.n, org.telegram.ui.Cells.p2
    public final void r(org.telegram.ui.Cells.t2 t2Var) {
        int i7;
        if (t2Var.getMessage() != null) {
            ww wwVar = this.c0;
            org.telegram.messenger.k00 k00Var = wwVar.getMessagesController().q7;
            long j3 = -t2Var.getDialogId();
            i7 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
            TLRPC.TL_forumTopic f10 = k00Var.f(j3, org.telegram.messenger.ij.c2(i7, t2Var.getMessage().k, true, false));
            if (f10 != null) {
                if (wwVar.l2) {
                    wwVar.a4(t2Var.getDialogId(), f10.id, false, null);
                } else {
                    qg.d.m(wwVar, -t2Var.getDialogId(), f10, 0);
                }
            }
        }
    }
}
