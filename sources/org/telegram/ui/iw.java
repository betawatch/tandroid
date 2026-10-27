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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class iw extends ig.n {
    public final /* synthetic */ dy d0;
    public final /* synthetic */ ey e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(ey eyVar, ey eyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, dy dyVar) {
        super(eyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.e0 = eyVar;
        this.d0 = dyVar;
    }

    @Override // ig.n
    public final void K() {
        this.e0.presentFragment(new k());
    }

    @Override // ig.n
    public final void L() {
        ey eyVar = this.e0;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(eyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = eyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle g7 = org.telegram.ui.Components.b10.g(0, "step");
            Boolean bool = eyVar.G.has_username;
            if (bool != null) {
                g7.putBoolean("forcePublic", bool.booleanValue());
            }
            nd ndVar = new nd(g7);
            ndVar.u0 = new q6(eyVar, ndVar, e2Var, 2);
            eyVar.presentFragment(ndVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = eyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{eyVar.getUserConfig().getClientUserId()} : new long[]{eyVar.getUserConfig().getClientUserId(), eyVar.H});
            Boolean bool3 = eyVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            z60 z60Var = new z60(bundle);
            z60Var.Y = new ax(eyVar, e2Var);
            eyVar.presentFragment(z60Var);
        }
    }

    @Override // ig.n
    public final void M(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.r2) this.e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override // ig.n
    public final boolean T() {
        return this.e0.R0 == 0;
    }

    @Override // ig.n, org.telegram.ui.Cells.l2
    public final void a(org.telegram.ui.Cells.p2 p2Var) {
        dy dyVar = this.d0;
        dyVar.a.getClass();
        this.e0.w4(p2Var, RecyclerView.R(p2Var), 0.0f, dyVar.d);
    }

    @Override // ig.n, org.telegram.ui.Cells.l2
    public final void d(org.telegram.ui.Cells.p2 p2Var) {
        int i10;
        if (p2Var.getMessage() != null) {
            ey eyVar = this.e0;
            TopicsController topicsController = eyVar.getMessagesController().getTopicsController();
            long j10 = -p2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, MessageObject.getTopicId(i10, p2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (eyVar.l2) {
                    eyVar.W3(p2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    pg.d.m(eyVar, -p2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // ig.n, s4.h0
    public final void l() {
        h();
        int i10 = dy.L;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        ey eyVar = this.e0;
        if (eyVar.R0 == 15) {
            eyVar.j0.setVisibility(this.U ? 8 : 0);
        }
    }
}
