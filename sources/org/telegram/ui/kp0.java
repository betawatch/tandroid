package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca.i b;

    public /* synthetic */ kp0(ca.i iVar, int i7) {
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
                nq0 nq0Var = photoViewer.E2;
                if (nq0Var != null) {
                    org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
                    if (nq0Var.e != n51Var) {
                        nq0Var.c = false;
                        nq0Var.d = false;
                        if (nq0Var.b) {
                            nq0Var.a++;
                            nq0Var.b = false;
                        }
                        nq0Var.setImageResource(R.color.transparent);
                    }
                    if (n51Var != null) {
                        l2.i0 i0Var = n51Var.d;
                        if (i0Var != null) {
                            try {
                                i0Var.F1();
                                e2.u uVar = i0Var.S;
                                if (uVar != null && (mVar = uVar.I) != null) {
                                    int i7 = mVar.c;
                                    if (i7 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long U = n51Var.U() - n51Var.S();
                        if (!nq0Var.c && !nq0Var.d && !nq0Var.b && U < 5250.0f) {
                            Uri uri = n51Var.F;
                            int i10 = nq0Var.a + 1;
                            nq0Var.a = i10;
                            Utilities.e.c(new d10(nq0Var, uri, i10, 5));
                            nq0Var.b = true;
                        }
                    }
                    nq0Var.e = n51Var;
                    break;
                }
                break;
            case 1:
                nq0.a(((PhotoViewer) this.b.c).E2);
                break;
            default:
                nq0.a(((PhotoViewer) this.b.c).E2);
                break;
        }
    }
}
