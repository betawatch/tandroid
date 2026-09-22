package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bx extends gg.m {
    public final /* synthetic */ ty d0;
    public final /* synthetic */ uy e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(uy uyVar, uy uyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, ty tyVar) {
        super(uyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.e0 = uyVar;
        this.d0 = tyVar;
    }

    @Override // gg.m
    public final void J() {
        this.e0.presentFragment(new l());
    }

    @Override // gg.m
    public final void K() {
        uy uyVar = this.e0;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(uyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = uyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle e = org.telegram.ui.Cells.q3.e(0, "step");
            Boolean bool = uyVar.G.has_username;
            if (bool != null) {
                e.putBoolean("forcePublic", bool.booleanValue());
            }
            ld ldVar = new ld(e);
            ldVar.t0 = new m6(uyVar, ldVar, b2Var, 2);
            uyVar.presentFragment(ldVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = uyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{uyVar.getUserConfig().getClientUserId()} : new long[]{uyVar.getUserConfig().getClientUserId(), uyVar.H});
            Boolean bool3 = uyVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            l70 l70Var = new l70(bundle);
            l70Var.Y = new tx(uyVar, b2Var);
            uyVar.presentFragment(l70Var);
        }
    }

    @Override // gg.m
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.n2) this.e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override // gg.m
    public final boolean S() {
        return this.e0.R0 == 0;
    }

    @Override // gg.m, org.telegram.ui.Cells.n2
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
        ty tyVar = this.d0;
        tyVar.a.getClass();
        this.e0.o4(r2Var, RecyclerView.R(r2Var), 0.0f, tyVar.d);
    }

    @Override // gg.m, org.telegram.ui.Cells.n2
    public final void d(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        if (r2Var.getMessage() != null) {
            uy uyVar = this.e0;
            TopicsController topicsController = uyVar.getMessagesController().getTopicsController();
            long j3 = -r2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, MessageObject.getTopicId(i10, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (uyVar.l2) {
                    uyVar.O3(r2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    ng.d.m(uyVar, -r2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // gg.m, s4.h0
    public final void l() {
        h();
        int i10 = ty.L;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        uy uyVar = this.e0;
        if (uyVar.R0 == 15) {
            uyVar.j0.setVisibility(this.U ? 8 : 0);
        }
    }
}
