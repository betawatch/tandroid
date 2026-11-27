// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kpb implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pqb b;

    public /* synthetic */ kpb(pqb pqbVar, byte b) {
        this.a = b;
        this.b = pqbVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final pqb pqbVar = this.b;
        switch (b) {
            case 0:
                pqbVar.getClass();
                final byte b2 = 1;
                hl.c3(new Runnable() { // from class: jpb
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        pqb pqbVar2 = pqbVar;
                        switch (b3) {
                            case 0:
                                pqbVar2.a1(tLObject2);
                                break;
                            default:
                                pqbVar2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        pqbVar2.Y0 = tL_wallPaper;
                                        pqbVar2.g1(false);
                                        pqbVar2.o1();
                                        pqbVar2.W0.add(0, pqbVar2.Y0);
                                        nqb nqbVar = pqbVar2.S0;
                                        if (nqbVar != null) {
                                            nqbVar.f();
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
                hl.c3(new Runnable() { // from class: jpb
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        pqb pqbVar2 = pqbVar;
                        switch (b32) {
                            case 0:
                                pqbVar2.a1(tLObject2);
                                break;
                            default:
                                pqbVar2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        pqbVar2.Y0 = tL_wallPaper;
                                        pqbVar2.g1(false);
                                        pqbVar2.o1();
                                        pqbVar2.W0.add(0, pqbVar2.Y0);
                                        nqb nqbVar = pqbVar2.S0;
                                        if (nqbVar != null) {
                                            nqbVar.f();
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
