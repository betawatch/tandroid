package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kc0 extends f2.b1 {
    public final /* synthetic */ tc0 a;

    public kc0(tc0 tc0Var) {
        this.a = tc0Var;
    }

    @Override // f2.b1
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        tc0 tc0Var = this.a;
        tc0Var.M = z10;
        if (z10 || tc0Var.H == null) {
            return;
        }
        tc0Var.H = null;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        tc0 tc0Var = this.a;
        tc0Var.A0(false);
        if (tc0Var.H != null) {
            tc0Var.J += i11;
        }
    }
}
