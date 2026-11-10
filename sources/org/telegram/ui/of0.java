package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                if (!eg0Var.o0) {
                    try {
                        Window window = eg0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        eg0Var.o0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.i3(new of0(eg0Var, this.c, 1), 100L);
                break;
            default:
                eg0 eg0Var2 = this.b;
                int[] iArr = eg0Var2.n0;
                org.telegram.messenger.g0.K3(this.c);
                org.telegram.ui.Components.cg cgVar = eg0Var2.V;
                if (cgVar != null) {
                    cgVar.getLocationOnScreen(iArr);
                    int i7 = iArr[0];
                    int width = eg0Var2.V.getWidth();
                    org.telegram.ui.Components.cg cgVar2 = eg0Var2.V;
                    cgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.camera.q.D(6.0f, width - cgVar2.m(), i7);
                    eg0Var2.W.setScaleX(eg0Var2.V.getScaleX());
                    eg0Var2.W.setScaleY(eg0Var2.V.getScaleY());
                    break;
                }
                break;
        }
    }
}
