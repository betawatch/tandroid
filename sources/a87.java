// default package

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
