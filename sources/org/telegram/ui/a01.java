package org.telegram.ui;

import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class a01 extends su0 {
    public final /* synthetic */ ProfileActivity a;

    public a01(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.Components.x9] */
    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation2;
        cv0 cv0Var;
        int i11;
        boolean z12;
        long j3;
        qz0 qz0Var;
        qz0 qz0Var2;
        org.telegram.ui.Components.nh0 nh0Var;
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
                qz0 qz0Var3 = profileActivity.n0;
                if (qz0Var3 != null) {
                    int realCount = qz0Var3.getRealCount();
                    i11 = 0;
                    while (i11 < realCount) {
                        ImageLocation G = profileActivity.n0.G(i11);
                        if (G != null && (tL_fileLocationToBeDeprecated = G.location) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id) {
                            cv0Var = null;
                            if (tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.dc_id == fileLocation.dc_id) {
                                z14 = true;
                                break;
                            }
                        }
                        i11++;
                    }
                }
                cv0Var = null;
                i11 = -1;
                if (!z14) {
                    return cv0Var;
                }
                pz0 pz0Var = profileActivity.e0;
                if (i11 >= 0 && (qz0Var = profileActivity.n0) != null && qz0Var.getVisibility() == 0) {
                    if (i11 != profileActivity.n0.getRealPosition() && (nh0Var = (qz0Var2 = profileActivity.n0).D0) != null) {
                        qz0Var2.x(nh0Var.j() + i11, false);
                    }
                    ?? currentItemView = profileActivity.n0.getCurrentItemView();
                    if (currentItemView != 0) {
                        pz0Var = currentItemView;
                        z12 = true;
                        int[] iArr = new int[2];
                        pz0Var.getLocationInWindow(iArr);
                        cv0 cv0Var2 = new cv0();
                        cv0Var2.b = iArr[0];
                        cv0Var2.c = iArr[1];
                        cv0Var2.d = pz0Var;
                        ImageReceiver imageReceiver = pz0Var.getImageReceiver();
                        cv0Var2.a = imageReceiver;
                        j3 = profileActivity.e1;
                        if (j3 == 0) {
                            cv0Var2.f = j3;
                        } else {
                            long j10 = profileActivity.f1;
                            if (j10 != 0) {
                                cv0Var2.f = -j10;
                            }
                        }
                        cv0Var2.e = imageReceiver.getBitmapSafe();
                        cv0Var2.g = -1L;
                        cv0Var2.h = pz0Var.getImageReceiver().getRoundRadius(true);
                        cv0Var2.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                        cv0Var2.p = profileActivity.e1 != profileActivity.getUserConfig().clientUserId;
                        if (!z12 && profileActivity.Y.getScaleX() > 0.96f) {
                            z13 = true;
                        }
                        cv0Var2.r = z13;
                        cv0Var2.s = z12;
                        return cv0Var2;
                    }
                }
                z12 = false;
                int[] iArr2 = new int[2];
                pz0Var.getLocationInWindow(iArr2);
                cv0 cv0Var22 = new cv0();
                cv0Var22.b = iArr2[0];
                cv0Var22.c = iArr2[1];
                cv0Var22.d = pz0Var;
                ImageReceiver imageReceiver2 = pz0Var.getImageReceiver();
                cv0Var22.a = imageReceiver2;
                j3 = profileActivity.e1;
                if (j3 == 0) {
                }
                cv0Var22.e = imageReceiver2.getBitmapSafe();
                cv0Var22.g = -1L;
                cv0Var22.h = pz0Var.getImageReceiver().getRoundRadius(true);
                cv0Var22.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                cv0Var22.p = profileActivity.e1 != profileActivity.getUserConfig().clientUserId;
                if (!z12) {
                    z13 = true;
                }
                cv0Var22.r = z13;
                cv0Var22.s = z12;
                return cv0Var22;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void G() {
        this.a.e0.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void f(String str, String str2, boolean z10) {
        this.a.q0.q(str, str2, z10);
    }
}
