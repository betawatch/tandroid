// default package

import android.view.WindowManager;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ew9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SecretMediaViewer b;

    public /* synthetic */ ew9(SecretMediaViewer secretMediaViewer, byte b) {
        this.a = b;
        this.b = secretMediaViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Locale locale;
        String format;
        byte b = this.a;
        byte b2 = 4;
        SecretMediaViewer secretMediaViewer = this.b;
        switch (b) {
            case 0:
                secretMediaViewer.J0 = null;
                secretMediaViewer.l0 = (byte) 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.s = false;
                secretMediaViewer.M = null;
                secretMediaViewer.L = false;
                secretMediaViewer.j();
                gm.d3(new ew9(secretMediaViewer, b2), 50L);
                break;
            case 1:
                su suVar = secretMediaViewer.e;
                if (suVar != null) {
                    suVar.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.l0 = (byte) 0;
                    secretMediaViewer.s = false;
                    secretMediaViewer.M = null;
                    secretMediaViewer.L = false;
                    secretMediaViewer.j();
                    gm.d3(new ew9(secretMediaViewer, b2), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    break;
                }
                break;
            case 2:
                la8 la8Var = secretMediaViewer.E;
                if (la8Var != null) {
                    long S = la8Var.S();
                    long U = secretMediaViewer.E.U();
                    if (U == -9223372036854775807L) {
                        S = 0;
                        U = 0;
                    }
                    if (U > 0) {
                        vdc vdcVar = secretMediaViewer.P;
                        if (!vdcVar.f) {
                            vdcVar.h(false, S / U);
                            secretMediaViewer.Q.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.i1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.j1;
                    Arrays.fill(iArr2, 0);
                    la8 la8Var2 = secretMediaViewer.E;
                    if (la8Var2 != null) {
                        long max = Math.max(0L, la8Var2.S()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.E.U()) / 1000;
                        iArr[0] = (int) (max / 60);
                        iArr[1] = (int) (max % 60);
                        iArr2[0] = (int) (max2 / 60);
                        iArr2[1] = (int) (max2 % 60);
                    }
                    int i = iArr[0];
                    if (i >= 60) {
                        locale = Locale.ROOT;
                        format = String.format(locale, "%02d:%02d:%02d", Integer.valueOf(i / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1]));
                    } else {
                        locale = Locale.ROOT;
                        format = String.format(locale, "%02d:%02d", Integer.valueOf(i), Integer.valueOf(iArr[1]));
                    }
                    int i2 = iArr2[0];
                    String format2 = i2 >= 60 ? String.format(locale, "%02d:%02d:%02d", Integer.valueOf(i2 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1])) : String.format(locale, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(iArr2[1]));
                    secretMediaViewer.R.l(format + " / " + format2, false);
                    if (secretMediaViewer.E.c0()) {
                        gm.d3(secretMediaViewer.h1, 17L);
                        break;
                    }
                }
                break;
            case 3:
                secretMediaViewer.n(false, true);
                break;
            default:
                jn5 jn5Var = secretMediaViewer.h0;
                if (jn5Var != null) {
                    jn5Var.a();
                    secretMediaViewer.h0 = null;
                }
                secretMediaViewer.h.g0(null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                secretMediaViewer.i0 = false;
                break;
        }
    }

    public /* synthetic */ ew9(SecretMediaViewer secretMediaViewer, qb8 qb8Var, byte b) {
        this.a = b;
        this.b = secretMediaViewer;
    }
}
