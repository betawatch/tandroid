package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ c7(b8 b8Var, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = b8Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.a) {
            case 0:
                b8 b8Var = this.b;
                frameLayout = (FrameLayout) b8Var.b;
                f6Var = b8Var.I0;
                break;
            case 1:
                b8 b8Var2 = this.b;
                frameLayout = (FrameLayout) b8Var2.b;
                f6Var = b8Var2.I0;
                break;
            case 2:
                b8 b8Var3 = this.b;
                frameLayout = (FrameLayout) b8Var3.b;
                f6Var = b8Var3.I0;
                break;
            default:
                b8 b8Var4 = this.b;
                frameLayout = (FrameLayout) b8Var4.b;
                f6Var = b8Var4.I0;
                break;
        }
        org.telegram.ui.Cells.f1.r(frameLayout, f6Var, this.c, false);
    }
}
