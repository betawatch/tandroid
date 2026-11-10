package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class op0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca.i b;

    public /* synthetic */ op0(ca.i iVar, int i7) {
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
                rq0 rq0Var = photoViewer.E2;
                if (rq0Var != null) {
                    org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
                    if (rq0Var.e != t51Var) {
                        rq0Var.c = false;
                        rq0Var.d = false;
                        if (rq0Var.b) {
                            rq0Var.a++;
                            rq0Var.b = false;
                        }
                        rq0Var.setImageResource(R.color.transparent);
                    }
                    if (t51Var != null) {
                        l2.i0 i0Var = t51Var.d;
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
                        long U = t51Var.U() - t51Var.S();
                        if (!rq0Var.c && !rq0Var.d && !rq0Var.b && U < 5250.0f) {
                            Uri uri = t51Var.F;
                            int i10 = rq0Var.a + 1;
                            rq0Var.a = i10;
                            Utilities.e.c(new h10(rq0Var, uri, i10, 5));
                            rq0Var.b = true;
                        }
                    }
                    rq0Var.e = t51Var;
                    break;
                }
                break;
            case 1:
                rq0.a(((PhotoViewer) this.b.c).E2);
                break;
            default:
                rq0.a(((PhotoViewer) this.b.c).E2);
                break;
        }
    }
}
