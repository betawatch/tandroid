package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                org.telegram.ui.Components.ya yaVar = (org.telegram.ui.Components.ya) this.c;
                if (yaVar.a.getTranslationX() == this.b) {
                    yaVar.E.b();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.c;
                zb1 zb1Var = a1Var.c;
                if (this.b > 0.0f) {
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
                a1Var.b = false;
                break;
            default:
                ((HttpGetFileTask) this.c).lambda$doInBackground$0(this.b);
                break;
        }
    }
}
