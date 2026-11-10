package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rv extends g.p {
    public final /* synthetic */ gy c;

    public rv(gy gyVar) {
        this.c = gyVar;
    }

    @Override // g.p
    public final int i(int i7) {
        gy gyVar = this.c;
        ay ayVar = gyVar.z0;
        v4.g0 adapter = gyVar.D0.getAdapter();
        xx xxVar = gyVar.y0;
        if (adapter != xxVar) {
            if (i7 == ayVar.y || !(ayVar.r.get(i7) == null || (ayVar.r.get(i7) instanceof TLRPC.Document))) {
                return xxVar.d;
            }
            return 1;
        }
        if (i7 == 0) {
            return xxVar.d;
        }
        if (i7 == xxVar.s || !(xxVar.h.get(i7) == null || (xxVar.h.get(i7) instanceof TLRPC.Document))) {
            return xxVar.d;
        }
        return 1;
    }
}
