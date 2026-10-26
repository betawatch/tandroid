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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gw extends ig.n {
    public final /* synthetic */ ay d0;
    public final /* synthetic */ cy e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(cy cyVar, cy cyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, ay ayVar) {
        super(cyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.e0 = cyVar;
        this.d0 = ayVar;
    }

    @Override // ig.n
    public final void K() {
        this.e0.presentFragment(new k());
    }

    @Override // ig.n
    public final void L() {
        cy cyVar = this.e0;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(cyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = cyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle g7 = org.telegram.ui.Components.b10.g(0, "step");
            Boolean bool = cyVar.G.has_username;
            if (bool != null) {
                g7.putBoolean("forcePublic", bool.booleanValue());
            }
            nd ndVar = new nd(g7);
            ndVar.u0 = new q6(cyVar, ndVar, e2Var, 2);
            cyVar.presentFragment(ndVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = cyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{cyVar.getUserConfig().getClientUserId()} : new long[]{cyVar.getUserConfig().getClientUserId(), cyVar.H});
            Boolean bool3 = cyVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            x60 x60Var = new x60(bundle);
            x60Var.Y = new yw(cyVar, e2Var);
            cyVar.presentFragment(x60Var);
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
        ay ayVar = this.d0;
        ayVar.a.getClass();
        this.e0.w4(p2Var, RecyclerView.R(p2Var), 0.0f, ayVar.d);
    }

    @Override // ig.n, org.telegram.ui.Cells.l2
    public final void d(org.telegram.ui.Cells.p2 p2Var) {
        int i10;
        if (p2Var.getMessage() != null) {
            cy cyVar = this.e0;
            TopicsController topicsController = cyVar.getMessagesController().getTopicsController();
            long j10 = -p2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, MessageObject.getTopicId(i10, p2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (cyVar.l2) {
                    cyVar.W3(p2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    pg.d.m(cyVar, -p2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // ig.n, s4.h0
    public final void l() {
        h();
        int i10 = ay.L;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        cy cyVar = this.e0;
        if (cyVar.R0 == 15) {
            cyVar.j0.setVisibility(this.U ? 8 : 0);
        }
    }
}
