package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c0(Object obj, float f7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k4 k4Var = (k4) this.c;
                k4Var.h0.M.c(this.b, true);
                break;
            case 1:
                org.telegram.ui.Components.kb kbVar = (org.telegram.ui.Components.kb) this.c;
                if (kbVar.a.getTranslationX() == this.b) {
                    kbVar.y.b();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.c;
                float f7 = this.b;
                wi1 wi1Var = y0Var.c;
                if (f7 > 0.0f) {
                    int i10 = wi1Var.w;
                    if (i10 < 2) {
                        wi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = wi1Var.w;
                    if (i11 > 0) {
                        wi1Var.c(i11 - 1, true);
                    }
                }
                y0Var.b = false;
                break;
            case 3:
                ((n80) this.c).f.e.smoothScrollTo(0, (int) this.b);
                break;
            case 4:
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.c, this.b).commit();
                break;
            default:
                ((HttpGetFileTask) this.c).lambda$doInBackground$0(this.b);
                break;
        }
    }
}
