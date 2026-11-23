package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;
    public final /* synthetic */ a70 c;

    public /* synthetic */ f7(f8 f8Var, a70 a70Var, int i7) {
        this.a = i7;
        this.b = f8Var;
        this.c = a70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        a70 a70Var = this.c;
        f8 f8Var = this.b;
        switch (i7) {
            case 0:
                f8Var.getClass();
                a70Var.v();
                f8Var.Q0(1);
                break;
            case 1:
                f8Var.getClass();
                a70Var.v();
                f8Var.Q0(2);
                break;
            case 2:
                f8Var.getClass();
                a70Var.v();
                f8Var.Q0(4);
                break;
            case 3:
                f8Var.getClass();
                a70Var.v();
                f8Var.Q0(7);
                break;
            default:
                f8Var.V0(true);
                org.telegram.messenger.f3.n(null, 2131753909, new lc((FrameLayout) f8Var.b, f8Var.J0), R.raw.saved_messages, 36);
                a70Var.v();
                break;
        }
    }
}
