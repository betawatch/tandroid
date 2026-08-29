package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m60 b;

    public /* synthetic */ d60(m60 m60Var, int i10) {
        this.a = i10;
        this.b = m60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                m60 m60Var = this.b;
                m60Var.f.r.clearFocus();
                m60Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(m60Var.f.r);
                break;
            case 1:
                this.b.o0();
                break;
            case 2:
                m60 m60Var2 = this.b;
                m60Var2.n0(m60Var2.l0());
                break;
            case 3:
                m60 m60Var3 = this.b;
                m60Var3.n0(m60Var3.l0());
                break;
            default:
                m60 m60Var4 = this.b;
                m60Var4.T = null;
                m60Var4.V.b();
                m60Var4.h.b();
                m60Var4.k0();
                m60Var4.r0();
                m60Var4.s0();
                break;
        }
    }
}
