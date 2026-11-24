// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oj6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ak6 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ oj6(ak6 ak6Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z, byte b) {
        this.a = b;
        this.b = ak6Var;
        this.c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ak6 ak6Var = this.b;
                ak6Var.getNotificationCenter().d(new oj6(ak6Var, this.c, this.d, this.e, this.f, (byte) 1));
                break;
            default:
                this.b.h0(this.c, this.d, this.e, this.f);
                break;
        }
    }
}
