package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ci0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ ci0(wi0 wi0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = wi0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wi0 wi0Var = this.b;
                if (!wi0Var.p0) {
                    try {
                        Window window = wi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        wi0Var.p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new ci0(wi0Var, this.c, 1), 100L);
                break;
            default:
                wi0 wi0Var2 = this.b;
                int[] iArr = wi0Var2.o0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.ug ugVar = wi0Var2.W;
                if (ugVar != null) {
                    ugVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = wi0Var2.W.getWidth();
                    org.telegram.ui.Components.ug ugVar2 = wi0Var2.W;
                    ugVar2.getHeight();
                    iArr[0] = org.telegram.messenger.ul.D(6.0f, width - ugVar2.m(), i10);
                    wi0Var2.X.setScaleX(wi0Var2.W.getScaleX());
                    wi0Var2.X.setScaleY(wi0Var2.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
