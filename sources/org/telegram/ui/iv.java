package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class iv extends jg.n {
    public final /* synthetic */ xw b0;
    public final /* synthetic */ yw c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(yw ywVar, yw ywVar2, Context context, int i7, int i10, boolean z9, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, xw xwVar) {
        super(ywVar2, context, i7, i10, z9, arrayList, i11, requestPeerType);
        this.c0 = ywVar;
        this.b0 = xwVar;
    }

    @Override // jg.n
    public final void K() {
        this.c0.presentFragment(new k());
    }

    @Override // jg.n
    public final void L() {
        yw ywVar = this.c0;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, ywVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = ywVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f10 = rf.b.f(0, "step");
            Boolean bool = ywVar.G.has_username;
            if (bool != null) {
                f10.putBoolean("forcePublic", bool.booleanValue());
            }
            bd bdVar = new bd(f10);
            bdVar.u0 = new n6(ywVar, bdVar, u1Var, 2);
            ywVar.presentFragment(bdVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = ywVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{ywVar.getUserConfig().e()} : new long[]{ywVar.getUserConfig().e(), ywVar.H});
            Boolean bool3 = ywVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            f50 f50Var = new f50(bundle);
            f50Var.Y = new zv(ywVar, u1Var);
            ywVar.presentFragment(f50Var);
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
        return this.c0.S0 == 0;
    }

    @Override // jg.n, v4.g0
    public final void f() {
        b();
        int i7 = xw.L;
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        yw ywVar = this.c0;
        if (ywVar.S0 == 15) {
            ywVar.j0.setVisibility(this.U ? 8 : 0);
        }
    }

    @Override // jg.n, org.telegram.ui.Cells.p2
    public final void l(org.telegram.ui.Cells.t2 t2Var) {
        xw xwVar = this.b0;
        xwVar.a.getClass();
        this.c0.A4(t2Var, RecyclerView.R(t2Var), 0.0f, xwVar.d);
    }

    @Override // jg.n, org.telegram.ui.Cells.p2
    public final void r(org.telegram.ui.Cells.t2 t2Var) {
        int i7;
        if (t2Var.getMessage() != null) {
            yw ywVar = this.c0;
            org.telegram.messenger.k00 k00Var = ywVar.getMessagesController().q7;
            long j3 = -t2Var.getDialogId();
            i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
            TLRPC.TL_forumTopic f10 = k00Var.f(j3, org.telegram.messenger.ij.b2(i7, t2Var.getMessage().k, true, false));
            if (f10 != null) {
                if (ywVar.m2) {
                    ywVar.a4(t2Var.getDialogId(), f10.id, false, null);
                } else {
                    qg.d.m(ywVar, -t2Var.getDialogId(), f10, 0);
                }
            }
        }
    }
}
