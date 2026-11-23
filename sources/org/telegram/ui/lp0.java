package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca.i b;

    public /* synthetic */ lp0(ca.i iVar, int i7) {
        this.a = i7;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        if (r2 != 7) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        e2.m mVar;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b.c;
                pq0 pq0Var = photoViewer.F2;
                if (pq0Var != null) {
                    org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
                    if (pq0Var.e != h61Var) {
                        pq0Var.c = false;
                        pq0Var.d = false;
                        if (pq0Var.b) {
                            pq0Var.a++;
                            pq0Var.b = false;
                        }
                        pq0Var.setImageResource(R.color.transparent);
                    }
                    if (h61Var != null) {
                        l2.g0 g0Var = h61Var.d;
                        if (g0Var != null) {
                            try {
                                g0Var.F1();
                                e2.u uVar = g0Var.S;
                                if (uVar != null && (mVar = uVar.I) != null) {
                                    int i7 = mVar.c;
                                    if (i7 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long U = h61Var.U() - h61Var.S();
                        if (!pq0Var.c && !pq0Var.d && !pq0Var.b && U < 5250.0f) {
                            Uri uri = h61Var.G;
                            int i10 = pq0Var.a + 1;
                            pq0Var.a = i10;
                            Utilities.e.c(new org.telegram.ui.Components.e21(pq0Var, uri, i10, 8));
                            pq0Var.b = true;
                        }
                    }
                    pq0Var.e = h61Var;
                    break;
                }
                break;
            case 1:
                pq0.a(((PhotoViewer) this.b.c).F2);
                break;
            default:
                pq0.a(((PhotoViewer) this.b.c).F2);
                break;
        }
    }
}
