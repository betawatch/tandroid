package jg;

import android.view.View;
import org.telegram.ui.ActionBar.v5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ u1(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performClick();
                break;
            default:
                View view = this.b;
                if (view instanceof v5) {
                    v5 v5Var = (v5) view;
                    if (!v5Var.a) {
                        v5Var.a = true;
                        v5Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
