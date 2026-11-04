package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba.i b;

    public /* synthetic */ cp0(ba.i iVar, int i3) {
        this.a = i3;
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
        d2.n nVar;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b.c;
                fq0 fq0Var = photoViewer.F2;
                if (fq0Var != null) {
                    org.telegram.ui.Components.m51 m51Var = photoViewer.G2;
                    if (fq0Var.e != m51Var) {
                        fq0Var.c = false;
                        fq0Var.d = false;
                        if (fq0Var.b) {
                            fq0Var.a++;
                            fq0Var.b = false;
                        }
                        fq0Var.setImageResource(R.color.transparent);
                    }
                    if (m51Var != null) {
                        k2.i0 i0Var = m51Var.d;
                        if (i0Var != null) {
                            try {
                                i0Var.F1();
                                d2.v vVar = i0Var.S;
                                if (vVar != null && (nVar = vVar.I) != null) {
                                    int i3 = nVar.c;
                                    if (i3 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long U = m51Var.U() - m51Var.S();
                        if (!fq0Var.c && !fq0Var.d && !fq0Var.b && U < 5250.0f) {
                            Uri uri = m51Var.G;
                            int i10 = fq0Var.a + 1;
                            fq0Var.a = i10;
                            Utilities.e.c(new rw(fq0Var, uri, i10, 6));
                            fq0Var.b = true;
                        }
                    }
                    fq0Var.e = m51Var;
                    break;
                }
                break;
            case 1:
                fq0.a(((PhotoViewer) this.b.c).F2);
                break;
            default:
                fq0.a(((PhotoViewer) this.b.c).F2);
                break;
        }
    }
}
