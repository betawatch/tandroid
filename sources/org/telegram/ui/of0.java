package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class of0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ of0(eg0 eg0Var, EditText editText, int i7) {
        this.a = i7;
        this.b = eg0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eg0 eg0Var = this.b;
                if (!eg0Var.t0) {
                    try {
                        Window window = eg0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        eg0Var.t0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.h3(new of0(eg0Var, this.c, 1), 100L);
                break;
            default:
                org.telegram.messenger.g0.I3(this.c);
                eg0 eg0Var2 = this.b;
                if (eg0Var2.W != null) {
                    eg0Var2.d(eg0Var2.r0);
                    eg0Var2.X.setScaleX(eg0Var2.W.getScaleX());
                    eg0Var2.X.setScaleY(eg0Var2.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
