package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a80 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ h(a80 a80Var, boolean z10, Runnable runnable, int i10) {
        this.a = i10;
        this.b = a80Var;
        this.c = z10;
        this.d = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.a) {
            case 0:
                this.b.u();
                if (!this.c && (runnable = this.d) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                this.b.u();
                if (!this.c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
