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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class dx extends fg.m {
    public final /* synthetic */ vy d0;
    public final /* synthetic */ wy e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(wy wyVar, wy wyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, vy vyVar) {
        super(wyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.e0 = wyVar;
        this.d0 = vyVar;
    }

    @Override // fg.m
    public final void J() {
        this.e0.presentFragment(new l());
    }

    @Override // fg.m
    public final void K() {
        wy wyVar = this.e0;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(wyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = wyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle e = org.telegram.ui.Cells.r6.e(0, "step");
            Boolean bool = wyVar.G.has_username;
            if (bool != null) {
                e.putBoolean("forcePublic", bool.booleanValue());
            }
            nd ndVar = new nd(e);
            ndVar.t0 = new m6(wyVar, ndVar, d2Var, 2);
            wyVar.presentFragment(ndVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = wyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{wyVar.getUserConfig().getClientUserId()} : new long[]{wyVar.getUserConfig().getClientUserId(), wyVar.H});
            Boolean bool3 = wyVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            k70 k70Var = new k70(bundle);
            k70Var.Y = new vx(wyVar, d2Var);
            wyVar.presentFragment(k70Var);
        }
    }

    @Override // fg.m
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.p2) this.e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override // fg.m
    public final boolean S() {
        return this.e0.R0 == 0;
    }

    @Override // fg.m, org.telegram.ui.Cells.n2
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
        vy vyVar = this.d0;
        vyVar.a.getClass();
        this.e0.o4(r2Var, RecyclerView.R(r2Var), 0.0f, vyVar.d);
    }

    @Override // fg.m, org.telegram.ui.Cells.n2
    public final void d(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        if (r2Var.getMessage() != null) {
            wy wyVar = this.e0;
            TopicsController topicsController = wyVar.getMessagesController().getTopicsController();
            long j3 = -r2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, MessageObject.getTopicId(i10, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (wyVar.l2) {
                    wyVar.O3(r2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    mg.d.m(wyVar, -r2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // fg.m, s4.h0
    public final void l() {
        h();
        int i10 = vy.L;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        wy wyVar = this.e0;
        if (wyVar.R0 == 15) {
            wyVar.j0.setVisibility(this.U ? 8 : 0);
        }
    }
}
