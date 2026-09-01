package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements o1.f {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ q(View view, float f10, Runnable runnable) {
        this.c = runnable;
        this.d = view;
        this.b = f10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.a) {
            case 0:
                AndroidUtilities.lambda$shakeViewSpring$14(this.c, (View) this.d, this.b, hVar, z4, f10, f11);
                break;
            default:
                qh.d3 d3Var = (qh.d3) this.d;
                qh.c3 c3Var = d3Var.b;
                if (!z4) {
                    c3Var.setTranslationY(this.b);
                    c3Var.H = false;
                    d3Var.d = null;
                    d3Var.e = null;
                    Runnable runnable = this.c;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ q(qh.d3 d3Var, float f10, Runnable runnable) {
        this.d = d3Var;
        this.b = f10;
        this.c = runnable;
    }
}
