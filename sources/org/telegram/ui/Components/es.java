package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class es implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;

    public /* synthetic */ es(hs hsVar, int i10) {
        this.a = i10;
        this.b = hsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                hs hsVar = this.b;
                if (hsVar.b == null && (view = hsVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        hsVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = hsVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || hsVar.e) {
                        try {
                            hsVar.performHapticFeedback(3, 2);
                            hsVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        hsVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        hsVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (hsVar.f) {
                            hsVar.postDelayed(hsVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                hs hsVar2 = this.b;
                hsVar2.n = false;
                hsVar2.f = true;
                hsVar2.h.run();
                break;
        }
    }
}
