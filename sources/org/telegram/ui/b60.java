package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k60 b;

    public /* synthetic */ b60(k60 k60Var, int i9) {
        this.a = i9;
        this.b = k60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                k60 k60Var = this.b;
                k60Var.f.r.clearFocus();
                k60Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(k60Var.f.r);
                break;
            case 1:
                this.b.n0();
                break;
            case 2:
                k60 k60Var2 = this.b;
                k60Var2.m0(k60Var2.k0());
                break;
            case 3:
                k60 k60Var3 = this.b;
                k60Var3.m0(k60Var3.k0());
                break;
            default:
                k60 k60Var4 = this.b;
                k60Var4.T = null;
                k60Var4.V.b();
                k60Var4.h.b();
                k60Var4.j0();
                k60Var4.q0();
                k60Var4.r0();
                break;
        }
    }
}
