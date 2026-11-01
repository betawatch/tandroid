package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma1 implements oh.d, org.telegram.messenger.hp, r0.m, org.telegram.ui.Components.kk0 {
    public final /* synthetic */ nb1 a;

    public /* synthetic */ ma1(nb1 nb1Var) {
        this.a = nb1Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        int i10 = j1Var.a.f(519).d;
        nb1 nb1Var = this.a;
        nb1Var.f1 = i10;
        jb1 jb1Var = nb1Var.r0;
        if (jb1Var != null) {
            jb1Var.setPadding(0, 0, 0, i10);
        }
        ha1 ha1Var = nb1Var.n;
        if (ha1Var != null) {
            ((TextView) ha1Var.d).setTranslationY((-nb1Var.f1) - nb1Var.e1);
        }
        nb1Var.h.setTranslationY(((-nb1Var.X0) - nb1Var.f1) - nb1Var.e1);
        nb1Var.F0();
        return r0.j1.b;
    }

    @Override // org.telegram.messenger.hp
    public boolean a(TLRPC.TL_error tL_error) {
        return nb1.Z(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.kk0
    public boolean b(float f7, float f10, int i10, View view) {
        return nb1.b0(this.a, view, f7);
    }

    @Override // oh.d
    public void c(boolean z10, boolean z11) {
        nb1 nb1Var = this.a;
        nb1Var.U0.i(nb1Var.R0.b(), z10, z11);
    }

    @Override // org.telegram.ui.Components.kk0
    public /* synthetic */ void p(float f7) {
    }

    @Override // org.telegram.ui.Components.kk0
    public /* synthetic */ void g() {
    }
}
