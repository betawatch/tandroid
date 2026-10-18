package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class mp0 implements kq0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ up0 c;

    public mp0(up0 up0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = up0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.kq0
    public final void b(Editable editable) {
        up0 up0Var = this.c;
        org.telegram.ui.Components.qu quVar = up0Var.M;
        up0Var.a = editable;
        quVar.setText(editable);
    }

    @Override // org.telegram.ui.kq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.kq0
    public final void h(int i10, boolean z10, boolean z11) {
        up0 up0Var = this.c;
        up0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        up0Var.V(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.kq0
    public final void a() {
    }

    @Override // org.telegram.ui.kq0
    public final /* synthetic */ void g() {
    }
}
