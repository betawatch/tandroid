package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l60 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ b60(l60 l60Var, Runnable runnable, int i7) {
        this.a = i7;
        this.b = l60Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.u();
                Runnable runnable = this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                this.c.run();
                l60 l60Var = this.b;
                if (l60Var.J) {
                    l60Var.u();
                    break;
                }
                break;
            case 2:
                this.c.run();
                l60 l60Var2 = this.b;
                if (l60Var2.J) {
                    l60Var2.u();
                    break;
                }
                break;
            case 3:
                l60 l60Var3 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    l60Var3.getClass();
                    break;
                } else {
                    int i7 = -l60Var3.K;
                    l60Var3.K = i7;
                    org.telegram.messenger.g0.G3(i7, view, null);
                    org.telegram.messenger.p2.D.a();
                    runnable2.run();
                    break;
                }
            case 4:
                Runnable runnable3 = this.c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                l60 l60Var4 = this.b;
                if (l60Var4.J) {
                    l60Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                l60 l60Var5 = this.b;
                if (l60Var5.J) {
                    l60Var5.u();
                    break;
                }
                break;
        }
    }
}
