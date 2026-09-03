package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretMediaViewer b;

    public /* synthetic */ i41(SecretMediaViewer secretMediaViewer, int i10) {
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
                secretMediaViewer.H0 = null;
                secretMediaViewer.j0 = 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.s = false;
                secretMediaViewer.K = null;
                secretMediaViewer.J = false;
                secretMediaViewer.i();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new i41(secretMediaViewer, i11), 50L);
                break;
            case 1:
                ag.l lVar = secretMediaViewer.e;
                if (lVar != null) {
                    lVar.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.j0 = 0;
                    secretMediaViewer.s = false;
                    secretMediaViewer.K = null;
                    secretMediaViewer.J = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new i41(secretMediaViewer, i11), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    break;
                }
                break;
            case 2:
                o41 o41Var = secretMediaViewer.y;
                if (o41Var != null) {
                    long n10 = o41Var.n();
                    long p10 = secretMediaViewer.y.p();
                    if (p10 == -9223372036854775807L) {
                        n10 = 0;
                        p10 = 0;
                    }
                    if (p10 > 0) {
                        org.telegram.ui.Components.l71 l71Var = secretMediaViewer.N;
                        if (!l71Var.f) {
                            l71Var.h(n10 / p10, false);
                            secretMediaViewer.O.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.g1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.h1;
                    Arrays.fill(iArr2, 0);
                    o41 o41Var2 = secretMediaViewer.y;
                    if (o41Var2 != null) {
                        long max = Math.max(0L, o41Var2.n()) / 1000;
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
                    org.telegram.ui.ActionBar.l5 l5Var = secretMediaViewer.P;
                    Locale locale = Locale.ROOT;
                    l5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.y.y()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.f1, 17L);
                        break;
                    }
                }
                break;
            case 3:
                secretMediaViewer.m(false, true);
                break;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.f0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.f0 = null;
                }
                secretMediaViewer.h.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                secretMediaViewer.g0 = false;
                break;
        }
    }

    public /* synthetic */ i41(SecretMediaViewer secretMediaViewer, qu0 qu0Var, int i10) {
        this.a = i10;
        this.b = secretMediaViewer;
    }
}
