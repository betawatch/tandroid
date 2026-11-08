package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretMediaViewer b;

    public /* synthetic */ dz0(SecretMediaViewer secretMediaViewer, int i7) {
        this.a = i7;
        this.b = secretMediaViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 4;
        SecretMediaViewer secretMediaViewer = this.b;
        switch (i7) {
            case 0:
                secretMediaViewer.I0 = null;
                secretMediaViewer.k0 = 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.s = false;
                secretMediaViewer.L = null;
                secretMediaViewer.K = false;
                secretMediaViewer.j();
                new ArrayList();
                org.telegram.messenger.g0.i3(new dz0(secretMediaViewer, i10), 50L);
                break;
            case 1:
                bi.x5 x5Var = secretMediaViewer.e;
                if (x5Var != null) {
                    x5Var.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.k0 = 0;
                    secretMediaViewer.s = false;
                    secretMediaViewer.L = null;
                    secretMediaViewer.K = false;
                    secretMediaViewer.j();
                    new ArrayList();
                    org.telegram.messenger.g0.i3(new dz0(secretMediaViewer, i10), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    break;
                }
                break;
            case 2:
                kp0 kp0Var = secretMediaViewer.D;
                if (kp0Var != null) {
                    long S = kp0Var.S();
                    long U = secretMediaViewer.D.U();
                    if (U == -9223372036854775807L) {
                        S = 0;
                        U = 0;
                    }
                    if (U > 0) {
                        org.telegram.ui.Components.v51 v51Var = secretMediaViewer.O;
                        if (!v51Var.f) {
                            v51Var.h(false, S / U);
                            secretMediaViewer.P.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.h1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.i1;
                    Arrays.fill(iArr2, 0);
                    kp0 kp0Var2 = secretMediaViewer.D;
                    if (kp0Var2 != null) {
                        long max = Math.max(0L, kp0Var2.S()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.D.U()) / 1000;
                        iArr[0] = (int) (max / 60);
                        iArr[1] = (int) (max % 60);
                        iArr2[0] = (int) (max2 / 60);
                        iArr2[1] = (int) (max2 % 60);
                    }
                    int i11 = iArr[0];
                    String format = i11 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i11 / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(iArr[1]));
                    int i12 = iArr2[0];
                    String format2 = i12 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i12 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(iArr2[1]));
                    org.telegram.ui.ActionBar.k5 k5Var = secretMediaViewer.Q;
                    Locale locale = Locale.ROOT;
                    k5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.D.d0()) {
                        org.telegram.messenger.g0.i3(secretMediaViewer.g1, 17L);
                        break;
                    }
                }
                break;
            case 3:
                secretMediaViewer.n(false, true);
                break;
            default:
                org.telegram.messenger.jc jcVar = secretMediaViewer.g0;
                if (jcVar != null) {
                    jcVar.a();
                    secretMediaViewer.g0 = null;
                }
                secretMediaViewer.h.w0(null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                secretMediaViewer.h0 = false;
                break;
        }
    }

    public /* synthetic */ dz0(SecretMediaViewer secretMediaViewer, wq0 wq0Var, int i7) {
        this.a = i7;
        this.b = secretMediaViewer;
    }
}
