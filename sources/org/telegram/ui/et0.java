package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class et0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ft0 b;

    public /* synthetic */ et0(ft0 ft0Var, int i10) {
        this.a = i10;
        this.b = ft0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r2 != 7) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        b2.o oVar;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b.b;
                ju0 ju0Var = photoViewer.E2;
                if (ju0Var != null) {
                    org.telegram.ui.Components.t81 t81Var = photoViewer.F2;
                    if (ju0Var.e != t81Var) {
                        ju0Var.c = false;
                        ju0Var.d = false;
                        if (ju0Var.b) {
                            ju0Var.a++;
                            ju0Var.b = false;
                        }
                        ju0Var.setImageResource(R.color.transparent);
                    }
                    if (t81Var != null) {
                        i2.j0 j0Var = t81Var.d;
                        if (j0Var != null) {
                            try {
                                j0Var.F1();
                                b2.x xVar = j0Var.S;
                                if (xVar != null && (oVar = xVar.I) != null) {
                                    int i10 = oVar.c;
                                    if (i10 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long p10 = t81Var.p() - t81Var.n();
                        if (!ju0Var.c && !ju0Var.d && !ju0Var.b && p10 < 5250.0f) {
                            Uri uri = t81Var.F;
                            int i11 = ju0Var.a + 1;
                            ju0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new fx(ju0Var, uri, i11, 7));
                            ju0Var.b = true;
                        }
                    }
                    ju0Var.e = t81Var;
                    break;
                }
                break;
            case 1:
                ju0.a(this.b.b.E2);
                break;
            default:
                ju0.a(this.b.b.E2);
                break;
        }
    }
}
