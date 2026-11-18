package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ k1(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                View view = this.b;
                if (view instanceof o5) {
                    o5 o5Var = (o5) view;
                    if (!o5Var.a) {
                        o5Var.a = true;
                        o5Var.invalidate();
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
