package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qt0 b;

    public /* synthetic */ pt0(qt0 qt0Var, int i10) {
        this.a = i10;
        this.b = qt0Var;
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
                uu0 uu0Var = photoViewer.E2;
                if (uu0Var != null) {
                    org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
                    if (uu0Var.e != g71Var) {
                        uu0Var.c = false;
                        uu0Var.d = false;
                        if (uu0Var.b) {
                            uu0Var.a++;
                            uu0Var.b = false;
                        }
                        uu0Var.setImageResource(R.color.transparent);
                    }
                    if (g71Var != null) {
                        i2.e0 e0Var = g71Var.d;
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
                        long p5 = g71Var.p() - g71Var.n();
                        if (!uu0Var.c && !uu0Var.d && !uu0Var.b && p5 < 5250.0f) {
                            Uri uri = g71Var.F;
                            int i11 = uu0Var.a + 1;
                            uu0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new em0(uu0Var, uri, i11, 2));
                            uu0Var.b = true;
                        }
                    }
                    uu0Var.e = g71Var;
                    break;
                }
                break;
            case 1:
                uu0.a(this.b.b.E2);
                break;
            default:
                uu0.a(this.b.b.E2);
                break;
        }
    }
}
