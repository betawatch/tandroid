package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;
    public final /* synthetic */ k60 c;

    public /* synthetic */ a7(b8 b8Var, k60 k60Var, int i7) {
        this.a = i7;
        this.b = b8Var;
        this.c = k60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        k60 k60Var = this.c;
        b8 b8Var = this.b;
        switch (i7) {
            case 0:
                b8Var.getClass();
                k60Var.u();
                b8Var.P0(1);
                break;
            case 1:
                b8Var.getClass();
                k60Var.u();
                b8Var.P0(2);
                break;
            case 2:
                b8Var.getClass();
                k60Var.u();
                b8Var.P0(4);
                break;
            case 3:
                b8Var.getClass();
                k60Var.u();
                b8Var.P0(7);
                break;
            default:
                b8Var.U0(true);
                org.telegram.messenger.k5.o(null, 2131753912, new hc((FrameLayout) b8Var.b, b8Var.I0), R.raw.saved_messages, 36);
                k60Var.u();
                break;
        }
    }
}
