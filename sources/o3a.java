// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o3a implements RequestDelegate {
    public final /* synthetic */ TLRPC.TL_messages_startHistoryImport a;
    public final /* synthetic */ p3a b;

    public o3a(p3a p3aVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.b = p3aVar;
        this.a = tL_messages_startHistoryImport;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.c3(new gm8(this, tL_error, this.a, (byte) 29));
    }
}
