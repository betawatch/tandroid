package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class kt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lt0 b;

    public /* synthetic */ kt0(lt0 lt0Var, int i10) {
        this.a = i10;
        this.b = lt0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r2 != 7) goto L32;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        b2.j jVar;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b.b;
                pu0 pu0Var = photoViewer.E2;
                if (pu0Var != null) {
                    org.telegram.ui.Components.d81 d81Var = photoViewer.F2;
                    if (pu0Var.e != d81Var) {
                        pu0Var.c = false;
                        pu0Var.d = false;
                        if (pu0Var.b) {
                            pu0Var.a++;
                            pu0Var.b = false;
                        }
                        pu0Var.setImageResource(R.color.transparent);
                    }
                    if (d81Var != null) {
                        i2.f0 f0Var = d81Var.d;
                        if (f0Var != null) {
                            try {
                                f0Var.B1();
                                b2.s sVar = f0Var.Q;
                                if (sVar != null && (jVar = sVar.H) != null) {
                                    int i10 = jVar.c;
                                    if (i10 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long p5 = d81Var.p() - d81Var.n();
                        if (!pu0Var.c && !pu0Var.d && !pu0Var.b && p5 < 5250.0f) {
                            Uri uri = d81Var.F;
                            int i11 = pu0Var.a + 1;
                            pu0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new am0(pu0Var, uri, i11, 2));
                            pu0Var.b = true;
                        }
                    }
                    pu0Var.e = d81Var;
                    break;
                }
                break;
            case 1:
                pu0.a(this.b.b.E2);
                break;
            default:
                pu0.a(this.b.b.E2);
                break;
        }
    }
}
