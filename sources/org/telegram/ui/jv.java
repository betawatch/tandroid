package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jv extends jg.n {
    public final /* synthetic */ yw b0;
    public final /* synthetic */ zw c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(zw zwVar, zw zwVar2, Context context, int i7, int i10, boolean z9, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, yw ywVar) {
        super(zwVar2, context, i7, i10, z9, arrayList, i11, requestPeerType);
        this.c0 = zwVar;
        this.b0 = ywVar;
    }

    @Override // jg.n
    public final void K() {
        this.c0.presentFragment(new k());
    }

    @Override // jg.n
    public final void L() {
        zw zwVar = this.c0;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, zwVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = zwVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f10 = rf.b.f(0, "step");
            Boolean bool = zwVar.G.has_username;
            if (bool != null) {
                f10.putBoolean("forcePublic", bool.booleanValue());
            }
            bd bdVar = new bd(f10);
            bdVar.u0 = new n6(zwVar, bdVar, u1Var, 2);
            zwVar.presentFragment(bdVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = zwVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{zwVar.getUserConfig().e()} : new long[]{zwVar.getUserConfig().e(), zwVar.H});
            Boolean bool3 = zwVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            g50 g50Var = new g50(bundle);
            g50Var.Y = new aw(zwVar, u1Var);
            zwVar.presentFragment(g50Var);
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
        int i7 = yw.L;
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        zw zwVar = this.c0;
        if (zwVar.S0 == 15) {
            zwVar.j0.setVisibility(this.U ? 8 : 0);
        }
    }

    @Override // jg.n, org.telegram.ui.Cells.p2
    public final void l(org.telegram.ui.Cells.t2 t2Var) {
        yw ywVar = this.b0;
        ywVar.a.getClass();
        this.c0.A4(t2Var, RecyclerView.R(t2Var), 0.0f, ywVar.d);
    }

    @Override // jg.n, org.telegram.ui.Cells.p2
    public final void r(org.telegram.ui.Cells.t2 t2Var) {
        int i7;
        if (t2Var.getMessage() != null) {
            zw zwVar = this.c0;
            org.telegram.messenger.k00 k00Var = zwVar.getMessagesController().q7;
            long j3 = -t2Var.getDialogId();
            i7 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
            TLRPC.TL_forumTopic f10 = k00Var.f(j3, org.telegram.messenger.ij.b2(i7, t2Var.getMessage().k, true, false));
            if (f10 != null) {
                if (zwVar.m2) {
                    zwVar.a4(t2Var.getDialogId(), f10.id, false, null);
                } else {
                    qg.d.m(zwVar, -t2Var.getDialogId(), f10, 0);
                }
            }
        }
    }
}
