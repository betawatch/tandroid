package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ho0 extends jg.z1 {
    @Override // jg.z1
    public final boolean d(TLObject tLObject) {
        return !(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.t3.B((TLRPC.Chat) tLObject);
    }
}
