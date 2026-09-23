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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ob implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ qb a;

    public ob(qb qbVar) {
        this.a = qbVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.n2 O0() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        ub ubVar = this.a.n;
        if (ubVar.A0) {
            return;
        }
        Object obj = ubVar.y0.containsKey(tL_chatInviteExported.link) ? ubVar.y0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                ub.A0(ubVar, (TLRPC.TL_messages_exportedChatInvite) obj, ubVar.z0);
                return;
            } else {
                org.telegram.messenger.z0.o(R.string.LinkHashExpired, org.telegram.ui.Components.xc.a0(ubVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = ubVar.getMessagesController().getInputPeer(-ubVar.f.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        ubVar.A0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ubVar.getParentActivity(), 3, null);
        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.nb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ob.this.a.n.A0 = false;
                zArr[0] = true;
            }
        });
        b2Var.q(300L);
        int sendRequest = ubVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new ai.p3(this, tL_chatInviteExported, zArr, b2Var, 4));
        ConnectionsManager connectionsManager = ubVar.getConnectionsManager();
        i10 = ((org.telegram.ui.ActionBar.n2) ubVar).classGuid;
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
    public final void k0(org.telegram.ui.Cells.w0 w0Var) {
        ub ubVar = this.a.n;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject.type == 22) {
            ad adVar = new ad(a());
            adVar.l0 = ubVar;
            ubVar.presentFragment(adVar);
            return;
        }
        PhotoViewer.t1().J2(null, ubVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize == null) {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, ubVar.B0);
        } else {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), ubVar.B0);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean r2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        ub ubVar = this.a.n;
        int i10 = ub.Q0;
        return ubVar.P0(w0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void x1(long j3) {
        int i10;
        int i11;
        ub ubVar = this.a.n;
        if (j3 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            i11 = ((org.telegram.ui.ActionBar.n2) ubVar).currentAccount;
            if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, ubVar)) {
                ubVar.presentFragment(new xn(bundle), true);
                return;
            }
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) ubVar).currentAccount;
        if (j3 != UserConfig.getInstance(i10).getClientUserId()) {
            Bundle e = w.c.e(j3, "user_id");
            ub.p0(ubVar, e, j3);
            ProfileActivity profileActivity = new ProfileActivity(e, null);
            profileActivity.N4(0);
            ubVar.presentFragment(profileActivity);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void Z(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void r0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void y1(org.telegram.ui.Cells.w0 w0Var) {
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
    public final /* synthetic */ void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void g1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void u2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
