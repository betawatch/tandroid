package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ns0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ os0 b;

    public /* synthetic */ ns0(os0 os0Var, int i10) {
        this.a = i10;
        this.b = os0Var;
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
                tt0 tt0Var = photoViewer.A2;
                if (tt0Var != null) {
                    org.telegram.ui.Components.m61 m61Var = photoViewer.B2;
                    if (tt0Var.e != m61Var) {
                        tt0Var.c = false;
                        tt0Var.d = false;
                        if (tt0Var.b) {
                            tt0Var.a++;
                            tt0Var.b = false;
                        }
                        tt0Var.setImageResource(R.color.transparent);
                    }
                    if (m61Var != null) {
                        h3.k0 k0Var = m61Var.d;
                        if (k0Var != null) {
                            try {
                                k0Var.q0();
                                h3.t0 t0Var = k0Var.P;
                                if (t0Var != null && (bVar = t0Var.N) != null) {
                                    int i10 = bVar.c;
                                    if (i10 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long q6 = m61Var.q() - m61Var.o();
                        if (!tt0Var.c && !tt0Var.d && !tt0Var.b && q6 < 5250.0f) {
                            Uri uri = m61Var.B;
                            int i11 = tt0Var.a + 1;
                            tt0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new ol0(tt0Var, uri, i11, 2));
                            tt0Var.b = true;
                        }
                    }
                    tt0Var.e = m61Var;
                    break;
                }
                break;
            case 1:
                tt0.a(this.b.b.A2);
                break;
            default:
                tt0.a(this.b.b.A2);
                break;
        }
    }
}
