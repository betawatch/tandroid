// default package

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kp8 extends jb8 {
    public final /* synthetic */ ProfileActivity a;

    public kp8(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // jb8, pb8
    public final void G() {
        this.a.f0.getImageReceiver().v0(true, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f6  */
    /* JADX WARN: Type inference failed for: r12v8, types: [bf0] */
    @Override // jb8, pb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        boolean z3;
        zo8 zo8Var;
        int i2;
        boolean z4;
        long j;
        zo8 zo8Var2;
        zo8 zo8Var3;
        sr8 sr8Var;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (fileLocation != null) {
            ProfileActivity profileActivity = this.a;
            if (profileActivity.Y.getScaleX() <= 0.96f || !z2) {
                if (profileActivity.e1 != 0) {
                    TLRPC.FileLocation fileLocation2 = null;
                    boolean z5 = false;
                    z3 = fileLocation2 == null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id;
                    zo8Var = profileActivity.o0;
                    if (zo8Var != null) {
                        int realCount = zo8Var.getRealCount();
                        i2 = 0;
                        while (i2 < realCount) {
                            gn5 G = profileActivity.o0.G(i2);
                            if (G != null && (tL_fileLocationToBeDeprecated = G.f) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id && tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.a == fileLocation.dc_id) {
                                z3 = true;
                                break;
                            }
                            i2++;
                        }
                    }
                    i2 = -1;
                    if (z3) {
                        yo8 yo8Var = profileActivity.f0;
                        if (i2 >= 0 && (zo8Var2 = profileActivity.o0) != null && zo8Var2.getVisibility() == 0) {
                            if (i2 != profileActivity.o0.getRealPosition() && (sr8Var = (zo8Var3 = profileActivity.o0).E0) != null) {
                                zo8Var3.x(sr8Var.j() + i2, false);
                            }
                            ?? currentItemView = profileActivity.o0.getCurrentItemView();
                            if (currentItemView != 0) {
                                yo8Var = currentItemView;
                                z4 = true;
                                int[] iArr = new int[2];
                                yo8Var.getLocationInWindow(iArr);
                                qb8 qb8Var = new qb8();
                                qb8Var.b = iArr[0];
                                qb8Var.c = iArr[1];
                                qb8Var.d = yo8Var;
                                ImageReceiver imageReceiver = yo8Var.getImageReceiver();
                                qb8Var.a = imageReceiver;
                                j = profileActivity.e1;
                                if (j == 0) {
                                    qb8Var.f = j;
                                } else {
                                    long j2 = profileActivity.f1;
                                    if (j2 != 0) {
                                        qb8Var.f = -j2;
                                    }
                                }
                                qb8Var.e = imageReceiver.p();
                                qb8Var.g = -1L;
                                qb8Var.h = yo8Var.getImageReceiver().z();
                                qb8Var.k = !z4 ? 1.0f : profileActivity.Y.getScaleX();
                                qb8Var.p = profileActivity.e1 != profileActivity.getUserConfig().n;
                                if (!z4 && profileActivity.Y.getScaleX() > 0.96f) {
                                    z5 = true;
                                }
                                qb8Var.r = z5;
                                qb8Var.s = z4;
                                return qb8Var;
                            }
                        }
                        z4 = false;
                        int[] iArr2 = new int[2];
                        yo8Var.getLocationInWindow(iArr2);
                        qb8 qb8Var2 = new qb8();
                        qb8Var2.b = iArr2[0];
                        qb8Var2.c = iArr2[1];
                        qb8Var2.d = yo8Var;
                        ImageReceiver imageReceiver2 = yo8Var.getImageReceiver();
                        qb8Var2.a = imageReceiver2;
                        j = profileActivity.e1;
                        if (j == 0) {
                        }
                        qb8Var2.e = imageReceiver2.p();
                        qb8Var2.g = -1L;
                        qb8Var2.h = yo8Var.getImageReceiver().z();
                        qb8Var2.k = !z4 ? 1.0f : profileActivity.Y.getScaleX();
                        qb8Var2.p = profileActivity.e1 != profileActivity.getUserConfig().n;
                        if (!z4) {
                            z5 = true;
                        }
                        qb8Var2.r = z5;
                        qb8Var2.s = z4;
                        return qb8Var2;
                    }
                } else {
                    TLRPC.FileLocation fileLocation22 = null;
                    boolean z52 = false;
                    if (fileLocation22 == null) {
                    }
                    zo8Var = profileActivity.o0;
                    if (zo8Var != null) {
                    }
                    i2 = -1;
                    if (z3) {
                    }
                }
            }
        }
        return null;
    }

    @Override // jb8, pb8
    public final void g(String str, String str2, boolean z) {
        this.a.r0.p(str, str2, z);
    }
}
