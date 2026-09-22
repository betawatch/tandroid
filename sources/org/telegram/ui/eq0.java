package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class eq0 implements br0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ lq0 c;

    public eq0(lq0 lq0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = lq0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.br0
    public final void b(Editable editable) {
        lq0 lq0Var = this.c;
        org.telegram.ui.Components.ju juVar = lq0Var.M;
        lq0Var.a = editable;
        juVar.setText(editable);
    }

    @Override // org.telegram.ui.br0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.br0
    public final void i(int i10, boolean z10, boolean z11) {
        lq0 lq0Var = this.c;
        lq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        lq0Var.V(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.br0
    public final void a() {
    }

    @Override // org.telegram.ui.br0
    public final /* synthetic */ void g() {
    }
}
