package org.telegram.ui.Components;

import android.hardware.Camera;
import android.os.Handler;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e50 b;

    public /* synthetic */ j40(e50 e50Var, int i10) {
        this.a = i10;
        this.b = e50Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:14|15|16|(10:18|(1:20)|21|22|(7:24|(1:26)|27|28|(1:30)|31|(0)(1:37))|42|28|(0)|31|(1:33))|47|21|22|(0)|42|28|(0)|31|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
    
        org.telegram.messenger.f8.g(r0, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:22:0x007d, B:24:0x008d, B:42:0x009a), top: B:21:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        r40 r40Var;
        Handler handler;
        Camera.Size currentPictureSize;
        Camera.Size currentPreviewSize;
        switch (this.a) {
            case 0:
                e50 e50Var = this.b;
                if (e50Var.t0) {
                    e50Var.u();
                    break;
                }
                break;
            case 1:
                e50 e50Var2 = this.b;
                Size[] sizeArr = e50Var2.m0;
                if (e50Var2.s0 != null) {
                    e50Var2.v();
                    boolean z10 = true;
                    try {
                        currentPreviewSize = e50Var2.s0.getCurrentPreviewSize();
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                    if (currentPreviewSize.width == sizeArr[0].getWidth()) {
                        if (currentPreviewSize.height != sizeArr[0].getHeight()) {
                        }
                        currentPictureSize = e50Var2.s0.getCurrentPictureSize();
                        if (currentPictureSize.width == e50Var2.n0.getWidth()) {
                            if (currentPictureSize.height == e50Var2.n0.getHeight()) {
                            }
                            z10 = false;
                            if (org.telegram.messenger.v2.a) {
                                org.telegram.messenger.f8.b("InstantCamera camera initied");
                            }
                            e50Var2.s0.setInitied();
                            if (z10 && (r40Var = e50Var2.l0) != null && (handler = r40Var.getHandler()) != null) {
                                r40Var.sendMessage(handler.obtainMessage(2), 0);
                                break;
                            }
                        }
                        e50Var2.n0 = new Size(currentPictureSize.width, currentPictureSize.height);
                        org.telegram.messenger.f8.b("InstantCamera change picture size to w = " + e50Var2.n0.getWidth() + " h = " + e50Var2.n0.getHeight());
                        if (org.telegram.messenger.v2.a) {
                        }
                        e50Var2.s0.setInitied();
                        if (z10) {
                        }
                    }
                    sizeArr[0] = new Size(currentPreviewSize.width, currentPreviewSize.height);
                    org.telegram.messenger.f8.b("InstantCamera change preview size to w = " + sizeArr[0].getWidth() + " h = " + sizeArr[0].getHeight());
                    currentPictureSize = e50Var2.s0.getCurrentPictureSize();
                    if (currentPictureSize.width == e50Var2.n0.getWidth()) {
                    }
                    e50Var2.n0 = new Size(currentPictureSize.width, currentPictureSize.height);
                    org.telegram.messenger.f8.b("InstantCamera change picture size to w = " + e50Var2.n0.getWidth() + " h = " + e50Var2.n0.getHeight());
                    if (org.telegram.messenger.v2.a) {
                    }
                    e50Var2.s0.setInitied();
                    if (z10) {
                    }
                }
                break;
            default:
                e50 e50Var3 = this.b;
                r40 r40Var2 = e50Var3.l0;
                if (r40Var2 != null) {
                    CameraSession cameraSession = e50Var3.s0;
                    Handler handler2 = r40Var2.getHandler();
                    if (handler2 != null) {
                        r40Var2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                        break;
                    }
                }
                break;
        }
    }
}
