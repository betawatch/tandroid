package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class kv0 extends oq0 {
    public final /* synthetic */ ProfileActivity a;

    public kv0(ProfileActivity profileActivity) {
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
    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        TLRPC.Chat O0;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation2;
        wq0 wq0Var;
        int i10;
        boolean z12;
        long j3;
        zu0 zu0Var;
        zu0 zu0Var2;
        org.telegram.ui.Components.fg0 fg0Var;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        TLRPC.User c22;
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (fileLocation != null) {
            ProfileActivity profileActivity = this.a;
            if (profileActivity.Y.getScaleX() <= 0.96f || !z11) {
                if (profileActivity.e1 == 0 ? profileActivity.f1 == 0 || (O0 = profileActivity.getMessagesController().O0(Long.valueOf(profileActivity.f1))) == null || (chatPhoto = O0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null : (c22 = profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.e1))) == null || (userProfilePhoto = c22.photo) == null || (fileLocation2 = userProfilePhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
                boolean z13 = false;
                boolean z14 = fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id;
                zu0 zu0Var3 = profileActivity.o0;
                if (zu0Var3 != null) {
                    int realCount = zu0Var3.getRealCount();
                    i10 = 0;
                    while (i10 < realCount) {
                        org.telegram.messenger.fc G = profileActivity.o0.G(i10);
                        if (G != null && (tL_fileLocationToBeDeprecated = G.f) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id) {
                            wq0Var = null;
                            if (tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.a == fileLocation.dc_id) {
                                z14 = true;
                                break;
                            }
                        }
                        i10++;
                    }
                }
                wq0Var = null;
                i10 = -1;
                if (!z14) {
                    return wq0Var;
                }
                yu0 yu0Var = profileActivity.f0;
                if (i10 >= 0 && (zu0Var = profileActivity.o0) != null && zu0Var.getVisibility() == 0) {
                    if (i10 != profileActivity.o0.getRealPosition() && (fg0Var = (zu0Var2 = profileActivity.o0).E0) != null) {
                        zu0Var2.x(fg0Var.j() + i10, false);
                    }
                    ?? currentItemView = profileActivity.o0.getCurrentItemView();
                    if (currentItemView != 0) {
                        yu0Var = currentItemView;
                        z12 = true;
                        int[] iArr = new int[2];
                        yu0Var.getLocationInWindow(iArr);
                        wq0 wq0Var2 = new wq0();
                        wq0Var2.b = iArr[0];
                        wq0Var2.c = iArr[1];
                        wq0Var2.d = yu0Var;
                        ImageReceiver imageReceiver = yu0Var.getImageReceiver();
                        wq0Var2.a = imageReceiver;
                        j3 = profileActivity.e1;
                        if (j3 == 0) {
                            wq0Var2.f = j3;
                        } else {
                            long j10 = profileActivity.f1;
                            if (j10 != 0) {
                                wq0Var2.f = -j10;
                            }
                        }
                        wq0Var2.e = imageReceiver.p();
                        wq0Var2.g = -1L;
                        wq0Var2.h = yu0Var.getImageReceiver().F();
                        wq0Var2.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                        wq0Var2.p = profileActivity.e1 != profileActivity.getUserConfig().n;
                        if (!z12 && profileActivity.Y.getScaleX() > 0.96f) {
                            z13 = true;
                        }
                        wq0Var2.r = z13;
                        wq0Var2.s = z12;
                        return wq0Var2;
                    }
                }
                z12 = false;
                int[] iArr2 = new int[2];
                yu0Var.getLocationInWindow(iArr2);
                wq0 wq0Var22 = new wq0();
                wq0Var22.b = iArr2[0];
                wq0Var22.c = iArr2[1];
                wq0Var22.d = yu0Var;
                ImageReceiver imageReceiver2 = yu0Var.getImageReceiver();
                wq0Var22.a = imageReceiver2;
                j3 = profileActivity.e1;
                if (j3 == 0) {
                }
                wq0Var22.e = imageReceiver2.p();
                wq0Var22.g = -1L;
                wq0Var22.h = yu0Var.getImageReceiver().F();
                wq0Var22.k = !z12 ? 1.0f : profileActivity.Y.getScaleX();
                wq0Var22.p = profileActivity.e1 != profileActivity.getUserConfig().n;
                if (!z12) {
                    z13 = true;
                }
                wq0Var22.r = z13;
                wq0Var22.s = z12;
                return wq0Var22;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void G() {
        this.a.f0.getImageReceiver().P0(true, true);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void f(String str, String str2, boolean z10) {
        this.a.r0.p(str, str2, z10);
    }
}
