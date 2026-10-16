package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                vi1 vi1Var = y0Var.c;
                if (f7 > 0.0f) {
                    int i10 = vi1Var.w;
                    if (i10 < 2) {
                        vi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = vi1Var.w;
                    if (i11 > 0) {
                        vi1Var.c(i11 - 1, true);
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
