package org.telegram.ui.Components;

import android.hardware.Camera;
import android.os.Handler;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k50 b;

    public /* synthetic */ s40(k50 k50Var, int i10) {
        this.a = i10;
        this.b = k50Var;
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
        b50 b50Var;
        Handler handler;
        Camera.Size currentPictureSize;
        Camera.Size currentPreviewSize;
        switch (this.a) {
            case 0:
                k50 k50Var = this.b;
                if (k50Var.l0) {
                    k50Var.p();
                    break;
                }
                break;
            case 1:
                k50 k50Var2 = this.b;
                Size[] sizeArr = k50Var2.e0;
                if (k50Var2.k0 != null) {
                    k50Var2.r();
                    try {
                        currentPreviewSize = k50Var2.k0.getCurrentPreviewSize();
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    if (currentPreviewSize.width == sizeArr[0].getWidth()) {
                        if (currentPreviewSize.height != sizeArr[0].getHeight()) {
                        }
                        currentPictureSize = k50Var2.k0.getCurrentPictureSize();
                        if (currentPictureSize.width == k50Var2.f0.getWidth()) {
                            if (currentPictureSize.height == k50Var2.f0.getHeight()) {
                            }
                            z10 = false;
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("InstantCamera camera initied");
                            }
                            k50Var2.k0.setInitied();
                            if (z10 && (b50Var = k50Var2.d0) != null && (handler = b50Var.getHandler()) != null) {
                                b50Var.sendMessage(handler.obtainMessage(2), 0);
                                break;
                            }
                        }
                        k50Var2.f0 = new Size(currentPictureSize.width, currentPictureSize.height);
                        FileLog.d("InstantCamera change picture size to w = " + k50Var2.f0.getWidth() + " h = " + k50Var2.f0.getHeight());
                        z10 = true;
                        if (BuildVars.LOGS_ENABLED) {
                        }
                        k50Var2.k0.setInitied();
                        if (z10) {
                        }
                    }
                    sizeArr[0] = new Size(currentPreviewSize.width, currentPreviewSize.height);
                    FileLog.d("InstantCamera change preview size to w = " + sizeArr[0].getWidth() + " h = " + sizeArr[0].getHeight());
                    currentPictureSize = k50Var2.k0.getCurrentPictureSize();
                    if (currentPictureSize.width == k50Var2.f0.getWidth()) {
                    }
                    k50Var2.f0 = new Size(currentPictureSize.width, currentPictureSize.height);
                    FileLog.d("InstantCamera change picture size to w = " + k50Var2.f0.getWidth() + " h = " + k50Var2.f0.getHeight());
                    z10 = true;
                    if (BuildVars.LOGS_ENABLED) {
                    }
                    k50Var2.k0.setInitied();
                    if (z10) {
                    }
                }
                break;
            default:
                k50 k50Var3 = this.b;
                b50 b50Var2 = k50Var3.d0;
                if (b50Var2 != null) {
                    CameraSession cameraSession = k50Var3.k0;
                    Handler handler2 = b50Var2.getHandler();
                    if (handler2 != null) {
                        b50Var2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                        break;
                    }
                }
                break;
        }
    }
}
