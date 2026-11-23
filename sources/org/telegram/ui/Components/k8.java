package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k8 implements org.telegram.ui.ActionBar.q1, iq {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8 b;

    public /* synthetic */ k8(x8 x8Var, int i7) {
        this.a = i7;
        this.b = x8Var;
    }

    @Override // org.telegram.ui.Components.iq
    public void c(int i7, int i10, boolean z10) {
        x8 x8Var = this.b;
        if (i10 == 0) {
            t8 t8Var = x8Var.Z;
            int i11 = t8Var.c;
            if (i11 != i7 && (i11 == 0 || i7 == 0)) {
                t8 a10 = t8Var.a();
                x8Var.Z = a10;
                x8Var.a.b(a10, true);
                x8Var.s0();
            }
            x8Var.Z.c = i7;
        } else if (i10 == 1) {
            t8 t8Var2 = x8Var.Z;
            int i12 = t8Var2.d;
            if (i12 != i7 && (i12 == 0 || i7 == 0)) {
                t8 a11 = t8Var2.a();
                x8Var.Z = a11;
                x8Var.a.b(a11, true);
                x8Var.s0();
            }
            x8Var.Z.d = i7;
        } else if (i10 == 2) {
            t8 t8Var3 = x8Var.Z;
            int i13 = t8Var3.e;
            if (i13 != i7 && (i13 == 0 || i7 == 0)) {
                t8 a12 = t8Var3.a();
                x8Var.Z = a12;
                x8Var.a.b(a12, true);
                x8Var.s0();
            }
            x8Var.Z.e = i7;
        } else if (i10 == 3) {
            t8 t8Var4 = x8Var.Z;
            int i14 = t8Var4.f;
            if (i14 != i7 && (i14 == 0 || i7 == 0)) {
                t8 a13 = t8Var4.a();
                x8Var.Z = a13;
                x8Var.a.b(a13, true);
                x8Var.s0();
            }
            x8Var.Z.f = i7;
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.u4, new Object[0]);
        x8Var.a.invalidate();
    }

    @Override // org.telegram.ui.Components.iq
    public /* synthetic */ int d(int i7) {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.iq
    public /* synthetic */ void a(boolean z10) {
    }

    @Override // org.telegram.ui.Components.iq
    public /* synthetic */ void b() {
    }
}
