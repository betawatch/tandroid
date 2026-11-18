package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class pn extends oq0 {
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
    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        rn rnVar = this.a;
        long j3 = rnVar.C0;
        wq0 wq0Var = null;
        if (fileLocation != null) {
            if (rnVar.D0 != null) {
                TLRPC.User c22 = j3 == 0 ? null : rnVar.getMessagesController().c2(Long.valueOf(j3));
                if (c22 != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    rnVar.e.getLocationInWindow(iArr);
                    wq0Var = new wq0();
                    wq0Var.b = iArr[0];
                    wq0Var.c = iArr[1];
                    fi.t3 t3Var = rnVar.e;
                    wq0Var.d = t3Var;
                    ImageReceiver imageReceiver = t3Var.getImageReceiver();
                    wq0Var.a = imageReceiver;
                    if (j3 == 0) {
                        j3 = -rnVar.w0;
                    }
                    wq0Var.f = j3;
                    wq0Var.e = imageReceiver.p();
                    wq0Var.g = -1L;
                    wq0Var.h = rnVar.e.getImageReceiver().E();
                    wq0Var.k = rnVar.d.getScaleX();
                    wq0Var.p = true;
                }
            } else {
                TLRPC.Chat O0 = rnVar.getMessagesController().O0(Long.valueOf(rnVar.w0));
                if (O0 != null) {
                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    rnVar.e.getLocationInWindow(iArr2);
                    wq0Var = new wq0();
                    wq0Var.b = iArr2[0];
                    wq0Var.c = iArr2[1];
                    fi.t3 t3Var2 = rnVar.e;
                    wq0Var.d = t3Var2;
                    ImageReceiver imageReceiver2 = t3Var2.getImageReceiver();
                    wq0Var.a = imageReceiver2;
                    if (j3 == 0) {
                    }
                    wq0Var.f = j3;
                    wq0Var.e = imageReceiver2.p();
                    wq0Var.g = -1L;
                    wq0Var.h = rnVar.e.getImageReceiver().E();
                    wq0Var.k = rnVar.d.getScaleX();
                    wq0Var.p = true;
                }
            }
        }
        return wq0Var;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void G() {
        this.a.e.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean N() {
        rn rnVar = this.a;
        long j3 = rnVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = rnVar.getMessagesController().q1(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        rnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new l(this, 2));
        return false;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.p(str, str2, z10);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int y() {
        return 1;
    }
}
