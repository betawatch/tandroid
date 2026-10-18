package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class c50 {
    public final TLObject a;
    public TLRPC.User b;
    public final int c;
    public final boolean d;
    public boolean e;

    public c50(int i10, TLObject tLObject) {
        this.a = tLObject;
        this.c = i10;
        this.d = (tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self;
    }
}
