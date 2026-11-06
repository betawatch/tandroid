package org.telegram.ui.Components;

import android.hardware.Camera;
import android.os.Handler;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o40 b;

    public /* synthetic */ r30(o40 o40Var, int i7) {
        this.a = i7;
        this.b = o40Var;
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
        a40 a40Var;
        Handler handler;
        Camera.Size currentPictureSize;
        Camera.Size currentPreviewSize;
        switch (this.a) {
            case 0:
                o40 o40Var = this.b;
                if (o40Var.t0) {
                    o40Var.u();
                    break;
                }
                break;
            case 1:
                o40 o40Var2 = this.b;
                Size[] sizeArr = o40Var2.m0;
                if (o40Var2.s0 != null) {
                    o40Var2.v();
                    boolean z9 = true;
                    try {
                        currentPreviewSize = o40Var2.s0.getCurrentPreviewSize();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (currentPreviewSize.width == sizeArr[0].getWidth()) {
                        if (currentPreviewSize.height != sizeArr[0].getHeight()) {
                        }
                        currentPictureSize = o40Var2.s0.getCurrentPictureSize();
                        if (currentPictureSize.width == o40Var2.n0.getWidth()) {
                            if (currentPictureSize.height == o40Var2.n0.getHeight()) {
                            }
                            z9 = false;
                            if (org.telegram.messenger.r2.a) {
                                org.telegram.messenger.a8.b("InstantCamera camera initied");
                            }
                            o40Var2.s0.setInitied();
                            if (z9 && (a40Var = o40Var2.l0) != null && (handler = a40Var.getHandler()) != null) {
                                a40Var.sendMessage(handler.obtainMessage(2), 0);
                                break;
                            }
                        }
                        o40Var2.n0 = new Size(currentPictureSize.width, currentPictureSize.height);
                        org.telegram.messenger.a8.b("InstantCamera change picture size to w = " + o40Var2.n0.getWidth() + " h = " + o40Var2.n0.getHeight());
                        if (org.telegram.messenger.r2.a) {
                        }
                        o40Var2.s0.setInitied();
                        if (z9) {
                        }
                    }
                    sizeArr[0] = new Size(currentPreviewSize.width, currentPreviewSize.height);
                    org.telegram.messenger.a8.b("InstantCamera change preview size to w = " + sizeArr[0].getWidth() + " h = " + sizeArr[0].getHeight());
                    currentPictureSize = o40Var2.s0.getCurrentPictureSize();
                    if (currentPictureSize.width == o40Var2.n0.getWidth()) {
                    }
                    o40Var2.n0 = new Size(currentPictureSize.width, currentPictureSize.height);
                    org.telegram.messenger.a8.b("InstantCamera change picture size to w = " + o40Var2.n0.getWidth() + " h = " + o40Var2.n0.getHeight());
                    if (org.telegram.messenger.r2.a) {
                    }
                    o40Var2.s0.setInitied();
                    if (z9) {
                    }
                }
                break;
            default:
                o40 o40Var3 = this.b;
                a40 a40Var2 = o40Var3.l0;
                if (a40Var2 != null) {
                    CameraSession cameraSession = o40Var3.s0;
                    Handler handler2 = a40Var2.getHandler();
                    if (handler2 != null) {
                        a40Var2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                        break;
                    }
                }
                break;
        }
    }
}
