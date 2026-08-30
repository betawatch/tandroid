package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class or implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr b;

    public /* synthetic */ or(sr srVar, int i10) {
        this.a = i10;
        this.b = srVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                sr srVar = this.b;
                if (srVar.b == null && (view = srVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        srVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = srVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || srVar.e) {
                        try {
                            srVar.performHapticFeedback(3, 2);
                            srVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        srVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        srVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (srVar.f) {
                            srVar.postDelayed(srVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                sr srVar2 = this.b;
                srVar2.n = false;
                srVar2.f = true;
                srVar2.h.run();
                break;
        }
    }
}
