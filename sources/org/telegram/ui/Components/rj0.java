package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rj0 {
    public final TLObject a;
    public final long b;
    public int c;

    public rj0(int i10, TLObject tLObject) {
        this.a = tLObject;
        this.c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.b = ((TLRPC.User) tLObject).id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.b = -((TLRPC.Chat) tLObject).id;
        }
    }
}
