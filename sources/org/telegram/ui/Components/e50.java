package org.telegram.ui.Components;

import android.hardware.Camera;
import android.os.Handler;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class e50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x50 b;

    public /* synthetic */ e50(x50 x50Var, int i10) {
        this.a = i10;
        this.b = x50Var;
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
        o50 o50Var;
        Handler handler;
        Camera.Size currentPictureSize;
        Camera.Size currentPreviewSize;
        switch (this.a) {
            case 0:
                x50 x50Var = this.b;
                if (x50Var.p0) {
                    x50Var.p();
                    break;
                }
                break;
            case 1:
                x50 x50Var2 = this.b;
                Size[] sizeArr = x50Var2.i0;
                if (x50Var2.o0 != null) {
                    x50Var2.r();
                    try {
                        currentPreviewSize = x50Var2.o0.getCurrentPreviewSize();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (currentPreviewSize.width == sizeArr[0].getWidth()) {
                        if (currentPreviewSize.height != sizeArr[0].getHeight()) {
                        }
                        currentPictureSize = x50Var2.o0.getCurrentPictureSize();
                        if (currentPictureSize.width == x50Var2.j0.getWidth()) {
                            if (currentPictureSize.height == x50Var2.j0.getHeight()) {
                            }
                            z10 = false;
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("InstantCamera camera initied");
                            }
                            x50Var2.o0.setInitied();
                            if (z10 && (o50Var = x50Var2.h0) != null && (handler = o50Var.getHandler()) != null) {
                                o50Var.sendMessage(handler.obtainMessage(2), 0);
                                break;
                            }
                        }
                        x50Var2.j0 = new Size(currentPictureSize.width, currentPictureSize.height);
                        FileLog.d("InstantCamera change picture size to w = " + x50Var2.j0.getWidth() + " h = " + x50Var2.j0.getHeight());
                        z10 = true;
                        if (BuildVars.LOGS_ENABLED) {
                        }
                        x50Var2.o0.setInitied();
                        if (z10) {
                        }
                    }
                    sizeArr[0] = new Size(currentPreviewSize.width, currentPreviewSize.height);
                    FileLog.d("InstantCamera change preview size to w = " + sizeArr[0].getWidth() + " h = " + sizeArr[0].getHeight());
                    currentPictureSize = x50Var2.o0.getCurrentPictureSize();
                    if (currentPictureSize.width == x50Var2.j0.getWidth()) {
                    }
                    x50Var2.j0 = new Size(currentPictureSize.width, currentPictureSize.height);
                    FileLog.d("InstantCamera change picture size to w = " + x50Var2.j0.getWidth() + " h = " + x50Var2.j0.getHeight());
                    z10 = true;
                    if (BuildVars.LOGS_ENABLED) {
                    }
                    x50Var2.o0.setInitied();
                    if (z10) {
                    }
                }
                break;
            default:
                x50 x50Var3 = this.b;
                o50 o50Var2 = x50Var3.h0;
                if (o50Var2 != null) {
                    CameraSession cameraSession = x50Var3.o0;
                    Handler handler2 = o50Var2.getHandler();
                    if (handler2 != null) {
                        o50Var2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                        break;
                    }
                }
                break;
        }
    }
}
