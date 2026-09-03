package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ct0 b;

    public /* synthetic */ bt0(ct0 ct0Var, int i10) {
        this.a = i10;
        this.b = ct0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r2 != 7) goto L32;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        i5.b bVar;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b.b;
                hu0 hu0Var = photoViewer.B2;
                if (hu0Var != null) {
                    org.telegram.ui.Components.i71 i71Var = photoViewer.C2;
                    if (hu0Var.e != i71Var) {
                        hu0Var.c = false;
                        hu0Var.d = false;
                        if (hu0Var.b) {
                            hu0Var.a++;
                            hu0Var.b = false;
                        }
                        hu0Var.setImageResource(R.color.transparent);
                    }
                    if (i71Var != null) {
                        j3.f0 f0Var = i71Var.d;
                        if (f0Var != null) {
                            try {
                                f0Var.j0();
                                j3.n0 n0Var = f0Var.N;
                                if (n0Var != null && (bVar = n0Var.O) != null) {
                                    int i10 = bVar.c;
                                    if (i10 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long p10 = i71Var.p() - i71Var.n();
                        if (!hu0Var.c && !hu0Var.d && !hu0Var.b && p10 < 5250.0f) {
                            Uri uri = i71Var.C;
                            int i11 = hu0Var.a + 1;
                            hu0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new gu0(hu0Var, uri, i11, 0));
                            hu0Var.b = true;
                        }
                    }
                    hu0Var.e = i71Var;
                    break;
                }
                break;
            case 1:
                hu0.a(this.b.b.B2);
                break;
            default:
                hu0.a(this.b.b.B2);
                break;
        }
    }
}
