package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gq0 implements ar0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ kq0 c;

    public gq0(kq0 kq0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = kq0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.ar0
    public final void b(Editable editable) {
        kq0 kq0Var = this.c;
        org.telegram.ui.Components.zu zuVar = kq0Var.M;
        kq0Var.a = editable;
        zuVar.setText(editable);
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
