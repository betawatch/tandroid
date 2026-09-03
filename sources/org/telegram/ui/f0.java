package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f3 b;
    public final /* synthetic */ View c;

    public /* synthetic */ f0(View view, f3 f3Var) {
        this.c = view;
        this.b = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f3 f3Var = this.b;
                View view = this.c;
                view.post(new f0(f3Var, view));
                break;
            default:
                f3 f3Var2 = this.b;
                f3Var2.F.clear();
                f3Var2.H.set(null);
                this.c.invalidate();
                break;
        }
    }

    public /* synthetic */ f0(f3 f3Var, View view) {
        this.b = f3Var;
        this.c = view;
    }
}
