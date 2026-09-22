package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bj0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ hi0(bj0 bj0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = bj0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bj0 bj0Var = this.b;
                if (!bj0Var.p0) {
                    try {
                        Window window = bj0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        bj0Var.p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new hi0(bj0Var, this.c, 1), 100L);
                break;
            default:
                bj0 bj0Var2 = this.b;
                int[] iArr = bj0Var2.o0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.tg tgVar = bj0Var2.W;
                if (tgVar != null) {
                    tgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = bj0Var2.W.getWidth();
                    org.telegram.ui.Components.tg tgVar2 = bj0Var2.W;
                    tgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.vl.D(6.0f, width - tgVar2.m(), i10);
                    bj0Var2.X.setScaleX(bj0Var2.W.getScaleX());
                    bj0Var2.X.setScaleY(bj0Var2.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
