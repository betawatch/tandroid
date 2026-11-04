package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q31 extends org.telegram.ui.Components.f61 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ r41 e;

    public q31(r41 r41Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = r41Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.f61
    public final View d(int i3) {
        r41 r41Var = this.e;
        if (r41Var.o0) {
            return r41Var.j0;
        }
        boolean z10 = this.a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i3 == 0) {
                return frameLayout;
            }
            i3--;
        }
        if (this.b) {
            if (i3 == 0) {
                return r41Var.j0;
            }
            i3--;
        }
        return (this.c && i3 == 0) ? r41Var.k0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.f61
    public final int e() {
        if (this.e.o0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.f61
    public final int h(int i3) {
        return i3;
    }

    @Override // org.telegram.ui.Components.f61
    public final void b(View view, int i3, int i10) {
    }
}
