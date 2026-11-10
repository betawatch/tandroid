package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kf0 b;

    public /* synthetic */ jf0(kf0 kf0Var, int i7) {
        this.a = i7;
        this.b = kf0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r3.getHeight() != r5.b.getHeight()) goto L30;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        xf0[] xf0VarArr;
        switch (this.a) {
            case 0:
                kf0 kf0Var = this.b;
                synchronized (kf0Var.b) {
                    xf0[] xf0VarArr2 = kf0Var.c;
                    xf0 xf0Var = xf0VarArr2[0];
                    xf0[] xf0VarArr3 = kf0Var.d;
                    i7 = 2;
                    xf0VarArr = new xf0[]{xf0Var, xf0VarArr3[0], xf0VarArr2[1], xf0VarArr3[1], xf0VarArr2[2], xf0VarArr3[2]};
                }
                boolean z9 = false;
                for (int i10 = 0; i10 < 6; i10 += 2) {
                    xf0 xf0Var2 = xf0VarArr[i10];
                    xf0 xf0Var3 = xf0VarArr[i10 + 1];
                    if (xf0Var2 != null && !xf0Var2.c && xf0Var2.f) {
                        xf0Var2.e = true;
                        if (xf0Var3 != null) {
                            Bitmap bitmap = xf0Var3.b;
                            if (!xf0Var3.d) {
                                if (bitmap.getWidth() == xf0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (xf0Var3 != null) {
                            xf0Var3.a();
                        }
                        xf0Var3 = new xf0();
                        Bitmap createBitmap = Bitmap.createBitmap(xf0Var2.b.getWidth(), xf0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        xf0Var3.b = createBitmap;
                        xf0Var3.a = new Canvas(createBitmap);
                        synchronized (kf0Var.b) {
                            xf0[] xf0VarArr4 = kf0Var.d;
                            int i11 = 0;
                            while (true) {
                                xf0[] xf0VarArr5 = kf0Var.c;
                                if (i11 >= xf0VarArr5.length) {
                                    i11 = 0;
                                } else if (xf0VarArr5[i11] != xf0Var2) {
                                    i11++;
                                }
                            }
                            xf0VarArr4[i11] = xf0Var3;
                        }
                        Bitmap bitmap2 = xf0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / org.telegram.messenger.qs.K2));
                        synchronized (kf0Var.b) {
                            if (!xf0Var3.d) {
                                xf0Var3.f = false;
                                xf0Var3.b.eraseColor(0);
                            }
                            xf0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            xf0Var3.f = true;
                            Bitmap bitmap3 = xf0Var3.b;
                            int i12 = 0;
                            while (true) {
                                xf0[] xf0VarArr6 = kf0Var.c;
                                if (i12 >= xf0VarArr6.length) {
                                    i12 = 0;
                                } else if (xf0VarArr6[i12] != xf0Var2) {
                                    i12++;
                                }
                            }
                            kf0Var.b(i12, bitmap3);
                        }
                        if (!xf0Var2.d) {
                            xf0Var2.f = false;
                            xf0Var2.b.eraseColor(0);
                        }
                        xf0Var2.e = false;
                        if (!xf0Var2.d && xf0Var2.c) {
                            xf0Var2.d = true;
                            xf0Var2.b.recycle();
                        }
                        z9 = true;
                    }
                }
                if (z9 && kf0Var.e && kf0Var.h != null) {
                    kf0Var.postInvalidateOnAnimation();
                }
                if (kf0Var.e && (kf0Var.F || kf0Var.H)) {
                    org.telegram.messenger.g0.h3(new jf0(kf0Var, i7));
                    return;
                } else {
                    kf0Var.e = false;
                    return;
                }
            case 1:
                kf0 kf0Var2 = this.b;
                kf0Var2.H = true;
                kf0Var2.postInvalidateOnAnimation();
                return;
            default:
                kf0 kf0Var3 = this.b;
                kf0Var3.c();
                yf0.a.postRunnable(kf0Var3.s);
                return;
        }
    }
}
