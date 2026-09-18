package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;

    public /* synthetic */ rr(ur urVar, int i10) {
        this.a = i10;
        this.b = urVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                ur urVar = this.b;
                if (urVar.b == null && (view = urVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        urVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = urVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || urVar.e) {
                        try {
                            urVar.performHapticFeedback(3, 2);
                            urVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        urVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        urVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (urVar.f) {
                            urVar.postDelayed(urVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                ur urVar2 = this.b;
                urVar2.n = false;
                urVar2.f = true;
                urVar2.h.run();
                break;
        }
    }
}
