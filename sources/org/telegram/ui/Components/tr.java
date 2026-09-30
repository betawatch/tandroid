package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wr b;

    public /* synthetic */ tr(wr wrVar, int i10) {
        this.a = i10;
        this.b = wrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                wr wrVar = this.b;
                if (wrVar.b == null && (view = wrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        wrVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = wrVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || wrVar.e) {
                        try {
                            wrVar.performHapticFeedback(3, 2);
                            wrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        wrVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        wrVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (wrVar.f) {
                            wrVar.postDelayed(wrVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                wr wrVar2 = this.b;
                wrVar2.n = false;
                wrVar2.f = true;
                wrVar2.h.run();
                break;
        }
    }
}
