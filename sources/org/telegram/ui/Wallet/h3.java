package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class h3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h3(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((n3) this.b).dismiss();
                break;
            case 1:
                sf.c.v((Activity) this.b, "https://fragment.com/", false);
                break;
            case 2:
                ((u4) this.b).dismiss();
                break;
            case 3:
                ((Runnable) this.b).run();
                break;
            case 4:
                u6 u6Var = (u6) this.b;
                if (!u6Var.y && u6Var.r && !u6Var.h.b()) {
                    u6Var.h.setProgress(0.0f);
                    u6Var.h.d();
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
