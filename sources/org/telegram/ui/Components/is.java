package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class is implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ls b;

    public /* synthetic */ is(ls lsVar, int i10) {
        this.a = i10;
        this.b = lsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                ls lsVar = this.b;
                if (lsVar.b == null && (view = lsVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        lsVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = lsVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || lsVar.e) {
                        try {
                            lsVar.performHapticFeedback(3, 2);
                            lsVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        lsVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        lsVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (lsVar.f) {
                            lsVar.postDelayed(lsVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                ls lsVar2 = this.b;
                lsVar2.n = false;
                lsVar2.f = true;
                lsVar2.h.run();
                break;
        }
    }
}
