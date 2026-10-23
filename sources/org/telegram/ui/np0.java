package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class np0 implements lq0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ vp0 c;

    public np0(vp0 vp0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = vp0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.lq0
    public final void b(Editable editable) {
        vp0 vp0Var = this.c;
        org.telegram.ui.Components.qu quVar = vp0Var.M;
        vp0Var.a = editable;
        quVar.setText(editable);
    }

    @Override // org.telegram.ui.lq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.lq0
    public final void h(int i10, boolean z10, boolean z11) {
        vp0 vp0Var = this.c;
        vp0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        vp0Var.V(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.lq0
    public final void a() {
    }

    @Override // org.telegram.ui.lq0
    public final /* synthetic */ void g() {
    }
}
