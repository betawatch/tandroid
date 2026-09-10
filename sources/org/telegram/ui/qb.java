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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qb implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ sb a;

    public qb(sb sbVar) {
        this.a = sbVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.p2 O0() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        wb wbVar = this.a.n;
        if (wbVar.E0) {
            return;
        }
        Object obj = wbVar.C0.containsKey(tL_chatInviteExported.link) ? wbVar.C0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                wb.A0(wbVar, (TLRPC.TL_messages_exportedChatInvite) obj, wbVar.D0);
                return;
            } else {
                org.telegram.messenger.a2.o(R.string.LinkHashExpired, org.telegram.ui.Components.wc.a0(wbVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = wbVar.getMessagesController().getInputPeer(-wbVar.s.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        wbVar.E0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(wbVar.getParentActivity(), 3, null);
        d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.pb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                qb.this.a.n.E0 = false;
                zArr[0] = true;
            }
        });
        d2Var.q(300L);
        int sendRequest = wbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new bi.l9(this, tL_chatInviteExported, zArr, d2Var, 3));
        ConnectionsManager connectionsManager = wbVar.getConnectionsManager();
        i10 = ((org.telegram.ui.ActionBar.p2) wbVar).classGuid;
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
    public final void k0(org.telegram.ui.Cells.w0 w0Var) {
        wb wbVar = this.a.n;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject.type == 22) {
            cd cdVar = new cd(a());
            cdVar.l0 = wbVar;
            wbVar.presentFragment(cdVar);
            return;
        }
        PhotoViewer.t1().K2(null, wbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize == null) {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, wbVar.F0);
        } else {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), wbVar.F0);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean p2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        wb wbVar = this.a.n;
        int i10 = wb.X0;
        return wbVar.P0(w0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void w1(long j3) {
        int i10;
        int i11;
        wb wbVar = this.a.n;
        if (j3 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            i11 = ((org.telegram.ui.ActionBar.p2) wbVar).currentAccount;
            if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, wbVar)) {
                wbVar.presentFragment(new eo(bundle), true);
                return;
            }
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) wbVar).currentAccount;
        if (j3 != UserConfig.getInstance(i10).getClientUserId()) {
            Bundle e = w.f.e(j3, "user_id");
            wb.p0(wbVar, e, j3);
            ProfileActivity profileActivity = new ProfileActivity(e, null);
            profileActivity.N4(0);
            wbVar.presentFragment(profileActivity);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void a0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void r0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void x1(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final void V(org.telegram.ui.Cells.w0 w0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void f2(org.telegram.ui.Cells.w0 w0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void H1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void f1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void s2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
