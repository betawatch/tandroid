package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class fi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zi0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ fi0(zi0 zi0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = zi0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zi0 zi0Var = this.b;
                if (!zi0Var.p0) {
                    try {
                        Window window = zi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        zi0Var.p0 = true;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                AndroidUtilities.runOnUIThread(new fi0(zi0Var, this.c, 1), 100L);
                break;
            default:
                zi0 zi0Var2 = this.b;
                int[] iArr = zi0Var2.o0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.wg wgVar = zi0Var2.W;
                if (wgVar != null) {
                    wgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = zi0Var2.W.getWidth();
                    org.telegram.ui.Components.wg wgVar2 = zi0Var2.W;
                    wgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.bi.D(6.0f, width - wgVar2.m(), i10);
                    zi0Var2.X.setScaleX(zi0Var2.W.getScaleX());
                    zi0Var2.X.setScaleY(zi0Var2.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
