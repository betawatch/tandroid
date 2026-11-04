package org.telegram.ui.Components;

import android.hardware.Camera;
import android.os.Handler;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k40 b;

    public /* synthetic */ n30(k40 k40Var, int i3) {
        this.a = i3;
        this.b = k40Var;
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
        w30 w30Var;
        Handler handler;
        Camera.Size currentPictureSize;
        Camera.Size currentPreviewSize;
        switch (this.a) {
            case 0:
                k40 k40Var = this.b;
                if (k40Var.u0) {
                    k40Var.u();
                    break;
                }
                break;
            case 1:
                k40 k40Var2 = this.b;
                Size[] sizeArr = k40Var2.n0;
                if (k40Var2.t0 != null) {
                    k40Var2.v();
                    boolean z10 = true;
                    try {
                        currentPreviewSize = k40Var2.t0.getCurrentPreviewSize();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (currentPreviewSize.width == sizeArr[0].getWidth()) {
                        if (currentPreviewSize.height != sizeArr[0].getHeight()) {
                        }
                        currentPictureSize = k40Var2.t0.getCurrentPictureSize();
                        if (currentPictureSize.width == k40Var2.o0.getWidth()) {
                            if (currentPictureSize.height == k40Var2.o0.getHeight()) {
                            }
                            z10 = false;
                            if (org.telegram.messenger.r2.a) {
                                org.telegram.messenger.a8.b("InstantCamera camera initied");
                            }
                            k40Var2.t0.setInitied();
                            if (z10 && (w30Var = k40Var2.m0) != null && (handler = w30Var.getHandler()) != null) {
                                w30Var.sendMessage(handler.obtainMessage(2), 0);
                                break;
                            }
                        }
                        k40Var2.o0 = new Size(currentPictureSize.width, currentPictureSize.height);
                        org.telegram.messenger.a8.b("InstantCamera change picture size to w = " + k40Var2.o0.getWidth() + " h = " + k40Var2.o0.getHeight());
                        if (org.telegram.messenger.r2.a) {
                        }
                        k40Var2.t0.setInitied();
                        if (z10) {
                        }
                    }
                    sizeArr[0] = new Size(currentPreviewSize.width, currentPreviewSize.height);
                    org.telegram.messenger.a8.b("InstantCamera change preview size to w = " + sizeArr[0].getWidth() + " h = " + sizeArr[0].getHeight());
                    currentPictureSize = k40Var2.t0.getCurrentPictureSize();
                    if (currentPictureSize.width == k40Var2.o0.getWidth()) {
                    }
                    k40Var2.o0 = new Size(currentPictureSize.width, currentPictureSize.height);
                    org.telegram.messenger.a8.b("InstantCamera change picture size to w = " + k40Var2.o0.getWidth() + " h = " + k40Var2.o0.getHeight());
                    if (org.telegram.messenger.r2.a) {
                    }
                    k40Var2.t0.setInitied();
                    if (z10) {
                    }
                }
                break;
            default:
                k40 k40Var3 = this.b;
                w30 w30Var2 = k40Var3.m0;
                if (w30Var2 != null) {
                    CameraSession cameraSession = k40Var3.t0;
                    Handler handler2 = w30Var2.getHandler();
                    if (handler2 != null) {
                        w30Var2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                        break;
                    }
                }
                break;
        }
    }
}
