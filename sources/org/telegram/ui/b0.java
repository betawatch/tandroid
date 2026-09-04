package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                i4 i4Var = (i4) this.c;
                i4Var.h0.M.c(this.b, true);
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
                ni1 ni1Var = y0Var.c;
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
                y0Var.b = false;
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
