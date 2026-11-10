package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c41 extends org.telegram.ui.Components.m61 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ e51 e;

    public c41(e51 e51Var, boolean z9, boolean z10, boolean z11, FrameLayout frameLayout) {
        this.e = e51Var;
        this.a = z9;
        this.b = z10;
        this.c = z11;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.m61
    public final View d(int i7) {
        e51 e51Var = this.e;
        if (e51Var.n0) {
            return e51Var.i0;
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
                return e51Var.i0;
            }
            i7--;
        }
        return (this.c && i7 == 0) ? e51Var.j0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.m61
    public final int e() {
        if (this.e.n0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.m61
    public final int h(int i7) {
        return i7;
    }

    @Override // org.telegram.ui.Components.m61
    public final void b(View view, int i7, int i10) {
    }
}
