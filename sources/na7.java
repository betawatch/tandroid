// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
