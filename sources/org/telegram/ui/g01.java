package org.telegram.ui;

import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class g01 extends av0 {
    public final /* synthetic */ ProfileActivity a;

    public g01(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.Components.z9] */
    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation2;
        kv0 kv0Var;
        int i11;
        boolean z12;
        long j10;
        wz0 wz0Var;
        wz0 wz0Var2;
        org.telegram.ui.Components.oi0 oi0Var;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        TLRPC.User user;
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (fileLocation != null) {
            ProfileActivity profileActivity = this.a;
            if (profileActivity.Y.getScaleX() <= 0.96f || !z11) {
                if (profileActivity.e1 == 0 ? profileActivity.f1 == 0 || (chat = profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f1))) == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null : (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1))) == null || (userProfilePhoto = user.photo) == null || (fileLocation2 = userProfilePhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
                boolean z13 = false;
                boolean z14 = fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id;
                wz0 wz0Var3 = profileActivity.n0;
                if (wz0Var3 != null) {
                    int realCount = wz0Var3.getRealCount();
                    i11 = 0;
                    while (i11 < realCount) {
                        ImageLocation G = profileActivity.n0.G(i11);
                        if (G != null && (tL_fileLocationToBeDeprecated = G.location) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id) {
                            kv0Var = null;
                            if (tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.dc_id == fileLocation.dc_id) {
                                z14 = true;
                                break;
                            }
                        }
                        i11++;
                    }
                }
                kv0Var = null;
                i11 = -1;
                if (!z14) {
                    return kv0Var;
                }
                vz0 vz0Var = profileActivity.e0;
                if (i11 >= 0 && (wz0Var = profileActivity.n0) != null && wz0Var.getVisibility() == 0) {
                    if (i11 != profileActivity.n0.getRealPosition() && (oi0Var = (wz0Var2 = profileActivity.n0).D0) != null) {
                        wz0Var2.x(oi0Var.j() + i11, false);
                    }
                    ?? currentItemView = profileActivity.n0.getCurrentItemView();
                    if (currentItemView != 0) {
                        vz0Var = currentItemView;
                        z12 = true;
                        int[] iArr = new int[2];
                        vz0Var.getLocationInWindow(iArr);
                        kv0 kv0Var2 = new kv0();
                        kv0Var2.b = iArr[0];
                        kv0Var2.c = iArr[1];
                        kv0Var2.d = vz0Var;
                        ImageReceiver imageReceiver = vz0Var.getImageReceiver();
                        kv0Var2.a = imageReceiver;
                        j10 = profileActivity.e1;
                        if (j10 == 0) {
                            kv0Var2.f = j10;
                        } else {
                            long j11 = profileActivity.f1;
                            if (j11 != 0) {
                                kv0Var2.f = -j11;
                            }
                        }
                        kv0Var2.e = imageReceiver.getBitmapSafe();
                        kv0Var2.g = -1L;
                        kv0Var2.h = vz0Var.getImageReceiver().getRoundRadius(true);
                        kv0Var2.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                        kv0Var2.p = profileActivity.e1 != profileActivity.getUserConfig().clientUserId;
                        if (!z12 && profileActivity.Y.getScaleX() > 0.96f) {
                            z13 = true;
                        }
                        kv0Var2.r = z13;
                        kv0Var2.s = z12;
                        return kv0Var2;
                    }
                }
                z12 = false;
                int[] iArr2 = new int[2];
                vz0Var.getLocationInWindow(iArr2);
                kv0 kv0Var22 = new kv0();
                kv0Var22.b = iArr2[0];
                kv0Var22.c = iArr2[1];
                kv0Var22.d = vz0Var;
                ImageReceiver imageReceiver2 = vz0Var.getImageReceiver();
                kv0Var22.a = imageReceiver2;
                j10 = profileActivity.e1;
                if (j10 == 0) {
                }
                kv0Var22.e = imageReceiver2.getBitmapSafe();
                kv0Var22.g = -1L;
                kv0Var22.h = vz0Var.getImageReceiver().getRoundRadius(true);
                kv0Var22.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                kv0Var22.p = profileActivity.e1 != profileActivity.getUserConfig().clientUserId;
                if (!z12) {
                    z13 = true;
                }
                kv0Var22.r = z13;
                kv0Var22.s = z12;
                return kv0Var22;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void G() {
        this.a.e0.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void f(String str, String str2, boolean z10) {
        this.a.q0.p(str, str2, z10);
    }
}
