package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ji0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ ji0(dj0 dj0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = dj0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dj0 dj0Var = this.b;
                if (!dj0Var.p0) {
                    try {
                        Window window = dj0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        dj0Var.p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new ji0(dj0Var, this.c, 1), 100L);
                break;
            default:
                dj0 dj0Var2 = this.b;
                int[] iArr = dj0Var2.o0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.tg tgVar = dj0Var2.W;
                if (tgVar != null) {
                    tgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = dj0Var2.W.getWidth();
                    org.telegram.ui.Components.tg tgVar2 = dj0Var2.W;
                    tgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.wl.D(6.0f, width - tgVar2.m(), i10);
                    dj0Var2.X.setScaleX(dj0Var2.W.getScaleX());
                    dj0Var2.X.setScaleY(dj0Var2.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
