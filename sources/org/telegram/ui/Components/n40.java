package org.telegram.ui.Components;

import android.hardware.Camera;
import android.os.Handler;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f50 b;

    public /* synthetic */ n40(f50 f50Var, int i9) {
        this.a = i9;
        this.b = f50Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|16|(11:18|(1:20)|21|22|(7:24|(1:26)|27|28|(1:30)|31|(0)(1:37))|42|43|28|(0)|31|(1:33))|48|21|22|(0)|42|43|28|(0)|31|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c A[Catch: Exception -> 0x0097, TryCatch #1 {Exception -> 0x0097, blocks: (B:22:0x007c, B:24:0x008c, B:42:0x0099), top: B:21:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        w40 w40Var;
        Handler handler;
        Camera.Size currentPictureSize;
        Camera.Size currentPreviewSize;
        switch (this.a) {
            case 0:
                f50 f50Var = this.b;
                if (f50Var.l0) {
                    f50Var.p();
                    break;
                }
                break;
            case 1:
                f50 f50Var2 = this.b;
                Size[] sizeArr = f50Var2.e0;
                if (f50Var2.k0 != null) {
                    f50Var2.r();
                    try {
                        currentPreviewSize = f50Var2.k0.getCurrentPreviewSize();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (currentPreviewSize.width == sizeArr[0].getWidth()) {
                        if (currentPreviewSize.height != sizeArr[0].getHeight()) {
                        }
                        currentPictureSize = f50Var2.k0.getCurrentPictureSize();
                        if (currentPictureSize.width == f50Var2.f0.getWidth()) {
                            if (currentPictureSize.height == f50Var2.f0.getHeight()) {
                            }
                            z10 = false;
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("InstantCamera camera initied");
                            }
                            f50Var2.k0.setInitied();
                            if (z10 && (w40Var = f50Var2.d0) != null && (handler = w40Var.getHandler()) != null) {
                                w40Var.sendMessage(handler.obtainMessage(2), 0);
                                break;
                            }
                        }
                        f50Var2.f0 = new Size(currentPictureSize.width, currentPictureSize.height);
                        FileLog.d("InstantCamera change picture size to w = " + f50Var2.f0.getWidth() + " h = " + f50Var2.f0.getHeight());
                        z10 = true;
                        if (BuildVars.LOGS_ENABLED) {
                        }
                        f50Var2.k0.setInitied();
                        if (z10) {
                        }
                    }
                    sizeArr[0] = new Size(currentPreviewSize.width, currentPreviewSize.height);
                    FileLog.d("InstantCamera change preview size to w = " + sizeArr[0].getWidth() + " h = " + sizeArr[0].getHeight());
                    currentPictureSize = f50Var2.k0.getCurrentPictureSize();
                    if (currentPictureSize.width == f50Var2.f0.getWidth()) {
                    }
                    f50Var2.f0 = new Size(currentPictureSize.width, currentPictureSize.height);
                    FileLog.d("InstantCamera change picture size to w = " + f50Var2.f0.getWidth() + " h = " + f50Var2.f0.getHeight());
                    z10 = true;
                    if (BuildVars.LOGS_ENABLED) {
                    }
                    f50Var2.k0.setInitied();
                    if (z10) {
                    }
                }
                break;
            default:
                f50 f50Var3 = this.b;
                w40 w40Var2 = f50Var3.d0;
                if (w40Var2 != null) {
                    CameraSession cameraSession = f50Var3.k0;
                    Handler handler2 = w40Var2.getHandler();
                    if (handler2 != null) {
                        w40Var2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                        break;
                    }
                }
                break;
        }
    }
}
