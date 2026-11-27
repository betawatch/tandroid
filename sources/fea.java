// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class fea extends sv9 {
    @Override // sv9
    public final boolean d(TLObject tLObject) {
        return !(tLObject instanceof TLRPC.Chat) || xc2.B((TLRPC.Chat) tLObject);
    }
}
