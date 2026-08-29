package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e0(Object obj, float f9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m4 m4Var = (m4) this.c;
                m4Var.d0.I.c(this.b, true);
                break;
            case 1:
                org.telegram.ui.Components.eb ebVar = (org.telegram.ui.Components.eb) this.c;
                if (ebVar.a.getTranslationX() == this.b) {
                    ebVar.y.b();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.c;
                float f9 = this.b;
                hh1 hh1Var = y0Var.c;
                if (f9 > 0.0f) {
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
                ((q70) this.c).f.e.smoothScrollTo(0, (int) this.b);
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
