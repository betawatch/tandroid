package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class oo extends mu0 {
    public final /* synthetic */ so a;

    public oo(so soVar) {
        this.a = soVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        so soVar = this.a;
        long j3 = soVar.C0;
        wu0 wu0Var = null;
        if (fileLocation != null) {
            if (soVar.D0 != null) {
                TLRPC.User user = j3 == 0 ? null : soVar.getMessagesController().getUser(Long.valueOf(j3));
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    soVar.e.getLocationInWindow(iArr);
                    wu0Var = new wu0();
                    wu0Var.b = iArr[0];
                    wu0Var.c = iArr[1];
                    ai.y5 y5Var = soVar.e;
                    wu0Var.d = y5Var;
                    ImageReceiver imageReceiver = y5Var.getImageReceiver();
                    wu0Var.a = imageReceiver;
                    if (j3 == 0) {
                        j3 = -soVar.w0;
                    }
                    wu0Var.f = j3;
                    wu0Var.e = imageReceiver.getBitmapSafe();
                    wu0Var.g = -1L;
                    wu0Var.h = soVar.e.getImageReceiver().getRoundRadius(true);
                    wu0Var.k = soVar.d.getScaleX();
                    wu0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = soVar.getMessagesController().getChat(Long.valueOf(soVar.w0));
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    soVar.e.getLocationInWindow(iArr2);
                    wu0Var = new wu0();
                    wu0Var.b = iArr2[0];
                    wu0Var.c = iArr2[1];
                    ai.y5 y5Var2 = soVar.e;
                    wu0Var.d = y5Var2;
                    ImageReceiver imageReceiver2 = y5Var2.getImageReceiver();
                    wu0Var.a = imageReceiver2;
                    if (j3 == 0) {
                    }
                    wu0Var.f = j3;
                    wu0Var.e = imageReceiver2.getBitmapSafe();
                    wu0Var.g = -1L;
                    wu0Var.h = soVar.e.getImageReceiver().getRoundRadius(true);
                    wu0Var.k = soVar.d.getScaleX();
                    wu0Var.p = true;
                }
            }
        }
        return wu0Var;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final boolean M() {
        so soVar = this.a;
        long j3 = soVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = soVar.getMessagesController().getInputUser(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        soVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.q(str, str2, z10);
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final int y() {
        return 1;
    }
}
