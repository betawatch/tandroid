package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e80 implements org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p80 b;

    public /* synthetic */ e80(p80 p80Var, int i10) {
        this.a = i10;
        this.b = p80Var;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public final void o(KeyEvent keyEvent) {
        p80 p80Var;
        k80 k80Var;
        p80 p80Var2;
        k80 k80Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k80Var = (p80Var = this.b).m) != null && k80Var.isShowing()) {
                    p80Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k80Var2 = (p80Var2 = this.b).m) != null && k80Var2.isShowing()) {
                    p80Var2.u();
                    break;
                }
                break;
        }
    }
}
