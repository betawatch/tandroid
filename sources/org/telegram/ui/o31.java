package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretMediaViewer b;

    public /* synthetic */ o31(SecretMediaViewer secretMediaViewer, int i10) {
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
                secretMediaViewer.G0 = null;
                secretMediaViewer.i0 = 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.s = false;
                secretMediaViewer.J = null;
                secretMediaViewer.I = false;
                secretMediaViewer.i();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new o31(secretMediaViewer, i11), 50L);
                break;
            case 1:
                ag.y1 y1Var = secretMediaViewer.e;
                if (y1Var != null) {
                    y1Var.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.i0 = 0;
                    secretMediaViewer.s = false;
                    secretMediaViewer.J = null;
                    secretMediaViewer.I = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new o31(secretMediaViewer, i11), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    break;
                }
                break;
            case 2:
                u31 u31Var = secretMediaViewer.y;
                if (u31Var != null) {
                    long o10 = u31Var.o();
                    long q6 = secretMediaViewer.y.q();
                    if (q6 == -9223372036854775807L) {
                        o10 = 0;
                        q6 = 0;
                    }
                    if (q6 > 0) {
                        org.telegram.ui.Components.o61 o61Var = secretMediaViewer.M;
                        if (!o61Var.f) {
                            o61Var.h(o10 / q6, false);
                            secretMediaViewer.N.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.g1;
                    Arrays.fill(iArr2, 0);
                    u31 u31Var2 = secretMediaViewer.y;
                    if (u31Var2 != null) {
                        long max = Math.max(0L, u31Var2.o()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.y.q()) / 1000;
                        iArr[0] = (int) (max / 60);
                        iArr[1] = (int) (max % 60);
                        iArr2[0] = (int) (max2 / 60);
                        iArr2[1] = (int) (max2 % 60);
                    }
                    int i12 = iArr[0];
                    String format = i12 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i12 / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(iArr[1]));
                    int i13 = iArr2[0];
                    String format2 = i13 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i13 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i13), Integer.valueOf(iArr2[1]));
                    org.telegram.ui.ActionBar.h5 h5Var = secretMediaViewer.O;
                    Locale locale = Locale.ROOT;
                    h5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.y.z()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.e1, 17L);
                        break;
                    }
                }
                break;
            case 3:
                secretMediaViewer.m(false, true);
                break;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.e0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.e0 = null;
                }
                secretMediaViewer.h.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                secretMediaViewer.f0 = false;
                break;
        }
    }

    public /* synthetic */ o31(SecretMediaViewer secretMediaViewer, cu0 cu0Var, int i10) {
        this.a = i10;
        this.b = secretMediaViewer;
    }
}
