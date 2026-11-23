package org.telegram.ui;

import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                org.telegram.ui.Components.za zaVar = (org.telegram.ui.Components.za) this.c;
                if (zaVar.a.getTranslationX() == this.b) {
                    zaVar.E.b();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.z0 z0Var = (org.telegram.ui.Components.voip.z0) this.c;
                bc1 bc1Var = z0Var.c;
                if (this.b > 0.0f) {
                    int i7 = bc1Var.x;
                    if (i7 < 2) {
                        bc1Var.c(i7 + 1, true);
                    }
                } else {
                    int i10 = bc1Var.x;
                    if (i10 > 0) {
                        bc1Var.c(i10 - 1, true);
                    }
                }
                z0Var.b = false;
                break;
            default:
                ((HttpGetFileTask) this.c).lambda$doInBackground$0(this.b);
                break;
        }
    }
}
