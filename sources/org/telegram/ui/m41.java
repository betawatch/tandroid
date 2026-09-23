package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class m41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretMediaViewer b;

    public /* synthetic */ m41(SecretMediaViewer secretMediaViewer, int i10) {
        this.a = i10;
        this.b = secretMediaViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 4;
        SecretMediaViewer secretMediaViewer = this.b;
        switch (i10) {
            case 0:
                secretMediaViewer.K0 = null;
                secretMediaViewer.m0 = 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.s = false;
                secretMediaViewer.N = null;
                secretMediaViewer.M = false;
                secretMediaViewer.i();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new m41(secretMediaViewer, i11), 50L);
                break;
            case 1:
                ci.m6 m6Var = secretMediaViewer.e;
                if (m6Var != null) {
                    m6Var.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.m0 = 0;
                    secretMediaViewer.s = false;
                    secretMediaViewer.N = null;
                    secretMediaViewer.M = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new m41(secretMediaViewer, i11), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    break;
                }
                break;
            case 2:
                s41 s41Var = secretMediaViewer.y;
                if (s41Var != null) {
                    long n10 = s41Var.n();
                    long p5 = secretMediaViewer.y.p();
                    if (p5 == -9223372036854775807L) {
                        n10 = 0;
                        p5 = 0;
                    }
                    if (p5 > 0) {
                        org.telegram.ui.Components.h71 h71Var = secretMediaViewer.Q;
                        if (!h71Var.f) {
                            h71Var.h(n10 / p5, false);
                            secretMediaViewer.R.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.j1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.k1;
                    Arrays.fill(iArr2, 0);
                    s41 s41Var2 = secretMediaViewer.y;
                    if (s41Var2 != null) {
                        long max = Math.max(0L, s41Var2.n()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.y.p()) / 1000;
                        iArr[0] = (int) (max / 60);
                        iArr[1] = (int) (max % 60);
                        iArr2[0] = (int) (max2 / 60);
                        iArr2[1] = (int) (max2 % 60);
                    }
                    int i12 = iArr[0];
                    String format = i12 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i12 / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(iArr[1]));
                    int i13 = iArr2[0];
                    String format2 = i13 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i13 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i13), Integer.valueOf(iArr2[1]));
                    org.telegram.ui.ActionBar.i5 i5Var = secretMediaViewer.S;
                    Locale locale = Locale.ROOT;
                    i5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.y.y()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.i1, 17L);
                        break;
                    }
                }
                break;
            case 3:
                secretMediaViewer.m(false, true);
                break;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.i0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.i0 = null;
                }
                secretMediaViewer.h.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                secretMediaViewer.j0 = false;
                break;
        }
    }

    public /* synthetic */ m41(SecretMediaViewer secretMediaViewer, wu0 wu0Var, int i10) {
        this.a = i10;
        this.b = secretMediaViewer;
    }
}
