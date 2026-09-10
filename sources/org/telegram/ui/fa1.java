package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fa1 extends org.telegram.ui.Components.n81 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ fb1 e;

    public fa1(fb1 fb1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = fb1Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        fb1 fb1Var = this.e;
        if (fb1Var.l0) {
            return fb1Var.j0;
        }
        boolean z10 = this.a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.b) {
            if (i10 == 0) {
                return fb1Var.j0;
            }
            i10--;
        }
        return (this.c && i10 == 0) ? fb1Var.k0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        if (this.e.l0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.n81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
    }
}
