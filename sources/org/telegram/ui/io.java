package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class io extends bu0 {
    public final /* synthetic */ ko a;

    public io(ko koVar) {
        this.a = koVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        ko koVar = this.a;
        long j10 = koVar.C0;
        lu0 lu0Var = null;
        if (fileLocation != null) {
            if (koVar.D0 != null) {
                TLRPC.User user = j10 == 0 ? null : koVar.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    koVar.e.getLocationInWindow(iArr);
                    lu0Var = new lu0();
                    lu0Var.b = iArr[0];
                    lu0Var.c = iArr[1];
                    ci.j4 j4Var = koVar.e;
                    lu0Var.d = j4Var;
                    ImageReceiver imageReceiver = j4Var.getImageReceiver();
                    lu0Var.a = imageReceiver;
                    if (j10 == 0) {
                        j10 = -koVar.w0;
                    }
                    lu0Var.f = j10;
                    lu0Var.e = imageReceiver.getBitmapSafe();
                    lu0Var.g = -1L;
                    lu0Var.h = koVar.e.getImageReceiver().getRoundRadius(true);
                    lu0Var.k = koVar.d.getScaleX();
                    lu0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = koVar.getMessagesController().getChat(Long.valueOf(koVar.w0));
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    koVar.e.getLocationInWindow(iArr2);
                    lu0Var = new lu0();
                    lu0Var.b = iArr2[0];
                    lu0Var.c = iArr2[1];
                    ci.j4 j4Var2 = koVar.e;
                    lu0Var.d = j4Var2;
                    ImageReceiver imageReceiver2 = j4Var2.getImageReceiver();
                    lu0Var.a = imageReceiver2;
                    if (j10 == 0) {
                    }
                    lu0Var.f = j10;
                    lu0Var.e = imageReceiver2.getBitmapSafe();
                    lu0Var.g = -1L;
                    lu0Var.h = koVar.e.getImageReceiver().getRoundRadius(true);
                    lu0Var.k = koVar.d.getScaleX();
                    lu0Var.p = true;
                }
            }
        }
        return lu0Var;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean N() {
        ko koVar = this.a;
        long j10 = koVar.C0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = koVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        koVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.p(str, str2, z10);
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final int y() {
        return 1;
    }
}
