package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class fk0 {
    public final TLObject a;
    public final long b;
    public int c;

    public fk0(int i10, TLObject tLObject) {
        this.a = tLObject;
        this.c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.b = ((TLRPC.User) tLObject).id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.b = -((TLRPC.Chat) tLObject).id;
        }
    }
}
