package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dx0 extends sk0 {
    public final Context c;
    public final /* synthetic */ ex0 d;

    public dx0(ex0 ex0Var, Activity activity) {
        this.d = ex0Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.c.size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) c1Var.a;
        ArrayList arrayList = this.d.c;
        vVar.b((TLRPC.StickerSetCovered) arrayList.get(i10), i10 != arrayList.size() - 1);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(this.c, false);
        vVar.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(82.0f)));
        return new ck0(vVar);
    }
}
