package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lw extends zf.m {
    public final /* synthetic */ zx b0;
    public final /* synthetic */ ay c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(ay ayVar, ay ayVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, zx zxVar) {
        super(ayVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.c0 = ayVar;
        this.b0 = zxVar;
    }

    @Override // zf.m
    public final void K() {
        this.c0.presentFragment(new j());
    }

    @Override // zf.m
    public final void L() {
        ay ayVar = this.c0;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, ayVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = ayVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle i10 = org.telegram.ui.Cells.f1.i(0, "step");
            Boolean bool = ayVar.G.has_username;
            if (bool != null) {
                i10.putBoolean("forcePublic", bool.booleanValue());
            }
            kd kdVar = new kd(i10);
            kdVar.u0 = new n6(ayVar, kdVar, x1Var, 2);
            ayVar.presentFragment(kdVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = ayVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{ayVar.getUserConfig().e()} : new long[]{ayVar.getUserConfig().e(), ayVar.H});
            Boolean bool3 = ayVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            c60 c60Var = new c60(bundle);
            c60Var.Y = new cx(ayVar, x1Var);
            ayVar.presentFragment(c60Var);
        }
    }

    @Override // zf.m
    public final void M(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.k2) this.c0).currentAccount;
        org.telegram.messenger.vp.r1(i10).u3(null, user, null, 0, null, false, false);
    }

    @Override // zf.m
    public final boolean T() {
        return this.c0.R0 == 0;
    }

    @Override // zf.m, s4.g0
    public final void f() {
        b();
        int i10 = zx.L;
        try {
            super.f();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        ay ayVar = this.c0;
        if (ayVar.R0 == 15) {
            ayVar.j0.setVisibility(this.U ? 8 : 0);
        }
    }

    @Override // zf.m, org.telegram.ui.Cells.r2
    public final void l(org.telegram.ui.Cells.v2 v2Var) {
        zx zxVar = this.b0;
        zxVar.a.getClass();
        this.c0.z4(v2Var, RecyclerView.R(v2Var), 0.0f, zxVar.d);
    }

    @Override // zf.m, org.telegram.ui.Cells.r2
    public final void r(org.telegram.ui.Cells.v2 v2Var) {
        int i10;
        if (v2Var.getMessage() != null) {
            ay ayVar = this.c0;
            org.telegram.messenger.x00 x00Var = ayVar.getMessagesController().r7;
            long j10 = -v2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
            TLRPC.TL_forumTopic f7 = x00Var.f(j10, org.telegram.messenger.jj.c2(i10, v2Var.getMessage().k, true, false));
            if (f7 != null) {
                if (ayVar.l2) {
                    ayVar.Z3(v2Var.getDialogId(), f7.id, false, null);
                } else {
                    gg.e.m(ayVar, -v2Var.getDialogId(), f7, 0);
                }
            }
        }
    }
}
