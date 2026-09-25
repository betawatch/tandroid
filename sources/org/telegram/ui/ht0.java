package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ht0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ it0 b;

    public /* synthetic */ ht0(it0 it0Var, int i10) {
        this.a = i10;
        this.b = it0Var;
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
                mu0 mu0Var = photoViewer.E2;
                if (mu0Var != null) {
                    org.telegram.ui.Components.s71 s71Var = photoViewer.F2;
                    if (mu0Var.e != s71Var) {
                        mu0Var.c = false;
                        mu0Var.d = false;
                        if (mu0Var.b) {
                            mu0Var.a++;
                            mu0Var.b = false;
                        }
                        mu0Var.setImageResource(R.color.transparent);
                    }
                    if (s71Var != null) {
                        i2.f0 f0Var = s71Var.d;
                        if (f0Var != null) {
                            try {
                                f0Var.B1();
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
                        long p5 = s71Var.p() - s71Var.n();
                        if (!mu0Var.c && !mu0Var.d && !mu0Var.b && p5 < 5250.0f) {
                            Uri uri = s71Var.F;
                            int i11 = mu0Var.a + 1;
                            mu0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new wl0(mu0Var, uri, i11, 2));
                            mu0Var.b = true;
                        }
                    }
                    mu0Var.e = s71Var;
                    break;
                }
                break;
            case 1:
                mu0.a(this.b.b.E2);
                break;
            default:
                mu0.a(this.b.b.E2);
                break;
        }
    }
}
