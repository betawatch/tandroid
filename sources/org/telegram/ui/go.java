package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class go extends zt0 {
    public final /* synthetic */ io a;

    public go(io ioVar) {
        this.a = ioVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        io ioVar = this.a;
        long j10 = ioVar.C0;
        ju0 ju0Var = null;
        if (fileLocation != null) {
            if (ioVar.D0 != null) {
                TLRPC.User user = j10 == 0 ? null : ioVar.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    ioVar.e.getLocationInWindow(iArr);
                    ju0Var = new ju0();
                    ju0Var.b = iArr[0];
                    ju0Var.c = iArr[1];
                    ci.k4 k4Var = ioVar.e;
                    ju0Var.d = k4Var;
                    ImageReceiver imageReceiver = k4Var.getImageReceiver();
                    ju0Var.a = imageReceiver;
                    if (j10 == 0) {
                        j10 = -ioVar.w0;
                    }
                    ju0Var.f = j10;
                    ju0Var.e = imageReceiver.getBitmapSafe();
                    ju0Var.g = -1L;
                    ju0Var.h = ioVar.e.getImageReceiver().getRoundRadius(true);
                    ju0Var.k = ioVar.d.getScaleX();
                    ju0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = ioVar.getMessagesController().getChat(Long.valueOf(ioVar.w0));
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    ioVar.e.getLocationInWindow(iArr2);
                    ju0Var = new ju0();
                    ju0Var.b = iArr2[0];
                    ju0Var.c = iArr2[1];
                    ci.k4 k4Var2 = ioVar.e;
                    ju0Var.d = k4Var2;
                    ImageReceiver imageReceiver2 = k4Var2.getImageReceiver();
                    ju0Var.a = imageReceiver2;
                    if (j10 == 0) {
                    }
                    ju0Var.f = j10;
                    ju0Var.e = imageReceiver2.getBitmapSafe();
                    ju0Var.g = -1L;
                    ju0Var.h = ioVar.e.getImageReceiver().getRoundRadius(true);
                    ju0Var.k = ioVar.d.getScaleX();
                    ju0Var.p = true;
                }
            }
        }
        return ju0Var;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean N() {
        io ioVar = this.a;
        long j10 = ioVar.C0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = ioVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        ioVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.p(str, str2, z10);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final int y() {
        return 1;
    }
}
