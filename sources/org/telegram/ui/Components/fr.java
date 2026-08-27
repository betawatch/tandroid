package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir b;

    public /* synthetic */ fr(ir irVar, int i10) {
        this.a = i10;
        this.b = irVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                ir irVar = this.b;
                if (irVar.b == null && (view = irVar.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        irVar.b = (EditText) findFocus;
                    }
                }
                EditText editText = irVar.b;
                if (editText != null) {
                    if (editText.length() != 0 || irVar.e) {
                        try {
                            irVar.performHapticFeedback(3, 2);
                            irVar.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        irVar.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        irVar.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (irVar.f) {
                            irVar.postDelayed(irVar.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                ir irVar2 = this.b;
                irVar2.n = false;
                irVar2.f = true;
                irVar2.h.run();
                break;
        }
    }
}
