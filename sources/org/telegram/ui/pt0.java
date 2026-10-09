package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qt0 b;

    public /* synthetic */ pt0(qt0 qt0Var, int i10) {
        this.a = i10;
        this.b = qt0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r2 != 7) goto L31;
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
                    org.telegram.ui.Components.k81 k81Var = photoViewer.F2;
                    if (vu0Var.e != k81Var) {
                        vu0Var.c = false;
                        vu0Var.d = false;
                        if (vu0Var.b) {
                            vu0Var.a++;
                            vu0Var.b = false;
                        }
                        vu0Var.setImageResource(R.color.transparent);
                    }
                    if (k81Var != null) {
                        i2.f0 f0Var = k81Var.d;
                        if (f0Var != null) {
                            try {
                                f0Var.D1();
                                b2.s sVar = f0Var.Q;
                                if (sVar != null && (jVar = sVar.H) != null) {
                                    int i10 = jVar.c;
                                    if (i10 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long p5 = k81Var.p() - k81Var.n();
                        if (!vu0Var.c && !vu0Var.d && !vu0Var.b && p5 < 5250.0f) {
                            Uri uri = k81Var.F;
                            int i11 = vu0Var.a + 1;
                            vu0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new bi0(vu0Var, uri, i11, 3));
                            vu0Var.b = true;
                        }
                    }
                    vu0Var.e = k81Var;
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
