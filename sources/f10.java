// default package

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class f10 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i20 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ f10(i20 i20Var, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = i20Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        wjb wjbVar;
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                frameLayout = (FrameLayout) i20Var.b;
                wjbVar = i20Var.J0;
                break;
            case 1:
                frameLayout = (FrameLayout) i20Var.b;
                wjbVar = i20Var.J0;
                break;
            case 2:
                frameLayout = (FrameLayout) i20Var.b;
                wjbVar = i20Var.J0;
                break;
            default:
                frameLayout = (FrameLayout) i20Var.b;
                wjbVar = i20Var.J0;
                break;
        }
        ug8.u(frameLayout, wjbVar, tL_error, false);
    }
}
