package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cp0 implements zp0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ jp0 c;

    public cp0(jp0 jp0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = jp0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.zp0
    public final void b(Editable editable) {
        jp0 jp0Var = this.c;
        org.telegram.ui.Components.tt ttVar = jp0Var.I;
        jp0Var.a = editable;
        ttVar.setText(editable);
    }

    @Override // org.telegram.ui.zp0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.zp0
    public final void i(int i10, boolean z10, boolean z11) {
        jp0 jp0Var = this.c;
        jp0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        jp0Var.V(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.zp0
    public final void a() {
    }

    @Override // org.telegram.ui.zp0
    public final /* synthetic */ void h() {
    }
}
