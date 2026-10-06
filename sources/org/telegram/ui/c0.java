package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                i4 i4Var = (i4) this.c;
                i4Var.h0.M.c(this.b, true);
                break;
            case 1:
                org.telegram.ui.Components.jb jbVar = (org.telegram.ui.Components.jb) this.c;
                if (jbVar.a.getTranslationX() == this.b) {
                    jbVar.y.b();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.c;
                float f7 = this.b;
                di1 di1Var = a1Var.c;
                if (f7 > 0.0f) {
                    int i10 = di1Var.w;
                    if (i10 < 2) {
                        di1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = di1Var.w;
                    if (i11 > 0) {
                        di1Var.c(i11 - 1, true);
                    }
                }
                a1Var.b = false;
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
