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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class qb implements org.telegram.ui.Cells.s0 {
    public final /* synthetic */ sb a;

    public qb(sb sbVar) {
        this.a = sbVar;
    }

    @Override // org.telegram.ui.Cells.s0
    public final boolean M0(org.telegram.ui.Cells.v0 v0Var, float f7, float f10) {
        wb wbVar = this.a.n;
        int i10 = wb.Q0;
        return wbVar.Q0(v0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.s0
    public final long a() {
        return -this.a.n.f.id;
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Cells.s0
    public final void i0(long j10) {
        int i10;
        int i11;
        wb wbVar = this.a.n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            i11 = ((org.telegram.ui.ActionBar.r2) wbVar).currentAccount;
            if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, wbVar)) {
                wbVar.presentFragment(new un(bundle), true);
                return;
            }
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.r2) wbVar).currentAccount;
        if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
            Bundle h = a1.g.h(j10, "user_id");
            wb.q0(wbVar, h, j10);
            ProfileActivity profileActivity = new ProfileActivity(h, null);
            profileActivity.X4(0);
            wbVar.presentFragment(profileActivity);
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final void k(org.telegram.ui.Cells.v0 v0Var) {
        wb wbVar = this.a.n;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject.type == 22) {
            bd bdVar = new bd(a());
            bdVar.l0 = wbVar;
            wbVar.presentFragment(bdVar);
            return;
        }
        PhotoViewer.u1().M2(null, wbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize == null) {
            PhotoViewer.u1().h2(messageObject, null, 0L, 0L, 0L, wbVar.B0);
        } else {
            PhotoViewer.u1().f2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), wbVar.B0);
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final org.telegram.ui.ActionBar.r2 y() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.s0
    public final void z(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        wb wbVar = this.a.n;
        if (wbVar.A0) {
            return;
        }
        Object obj = wbVar.y0.containsKey(tL_chatInviteExported.link) ? wbVar.y0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                wb.B0(wbVar, (TLRPC.TL_messages_exportedChatInvite) obj, wbVar.z0);
                return;
            } else {
                org.telegram.messenger.t.q(R.string.LinkHashExpired, org.telegram.ui.Components.wc.b0(wbVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = wbVar.getMessagesController().getInputPeer(-wbVar.f.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        wbVar.A0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(wbVar.getParentActivity(), 3, null);
        e2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.pb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                qb.this.a.n.A0 = false;
                zArr[0] = true;
            }
        });
        e2Var.r(300L);
        int sendRequest = wbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new bi.i2(this, tL_chatInviteExported, zArr, e2Var, 9));
        ConnectionsManager connectionsManager = wbVar.getConnectionsManager();
        i10 = ((org.telegram.ui.ActionBar.r2) wbVar).classGuid;
        connectionsManager.bindRequestToGuid(sendRequest, i10);
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void f(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void l0(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void t(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void H0(org.telegram.ui.Cells.v0 v0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final void e(org.telegram.ui.Cells.v0 v0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void G(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void g(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void v0(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void P0(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
