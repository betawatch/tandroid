package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class no extends lu0 {
    public final /* synthetic */ ro a;

    public no(ro roVar) {
        this.a = roVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        ro roVar = this.a;
        long j3 = roVar.C0;
        vu0 vu0Var = null;
        if (fileLocation != null) {
            if (roVar.D0 != null) {
                TLRPC.User user = j3 == 0 ? null : roVar.getMessagesController().getUser(Long.valueOf(j3));
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
                    vu0Var = new vu0();
                    vu0Var.b = iArr[0];
                    vu0Var.c = iArr[1];
                    ai.y5 y5Var = roVar.e;
                    vu0Var.d = y5Var;
                    ImageReceiver imageReceiver = y5Var.getImageReceiver();
                    vu0Var.a = imageReceiver;
                    if (j3 == 0) {
                        j3 = -roVar.w0;
                    }
                    vu0Var.f = j3;
                    vu0Var.e = imageReceiver.getBitmapSafe();
                    vu0Var.g = -1L;
                    vu0Var.h = roVar.e.getImageReceiver().getRoundRadius(true);
                    vu0Var.k = roVar.d.getScaleX();
                    vu0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = roVar.getMessagesController().getChat(Long.valueOf(roVar.w0));
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
                    vu0Var = new vu0();
                    vu0Var.b = iArr2[0];
                    vu0Var.c = iArr2[1];
                    ai.y5 y5Var2 = roVar.e;
                    vu0Var.d = y5Var2;
                    ImageReceiver imageReceiver2 = y5Var2.getImageReceiver();
                    vu0Var.a = imageReceiver2;
                    if (j3 == 0) {
                    }
                    vu0Var.f = j3;
                    vu0Var.e = imageReceiver2.getBitmapSafe();
                    vu0Var.g = -1L;
                    vu0Var.h = roVar.e.getImageReceiver().getRoundRadius(true);
                    vu0Var.k = roVar.d.getScaleX();
                    vu0Var.p = true;
                }
            }
        }
        return vu0Var;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final boolean M() {
        ro roVar = this.a;
        long j3 = roVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = roVar.getMessagesController().getInputUser(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        roVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.q(str, str2, z10);
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final int y() {
        return 1;
    }
}
