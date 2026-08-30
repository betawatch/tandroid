package org.telegram.ui;

import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hz0 extends yt0 {
    public final /* synthetic */ ProfileActivity a;

    public hz0(ProfileActivity profileActivity) {
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
    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation2;
        ju0 ju0Var;
        int i11;
        boolean z11;
        long j10;
        xy0 xy0Var;
        xy0 xy0Var2;
        org.telegram.ui.Components.uh0 uh0Var;
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
                xy0 xy0Var3 = profileActivity.k0;
                if (xy0Var3 != null) {
                    int realCount = xy0Var3.getRealCount();
                    i11 = 0;
                    while (i11 < realCount) {
                        ImageLocation G = profileActivity.k0.G(i11);
                        if (G != null && (tL_fileLocationToBeDeprecated = G.location) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id) {
                            ju0Var = null;
                            if (tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.dc_id == fileLocation.dc_id) {
                                z13 = true;
                                break;
                            }
                        }
                        i11++;
                    }
                }
                ju0Var = null;
                i11 = -1;
                if (!z13) {
                    return ju0Var;
                }
                wy0 wy0Var = profileActivity.b0;
                if (i11 >= 0 && (xy0Var = profileActivity.k0) != null && xy0Var.getVisibility() == 0) {
                    if (i11 != profileActivity.k0.getRealPosition() && (uh0Var = (xy0Var2 = profileActivity.k0).A0) != null) {
                        xy0Var2.x(uh0Var.j() + i11, false);
                    }
                    ?? currentItemView = profileActivity.k0.getCurrentItemView();
                    if (currentItemView != 0) {
                        wy0Var = currentItemView;
                        z11 = true;
                        int[] iArr = new int[2];
                        wy0Var.getLocationInWindow(iArr);
                        ju0 ju0Var2 = new ju0();
                        ju0Var2.b = iArr[0];
                        ju0Var2.c = iArr[1];
                        ju0Var2.d = wy0Var;
                        ImageReceiver imageReceiver = wy0Var.getImageReceiver();
                        ju0Var2.a = imageReceiver;
                        j10 = profileActivity.b1;
                        if (j10 == 0) {
                            ju0Var2.f = j10;
                        } else {
                            long j11 = profileActivity.c1;
                            if (j11 != 0) {
                                ju0Var2.f = -j11;
                            }
                        }
                        ju0Var2.e = imageReceiver.getBitmapSafe();
                        ju0Var2.g = -1L;
                        ju0Var2.h = wy0Var.getImageReceiver().getRoundRadius(true);
                        ju0Var2.k = !z11 ? 1.0f : profileActivity.V.getScaleX();
                        ju0Var2.p = profileActivity.b1 != profileActivity.getUserConfig().clientUserId;
                        if (!z11 && profileActivity.V.getScaleX() > 0.96f) {
                            z12 = true;
                        }
                        ju0Var2.r = z12;
                        ju0Var2.s = z11;
                        return ju0Var2;
                    }
                }
                z11 = false;
                int[] iArr2 = new int[2];
                wy0Var.getLocationInWindow(iArr2);
                ju0 ju0Var22 = new ju0();
                ju0Var22.b = iArr2[0];
                ju0Var22.c = iArr2[1];
                ju0Var22.d = wy0Var;
                ImageReceiver imageReceiver2 = wy0Var.getImageReceiver();
                ju0Var22.a = imageReceiver2;
                j10 = profileActivity.b1;
                if (j10 == 0) {
                }
                ju0Var22.e = imageReceiver2.getBitmapSafe();
                ju0Var22.g = -1L;
                ju0Var22.h = wy0Var.getImageReceiver().getRoundRadius(true);
                ju0Var22.k = !z11 ? 1.0f : profileActivity.V.getScaleX();
                ju0Var22.p = profileActivity.b1 != profileActivity.getUserConfig().clientUserId;
                if (!z11) {
                    z12 = true;
                }
                ju0Var22.r = z12;
                ju0Var22.s = z11;
                return ju0Var22;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void G() {
        this.a.b0.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void f(String str, String str2, boolean z4) {
        this.a.n0.q(str, str2, z4);
    }
}
