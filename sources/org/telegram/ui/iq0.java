package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class iq0 implements gr0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ qq0 c;

    public iq0(qq0 qq0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = qq0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.gr0
    public final void b(Editable editable) {
        qq0 qq0Var = this.c;
        org.telegram.ui.Components.vu vuVar = qq0Var.M;
        qq0Var.a = editable;
        vuVar.setText(editable);
    }

    @Override // org.telegram.ui.gr0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.gr0
    public final void h(int i10, boolean z10, boolean z11) {
        qq0 qq0Var = this.c;
        qq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        qq0Var.V(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.gr0
    public final void a() {
    }

    @Override // org.telegram.ui.gr0
    public final /* synthetic */ void g() {
    }
}
