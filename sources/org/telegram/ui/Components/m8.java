package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8 implements org.telegram.ui.ActionBar.r1, jq {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8 b;

    public /* synthetic */ m8(y8 y8Var, int i7) {
        this.a = i7;
        this.b = y8Var;
    }

    @Override // org.telegram.ui.Components.jq
    public void c(int i7, int i10, boolean z10) {
        y8 y8Var = this.b;
        if (i10 == 0) {
            u8 u8Var = y8Var.Z;
            int i11 = u8Var.c;
            if (i11 != i7 && (i11 == 0 || i7 == 0)) {
                u8 a10 = u8Var.a();
                y8Var.Z = a10;
                y8Var.a.b(a10, true);
                y8Var.s0();
            }
            y8Var.Z.c = i7;
        } else if (i10 == 1) {
            u8 u8Var2 = y8Var.Z;
            int i12 = u8Var2.d;
            if (i12 != i7 && (i12 == 0 || i7 == 0)) {
                u8 a11 = u8Var2.a();
                y8Var.Z = a11;
                y8Var.a.b(a11, true);
                y8Var.s0();
            }
            y8Var.Z.d = i7;
        } else if (i10 == 2) {
            u8 u8Var3 = y8Var.Z;
            int i13 = u8Var3.e;
            if (i13 != i7 && (i13 == 0 || i7 == 0)) {
                u8 a12 = u8Var3.a();
                y8Var.Z = a12;
                y8Var.a.b(a12, true);
                y8Var.s0();
            }
            y8Var.Z.e = i7;
        } else if (i10 == 3) {
            u8 u8Var4 = y8Var.Z;
            int i14 = u8Var4.f;
            if (i14 != i7 && (i14 == 0 || i7 == 0)) {
                u8 a13 = u8Var4.a();
                y8Var.Z = a13;
                y8Var.a.b(a13, true);
                y8Var.s0();
            }
            y8Var.Z.f = i7;
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.u4, new Object[0]);
        y8Var.a.invalidate();
    }

    @Override // org.telegram.ui.Components.jq
    public /* synthetic */ int d(int i7) {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.jq
    public /* synthetic */ void a(boolean z10) {
    }

    @Override // org.telegram.ui.Components.jq
    public /* synthetic */ void b() {
    }
}
