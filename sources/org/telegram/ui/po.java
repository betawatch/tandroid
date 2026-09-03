package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class po extends fu0 {
    public final /* synthetic */ ro a;

    public po(ro roVar) {
        this.a = roVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        TLRPC.FileLocation fileLocation2;
        ro roVar = this.a;
        long j10 = roVar.z0;
        qu0 qu0Var = null;
        if (fileLocation != null) {
            if (roVar.A0 != null) {
                TLRPC.User user = j10 == 0 ? null : roVar.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    roVar.e.getLocationInWindow(iArr);
                    qu0Var = new qu0();
                    qu0Var.b = iArr[0];
                    qu0Var.c = iArr[1];
                    nh.y3 y3Var = roVar.e;
                    qu0Var.d = y3Var;
                    ImageReceiver imageReceiver = y3Var.getImageReceiver();
                    qu0Var.a = imageReceiver;
                    if (j10 == 0) {
                        j10 = -roVar.t0;
                    }
                    qu0Var.f = j10;
                    qu0Var.e = imageReceiver.getBitmapSafe();
                    qu0Var.g = -1L;
                    qu0Var.h = roVar.e.getImageReceiver().getRoundRadius(true);
                    qu0Var.k = roVar.d.getScaleX();
                    qu0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = roVar.getMessagesController().getChat(Long.valueOf(roVar.t0));
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    roVar.e.getLocationInWindow(iArr2);
                    qu0Var = new qu0();
                    qu0Var.b = iArr2[0];
                    qu0Var.c = iArr2[1];
                    nh.y3 y3Var2 = roVar.e;
                    qu0Var.d = y3Var2;
                    ImageReceiver imageReceiver2 = y3Var2.getImageReceiver();
                    qu0Var.a = imageReceiver2;
                    if (j10 == 0) {
                    }
                    qu0Var.f = j10;
                    qu0Var.e = imageReceiver2.getBitmapSafe();
                    qu0Var.g = -1L;
                    qu0Var.h = roVar.e.getImageReceiver().getRoundRadius(true);
                    qu0Var.k = roVar.d.getScaleX();
                    qu0Var.p = true;
                }
            }
        }
        return qu0Var;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean M() {
        ro roVar = this.a;
        long j10 = roVar.z0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = roVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        roVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new o(this, 2));
        return false;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void f(String str, String str2, boolean z4) {
        this.a.s.q(str, str2, z4);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final int y() {
        return 1;
    }
}
