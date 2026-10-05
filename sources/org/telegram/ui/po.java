package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class po extends ou0 {
    public final /* synthetic */ to a;

    public po(to toVar) {
        this.a = toVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        to toVar = this.a;
        long j3 = toVar.C0;
        yu0 yu0Var = null;
        if (fileLocation != null) {
            if (toVar.D0 != null) {
                TLRPC.User user = j3 == 0 ? null : toVar.getMessagesController().getUser(Long.valueOf(j3));
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    toVar.e.getLocationInWindow(iArr);
                    yu0Var = new yu0();
                    yu0Var.b = iArr[0];
                    yu0Var.c = iArr[1];
                    ai.y5 y5Var = toVar.e;
                    yu0Var.d = y5Var;
                    ImageReceiver imageReceiver = y5Var.getImageReceiver();
                    yu0Var.a = imageReceiver;
                    if (j3 == 0) {
                        j3 = -toVar.w0;
                    }
                    yu0Var.f = j3;
                    yu0Var.e = imageReceiver.getBitmapSafe();
                    yu0Var.g = -1L;
                    yu0Var.h = toVar.e.getImageReceiver().getRoundRadius(true);
                    yu0Var.k = toVar.d.getScaleX();
                    yu0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = toVar.getMessagesController().getChat(Long.valueOf(toVar.w0));
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    toVar.e.getLocationInWindow(iArr2);
                    yu0Var = new yu0();
                    yu0Var.b = iArr2[0];
                    yu0Var.c = iArr2[1];
                    ai.y5 y5Var2 = toVar.e;
                    yu0Var.d = y5Var2;
                    ImageReceiver imageReceiver2 = y5Var2.getImageReceiver();
                    yu0Var.a = imageReceiver2;
                    if (j3 == 0) {
                    }
                    yu0Var.f = j3;
                    yu0Var.e = imageReceiver2.getBitmapSafe();
                    yu0Var.g = -1L;
                    yu0Var.h = toVar.e.getImageReceiver().getRoundRadius(true);
                    yu0Var.k = toVar.d.getScaleX();
                    yu0Var.p = true;
                }
            }
        }
        return yu0Var;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean M() {
        to toVar = this.a;
        long j3 = toVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = toVar.getMessagesController().getInputUser(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        toVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.q(str, str2, z10);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final int y() {
        return 1;
    }
}
