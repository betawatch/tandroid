package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ a7(y7 y7Var, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = y7Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.a) {
            case 0:
                y7 y7Var = this.b;
                frameLayout = (FrameLayout) y7Var.b;
                e6Var = y7Var.J0;
                break;
            case 1:
                y7 y7Var2 = this.b;
                frameLayout = (FrameLayout) y7Var2.b;
                e6Var = y7Var2.J0;
                break;
            case 2:
                y7 y7Var3 = this.b;
                frameLayout = (FrameLayout) y7Var3.b;
                e6Var = y7Var3.J0;
                break;
            default:
                y7 y7Var4 = this.b;
                frameLayout = (FrameLayout) y7Var4.b;
                e6Var = y7Var4.J0;
                break;
        }
        org.telegram.ui.Cells.y0.q(frameLayout, e6Var, this.c, false);
    }
}
