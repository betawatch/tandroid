// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z97 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ e87(z97 z97Var, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = z97Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        z97 z97Var = this.b;
        switch (b) {
            case 0:
                z97Var.b(tL_error);
                break;
            default:
                z97Var.b(tL_error);
                break;
        }
    }
}
