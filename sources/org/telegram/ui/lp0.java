package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class lp0 implements jq0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ tp0 c;

    public lp0(tp0 tp0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = tp0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.jq0
    public final void b(Editable editable) {
        tp0 tp0Var = this.c;
        org.telegram.ui.Components.qu quVar = tp0Var.M;
        tp0Var.a = editable;
        quVar.setText(editable);
    }

    @Override // org.telegram.ui.jq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.jq0
    public final void h(int i10, boolean z10, boolean z11) {
        tp0 tp0Var = this.c;
        tp0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        tp0Var.V(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.jq0
    public final void a() {
    }

    @Override // org.telegram.ui.jq0
    public final /* synthetic */ void g() {
    }
}
