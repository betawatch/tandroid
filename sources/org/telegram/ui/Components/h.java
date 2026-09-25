package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y70 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ h(y70 y70Var, boolean z10, Runnable runnable, int i10) {
        this.a = i10;
        this.b = y70Var;
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
