package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((p3) this.b).dismiss();
                break;
            case 1:
                vf.c.v((Activity) this.b, "https://fragment.com/", false);
                break;
            case 2:
                ((x4) this.b).dismiss();
                break;
            case 3:
                ((Runnable) this.b).run();
                break;
            case 4:
                x6 x6Var = (x6) this.b;
                if (!x6Var.y && x6Var.r && !x6Var.h.b()) {
                    x6Var.h.setProgress(0.0f);
                    x6Var.h.d();
                    break;
                }
                break;
            case 5:
                ((u8) this.b).b(!r3.y);
                break;
            case 6:
                ((org.telegram.ui.Cells.c2) this.b).c(!r3.b(), true);
                break;
            default:
                j9 j9Var = ((n9) this.b).c;
                j9Var.requestFocus();
                org.telegram.messenger.g0.K3(j9Var);
                break;
        }
    }
}
