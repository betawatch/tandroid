package org.telegram.ui.Components;

import android.hardware.Camera;
import android.os.Handler;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b60 b;

    public /* synthetic */ d50(b60 b60Var, int i10) {
        this.a = i10;
        this.b = b60Var;
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
        m50 m50Var;
        Handler handler;
        Camera.Size currentPictureSize;
        Camera.Size currentPreviewSize;
        switch (this.a) {
            case 0:
                b60 b60Var = this.b;
                if (b60Var.s0) {
                    b60Var.u();
                    break;
                }
                break;
            case 1:
                b60 b60Var2 = this.b;
                Size[] sizeArr = b60Var2.l0;
                if (b60Var2.r0 != null) {
                    b60Var2.v();
                    try {
                        currentPreviewSize = b60Var2.r0.getCurrentPreviewSize();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (currentPreviewSize.width == sizeArr[0].getWidth()) {
                        if (currentPreviewSize.height != sizeArr[0].getHeight()) {
                        }
                        currentPictureSize = b60Var2.r0.getCurrentPictureSize();
                        if (currentPictureSize.width == b60Var2.m0.getWidth()) {
                            if (currentPictureSize.height == b60Var2.m0.getHeight()) {
                            }
                            z10 = false;
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("InstantCamera camera initied");
                            }
                            b60Var2.r0.setInitied();
                            if (z10 && (m50Var = b60Var2.k0) != null && (handler = m50Var.getHandler()) != null) {
                                m50Var.sendMessage(handler.obtainMessage(2), 0);
                                break;
                            }
                        }
                        b60Var2.m0 = new Size(currentPictureSize.width, currentPictureSize.height);
                        FileLog.d("InstantCamera change picture size to w = " + b60Var2.m0.getWidth() + " h = " + b60Var2.m0.getHeight());
                        z10 = true;
                        if (BuildVars.LOGS_ENABLED) {
                        }
                        b60Var2.r0.setInitied();
                        if (z10) {
                        }
                    }
                    sizeArr[0] = new Size(currentPreviewSize.width, currentPreviewSize.height);
                    FileLog.d("InstantCamera change preview size to w = " + sizeArr[0].getWidth() + " h = " + sizeArr[0].getHeight());
                    currentPictureSize = b60Var2.r0.getCurrentPictureSize();
                    if (currentPictureSize.width == b60Var2.m0.getWidth()) {
                    }
                    b60Var2.m0 = new Size(currentPictureSize.width, currentPictureSize.height);
                    FileLog.d("InstantCamera change picture size to w = " + b60Var2.m0.getWidth() + " h = " + b60Var2.m0.getHeight());
                    z10 = true;
                    if (BuildVars.LOGS_ENABLED) {
                    }
                    b60Var2.r0.setInitied();
                    if (z10) {
                    }
                }
                break;
            default:
                b60 b60Var3 = this.b;
                m50 m50Var2 = b60Var3.k0;
                if (m50Var2 != null) {
                    CameraSession cameraSession = b60Var3.r0;
                    Handler handler2 = m50Var2.getHandler();
                    if (handler2 != null) {
                        m50Var2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                        break;
                    }
                }
                break;
        }
    }
}
