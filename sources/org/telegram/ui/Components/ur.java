package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xr b;

    public /* synthetic */ ur(xr xrVar, int i10) {
        this.a = i10;
        this.b = xrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                xr xrVar = this.b;
                if (xrVar.b == null && (view = xrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        xrVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = xrVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || xrVar.e) {
                        try {
                            xrVar.performHapticFeedback(3, 2);
                            xrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        xrVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        xrVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (xrVar.f) {
                            xrVar.postDelayed(xrVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                xr xrVar2 = this.b;
                xrVar2.n = false;
                xrVar2.f = true;
                xrVar2.h.run();
                break;
        }
    }
}
