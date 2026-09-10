package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt implements eu, kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zt(fu fuVar, int i10, int i11, Runnable runnable) {
        this.c = fuVar;
        this.a = i10;
        this.b = i11;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        sg.p1.Q((sg.p1) this.c, this.a, (org.telegram.ui.ActionBar.f6) this.d, this.b, view);
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.eu
    public void run(String str) {
        fu.k((fu) this.c, this.a, this.b, (Runnable) this.d, str);
    }

    public /* synthetic */ zt(sg.p1 p1Var, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this.c = p1Var;
        this.a = i10;
        this.d = f6Var;
        this.b = i11;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
