package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ct0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt0 b;

    public /* synthetic */ ct0(dt0 dt0Var, int i10) {
        this.a = i10;
        this.b = dt0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r2 != 7) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        b2.o oVar;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b.b;
                hu0 hu0Var = photoViewer.E2;
                if (hu0Var != null) {
                    org.telegram.ui.Components.s81 s81Var = photoViewer.F2;
                    if (hu0Var.e != s81Var) {
                        hu0Var.c = false;
                        hu0Var.d = false;
                        if (hu0Var.b) {
                            hu0Var.a++;
                            hu0Var.b = false;
                        }
                        hu0Var.setImageResource(R.color.transparent);
                    }
                    if (s81Var != null) {
                        i2.j0 j0Var = s81Var.d;
                        if (j0Var != null) {
                            try {
                                j0Var.F1();
                                b2.x xVar = j0Var.S;
                                if (xVar != null && (oVar = xVar.I) != null) {
                                    int i10 = oVar.c;
                                    if (i10 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long p10 = s81Var.p() - s81Var.n();
                        if (!hu0Var.c && !hu0Var.d && !hu0Var.b && p10 < 5250.0f) {
                            Uri uri = s81Var.F;
                            int i11 = hu0Var.a + 1;
                            hu0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new yx(hu0Var, uri, i11, 6));
                            hu0Var.b = true;
                        }
                    }
                    hu0Var.e = s81Var;
                    break;
                }
                break;
            case 1:
                hu0.a(this.b.b.E2);
                break;
            default:
                hu0.a(this.b.b.E2);
                break;
        }
    }
}
