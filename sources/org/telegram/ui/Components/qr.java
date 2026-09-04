package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr b;

    public /* synthetic */ qr(tr trVar, int i10) {
        this.a = i10;
        this.b = trVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                tr trVar = this.b;
                if (trVar.b == null && (view = trVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        trVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = trVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || trVar.e) {
                        try {
                            trVar.performHapticFeedback(3, 2);
                            trVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        trVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        trVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (trVar.f) {
                            trVar.postDelayed(trVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                tr trVar2 = this.b;
                trVar2.n = false;
                trVar2.f = true;
                trVar2.h.run();
                break;
        }
    }
}
