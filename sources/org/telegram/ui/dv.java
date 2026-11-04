package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dv extends kg.m {
    public final /* synthetic */ tw c0;
    public final /* synthetic */ uw d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(uw uwVar, uw uwVar2, Context context, int i3, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, tw twVar) {
        super(uwVar2, context, i3, i10, z10, arrayList, i11, requestPeerType);
        this.d0 = uwVar;
        this.c0 = twVar;
    }

    @Override // kg.m
    public final void K() {
        this.d0.presentFragment(new k());
    }

    @Override // kg.m
    public final void L() {
        uw uwVar = this.d0;
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, uwVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = uwVar.H;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle k10 = org.telegram.ui.Cells.f1.k(0, "step");
            Boolean bool = uwVar.H.has_username;
            if (bool != null) {
                k10.putBoolean("forcePublic", bool.booleanValue());
            }
            ad adVar = new ad(k10);
            adVar.v0 = new o6(uwVar, adVar, s1Var, 2);
            uwVar.presentFragment(adVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = uwVar.H.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{uwVar.getUserConfig().e()} : new long[]{uwVar.getUserConfig().e(), uwVar.I});
            Boolean bool3 = uwVar.H.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            y40 y40Var = new y40(bundle);
            y40Var.Z = new uv(uwVar, s1Var);
            uwVar.presentFragment(y40Var);
        }
    }

    @Override // kg.m
    public final void M(TLRPC.User user) {
        int i3;
        i3 = ((org.telegram.ui.ActionBar.d2) this.d0).currentAccount;
        org.telegram.messenger.hp.s1(i3).x3(null, user, null, 0, null, false, false);
    }

    @Override // kg.m
    public final boolean T() {
        return this.d0.S0 == 0;
    }

    @Override // kg.m, u4.h0
    public final void f() {
        b();
        int i3 = tw.M;
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        uw uwVar = this.d0;
        if (uwVar.S0 == 15) {
            uwVar.k0.setVisibility(this.V ? 8 : 0);
        }
    }

    @Override // kg.m, org.telegram.ui.Cells.p2
    public final void l(org.telegram.ui.Cells.t2 t2Var) {
        tw twVar = this.c0;
        twVar.a.getClass();
        this.d0.A4(t2Var, RecyclerView.R(t2Var), 0.0f, twVar.d);
    }

    @Override // kg.m, org.telegram.ui.Cells.p2
    public final void r(org.telegram.ui.Cells.t2 t2Var) {
        int i3;
        if (t2Var.getMessage() != null) {
            uw uwVar = this.d0;
            org.telegram.messenger.c00 c00Var = uwVar.getMessagesController().q7;
            long j10 = -t2Var.getDialogId();
            i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
            TLRPC.TL_forumTopic f10 = c00Var.f(j10, org.telegram.messenger.zi.c2(i3, t2Var.getMessage().k, true, false));
            if (f10 != null) {
                if (uwVar.m2) {
                    uwVar.a4(t2Var.getDialogId(), f10.id, false, null);
                } else {
                    rg.c.m(uwVar, -t2Var.getDialogId(), f10, 0);
                }
            }
        }
    }
}
