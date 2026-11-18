package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class le0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ne0 b;

    public /* synthetic */ le0(ne0 ne0Var, int i7) {
        this.a = i7;
        this.b = ne0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c.a(false);
                break;
            default:
                ne0 ne0Var = this.b;
                Runnable runnable = ne0Var.H;
                ne0Var.H = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = ne0Var.I;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
