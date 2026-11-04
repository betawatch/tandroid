package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jn extends eq0 {
    public final /* synthetic */ ln a;

    public jn(ln lnVar) {
        this.a = lnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        ln lnVar = this.a;
        long j10 = lnVar.C0;
        mq0 mq0Var = null;
        if (fileLocation != null) {
            if (lnVar.D0 != null) {
                TLRPC.User a22 = j10 == 0 ? null : lnVar.getMessagesController().a2(Long.valueOf(j10));
                if (a22 != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    lnVar.e.getLocationInWindow(iArr);
                    mq0Var = new mq0();
                    mq0Var.b = iArr[0];
                    mq0Var.c = iArr[1];
                    ei.d4 d4Var = lnVar.e;
                    mq0Var.d = d4Var;
                    ImageReceiver imageReceiver = d4Var.getImageReceiver();
                    mq0Var.a = imageReceiver;
                    if (j10 == 0) {
                        j10 = -lnVar.w0;
                    }
                    mq0Var.f = j10;
                    mq0Var.e = imageReceiver.p();
                    mq0Var.g = -1L;
                    mq0Var.h = lnVar.e.getImageReceiver().E();
                    mq0Var.k = lnVar.d.getScaleX();
                    mq0Var.p = true;
                }
            } else {
                TLRPC.Chat M0 = lnVar.getMessagesController().M0(Long.valueOf(lnVar.w0));
                if (M0 != null) {
                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    lnVar.e.getLocationInWindow(iArr2);
                    mq0Var = new mq0();
                    mq0Var.b = iArr2[0];
                    mq0Var.c = iArr2[1];
                    ei.d4 d4Var2 = lnVar.e;
                    mq0Var.d = d4Var2;
                    ImageReceiver imageReceiver2 = d4Var2.getImageReceiver();
                    mq0Var.a = imageReceiver2;
                    if (j10 == 0) {
                    }
                    mq0Var.f = j10;
                    mq0Var.e = imageReceiver2.p();
                    mq0Var.g = -1L;
                    mq0Var.h = lnVar.e.getImageReceiver().E();
                    mq0Var.k = lnVar.d.getScaleX();
                    mq0Var.p = true;
                }
            }
        }
        return mq0Var;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void G() {
        this.a.e.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean N() {
        ln lnVar = this.a;
        long j10 = lnVar.C0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = lnVar.getMessagesController().o1(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        lnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new l(this, 2));
        return false;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.p(str, str2, z10);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int y() {
        return 1;
    }
}
