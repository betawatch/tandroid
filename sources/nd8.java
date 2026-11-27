// default package

import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class nd8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pd8 b;

    public /* synthetic */ nd8(pd8 pd8Var, byte b) {
        this.a = b;
        this.b = pd8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pd8 pd8Var = this.b;
        switch (b) {
            case 0:
                nc8 nc8Var = pd8Var.a;
                RadialProgressView radialProgressView = nc8Var.n;
                b8 b8Var = nc8Var.r;
                radialProgressView.setVisibility(4);
                if (nc8Var.G) {
                    nc8Var.G = false;
                    nc8Var.setPlaybackSpeed(nc8Var.F);
                }
                b8Var.setEnabled(true);
                b8Var.setAlpha(1.0f);
                PhotoViewer photoViewer = nc8Var.b;
                if (photoViewer != null) {
                    photoViewer.s();
                    break;
                }
                break;
            default:
                pd8Var.a.h.setVisibility(4);
                break;
        }
    }
}
