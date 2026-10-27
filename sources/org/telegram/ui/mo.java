package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mo extends iu0 {
    public final /* synthetic */ oo a;

    public mo(oo ooVar) {
        this.a = ooVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        oo ooVar = this.a;
        long j10 = ooVar.B0;
        su0 su0Var = null;
        if (fileLocation != null) {
            if (ooVar.C0 != null) {
                TLRPC.User user = j10 == 0 ? null : ooVar.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    ooVar.e.getLocationInWindow(iArr);
                    su0Var = new su0();
                    su0Var.b = iArr[0];
                    su0Var.c = iArr[1];
                    di.k4 k4Var = ooVar.e;
                    su0Var.d = k4Var;
                    ImageReceiver imageReceiver = k4Var.getImageReceiver();
                    su0Var.a = imageReceiver;
                    if (j10 == 0) {
                        j10 = -ooVar.v0;
                    }
                    su0Var.f = j10;
                    su0Var.e = imageReceiver.getBitmapSafe();
                    su0Var.g = -1L;
                    su0Var.h = ooVar.e.getImageReceiver().getRoundRadius(true);
                    su0Var.k = ooVar.d.getScaleX();
                    su0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = ooVar.getMessagesController().getChat(Long.valueOf(ooVar.v0));
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    ooVar.e.getLocationInWindow(iArr2);
                    su0Var = new su0();
                    su0Var.b = iArr2[0];
                    su0Var.c = iArr2[1];
                    di.k4 k4Var2 = ooVar.e;
                    su0Var.d = k4Var2;
                    ImageReceiver imageReceiver2 = k4Var2.getImageReceiver();
                    su0Var.a = imageReceiver2;
                    if (j10 == 0) {
                    }
                    su0Var.f = j10;
                    su0Var.e = imageReceiver2.getBitmapSafe();
                    su0Var.g = -1L;
                    su0Var.h = ooVar.e.getImageReceiver().getRoundRadius(true);
                    su0Var.k = ooVar.d.getScaleX();
                    su0Var.p = true;
                }
            }
        }
        return su0Var;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean N() {
        oo ooVar = this.a;
        long j10 = ooVar.B0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = ooVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        ooVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new l(this, 2));
        return false;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.p(str, str2, z10);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final int y() {
        return 1;
    }
}
