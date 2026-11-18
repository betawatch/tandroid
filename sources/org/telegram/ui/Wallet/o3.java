package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((w3) this.b).dismiss();
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
                m7 m7Var = (m7) this.b;
                if (!m7Var.y && m7Var.r && !m7Var.h.b()) {
                    m7Var.h.setProgress(0.0f);
                    m7Var.h.d();
                    break;
                }
                break;
            case 5:
                ((j9) this.b).b(!r3.E);
                break;
            case 6:
                ((org.telegram.ui.Cells.c2) this.b).c(!r3.b(), true);
                break;
            default:
                y9 y9Var = ((ca) this.b).c;
                y9Var.requestFocus();
                org.telegram.messenger.g0.I3(y9Var);
                break;
        }
    }
}
