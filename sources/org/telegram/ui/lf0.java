package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                if (!bg0Var.o0) {
                    try {
                        Window window = bg0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        bg0Var.o0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.i3(new lf0(bg0Var, this.c, 1), 100L);
                break;
            default:
                bg0 bg0Var2 = this.b;
                int[] iArr = bg0Var2.n0;
                org.telegram.messenger.g0.K3(this.c);
                org.telegram.ui.Components.dg dgVar = bg0Var2.V;
                if (dgVar != null) {
                    dgVar.getLocationOnScreen(iArr);
                    int i7 = iArr[0];
                    int width = bg0Var2.V.getWidth();
                    org.telegram.ui.Components.dg dgVar2 = bg0Var2.V;
                    dgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.camera.q.D(6.0f, width - dgVar2.m(), i7);
                    bg0Var2.W.setScaleX(bg0Var2.V.getScaleX());
                    bg0Var2.W.setScaleY(bg0Var2.V.getScaleY());
                    break;
                }
                break;
        }
    }
}
