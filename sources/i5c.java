// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class i5c implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p5c b;

    public /* synthetic */ i5c(p5c p5cVar, byte b) {
        this.a = b;
        this.b = p5cVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 0;
        final byte b3 = 1;
        final p5c p5cVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new Runnable() { // from class: k5c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        p5c p5cVar2 = p5cVar;
                        switch (b4) {
                            case 0:
                                p5cVar2.p0(tLObject2, tL_error2);
                                break;
                            default:
                                p5cVar2.q0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            case 1:
                gm.c3(new l5c(p5cVar, tL_error, b2));
                break;
            case 2:
                gm.c3(new l5c(p5cVar, tL_error, b3));
                break;
            case 3:
                gm.c3(new l5c(p5cVar, tL_error, (byte) 2));
                break;
            default:
                p5cVar.getClass();
                gm.c3(new Runnable() { // from class: k5c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        p5c p5cVar2 = p5cVar;
                        switch (b4) {
                            case 0:
                                p5cVar2.p0(tLObject2, tL_error2);
                                break;
                            default:
                                p5cVar2.q0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
