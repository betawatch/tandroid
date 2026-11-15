package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class jv0 extends mq0 {
    public final /* synthetic */ ProfileActivity a;

    public jv0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.Components.i9] */
    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        TLRPC.Chat M0;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation2;
        uq0 uq0Var;
        int i10;
        boolean z12;
        long j3;
        yu0 yu0Var;
        yu0 yu0Var2;
        org.telegram.ui.Components.uf0 uf0Var;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        TLRPC.User a22;
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (fileLocation != null) {
            ProfileActivity profileActivity = this.a;
            if (profileActivity.Y.getScaleX() <= 0.96f || !z11) {
                if (profileActivity.e1 == 0 ? profileActivity.f1 == 0 || (M0 = profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f1))) == null || (chatPhoto = M0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null : (a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1))) == null || (userProfilePhoto = a22.photo) == null || (fileLocation2 = userProfilePhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
                boolean z13 = false;
                boolean z14 = fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id;
                yu0 yu0Var3 = profileActivity.o0;
                if (yu0Var3 != null) {
                    int realCount = yu0Var3.getRealCount();
                    i10 = 0;
                    while (i10 < realCount) {
                        org.telegram.messenger.gc G = profileActivity.o0.G(i10);
                        if (G != null && (tL_fileLocationToBeDeprecated = G.f) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id) {
                            uq0Var = null;
                            if (tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.a == fileLocation.dc_id) {
                                z14 = true;
                                break;
                            }
                        }
                        i10++;
                    }
                }
                uq0Var = null;
                i10 = -1;
                if (!z14) {
                    return uq0Var;
                }
                xu0 xu0Var = profileActivity.f0;
                if (i10 >= 0 && (yu0Var = profileActivity.o0) != null && yu0Var.getVisibility() == 0) {
                    if (i10 != profileActivity.o0.getRealPosition() && (uf0Var = (yu0Var2 = profileActivity.o0).E0) != null) {
                        yu0Var2.x(uf0Var.j() + i10, false);
                    }
                    ?? currentItemView = profileActivity.o0.getCurrentItemView();
                    if (currentItemView != 0) {
                        xu0Var = currentItemView;
                        z12 = true;
                        int[] iArr = new int[2];
                        xu0Var.getLocationInWindow(iArr);
                        uq0 uq0Var2 = new uq0();
                        uq0Var2.b = iArr[0];
                        uq0Var2.c = iArr[1];
                        uq0Var2.d = xu0Var;
                        ImageReceiver imageReceiver = xu0Var.getImageReceiver();
                        uq0Var2.a = imageReceiver;
                        j3 = profileActivity.e1;
                        if (j3 == 0) {
                            uq0Var2.f = j3;
                        } else {
                            long j10 = profileActivity.f1;
                            if (j10 != 0) {
                                uq0Var2.f = -j10;
                            }
                        }
                        uq0Var2.e = imageReceiver.p();
                        uq0Var2.g = -1L;
                        uq0Var2.h = xu0Var.getImageReceiver().E();
                        uq0Var2.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                        uq0Var2.p = profileActivity.e1 != profileActivity.getUserConfig().n;
                        if (!z12 && profileActivity.Y.getScaleX() > 0.96f) {
                            z13 = true;
                        }
                        uq0Var2.r = z13;
                        uq0Var2.s = z12;
                        return uq0Var2;
                    }
                }
                z12 = false;
                int[] iArr2 = new int[2];
                xu0Var.getLocationInWindow(iArr2);
                uq0 uq0Var22 = new uq0();
                uq0Var22.b = iArr2[0];
                uq0Var22.c = iArr2[1];
                uq0Var22.d = xu0Var;
                ImageReceiver imageReceiver2 = xu0Var.getImageReceiver();
                uq0Var22.a = imageReceiver2;
                j3 = profileActivity.e1;
                if (j3 == 0) {
                }
                uq0Var22.e = imageReceiver2.p();
                uq0Var22.g = -1L;
                uq0Var22.h = xu0Var.getImageReceiver().E();
                uq0Var22.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                uq0Var22.p = profileActivity.e1 != profileActivity.getUserConfig().n;
                if (!z12) {
                    z13 = true;
                }
                uq0Var22.r = z13;
                uq0Var22.s = z12;
                return uq0Var22;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void G() {
        this.a.f0.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void f(String str, String str2, boolean z10) {
        this.a.r0.p(str, str2, z10);
    }
}
