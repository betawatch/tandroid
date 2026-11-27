// default package

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c67 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q67 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ c67(q67 q67Var, EditText editText, byte b) {
        this.a = b;
        this.b = q67Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        EditText editText = this.c;
        q67 q67Var = this.b;
        switch (b) {
            case 0:
                byte b2 = 1;
                if (!q67Var.t0) {
                    try {
                        Window window = q67Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        q67Var.t0 = true;
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
                hl.d3(new c67(q67Var, editText, b2), 100L);
                break;
            default:
                hl.E3(editText);
                if (q67Var.W != null) {
                    q67Var.b(q67Var.r0);
                    q67Var.X.setScaleX(q67Var.W.getScaleX());
                    q67Var.X.setScaleY(q67Var.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
