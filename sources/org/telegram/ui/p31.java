package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretMediaViewer b;

    public /* synthetic */ p31(SecretMediaViewer secretMediaViewer, int i9) {
        this.a = i9;
        this.b = secretMediaViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        int i10 = 4;
        SecretMediaViewer secretMediaViewer = this.b;
        switch (i9) {
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
                AndroidUtilities.runOnUIThread(new p31(secretMediaViewer, i10), 50L);
                break;
            case 1:
                fh.v vVar = secretMediaViewer.e;
                if (vVar != null) {
                    vVar.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.i0 = 0;
                    secretMediaViewer.s = false;
                    secretMediaViewer.J = null;
                    secretMediaViewer.I = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new p31(secretMediaViewer, i10), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    break;
                }
                break;
            case 2:
                v31 v31Var = secretMediaViewer.y;
                if (v31Var != null) {
                    long o6 = v31Var.o();
                    long q10 = secretMediaViewer.y.q();
                    if (q10 == -9223372036854775807L) {
                        o6 = 0;
                        q10 = 0;
                    }
                    if (q10 > 0) {
                        org.telegram.ui.Components.m61 m61Var = secretMediaViewer.M;
                        if (!m61Var.f) {
                            m61Var.h(o6 / q10, false);
                            secretMediaViewer.N.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.g1;
                    Arrays.fill(iArr2, 0);
                    v31 v31Var2 = secretMediaViewer.y;
                    if (v31Var2 != null) {
                        long max = Math.max(0L, v31Var2.o()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.y.q()) / 1000;
                        iArr[0] = (int) (max / 60);
                        iArr[1] = (int) (max % 60);
                        iArr2[0] = (int) (max2 / 60);
                        iArr2[1] = (int) (max2 % 60);
                    }
                    int i11 = iArr[0];
                    String format = i11 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i11 / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(iArr[1]));
                    int i12 = iArr2[0];
                    String format2 = i12 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i12 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(iArr2[1]));
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                secretMediaViewer.f0 = false;
                break;
        }
    }

    public /* synthetic */ p31(SecretMediaViewer secretMediaViewer, bu0 bu0Var, int i9) {
        this.a = i9;
        this.b = secretMediaViewer;
    }
}
