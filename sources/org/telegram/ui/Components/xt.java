package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xt implements cu, nl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xt(du duVar, int i10, int i11, Runnable runnable) {
        this.c = duVar;
        this.a = i10;
        this.b = i11;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        tg.m1.Q((tg.m1) this.c, this.a, (org.telegram.ui.ActionBar.d6) this.d, this.b, view);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.cu
    public void run(String str) {
        du.k((du) this.c, this.a, this.b, (Runnable) this.d, str);
    }

    public /* synthetic */ xt(tg.m1 m1Var, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        this.c = m1Var;
        this.a = i10;
        this.d = d6Var;
        this.b = i11;
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
