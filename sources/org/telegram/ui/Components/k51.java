package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class k51 extends g.p {
    public final /* synthetic */ s51 c;

    public k51(s51 s51Var) {
        this.c = s51Var;
    }

    @Override // g.p
    public final int i(int i10) {
        s51 s51Var = this.c;
        s4.h0 adapter = s51Var.n.getAdapter();
        r51 r51Var = s51Var.s;
        if (adapter == r51Var) {
            if ((r51Var.d.get(i10) instanceof Integer) || i10 >= r51Var.w) {
                return r51Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = s51Var.v;
        SparseArray sparseArray = g2Var.s;
        if (i10 == g2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return g2Var.e.a();
        }
        return 1;
    }
}
