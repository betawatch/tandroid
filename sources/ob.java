// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class ob implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bc b;
    public final /* synthetic */ he c;

    public /* synthetic */ ob(bc bcVar, he heVar, byte b) {
        this.a = b;
        this.b = bcVar;
        this.c = heVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final bc bcVar = this.b;
                bcVar.getClass();
                final byte b = 1;
                final he heVar = this.c;
                gm.c3(new Runnable() { // from class: qb
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        he heVar2 = heVar;
                        bc bcVar2 = bcVar;
                        switch (b2) {
                            case 0:
                                bcVar2.F0(heVar2, tLObject2, tL_error2);
                                break;
                            default:
                                bcVar2.I0(heVar2, tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b2 = 0;
                final bc bcVar2 = this.b;
                final he heVar2 = this.c;
                gm.c3(new Runnable() { // from class: qb
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        he heVar22 = heVar2;
                        bc bcVar22 = bcVar2;
                        switch (b22) {
                            case 0:
                                bcVar22.F0(heVar22, tLObject2, tL_error2);
                                break;
                            default:
                                bcVar22.I0(heVar22, tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
