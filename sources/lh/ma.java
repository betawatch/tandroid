package lh;

import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ma implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oa b;

    public /* synthetic */ ma(oa oaVar, int i10) {
        this.a = i10;
        this.b = oaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sb sbVar = this.b.a;
                u6 u6Var = sbVar.y0;
                if (u6Var != null) {
                    u6Var.c(false);
                }
                if (sbVar.M1 && sbVar.N1 && sbVar.x0 != null) {
                    sbVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(sbVar.x0.getCameraSessionRecording(), false, false);
                    break;
                }
                break;
            case 1:
                this.b.a.K(1, true);
                break;
            case 2:
                this.b.a.K(1, true);
                break;
            default:
                this.b.a.K(1, true);
                break;
        }
    }
}
