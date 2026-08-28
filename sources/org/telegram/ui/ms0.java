package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ms0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ns0 b;

    public /* synthetic */ ms0(ns0 ns0Var, int i9) {
        this.a = i9;
        this.b = ns0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r2 != 7) goto L32;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        e5.b bVar;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b.b;
                st0 st0Var = photoViewer.A2;
                if (st0Var != null) {
                    org.telegram.ui.Components.k61 k61Var = photoViewer.B2;
                    if (st0Var.e != k61Var) {
                        st0Var.c = false;
                        st0Var.d = false;
                        if (st0Var.b) {
                            st0Var.a++;
                            st0Var.b = false;
                        }
                        st0Var.setImageResource(R.color.transparent);
                    }
                    if (k61Var != null) {
                        h3.k0 k0Var = k61Var.d;
                        if (k0Var != null) {
                            try {
                                k0Var.q0();
                                h3.t0 t0Var = k0Var.P;
                                if (t0Var != null && (bVar = t0Var.N) != null) {
                                    int i9 = bVar.c;
                                    if (i9 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long q10 = k61Var.q() - k61Var.o();
                        if (!st0Var.c && !st0Var.d && !st0Var.b && q10 < 5250.0f) {
                            Uri uri = k61Var.B;
                            int i10 = st0Var.a + 1;
                            st0Var.a = i10;
                            Utilities.globalQueue.postRunnable(new jh0(st0Var, uri, i10, 3));
                            st0Var.b = true;
                        }
                    }
                    st0Var.e = k61Var;
                    break;
                }
                break;
            case 1:
                st0.a(this.b.b.A2);
                break;
            default:
                st0.a(this.b.b.A2);
                break;
        }
    }
}
