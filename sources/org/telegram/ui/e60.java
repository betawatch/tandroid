package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n60 b;

    public /* synthetic */ e60(n60 n60Var, int i10) {
        this.a = i10;
        this.b = n60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                n60 n60Var = this.b;
                n60Var.f.r.clearFocus();
                n60Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(n60Var.f.r);
                break;
            case 1:
                this.b.o0();
                break;
            case 2:
                n60 n60Var2 = this.b;
                n60Var2.n0(n60Var2.l0());
                break;
            case 3:
                n60 n60Var3 = this.b;
                n60Var3.n0(n60Var3.l0());
                break;
            default:
                n60 n60Var4 = this.b;
                n60Var4.X = null;
                n60Var4.Z.b();
                n60Var4.h.b();
                n60Var4.k0();
                n60Var4.r0();
                n60Var4.s0();
                break;
        }
    }
}
