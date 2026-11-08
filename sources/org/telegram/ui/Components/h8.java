package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h8 implements org.telegram.ui.ActionBar.r1, up {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8 b;

    public /* synthetic */ h8(t8 t8Var, int i7) {
        this.a = i7;
        this.b = t8Var;
    }

    @Override // org.telegram.ui.Components.up
    public void c(int i7, int i10, boolean z9) {
        t8 t8Var = this.b;
        if (i10 == 0) {
            p8 p8Var = t8Var.Y;
            int i11 = p8Var.c;
            if (i11 != i7 && (i11 == 0 || i7 == 0)) {
                p8 a10 = p8Var.a();
                t8Var.Y = a10;
                t8Var.a.b(a10, true);
                t8Var.s0();
            }
            t8Var.Y.c = i7;
        } else if (i10 == 1) {
            p8 p8Var2 = t8Var.Y;
            int i12 = p8Var2.d;
            if (i12 != i7 && (i12 == 0 || i7 == 0)) {
                p8 a11 = p8Var2.a();
                t8Var.Y = a11;
                t8Var.a.b(a11, true);
                t8Var.s0();
            }
            t8Var.Y.d = i7;
        } else if (i10 == 2) {
            p8 p8Var3 = t8Var.Y;
            int i13 = p8Var3.e;
            if (i13 != i7 && (i13 == 0 || i7 == 0)) {
                p8 a12 = p8Var3.a();
                t8Var.Y = a12;
                t8Var.a.b(a12, true);
                t8Var.s0();
            }
            t8Var.Y.e = i7;
        } else if (i10 == 3) {
            p8 p8Var4 = t8Var.Y;
            int i14 = p8Var4.f;
            if (i14 != i7 && (i14 == 0 || i7 == 0)) {
                p8 a13 = p8Var4.a();
                t8Var.Y = a13;
                t8Var.a.b(a13, true);
                t8Var.s0();
            }
            t8Var.Y.f = i7;
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, new Object[0]);
        t8Var.a.invalidate();
    }

    @Override // org.telegram.ui.Components.up
    public /* synthetic */ int d(int i7) {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.up
    public /* synthetic */ void a(boolean z9) {
    }

    @Override // org.telegram.ui.Components.up
    public /* synthetic */ void b() {
    }
}
