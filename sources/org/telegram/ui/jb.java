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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jb implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ lb a;

    public jb(lb lbVar) {
        this.a = lbVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void C0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i9;
        pb pbVar = this.a.n;
        if (pbVar.A0) {
            return;
        }
        Object obj = pbVar.y0.containsKey(tL_chatInviteExported.link) ? pbVar.y0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                pb.z0(pbVar, (TLRPC.TL_messages_exportedChatInvite) obj, pbVar.z0);
                return;
            } else {
                org.telegram.messenger.l0.p(R.string.LinkHashExpired, org.telegram.ui.Components.oc.a0(pbVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = pbVar.getMessagesController().getInputPeer(-pbVar.s.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        pbVar.A0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(pbVar.getParentActivity(), 3, null);
        c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ib
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                jb.this.a.n.A0 = false;
                zArr[0] = true;
            }
        });
        c2Var.q(300L);
        int sendRequest = pbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new fh.h1(this, tL_chatInviteExported, zArr, c2Var));
        ConnectionsManager connectionsManager = pbVar.getConnectionsManager();
        i9 = ((org.telegram.ui.ActionBar.o2) pbVar).classGuid;
        connectionsManager.bindRequestToGuid(sendRequest, i9);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void O(org.telegram.ui.Cells.w0 w0Var) {
        pb pbVar = this.a.n;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject.type == 22) {
            xc xcVar = new xc(a());
            xcVar.h0 = pbVar;
            pbVar.presentFragment(xcVar);
            return;
        }
        PhotoViewer.t1().K2(null, pbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize == null) {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, pbVar.B0);
        } else {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), pbVar.B0);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean Z1(org.telegram.ui.Cells.w0 w0Var, float f10, float f11) {
        pb pbVar = this.a.n;
        int i9 = pb.T0;
        return pbVar.P0(w0Var, 0.0f, 0.0f);
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
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void o1(long j10) {
        int i9;
        int i10;
        pb pbVar = this.a.n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            i10 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
            if (MessagesController.getInstance(i10).checkCanOpenChat(bundle, pbVar)) {
                pbVar.presentFragment(new qn(bundle), true);
                return;
            }
            return;
        }
        i9 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
        if (j10 != UserConfig.getInstance(i9).getClientUserId()) {
            Bundle g10 = e2.c.g(j10, "user_id");
            pb.o0(pbVar, g10, j10);
            ProfileActivity profileActivity = new ProfileActivity(g10, null);
            profileActivity.N4(0);
            pbVar.presentFragment(profileActivity);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.o2 y0() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void I(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void c0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void p1(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final void E(org.telegram.ui.Cells.w0 w0Var, int i9) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void N1(org.telegram.ui.Cells.w0 w0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void L(org.telegram.ui.Cells.w0 w0Var, int i9, int i10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void V0(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void v1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void a2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
