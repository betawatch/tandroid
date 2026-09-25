package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;

    public /* synthetic */ sr(vr vrVar, int i10) {
        this.a = i10;
        this.b = vrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                vr vrVar = this.b;
                if (vrVar.b == null && (view = vrVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        vrVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = vrVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || vrVar.e) {
                        try {
                            vrVar.performHapticFeedback(3, 2);
                            vrVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        vrVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        vrVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (vrVar.f) {
                            vrVar.postDelayed(vrVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                vr vrVar2 = this.b;
                vrVar2.n = false;
                vrVar2.f = true;
                vrVar2.h.run();
                break;
        }
    }
}
