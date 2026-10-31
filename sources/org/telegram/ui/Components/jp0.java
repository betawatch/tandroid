package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jp0 extends zf.m1 {
    @Override // zf.m1
    public final boolean d(TLObject tLObject) {
        return !(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.w3.B((TLRPC.Chat) tLObject);
    }
}
