package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ b7(a8 a8Var, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = a8Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.h6 h6Var;
        switch (this.a) {
            case 0:
                a8 a8Var = this.b;
                frameLayout = (FrameLayout) a8Var.b;
                h6Var = a8Var.I0;
                break;
            case 1:
                a8 a8Var2 = this.b;
                frameLayout = (FrameLayout) a8Var2.b;
                h6Var = a8Var2.I0;
                break;
            case 2:
                a8 a8Var3 = this.b;
                frameLayout = (FrameLayout) a8Var3.b;
                h6Var = a8Var3.I0;
                break;
            default:
                a8 a8Var4 = this.b;
                frameLayout = (FrameLayout) a8Var4.b;
                h6Var = a8Var4.I0;
                break;
        }
        org.telegram.ui.Cells.f1.r(frameLayout, h6Var, this.c, false);
    }
}
