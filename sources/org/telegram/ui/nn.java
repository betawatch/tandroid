package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class nn extends mq0 {
    public final /* synthetic */ pn a;

    public nn(pn pnVar) {
        this.a = pnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        TLRPC.FileLocation fileLocation2;
        pn pnVar = this.a;
        long j3 = pnVar.B0;
        vq0 vq0Var = null;
        if (fileLocation != null) {
            if (pnVar.C0 != null) {
                TLRPC.User a22 = j3 == 0 ? null : pnVar.getMessagesController().a2(Long.valueOf(j3));
                if (a22 != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    pnVar.e.getLocationInWindow(iArr);
                    vq0Var = new vq0();
                    vq0Var.b = iArr[0];
                    vq0Var.c = iArr[1];
                    di.c4 c4Var = pnVar.e;
                    vq0Var.d = c4Var;
                    ImageReceiver imageReceiver = c4Var.getImageReceiver();
                    vq0Var.a = imageReceiver;
                    if (j3 == 0) {
                        j3 = -pnVar.v0;
                    }
                    vq0Var.f = j3;
                    vq0Var.e = imageReceiver.p();
                    vq0Var.g = -1L;
                    vq0Var.h = pnVar.e.getImageReceiver().E();
                    vq0Var.k = pnVar.d.getScaleX();
                    vq0Var.p = true;
                }
            } else {
                TLRPC.Chat M0 = pnVar.getMessagesController().M0(Long.valueOf(pnVar.v0));
                if (M0 != null) {
                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    pnVar.e.getLocationInWindow(iArr2);
                    vq0Var = new vq0();
                    vq0Var.b = iArr2[0];
                    vq0Var.c = iArr2[1];
                    di.c4 c4Var2 = pnVar.e;
                    vq0Var.d = c4Var2;
                    ImageReceiver imageReceiver2 = c4Var2.getImageReceiver();
                    vq0Var.a = imageReceiver2;
                    if (j3 == 0) {
                    }
                    vq0Var.f = j3;
                    vq0Var.e = imageReceiver2.p();
                    vq0Var.g = -1L;
                    vq0Var.h = pnVar.e.getImageReceiver().E();
                    vq0Var.k = pnVar.d.getScaleX();
                    vq0Var.p = true;
                }
            }
        }
        return vq0Var;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void G() {
        this.a.e.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final boolean N() {
        pn pnVar = this.a;
        long j3 = pnVar.B0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = pnVar.getMessagesController().o1(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        pnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new l(this, 2));
        return false;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void f(String str, String str2, boolean z9) {
        this.a.s.p(str, str2, z9);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final int y() {
        return 1;
    }
}
