// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class m3a implements RequestDelegate {
    public final /* synthetic */ TLRPC.TL_messages_initHistoryImport a;
    public final /* synthetic */ p3a b;

    public m3a(p3a p3aVar, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
        this.b = p3aVar;
        this.a = tL_messages_initHistoryImport;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new bm8((Object) this, (Object) tLObject, (Object) this.a, (Object) tL_error, (byte) 16));
    }
}
