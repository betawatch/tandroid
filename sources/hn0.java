// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hn0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p8c b;
    public final /* synthetic */ p8c c;

    public /* synthetic */ hn0(p8c p8cVar, p8c p8cVar2, byte b) {
        this.a = b;
        this.b = p8cVar;
        this.c = p8cVar2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                gl.d3(new nn6(tL_error, this.b, this.c));
                break;
            default:
                gl.d3(new s67(tL_error, this.b, tLObject, this.c, (byte) 9));
                break;
        }
    }
}
