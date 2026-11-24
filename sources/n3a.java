// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
        gl.c3(new tj9(this, this.a, (byte) 25));
    }
}
