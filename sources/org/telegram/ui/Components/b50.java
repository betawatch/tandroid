package org.telegram.ui.Components;

import android.hardware.Camera;
import android.os.Handler;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;

    public /* synthetic */ b50(s50 s50Var, int i10) {
        this.a = i10;
        this.b = s50Var;
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
        k50 k50Var;
        Handler handler;
        Camera.Size currentPictureSize;
        Camera.Size currentPreviewSize;
        switch (this.a) {
            case 0:
                s50 s50Var = this.b;
                if (s50Var.l0) {
                    s50Var.p();
                    break;
                }
                break;
            case 1:
                s50 s50Var2 = this.b;
                Size[] sizeArr = s50Var2.e0;
                if (s50Var2.k0 != null) {
                    s50Var2.r();
                    try {
                        currentPreviewSize = s50Var2.k0.getCurrentPreviewSize();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (currentPreviewSize.width == sizeArr[0].getWidth()) {
                        if (currentPreviewSize.height != sizeArr[0].getHeight()) {
                        }
                        currentPictureSize = s50Var2.k0.getCurrentPictureSize();
                        if (currentPictureSize.width == s50Var2.f0.getWidth()) {
                            if (currentPictureSize.height == s50Var2.f0.getHeight()) {
                            }
                            z10 = false;
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("InstantCamera camera initied");
                            }
                            s50Var2.k0.setInitied();
                            if (z10 && (k50Var = s50Var2.d0) != null && (handler = k50Var.getHandler()) != null) {
                                k50Var.sendMessage(handler.obtainMessage(2), 0);
                                break;
                            }
                        }
                        s50Var2.f0 = new Size(currentPictureSize.width, currentPictureSize.height);
                        FileLog.d("InstantCamera change picture size to w = " + s50Var2.f0.getWidth() + " h = " + s50Var2.f0.getHeight());
                        z10 = true;
                        if (BuildVars.LOGS_ENABLED) {
                        }
                        s50Var2.k0.setInitied();
                        if (z10) {
                        }
                    }
                    sizeArr[0] = new Size(currentPreviewSize.width, currentPreviewSize.height);
                    FileLog.d("InstantCamera change preview size to w = " + sizeArr[0].getWidth() + " h = " + sizeArr[0].getHeight());
                    currentPictureSize = s50Var2.k0.getCurrentPictureSize();
                    if (currentPictureSize.width == s50Var2.f0.getWidth()) {
                    }
                    s50Var2.f0 = new Size(currentPictureSize.width, currentPictureSize.height);
                    FileLog.d("InstantCamera change picture size to w = " + s50Var2.f0.getWidth() + " h = " + s50Var2.f0.getHeight());
                    z10 = true;
                    if (BuildVars.LOGS_ENABLED) {
                    }
                    s50Var2.k0.setInitied();
                    if (z10) {
                    }
                }
                break;
            default:
                s50 s50Var3 = this.b;
                k50 k50Var2 = s50Var3.d0;
                if (k50Var2 != null) {
                    CameraSession cameraSession = s50Var3.k0;
                    Handler handler2 = k50Var2.getHandler();
                    if (handler2 != null) {
                        k50Var2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                        break;
                    }
                }
                break;
        }
    }
}
