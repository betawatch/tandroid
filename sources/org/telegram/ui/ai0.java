package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ ai0(ui0 ui0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = ui0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ui0 ui0Var = this.b;
                if (!ui0Var.m0) {
                    try {
                        Window window = ui0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        ui0Var.m0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new ai0(ui0Var, this.c, 1), 100L);
                break;
            default:
                ui0 ui0Var2 = this.b;
                int[] iArr = ui0Var2.l0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.lg lgVar = ui0Var2.T;
                if (lgVar != null) {
                    lgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = ui0Var2.T.getWidth();
                    org.telegram.ui.Components.lg lgVar2 = ui0Var2.T;
                    lgVar2.getHeight();
                    iArr[0] = b.C(6.0f, width - lgVar2.m(), i10);
                    ui0Var2.U.setScaleX(ui0Var2.T.getScaleX());
                    ui0Var2.U.setScaleY(ui0Var2.T.getScaleY());
                    break;
                }
                break;
        }
    }
}
