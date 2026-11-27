// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
