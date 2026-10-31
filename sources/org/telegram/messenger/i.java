package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements o1.f {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ i(float f7, View view, Runnable runnable) {
        this.c = runnable;
        this.d = view;
        this.b = f7;
    }

    @Override // o1.f
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        int i10 = this.a;
        Runnable runnable = this.c;
        float f11 = this.b;
        KeyEvent.Callback callback = this.d;
        switch (i10) {
            case 0:
                View view = (View) callback;
                if (runnable != null) {
                    runnable.run();
                }
                view.setTranslationX(f11);
                view.setTag(R.id.spring_tag, null);
                view.setTag(R.id.spring_was_translation_x_tag, null);
                break;
            default:
                vh.n2 n2Var = (vh.n2) callback;
                vh.m2 m2Var = n2Var.i1;
                if (!z10) {
                    m2Var.setTranslationY(f11);
                    m2Var.K = false;
                    n2Var.k1 = null;
                    n2Var.l1 = null;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ i(vh.n2 n2Var, float f7, Runnable runnable) {
        this.d = n2Var;
        this.b = f7;
        this.c = runnable;
    }
}
