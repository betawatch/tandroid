package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ob implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ qb a;

    public ob(qb qbVar) {
        this.a = qbVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.n2 K0() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void M0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        ub ubVar = this.a.n;
        if (ubVar.E0) {
            return;
        }
        Object obj = ubVar.C0.containsKey(tL_chatInviteExported.link) ? ubVar.C0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                ub.A0(ubVar, (TLRPC.TL_messages_exportedChatInvite) obj, ubVar.D0);
                return;
            } else {
                org.telegram.messenger.w1.o(R.string.LinkHashExpired, org.telegram.ui.Components.yc.a0(ubVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = ubVar.getMessagesController().getInputPeer(-ubVar.s.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        ubVar.E0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ubVar.getParentActivity(), 3, null);
        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.nb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ob.this.a.n.E0 = false;
                zArr[0] = true;
            }
        });
        b2Var.q(300L);
        int sendRequest = ubVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new bi.c3(this, tL_chatInviteExported, zArr, b2Var, 4));
        ConnectionsManager connectionsManager = ubVar.getConnectionsManager();
        i10 = ((org.telegram.ui.ActionBar.n2) ubVar).classGuid;
        connectionsManager.bindRequestToGuid(sendRequest, i10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final long a() {
        return -this.a.n.s.id;
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ long d() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void i0(org.telegram.ui.Cells.w0 w0Var) {
        ub ubVar = this.a.n;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject.type == 22) {
            bd bdVar = new bd(a());
            bdVar.l0 = ubVar;
            ubVar.presentFragment(bdVar);
            return;
        }
        PhotoViewer.t1().K2(null, ubVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize == null) {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, ubVar.F0);
        } else {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), ubVar.F0);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean j2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        ub ubVar = this.a.n;
        int i10 = ub.X0;
        return ubVar.P0(w0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void r1(long j3) {
        int i10;
        int i11;
        ub ubVar = this.a.n;
        if (j3 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            i11 = ((org.telegram.ui.ActionBar.n2) ubVar).currentAccount;
            if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, ubVar)) {
                ubVar.presentFragment(new co(bundle), true);
                return;
            }
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) ubVar).currentAccount;
        if (j3 != UserConfig.getInstance(i10).getClientUserId()) {
            Bundle e7 = w.f.e(j3, "user_id");
            ub.p0(ubVar, e7, j3);
            ProfileActivity profileActivity = new ProfileActivity(e7, null);
            profileActivity.N4(0);
            ubVar.presentFragment(profileActivity);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void X(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void q0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void s1(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final void K(org.telegram.ui.Cells.w0 w0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void Z1(org.telegram.ui.Cells.w0 w0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void C1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void b0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void b1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void l2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
