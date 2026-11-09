package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b0(Object obj, float f10, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((g4) this.c).h0.M.c(true, this.b);
                break;
            case 1:
                org.telegram.ui.Components.ua uaVar = (org.telegram.ui.Components.ua) this.c;
                if (uaVar.a.getTranslationX() == this.b) {
                    uaVar.D.b();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) this.c;
                float f10 = this.b;
                cc1 cc1Var = w0Var.c;
                if (f10 > 0.0f) {
                    int i7 = cc1Var.x;
                    if (i7 < 2) {
                        cc1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = cc1Var.x;
                    if (i10 > 0) {
                        cc1Var.c(i10 - 1, true);
                    }
                }
                w0Var.b = false;
                break;
            case 3:
                ((HttpGetFileTask) this.c).lambda$doInBackground$0(this.b);
                break;
            default:
                org.telegram.utils.twidget.i1 i1Var = (org.telegram.utils.twidget.i1) this.c;
                float f11 = this.b;
                if (!i1Var.w) {
                    i1Var.a.removeCallbacks(i1Var.Q);
                    if (f11 <= 0.0f) {
                        if (f11 == 0.0f) {
                            i1Var.d();
                            break;
                        }
                    } else {
                        i1Var.a.postDelayed(i1Var.Q, (long) Math.ceil(f11));
                        break;
                    }
                }
                break;
        }
    }
}
