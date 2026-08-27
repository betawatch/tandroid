package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ip implements m2.e {
    public int a;
    public final /* synthetic */ ch0 b;

    public ip(ch0 ch0Var) {
        this.b = ch0Var;
    }

    public final void a() {
        ch0 ch0Var = this.b;
        if (ch0Var.s0 != null) {
            int currentItem = ch0Var.getCurrentItem();
            int k10 = ch0Var.s0.k(currentItem) + ch0Var.s0.j();
            if (currentItem != k10) {
                ch0Var.x(k10, false);
            }
        }
    }

    @Override // m2.e
    public final void c(float f10, int i10, int i11) {
        if (i10 == this.b.getCurrentItem() && f10 == 0.0f && this.a == 1) {
            a();
        }
    }

    @Override // m2.e
    public final void d(int i10) {
        if (i10 == 0) {
            a();
        }
        this.a = i10;
    }

    @Override // m2.e
    public final void b(int i10) {
    }
}
