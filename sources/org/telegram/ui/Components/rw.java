package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rw extends f2.v {
    public final /* synthetic */ kz c;

    public rw(kz kzVar) {
        this.c = kzVar;
    }

    @Override // f2.v
    public final int i(int i10) {
        kz kzVar = this.c;
        fz fzVar = kzVar.w0;
        f2.o0 adapter = kzVar.A0.getAdapter();
        bz bzVar = kzVar.v0;
        if (adapter != bzVar) {
            if (i10 == fzVar.x || !(fzVar.r.get(i10) == null || (fzVar.r.get(i10) instanceof TLRPC.Document))) {
                return bzVar.d;
            }
            return 1;
        }
        if (i10 == 0) {
            return bzVar.d;
        }
        if (i10 == bzVar.s || !(bzVar.h.get(i10) == null || (bzVar.h.get(i10) instanceof TLRPC.Document))) {
            return bzVar.d;
        }
        return 1;
    }
}
