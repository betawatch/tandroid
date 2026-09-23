package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class aq0 implements tq0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ dq0 c;

    public aq0(dq0 dq0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = dq0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.tq0
    public final void b(Editable editable) {
        dq0 dq0Var = this.c;
        org.telegram.ui.Components.ku kuVar = dq0Var.M;
        dq0Var.a = editable;
        kuVar.setText(editable);
    }

    @Override // org.telegram.ui.tq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.tq0
    public final void i(int i10, boolean z10, boolean z11) {
        dq0 dq0Var = this.c;
        dq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        dq0Var.V(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.tq0
    public final void a() {
    }

    @Override // org.telegram.ui.tq0
    public final /* synthetic */ void g() {
    }
}
