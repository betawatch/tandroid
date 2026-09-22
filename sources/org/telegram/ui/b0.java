package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                ni1 ni1Var = a1Var.c;
                if (f7 > 0.0f) {
                    int i10 = ni1Var.w;
                    if (i10 < 2) {
                        ni1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ni1Var.w;
                    if (i11 > 0) {
                        ni1Var.c(i11 - 1, true);
                    }
                }
                a1Var.b = false;
                break;
            case 3:
                ((j80) this.c).f.e.smoothScrollTo(0, (int) this.b);
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
