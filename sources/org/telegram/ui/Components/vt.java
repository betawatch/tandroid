package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vt implements au, ll0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vt(bu buVar, int i10, int i11, Runnable runnable) {
        this.c = buVar;
        this.a = i10;
        this.b = i11;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.ll0
    public void c(float f7, float f10, int i10, View view) {
        tg.m1.Q((tg.m1) this.c, this.a, (org.telegram.ui.ActionBar.e6) this.d, this.b, view);
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.au
    public void run(String str) {
        bu.k((bu) this.c, this.a, this.b, (Runnable) this.d, str);
    }

    public /* synthetic */ vt(tg.m1 m1Var, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        this.c = m1Var;
        this.a = i10;
        this.d = e6Var;
        this.b = i11;
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
