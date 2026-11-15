package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ko0 extends jg.z1 {
    @Override // jg.z1
    public final boolean d(TLObject tLObject) {
        return !(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.t3.B((TLRPC.Chat) tLObject);
    }
}
