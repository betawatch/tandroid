package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b41 extends org.telegram.ui.Components.n61 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ d51 e;

    public b41(d51 d51Var, boolean z9, boolean z10, boolean z11, FrameLayout frameLayout) {
        this.e = d51Var;
        this.a = z9;
        this.b = z10;
        this.c = z11;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.n61
    public final View d(int i7) {
        d51 d51Var = this.e;
        if (d51Var.n0) {
            return d51Var.i0;
        }
        boolean z9 = this.a;
        FrameLayout frameLayout = this.d;
        if (z9) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.b) {
            if (i7 == 0) {
                return d51Var.i0;
            }
            i7--;
        }
        return (this.c && i7 == 0) ? d51Var.j0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.n61
    public final int e() {
        if (this.e.n0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.n61
    public final int h(int i7) {
        return i7;
    }

    @Override // org.telegram.ui.Components.n61
    public final void b(View view, int i7, int i10) {
    }
}
