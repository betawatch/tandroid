package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h30 {
    public final TLObject a;
    public TLRPC.User b;
    public final int c;
    public final boolean d;
    public boolean e;

    public h30(int i7, TLObject tLObject) {
        this.a = tLObject;
        this.c = i7;
        this.d = (tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self;
    }
}
