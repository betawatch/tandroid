package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c0(Object obj, float f10, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((i4) this.c).i0.N.c(true, this.b);
                break;
            case 1:
                org.telegram.ui.Components.ta taVar = (org.telegram.ui.Components.ta) this.c;
                if (taVar.a.getTranslationX() == this.b) {
                    taVar.E.b();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.i0 i0Var = (org.telegram.ui.Components.voip.i0) this.c;
                float f10 = this.b;
                sb1 sb1Var = i0Var.c;
                if (f10 > 0.0f) {
                    int i3 = sb1Var.x;
                    if (i3 < 2) {
                        sb1Var.c(i3 + 1, true);
                    }
                } else {
                    int i10 = sb1Var.x;
                    if (i10 > 0) {
                        sb1Var.c(i10 - 1, true);
                    }
                }
                i0Var.b = false;
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
                            h0Var.b();
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
