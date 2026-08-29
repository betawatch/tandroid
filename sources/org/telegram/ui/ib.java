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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ib implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ kb a;

    public ib(kb kbVar) {
        this.a = kbVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.o2 O0() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        ob obVar = this.a.n;
        if (obVar.A0) {
            return;
        }
        Object obj = obVar.y0.containsKey(tL_chatInviteExported.link) ? obVar.y0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                ob.A0(obVar, (TLRPC.TL_messages_exportedChatInvite) obj, obVar.z0);
                return;
            } else {
                j7.l1.v(R.string.LinkHashExpired, org.telegram.ui.Components.tc.a0(obVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = obVar.getMessagesController().getInputPeer(-obVar.s.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        obVar.A0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(obVar.getParentActivity(), 3, null);
        c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.hb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ib.this.a.n.A0 = false;
                zArr[0] = true;
            }
        });
        c2Var.q(300L);
        int sendRequest = obVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new ih.c1(this, tL_chatInviteExported, zArr, c2Var));
        ConnectionsManager connectionsManager = obVar.getConnectionsManager();
        i10 = ((org.telegram.ui.ActionBar.o2) obVar).classGuid;
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
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void i0(org.telegram.ui.Cells.v0 v0Var) {
        ob obVar = this.a.n;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject.type == 22) {
            vc vcVar = new vc(a());
            vcVar.h0 = obVar;
            obVar.presentFragment(vcVar);
            return;
        }
        PhotoViewer.t1().K2(null, obVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize == null) {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, obVar.B0);
        } else {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), obVar.B0);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean r2(org.telegram.ui.Cells.v0 v0Var, float f9, float f10) {
        ob obVar = this.a.n;
        int i10 = ob.T0;
        return obVar.P0(v0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void x1(long j10) {
        int i10;
        int i11;
        ob obVar = this.a.n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            i11 = ((org.telegram.ui.ActionBar.o2) obVar).currentAccount;
            if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, obVar)) {
                obVar.presentFragment(new tn(bundle), true);
                return;
            }
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.o2) obVar).currentAccount;
        if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
            Bundle g10 = j7.l1.g(j10, "user_id");
            ob.p0(obVar, g10, j10);
            ProfileActivity profileActivity = new ProfileActivity(g10, null);
            profileActivity.N4(0);
            obVar.presentFragment(profileActivity);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void W(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void q0(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void y1(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final void J(org.telegram.ui.Cells.v0 v0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void h2(org.telegram.ui.Cells.v0 v0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void K1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void b0(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void g1(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void t2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }
}
