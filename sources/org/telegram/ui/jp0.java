package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca.i b;

    public /* synthetic */ jp0(ca.i iVar, int i7) {
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
                nq0 nq0Var = photoViewer.F2;
                if (nq0Var != null) {
                    org.telegram.ui.Components.u51 u51Var = photoViewer.G2;
                    if (nq0Var.e != u51Var) {
                        nq0Var.c = false;
                        nq0Var.d = false;
                        if (nq0Var.b) {
                            nq0Var.a++;
                            nq0Var.b = false;
                        }
                        nq0Var.setImageResource(R.color.transparent);
                    }
                    if (u51Var != null) {
                        l2.f0 f0Var = u51Var.d;
                        if (f0Var != null) {
                            try {
                                f0Var.F1();
                                e2.u uVar = f0Var.S;
                                if (uVar != null && (mVar = uVar.I) != null) {
                                    int i7 = mVar.c;
                                    if (i7 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long U = u51Var.U() - u51Var.S();
                        if (!nq0Var.c && !nq0Var.d && !nq0Var.b && U < 5250.0f) {
                            Uri uri = u51Var.G;
                            int i10 = nq0Var.a + 1;
                            nq0Var.a = i10;
                            Utilities.e.c(new org.telegram.ui.Components.u11(nq0Var, uri, i10, 8));
                            nq0Var.b = true;
                        }
                    }
                    nq0Var.e = u51Var;
                    break;
                }
                break;
            case 1:
                nq0.a(((PhotoViewer) this.b.c).F2);
                break;
            default:
                nq0.a(((PhotoViewer) this.b.c).F2);
                break;
        }
    }
}
