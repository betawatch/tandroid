package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs b;

    public /* synthetic */ cs(fs fsVar, int i10) {
        this.a = i10;
        this.b = fsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                fs fsVar = this.b;
                if (fsVar.b == null && (view = fsVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        fsVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = fsVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || fsVar.e) {
                        try {
                            fsVar.performHapticFeedback(3, 2);
                            fsVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        fsVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        fsVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (fsVar.f) {
                            fsVar.postDelayed(fsVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                fs fsVar2 = this.b;
                fsVar2.n = false;
                fsVar2.f = true;
                fsVar2.h.run();
                break;
        }
    }
}
