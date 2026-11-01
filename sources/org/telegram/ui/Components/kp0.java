package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class kp0 extends zf.m1 {
    @Override // zf.m1
    public final boolean d(TLObject tLObject) {
        return !(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.w3.B((TLRPC.Chat) tLObject);
    }
}
