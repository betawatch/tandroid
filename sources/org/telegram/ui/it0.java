package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class it0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jt0 b;

    public /* synthetic */ it0(jt0 jt0Var, int i10) {
        this.a = i10;
        this.b = jt0Var;
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
                nu0 nu0Var = photoViewer.E2;
                if (nu0Var != null) {
                    org.telegram.ui.Components.f71 f71Var = photoViewer.F2;
                    if (nu0Var.e != f71Var) {
                        nu0Var.c = false;
                        nu0Var.d = false;
                        if (nu0Var.b) {
                            nu0Var.a++;
                            nu0Var.b = false;
                        }
                        nu0Var.setImageResource(R.color.transparent);
                    }
                    if (f71Var != null) {
                        i2.f0 f0Var = f71Var.d;
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
                        long p5 = f71Var.p() - f71Var.n();
                        if (!nu0Var.c && !nu0Var.d && !nu0Var.b && p5 < 5250.0f) {
                            Uri uri = f71Var.F;
                            int i11 = nu0Var.a + 1;
                            nu0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new yl0(nu0Var, uri, i11, 2));
                            nu0Var.b = true;
                        }
                    }
                    nu0Var.e = f71Var;
                    break;
                }
                break;
            case 1:
                nu0.a(this.b.b.E2);
                break;
            default:
                nu0.a(this.b.b.E2);
                break;
        }
    }
}
