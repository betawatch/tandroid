// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class a63 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d63 b;

    public /* synthetic */ a63(d63 d63Var, byte b) {
        this.a = b;
        this.b = d63Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        byte b = this.a;
        d63 d63Var = this.b;
        switch (b) {
            case 0:
                if (d63Var.b == null && (view = d63Var.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        d63Var.b = (EditText) findFocus;
                    }
                }
                EditText editText = d63Var.b;
                if (editText != null) {
                    if (editText.length() != 0 || d63Var.e) {
                        try {
                            d63Var.performHapticFeedback(3, 2);
                            d63Var.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        d63Var.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        d63Var.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (d63Var.f) {
                            d63Var.postDelayed(d63Var.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                d63Var.n = false;
                d63Var.f = true;
                d63Var.h.run();
                break;
        }
    }
}
