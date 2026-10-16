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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class fx extends hg.m {
    public final /* synthetic */ xy d0;
    public final /* synthetic */ yy e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(yy yyVar, yy yyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, xy xyVar) {
        super(yyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.e0 = yyVar;
        this.d0 = xyVar;
    }

    @Override // hg.m
    public final void J() {
        this.e0.presentFragment(new l());
    }

    @Override // hg.m
    public final void K() {
        yy yyVar = this.e0;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(yyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = yyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f7 = org.telegram.ui.Cells.c1.f(0, "step");
            Boolean bool = yyVar.G.has_username;
            if (bool != null) {
                f7.putBoolean("forcePublic", bool.booleanValue());
            }
            sd sdVar = new sd(f7);
            sdVar.t0 = new q6(yyVar, sdVar, a2Var, 2);
            yyVar.presentFragment(sdVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = yyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{yyVar.getUserConfig().getClientUserId()} : new long[]{yyVar.getUserConfig().getClientUserId(), yyVar.H});
            Boolean bool3 = yyVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            p70 p70Var = new p70(bundle);
            p70Var.Y = new xx(yyVar, a2Var);
            yyVar.presentFragment(p70Var);
        }
    }

    @Override // hg.m
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.m2) this.e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override // hg.m
    public final boolean S() {
        return this.e0.R0 == 0;
    }

    @Override // hg.m, org.telegram.ui.Cells.o2
    public final void a(org.telegram.ui.Cells.s2 s2Var) {
        xy xyVar = this.d0;
        xyVar.a.getClass();
        this.e0.m4(s2Var, RecyclerView.R(s2Var), 0.0f, xyVar.d);
    }

    @Override // hg.m, org.telegram.ui.Cells.o2
    public final void e(org.telegram.ui.Cells.s2 s2Var) {
        int i10;
        if (s2Var.getMessage() != null) {
            yy yyVar = this.e0;
            TopicsController topicsController = yyVar.getMessagesController().getTopicsController();
            long j10 = -s2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, MessageObject.getTopicId(i10, s2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (yyVar.l2) {
                    yyVar.M3(s2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    og.d.m(yyVar, -s2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // hg.m, s4.g0
    public final void l() {
        h();
        int i10 = xy.L;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        yy yyVar = this.e0;
        if (yyVar.R0 == 15) {
            yyVar.j0.setVisibility(this.U ? 8 : 0);
        }
    }
}
