// default package

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class a87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ a87(uc7 uc7Var, TLRPC.Updates updates, boolean z, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = updates;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Y3(this.c, this.d);
                break;
            default:
                Utilities.d.c(new a87(this.b, this.c, this.d, (byte) 0));
                break;
        }
    }
}
