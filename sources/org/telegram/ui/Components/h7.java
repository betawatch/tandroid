package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ h7(f8 f8Var, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = f8Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.h6 h6Var;
        switch (this.a) {
            case 0:
                f8 f8Var = this.b;
                frameLayout = (FrameLayout) f8Var.b;
                h6Var = f8Var.J0;
                break;
            case 1:
                f8 f8Var2 = this.b;
                frameLayout = (FrameLayout) f8Var2.b;
                h6Var = f8Var2.J0;
                break;
            case 2:
                f8 f8Var3 = this.b;
                frameLayout = (FrameLayout) f8Var3.b;
                h6Var = f8Var3.J0;
                break;
            default:
                f8 f8Var4 = this.b;
                frameLayout = (FrameLayout) f8Var4.b;
                h6Var = f8Var4.J0;
                break;
        }
        org.telegram.ui.Cells.c0.t(frameLayout, h6Var, this.c, false);
    }
}
