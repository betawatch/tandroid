package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kr b;

    public /* synthetic */ hr(kr krVar, int i9) {
        this.a = i9;
        this.b = krVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                kr krVar = this.b;
                if (krVar.b == null && (view = krVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        krVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = krVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || krVar.e) {
                        try {
                            krVar.performHapticFeedback(3, 2);
                            krVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        krVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        krVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (krVar.f) {
                            krVar.postDelayed(krVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                kr krVar2 = this.b;
                krVar2.n = false;
                krVar2.f = true;
                krVar2.h.run();
                break;
        }
    }
}
