package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class b41 extends org.telegram.ui.Components.b71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ c51 e;

    public b41(c51 c51Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = c51Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.b71
    public final View d(int i7) {
        c51 c51Var = this.e;
        if (c51Var.o0) {
            return c51Var.j0;
        }
        boolean z10 = this.a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.b) {
            if (i7 == 0) {
                return c51Var.j0;
            }
            i7--;
        }
        return (this.c && i7 == 0) ? c51Var.k0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.b71
    public final int e() {
        if (this.e.o0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.b71
    public final int h(int i7) {
        return i7;
    }

    @Override // org.telegram.ui.Components.b71
    public final void b(View view, int i7, int i10) {
    }
}
