// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class h7c implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o7c b;

    public /* synthetic */ h7c(o7c o7cVar, byte b) {
        this.a = b;
        this.b = o7cVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 0;
        final byte b3 = 1;
        final o7c o7cVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() { // from class: j7c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        o7c o7cVar2 = o7cVar;
                        switch (b4) {
                            case 0:
                                o7cVar2.o0(tLObject2, tL_error2);
                                break;
                            default:
                                o7cVar2.p0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            case 1:
                hl.c3(new k7c(o7cVar, tL_error, b2));
                break;
            case 2:
                hl.c3(new k7c(o7cVar, tL_error, b3));
                break;
            case 3:
                hl.c3(new k7c(o7cVar, tL_error, (byte) 2));
                break;
            default:
                o7cVar.getClass();
                hl.c3(new Runnable() { // from class: j7c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        o7c o7cVar2 = o7cVar;
                        switch (b4) {
                            case 0:
                                o7cVar2.o0(tLObject2, tL_error2);
                                break;
                            default:
                                o7cVar2.p0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
