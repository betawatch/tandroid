package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b0(Object obj, float f7, int i10) {
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
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.c;
                if (ibVar.a.getTranslationX() == this.b) {
                    ibVar.y.b();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.c;
                float f7 = this.b;
                hh1 hh1Var = y0Var.c;
                if (f7 > 0.0f) {
                    int i10 = hh1Var.w;
                    if (i10 < 2) {
                        hh1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = hh1Var.w;
                    if (i11 > 0) {
                        hh1Var.c(i11 - 1, true);
                    }
                }
                y0Var.b = false;
                break;
            case 3:
                ((u70) this.c).f.e.smoothScrollTo(0, (int) this.b);
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
