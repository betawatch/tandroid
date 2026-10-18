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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
    public final void J() {
        this.e0.presentFragment(new l());
    }

    @Override // hg.m
    public final void K() {
        ey eyVar = this.e0;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(eyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = eyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle i10 = org.telegram.ui.Cells.c1.i(0, "step");
            Boolean bool = eyVar.G.has_username;
            if (bool != null) {
                i10.putBoolean("forcePublic", bool.booleanValue());
            }
            od odVar = new od(i10);
            odVar.t0 = new p6(eyVar, odVar, b2Var, 2);
            eyVar.presentFragment(odVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = eyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{eyVar.getUserConfig().getClientUserId()} : new long[]{eyVar.getUserConfig().getClientUserId(), eyVar.H});
            Boolean bool3 = eyVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            u60 u60Var = new u60(bundle);
            u60Var.Y = new dx(eyVar, b2Var);
            eyVar.presentFragment(u60Var);
        }
    }

    @Override // hg.m
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.n2) this.e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override // hg.m
    public final boolean S() {
        return this.e0.R0 == 0;
    }

    @Override // hg.m, org.telegram.ui.Cells.n2
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
        dy dyVar = this.d0;
        dyVar.a.getClass();
        this.e0.m4(r2Var, RecyclerView.R(r2Var), 0.0f, dyVar.d);
    }

    @Override // hg.m, org.telegram.ui.Cells.n2
    public final void e(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        if (r2Var.getMessage() != null) {
            ey eyVar = this.e0;
            TopicsController topicsController = eyVar.getMessagesController().getTopicsController();
            long j10 = -r2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, MessageObject.getTopicId(i10, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (eyVar.l2) {
                    eyVar.M3(r2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    og.d.m(eyVar, -r2Var.getDialogId(), findTopic, 0);
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
