package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class g91 extends org.telegram.ui.Components.c81 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ ga1 e;

    public g91(ga1 ga1Var, boolean z4, boolean z10, boolean z11, FrameLayout frameLayout) {
        this.e = ga1Var;
        this.a = z4;
        this.b = z10;
        this.c = z11;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        ga1 ga1Var = this.e;
        if (ga1Var.i0) {
            return ga1Var.g0;
        }
        boolean z4 = this.a;
        FrameLayout frameLayout = this.d;
        if (z4) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.b) {
            if (i10 == 0) {
                return ga1Var.g0;
            }
            i10--;
        }
        return (this.c && i10 == 0) ? ga1Var.h0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        if (this.e.i0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.c81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
    }
}
