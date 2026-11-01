package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class kw extends zf.m {
    public final /* synthetic */ yx b0;
    public final /* synthetic */ zx c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(zx zxVar, zx zxVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, yx yxVar) {
        super(zxVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.c0 = zxVar;
        this.b0 = yxVar;
    }

    @Override // zf.m
    public final void K() {
        this.c0.presentFragment(new j());
    }

    @Override // zf.m
    public final void L() {
        zx zxVar = this.c0;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, zxVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = zxVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle i10 = org.telegram.ui.Cells.f1.i(0, "step");
            Boolean bool = zxVar.G.has_username;
            if (bool != null) {
                i10.putBoolean("forcePublic", bool.booleanValue());
            }
            kd kdVar = new kd(i10);
            kdVar.u0 = new n6(zxVar, kdVar, x1Var, 2);
            zxVar.presentFragment(kdVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = zxVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{zxVar.getUserConfig().e()} : new long[]{zxVar.getUserConfig().e(), zxVar.H});
            Boolean bool3 = zxVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            b60 b60Var = new b60(bundle);
            b60Var.Y = new bx(zxVar, x1Var);
            zxVar.presentFragment(b60Var);
        }
    }

    @Override // zf.m
    public final void M(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.k2) this.c0).currentAccount;
        org.telegram.messenger.wp.r1(i10).u3(null, user, null, 0, null, false, false);
    }

    @Override // zf.m
    public final boolean T() {
        return this.c0.R0 == 0;
    }

    @Override // zf.m, s4.g0
    public final void f() {
        b();
        int i10 = yx.L;
        try {
            super.f();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        zx zxVar = this.c0;
        if (zxVar.R0 == 15) {
            zxVar.j0.setVisibility(this.U ? 8 : 0);
        }
    }

    @Override // zf.m, org.telegram.ui.Cells.r2
    public final void l(org.telegram.ui.Cells.v2 v2Var) {
        yx yxVar = this.b0;
        yxVar.a.getClass();
        this.c0.A4(v2Var, RecyclerView.R(v2Var), 0.0f, yxVar.d);
    }

    @Override // zf.m, org.telegram.ui.Cells.r2
    public final void r(org.telegram.ui.Cells.v2 v2Var) {
        int i10;
        if (v2Var.getMessage() != null) {
            zx zxVar = this.c0;
            org.telegram.messenger.y00 y00Var = zxVar.getMessagesController().r7;
            long j10 = -v2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
            TLRPC.TL_forumTopic f7 = y00Var.f(j10, org.telegram.messenger.kj.c2(i10, v2Var.getMessage().k, true, false));
            if (f7 != null) {
                if (zxVar.l2) {
                    zxVar.a4(v2Var.getDialogId(), f7.id, false, null);
                } else {
                    gg.e.m(zxVar, -v2Var.getDialogId(), f7, 0);
                }
            }
        }
    }
}
