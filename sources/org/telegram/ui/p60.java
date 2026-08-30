package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y60 b;

    public /* synthetic */ p60(y60 y60Var, int i10) {
        this.a = i10;
        this.b = y60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                y60 y60Var = this.b;
                y60Var.f.r.clearFocus();
                y60Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(y60Var.f.r);
                break;
            case 1:
                this.b.o0();
                break;
            case 2:
                y60 y60Var2 = this.b;
                y60Var2.n0(y60Var2.l0());
                break;
            case 3:
                y60 y60Var3 = this.b;
                y60Var3.n0(y60Var3.l0());
                break;
            default:
                y60 y60Var4 = this.b;
                y60Var4.U = null;
                y60Var4.W.b();
                y60Var4.h.b();
                y60Var4.k0();
                y60Var4.r0();
                y60Var4.s0();
                break;
        }
    }
}
