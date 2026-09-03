package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e0(Object obj, float f10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n4 n4Var = (n4) this.c;
                n4Var.e0.J.c(this.b, true);
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
                bi1 bi1Var = x0Var.c;
                if (f10 > 0.0f) {
                    int i10 = bi1Var.w;
                    if (i10 < 2) {
                        bi1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = bi1Var.w;
                    if (i11 > 0) {
                        bi1Var.c(i11 - 1, true);
                    }
                }
                x0Var.b = false;
                break;
            case 3:
                ((c80) this.c).f.e.smoothScrollTo(0, (int) this.b);
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
