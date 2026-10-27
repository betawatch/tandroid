package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t60 b;

    public /* synthetic */ i60(t60 t60Var, int i10) {
        this.a = i10;
        this.b = t60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                t60 t60Var = this.b;
                t60Var.X = null;
                t60Var.Z.b();
                t60Var.h.b();
                t60Var.l0();
                t60Var.s0();
                t60Var.t0();
                break;
            case 1:
                t60 t60Var2 = this.b;
                t60Var2.f.r.clearFocus();
                t60Var2.f.r.requestFocus();
                AndroidUtilities.showKeyboard(t60Var2.f.r);
                break;
            case 2:
                this.b.p0();
                break;
            case 3:
                t60 t60Var3 = this.b;
                t60Var3.o0(t60Var3.m0());
                break;
            default:
                t60 t60Var4 = this.b;
                t60Var4.o0(t60Var4.m0());
                break;
        }
    }
}
