package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                j4 j4Var = (j4) this.c;
                j4Var.h0.M.c(this.b, true);
                break;
            case 1:
                org.telegram.ui.Components.hb hbVar = (org.telegram.ui.Components.hb) this.c;
                if (hbVar.a.getTranslationX() == this.b) {
                    hbVar.y.b();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.z0 z0Var = (org.telegram.ui.Components.voip.z0) this.c;
                float f7 = this.b;
                si1 si1Var = z0Var.c;
                if (f7 > 0.0f) {
                    int i10 = si1Var.w;
                    if (i10 < 2) {
                        si1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = si1Var.w;
                    if (i11 > 0) {
                        si1Var.c(i11 - 1, true);
                    }
                }
                z0Var.b = false;
                break;
            case 3:
                ((i80) this.c).f.e.smoothScrollTo(0, (int) this.b);
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
