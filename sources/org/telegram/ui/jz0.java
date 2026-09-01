package org.telegram.ui;

import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class jz0 extends au0 {
    public final /* synthetic */ ProfileActivity a;

    public jz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.Components.p9] */
    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation2;
        lu0 lu0Var;
        int i11;
        boolean z11;
        long j10;
        zy0 zy0Var;
        zy0 zy0Var2;
        org.telegram.ui.Components.wh0 wh0Var;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        TLRPC.User user;
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (fileLocation != null) {
            ProfileActivity profileActivity = this.a;
            if (profileActivity.V.getScaleX() <= 0.96f || !z10) {
                if (profileActivity.b1 == 0 ? profileActivity.c1 == 0 || (chat = profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.c1))) == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null : (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.b1))) == null || (userProfilePhoto = user.photo) == null || (fileLocation2 = userProfilePhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
                boolean z12 = false;
                boolean z13 = fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id;
                zy0 zy0Var3 = profileActivity.k0;
                if (zy0Var3 != null) {
                    int realCount = zy0Var3.getRealCount();
                    i11 = 0;
                    while (i11 < realCount) {
                        ImageLocation G = profileActivity.k0.G(i11);
                        if (G != null && (tL_fileLocationToBeDeprecated = G.location) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id) {
                            lu0Var = null;
                            if (tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.dc_id == fileLocation.dc_id) {
                                z13 = true;
                                break;
                            }
                        }
                        i11++;
                    }
                }
                lu0Var = null;
                i11 = -1;
                if (!z13) {
                    return lu0Var;
                }
                yy0 yy0Var = profileActivity.b0;
                if (i11 >= 0 && (zy0Var = profileActivity.k0) != null && zy0Var.getVisibility() == 0) {
                    if (i11 != profileActivity.k0.getRealPosition() && (wh0Var = (zy0Var2 = profileActivity.k0).A0) != null) {
                        zy0Var2.x(wh0Var.j() + i11, false);
                    }
                    ?? currentItemView = profileActivity.k0.getCurrentItemView();
                    if (currentItemView != 0) {
                        yy0Var = currentItemView;
                        z11 = true;
                        int[] iArr = new int[2];
                        yy0Var.getLocationInWindow(iArr);
                        lu0 lu0Var2 = new lu0();
                        lu0Var2.b = iArr[0];
                        lu0Var2.c = iArr[1];
                        lu0Var2.d = yy0Var;
                        ImageReceiver imageReceiver = yy0Var.getImageReceiver();
                        lu0Var2.a = imageReceiver;
                        j10 = profileActivity.b1;
                        if (j10 == 0) {
                            lu0Var2.f = j10;
                        } else {
                            long j11 = profileActivity.c1;
                            if (j11 != 0) {
                                lu0Var2.f = -j11;
                            }
                        }
                        lu0Var2.e = imageReceiver.getBitmapSafe();
                        lu0Var2.g = -1L;
                        lu0Var2.h = yy0Var.getImageReceiver().getRoundRadius(true);
                        lu0Var2.k = !z11 ? 1.0f : profileActivity.V.getScaleX();
                        lu0Var2.p = profileActivity.b1 != profileActivity.getUserConfig().clientUserId;
                        if (!z11 && profileActivity.V.getScaleX() > 0.96f) {
                            z12 = true;
                        }
                        lu0Var2.r = z12;
                        lu0Var2.s = z11;
                        return lu0Var2;
                    }
                }
                z11 = false;
                int[] iArr2 = new int[2];
                yy0Var.getLocationInWindow(iArr2);
                lu0 lu0Var22 = new lu0();
                lu0Var22.b = iArr2[0];
                lu0Var22.c = iArr2[1];
                lu0Var22.d = yy0Var;
                ImageReceiver imageReceiver2 = yy0Var.getImageReceiver();
                lu0Var22.a = imageReceiver2;
                j10 = profileActivity.b1;
                if (j10 == 0) {
                }
                lu0Var22.e = imageReceiver2.getBitmapSafe();
                lu0Var22.g = -1L;
                lu0Var22.h = yy0Var.getImageReceiver().getRoundRadius(true);
                lu0Var22.k = !z11 ? 1.0f : profileActivity.V.getScaleX();
                lu0Var22.p = profileActivity.b1 != profileActivity.getUserConfig().clientUserId;
                if (!z11) {
                    z12 = true;
                }
                lu0Var22.r = z12;
                lu0Var22.s = z11;
                return lu0Var22;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void G() {
        this.a.b0.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void f(String str, String str2, boolean z4) {
        this.a.n0.q(str, str2, z4);
    }
}
