package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a0(Object obj, float f7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((h4) this.c).h0.M.c(true, this.b);
                break;
            case 1:
                org.telegram.ui.Components.oa oaVar = (org.telegram.ui.Components.oa) this.c;
                if (oaVar.a.getTranslationX() == this.b) {
                    oaVar.D.b();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.h0 h0Var = (org.telegram.ui.Components.voip.h0) this.c;
                float f7 = this.b;
                ud1 ud1Var = h0Var.c;
                if (f7 > 0.0f) {
                    int i10 = ud1Var.x;
                    if (i10 < 2) {
                        ud1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ud1Var.x;
                    if (i11 > 0) {
                        ud1Var.c(i11 - 1, true);
                    }
                }
                h0Var.b = false;
                break;
            case 3:
                ((HttpGetFileTask) this.c).lambda$doInBackground$0(this.b);
                break;
            default:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.c;
                float f10 = this.b;
                if (!k0Var.u) {
                    k0Var.a.removeCallbacks(k0Var.P);
                    if (f10 <= 0.0f) {
                        if (f10 == 0.0f) {
                            k0Var.b();
                            break;
                        }
                    } else {
                        k0Var.a.postDelayed(k0Var.P, (long) Math.ceil(f10));
                        break;
                    }
                }
                break;
        }
    }
}
