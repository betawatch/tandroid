package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;

    public /* synthetic */ hr(lr lrVar, int i10) {
        this.a = i10;
        this.b = lrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                lr lrVar = this.b;
                if (lrVar.b == null && (view = lrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        lrVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = lrVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || lrVar.e) {
                        try {
                            lrVar.performHapticFeedback(3, 2);
                            lrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        lrVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        lrVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (lrVar.f) {
                            lrVar.postDelayed(lrVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                lr lrVar2 = this.b;
                lrVar2.n = false;
                lrVar2.f = true;
                lrVar2.h.run();
                break;
        }
    }
}
