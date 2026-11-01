package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class lo extends xr0 {
    public final /* synthetic */ oo a;

    public lo(oo ooVar) {
        this.a = ooVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        oo ooVar = this.a;
        long j10 = ooVar.B0;
        fs0 fs0Var = null;
        if (fileLocation != null) {
            if (ooVar.C0 != null) {
                TLRPC.User Z1 = j10 == 0 ? null : ooVar.getMessagesController().Z1(Long.valueOf(j10));
                if (Z1 != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    ooVar.e.getLocationInWindow(iArr);
                    fs0Var = new fs0();
                    fs0Var.b = iArr[0];
                    fs0Var.c = iArr[1];
                    ag.d2 d2Var = ooVar.e;
                    fs0Var.d = d2Var;
                    ImageReceiver imageReceiver = d2Var.getImageReceiver();
                    fs0Var.a = imageReceiver;
                    if (j10 == 0) {
                        j10 = -ooVar.v0;
                    }
                    fs0Var.f = j10;
                    fs0Var.e = imageReceiver.p();
                    fs0Var.g = -1L;
                    fs0Var.h = ooVar.e.getImageReceiver().E();
                    fs0Var.k = ooVar.d.getScaleX();
                    fs0Var.p = true;
                }
            } else {
                TLRPC.Chat L0 = ooVar.getMessagesController().L0(Long.valueOf(ooVar.v0));
                if (L0 != null) {
                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    ooVar.e.getLocationInWindow(iArr2);
                    fs0Var = new fs0();
                    fs0Var.b = iArr2[0];
                    fs0Var.c = iArr2[1];
                    ag.d2 d2Var2 = ooVar.e;
                    fs0Var.d = d2Var2;
                    ImageReceiver imageReceiver2 = d2Var2.getImageReceiver();
                    fs0Var.a = imageReceiver2;
                    if (j10 == 0) {
                    }
                    fs0Var.f = j10;
                    fs0Var.e = imageReceiver2.p();
                    fs0Var.g = -1L;
                    fs0Var.h = ooVar.e.getImageReceiver().E();
                    fs0Var.k = ooVar.d.getScaleX();
                    fs0Var.p = true;
                }
            }
        }
        return fs0Var;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void G() {
        this.a.e.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean N() {
        oo ooVar = this.a;
        long j10 = ooVar.B0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = ooVar.getMessagesController().n1(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        ooVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new k(this, 2));
        return false;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.p(str, str2, z10);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final int y() {
        return 1;
    }
}
