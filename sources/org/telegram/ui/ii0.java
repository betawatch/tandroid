package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ii0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cj0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ ii0(cj0 cj0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = cj0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cj0 cj0Var = this.b;
                if (!cj0Var.p0) {
                    try {
                        Window window = cj0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        cj0Var.p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new ii0(cj0Var, this.c, 1), 100L);
                break;
            default:
                cj0 cj0Var2 = this.b;
                int[] iArr = cj0Var2.o0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.xg xgVar = cj0Var2.W;
                if (xgVar != null) {
                    xgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = cj0Var2.W.getWidth();
                    org.telegram.ui.Components.xg xgVar2 = cj0Var2.W;
                    xgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.em.D(6.0f, width - xgVar2.m(), i10);
                    cj0Var2.X.setScaleX(cj0Var2.W.getScaleX());
                    cj0Var2.X.setScaleY(cj0Var2.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
