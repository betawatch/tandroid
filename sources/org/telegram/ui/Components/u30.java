package org.telegram.ui.Components;

import android.hardware.Camera;
import android.os.Handler;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r40 b;

    public /* synthetic */ u30(r40 r40Var, int i7) {
        this.a = i7;
        this.b = r40Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:14|15|16|(10:18|(1:20)|21|22|(7:24|(1:26)|27|28|(1:30)|31|(0)(1:37))|42|28|(0)|31|(1:33))|47|21|22|(0)|42|28|(0)|31|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:22:0x007d, B:24:0x008d, B:42:0x009a), top: B:21:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        d40 d40Var;
        Handler handler;
        Camera.Size currentPictureSize;
        Camera.Size currentPreviewSize;
        switch (this.a) {
            case 0:
                r40 r40Var = this.b;
                if (r40Var.u0) {
                    r40Var.v();
                    break;
                }
                break;
            case 1:
                r40 r40Var2 = this.b;
                Size[] sizeArr = r40Var2.n0;
                if (r40Var2.t0 != null) {
                    r40Var2.w();
                    boolean z10 = true;
                    try {
                        currentPreviewSize = r40Var2.t0.getCurrentPreviewSize();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (currentPreviewSize.width == sizeArr[0].getWidth()) {
                        if (currentPreviewSize.height != sizeArr[0].getHeight()) {
                        }
                        currentPictureSize = r40Var2.t0.getCurrentPictureSize();
                        if (currentPictureSize.width == r40Var2.o0.getWidth()) {
                            if (currentPictureSize.height == r40Var2.o0.getHeight()) {
                            }
                            z10 = false;
                            if (org.telegram.messenger.r2.a) {
                                org.telegram.messenger.a8.b("InstantCamera camera initied");
                            }
                            r40Var2.t0.setInitied();
                            if (z10 && (d40Var = r40Var2.m0) != null && (handler = d40Var.getHandler()) != null) {
                                d40Var.sendMessage(handler.obtainMessage(2), 0);
                                break;
                            }
                        }
                        r40Var2.o0 = new Size(currentPictureSize.width, currentPictureSize.height);
                        org.telegram.messenger.a8.b("InstantCamera change picture size to w = " + r40Var2.o0.getWidth() + " h = " + r40Var2.o0.getHeight());
                        if (org.telegram.messenger.r2.a) {
                        }
                        r40Var2.t0.setInitied();
                        if (z10) {
                        }
                    }
                    sizeArr[0] = new Size(currentPreviewSize.width, currentPreviewSize.height);
                    org.telegram.messenger.a8.b("InstantCamera change preview size to w = " + sizeArr[0].getWidth() + " h = " + sizeArr[0].getHeight());
                    currentPictureSize = r40Var2.t0.getCurrentPictureSize();
                    if (currentPictureSize.width == r40Var2.o0.getWidth()) {
                    }
                    r40Var2.o0 = new Size(currentPictureSize.width, currentPictureSize.height);
                    org.telegram.messenger.a8.b("InstantCamera change picture size to w = " + r40Var2.o0.getWidth() + " h = " + r40Var2.o0.getHeight());
                    if (org.telegram.messenger.r2.a) {
                    }
                    r40Var2.t0.setInitied();
                    if (z10) {
                    }
                }
                break;
            default:
                r40 r40Var3 = this.b;
                d40 d40Var2 = r40Var3.m0;
                if (d40Var2 != null) {
                    CameraSession cameraSession = r40Var3.t0;
                    Handler handler2 = d40Var2.getHandler();
                    if (handler2 != null) {
                        d40Var2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                        break;
                    }
                }
                break;
        }
    }
}
