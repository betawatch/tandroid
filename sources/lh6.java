// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class lh6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yh6 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ lh6(yh6 yh6Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z, byte b) {
        this.a = b;
        this.b = yh6Var;
        this.c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yh6 yh6Var = this.b;
                yh6Var.getNotificationCenter().d(new lh6(yh6Var, this.c, this.d, this.e, this.f, (byte) 1));
                break;
            default:
                this.b.g0(this.c, this.d, this.e, this.f);
                break;
        }
    }
}
