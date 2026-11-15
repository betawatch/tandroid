package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ lf0(bg0 bg0Var, EditText editText, int i7) {
        this.a = i7;
        this.b = bg0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bg0 bg0Var = this.b;
                if (!bg0Var.t0) {
                    try {
                        Window window = bg0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        bg0Var.t0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.i3(new lf0(bg0Var, this.c, 1), 100L);
                break;
            default:
                org.telegram.messenger.g0.J3(this.c);
                bg0 bg0Var2 = this.b;
                if (bg0Var2.W != null) {
                    bg0Var2.d(bg0Var2.r0);
                    bg0Var2.X.setScaleX(bg0Var2.W.getScaleX());
                    bg0Var2.X.setScaleY(bg0Var2.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
