package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ms0 b;

    public /* synthetic */ ls0(ms0 ms0Var, int i10) {
        this.a = i10;
        this.b = ms0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r2 != 7) goto L32;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        g5.b bVar;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b.b;
                qt0 qt0Var = photoViewer.A2;
                if (qt0Var != null) {
                    org.telegram.ui.Components.x61 x61Var = photoViewer.B2;
                    if (qt0Var.e != x61Var) {
                        qt0Var.c = false;
                        qt0Var.d = false;
                        if (qt0Var.b) {
                            qt0Var.a++;
                            qt0Var.b = false;
                        }
                        qt0Var.setImageResource(R.color.transparent);
                    }
                    if (x61Var != null) {
                        j3.k0 k0Var = x61Var.d;
                        if (k0Var != null) {
                            try {
                                k0Var.q0();
                                j3.t0 t0Var = k0Var.P;
                                if (t0Var != null && (bVar = t0Var.N) != null) {
                                    int i10 = bVar.c;
                                    if (i10 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long q6 = x61Var.q() - x61Var.o();
                        if (!qt0Var.c && !qt0Var.d && !qt0Var.b && q6 < 5250.0f) {
                            Uri uri = x61Var.B;
                            int i11 = qt0Var.a + 1;
                            qt0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new ll0(qt0Var, uri, i11, 2));
                            qt0Var.b = true;
                        }
                    }
                    qt0Var.e = x61Var;
                    break;
                }
                break;
            case 1:
                qt0.a(this.b.b.A2);
                break;
            default:
                qt0.a(this.b.b.A2);
                break;
        }
    }
}
