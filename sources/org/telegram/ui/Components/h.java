package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l80 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ h(l80 l80Var, boolean z10, Runnable runnable, int i10) {
        this.a = i10;
        this.b = l80Var;
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
