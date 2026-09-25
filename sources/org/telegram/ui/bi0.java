package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ bi0(vi0 vi0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = vi0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vi0 vi0Var = this.b;
                if (!vi0Var.p0) {
                    try {
                        Window window = vi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        vi0Var.p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new bi0(vi0Var, this.c, 1), 100L);
                break;
            default:
                vi0 vi0Var2 = this.b;
                int[] iArr = vi0Var2.o0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.vg vgVar = vi0Var2.W;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = vi0Var2.W.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = vi0Var2.W;
                    vgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.ok.D(6.0f, width - vgVar2.m(), i10);
                    vi0Var2.X.setScaleX(vi0Var2.W.getScaleX());
                    vi0Var2.X.setScaleY(vi0Var2.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
