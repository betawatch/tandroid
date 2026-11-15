package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b60 implements org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m60 b;

    public /* synthetic */ b60(m60 m60Var, int i7) {
        this.a = i7;
        this.b = m60Var;
    }

    @Override // org.telegram.ui.ActionBar.e1
    public final void j(KeyEvent keyEvent) {
        m60 m60Var;
        i60 i60Var;
        m60 m60Var2;
        i60 i60Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (i60Var = (m60Var = this.b).m) != null && i60Var.isShowing()) {
                    m60Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (i60Var2 = (m60Var2 = this.b).m) != null && i60Var2.isShowing()) {
                    m60Var2.u();
                    break;
                }
                break;
        }
    }
}
