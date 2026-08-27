package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg0 b;

    public /* synthetic */ sg0(tg0 tg0Var, int i10) {
        this.a = i10;
        this.b = tg0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r3.getHeight() != r5.b.getHeight()) goto L30;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        hh0[] hh0VarArr;
        switch (this.a) {
            case 0:
                tg0 tg0Var = this.b;
                synchronized (tg0Var.b) {
                    hh0[] hh0VarArr2 = tg0Var.c;
                    hh0 hh0Var = hh0VarArr2[0];
                    hh0[] hh0VarArr3 = tg0Var.d;
                    i10 = 2;
                    hh0VarArr = new hh0[]{hh0Var, hh0VarArr3[0], hh0VarArr2[1], hh0VarArr3[1], hh0VarArr2[2], hh0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    hh0 hh0Var2 = hh0VarArr[i11];
                    hh0 hh0Var3 = hh0VarArr[i11 + 1];
                    if (hh0Var2 != null && !hh0Var2.c && hh0Var2.f) {
                        hh0Var2.e = true;
                        if (hh0Var3 != null) {
                            Bitmap bitmap = hh0Var3.b;
                            if (!hh0Var3.d) {
                                if (bitmap.getWidth() == hh0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (hh0Var3 != null) {
                            hh0Var3.a();
                        }
                        hh0Var3 = new hh0();
                        Bitmap createBitmap = Bitmap.createBitmap(hh0Var2.b.getWidth(), hh0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        hh0Var3.b = createBitmap;
                        hh0Var3.a = new Canvas(createBitmap);
                        synchronized (tg0Var.b) {
                            hh0[] hh0VarArr4 = tg0Var.d;
                            int i12 = 0;
                            while (true) {
                                hh0[] hh0VarArr5 = tg0Var.c;
                                if (i12 >= hh0VarArr5.length) {
                                    i12 = 0;
                                } else if (hh0VarArr5[i12] != hh0Var2) {
                                    i12++;
                                }
                            }
                            hh0VarArr4[i12] = hh0Var3;
                        }
                        Bitmap bitmap2 = hh0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (tg0Var.b) {
                            if (!hh0Var3.d) {
                                hh0Var3.f = false;
                                hh0Var3.b.eraseColor(0);
                            }
                            hh0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            hh0Var3.f = true;
                            Bitmap bitmap3 = hh0Var3.b;
                            int i13 = 0;
                            while (true) {
                                hh0[] hh0VarArr6 = tg0Var.c;
                                if (i13 >= hh0VarArr6.length) {
                                    i13 = 0;
                                } else if (hh0VarArr6[i13] != hh0Var2) {
                                    i13++;
                                }
                            }
                            tg0Var.b(bitmap3, i13);
                        }
                        if (!hh0Var2.d) {
                            hh0Var2.f = false;
                            hh0Var2.b.eraseColor(0);
                        }
                        hh0Var2.e = false;
                        if (!hh0Var2.d && hh0Var2.c) {
                            hh0Var2.d = true;
                            hh0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && tg0Var.e && tg0Var.h != null) {
                    tg0Var.postInvalidateOnAnimation();
                }
                if (tg0Var.e && (tg0Var.B || tg0Var.D)) {
                    AndroidUtilities.runOnUIThread(new sg0(tg0Var, i10));
                    return;
                } else {
                    tg0Var.e = false;
                    return;
                }
            case 1:
                tg0 tg0Var2 = this.b;
                tg0Var2.D = true;
                tg0Var2.postInvalidateOnAnimation();
                return;
            default:
                tg0 tg0Var3 = this.b;
                tg0Var3.d();
                ih0.a.postRunnable(tg0Var3.s);
                return;
        }
    }
}
