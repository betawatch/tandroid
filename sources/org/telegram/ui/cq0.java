package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class cq0 implements vq0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ fq0 c;

    public cq0(fq0 fq0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = fq0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.vq0
    public final void b(Editable editable) {
        fq0 fq0Var = this.c;
        org.telegram.ui.Components.mu muVar = fq0Var.M;
        fq0Var.a = editable;
        muVar.setText(editable);
    }

    @Override // org.telegram.ui.vq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.vq0
    public final void h(int i10, boolean z10, boolean z11) {
        fq0 fq0Var = this.c;
        fq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        fq0Var.T(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.vq0
    public final void a() {
    }

    @Override // org.telegram.ui.vq0
    public final /* synthetic */ void g() {
    }
}
