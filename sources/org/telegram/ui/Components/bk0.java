package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class bk0 {
    public final TLObject a;
    public final long b;
    public int c;

    public bk0(int i10, TLObject tLObject) {
        this.a = tLObject;
        this.c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.b = ((TLRPC.User) tLObject).id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.b = -((TLRPC.Chat) tLObject).id;
        }
    }
}
