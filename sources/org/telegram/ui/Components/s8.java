package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s8 implements org.telegram.ui.ActionBar.a2, br {
    public final /* synthetic */ int a;
    public final /* synthetic */ g9 b;

    public /* synthetic */ s8(g9 g9Var, int i10) {
        this.a = i10;
        this.b = g9Var;
    }

    @Override // org.telegram.ui.Components.br
    public /* synthetic */ int B0(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.br
    public void s0(int i10, int i11, boolean z10) {
        g9 g9Var = this.b;
        if (i11 == 0) {
            c9 c9Var = g9Var.Y;
            int i12 = c9Var.c;
            if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                c9 a2 = c9Var.a();
                g9Var.Y = a2;
                g9Var.a.b(a2, true);
                g9Var.n0();
            }
            g9Var.Y.c = i10;
        } else if (i11 == 1) {
            c9 c9Var2 = g9Var.Y;
            int i13 = c9Var2.d;
            if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                c9 a10 = c9Var2.a();
                g9Var.Y = a10;
                g9Var.a.b(a10, true);
                g9Var.n0();
            }
            g9Var.Y.d = i10;
        } else if (i11 == 2) {
            c9 c9Var3 = g9Var.Y;
            int i14 = c9Var3.e;
            if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                c9 a11 = c9Var3.a();
                g9Var.Y = a11;
                g9Var.a.b(a11, true);
                g9Var.n0();
            }
            g9Var.Y.e = i10;
        } else if (i11 == 3) {
            c9 c9Var4 = g9Var.Y;
            int i15 = c9Var4.f;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                c9 a12 = c9Var4.a();
                g9Var.Y = a12;
                g9Var.a.b(a12, true);
                g9Var.n0();
            }
            g9Var.Y.f = i10;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        g9Var.a.invalidate();
    }

    @Override // org.telegram.ui.Components.br
    public /* synthetic */ void l(boolean z10) {
    }

    @Override // org.telegram.ui.Components.br
    public /* synthetic */ void y() {
    }
}
