package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                ((j4) this.c).h0.M.c(this.b, true);
                break;
            case 1:
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) this.c;
                if (ibVar.a.getTranslationX() == this.b) {
                    ibVar.y.b();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.yb1 yb1Var = (org.telegram.ui.Components.yb1) this.c;
                float f7 = this.b;
                if (!yb1Var.s) {
                    yb1Var.a.removeCallbacks(yb1Var.O);
                    if (f7 <= 0.0f) {
                        if (f7 == 0.0f) {
                            yb1Var.c();
                            break;
                        }
                    } else {
                        yb1Var.a.postDelayed(yb1Var.O, (long) Math.ceil(f7));
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.c;
                float f10 = this.b;
                ih1 ih1Var = y0Var.c;
                if (f10 > 0.0f) {
                    int i10 = ih1Var.w;
                    if (i10 < 2) {
                        ih1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = ih1Var.w;
                    if (i11 > 0) {
                        ih1Var.c(i11 - 1, true);
                    }
                }
                y0Var.b = false;
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
