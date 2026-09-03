package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr b;

    public /* synthetic */ nr(rr rrVar, int i10) {
        this.a = i10;
        this.b = rrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                rr rrVar = this.b;
                if (rrVar.b == null && (view = rrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        rrVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = rrVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || rrVar.e) {
                        try {
                            rrVar.performHapticFeedback(3, 2);
                            rrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        rrVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        rrVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (rrVar.f) {
                            rrVar.postDelayed(rrVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                rr rrVar2 = this.b;
                rrVar2.n = false;
                rrVar2.f = true;
                rrVar2.h.run();
                break;
        }
    }
}
