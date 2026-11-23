package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pe0 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ ne0(pe0 pe0Var, Runnable runnable, int i7) {
        this.a = i7;
        this.b = pe0Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                pe0 pe0Var = this.b;
                org.telegram.ui.ActionBar.j5 j5Var = pe0Var.d;
                if (j5Var.I) {
                    pe0Var.I = this.c;
                    j5Var.a(true);
                    break;
                }
                break;
            default:
                pe0 pe0Var2 = this.b;
                org.telegram.ui.ActionBar.j5 j5Var2 = pe0Var2.d;
                if (j5Var2.I) {
                    pe0Var2.I = this.c;
                    j5Var2.a(true);
                    break;
                }
                break;
        }
    }
}
