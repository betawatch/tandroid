package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                yb1 yb1Var = w0Var.c;
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
                w0Var.b = false;
                break;
            case 3:
                ((HttpGetFileTask) this.c).lambda$doInBackground$0(this.b);
                break;
            default:
                org.telegram.utils.twidget.h0 h0Var = (org.telegram.utils.twidget.h0) this.c;
                float f11 = this.b;
                if (!h0Var.u) {
                    h0Var.a.removeCallbacks(h0Var.O);
                    if (f11 <= 0.0f) {
                        if (f11 == 0.0f) {
                            h0Var.c();
                            break;
                        }
                    } else {
                        h0Var.a.postDelayed(h0Var.O, (long) Math.ceil(f11));
                        break;
                    }
                }
                break;
        }
    }
}
