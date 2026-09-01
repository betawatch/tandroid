package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class kp0 implements gq0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ rp0 c;

    public kp0(rp0 rp0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = rp0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.gq0
    public final void c(Editable editable) {
        rp0 rp0Var = this.c;
        org.telegram.ui.Components.fu fuVar = rp0Var.J;
        rp0Var.a = editable;
        fuVar.setText(editable);
    }

    @Override // org.telegram.ui.gq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.gq0
    public final void f(int i10, boolean z4, boolean z10) {
        rp0 rp0Var = this.c;
        rp0Var.removeSelfFromStack();
        if (z4) {
            return;
        }
        rp0Var.V(this.a, this.b, z10, i10);
    }

    @Override // org.telegram.ui.gq0
    public final void a() {
    }

    @Override // org.telegram.ui.gq0
    public final /* synthetic */ void d() {
    }
}
