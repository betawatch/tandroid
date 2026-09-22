package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class cq0 implements zq0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ jq0 c;

    public cq0(jq0 jq0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = jq0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.zq0
    public final void b(Editable editable) {
        jq0 jq0Var = this.c;
        org.telegram.ui.Components.ju juVar = jq0Var.M;
        jq0Var.a = editable;
        juVar.setText(editable);
    }

    @Override // org.telegram.ui.zq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.zq0
    public final void i(int i10, boolean z10, boolean z11) {
        jq0 jq0Var = this.c;
        jq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        jq0Var.V(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.zq0
    public final void a() {
    }

    @Override // org.telegram.ui.zq0
    public final /* synthetic */ void g() {
    }
}
