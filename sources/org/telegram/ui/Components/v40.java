package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class v40 {
    public final TLObject a;
    public TLRPC.User b;
    public final int c;
    public final boolean d;
    public boolean e;

    public v40(int i10, TLObject tLObject) {
        this.a = tLObject;
        this.c = i10;
        this.d = (tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self;
    }
}
