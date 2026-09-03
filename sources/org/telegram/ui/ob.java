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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ob implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ qb a;

    public ob(qb qbVar) {
        this.a = qbVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void C1(long j10) {
        int i10;
        int i11;
        ub ubVar = this.a.n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            i11 = ((org.telegram.ui.ActionBar.p2) ubVar).currentAccount;
            if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, ubVar)) {
                ubVar.presentFragment(new zn(bundle), true);
                return;
            }
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) ubVar).currentAccount;
        if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
            Bundle g10 = kf.k0.g(j10, "user_id");
            ub.p0(ubVar, g10, j10);
            ProfileActivity profileActivity = new ProfileActivity(g10, null);
            profileActivity.N4(0);
            ubVar.presentFragment(profileActivity);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.p2 T0() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void V0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        ub ubVar = this.a.n;
        if (ubVar.B0) {
            return;
        }
        Object obj = ubVar.z0.containsKey(tL_chatInviteExported.link) ? ubVar.z0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                ub.A0(ubVar, (TLRPC.TL_messages_exportedChatInvite) obj, ubVar.A0);
                return;
            } else {
                kf.k0.v(R.string.LinkHashExpired, org.telegram.ui.Components.qc.a0(ubVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = ubVar.getMessagesController().getInputPeer(-ubVar.s.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        ubVar.B0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ubVar.getParentActivity(), 3, null);
        d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.nb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ob.this.a.n.B0 = false;
                zArr[0] = true;
            }
        });
        d2Var.q(300L);
        int sendRequest = ubVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new kh.b1(this, tL_chatInviteExported, zArr, d2Var));
        ConnectionsManager connectionsManager = ubVar.getConnectionsManager();
        i10 = ((org.telegram.ui.ActionBar.p2) ubVar).classGuid;
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
    public final void o0(org.telegram.ui.Cells.v0 v0Var) {
        ub ubVar = this.a.n;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject.type == 22) {
            dd ddVar = new dd(a());
            ddVar.i0 = ubVar;
            ubVar.presentFragment(ddVar);
            return;
        }
        PhotoViewer.t1().K2(null, ubVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize == null) {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, ubVar.C0);
        } else {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), ubVar.C0);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean w2(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        ub ubVar = this.a.n;
        int i10 = ub.U0;
        return ubVar.P0(v0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void D1(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void b0(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void w0(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final void V(org.telegram.ui.Cells.v0 v0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void m2(org.telegram.ui.Cells.v0 v0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void N1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void j0(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void l1(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void y2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }
}
