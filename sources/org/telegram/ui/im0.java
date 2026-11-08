package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class im0 implements org.telegram.ui.Components.t4, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mm0 b;

    public /* synthetic */ im0(mm0 mm0Var, int i7) {
        this.a = i7;
        this.b = mm0Var;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 0:
                mm0 mm0Var = this.b;
                mm0Var.a0(mm0Var.b, mm0Var.c, z9, i7);
                mm0Var.finishFragment();
                break;
            default:
                mm0 mm0Var2 = this.b;
                mm0Var2.a0(mm0Var2.b, mm0Var2.c, z9, i7);
                mm0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        mm0 mm0Var = this.b;
        mm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = mm0Var.I) != null && g1Var.isShowing()) {
            mm0Var.I.d(true);
        }
    }
}
