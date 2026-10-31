package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c8 implements org.telegram.ui.ActionBar.u1, bq {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ c8(o8 o8Var, int i10) {
        this.a = i10;
        this.b = o8Var;
    }

    @Override // org.telegram.ui.Components.bq
    public void c(int i10, int i11, boolean z10) {
        o8 o8Var = this.b;
        if (i11 == 0) {
            k8 k8Var = o8Var.Y;
            int i12 = k8Var.c;
            if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                k8 a2 = k8Var.a();
                o8Var.Y = a2;
                o8Var.a.b(a2, true);
                o8Var.r0();
            }
            o8Var.Y.c = i10;
        } else if (i11 == 1) {
            k8 k8Var2 = o8Var.Y;
            int i13 = k8Var2.d;
            if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                k8 a10 = k8Var2.a();
                o8Var.Y = a10;
                o8Var.a.b(a10, true);
                o8Var.r0();
            }
            o8Var.Y.d = i10;
        } else if (i11 == 2) {
            k8 k8Var3 = o8Var.Y;
            int i14 = k8Var3.e;
            if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                k8 a11 = k8Var3.a();
                o8Var.Y = a11;
                o8Var.a.b(a11, true);
                o8Var.r0();
            }
            o8Var.Y.e = i10;
        } else if (i11 == 3) {
            k8 k8Var4 = o8Var.Y;
            int i15 = k8Var4.f;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                k8 a12 = k8Var4.a();
                o8Var.Y = a12;
                o8Var.a.b(a12, true);
                o8Var.r0();
            }
            o8Var.Y.f = i10;
        }
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.r4, new Object[0]);
        o8Var.a.invalidate();
    }

    @Override // org.telegram.ui.Components.bq
    public /* synthetic */ int d(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.bq
    public /* synthetic */ void a(boolean z10) {
    }

    @Override // org.telegram.ui.Components.bq
    public /* synthetic */ void b() {
    }
}
