package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k60 implements org.telegram.ui.ActionBar.f1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y60 b;

    public /* synthetic */ k60(y60 y60Var, int i7) {
        this.a = i7;
        this.b = y60Var;
    }

    @Override // org.telegram.ui.ActionBar.f1
    public final void j(KeyEvent keyEvent) {
        y60 y60Var;
        r60 r60Var;
        y60 y60Var2;
        r60 r60Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (r60Var = (y60Var = this.b).m) != null && r60Var.isShowing()) {
                    y60Var.v();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (r60Var2 = (y60Var2 = this.b).m) != null && r60Var2.isShowing()) {
                    y60Var2.v();
                    break;
                }
                break;
        }
    }
}
