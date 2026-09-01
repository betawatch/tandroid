package hg;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.xt;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements kl0, wt {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l2(v2 v2Var, int i10, g6 g6Var, int i11) {
        this.c = v2Var;
        this.a = i10;
        this.d = g6Var;
        this.b = i11;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f10, float f11, int i10, View view) {
        v2.Q((v2) this.c, this.a, (g6) this.d, this.b, view);
    }

    @Override // org.telegram.ui.Components.wt
    public void run(String str) {
        xt.k((xt) this.c, this.a, this.b, (Runnable) this.d, str);
    }

    public /* synthetic */ l2(xt xtVar, int i10, int i11, Runnable runnable) {
        this.c = xtVar;
        this.a = i10;
        this.b = i11;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
