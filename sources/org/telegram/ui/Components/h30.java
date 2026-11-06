package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
