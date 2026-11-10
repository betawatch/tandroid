package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8 b;
    public final /* synthetic */ k60 c;

    public /* synthetic */ z6(a8 a8Var, k60 k60Var, int i7) {
        this.a = i7;
        this.b = a8Var;
        this.c = k60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        k60 k60Var = this.c;
        a8 a8Var = this.b;
        switch (i7) {
            case 0:
                a8Var.getClass();
                k60Var.u();
                a8Var.P0(1);
                break;
            case 1:
                a8Var.getClass();
                k60Var.u();
                a8Var.P0(2);
                break;
            case 2:
                a8Var.getClass();
                k60Var.u();
                a8Var.P0(4);
                break;
            case 3:
                a8Var.getClass();
                k60Var.u();
                a8Var.P0(7);
                break;
            default:
                a8Var.U0(true);
                org.telegram.messenger.k5.o(null, 2131753912, new gc((FrameLayout) a8Var.b, a8Var.I0), R.raw.saved_messages, 36);
                k60Var.u();
                break;
        }
    }
}
