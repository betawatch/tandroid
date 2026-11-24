// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h3c implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p3c b;

    public /* synthetic */ h3c(p3c p3cVar, byte b) {
        this.a = b;
        this.b = p3cVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 0;
        final byte b3 = 1;
        final p3c p3cVar = this.b;
        switch (b) {
            case 0:
                gl.d3(new Runnable() { // from class: j3c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        p3c p3cVar2 = p3cVar;
                        switch (b4) {
                            case 0:
                                p3cVar2.o0(tLObject2, tL_error2);
                                break;
                            default:
                                p3cVar2.p0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            case 1:
                gl.d3(new k3c(p3cVar, tL_error, b2));
                break;
            case 2:
                gl.d3(new k3c(p3cVar, tL_error, b3));
                break;
            case 3:
                gl.d3(new k3c(p3cVar, tL_error, (byte) 2));
                break;
            default:
                p3cVar.getClass();
                gl.d3(new Runnable() { // from class: j3c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        p3c p3cVar2 = p3cVar;
                        switch (b4) {
                            case 0:
                                p3cVar2.o0(tLObject2, tL_error2);
                                break;
                            default:
                                p3cVar2.p0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
