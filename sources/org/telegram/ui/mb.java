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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class mb implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ ob a;

    public mb(ob obVar) {
        this.a = obVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void A1(long j10) {
        int i10;
        int i11;
        sb sbVar = this.a.n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            i11 = ((org.telegram.ui.ActionBar.p2) sbVar).currentAccount;
            if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, sbVar)) {
                sbVar.presentFragment(new xn(bundle), true);
                return;
            }
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) sbVar).currentAccount;
        if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
            Bundle g10 = kh.a2.g(j10, "user_id");
            sb.p0(sbVar, g10, j10);
            ProfileActivity profileActivity = new ProfileActivity(g10, null);
            profileActivity.N4(0);
            sbVar.presentFragment(profileActivity);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.p2 Q0() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void S0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        sb sbVar = this.a.n;
        if (sbVar.B0) {
            return;
        }
        Object obj = sbVar.z0.containsKey(tL_chatInviteExported.link) ? sbVar.z0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                sb.A0(sbVar, (TLRPC.TL_messages_exportedChatInvite) obj, sbVar.A0);
                return;
            } else {
                kh.a2.v(R.string.LinkHashExpired, org.telegram.ui.Components.qc.a0(sbVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = sbVar.getMessagesController().getInputPeer(-sbVar.s.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        sbVar.B0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(sbVar.getParentActivity(), 3, null);
        d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.lb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                mb.this.a.n.B0 = false;
                zArr[0] = true;
            }
        });
        d2Var.q(300L);
        int sendRequest = sbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new kh.b1(this, tL_chatInviteExported, zArr, d2Var));
        ConnectionsManager connectionsManager = sbVar.getConnectionsManager();
        i10 = ((org.telegram.ui.ActionBar.p2) sbVar).classGuid;
        connectionsManager.bindRequestToGuid(sendRequest, i10);
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
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void m0(org.telegram.ui.Cells.v0 v0Var) {
        sb sbVar = this.a.n;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject.type == 22) {
            bd bdVar = new bd(a());
            bdVar.i0 = sbVar;
            sbVar.presentFragment(bdVar);
            return;
        }
        PhotoViewer.t1().K2(null, sbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize == null) {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, sbVar.C0);
        } else {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), sbVar.C0);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean u2(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        sb sbVar = this.a.n;
        int i10 = sb.U0;
        return sbVar.P0(v0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void B1(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void c0(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void t0(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final void J(org.telegram.ui.Cells.v0 v0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void l2(org.telegram.ui.Cells.v0 v0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void L1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void i1(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void j0(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void x2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }
}
