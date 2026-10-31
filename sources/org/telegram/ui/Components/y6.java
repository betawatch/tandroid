package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ y6(w7 w7Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = w7Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.p6 p6Var;
        switch (this.a) {
            case 0:
                w7 w7Var = this.b;
                frameLayout = (FrameLayout) w7Var.b;
                p6Var = w7Var.I0;
                break;
            case 1:
                w7 w7Var2 = this.b;
                frameLayout = (FrameLayout) w7Var2.b;
                p6Var = w7Var2.I0;
                break;
            case 2:
                w7 w7Var3 = this.b;
                frameLayout = (FrameLayout) w7Var3.b;
                p6Var = w7Var3.I0;
                break;
            default:
                w7 w7Var4 = this.b;
                frameLayout = (FrameLayout) w7Var4.b;
                p6Var = w7Var4.I0;
                break;
        }
        org.telegram.ui.Cells.f1.s(frameLayout, p6Var, this.c, false);
    }
}
