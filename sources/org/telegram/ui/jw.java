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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class jw extends hg.m {
    public final /* synthetic */ ay d0;
    public final /* synthetic */ cy e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(cy cyVar, cy cyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, ay ayVar) {
        super(cyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.e0 = cyVar;
        this.d0 = ayVar;
    }

    @Override // hg.m
    public final void J() {
        this.e0.presentFragment(new l());
    }

    @Override // hg.m
    public final void K() {
        cy cyVar = this.e0;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(cyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = cyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle i10 = org.telegram.ui.Cells.c1.i(0, "step");
            Boolean bool = cyVar.G.has_username;
            if (bool != null) {
                i10.putBoolean("forcePublic", bool.booleanValue());
            }
            md mdVar = new md(i10);
            mdVar.t0 = new p6(cyVar, mdVar, b2Var, 2);
            cyVar.presentFragment(mdVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = cyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{cyVar.getUserConfig().getClientUserId()} : new long[]{cyVar.getUserConfig().getClientUserId(), cyVar.H});
            Boolean bool3 = cyVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            s60 s60Var = new s60(bundle);
            s60Var.Y = new bx(cyVar, b2Var);
            cyVar.presentFragment(s60Var);
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
        ay ayVar = this.d0;
        ayVar.a.getClass();
        this.e0.m4(r2Var, RecyclerView.R(r2Var), 0.0f, ayVar.d);
    }

    @Override // hg.m, org.telegram.ui.Cells.n2
    public final void e(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        if (r2Var.getMessage() != null) {
            cy cyVar = this.e0;
            TopicsController topicsController = cyVar.getMessagesController().getTopicsController();
            long j10 = -r2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, MessageObject.getTopicId(i10, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (cyVar.l2) {
                    cyVar.M3(r2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    og.d.m(cyVar, -r2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // hg.m, s4.g0
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
