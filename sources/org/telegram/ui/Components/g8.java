package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g8 implements org.telegram.ui.ActionBar.r1, up {
    public final /* synthetic */ int a;
    public final /* synthetic */ s8 b;

    public /* synthetic */ g8(s8 s8Var, int i7) {
        this.a = i7;
        this.b = s8Var;
    }

    @Override // org.telegram.ui.Components.up
    public void c(int i7, int i10, boolean z9) {
        s8 s8Var = this.b;
        if (i10 == 0) {
            o8 o8Var = s8Var.Y;
            int i11 = o8Var.c;
            if (i11 != i7 && (i11 == 0 || i7 == 0)) {
                o8 a10 = o8Var.a();
                s8Var.Y = a10;
                s8Var.a.b(a10, true);
                s8Var.s0();
            }
            s8Var.Y.c = i7;
        } else if (i10 == 1) {
            o8 o8Var2 = s8Var.Y;
            int i12 = o8Var2.d;
            if (i12 != i7 && (i12 == 0 || i7 == 0)) {
                o8 a11 = o8Var2.a();
                s8Var.Y = a11;
                s8Var.a.b(a11, true);
                s8Var.s0();
            }
            s8Var.Y.d = i7;
        } else if (i10 == 2) {
            o8 o8Var3 = s8Var.Y;
            int i13 = o8Var3.e;
            if (i13 != i7 && (i13 == 0 || i7 == 0)) {
                o8 a12 = o8Var3.a();
                s8Var.Y = a12;
                s8Var.a.b(a12, true);
                s8Var.s0();
            }
            s8Var.Y.e = i7;
        } else if (i10 == 3) {
            o8 o8Var4 = s8Var.Y;
            int i14 = o8Var4.f;
            if (i14 != i7 && (i14 == 0 || i7 == 0)) {
                o8 a13 = o8Var4.a();
                s8Var.Y = a13;
                s8Var.a.b(a13, true);
                s8Var.s0();
            }
            s8Var.Y.f = i7;
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, new Object[0]);
        s8Var.a.invalidate();
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
