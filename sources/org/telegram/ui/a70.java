package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j70 b;

    public /* synthetic */ a70(j70 j70Var, int i10) {
        this.a = i10;
        this.b = j70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                j70 j70Var = this.b;
                j70Var.f.r.clearFocus();
                j70Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(j70Var.f.r);
                break;
            case 1:
                this.b.o0();
                break;
            case 2:
                j70 j70Var2 = this.b;
                j70Var2.n0(j70Var2.l0());
                break;
            case 3:
                j70 j70Var3 = this.b;
                j70Var3.n0(j70Var3.l0());
                break;
            default:
                j70 j70Var4 = this.b;
                j70Var4.X = null;
                j70Var4.Z.b();
                j70Var4.h.b();
                j70Var4.k0();
                j70Var4.r0();
                j70Var4.s0();
                break;
        }
    }
}
