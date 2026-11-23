package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ g7(e8 e8Var, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = e8Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.i6 i6Var;
        switch (this.a) {
            case 0:
                e8 e8Var = this.b;
                frameLayout = (FrameLayout) e8Var.b;
                i6Var = e8Var.J0;
                break;
            case 1:
                e8 e8Var2 = this.b;
                frameLayout = (FrameLayout) e8Var2.b;
                i6Var = e8Var2.J0;
                break;
            case 2:
                e8 e8Var3 = this.b;
                frameLayout = (FrameLayout) e8Var3.b;
                i6Var = e8Var3.J0;
                break;
            default:
                e8 e8Var4 = this.b;
                frameLayout = (FrameLayout) e8Var4.b;
                i6Var = e8Var4.J0;
                break;
        }
        org.telegram.ui.Cells.c0.t(frameLayout, i6Var, this.c, false);
    }
}
