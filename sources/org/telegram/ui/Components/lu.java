package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lu implements qu, fm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lu(ru ruVar, int i10, int i11, Runnable runnable) {
        this.c = ruVar;
        this.a = i10;
        this.b = i11;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.fm0
    public void c(float f7, float f10, int i10, View view) {
        tg.m1.R((tg.m1) this.c, this.a, (org.telegram.ui.ActionBar.e6) this.d, this.b, view);
    }

    @Override // org.telegram.ui.Components.qu
    public void run(String str) {
        ru.k((ru) this.c, this.a, this.b, (Runnable) this.d, str);
    }

    public /* synthetic */ lu(tg.m1 m1Var, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        this.c = m1Var;
        this.a = i10;
        this.d = e6Var;
        this.b = i11;
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ void n0(View view, float f7, float f10) {
    }
}
