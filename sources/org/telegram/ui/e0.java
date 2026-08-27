package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                m4 m4Var = (m4) this.c;
                m4Var.d0.I.c(this.b, true);
                break;
            case 1:
                org.telegram.ui.Components.xa xaVar = (org.telegram.ui.Components.xa) this.c;
                if (xaVar.a.getTranslationX() == this.b) {
                    xaVar.y.b();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.c;
                float f10 = this.b;
                eh1 eh1Var = x0Var.c;
                if (f10 > 0.0f) {
                    int i10 = eh1Var.w;
                    if (i10 < 2) {
                        eh1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = eh1Var.w;
                    if (i11 > 0) {
                        eh1Var.c(i11 - 1, true);
                    }
                }
                x0Var.b = false;
                break;
            case 3:
                ((r70) this.c).f.e.smoothScrollTo(0, (int) this.b);
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
