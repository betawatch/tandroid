package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ as b;

    public /* synthetic */ xr(as asVar, int i10) {
        this.a = i10;
        this.b = asVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                as asVar = this.b;
                if (asVar.b == null && (view = asVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        asVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = asVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || asVar.e) {
                        try {
                            asVar.performHapticFeedback(3, 2);
                            asVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        asVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        asVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (asVar.f) {
                            asVar.postDelayed(asVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                as asVar2 = this.b;
                asVar2.n = false;
                asVar2.f = true;
                asVar2.h.run();
                break;
        }
    }
}
