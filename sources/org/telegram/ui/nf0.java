package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ nf0(dg0 dg0Var, EditText editText, int i7) {
        this.a = i7;
        this.b = dg0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dg0 dg0Var = this.b;
                if (!dg0Var.t0) {
                    try {
                        Window window = dg0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        dg0Var.t0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.h3(new nf0(dg0Var, this.c, 1), 100L);
                break;
            default:
                org.telegram.messenger.g0.I3(this.c);
                dg0 dg0Var2 = this.b;
                if (dg0Var2.W != null) {
                    dg0Var2.d(dg0Var2.r0);
                    dg0Var2.X.setScaleX(dg0Var2.W.getScaleX());
                    dg0Var2.X.setScaleY(dg0Var2.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
