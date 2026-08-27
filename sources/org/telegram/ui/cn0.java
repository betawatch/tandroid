package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ do0 b;

    public /* synthetic */ cn0(do0 do0Var, int i10) {
        this.a = i10;
        this.b = do0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                do0 do0Var = this.b;
                do0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(do0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                do0 do0Var2 = this.b;
                do0Var2.getMessagesController().newMessageCallback = null;
                if (do0Var2.b1 == 3 && !do0Var2.isFinishing()) {
                    do0Var2.b1 = 4;
                    co0 co0Var = do0Var2.V0;
                    if (co0Var != null) {
                        co0Var.b(4);
                    }
                    do0Var2.finishFragment();
                    break;
                } else if (do0Var2.b1 == 1 && !do0Var2.isFinishing()) {
                    do0Var2.finishFragment();
                    break;
                }
                break;
            default:
                do0 do0Var3 = this.b;
                if (do0Var3.Z != null) {
                    do0Var3.w0();
                    do0Var3.Z = null;
                    break;
                }
                break;
        }
    }
}
