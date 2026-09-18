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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class qb implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ sb a;

    public qb(sb sbVar) {
        this.a = sbVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.o2 O0() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        wb wbVar = this.a.n;
        if (wbVar.A0) {
            return;
        }
        Object obj = wbVar.y0.containsKey(tL_chatInviteExported.link) ? wbVar.y0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                wb.A0(wbVar, (TLRPC.TL_messages_exportedChatInvite) obj, wbVar.z0);
                return;
            } else {
                org.telegram.messenger.w1.o(R.string.LinkHashExpired, org.telegram.ui.Components.vc.a0(wbVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = wbVar.getMessagesController().getInputPeer(-wbVar.f.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        wbVar.A0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(wbVar.getParentActivity(), 3, null);
        c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.pb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                qb.this.a.n.A0 = false;
                zArr[0] = true;
            }
        });
        c2Var.q(300L);
        int sendRequest = wbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new ai.p3(this, tL_chatInviteExported, zArr, c2Var, 4));
        ConnectionsManager connectionsManager = wbVar.getConnectionsManager();
        i10 = ((org.telegram.ui.ActionBar.o2) wbVar).classGuid;
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
        wb wbVar = this.a.n;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject.type == 22) {
            cd cdVar = new cd(a());
            cdVar.l0 = wbVar;
            wbVar.presentFragment(cdVar);
            return;
        }
        PhotoViewer.t1().J2(null, wbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize == null) {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, wbVar.B0);
        } else {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), wbVar.B0);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean r2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        wb wbVar = this.a.n;
        int i10 = wb.Q0;
        return wbVar.P0(w0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void x1(long j3) {
        int i10;
        int i11;
        wb wbVar = this.a.n;
        if (j3 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            i11 = ((org.telegram.ui.ActionBar.o2) wbVar).currentAccount;
            if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, wbVar)) {
                wbVar.presentFragment(new bo(bundle), true);
                return;
            }
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.o2) wbVar).currentAccount;
        if (j3 != UserConfig.getInstance(i10).getClientUserId()) {
            Bundle e = w.f.e(j3, "user_id");
            wb.p0(wbVar, e, j3);
            ProfileActivity profileActivity = new ProfileActivity(e, null);
            profileActivity.N4(0);
            wbVar.presentFragment(profileActivity);
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
