package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class fs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;

    public /* synthetic */ fs(is isVar, int i10) {
        this.a = i10;
        this.b = isVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                is isVar = this.b;
                if (isVar.b == null && (view = isVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        isVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = isVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || isVar.e) {
                        try {
                            isVar.performHapticFeedback(3, 2);
                            isVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        isVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        isVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (isVar.f) {
                            isVar.postDelayed(isVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                is isVar2 = this.b;
                isVar2.n = false;
                isVar2.f = true;
                isVar2.h.run();
                break;
        }
    }
}
