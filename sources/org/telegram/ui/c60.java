package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class c60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l60 b;

    public /* synthetic */ c60(l60 l60Var, int i10) {
        this.a = i10;
        this.b = l60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                l60 l60Var = this.b;
                l60Var.f.r.clearFocus();
                l60Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(l60Var.f.r);
                break;
            case 1:
                this.b.o0();
                break;
            case 2:
                l60 l60Var2 = this.b;
                l60Var2.n0(l60Var2.l0());
                break;
            case 3:
                l60 l60Var3 = this.b;
                l60Var3.n0(l60Var3.l0());
                break;
            default:
                l60 l60Var4 = this.b;
                l60Var4.X = null;
                l60Var4.Z.b();
                l60Var4.h.b();
                l60Var4.k0();
                l60Var4.r0();
                l60Var4.s0();
                break;
        }
    }
}
