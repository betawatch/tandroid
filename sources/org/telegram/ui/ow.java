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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ow extends pf.k {
    public final /* synthetic */ fy Z;
    public final /* synthetic */ gy a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(gy gyVar, gy gyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, fy fyVar) {
        super(gyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.a0 = gyVar;
        this.Z = fyVar;
    }

    @Override // pf.k
    public final void J() {
        this.a0.presentFragment(new m());
    }

    @Override // pf.k
    public final void K() {
        gy gyVar = this.a0;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(gyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = gyVar.C;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle g10 = a9.p.g(0, "step");
            Boolean bool = gyVar.C.has_username;
            if (bool != null) {
                g10.putBoolean("forcePublic", bool.booleanValue());
            }
            id idVar = new id(g10);
            idVar.p0 = new m6(gyVar, idVar, b2Var, 2);
            gyVar.presentFragment(idVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = gyVar.C.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{gyVar.getUserConfig().getClientUserId()} : new long[]{gyVar.getUserConfig().getClientUserId(), gyVar.D});
            Boolean bool3 = gyVar.C.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            u60 u60Var = new u60(bundle);
            u60Var.U = new gx(gyVar, b2Var);
            gyVar.presentFragment(u60Var);
        }
    }

    @Override // pf.k
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.n2) this.a0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override // pf.k
    public final boolean S() {
        return this.a0.N0 == 0;
    }

    @Override // pf.k, org.telegram.ui.Cells.l2
    public final void a(org.telegram.ui.Cells.p2 p2Var) {
        fy fyVar = this.Z;
        fyVar.a.getClass();
        this.a0.o4(p2Var, RecyclerView.R(p2Var), 0.0f, fyVar.d);
    }

    @Override // pf.k, org.telegram.ui.Cells.l2
    public final void d(org.telegram.ui.Cells.p2 p2Var) {
        int i10;
        if (p2Var.getMessage() != null) {
            gy gyVar = this.a0;
            TopicsController topicsController = gyVar.getMessagesController().getTopicsController();
            long j10 = -p2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, MessageObject.getTopicId(i10, p2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (gyVar.h2) {
                    gyVar.O3(p2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    wf.c.m(gyVar, -p2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // pf.k, f2.q0
    public final void l() {
        h();
        int i10 = fy.H;
        try {
            super.l();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        gy gyVar = this.a0;
        if (gyVar.N0 == 15) {
            gyVar.f0.setVisibility(this.Q ? 8 : 0);
        }
    }
}
