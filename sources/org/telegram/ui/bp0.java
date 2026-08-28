package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bp0 implements yp0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ip0 c;

    public bp0(ip0 ip0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = ip0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.yp0
    public final void b(Editable editable) {
        ip0 ip0Var = this.c;
        org.telegram.ui.Components.ut utVar = ip0Var.I;
        ip0Var.a = editable;
        utVar.setText(editable);
    }

    @Override // org.telegram.ui.yp0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.yp0
    public final void i(int i9, boolean z10, boolean z11) {
        ip0 ip0Var = this.c;
        ip0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        ip0Var.U(this.a, this.b, z11, i9);
    }

    @Override // org.telegram.ui.yp0
    public final void a() {
    }

    @Override // org.telegram.ui.yp0
    public final /* synthetic */ void h() {
    }
}
