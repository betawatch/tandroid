// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ob implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bc b;
    public final /* synthetic */ hd c;

    public /* synthetic */ ob(bc bcVar, hd hdVar, byte b) {
        this.a = b;
        this.b = bcVar;
        this.c = hdVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final bc bcVar = this.b;
                bcVar.getClass();
                final byte b = 1;
                final hd hdVar = this.c;
                gl.c3(new Runnable() { // from class: qb
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        hd hdVar2 = hdVar;
                        bc bcVar2 = bcVar;
                        switch (b2) {
                            case 0:
                                bcVar2.E0(hdVar2, tLObject2, tL_error2);
                                break;
                            default:
                                bcVar2.H0(hdVar2, tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b2 = 0;
                final bc bcVar2 = this.b;
                final hd hdVar2 = this.c;
                gl.c3(new Runnable() { // from class: qb
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        hd hdVar22 = hdVar2;
                        bc bcVar22 = bcVar2;
                        switch (b22) {
                            case 0:
                                bcVar22.E0(hdVar22, tLObject2, tL_error2);
                                break;
                            default:
                                bcVar22.H0(hdVar22, tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
