package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class hq0 implements ar0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ kq0 c;

    public hq0(kq0 kq0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = kq0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.ar0
    public final void b(Editable editable) {
        kq0 kq0Var = this.c;
        org.telegram.ui.Components.hu huVar = kq0Var.M;
        kq0Var.a = editable;
        huVar.setText(editable);
    }

    @Override // org.telegram.ui.ar0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ar0
    public final void h(int i10, boolean z10, boolean z11) {
        kq0 kq0Var = this.c;
        kq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        kq0Var.V(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.ar0
    public final void a() {
    }

    @Override // org.telegram.ui.ar0
    public final /* synthetic */ void g() {
    }
}
