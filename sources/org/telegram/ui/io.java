package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class io extends cu0 {
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
    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        ko koVar = this.a;
        long j10 = koVar.B0;
        mu0 mu0Var = null;
        if (fileLocation != null) {
            if (koVar.C0 != null) {
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
                    mu0Var = new mu0();
                    mu0Var.b = iArr[0];
                    mu0Var.c = iArr[1];
                    ci.j4 j4Var = koVar.e;
                    mu0Var.d = j4Var;
                    ImageReceiver imageReceiver = j4Var.getImageReceiver();
                    mu0Var.a = imageReceiver;
                    if (j10 == 0) {
                        j10 = -koVar.v0;
                    }
                    mu0Var.f = j10;
                    mu0Var.e = imageReceiver.getBitmapSafe();
                    mu0Var.g = -1L;
                    mu0Var.h = koVar.e.getImageReceiver().getRoundRadius(true);
                    mu0Var.k = koVar.d.getScaleX();
                    mu0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = koVar.getMessagesController().getChat(Long.valueOf(koVar.v0));
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
                    mu0Var = new mu0();
                    mu0Var.b = iArr2[0];
                    mu0Var.c = iArr2[1];
                    ci.j4 j4Var2 = koVar.e;
                    mu0Var.d = j4Var2;
                    ImageReceiver imageReceiver2 = j4Var2.getImageReceiver();
                    mu0Var.a = imageReceiver2;
                    if (j10 == 0) {
                    }
                    mu0Var.f = j10;
                    mu0Var.e = imageReceiver2.getBitmapSafe();
                    mu0Var.g = -1L;
                    mu0Var.h = koVar.e.getImageReceiver().getRoundRadius(true);
                    mu0Var.k = koVar.d.getScaleX();
                    mu0Var.p = true;
                }
            }
        }
        return mu0Var;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean N() {
        ko koVar = this.a;
        long j10 = koVar.B0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = koVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        koVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new l(this, 2));
        return false;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.p(str, str2, z10);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final int y() {
        return 1;
    }
}
