package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((p3) this.b).dismiss();
                break;
            case 1:
                gf.f.t((Activity) this.b, "https://fragment.com/");
                break;
            case 2:
                ((x4) this.b).dismiss();
                break;
            case 3:
                ((Runnable) this.b).run();
                break;
            case 4:
                a7 a7Var = (a7) this.b;
                if (!a7Var.y && a7Var.r && !a7Var.h.b()) {
                    a7Var.h.setProgress(0.0f);
                    a7Var.h.d();
                    break;
                }
                break;
            case 5:
                ((y8) this.b).b(!r3.y);
                break;
            case 6:
                ((org.telegram.ui.Cells.c2) this.b).c(!r3.b(), true);
                break;
            default:
                m9 m9Var = ((q9) this.b).c;
                m9Var.requestFocus();
                org.telegram.messenger.i0.J3(m9Var);
                break;
        }
    }
}
