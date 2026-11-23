package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class jv extends jg.m {
    public final /* synthetic */ ax c0;
    public final /* synthetic */ bx d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(bx bxVar, bx bxVar2, Context context, int i7, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, ax axVar) {
        super(bxVar2, context, i7, i10, z10, arrayList, i11, requestPeerType);
        this.d0 = bxVar;
        this.c0 = axVar;
    }

    @Override // jg.m
    public final void K() {
        this.d0.presentFragment(new k());
    }

    @Override // jg.m
    public final void L() {
        bx bxVar = this.d0;
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, bxVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = bxVar.H;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f10 = p5.c.f(0, "step");
            Boolean bool = bxVar.H.has_username;
            if (bool != null) {
                f10.putBoolean("forcePublic", bool.booleanValue());
            }
            ad adVar = new ad(f10);
            adVar.v0 = new n6(bxVar, adVar, t1Var, 2);
            bxVar.presentFragment(adVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = bxVar.H.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{bxVar.getUserConfig().e()} : new long[]{bxVar.getUserConfig().e(), bxVar.I});
            Boolean bool3 = bxVar.H.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            e50 e50Var = new e50(bundle);
            e50Var.Z = new bw(bxVar, t1Var);
            bxVar.presentFragment(e50Var);
        }
    }

    @Override // jg.m
    public final void M(TLRPC.User user) {
        int i7;
        i7 = ((org.telegram.ui.ActionBar.g2) this.d0).currentAccount;
        org.telegram.messenger.mp.u1(i7).E3(null, user, null, 0, null, false, false);
    }

    @Override // jg.m
    public final boolean T() {
        return this.d0.T0 == 0;
    }

    @Override // jg.m, v4.i0
    public final void f() {
        b();
        int i7 = ax.M;
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        bx bxVar = this.d0;
        if (bxVar.T0 == 15) {
            bxVar.k0.setVisibility(this.V ? 8 : 0);
        }
    }

    @Override // jg.m, org.telegram.ui.Cells.q2
    public final void l(org.telegram.ui.Cells.u2 u2Var) {
        ax axVar = this.c0;
        axVar.a.getClass();
        this.d0.F4(u2Var, RecyclerView.R(u2Var), 0.0f, axVar.d);
    }

    @Override // jg.m, org.telegram.ui.Cells.q2
    public final void r(org.telegram.ui.Cells.u2 u2Var) {
        int i7;
        if (u2Var.getMessage() != null) {
            bx bxVar = this.d0;
            org.telegram.messenger.d00 d00Var = bxVar.getMessagesController().t7;
            long j3 = -u2Var.getDialogId();
            i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
            TLRPC.TL_forumTopic f10 = d00Var.f(j3, org.telegram.messenger.fj.b2(i7, u2Var.getMessage().k, true, false));
            if (f10 != null) {
                if (bxVar.n2) {
                    bxVar.a4(u2Var.getDialogId(), f10.id, false, null);
                } else {
                    qg.c.n(bxVar, -u2Var.getDialogId(), f10, 0);
                }
            }
        }
    }
}
