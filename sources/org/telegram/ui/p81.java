package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class p81 extends org.telegram.ui.Components.v81 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ p91 e;

    public p81(p91 p91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = p91Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.v81
    public final View d(int i10) {
        p91 p91Var = this.e;
        if (p91Var.l0) {
            return p91Var.j0;
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
                return p91Var.j0;
            }
            i10--;
        }
        return (this.c && i10 == 0) ? p91Var.k0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.v81
    public final int e() {
        if (this.e.l0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.v81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.v81
    public final void b(View view, int i10, int i11) {
    }
}
