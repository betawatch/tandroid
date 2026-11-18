package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y60 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ n60(y60 y60Var, Runnable runnable, int i7) {
        this.a = i7;
        this.b = y60Var;
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
                y60 y60Var = this.b;
                if (y60Var.J) {
                    y60Var.v();
                    break;
                }
                break;
            case 2:
                this.c.run();
                y60 y60Var2 = this.b;
                if (y60Var2.J) {
                    y60Var2.v();
                    break;
                }
                break;
            case 3:
                y60 y60Var3 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    y60Var3.getClass();
                    break;
                } else {
                    int i7 = -y60Var3.K;
                    y60Var3.K = i7;
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
                y60 y60Var4 = this.b;
                if (y60Var4.J) {
                    y60Var4.v();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                y60 y60Var5 = this.b;
                if (y60Var5.J) {
                    y60Var5.v();
                    break;
                }
                break;
        }
    }
}
