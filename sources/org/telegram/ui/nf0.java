package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                if (!dg0Var.o0) {
                    try {
                        Window window = dg0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        dg0Var.o0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.i3(new nf0(dg0Var, this.c, 1), 100L);
                break;
            default:
                dg0 dg0Var2 = this.b;
                int[] iArr = dg0Var2.n0;
                org.telegram.messenger.g0.K3(this.c);
                org.telegram.ui.Components.dg dgVar = dg0Var2.V;
                if (dgVar != null) {
                    dgVar.getLocationOnScreen(iArr);
                    int i7 = iArr[0];
                    int width = dg0Var2.V.getWidth();
                    org.telegram.ui.Components.dg dgVar2 = dg0Var2.V;
                    dgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.camera.q.D(6.0f, width - dgVar2.m(), i7);
                    dg0Var2.W.setScaleX(dg0Var2.V.getScaleX());
                    dg0Var2.W.setScaleY(dg0Var2.V.getScaleY());
                    break;
                }
                break;
        }
    }
}
