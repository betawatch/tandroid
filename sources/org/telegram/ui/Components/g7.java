package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ g7(g8 g8Var, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = g8Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.i6 i6Var;
        switch (this.a) {
            case 0:
                g8 g8Var = this.b;
                frameLayout = (FrameLayout) g8Var.b;
                i6Var = g8Var.J0;
                break;
            case 1:
                g8 g8Var2 = this.b;
                frameLayout = (FrameLayout) g8Var2.b;
                i6Var = g8Var2.J0;
                break;
            case 2:
                g8 g8Var3 = this.b;
                frameLayout = (FrameLayout) g8Var3.b;
                i6Var = g8Var3.J0;
                break;
            default:
                g8 g8Var4 = this.b;
                frameLayout = (FrameLayout) g8Var4.b;
                i6Var = g8Var4.J0;
                break;
        }
        org.telegram.ui.Cells.c0.t(frameLayout, i6Var, this.c, false);
    }
}
