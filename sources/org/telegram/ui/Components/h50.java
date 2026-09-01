package org.telegram.ui.Components;

import android.hardware.Camera;
import android.os.Handler;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z50 b;

    public /* synthetic */ h50(z50 z50Var, int i10) {
        this.a = i10;
        this.b = z50Var;
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
        boolean z4;
        r50 r50Var;
        Handler handler;
        Camera.Size currentPictureSize;
        Camera.Size currentPreviewSize;
        switch (this.a) {
            case 0:
                z50 z50Var = this.b;
                if (z50Var.m0) {
                    z50Var.p();
                    break;
                }
                break;
            case 1:
                z50 z50Var2 = this.b;
                Size[] sizeArr = z50Var2.f0;
                if (z50Var2.l0 != null) {
                    z50Var2.r();
                    try {
                        currentPreviewSize = z50Var2.l0.getCurrentPreviewSize();
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    if (currentPreviewSize.width == sizeArr[0].getWidth()) {
                        if (currentPreviewSize.height != sizeArr[0].getHeight()) {
                        }
                        currentPictureSize = z50Var2.l0.getCurrentPictureSize();
                        if (currentPictureSize.width == z50Var2.g0.getWidth()) {
                            if (currentPictureSize.height == z50Var2.g0.getHeight()) {
                            }
                            z4 = false;
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("InstantCamera camera initied");
                            }
                            z50Var2.l0.setInitied();
                            if (z4 && (r50Var = z50Var2.e0) != null && (handler = r50Var.getHandler()) != null) {
                                r50Var.sendMessage(handler.obtainMessage(2), 0);
                                break;
                            }
                        }
                        z50Var2.g0 = new Size(currentPictureSize.width, currentPictureSize.height);
                        FileLog.d("InstantCamera change picture size to w = " + z50Var2.g0.getWidth() + " h = " + z50Var2.g0.getHeight());
                        z4 = true;
                        if (BuildVars.LOGS_ENABLED) {
                        }
                        z50Var2.l0.setInitied();
                        if (z4) {
                        }
                    }
                    sizeArr[0] = new Size(currentPreviewSize.width, currentPreviewSize.height);
                    FileLog.d("InstantCamera change preview size to w = " + sizeArr[0].getWidth() + " h = " + sizeArr[0].getHeight());
                    currentPictureSize = z50Var2.l0.getCurrentPictureSize();
                    if (currentPictureSize.width == z50Var2.g0.getWidth()) {
                    }
                    z50Var2.g0 = new Size(currentPictureSize.width, currentPictureSize.height);
                    FileLog.d("InstantCamera change picture size to w = " + z50Var2.g0.getWidth() + " h = " + z50Var2.g0.getHeight());
                    z4 = true;
                    if (BuildVars.LOGS_ENABLED) {
                    }
                    z50Var2.l0.setInitied();
                    if (z4) {
                    }
                }
                break;
            default:
                z50 z50Var3 = this.b;
                r50 r50Var2 = z50Var3.e0;
                if (r50Var2 != null) {
                    CameraSession cameraSession = z50Var3.l0;
                    Handler handler2 = r50Var2.getHandler();
                    if (handler2 != null) {
                        r50Var2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                        break;
                    }
                }
                break;
        }
    }
}
