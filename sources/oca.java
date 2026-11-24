// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oca extends bu9 {
    @Override // bu9
    public final boolean d(TLObject tLObject) {
        return !(tLObject instanceof TLRPC.Chat) || sd2.B((TLRPC.Chat) tLObject);
    }
}
