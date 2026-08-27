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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kb implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ mb a;

    public kb(mb mbVar) {
        this.a = mbVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void K(org.telegram.ui.Cells.v0 v0Var) {
        qb qbVar = this.a.n;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject.type == 22) {
            xc xcVar = new xc(a());
            xcVar.h0 = qbVar;
            qbVar.presentFragment(xcVar);
            return;
        }
        PhotoViewer.t1().K2(null, qbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize == null) {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, qbVar.B0);
        } else {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), qbVar.B0);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final long a() {
        return -this.a.n.s.id;
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean g2(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        qb qbVar = this.a.n;
        int i10 = qb.T0;
        return qbVar.P0(v0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void p1(long j10) {
        int i10;
        int i11;
        qb qbVar = this.a.n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            i11 = ((org.telegram.ui.ActionBar.n2) qbVar).currentAccount;
            if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, qbVar)) {
                qbVar.presentFragment(new rn(bundle), true);
                return;
            }
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) qbVar).currentAccount;
        if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
            Bundle h = com.google.android.recaptcha.internal.a.h(j10, "user_id");
            qb.p0(qbVar, h, j10);
            ProfileActivity profileActivity = new ProfileActivity(h, null);
            profileActivity.N4(0);
            qbVar.presentFragment(profileActivity);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.n2 y0() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void z0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        qb qbVar = this.a.n;
        if (qbVar.A0) {
            return;
        }
        Object obj = qbVar.y0.containsKey(tL_chatInviteExported.link) ? qbVar.y0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                qb.A0(qbVar, (TLRPC.TL_messages_exportedChatInvite) obj, qbVar.z0);
                return;
            } else {
                org.telegram.messenger.y1.q(R.string.LinkHashExpired, org.telegram.ui.Components.mc.a0(qbVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = qbVar.getMessagesController().getInputPeer(-qbVar.s.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        qbVar.A0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(qbVar.getParentActivity(), 3, null);
        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.jb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                kb.this.a.n.A0 = false;
                zArr[0] = true;
            }
        });
        b2Var.q(300L);
        int sendRequest = qbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new gh.f1(this, tL_chatInviteExported, zArr, b2Var));
        ConnectionsManager connectionsManager = qbVar.getConnectionsManager();
        i10 = ((org.telegram.ui.ActionBar.n2) qbVar).classGuid;
        connectionsManager.bindRequestToGuid(sendRequest, i10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void I(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void S(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void q1(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final void C(org.telegram.ui.Cells.v0 v0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void T1(org.telegram.ui.Cells.v0 v0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void A1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void J(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void Z0(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void j2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
