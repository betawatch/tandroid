package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class dr0 implements org.telegram.ui.Components.mm0 {
    public final /* synthetic */ ir0 a;

    public dr0(ir0 ir0Var) {
        this.a = ir0Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final void C0(float f7) {
        ir0 ir0Var = this.a;
        if (f7 != 1.0f || ir0Var.n[1].getVisibility() == 0) {
            if (ir0Var.v) {
                ir0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                ir0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * ir0Var.n[0].getMeasuredWidth()));
            } else {
                ir0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                ir0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - ir0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                gr0[] gr0VarArr = ir0Var.n;
                gr0 gr0Var = gr0VarArr[0];
                gr0VarArr[0] = gr0VarArr[1];
                gr0VarArr[1] = gr0Var;
                gr0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final void d(int i10, boolean z10) {
        ir0 ir0Var = this.a;
        if (ir0Var.n[0].e == i10) {
            return;
        }
        ir0Var.e = i10 == ir0Var.h.getFirstTabId();
        gr0 gr0Var = ir0Var.n[1];
        gr0Var.e = i10;
        gr0Var.setVisibility(0);
        ir0Var.j0(true);
        ir0Var.v = z10;
        if (i10 == 0) {
            ir0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            ir0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final /* synthetic */ boolean n1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.mm0
    public final /* synthetic */ void C() {
    }
}
