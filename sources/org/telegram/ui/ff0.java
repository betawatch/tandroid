package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vf0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ ff0(vf0 vf0Var, EditText editText, int i3) {
        this.a = i3;
        this.b = vf0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vf0 vf0Var = this.b;
                if (!vf0Var.p0) {
                    try {
                        Window window = vf0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        vf0Var.p0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.i3(new ff0(vf0Var, this.c, 1), 100L);
                break;
            default:
                vf0 vf0Var2 = this.b;
                int[] iArr = vf0Var2.o0;
                org.telegram.messenger.g0.K3(this.c);
                org.telegram.ui.Components.bg bgVar = vf0Var2.W;
                if (bgVar != null) {
                    bgVar.getLocationOnScreen(iArr);
                    int i3 = iArr[0];
                    int width = vf0Var2.W.getWidth();
                    org.telegram.ui.Components.bg bgVar2 = vf0Var2.W;
                    bgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.camera.q.D(6.0f, width - bgVar2.m(), i3);
                    vf0Var2.X.setScaleX(vf0Var2.W.getScaleX());
                    vf0Var2.X.setScaleY(vf0Var2.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
