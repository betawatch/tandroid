package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class tt implements yt, al0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tt(zt ztVar, int i10, int i11, Runnable runnable) {
        this.c = ztVar;
        this.a = i10;
        this.b = i11;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.al0
    public void d(float f7, float f10, int i10, View view) {
        ug.n1.Q((ug.n1) this.c, this.a, (org.telegram.ui.ActionBar.f6) this.d, this.b, view);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.yt
    public void run(String str) {
        zt.k((zt) this.c, this.a, this.b, (Runnable) this.d, str);
    }

    public /* synthetic */ tt(ug.n1 n1Var, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this.c = n1Var;
        this.a = i10;
        this.d = f6Var;
        this.b = i11;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
