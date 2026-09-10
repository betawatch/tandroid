package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ot0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pt0 b;

    public /* synthetic */ ot0(pt0 pt0Var, int i10) {
        this.a = i10;
        this.b = pt0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r2 != 7) goto L32;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        b2.j jVar;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b.b;
                vu0 vu0Var = photoViewer.E2;
                if (vu0Var != null) {
                    org.telegram.ui.Components.t71 t71Var = photoViewer.F2;
                    if (vu0Var.e != t71Var) {
                        vu0Var.c = false;
                        vu0Var.d = false;
                        if (vu0Var.b) {
                            vu0Var.a++;
                            vu0Var.b = false;
                        }
                        vu0Var.setImageResource(R.color.transparent);
                    }
                    if (t71Var != null) {
                        i2.e0 e0Var = t71Var.d;
                        if (e0Var != null) {
                            try {
                                e0Var.B1();
                                b2.s sVar = e0Var.Q;
                                if (sVar != null && (jVar = sVar.H) != null) {
                                    int i10 = jVar.c;
                                    if (i10 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long p5 = t71Var.p() - t71Var.n();
                        if (!vu0Var.c && !vu0Var.d && !vu0Var.b && p5 < 5250.0f) {
                            Uri uri = t71Var.F;
                            int i11 = vu0Var.a + 1;
                            vu0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new uu0(vu0Var, uri, i11, 0));
                            vu0Var.b = true;
                        }
                    }
                    vu0Var.e = t71Var;
                    break;
                }
                break;
            case 1:
                vu0.a(this.b.b.E2);
                break;
            default:
                vu0.a(this.b.b.E2);
                break;
        }
    }
}
