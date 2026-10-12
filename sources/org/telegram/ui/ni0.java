package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ni0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hj0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ ni0(hj0 hj0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = hj0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hj0 hj0Var = this.b;
                if (!hj0Var.p0) {
                    try {
                        Window window = hj0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        hj0Var.p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new ni0(hj0Var, this.c, 1), 100L);
                break;
            default:
                hj0 hj0Var2 = this.b;
                int[] iArr = hj0Var2.o0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.wg wgVar = hj0Var2.W;
                if (wgVar != null) {
                    wgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = hj0Var2.W.getWidth();
                    org.telegram.ui.Components.wg wgVar2 = hj0Var2.W;
                    wgVar2.getHeight();
                    iArr[0] = org.telegram.ui.Cells.d0.b(6.0f, width - wgVar2.m(), i10);
                    hj0Var2.X.setScaleX(hj0Var2.W.getScaleX());
                    hj0Var2.X.setScaleY(hj0Var2.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
