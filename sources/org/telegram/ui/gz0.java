package org.telegram.ui;

import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class gz0 extends cu0 {
    public final /* synthetic */ ProfileActivity a;

    public gz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.Components.w9] */
    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation2;
        mu0 mu0Var;
        int i11;
        boolean z12;
        long j10;
        wy0 wy0Var;
        wy0 wy0Var2;
        org.telegram.ui.Components.ni0 ni0Var;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        TLRPC.User user;
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (fileLocation != null) {
            ProfileActivity profileActivity = this.a;
            if (profileActivity.Y.getScaleX() <= 0.96f || !z11) {
                if (profileActivity.f1 == 0 ? profileActivity.g1 == 0 || (chat = profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.g1))) == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null : (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f1))) == null || (userProfilePhoto = user.photo) == null || (fileLocation2 = userProfilePhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
                boolean z13 = false;
                boolean z14 = fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id;
                wy0 wy0Var3 = profileActivity.o0;
                if (wy0Var3 != null) {
                    int realCount = wy0Var3.getRealCount();
                    i11 = 0;
                    while (i11 < realCount) {
                        ImageLocation G = profileActivity.o0.G(i11);
                        if (G != null && (tL_fileLocationToBeDeprecated = G.location) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id) {
                            mu0Var = null;
                            if (tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.dc_id == fileLocation.dc_id) {
                                z14 = true;
                                break;
                            }
                        }
                        i11++;
                    }
                }
                mu0Var = null;
                i11 = -1;
                if (!z14) {
                    return mu0Var;
                }
                vy0 vy0Var = profileActivity.f0;
                if (i11 >= 0 && (wy0Var = profileActivity.o0) != null && wy0Var.getVisibility() == 0) {
                    if (i11 != profileActivity.o0.getRealPosition() && (ni0Var = (wy0Var2 = profileActivity.o0).D0) != null) {
                        wy0Var2.x(ni0Var.j() + i11, false);
                    }
                    ?? currentItemView = profileActivity.o0.getCurrentItemView();
                    if (currentItemView != 0) {
                        vy0Var = currentItemView;
                        z12 = true;
                        int[] iArr = new int[2];
                        vy0Var.getLocationInWindow(iArr);
                        mu0 mu0Var2 = new mu0();
                        mu0Var2.b = iArr[0];
                        mu0Var2.c = iArr[1];
                        mu0Var2.d = vy0Var;
                        ImageReceiver imageReceiver = vy0Var.getImageReceiver();
                        mu0Var2.a = imageReceiver;
                        j10 = profileActivity.f1;
                        if (j10 == 0) {
                            mu0Var2.f = j10;
                        } else {
                            long j11 = profileActivity.g1;
                            if (j11 != 0) {
                                mu0Var2.f = -j11;
                            }
                        }
                        mu0Var2.e = imageReceiver.getBitmapSafe();
                        mu0Var2.g = -1L;
                        mu0Var2.h = vy0Var.getImageReceiver().getRoundRadius(true);
                        mu0Var2.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                        mu0Var2.p = profileActivity.f1 != profileActivity.getUserConfig().clientUserId;
                        if (!z12 && profileActivity.Y.getScaleX() > 0.96f) {
                            z13 = true;
                        }
                        mu0Var2.r = z13;
                        mu0Var2.s = z12;
                        return mu0Var2;
                    }
                }
                z12 = false;
                int[] iArr2 = new int[2];
                vy0Var.getLocationInWindow(iArr2);
                mu0 mu0Var22 = new mu0();
                mu0Var22.b = iArr2[0];
                mu0Var22.c = iArr2[1];
                mu0Var22.d = vy0Var;
                ImageReceiver imageReceiver2 = vy0Var.getImageReceiver();
                mu0Var22.a = imageReceiver2;
                j10 = profileActivity.f1;
                if (j10 == 0) {
                }
                mu0Var22.e = imageReceiver2.getBitmapSafe();
                mu0Var22.g = -1L;
                mu0Var22.h = vy0Var.getImageReceiver().getRoundRadius(true);
                mu0Var22.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                mu0Var22.p = profileActivity.f1 != profileActivity.getUserConfig().clientUserId;
                if (!z12) {
                    z13 = true;
                }
                mu0Var22.r = z13;
                mu0Var22.s = z12;
                return mu0Var22;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void G() {
        this.a.f0.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void f(String str, String str2, boolean z10) {
        this.a.r0.p(str, str2, z10);
    }
}
