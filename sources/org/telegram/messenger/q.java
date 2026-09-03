package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                qh.c3 c3Var = (qh.c3) this.d;
                qh.b3 b3Var = c3Var.b;
                if (!z4) {
                    b3Var.setTranslationY(this.b);
                    b3Var.H = false;
                    c3Var.d = null;
                    c3Var.e = null;
                    Runnable runnable = this.c;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ q(qh.c3 c3Var, float f10, Runnable runnable) {
        this.d = c3Var;
        this.b = f10;
        this.c = runnable;
    }
}
