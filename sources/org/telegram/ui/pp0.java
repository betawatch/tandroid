package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pp0 implements lq0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ wp0 c;

    public pp0(wp0 wp0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = wp0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.lq0
    public final void c(Editable editable) {
        wp0 wp0Var = this.c;
        org.telegram.ui.Components.cu cuVar = wp0Var.J;
        wp0Var.a = editable;
        cuVar.setText(editable);
    }

    @Override // org.telegram.ui.lq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.lq0
    public final void f(int i10, boolean z4, boolean z10) {
        wp0 wp0Var = this.c;
        wp0Var.removeSelfFromStack();
        if (z4) {
            return;
        }
        wp0Var.V(this.a, this.b, z10, i10);
    }

    @Override // org.telegram.ui.lq0
    public final void a() {
    }

    @Override // org.telegram.ui.lq0
    public final /* synthetic */ void d() {
    }
}
