package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
