package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ho extends st0 {
    public final /* synthetic */ jo a;

    public ho(jo joVar) {
        this.a = joVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        jo joVar = this.a;
        long j10 = joVar.y0;
        cu0 cu0Var = null;
        if (fileLocation != null) {
            if (joVar.z0 != null) {
                TLRPC.User user = j10 == 0 ? null : joVar.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    joVar.e.getLocationInWindow(iArr);
                    cu0Var = new cu0();
                    cu0Var.b = iArr[0];
                    cu0Var.c = iArr[1];
                    jh.z3 z3Var = joVar.e;
                    cu0Var.d = z3Var;
                    ImageReceiver imageReceiver = z3Var.getImageReceiver();
                    cu0Var.a = imageReceiver;
                    if (j10 == 0) {
                        j10 = -joVar.s0;
                    }
                    cu0Var.f = j10;
                    cu0Var.e = imageReceiver.getBitmapSafe();
                    cu0Var.g = -1L;
                    cu0Var.h = joVar.e.getImageReceiver().getRoundRadius(true);
                    cu0Var.k = joVar.d.getScaleX();
                    cu0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = joVar.getMessagesController().getChat(Long.valueOf(joVar.s0));
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    joVar.e.getLocationInWindow(iArr2);
                    cu0Var = new cu0();
                    cu0Var.b = iArr2[0];
                    cu0Var.c = iArr2[1];
                    jh.z3 z3Var2 = joVar.e;
                    cu0Var.d = z3Var2;
                    ImageReceiver imageReceiver2 = z3Var2.getImageReceiver();
                    cu0Var.a = imageReceiver2;
                    if (j10 == 0) {
                    }
                    cu0Var.f = j10;
                    cu0Var.e = imageReceiver2.getBitmapSafe();
                    cu0Var.g = -1L;
                    cu0Var.h = joVar.e.getImageReceiver().getRoundRadius(true);
                    cu0Var.k = joVar.d.getScaleX();
                    cu0Var.p = true;
                }
            }
        }
        return cu0Var;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean M() {
        jo joVar = this.a;
        long j10 = joVar.y0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = joVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        joVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new n(this, 2));
        return false;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.q(str, str2, z10);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final int y() {
        return 1;
    }
}
