// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class oaa extends zr9 {
    @Override // zr9
    public final boolean d(TLObject tLObject) {
        return !(tLObject instanceof TLRPC.Chat) || hc2.B((TLRPC.Chat) tLObject);
    }
}
