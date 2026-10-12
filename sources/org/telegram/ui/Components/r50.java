package org.telegram.ui.Components;

import android.hardware.Camera;
import android.os.Handler;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class r50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p60 b;

    public /* synthetic */ r50(p60 p60Var, int i10) {
        this.a = i10;
        this.b = p60Var;
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
        a60 a60Var;
        Handler handler;
        Camera.Size currentPictureSize;
        Camera.Size currentPreviewSize;
        switch (this.a) {
            case 0:
                p60 p60Var = this.b;
                if (p60Var.u0) {
                    p60Var.u();
                    break;
                }
                break;
            case 1:
                p60 p60Var2 = this.b;
                Size[] sizeArr = p60Var2.n0;
                if (p60Var2.t0 != null) {
                    p60Var2.v();
                    try {
                        currentPreviewSize = p60Var2.t0.getCurrentPreviewSize();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (currentPreviewSize.width == sizeArr[0].getWidth()) {
                        if (currentPreviewSize.height != sizeArr[0].getHeight()) {
                        }
                        currentPictureSize = p60Var2.t0.getCurrentPictureSize();
                        if (currentPictureSize.width == p60Var2.o0.getWidth()) {
                            if (currentPictureSize.height == p60Var2.o0.getHeight()) {
                            }
                            z10 = false;
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("InstantCamera camera initied");
                            }
                            p60Var2.t0.setInitied();
                            if (z10 && (a60Var = p60Var2.m0) != null && (handler = a60Var.getHandler()) != null) {
                                a60Var.sendMessage(handler.obtainMessage(2), 0);
                                break;
                            }
                        }
                        p60Var2.o0 = new Size(currentPictureSize.width, currentPictureSize.height);
                        FileLog.d("InstantCamera change picture size to w = " + p60Var2.o0.getWidth() + " h = " + p60Var2.o0.getHeight());
                        z10 = true;
                        if (BuildVars.LOGS_ENABLED) {
                        }
                        p60Var2.t0.setInitied();
                        if (z10) {
                        }
                    }
                    sizeArr[0] = new Size(currentPreviewSize.width, currentPreviewSize.height);
                    FileLog.d("InstantCamera change preview size to w = " + sizeArr[0].getWidth() + " h = " + sizeArr[0].getHeight());
                    currentPictureSize = p60Var2.t0.getCurrentPictureSize();
                    if (currentPictureSize.width == p60Var2.o0.getWidth()) {
                    }
                    p60Var2.o0 = new Size(currentPictureSize.width, currentPictureSize.height);
                    FileLog.d("InstantCamera change picture size to w = " + p60Var2.o0.getWidth() + " h = " + p60Var2.o0.getHeight());
                    z10 = true;
                    if (BuildVars.LOGS_ENABLED) {
                    }
                    p60Var2.t0.setInitied();
                    if (z10) {
                    }
                }
                break;
            default:
                p60 p60Var3 = this.b;
                a60 a60Var2 = p60Var3.m0;
                if (a60Var2 != null) {
                    CameraSession cameraSession = p60Var3.t0;
                    Handler handler2 = a60Var2.getHandler();
                    if (handler2 != null) {
                        a60Var2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                        break;
                    }
                }
                break;
        }
    }
}
