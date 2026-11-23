package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((x3) this.b).dismiss();
                break;
            case 1:
                vf.c.v((Activity) this.b, "https://fragment.com/", false);
                break;
            case 2:
                ((l5) this.b).dismiss();
                break;
            case 3:
                ((Runnable) this.b).run();
                break;
            case 4:
                n7 n7Var = (n7) this.b;
                if (!n7Var.y && n7Var.r && !n7Var.h.b()) {
                    n7Var.h.setProgress(0.0f);
                    n7Var.h.d();
                    break;
                }
                break;
            case 5:
                ((k9) this.b).b(!r3.E);
                break;
            case 6:
                ((org.telegram.ui.Cells.d2) this.b).c(!r3.b(), true);
                break;
            default:
                z9 z9Var = ((da) this.b).c;
                z9Var.requestFocus();
                org.telegram.messenger.g0.I3(z9Var);
                break;
        }
    }
}
