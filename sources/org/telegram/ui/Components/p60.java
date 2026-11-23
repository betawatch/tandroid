package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a70 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ p60(a70 a70Var, Runnable runnable, int i7) {
        this.a = i7;
        this.b = a70Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.v();
                Runnable runnable = this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                this.c.run();
                a70 a70Var = this.b;
                if (a70Var.J) {
                    a70Var.v();
                    break;
                }
                break;
            case 2:
                this.c.run();
                a70 a70Var2 = this.b;
                if (a70Var2.J) {
                    a70Var2.v();
                    break;
                }
                break;
            case 3:
                a70 a70Var3 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    a70Var3.getClass();
                    break;
                } else {
                    int i7 = -a70Var3.K;
                    a70Var3.K = i7;
                    org.telegram.messenger.g0.E3(i7, view, null);
                    org.telegram.messenger.q2.E.a();
                    runnable2.run();
                    break;
                }
            case 4:
                Runnable runnable3 = this.c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                a70 a70Var4 = this.b;
                if (a70Var4.J) {
                    a70Var4.v();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                a70 a70Var5 = this.b;
                if (a70Var5.J) {
                    a70Var5.v();
                    break;
                }
                break;
        }
    }
}
