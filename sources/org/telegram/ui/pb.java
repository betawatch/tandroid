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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class pb implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ rb a;

    public pb(rb rbVar) {
        this.a = rbVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.n2 L0() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void N0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
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
                org.telegram.messenger.g0.q(R.string.LinkHashExpired, org.telegram.ui.Components.xc.a0(vbVar), R.raw.linkbroken, 36);
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
        b2Var.r(300L);
        int sendRequest = vbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new ai.k2(this, tL_chatInviteExported, zArr, b2Var, 9));
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
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean h2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        vb vbVar = this.a.n;
        int i10 = vb.Q0;
        return vbVar.P0(w0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void k0(org.telegram.ui.Cells.w0 w0Var) {
        vb vbVar = this.a.n;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject.type == 22) {
            bd bdVar = new bd(a());
            bdVar.l0 = vbVar;
            vbVar.presentFragment(bdVar);
            return;
        }
        PhotoViewer.t1().K2(null, vbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize == null) {
            PhotoViewer.t1().d2(messageObject, null, 0L, 0L, 0L, vbVar.B0);
        } else {
            PhotoViewer.t1().e2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), vbVar.B0);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void s1(long j10) {
        int i10;
        int i11;
        vb vbVar = this.a.n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            i11 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
            if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, vbVar)) {
                vbVar.presentFragment(new qn(bundle), true);
                return;
            }
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
        if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
            Bundle b10 = zf.d0.b(j10, "user_id");
            vb.p0(vbVar, b10, j10);
            ProfileActivity profileActivity = new ProfileActivity(b10, null);
            profileActivity.N4(0);
            vbVar.presentFragment(profileActivity);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void b0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void r0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void t1(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final void X(org.telegram.ui.Cells.w0 w0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void X1(org.telegram.ui.Cells.w0 w0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void C1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void c1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void k2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
