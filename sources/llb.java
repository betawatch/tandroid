// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class llb implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qmb b;

    public /* synthetic */ llb(qmb qmbVar, byte b) {
        this.a = b;
        this.b = qmbVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final qmb qmbVar = this.b;
        switch (b) {
            case 0:
                qmbVar.getClass();
                final byte b2 = 1;
                gl.c3(new Runnable() { // from class: klb
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        qmb qmbVar2 = qmbVar;
                        switch (b3) {
                            case 0:
                                qmbVar2.Z0(tLObject2);
                                break;
                            default:
                                qmbVar2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        qmbVar2.Y0 = tL_wallPaper;
                                        qmbVar2.f1(false);
                                        qmbVar2.n1();
                                        qmbVar2.W0.add(0, qmbVar2.Y0);
                                        omb ombVar = qmbVar2.S0;
                                        if (ombVar != null) {
                                            ombVar.f();
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                gl.c3(new Runnable() { // from class: klb
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        qmb qmbVar2 = qmbVar;
                        switch (b32) {
                            case 0:
                                qmbVar2.Z0(tLObject2);
                                break;
                            default:
                                qmbVar2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        qmbVar2.Y0 = tL_wallPaper;
                                        qmbVar2.f1(false);
                                        qmbVar2.n1();
                                        qmbVar2.W0.add(0, qmbVar2.Y0);
                                        omb ombVar = qmbVar2.S0;
                                        if (ombVar != null) {
                                            ombVar.f();
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
