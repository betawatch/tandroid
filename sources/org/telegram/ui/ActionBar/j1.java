package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ j1(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                View view = this.b;
                if (view instanceof l5) {
                    l5 l5Var = (l5) view;
                    if (!l5Var.a) {
                        l5Var.a = true;
                        l5Var.invalidate();
                        break;
                    }
                }
                break;
            default:
                this.b.performClick();
                break;
        }
    }
}
