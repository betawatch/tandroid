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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lw extends of.m {
    public final /* synthetic */ cy Z;
    public final /* synthetic */ dy a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(dy dyVar, dy dyVar2, Context context, int i9, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, cy cyVar) {
        super(dyVar2, context, i9, i10, z10, arrayList, i11, requestPeerType);
        this.a0 = dyVar;
        this.Z = cyVar;
    }

    @Override // of.m
    public final void J() {
        this.a0.presentFragment(new l());
    }

    @Override // of.m
    public final void K() {
        dy dyVar = this.a0;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(dyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = dyVar.C;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle h = aa.d.h(0, "step");
            Boolean bool = dyVar.C.has_username;
            if (bool != null) {
                h.putBoolean("forcePublic", bool.booleanValue());
            }
            id idVar = new id(h);
            idVar.p0 = new l6(dyVar, idVar, c2Var, 2);
            dyVar.presentFragment(idVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = dyVar.C.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{dyVar.getUserConfig().getClientUserId()} : new long[]{dyVar.getUserConfig().getClientUserId(), dyVar.D});
            Boolean bool3 = dyVar.C.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            r60 r60Var = new r60(bundle);
            r60Var.U = new dx(dyVar, c2Var);
            dyVar.presentFragment(r60Var);
        }
    }

    @Override // of.m
    public final void L(TLRPC.User user) {
        int i9;
        i9 = ((org.telegram.ui.ActionBar.o2) this.a0).currentAccount;
        MessagesController.getInstance(i9).openApp(user, 0);
    }

    @Override // of.m
    public final boolean S() {
        return this.a0.N0 == 0;
    }

    @Override // of.m, org.telegram.ui.Cells.n2
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
        cy cyVar = this.Z;
        cyVar.a.getClass();
        this.a0.o4(r2Var, RecyclerView.R(r2Var), 0.0f, cyVar.d);
    }

    @Override // of.m, org.telegram.ui.Cells.n2
    public final void d(org.telegram.ui.Cells.r2 r2Var) {
        int i9;
        if (r2Var.getMessage() != null) {
            dy dyVar = this.a0;
            TopicsController topicsController = dyVar.getMessagesController().getTopicsController();
            long j10 = -r2Var.getDialogId();
            i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, MessageObject.getTopicId(i9, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (dyVar.h2) {
                    dyVar.O3(r2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    vf.c.m(dyVar, -r2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // of.m, f2.r0
    public final void l() {
        h();
        int i9 = cy.H;
        try {
            super.l();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        dy dyVar = this.a0;
        if (dyVar.N0 == 15) {
            dyVar.f0.setVisibility(this.Q ? 8 : 0);
        }
    }
}
