package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class mp0 implements eq0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ pp0 c;

    public mp0(pp0 pp0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = pp0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.eq0
    public final void b(Editable editable) {
        pp0 pp0Var = this.c;
        org.telegram.ui.Components.du duVar = pp0Var.J;
        pp0Var.a = editable;
        duVar.setText(editable);
    }

    @Override // org.telegram.ui.eq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.eq0
    public final void f(int i10, boolean z4, boolean z10) {
        pp0 pp0Var = this.c;
        pp0Var.removeSelfFromStack();
        if (z4) {
            return;
        }
        pp0Var.V(this.a, this.b, z10, i10);
    }

    @Override // org.telegram.ui.eq0
    public final void a() {
    }

    @Override // org.telegram.ui.eq0
    public final /* synthetic */ void c() {
    }
}
