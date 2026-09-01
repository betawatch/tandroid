package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h91 extends org.telegram.ui.Components.e81 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ ha1 e;

    public h91(ha1 ha1Var, boolean z4, boolean z10, boolean z11, FrameLayout frameLayout) {
        this.e = ha1Var;
        this.a = z4;
        this.b = z10;
        this.c = z11;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.e81
    public final View d(int i10) {
        ha1 ha1Var = this.e;
        if (ha1Var.i0) {
            return ha1Var.g0;
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
                return ha1Var.g0;
            }
            i10--;
        }
        return (this.c && i10 == 0) ? ha1Var.h0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.e81
    public final int e() {
        if (this.e.i0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.e81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.e81
    public final void b(View view, int i10, int i11) {
    }
}
