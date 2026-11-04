package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f8 implements org.telegram.ui.ActionBar.p1, up {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8 b;

    public /* synthetic */ f8(r8 r8Var, int i3) {
        this.a = i3;
        this.b = r8Var;
    }

    @Override // org.telegram.ui.Components.up
    public void c(int i3, int i10, boolean z10) {
        r8 r8Var = this.b;
        if (i10 == 0) {
            n8 n8Var = r8Var.Z;
            int i11 = n8Var.c;
            if (i11 != i3 && (i11 == 0 || i3 == 0)) {
                n8 a10 = n8Var.a();
                r8Var.Z = a10;
                r8Var.a.b(a10, true);
                r8Var.s0();
            }
            r8Var.Z.c = i3;
        } else if (i10 == 1) {
            n8 n8Var2 = r8Var.Z;
            int i12 = n8Var2.d;
            if (i12 != i3 && (i12 == 0 || i3 == 0)) {
                n8 a11 = n8Var2.a();
                r8Var.Z = a11;
                r8Var.a.b(a11, true);
                r8Var.s0();
            }
            r8Var.Z.d = i3;
        } else if (i10 == 2) {
            n8 n8Var3 = r8Var.Z;
            int i13 = n8Var3.e;
            if (i13 != i3 && (i13 == 0 || i3 == 0)) {
                n8 a12 = n8Var3.a();
                r8Var.Z = a12;
                r8Var.a.b(a12, true);
                r8Var.s0();
            }
            r8Var.Z.e = i3;
        } else if (i10 == 3) {
            n8 n8Var4 = r8Var.Z;
            int i14 = n8Var4.f;
            if (i14 != i3 && (i14 == 0 || i3 == 0)) {
                n8 a13 = n8Var4.a();
                r8Var.Z = a13;
                r8Var.a.b(a13, true);
                r8Var.s0();
            }
            r8Var.Z.f = i3;
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.r4, new Object[0]);
        r8Var.a.invalidate();
    }

    @Override // org.telegram.ui.Components.up
    public /* synthetic */ int d(int i3) {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
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
    public /* synthetic */ void a(boolean z10) {
    }

    @Override // org.telegram.ui.Components.up
    public /* synthetic */ void b() {
    }
}
