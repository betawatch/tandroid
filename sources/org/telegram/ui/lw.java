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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class lw extends hg.m {
    public final /* synthetic */ dy d0;
    public final /* synthetic */ ey e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(ey eyVar, ey eyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, dy dyVar) {
        super(eyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.e0 = eyVar;
        this.d0 = dyVar;
    }

    @Override // hg.m
    public final void K() {
        this.e0.presentFragment(new k());
    }

    @Override // hg.m
    public final void L() {
        ey eyVar = this.e0;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(eyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = eyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle i10 = org.telegram.ui.Cells.b1.i(0, "step");
            Boolean bool = eyVar.G.has_username;
            if (bool != null) {
                i10.putBoolean("forcePublic", bool.booleanValue());
            }
            md mdVar = new md(i10);
            mdVar.u0 = new p6(eyVar, mdVar, c2Var, 2);
            eyVar.presentFragment(mdVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = eyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{eyVar.getUserConfig().getClientUserId()} : new long[]{eyVar.getUserConfig().getClientUserId(), eyVar.H});
            Boolean bool3 = eyVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            w60 w60Var = new w60(bundle);
            w60Var.Y = new dx(eyVar, c2Var);
            eyVar.presentFragment(w60Var);
        }
    }

    @Override // hg.m
    public final void M(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.o2) this.e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override // hg.m
    public final boolean T() {
        return this.e0.R0 == 0;
    }

    @Override // hg.m, org.telegram.ui.Cells.m2
    public final void a(org.telegram.ui.Cells.q2 q2Var) {
        dy dyVar = this.d0;
        dyVar.a.getClass();
        this.e0.m4(q2Var, RecyclerView.R(q2Var), 0.0f, dyVar.d);
    }

    @Override // hg.m, org.telegram.ui.Cells.m2
    public final void d(org.telegram.ui.Cells.q2 q2Var) {
        int i10;
        if (q2Var.getMessage() != null) {
            ey eyVar = this.e0;
            TopicsController topicsController = eyVar.getMessagesController().getTopicsController();
            long j10 = -q2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, MessageObject.getTopicId(i10, q2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (eyVar.l2) {
                    eyVar.M3(q2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    og.d.m(eyVar, -q2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // hg.m, s4.g0
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
