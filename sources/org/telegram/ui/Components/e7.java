package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;
    public final /* synthetic */ x60 c;

    public /* synthetic */ e7(e8 e8Var, x60 x60Var, int i7) {
        this.a = i7;
        this.b = e8Var;
        this.c = x60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        x60 x60Var = this.c;
        e8 e8Var = this.b;
        switch (i7) {
            case 0:
                e8Var.getClass();
                x60Var.v();
                e8Var.Q0(1);
                break;
            case 1:
                e8Var.getClass();
                x60Var.v();
                e8Var.Q0(2);
                break;
            case 2:
                e8Var.getClass();
                x60Var.v();
                e8Var.Q0(4);
                break;
            case 3:
                e8Var.getClass();
                x60Var.v();
                e8Var.Q0(7);
                break;
            default:
                e8Var.V0(true);
                org.telegram.messenger.f3.n(null, 2131753909, new kc((FrameLayout) e8Var.b, e8Var.J0), R.raw.saved_messages, 36);
                x60Var.v();
                break;
        }
    }
}
