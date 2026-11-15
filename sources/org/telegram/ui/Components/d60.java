package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m60 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ d60(m60 m60Var, Runnable runnable, int i7) {
        this.a = i7;
        this.b = m60Var;
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
                m60 m60Var = this.b;
                if (m60Var.J) {
                    m60Var.u();
                    break;
                }
                break;
            case 2:
                this.c.run();
                m60 m60Var2 = this.b;
                if (m60Var2.J) {
                    m60Var2.u();
                    break;
                }
                break;
            case 3:
                m60 m60Var3 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    m60Var3.getClass();
                    break;
                } else {
                    int i7 = -m60Var3.K;
                    m60Var3.K = i7;
                    org.telegram.messenger.g0.F3(i7, view, null);
                    org.telegram.messenger.p2.E.a();
                    runnable2.run();
                    break;
                }
            case 4:
                Runnable runnable3 = this.c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                m60 m60Var4 = this.b;
                if (m60Var4.J) {
                    m60Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                m60 m60Var5 = this.b;
                if (m60Var5.J) {
                    m60Var5.u();
                    break;
                }
                break;
        }
    }
}
