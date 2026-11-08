package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                oq0 oq0Var = photoViewer.E2;
                if (oq0Var != null) {
                    org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
                    if (oq0Var.e != t51Var) {
                        oq0Var.c = false;
                        oq0Var.d = false;
                        if (oq0Var.b) {
                            oq0Var.a++;
                            oq0Var.b = false;
                        }
                        oq0Var.setImageResource(R.color.transparent);
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
                        if (!oq0Var.c && !oq0Var.d && !oq0Var.b && U < 5250.0f) {
                            Uri uri = t51Var.F;
                            int i10 = oq0Var.a + 1;
                            oq0Var.a = i10;
                            Utilities.e.c(new d10(oq0Var, uri, i10, 5));
                            oq0Var.b = true;
                        }
                    }
                    oq0Var.e = t51Var;
                    break;
                }
                break;
            case 1:
                oq0.a(((PhotoViewer) this.b.c).E2);
                break;
            default:
                oq0.a(((PhotoViewer) this.b.c).E2);
                break;
        }
    }
}
