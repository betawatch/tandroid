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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ax extends gg.m {
    public final /* synthetic */ sy d0;
    public final /* synthetic */ ty e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(ty tyVar, ty tyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, sy syVar) {
        super(tyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.e0 = tyVar;
        this.d0 = syVar;
    }

    @Override // gg.m
    public final void J() {
        this.e0.presentFragment(new l());
    }

    @Override // gg.m
    public final void K() {
        ty tyVar = this.e0;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(tyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = tyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f7 = org.telegram.ui.Cells.c1.f(0, "step");
            Boolean bool = tyVar.G.has_username;
            if (bool != null) {
                f7.putBoolean("forcePublic", bool.booleanValue());
            }
            md mdVar = new md(f7);
            mdVar.t0 = new l6(tyVar, mdVar, b2Var, 2);
            tyVar.presentFragment(mdVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = tyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{tyVar.getUserConfig().getClientUserId()} : new long[]{tyVar.getUserConfig().getClientUserId(), tyVar.H});
            Boolean bool3 = tyVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            j70 j70Var = new j70(bundle);
            j70Var.Y = new sx(tyVar, b2Var);
            tyVar.presentFragment(j70Var);
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

    @Override // gg.m, org.telegram.ui.Cells.o2
    public final void a(org.telegram.ui.Cells.s2 s2Var) {
        sy syVar = this.d0;
        syVar.a.getClass();
        this.e0.l4(s2Var, RecyclerView.R(s2Var), 0.0f, syVar.d);
    }

    @Override // gg.m, org.telegram.ui.Cells.o2
    public final void d(org.telegram.ui.Cells.s2 s2Var) {
        int i10;
        if (s2Var.getMessage() != null) {
            ty tyVar = this.e0;
            TopicsController topicsController = tyVar.getMessagesController().getTopicsController();
            long j3 = -s2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, MessageObject.getTopicId(i10, s2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (tyVar.l2) {
                    tyVar.L3(s2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    ng.d.m(tyVar, -s2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // gg.m, s4.i0
    public final void l() {
        h();
        int i10 = sy.L;
        try {
            super.l();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        ty tyVar = this.e0;
        if (tyVar.R0 == 15) {
            tyVar.j0.setVisibility(this.U ? 8 : 0);
        }
    }
}
