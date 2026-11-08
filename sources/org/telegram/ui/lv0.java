package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class lv0 extends nq0 {
    public final /* synthetic */ ProfileActivity a;

    public lv0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.Components.l9] */
    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        TLRPC.Chat M0;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation2;
        wq0 wq0Var;
        int i10;
        boolean z11;
        long j3;
        av0 av0Var;
        av0 av0Var2;
        org.telegram.ui.Components.rf0 rf0Var;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        TLRPC.User a22;
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (fileLocation != null) {
            ProfileActivity profileActivity = this.a;
            if (profileActivity.X.getScaleX() <= 0.96f || !z10) {
                if (profileActivity.d1 == 0 ? profileActivity.e1 == 0 || (M0 = profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.e1))) == null || (chatPhoto = M0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null : (a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.d1))) == null || (userProfilePhoto = a22.photo) == null || (fileLocation2 = userProfilePhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
                boolean z12 = false;
                boolean z13 = fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id;
                av0 av0Var3 = profileActivity.n0;
                if (av0Var3 != null) {
                    int realCount = av0Var3.getRealCount();
                    i10 = 0;
                    while (i10 < realCount) {
                        org.telegram.messenger.hc G = profileActivity.n0.G(i10);
                        if (G != null && (tL_fileLocationToBeDeprecated = G.f) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id) {
                            wq0Var = null;
                            if (tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.a == fileLocation.dc_id) {
                                z13 = true;
                                break;
                            }
                        }
                        i10++;
                    }
                }
                wq0Var = null;
                i10 = -1;
                if (!z13) {
                    return wq0Var;
                }
                zu0 zu0Var = profileActivity.e0;
                if (i10 >= 0 && (av0Var = profileActivity.n0) != null && av0Var.getVisibility() == 0) {
                    if (i10 != profileActivity.n0.getRealPosition() && (rf0Var = (av0Var2 = profileActivity.n0).D0) != null) {
                        av0Var2.x(rf0Var.j() + i10, false);
                    }
                    ?? currentItemView = profileActivity.n0.getCurrentItemView();
                    if (currentItemView != 0) {
                        zu0Var = currentItemView;
                        z11 = true;
                        int[] iArr = new int[2];
                        zu0Var.getLocationInWindow(iArr);
                        wq0 wq0Var2 = new wq0();
                        wq0Var2.b = iArr[0];
                        wq0Var2.c = iArr[1];
                        wq0Var2.d = zu0Var;
                        ImageReceiver imageReceiver = zu0Var.getImageReceiver();
                        wq0Var2.a = imageReceiver;
                        j3 = profileActivity.d1;
                        if (j3 == 0) {
                            wq0Var2.f = j3;
                        } else {
                            long j10 = profileActivity.e1;
                            if (j10 != 0) {
                                wq0Var2.f = -j10;
                            }
                        }
                        wq0Var2.e = imageReceiver.p();
                        wq0Var2.g = -1L;
                        wq0Var2.h = zu0Var.getImageReceiver().E();
                        wq0Var2.k = !z11 ? 1.0f : profileActivity.X.getScaleX();
                        wq0Var2.p = profileActivity.d1 != profileActivity.getUserConfig().n;
                        if (!z11 && profileActivity.X.getScaleX() > 0.96f) {
                            z12 = true;
                        }
                        wq0Var2.r = z12;
                        wq0Var2.s = z11;
                        return wq0Var2;
                    }
                }
                z11 = false;
                int[] iArr2 = new int[2];
                zu0Var.getLocationInWindow(iArr2);
                wq0 wq0Var22 = new wq0();
                wq0Var22.b = iArr2[0];
                wq0Var22.c = iArr2[1];
                wq0Var22.d = zu0Var;
                ImageReceiver imageReceiver2 = zu0Var.getImageReceiver();
                wq0Var22.a = imageReceiver2;
                j3 = profileActivity.d1;
                if (j3 == 0) {
                }
                wq0Var22.e = imageReceiver2.p();
                wq0Var22.g = -1L;
                wq0Var22.h = zu0Var.getImageReceiver().E();
                wq0Var22.k = !z11 ? 1.0f : profileActivity.X.getScaleX();
                wq0Var22.p = profileActivity.d1 != profileActivity.getUserConfig().n;
                if (!z11) {
                    z12 = true;
                }
                wq0Var22.r = z12;
                wq0Var22.s = z11;
                return wq0Var22;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void G() {
        this.a.e0.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void f(String str, String str2, boolean z9) {
        this.a.q0.p(str, str2, z9);
    }
}
