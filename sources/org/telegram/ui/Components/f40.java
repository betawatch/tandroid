package org.telegram.ui.Components;

import android.hardware.Camera;
import android.os.Handler;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c50 b;

    public /* synthetic */ f40(c50 c50Var, int i7) {
        this.a = i7;
        this.b = c50Var;
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
        o40 o40Var;
        Handler handler;
        Camera.Size currentPictureSize;
        Camera.Size currentPreviewSize;
        switch (this.a) {
            case 0:
                c50 c50Var = this.b;
                if (c50Var.u0) {
                    c50Var.v();
                    break;
                }
                break;
            case 1:
                c50 c50Var2 = this.b;
                Size[] sizeArr = c50Var2.n0;
                if (c50Var2.t0 != null) {
                    c50Var2.w();
                    boolean z10 = true;
                    try {
                        currentPreviewSize = c50Var2.t0.getCurrentPreviewSize();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (currentPreviewSize.width == sizeArr[0].getWidth()) {
                        if (currentPreviewSize.height != sizeArr[0].getHeight()) {
                        }
                        currentPictureSize = c50Var2.t0.getCurrentPictureSize();
                        if (currentPictureSize.width == c50Var2.o0.getWidth()) {
                            if (currentPictureSize.height == c50Var2.o0.getHeight()) {
                            }
                            z10 = false;
                            if (org.telegram.messenger.s2.a) {
                                org.telegram.messenger.a8.b("InstantCamera camera initied");
                            }
                            c50Var2.t0.setInitied();
                            if (z10 && (o40Var = c50Var2.m0) != null && (handler = o40Var.getHandler()) != null) {
                                o40Var.sendMessage(handler.obtainMessage(2), 0);
                                break;
                            }
                        }
                        c50Var2.o0 = new Size(currentPictureSize.width, currentPictureSize.height);
                        org.telegram.messenger.a8.b("InstantCamera change picture size to w = " + c50Var2.o0.getWidth() + " h = " + c50Var2.o0.getHeight());
                        if (org.telegram.messenger.s2.a) {
                        }
                        c50Var2.t0.setInitied();
                        if (z10) {
                        }
                    }
                    sizeArr[0] = new Size(currentPreviewSize.width, currentPreviewSize.height);
                    org.telegram.messenger.a8.b("InstantCamera change preview size to w = " + sizeArr[0].getWidth() + " h = " + sizeArr[0].getHeight());
                    currentPictureSize = c50Var2.t0.getCurrentPictureSize();
                    if (currentPictureSize.width == c50Var2.o0.getWidth()) {
                    }
                    c50Var2.o0 = new Size(currentPictureSize.width, currentPictureSize.height);
                    org.telegram.messenger.a8.b("InstantCamera change picture size to w = " + c50Var2.o0.getWidth() + " h = " + c50Var2.o0.getHeight());
                    if (org.telegram.messenger.s2.a) {
                    }
                    c50Var2.t0.setInitied();
                    if (z10) {
                    }
                }
                break;
            default:
                c50 c50Var3 = this.b;
                o40 o40Var2 = c50Var3.m0;
                if (o40Var2 != null) {
                    CameraSession cameraSession = c50Var3.t0;
                    Handler handler2 = o40Var2.getHandler();
                    if (handler2 != null) {
                        o40Var2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                        break;
                    }
                }
                break;
        }
    }
}
