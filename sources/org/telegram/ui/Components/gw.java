package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gw extends f2.w {
    public final /* synthetic */ yy c;

    public gw(yy yyVar) {
        this.c = yyVar;
    }

    @Override // f2.w
    public final int i(int i10) {
        yy yyVar = this.c;
        ty tyVar = yyVar.v0;
        f2.q0 adapter = yyVar.z0.getAdapter();
        py pyVar = yyVar.u0;
        if (adapter != pyVar) {
            if (i10 == tyVar.x || !(tyVar.r.get(i10) == null || (tyVar.r.get(i10) instanceof TLRPC.Document))) {
                return pyVar.d;
            }
            return 1;
        }
        if (i10 == 0) {
            return pyVar.d;
        }
        if (i10 == pyVar.s || !(pyVar.h.get(i10) == null || (pyVar.h.get(i10) instanceof TLRPC.Document))) {
            return pyVar.d;
        }
        return 1;
    }
}
