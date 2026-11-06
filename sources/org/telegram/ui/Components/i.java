package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k60 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ i(k60 k60Var, boolean z9, Runnable runnable, int i7) {
        this.a = i7;
        this.b = k60Var;
        this.c = z9;
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
