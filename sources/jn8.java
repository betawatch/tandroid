// default package

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jn8 extends i98 {
    public final /* synthetic */ ProfileActivity a;

    public jn8(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // i98, o98
    public final void F() {
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
    /* JADX WARN: Type inference failed for: r12v8, types: [be0] */
    @Override // i98, o98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        boolean z3;
        ym8 ym8Var;
        int i2;
        boolean z4;
        long j;
        ym8 ym8Var2;
        ym8 ym8Var3;
        rp8 rp8Var;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (fileLocation != null) {
            ProfileActivity profileActivity = this.a;
            if (profileActivity.Y.getScaleX() <= 0.96f || !z2) {
                if (profileActivity.e1 != 0) {
                    TLRPC.FileLocation fileLocation2 = null;
                    boolean z5 = false;
                    z3 = fileLocation2 == null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id;
                    ym8Var = profileActivity.o0;
                    if (ym8Var != null) {
                        int realCount = ym8Var.getRealCount();
                        i2 = 0;
                        while (i2 < realCount) {
                            gl5 G = profileActivity.o0.G(i2);
                            if (G != null && (tL_fileLocationToBeDeprecated = G.f) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id && tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.a == fileLocation.dc_id) {
                                z3 = true;
                                break;
                            }
                            i2++;
                        }
                    }
                    i2 = -1;
                    if (z3) {
                        xm8 xm8Var = profileActivity.f0;
                        if (i2 >= 0 && (ym8Var2 = profileActivity.o0) != null && ym8Var2.getVisibility() == 0) {
                            if (i2 != profileActivity.o0.getRealPosition() && (rp8Var = (ym8Var3 = profileActivity.o0).E0) != null) {
                                ym8Var3.x(rp8Var.j() + i2, false);
                            }
                            ?? currentItemView = profileActivity.o0.getCurrentItemView();
                            if (currentItemView != 0) {
                                xm8Var = currentItemView;
                                z4 = true;
                                int[] iArr = new int[2];
                                xm8Var.getLocationInWindow(iArr);
                                p98 p98Var = new p98();
                                p98Var.b = iArr[0];
                                p98Var.c = iArr[1];
                                p98Var.d = xm8Var;
                                ImageReceiver imageReceiver = xm8Var.getImageReceiver();
                                p98Var.a = imageReceiver;
                                j = profileActivity.e1;
                                if (j == 0) {
                                    p98Var.f = j;
                                } else {
                                    long j2 = profileActivity.f1;
                                    if (j2 != 0) {
                                        p98Var.f = -j2;
                                    }
                                }
                                p98Var.e = imageReceiver.p();
                                p98Var.g = -1L;
                                p98Var.h = xm8Var.getImageReceiver().z();
                                p98Var.k = !z4 ? 1.0f : profileActivity.Y.getScaleX();
                                p98Var.p = profileActivity.e1 != profileActivity.getUserConfig().n;
                                if (!z4 && profileActivity.Y.getScaleX() > 0.96f) {
                                    z5 = true;
                                }
                                p98Var.r = z5;
                                p98Var.s = z4;
                                return p98Var;
                            }
                        }
                        z4 = false;
                        int[] iArr2 = new int[2];
                        xm8Var.getLocationInWindow(iArr2);
                        p98 p98Var2 = new p98();
                        p98Var2.b = iArr2[0];
                        p98Var2.c = iArr2[1];
                        p98Var2.d = xm8Var;
                        ImageReceiver imageReceiver2 = xm8Var.getImageReceiver();
                        p98Var2.a = imageReceiver2;
                        j = profileActivity.e1;
                        if (j == 0) {
                        }
                        p98Var2.e = imageReceiver2.p();
                        p98Var2.g = -1L;
                        p98Var2.h = xm8Var.getImageReceiver().z();
                        p98Var2.k = !z4 ? 1.0f : profileActivity.Y.getScaleX();
                        p98Var2.p = profileActivity.e1 != profileActivity.getUserConfig().n;
                        if (!z4) {
                            z5 = true;
                        }
                        p98Var2.r = z5;
                        p98Var2.s = z4;
                        return p98Var2;
                    }
                } else {
                    TLRPC.FileLocation fileLocation22 = null;
                    boolean z52 = false;
                    if (fileLocation22 == null) {
                    }
                    ym8Var = profileActivity.o0;
                    if (ym8Var != null) {
                    }
                    i2 = -1;
                    if (z3) {
                    }
                }
            }
        }
        return null;
    }

    @Override // i98, o98
    public final void g(String str, String str2, boolean z) {
        this.a.r0.p(str, str2, z);
    }
}
