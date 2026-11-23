package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a41 extends org.telegram.ui.Components.c71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ b51 e;

    public a41(b51 b51Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = b51Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.c71
    public final View d(int i7) {
        b51 b51Var = this.e;
        if (b51Var.o0) {
            return b51Var.j0;
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
                return b51Var.j0;
            }
            i7--;
        }
        return (this.c && i7 == 0) ? b51Var.k0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.c71
    public final int e() {
        if (this.e.o0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.c71
    public final int h(int i7) {
        return i7;
    }

    @Override // org.telegram.ui.Components.c71
    public final void b(View view, int i7, int i10) {
    }
}
