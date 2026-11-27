// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h53 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k53 b;

    public /* synthetic */ h53(k53 k53Var, byte b) {
        this.a = b;
        this.b = k53Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        byte b = this.a;
        k53 k53Var = this.b;
        switch (b) {
            case 0:
                if (k53Var.b == null && (view = k53Var.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        k53Var.b = (EditText) findFocus;
                    }
                }
                EditText editText = k53Var.b;
                if (editText != null) {
                    if (editText.length() != 0 || k53Var.e) {
                        try {
                            k53Var.performHapticFeedback(3, 2);
                            k53Var.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        k53Var.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        k53Var.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (k53Var.f) {
                            k53Var.postDelayed(k53Var.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                k53Var.n = false;
                k53Var.f = true;
                k53Var.h.run();
                break;
        }
    }
}
