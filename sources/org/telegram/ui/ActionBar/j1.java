package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                if (view instanceof k5) {
                    k5 k5Var = (k5) view;
                    if (!k5Var.a) {
                        k5Var.a = true;
                        k5Var.invalidate();
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
