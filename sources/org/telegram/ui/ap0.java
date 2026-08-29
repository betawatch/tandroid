package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ap0 implements yp0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ hp0 c;

    public ap0(hp0 hp0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = hp0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.yp0
    public final void b(Editable editable) {
        hp0 hp0Var = this.c;
        org.telegram.ui.Components.au auVar = hp0Var.I;
        hp0Var.a = editable;
        auVar.setText(editable);
    }

    @Override // org.telegram.ui.yp0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.yp0
    public final void h(int i10, boolean z10, boolean z11) {
        hp0 hp0Var = this.c;
        hp0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        hp0Var.V(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.yp0
    public final void a() {
    }

    @Override // org.telegram.ui.yp0
    public final /* synthetic */ void g() {
    }
}
