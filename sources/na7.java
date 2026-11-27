// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class na7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gc7 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ na7(gc7 gc7Var, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = gc7Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        gc7 gc7Var = this.b;
        switch (b) {
            case 0:
                gc7Var.b(tL_error);
                break;
            default:
                gc7Var.b(tL_error);
                break;
        }
    }
}
