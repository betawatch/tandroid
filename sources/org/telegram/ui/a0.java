package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a0(Object obj, float f10, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((g4) this.c).i0.N.c(true, this.b);
                break;
            case 1:
                org.telegram.ui.Components.qa qaVar = (org.telegram.ui.Components.qa) this.c;
                if (qaVar.a.getTranslationX() == this.b) {
                    qaVar.E.b();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.c;
                float f10 = this.b;
                yb1 yb1Var = a1Var.c;
                if (f10 > 0.0f) {
                    int i7 = yb1Var.x;
                    if (i7 < 2) {
                        yb1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = yb1Var.x;
                    if (i10 > 0) {
                        yb1Var.c(i10 - 1, true);
                    }
                }
                a1Var.b = false;
                break;
            case 3:
                ((HttpGetFileTask) this.c).lambda$doInBackground$0(this.b);
                break;
            default:
                org.telegram.utils.twidget.l1 l1Var = (org.telegram.utils.twidget.l1) this.c;
                float f11 = this.b;
                if (!l1Var.w) {
                    l1Var.a.removeCallbacks(l1Var.Q);
                    if (f11 <= 0.0f) {
                        if (f11 == 0.0f) {
                            l1Var.d();
                            break;
                        }
                    } else {
                        l1Var.a.postDelayed(l1Var.Q, (long) Math.ceil(f11));
                        break;
                    }
                }
                break;
        }
    }
}
