package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ or b;

    public /* synthetic */ kr(or orVar, int i10) {
        this.a = i10;
        this.b = orVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                or orVar = this.b;
                if (orVar.b == null && (view = orVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        orVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = orVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || orVar.e) {
                        try {
                            orVar.performHapticFeedback(3, 2);
                            orVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        orVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        orVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (orVar.f) {
                            orVar.postDelayed(orVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                or orVar2 = this.b;
                orVar2.n = false;
                orVar2.f = true;
                orVar2.h.run();
                break;
        }
    }
}
