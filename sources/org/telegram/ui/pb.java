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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class pb implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ rb a;

    public pb(rb rbVar) {
        this.a = rbVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.n2 P0() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void R0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        vb vbVar = this.a.n;
        if (vbVar.A0) {
            return;
        }
        Object obj = vbVar.y0.containsKey(tL_chatInviteExported.link) ? vbVar.y0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                vb.A0(vbVar, (TLRPC.TL_messages_exportedChatInvite) obj, vbVar.z0);
                return;
            } else {
                org.telegram.messenger.l0.o(R.string.LinkHashExpired, org.telegram.ui.Components.xc.a0(vbVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = vbVar.getMessagesController().getInputPeer(-vbVar.f.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        vbVar.A0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(vbVar.getParentActivity(), 3, null);
        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ob
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                pb.this.a.n.A0 = false;
                zArr[0] = true;
            }
        });
        b2Var.q(300L);
        int sendRequest = vbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new ai.p3(this, tL_chatInviteExported, zArr, b2Var, 4));
        ConnectionsManager connectionsManager = vbVar.getConnectionsManager();
        i10 = ((org.telegram.ui.ActionBar.n2) vbVar).classGuid;
        connectionsManager.bindRequestToGuid(sendRequest, i10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final long a() {
        return -this.a.n.f.id;
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
    public final void l0(org.telegram.ui.Cells.w0 w0Var) {
        vb vbVar = this.a.n;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject.type == 22) {
            bd bdVar = new bd(a());
            bdVar.l0 = vbVar;
            vbVar.presentFragment(bdVar);
            return;
        }
        PhotoViewer.t1().J2(null, vbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize == null) {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, vbVar.B0);
        } else {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), vbVar.B0);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean r2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        vb vbVar = this.a.n;
        int i10 = vb.Q0;
        return vbVar.P0(w0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void y1(long j3) {
        int i10;
        int i11;
        vb vbVar = this.a.n;
        if (j3 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            i11 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
            if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, vbVar)) {
                vbVar.presentFragment(new zn(bundle), true);
                return;
            }
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
        if (j3 != UserConfig.getInstance(i10).getClientUserId()) {
            Bundle e = v7.j0.e(j3, "user_id");
            vb.p0(vbVar, e, j3);
            ProfileActivity profileActivity = new ProfileActivity(e, null);
            profileActivity.N4(0);
            vbVar.presentFragment(profileActivity);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void Z(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void s0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void z1(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final void U(org.telegram.ui.Cells.w0 w0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void h2(org.telegram.ui.Cells.w0 w0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void J1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void h0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void h1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void u2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
