package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class a41 extends org.telegram.ui.Components.h61 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ c51 e;

    public a41(c51 c51Var, boolean z9, boolean z10, boolean z11, FrameLayout frameLayout) {
        this.e = c51Var;
        this.a = z9;
        this.b = z10;
        this.c = z11;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.h61
    public final View d(int i7) {
        c51 c51Var = this.e;
        if (c51Var.n0) {
            return c51Var.i0;
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
                return c51Var.i0;
            }
            i7--;
        }
        return (this.c && i7 == 0) ? c51Var.j0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.h61
    public final int e() {
        if (this.e.n0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.h61
    public final int h(int i7) {
        return i7;
    }

    @Override // org.telegram.ui.Components.h61
    public final void b(View view, int i7, int i10) {
    }
}
