package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0(Object obj, float f10, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l4 l4Var = (l4) this.c;
                l4Var.d0.I.c(this.b, true);
                break;
            case 1:
                org.telegram.ui.Components.za zaVar = (org.telegram.ui.Components.za) this.c;
                if (zaVar.a.getTranslationX() == this.b) {
                    zaVar.y.b();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.c;
                float f10 = this.b;
                fh1 fh1Var = x0Var.c;
                if (f10 > 0.0f) {
                    int i9 = fh1Var.w;
                    if (i9 < 2) {
                        fh1Var.c(i9 + 1, true);
                    }
                } else {
                    int i10 = fh1Var.w;
                    if (i10 > 0) {
                        fh1Var.c(i10 - 1, true);
                    }
                }
                x0Var.b = false;
                break;
            case 3:
                ((o70) this.c).f.e.smoothScrollTo(0, (int) this.b);
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
