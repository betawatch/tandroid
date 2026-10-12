package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class b80 implements org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m80 b;

    public /* synthetic */ b80(m80 m80Var, int i10) {
        this.a = i10;
        this.b = m80Var;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public final void n(KeyEvent keyEvent) {
        m80 m80Var;
        h80 h80Var;
        m80 m80Var2;
        h80 h80Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h80Var = (m80Var = this.b).m) != null && h80Var.isShowing()) {
                    m80Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h80Var2 = (m80Var2 = this.b).m) != null && h80Var2.isShowing()) {
                    m80Var2.u();
                    break;
                }
                break;
        }
    }
}
