package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class pn extends pq0 {
    public final /* synthetic */ rn a;

    public pn(rn rnVar) {
        this.a = rnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        TLRPC.FileLocation fileLocation2;
        rn rnVar = this.a;
        long j3 = rnVar.B0;
        yq0 yq0Var = null;
        if (fileLocation != null) {
            if (rnVar.C0 != null) {
                TLRPC.User a22 = j3 == 0 ? null : rnVar.getMessagesController().a2(Long.valueOf(j3));
                if (a22 != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    rnVar.e.getLocationInWindow(iArr);
                    yq0Var = new yq0();
                    yq0Var.b = iArr[0];
                    yq0Var.c = iArr[1];
                    di.d4 d4Var = rnVar.e;
                    yq0Var.d = d4Var;
                    ImageReceiver imageReceiver = d4Var.getImageReceiver();
                    yq0Var.a = imageReceiver;
                    if (j3 == 0) {
                        j3 = -rnVar.v0;
                    }
                    yq0Var.f = j3;
                    yq0Var.e = imageReceiver.p();
                    yq0Var.g = -1L;
                    yq0Var.h = rnVar.e.getImageReceiver().E();
                    yq0Var.k = rnVar.d.getScaleX();
                    yq0Var.p = true;
                }
            } else {
                TLRPC.Chat M0 = rnVar.getMessagesController().M0(Long.valueOf(rnVar.v0));
                if (M0 != null) {
                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    rnVar.e.getLocationInWindow(iArr2);
                    yq0Var = new yq0();
                    yq0Var.b = iArr2[0];
                    yq0Var.c = iArr2[1];
                    di.d4 d4Var2 = rnVar.e;
                    yq0Var.d = d4Var2;
                    ImageReceiver imageReceiver2 = d4Var2.getImageReceiver();
                    yq0Var.a = imageReceiver2;
                    if (j3 == 0) {
                    }
                    yq0Var.f = j3;
                    yq0Var.e = imageReceiver2.p();
                    yq0Var.g = -1L;
                    yq0Var.h = rnVar.e.getImageReceiver().E();
                    yq0Var.k = rnVar.d.getScaleX();
                    yq0Var.p = true;
                }
            }
        }
        return yq0Var;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void G() {
        this.a.e.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean N() {
        rn rnVar = this.a;
        long j3 = rnVar.B0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = rnVar.getMessagesController().o1(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        rnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new l(this, 2));
        return false;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void f(String str, String str2, boolean z9) {
        this.a.s.p(str, str2, z9);
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final int y() {
        return 1;
    }
}
