package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cv0 extends eq0 {
    public final /* synthetic */ ProfileActivity a;

    public cv0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.Components.k9] */
    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        TLRPC.Chat M0;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation2;
        mq0 mq0Var;
        int i10;
        boolean z12;
        long j10;
        ru0 ru0Var;
        ru0 ru0Var2;
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
                ru0 ru0Var3 = profileActivity.o0;
                if (ru0Var3 != null) {
                    int realCount = ru0Var3.getRealCount();
                    i10 = 0;
                    while (i10 < realCount) {
                        org.telegram.messenger.ac G = profileActivity.o0.G(i10);
                        if (G != null && (tL_fileLocationToBeDeprecated = G.f) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id) {
                            mq0Var = null;
                            if (tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.a == fileLocation.dc_id) {
                                z14 = true;
                                break;
                            }
                        }
                        i10++;
                    }
                }
                mq0Var = null;
                i10 = -1;
                if (!z14) {
                    return mq0Var;
                }
                qu0 qu0Var = profileActivity.f0;
                if (i10 >= 0 && (ru0Var = profileActivity.o0) != null && ru0Var.getVisibility() == 0) {
                    if (i10 != profileActivity.o0.getRealPosition() && (uf0Var = (ru0Var2 = profileActivity.o0).E0) != null) {
                        ru0Var2.x(uf0Var.j() + i10, false);
                    }
                    ?? currentItemView = profileActivity.o0.getCurrentItemView();
                    if (currentItemView != 0) {
                        qu0Var = currentItemView;
                        z12 = true;
                        int[] iArr = new int[2];
                        qu0Var.getLocationInWindow(iArr);
                        mq0 mq0Var2 = new mq0();
                        mq0Var2.b = iArr[0];
                        mq0Var2.c = iArr[1];
                        mq0Var2.d = qu0Var;
                        ImageReceiver imageReceiver = qu0Var.getImageReceiver();
                        mq0Var2.a = imageReceiver;
                        j10 = profileActivity.e1;
                        if (j10 == 0) {
                            mq0Var2.f = j10;
                        } else {
                            long j11 = profileActivity.f1;
                            if (j11 != 0) {
                                mq0Var2.f = -j11;
                            }
                        }
                        mq0Var2.e = imageReceiver.p();
                        mq0Var2.g = -1L;
                        mq0Var2.h = qu0Var.getImageReceiver().E();
                        mq0Var2.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                        mq0Var2.p = profileActivity.e1 != profileActivity.getUserConfig().n;
                        if (!z12 && profileActivity.Y.getScaleX() > 0.96f) {
                            z13 = true;
                        }
                        mq0Var2.r = z13;
                        mq0Var2.s = z12;
                        return mq0Var2;
                    }
                }
                z12 = false;
                int[] iArr2 = new int[2];
                qu0Var.getLocationInWindow(iArr2);
                mq0 mq0Var22 = new mq0();
                mq0Var22.b = iArr2[0];
                mq0Var22.c = iArr2[1];
                mq0Var22.d = qu0Var;
                ImageReceiver imageReceiver2 = qu0Var.getImageReceiver();
                mq0Var22.a = imageReceiver2;
                j10 = profileActivity.e1;
                if (j10 == 0) {
                }
                mq0Var22.e = imageReceiver2.p();
                mq0Var22.g = -1L;
                mq0Var22.h = qu0Var.getImageReceiver().E();
                mq0Var22.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                mq0Var22.p = profileActivity.e1 != profileActivity.getUserConfig().n;
                if (!z12) {
                    z13 = true;
                }
                mq0Var22.r = z13;
                mq0Var22.s = z12;
                return mq0Var22;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void G() {
        this.a.f0.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void f(String str, String str2, boolean z10) {
        this.a.r0.p(str, str2, z10);
    }
}
