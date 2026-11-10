package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                if (view instanceof n5) {
                    n5 n5Var = (n5) view;
                    if (!n5Var.a) {
                        n5Var.a = true;
                        n5Var.invalidate();
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
