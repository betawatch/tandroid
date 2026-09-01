package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z60 b;

    public /* synthetic */ q60(z60 z60Var, int i10) {
        this.a = i10;
        this.b = z60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                z60 z60Var = this.b;
                z60Var.f.r.clearFocus();
                z60Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(z60Var.f.r);
                break;
            case 1:
                this.b.o0();
                break;
            case 2:
                z60 z60Var2 = this.b;
                z60Var2.n0(z60Var2.l0());
                break;
            case 3:
                z60 z60Var3 = this.b;
                z60Var3.n0(z60Var3.l0());
                break;
            default:
                z60 z60Var4 = this.b;
                z60Var4.U = null;
                z60Var4.W.b();
                z60Var4.h.b();
                z60Var4.k0();
                z60Var4.r0();
                z60Var4.s0();
                break;
        }
    }
}
