package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class lw0 extends dk0 {
    public final Context c;
    public final /* synthetic */ mw0 d;

    public lw0(mw0 mw0Var, Activity activity) {
        this.d = mw0Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.c.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) f1Var.a;
        ArrayList arrayList = this.d.c;
        vVar.b((TLRPC.StickerSetCovered) arrayList.get(i7), i7 != arrayList.size() - 1);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(this.c, false);
        vVar.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(82.0f)));
        return new mj0(vVar);
    }
}
