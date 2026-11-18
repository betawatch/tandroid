package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr b;

    public /* synthetic */ mr(pr prVar, int i7) {
        this.a = i7;
        this.b = prVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                pr prVar = this.b;
                if (prVar.b == null && (view = prVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        prVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = prVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || prVar.e) {
                        try {
                            prVar.performHapticFeedback(3, 2);
                            prVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        prVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        prVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (prVar.f) {
                            prVar.postDelayed(prVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                pr prVar2 = this.b;
                prVar2.n = false;
                prVar2.f = true;
                prVar2.h.run();
                break;
        }
    }
}
