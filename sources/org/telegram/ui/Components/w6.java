package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;
    public final /* synthetic */ z60 c;

    public /* synthetic */ w6(w7 w7Var, z60 z60Var, int i10) {
        this.a = i10;
        this.b = w7Var;
        this.c = z60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        z60 z60Var = this.c;
        w7 w7Var = this.b;
        switch (i10) {
            case 0:
                w7Var.getClass();
                z60Var.u();
                w7Var.P0(1);
                break;
            case 1:
                w7Var.getClass();
                z60Var.u();
                w7Var.P0(2);
                break;
            case 2:
                w7Var.getClass();
                z60Var.u();
                w7Var.P0(4);
                break;
            case 3:
                w7Var.getClass();
                z60Var.u();
                w7Var.P0(7);
                break;
            default:
                w7Var.U0(true);
                org.telegram.messenger.m5.n(null, 2131753912, new cc((FrameLayout) w7Var.b, w7Var.I0), R.raw.saved_messages, 36);
                z60Var.u();
                break;
        }
    }
}
