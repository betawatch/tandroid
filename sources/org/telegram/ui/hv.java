package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hv extends jg.m {
    public final /* synthetic */ xw c0;
    public final /* synthetic */ yw d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(yw ywVar, yw ywVar2, Context context, int i7, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, xw xwVar) {
        super(ywVar2, context, i7, i10, z10, arrayList, i11, requestPeerType);
        this.d0 = ywVar;
        this.c0 = xwVar;
    }

    @Override // jg.m
    public final void K() {
        this.d0.presentFragment(new k());
    }

    @Override // jg.m
    public final void L() {
        yw ywVar = this.d0;
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, ywVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = ywVar.H;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f10 = r.b.f(0, "step");
            Boolean bool = ywVar.H.has_username;
            if (bool != null) {
                f10.putBoolean("forcePublic", bool.booleanValue());
            }
            ad adVar = new ad(f10);
            adVar.v0 = new n6(ywVar, adVar, t1Var, 2);
            ywVar.presentFragment(adVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = ywVar.H.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{ywVar.getUserConfig().e()} : new long[]{ywVar.getUserConfig().e(), ywVar.I});
            Boolean bool3 = ywVar.H.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            c50 c50Var = new c50(bundle);
            c50Var.Z = new zv(ywVar, t1Var);
            ywVar.presentFragment(c50Var);
        }
    }

    @Override // jg.m
    public final void M(TLRPC.User user) {
        int i7;
        i7 = ((org.telegram.ui.ActionBar.e2) this.d0).currentAccount;
        org.telegram.messenger.np.s1(i7).x3(null, user, null, 0, null, false, false);
    }

    @Override // jg.m
    public final boolean T() {
        return this.d0.T0 == 0;
    }

    @Override // jg.m, v4.h0
    public final void f() {
        b();
        int i7 = xw.M;
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        yw ywVar = this.d0;
        if (ywVar.T0 == 15) {
            ywVar.k0.setVisibility(this.V ? 8 : 0);
        }
    }

    @Override // jg.m, org.telegram.ui.Cells.p2
    public final void l(org.telegram.ui.Cells.t2 t2Var) {
        xw xwVar = this.c0;
        xwVar.a.getClass();
        this.d0.A4(t2Var, RecyclerView.R(t2Var), 0.0f, xwVar.d);
    }

    @Override // jg.m, org.telegram.ui.Cells.p2
    public final void r(org.telegram.ui.Cells.t2 t2Var) {
        int i7;
        if (t2Var.getMessage() != null) {
            yw ywVar = this.d0;
            org.telegram.messenger.h00 h00Var = ywVar.getMessagesController().r7;
            long j3 = -t2Var.getDialogId();
            i7 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
            TLRPC.TL_forumTopic f10 = h00Var.f(j3, org.telegram.messenger.gj.b2(i7, t2Var.getMessage().k, true, false));
            if (f10 != null) {
                if (ywVar.n2) {
                    ywVar.a4(t2Var.getDialogId(), f10.id, false, null);
                } else {
                    qg.c.m(ywVar, -t2Var.getDialogId(), f10, 0);
                }
            }
        }
    }
}
