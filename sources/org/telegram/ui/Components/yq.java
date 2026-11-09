package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ br b;

    public /* synthetic */ yq(br brVar, int i7) {
        this.a = i7;
        this.b = brVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                br brVar = this.b;
                if (brVar.b == null && (view = brVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        brVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = brVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || brVar.e) {
                        try {
                            brVar.performHapticFeedback(3, 2);
                            brVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        brVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        brVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (brVar.f) {
                            brVar.postDelayed(brVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                br brVar2 = this.b;
                brVar2.n = false;
                brVar2.f = true;
                brVar2.h.run();
                break;
        }
    }
}
