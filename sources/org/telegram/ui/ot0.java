package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                tu0 tu0Var = photoViewer.E2;
                if (tu0Var != null) {
                    org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
                    if (tu0Var.e != g71Var) {
                        tu0Var.c = false;
                        tu0Var.d = false;
                        if (tu0Var.b) {
                            tu0Var.a++;
                            tu0Var.b = false;
                        }
                        tu0Var.setImageResource(R.color.transparent);
                    }
                    if (g71Var != null) {
                        i2.f0 f0Var = g71Var.d;
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
                        long p5 = g71Var.p() - g71Var.n();
                        if (!tu0Var.c && !tu0Var.d && !tu0Var.b && p5 < 5250.0f) {
                            Uri uri = g71Var.F;
                            int i11 = tu0Var.a + 1;
                            tu0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new ai0(tu0Var, uri, i11, 3));
                            tu0Var.b = true;
                        }
                    }
                    tu0Var.e = g71Var;
                    break;
                }
                break;
            case 1:
                tu0.a(this.b.b.E2);
                break;
            default:
                tu0.a(this.b.b.E2);
                break;
        }
    }
}
