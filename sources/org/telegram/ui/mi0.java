package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gj0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ mi0(gj0 gj0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = gj0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gj0 gj0Var = this.b;
                if (!gj0Var.p0) {
                    try {
                        Window window = gj0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        gj0Var.p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new mi0(gj0Var, this.c, 1), 100L);
                break;
            default:
                gj0 gj0Var2 = this.b;
                int[] iArr = gj0Var2.o0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.wg wgVar = gj0Var2.W;
                if (wgVar != null) {
                    wgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = gj0Var2.W.getWidth();
                    org.telegram.ui.Components.wg wgVar2 = gj0Var2.W;
                    wgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.sk.D(6.0f, width - wgVar2.m(), i10);
                    gj0Var2.X.setScaleX(gj0Var2.W.getScaleX());
                    gj0Var2.X.setScaleY(gj0Var2.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
