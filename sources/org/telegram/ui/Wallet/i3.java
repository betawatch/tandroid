package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((o3) this.b).dismiss();
                break;
            case 1:
                vf.c.v((Activity) this.b, "https://fragment.com/", false);
                break;
            case 2:
                ((v4) this.b).dismiss();
                break;
            case 3:
                ((Runnable) this.b).run();
                break;
            case 4:
                v6 v6Var = (v6) this.b;
                if (!v6Var.y && v6Var.r && !v6Var.h.b()) {
                    v6Var.h.setProgress(0.0f);
                    v6Var.h.d();
                    break;
                }
                break;
            case 5:
                ((s8) this.b).b(!r3.y);
                break;
            case 6:
                ((org.telegram.ui.Cells.c2) this.b).c(!r3.b(), true);
                break;
            default:
                h9 h9Var = ((l9) this.b).c;
                h9Var.requestFocus();
                org.telegram.messenger.g0.K3(h9Var);
                break;
        }
    }
}
