package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ a7(z7 z7Var, TLRPC.TL_error tL_error, int i3) {
        this.a = i3;
        this.b = z7Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.a) {
            case 0:
                z7 z7Var = this.b;
                frameLayout = (FrameLayout) z7Var.b;
                e6Var = z7Var.J0;
                break;
            case 1:
                z7 z7Var2 = this.b;
                frameLayout = (FrameLayout) z7Var2.b;
                e6Var = z7Var2.J0;
                break;
            case 2:
                z7 z7Var3 = this.b;
                frameLayout = (FrameLayout) z7Var3.b;
                e6Var = z7Var3.J0;
                break;
            default:
                z7 z7Var4 = this.b;
                frameLayout = (FrameLayout) z7Var4.b;
                e6Var = z7Var4.J0;
                break;
        }
        org.telegram.ui.Cells.f1.v(frameLayout, e6Var, this.c, false);
    }
}
