package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ho0 extends jg.z1 {
    @Override // jg.z1
    public final boolean d(TLObject tLObject) {
        return !(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.t3.B((TLRPC.Chat) tLObject);
    }
}
