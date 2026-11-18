package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ pf0(fg0 fg0Var, EditText editText, int i7) {
        this.a = i7;
        this.b = fg0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fg0 fg0Var = this.b;
                if (!fg0Var.t0) {
                    try {
                        Window window = fg0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        fg0Var.t0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.h3(new pf0(fg0Var, this.c, 1), 100L);
                break;
            default:
                org.telegram.messenger.g0.I3(this.c);
                fg0 fg0Var2 = this.b;
                if (fg0Var2.W != null) {
                    fg0Var2.d(fg0Var2.r0);
                    fg0Var2.X.setScaleX(fg0Var2.W.getScaleX());
                    fg0Var2.X.setScaleY(fg0Var2.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
