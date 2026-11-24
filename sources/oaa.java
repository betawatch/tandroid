// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oaa extends zr9 {
    @Override // zr9
    public final boolean d(TLObject tLObject) {
        return !(tLObject instanceof TLRPC.Chat) || hc2.B((TLRPC.Chat) tLObject);
    }
}
