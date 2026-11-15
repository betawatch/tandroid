package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;
    public final /* synthetic */ m60 c;

    public /* synthetic */ y6(y7 y7Var, m60 m60Var, int i7) {
        this.a = i7;
        this.b = y7Var;
        this.c = m60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        m60 m60Var = this.c;
        y7 y7Var = this.b;
        switch (i7) {
            case 0:
                y7Var.getClass();
                m60Var.u();
                y7Var.P0(1);
                break;
            case 1:
                y7Var.getClass();
                m60Var.u();
                y7Var.P0(2);
                break;
            case 2:
                y7Var.getClass();
                m60Var.u();
                y7Var.P0(4);
                break;
            case 3:
                y7Var.getClass();
                m60Var.u();
                y7Var.P0(7);
                break;
            default:
                y7Var.U0(true);
                org.telegram.messenger.k5.n(null, 2131753912, new cc((FrameLayout) y7Var.b, y7Var.J0), R.raw.saved_messages, 36);
                m60Var.u();
                break;
        }
    }
}
