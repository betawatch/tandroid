package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o81 implements zh.c, org.telegram.messenger.so, r0.m, org.telegram.ui.Components.ij0 {
    public final /* synthetic */ m91 a;

    public /* synthetic */ o81(m91 m91Var) {
        this.a = m91Var;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        int i3 = k1Var.a.f(519).d;
        m91 m91Var = this.a;
        m91Var.g1 = i3;
        i91 i91Var = m91Var.s0;
        if (i91Var != null) {
            i91Var.setPadding(0, 0, 0, i3);
        }
        j81 j81Var = m91Var.n;
        if (j81Var != null) {
            ((TextView) j81Var.d).setTranslationY((-m91Var.g1) - m91Var.f1);
        }
        m91Var.h.setTranslationY(((-m91Var.Y0) - m91Var.g1) - m91Var.f1);
        m91Var.F0();
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.so
    public boolean a(TLRPC.TL_error tL_error) {
        return m91.Z(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(float f10, float f11, int i3, View view) {
        return m91.b0(this.a, view, f10);
    }

    @Override // zh.c
    public void c(boolean z10, boolean z11) {
        m91 m91Var = this.a;
        m91Var.V0.i(m91Var.S0.b(), z10, z11);
    }

    @Override // org.telegram.ui.Components.ij0
    public /* synthetic */ void r(float f10) {
    }

    @Override // org.telegram.ui.Components.ij0
    public /* synthetic */ void h() {
    }
}
