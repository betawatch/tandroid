package org.telegram.ui;

import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ez0 extends bu0 {
    public final /* synthetic */ ProfileActivity a;

    public ez0(ProfileActivity profileActivity) {
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
    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation2;
        lu0 lu0Var;
        int i11;
        boolean z12;
        long j10;
        uy0 uy0Var;
        uy0 uy0Var2;
        org.telegram.ui.Components.ji0 ji0Var;
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
                uy0 uy0Var3 = profileActivity.o0;
                if (uy0Var3 != null) {
                    int realCount = uy0Var3.getRealCount();
                    i11 = 0;
                    while (i11 < realCount) {
                        ImageLocation G = profileActivity.o0.G(i11);
                        if (G != null && (tL_fileLocationToBeDeprecated = G.location) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id) {
                            lu0Var = null;
                            if (tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.dc_id == fileLocation.dc_id) {
                                z14 = true;
                                break;
                            }
                        }
                        i11++;
                    }
                }
                lu0Var = null;
                i11 = -1;
                if (!z14) {
                    return lu0Var;
                }
                ty0 ty0Var = profileActivity.f0;
                if (i11 >= 0 && (uy0Var = profileActivity.o0) != null && uy0Var.getVisibility() == 0) {
                    if (i11 != profileActivity.o0.getRealPosition() && (ji0Var = (uy0Var2 = profileActivity.o0).D0) != null) {
                        uy0Var2.x(ji0Var.j() + i11, false);
                    }
                    ?? currentItemView = profileActivity.o0.getCurrentItemView();
                    if (currentItemView != 0) {
                        ty0Var = currentItemView;
                        z12 = true;
                        int[] iArr = new int[2];
                        ty0Var.getLocationInWindow(iArr);
                        lu0 lu0Var2 = new lu0();
                        lu0Var2.b = iArr[0];
                        lu0Var2.c = iArr[1];
                        lu0Var2.d = ty0Var;
                        ImageReceiver imageReceiver = ty0Var.getImageReceiver();
                        lu0Var2.a = imageReceiver;
                        j10 = profileActivity.f1;
                        if (j10 == 0) {
                            lu0Var2.f = j10;
                        } else {
                            long j11 = profileActivity.g1;
                            if (j11 != 0) {
                                lu0Var2.f = -j11;
                            }
                        }
                        lu0Var2.e = imageReceiver.getBitmapSafe();
                        lu0Var2.g = -1L;
                        lu0Var2.h = ty0Var.getImageReceiver().getRoundRadius(true);
                        lu0Var2.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                        lu0Var2.p = profileActivity.f1 != profileActivity.getUserConfig().clientUserId;
                        if (!z12 && profileActivity.Y.getScaleX() > 0.96f) {
                            z13 = true;
                        }
                        lu0Var2.r = z13;
                        lu0Var2.s = z12;
                        return lu0Var2;
                    }
                }
                z12 = false;
                int[] iArr2 = new int[2];
                ty0Var.getLocationInWindow(iArr2);
                lu0 lu0Var22 = new lu0();
                lu0Var22.b = iArr2[0];
                lu0Var22.c = iArr2[1];
                lu0Var22.d = ty0Var;
                ImageReceiver imageReceiver2 = ty0Var.getImageReceiver();
                lu0Var22.a = imageReceiver2;
                j10 = profileActivity.f1;
                if (j10 == 0) {
                }
                lu0Var22.e = imageReceiver2.getBitmapSafe();
                lu0Var22.g = -1L;
                lu0Var22.h = ty0Var.getImageReceiver().getRoundRadius(true);
                lu0Var22.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                lu0Var22.p = profileActivity.f1 != profileActivity.getUserConfig().clientUserId;
                if (!z12) {
                    z13 = true;
                }
                lu0Var22.r = z13;
                lu0Var22.s = z12;
                return lu0Var22;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void G() {
        this.a.f0.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void f(String str, String str2, boolean z10) {
        this.a.r0.p(str, str2, z10);
    }
}
