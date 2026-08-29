package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class io extends pt0 {
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
    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        ko koVar = this.a;
        long j10 = koVar.y0;
        zt0 zt0Var = null;
        if (fileLocation != null) {
            if (koVar.z0 != null) {
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
                    zt0Var = new zt0();
                    zt0Var.b = iArr[0];
                    zt0Var.c = iArr[1];
                    lh.y3 y3Var = koVar.e;
                    zt0Var.d = y3Var;
                    ImageReceiver imageReceiver = y3Var.getImageReceiver();
                    zt0Var.a = imageReceiver;
                    if (j10 == 0) {
                        j10 = -koVar.s0;
                    }
                    zt0Var.f = j10;
                    zt0Var.e = imageReceiver.getBitmapSafe();
                    zt0Var.g = -1L;
                    zt0Var.h = koVar.e.getImageReceiver().getRoundRadius(true);
                    zt0Var.k = koVar.d.getScaleX();
                    zt0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = koVar.getMessagesController().getChat(Long.valueOf(koVar.s0));
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
                    zt0Var = new zt0();
                    zt0Var.b = iArr2[0];
                    zt0Var.c = iArr2[1];
                    lh.y3 y3Var2 = koVar.e;
                    zt0Var.d = y3Var2;
                    ImageReceiver imageReceiver2 = y3Var2.getImageReceiver();
                    zt0Var.a = imageReceiver2;
                    if (j10 == 0) {
                    }
                    zt0Var.f = j10;
                    zt0Var.e = imageReceiver2.getBitmapSafe();
                    zt0Var.g = -1L;
                    zt0Var.h = koVar.e.getImageReceiver().getRoundRadius(true);
                    zt0Var.k = koVar.d.getScaleX();
                    zt0Var.p = true;
                }
            }
        }
        return zt0Var;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean M() {
        ko koVar = this.a;
        long j10 = koVar.y0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = koVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        koVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new o(this, 2));
        return false;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.q(str, str2, z10);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final int y() {
        return 1;
    }
}
