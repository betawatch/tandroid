package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lo0 b;

    public /* synthetic */ kn0(lo0 lo0Var, int i10) {
        this.a = i10;
        this.b = lo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lo0 lo0Var = this.b;
                lo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(lo0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                lo0 lo0Var2 = this.b;
                lo0Var2.getMessagesController().newMessageCallback = null;
                if (lo0Var2.c1 == 3 && !lo0Var2.isFinishing()) {
                    lo0Var2.c1 = 4;
                    ko0 ko0Var = lo0Var2.W0;
                    if (ko0Var != null) {
                        ko0Var.a(4);
                    }
                    lo0Var2.finishFragment();
                    break;
                } else if (lo0Var2.c1 == 1 && !lo0Var2.isFinishing()) {
                    lo0Var2.finishFragment();
                    break;
                }
                break;
            default:
                lo0 lo0Var3 = this.b;
                if (lo0Var3.a0 != null) {
                    lo0Var3.w0();
                    lo0Var3.a0 = null;
                    break;
                }
                break;
        }
    }
}
