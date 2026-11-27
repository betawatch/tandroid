// default package

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class g10 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j20 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ g10(j20 j20Var, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = j20Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        vnb vnbVar;
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        j20 j20Var = this.b;
        switch (b) {
            case 0:
                frameLayout = (FrameLayout) j20Var.b;
                vnbVar = j20Var.J0;
                break;
            case 1:
                frameLayout = (FrameLayout) j20Var.b;
                vnbVar = j20Var.J0;
                break;
            case 2:
                frameLayout = (FrameLayout) j20Var.b;
                vnbVar = j20Var.J0;
                break;
            default:
                frameLayout = (FrameLayout) j20Var.b;
                vnbVar = j20Var.J0;
                break;
        }
        ik8.u(frameLayout, vnbVar, tL_error, false);
    }
}
