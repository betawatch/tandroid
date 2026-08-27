package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o60 b;

    public /* synthetic */ f60(o60 o60Var, int i10) {
        this.a = i10;
        this.b = o60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                o60 o60Var = this.b;
                o60Var.f.r.clearFocus();
                o60Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(o60Var.f.r);
                break;
            case 1:
                this.b.o0();
                break;
            case 2:
                o60 o60Var2 = this.b;
                o60Var2.n0(o60Var2.l0());
                break;
            case 3:
                o60 o60Var3 = this.b;
                o60Var3.n0(o60Var3.l0());
                break;
            default:
                o60 o60Var4 = this.b;
                o60Var4.T = null;
                o60Var4.V.b();
                o60Var4.h.b();
                o60Var4.k0();
                o60Var4.r0();
                o60Var4.s0();
                break;
        }
    }
}
