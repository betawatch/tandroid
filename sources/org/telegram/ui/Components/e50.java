package org.telegram.ui.Components;

import android.hardware.Camera;
import android.os.Handler;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c60 b;

    public /* synthetic */ e50(c60 c60Var, int i10) {
        this.a = i10;
        this.b = c60Var;
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
        n50 n50Var;
        Handler handler;
        Camera.Size currentPictureSize;
        Camera.Size currentPreviewSize;
        switch (this.a) {
            case 0:
                c60 c60Var = this.b;
                if (c60Var.u0) {
                    c60Var.t();
                    break;
                }
                break;
            case 1:
                c60 c60Var2 = this.b;
                Size[] sizeArr = c60Var2.n0;
                if (c60Var2.t0 != null) {
                    c60Var2.u();
                    try {
                        currentPreviewSize = c60Var2.t0.getCurrentPreviewSize();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (currentPreviewSize.width == sizeArr[0].getWidth()) {
                        if (currentPreviewSize.height != sizeArr[0].getHeight()) {
                        }
                        currentPictureSize = c60Var2.t0.getCurrentPictureSize();
                        if (currentPictureSize.width == c60Var2.o0.getWidth()) {
                            if (currentPictureSize.height == c60Var2.o0.getHeight()) {
                            }
                            z10 = false;
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("InstantCamera camera initied");
                            }
                            c60Var2.t0.setInitied();
                            if (z10 && (n50Var = c60Var2.m0) != null && (handler = n50Var.getHandler()) != null) {
                                n50Var.sendMessage(handler.obtainMessage(2), 0);
                                break;
                            }
                        }
                        c60Var2.o0 = new Size(currentPictureSize.width, currentPictureSize.height);
                        FileLog.d("InstantCamera change picture size to w = " + c60Var2.o0.getWidth() + " h = " + c60Var2.o0.getHeight());
                        z10 = true;
                        if (BuildVars.LOGS_ENABLED) {
                        }
                        c60Var2.t0.setInitied();
                        if (z10) {
                        }
                    }
                    sizeArr[0] = new Size(currentPreviewSize.width, currentPreviewSize.height);
                    FileLog.d("InstantCamera change preview size to w = " + sizeArr[0].getWidth() + " h = " + sizeArr[0].getHeight());
                    currentPictureSize = c60Var2.t0.getCurrentPictureSize();
                    if (currentPictureSize.width == c60Var2.o0.getWidth()) {
                    }
                    c60Var2.o0 = new Size(currentPictureSize.width, currentPictureSize.height);
                    FileLog.d("InstantCamera change picture size to w = " + c60Var2.o0.getWidth() + " h = " + c60Var2.o0.getHeight());
                    z10 = true;
                    if (BuildVars.LOGS_ENABLED) {
                    }
                    c60Var2.t0.setInitied();
                    if (z10) {
                    }
                }
                break;
            default:
                c60 c60Var3 = this.b;
                n50 n50Var2 = c60Var3.m0;
                if (n50Var2 != null) {
                    CameraSession cameraSession = c60Var3.t0;
                    Handler handler2 = n50Var2.getHandler();
                    if (handler2 != null) {
                        n50Var2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                        break;
                    }
                }
                break;
        }
    }
}
