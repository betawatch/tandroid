package org.telegram.ui;

import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class b01 extends vu0 {
    public final /* synthetic */ ProfileActivity a;

    public b01(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.Components.u9] */
    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation2;
        fv0 fv0Var;
        int i11;
        boolean z12;
        long j3;
        rz0 rz0Var;
        rz0 rz0Var2;
        org.telegram.ui.Components.oh0 oh0Var;
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
                rz0 rz0Var3 = profileActivity.n0;
                if (rz0Var3 != null) {
                    int realCount = rz0Var3.getRealCount();
                    i11 = 0;
                    while (i11 < realCount) {
                        ImageLocation G = profileActivity.n0.G(i11);
                        if (G != null && (tL_fileLocationToBeDeprecated = G.location) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id) {
                            fv0Var = null;
                            if (tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.dc_id == fileLocation.dc_id) {
                                z14 = true;
                                break;
                            }
                        }
                        i11++;
                    }
                }
                fv0Var = null;
                i11 = -1;
                if (!z14) {
                    return fv0Var;
                }
                qz0 qz0Var = profileActivity.e0;
                if (i11 >= 0 && (rz0Var = profileActivity.n0) != null && rz0Var.getVisibility() == 0) {
                    if (i11 != profileActivity.n0.getRealPosition() && (oh0Var = (rz0Var2 = profileActivity.n0).D0) != null) {
                        rz0Var2.x(oh0Var.j() + i11, false);
                    }
                    ?? currentItemView = profileActivity.n0.getCurrentItemView();
                    if (currentItemView != 0) {
                        qz0Var = currentItemView;
                        z12 = true;
                        int[] iArr = new int[2];
                        qz0Var.getLocationInWindow(iArr);
                        fv0 fv0Var2 = new fv0();
                        fv0Var2.b = iArr[0];
                        fv0Var2.c = iArr[1];
                        fv0Var2.d = qz0Var;
                        ImageReceiver imageReceiver = qz0Var.getImageReceiver();
                        fv0Var2.a = imageReceiver;
                        j3 = profileActivity.e1;
                        if (j3 == 0) {
                            fv0Var2.f = j3;
                        } else {
                            long j10 = profileActivity.f1;
                            if (j10 != 0) {
                                fv0Var2.f = -j10;
                            }
                        }
                        fv0Var2.e = imageReceiver.getBitmapSafe();
                        fv0Var2.g = -1L;
                        fv0Var2.h = qz0Var.getImageReceiver().getRoundRadius(true);
                        fv0Var2.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                        fv0Var2.p = profileActivity.e1 != profileActivity.getUserConfig().clientUserId;
                        if (!z12 && profileActivity.Y.getScaleX() > 0.96f) {
                            z13 = true;
                        }
                        fv0Var2.r = z13;
                        fv0Var2.s = z12;
                        return fv0Var2;
                    }
                }
                z12 = false;
                int[] iArr2 = new int[2];
                qz0Var.getLocationInWindow(iArr2);
                fv0 fv0Var22 = new fv0();
                fv0Var22.b = iArr2[0];
                fv0Var22.c = iArr2[1];
                fv0Var22.d = qz0Var;
                ImageReceiver imageReceiver2 = qz0Var.getImageReceiver();
                fv0Var22.a = imageReceiver2;
                j3 = profileActivity.e1;
                if (j3 == 0) {
                }
                fv0Var22.e = imageReceiver2.getBitmapSafe();
                fv0Var22.g = -1L;
                fv0Var22.h = qz0Var.getImageReceiver().getRoundRadius(true);
                fv0Var22.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                fv0Var22.p = profileActivity.e1 != profileActivity.getUserConfig().clientUserId;
                if (!z12) {
                    z13 = true;
                }
                fv0Var22.r = z13;
                fv0Var22.s = z12;
                return fv0Var22;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void G() {
        this.a.e0.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void f(String str, String str2, boolean z10) {
        this.a.q0.q(str, str2, z10);
    }
}
