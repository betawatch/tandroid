package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fo extends rt0 {
    public final /* synthetic */ ho a;

    public fo(ho hoVar) {
        this.a = hoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        ho hoVar = this.a;
        long j10 = hoVar.y0;
        bu0 bu0Var = null;
        if (fileLocation != null) {
            if (hoVar.z0 != null) {
                TLRPC.User user = j10 == 0 ? null : hoVar.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    hoVar.e.getLocationInWindow(iArr);
                    bu0Var = new bu0();
                    bu0Var.b = iArr[0];
                    bu0Var.c = iArr[1];
                    ih.d4 d4Var = hoVar.e;
                    bu0Var.d = d4Var;
                    ImageReceiver imageReceiver = d4Var.getImageReceiver();
                    bu0Var.a = imageReceiver;
                    if (j10 == 0) {
                        j10 = -hoVar.s0;
                    }
                    bu0Var.f = j10;
                    bu0Var.e = imageReceiver.getBitmapSafe();
                    bu0Var.g = -1L;
                    bu0Var.h = hoVar.e.getImageReceiver().getRoundRadius(true);
                    bu0Var.k = hoVar.d.getScaleX();
                    bu0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = hoVar.getMessagesController().getChat(Long.valueOf(hoVar.s0));
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    hoVar.e.getLocationInWindow(iArr2);
                    bu0Var = new bu0();
                    bu0Var.b = iArr2[0];
                    bu0Var.c = iArr2[1];
                    ih.d4 d4Var2 = hoVar.e;
                    bu0Var.d = d4Var2;
                    ImageReceiver imageReceiver2 = d4Var2.getImageReceiver();
                    bu0Var.a = imageReceiver2;
                    if (j10 == 0) {
                    }
                    bu0Var.f = j10;
                    bu0Var.e = imageReceiver2.getBitmapSafe();
                    bu0Var.g = -1L;
                    bu0Var.h = hoVar.e.getImageReceiver().getRoundRadius(true);
                    bu0Var.k = hoVar.d.getScaleX();
                    bu0Var.p = true;
                }
            }
        }
        return bu0Var;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean M() {
        ho hoVar = this.a;
        long j10 = hoVar.y0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = hoVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        hoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.q(str, str2, z10);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final int y() {
        return 1;
    }
}
