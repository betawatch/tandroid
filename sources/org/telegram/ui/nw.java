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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nw extends rf.l {
    public final /* synthetic */ ey Z;
    public final /* synthetic */ fy a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(fy fyVar, fy fyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, ey eyVar) {
        super(fyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.a0 = fyVar;
        this.Z = eyVar;
    }

    @Override // rf.l
    public final void J() {
        this.a0.presentFragment(new n());
    }

    @Override // rf.l
    public final void K() {
        fy fyVar = this.a0;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(fyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = fyVar.C;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle h = a4.w.h(0, "step");
            Boolean bool = fyVar.C.has_username;
            if (bool != null) {
                h.putBoolean("forcePublic", bool.booleanValue());
            }
            hd hdVar = new hd(h);
            hdVar.p0 = new l6(fyVar, hdVar, c2Var, 2);
            fyVar.presentFragment(hdVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = fyVar.C.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{fyVar.getUserConfig().getClientUserId()} : new long[]{fyVar.getUserConfig().getClientUserId(), fyVar.D});
            Boolean bool3 = fyVar.C.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            t60 t60Var = new t60(bundle);
            t60Var.U = new fx(fyVar, c2Var);
            fyVar.presentFragment(t60Var);
        }
    }

    @Override // rf.l
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.o2) this.a0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override // rf.l
    public final boolean S() {
        return this.a0.N0 == 0;
    }

    @Override // rf.l, org.telegram.ui.Cells.l2
    public final void a(org.telegram.ui.Cells.p2 p2Var) {
        ey eyVar = this.Z;
        eyVar.a.getClass();
        this.a0.o4(p2Var, RecyclerView.R(p2Var), 0.0f, eyVar.d);
    }

    @Override // rf.l, org.telegram.ui.Cells.l2
    public final void d(org.telegram.ui.Cells.p2 p2Var) {
        int i10;
        if (p2Var.getMessage() != null) {
            fy fyVar = this.a0;
            TopicsController topicsController = fyVar.getMessagesController().getTopicsController();
            long j10 = -p2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, MessageObject.getTopicId(i10, p2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (fyVar.h2) {
                    fyVar.O3(p2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    yf.d.m(fyVar, -p2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // rf.l, f2.p0
    public final void l() {
        h();
        int i10 = ey.H;
        try {
            super.l();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        fy fyVar = this.a0;
        if (fyVar.N0 == 15) {
            fyVar.f0.setVisibility(this.Q ? 8 : 0);
        }
    }
}
