package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class v30 {
    public final TLObject a;
    public TLRPC.User b;
    public final int c;
    public final boolean d;
    public boolean e;

    public v30(int i7, TLObject tLObject) {
        this.a = tLObject;
        this.c = i7;
        this.d = (tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self;
    }
}
