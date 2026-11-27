// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class fea extends sv9 {
    @Override // sv9
    public final boolean d(TLObject tLObject) {
        return !(tLObject instanceof TLRPC.Chat) || xc2.B((TLRPC.Chat) tLObject);
    }
}
