package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class no extends au0 {
    public final /* synthetic */ po a;

    public no(po poVar) {
        this.a = poVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        TLRPC.FileLocation fileLocation2;
        po poVar = this.a;
        long j10 = poVar.z0;
        lu0 lu0Var = null;
        if (fileLocation != null) {
            if (poVar.A0 != null) {
                TLRPC.User user = j10 == 0 ? null : poVar.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    poVar.e.getLocationInWindow(iArr);
                    lu0Var = new lu0();
                    lu0Var.b = iArr[0];
                    lu0Var.c = iArr[1];
                    oh.a4 a4Var = poVar.e;
                    lu0Var.d = a4Var;
                    ImageReceiver imageReceiver = a4Var.getImageReceiver();
                    lu0Var.a = imageReceiver;
                    if (j10 == 0) {
                        j10 = -poVar.t0;
                    }
                    lu0Var.f = j10;
                    lu0Var.e = imageReceiver.getBitmapSafe();
                    lu0Var.g = -1L;
                    lu0Var.h = poVar.e.getImageReceiver().getRoundRadius(true);
                    lu0Var.k = poVar.d.getScaleX();
                    lu0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = poVar.getMessagesController().getChat(Long.valueOf(poVar.t0));
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    poVar.e.getLocationInWindow(iArr2);
                    lu0Var = new lu0();
                    lu0Var.b = iArr2[0];
                    lu0Var.c = iArr2[1];
                    oh.a4 a4Var2 = poVar.e;
                    lu0Var.d = a4Var2;
                    ImageReceiver imageReceiver2 = a4Var2.getImageReceiver();
                    lu0Var.a = imageReceiver2;
                    if (j10 == 0) {
                    }
                    lu0Var.f = j10;
                    lu0Var.e = imageReceiver2.getBitmapSafe();
                    lu0Var.g = -1L;
                    lu0Var.h = poVar.e.getImageReceiver().getRoundRadius(true);
                    lu0Var.k = poVar.d.getScaleX();
                    lu0Var.p = true;
                }
            }
        }
        return lu0Var;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean M() {
        po poVar = this.a;
        long j10 = poVar.z0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = poVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        poVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new o(this, 2));
        return false;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void f(String str, String str2, boolean z4) {
        this.a.s.q(str, str2, z4);
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final int y() {
        return 1;
    }
}
