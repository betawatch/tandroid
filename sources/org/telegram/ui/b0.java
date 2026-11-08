package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                zb1 zb1Var = w0Var.c;
                if (f10 > 0.0f) {
                    int i7 = zb1Var.x;
                    if (i7 < 2) {
                        zb1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = zb1Var.x;
                    if (i10 > 0) {
                        zb1Var.c(i10 - 1, true);
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
