package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                h4 h4Var = (h4) this.c;
                h4Var.h0.M.c(this.b, true);
                break;
            case 1:
                org.telegram.ui.Components.gb gbVar = (org.telegram.ui.Components.gb) this.c;
                if (gbVar.a.getTranslationX() == this.b) {
                    gbVar.y.b();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.c;
                float f7 = this.b;
                mi1 mi1Var = a1Var.c;
                if (f7 > 0.0f) {
                    int i10 = mi1Var.w;
                    if (i10 < 2) {
                        mi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = mi1Var.w;
                    if (i11 > 0) {
                        mi1Var.c(i11 - 1, true);
                    }
                }
                a1Var.b = false;
                break;
            case 3:
                ((l80) this.c).f.e.smoothScrollTo(0, (int) this.b);
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
