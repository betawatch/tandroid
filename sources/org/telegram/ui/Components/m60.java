package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m60 implements org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a70 b;

    public /* synthetic */ m60(a70 a70Var, int i7) {
        this.a = i7;
        this.b = a70Var;
    }

    @Override // org.telegram.ui.ActionBar.e1
    public final void j(KeyEvent keyEvent) {
        a70 a70Var;
        t60 t60Var;
        a70 a70Var2;
        t60 t60Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (t60Var = (a70Var = this.b).m) != null && t60Var.isShowing()) {
                    a70Var.v();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (t60Var2 = (a70Var2 = this.b).m) != null && t60Var2.isShowing()) {
                    a70Var2.v();
                    break;
                }
                break;
        }
    }
}
