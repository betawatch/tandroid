// default package

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class f20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i30 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ f20(i30 i30Var, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = i30Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        ylb ylbVar;
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        i30 i30Var = this.b;
        switch (b) {
            case 0:
                frameLayout = (FrameLayout) i30Var.b;
                ylbVar = i30Var.J0;
                break;
            case 1:
                frameLayout = (FrameLayout) i30Var.b;
                ylbVar = i30Var.J0;
                break;
            case 2:
                frameLayout = (FrameLayout) i30Var.b;
                ylbVar = i30Var.J0;
                break;
            default:
                frameLayout = (FrameLayout) i30Var.b;
                ylbVar = i30Var.J0;
                break;
        }
        wi8.u(frameLayout, ylbVar, tL_error, false);
    }
}
