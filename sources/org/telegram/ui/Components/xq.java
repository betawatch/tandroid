package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ar b;

    public /* synthetic */ xq(ar arVar, int i7) {
        this.a = i7;
        this.b = arVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                ar arVar = this.b;
                if (arVar.b == null && (view = arVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        arVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = arVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || arVar.e) {
                        try {
                            arVar.performHapticFeedback(3, 2);
                            arVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        arVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        arVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (arVar.f) {
                            arVar.postDelayed(arVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                ar arVar2 = this.b;
                arVar2.n = false;
                arVar2.f = true;
                arVar2.h.run();
                break;
        }
    }
}
