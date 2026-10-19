package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class kp0 implements iq0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ sp0 c;

    public kp0(sp0 sp0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = sp0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.iq0
    public final void b(Editable editable) {
        sp0 sp0Var = this.c;
        org.telegram.ui.Components.qu quVar = sp0Var.M;
        sp0Var.a = editable;
        quVar.setText(editable);
    }

    @Override // org.telegram.ui.iq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.iq0
    public final void h(int i10, boolean z10, boolean z11) {
        sp0 sp0Var = this.c;
        sp0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        sp0Var.V(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.iq0
    public final void a() {
    }

    @Override // org.telegram.ui.iq0
    public final /* synthetic */ void g() {
    }
}
