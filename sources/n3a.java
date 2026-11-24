// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class n3a implements RequestDelegate {
    public final /* synthetic */ String a;
    public final /* synthetic */ p3a b;

    public n3a(p3a p3aVar, String str) {
        this.b = p3aVar;
        this.a = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new tj9(this, this.a, (byte) 25));
    }
}
