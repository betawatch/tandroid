// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ki1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.TL_error b;

    public /* synthetic */ ki1(TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.b;
        switch (b) {
            case 0:
                u21.e0(tL_error);
                break;
            default:
                if (tL_error != null) {
                    u21.e0(tL_error);
                    break;
                }
                break;
        }
    }
}
