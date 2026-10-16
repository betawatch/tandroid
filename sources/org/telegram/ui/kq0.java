package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class kq0 implements er0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ oq0 c;

    public kq0(oq0 oq0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = oq0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.er0
    public final void b(Editable editable) {
        oq0 oq0Var = this.c;
        org.telegram.ui.Components.vu vuVar = oq0Var.M;
        oq0Var.a = editable;
        vuVar.setText(editable);
    }

    @Override // org.telegram.ui.er0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.er0
    public final void h(int i10, boolean z10, boolean z11) {
        oq0 oq0Var = this.c;
        oq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        oq0Var.V(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.er0
    public final void a() {
    }

    @Override // org.telegram.ui.er0
    public final /* synthetic */ void g() {
    }
}
