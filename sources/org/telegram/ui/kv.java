package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class kv extends jg.m {
    public final /* synthetic */ bx c0;
    public final /* synthetic */ cx d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(cx cxVar, cx cxVar2, Context context, int i7, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, bx bxVar) {
        super(cxVar2, context, i7, i10, z10, arrayList, i11, requestPeerType);
        this.d0 = cxVar;
        this.c0 = bxVar;
    }

    @Override // jg.m
    public final void K() {
        this.d0.presentFragment(new k());
    }

    @Override // jg.m
    public final void L() {
        cx cxVar = this.d0;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, cxVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = cxVar.H;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f10 = p5.c.f(0, "step");
            Boolean bool = cxVar.H.has_username;
            if (bool != null) {
                f10.putBoolean("forcePublic", bool.booleanValue());
            }
            ad adVar = new ad(f10);
            adVar.v0 = new m6(cxVar, adVar, u1Var, 2);
            cxVar.presentFragment(adVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = cxVar.H.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{cxVar.getUserConfig().e()} : new long[]{cxVar.getUserConfig().e(), cxVar.I});
            Boolean bool3 = cxVar.H.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            f50 f50Var = new f50(bundle);
            f50Var.Z = new cw(cxVar, u1Var);
            cxVar.presentFragment(f50Var);
        }
    }

    @Override // jg.m
    public final void M(TLRPC.User user) {
        int i7;
        i7 = ((org.telegram.ui.ActionBar.h2) this.d0).currentAccount;
        org.telegram.messenger.mp.u1(i7).E3(null, user, null, 0, null, false, false);
    }

    @Override // jg.m
    public final boolean T() {
        return this.d0.T0 == 0;
    }

    @Override // jg.m, v4.i0
    public final void f() {
        b();
        int i7 = bx.M;
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        cx cxVar = this.d0;
        if (cxVar.T0 == 15) {
            cxVar.k0.setVisibility(this.V ? 8 : 0);
        }
    }

    @Override // jg.m, org.telegram.ui.Cells.q2
    public final void l(org.telegram.ui.Cells.u2 u2Var) {
        bx bxVar = this.c0;
        bxVar.a.getClass();
        this.d0.F4(u2Var, RecyclerView.R(u2Var), 0.0f, bxVar.d);
    }

    @Override // jg.m, org.telegram.ui.Cells.q2
    public final void r(org.telegram.ui.Cells.u2 u2Var) {
        int i7;
        if (u2Var.getMessage() != null) {
            cx cxVar = this.d0;
            org.telegram.messenger.e00 e00Var = cxVar.getMessagesController().t7;
            long j3 = -u2Var.getDialogId();
            i7 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
            TLRPC.TL_forumTopic f10 = e00Var.f(j3, org.telegram.messenger.fj.b2(i7, u2Var.getMessage().k, true, false));
            if (f10 != null) {
                if (cxVar.n2) {
                    cxVar.a4(u2Var.getDialogId(), f10.id, false, null);
                } else {
                    qg.c.n(cxVar, -u2Var.getDialogId(), f10, 0);
                }
            }
        }
    }
}
