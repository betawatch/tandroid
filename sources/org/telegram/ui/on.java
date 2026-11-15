package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class on extends mq0 {
    public final /* synthetic */ qn a;

    public on(qn qnVar) {
        this.a = qnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        qn qnVar = this.a;
        long j3 = qnVar.C0;
        uq0 uq0Var = null;
        if (fileLocation != null) {
            if (qnVar.D0 != null) {
                TLRPC.User a22 = j3 == 0 ? null : qnVar.getMessagesController().a2(Long.valueOf(j3));
                if (a22 != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    qnVar.e.getLocationInWindow(iArr);
                    uq0Var = new uq0();
                    uq0Var.b = iArr[0];
                    uq0Var.c = iArr[1];
                    fi.v3 v3Var = qnVar.e;
                    uq0Var.d = v3Var;
                    ImageReceiver imageReceiver = v3Var.getImageReceiver();
                    uq0Var.a = imageReceiver;
                    if (j3 == 0) {
                        j3 = -qnVar.w0;
                    }
                    uq0Var.f = j3;
                    uq0Var.e = imageReceiver.p();
                    uq0Var.g = -1L;
                    uq0Var.h = qnVar.e.getImageReceiver().E();
                    uq0Var.k = qnVar.d.getScaleX();
                    uq0Var.p = true;
                }
            } else {
                TLRPC.Chat M0 = qnVar.getMessagesController().M0(Long.valueOf(qnVar.w0));
                if (M0 != null) {
                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    qnVar.e.getLocationInWindow(iArr2);
                    uq0Var = new uq0();
                    uq0Var.b = iArr2[0];
                    uq0Var.c = iArr2[1];
                    fi.v3 v3Var2 = qnVar.e;
                    uq0Var.d = v3Var2;
                    ImageReceiver imageReceiver2 = v3Var2.getImageReceiver();
                    uq0Var.a = imageReceiver2;
                    if (j3 == 0) {
                    }
                    uq0Var.f = j3;
                    uq0Var.e = imageReceiver2.p();
                    uq0Var.g = -1L;
                    uq0Var.h = qnVar.e.getImageReceiver().E();
                    uq0Var.k = qnVar.d.getScaleX();
                    uq0Var.p = true;
                }
            }
        }
        return uq0Var;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void G() {
        this.a.e.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean N() {
        qn qnVar = this.a;
        long j3 = qnVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = qnVar.getMessagesController().o1(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        qnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new l(this, 2));
        return false;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.p(str, str2, z10);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int y() {
        return 1;
    }
}
