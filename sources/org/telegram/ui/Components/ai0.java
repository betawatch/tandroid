package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi0 b;

    public /* synthetic */ ai0(bi0 bi0Var, int i10) {
        this.a = i10;
        this.b = bi0Var;
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
        pi0[] pi0VarArr;
        switch (this.a) {
            case 0:
                bi0 bi0Var = this.b;
                synchronized (bi0Var.b) {
                    pi0[] pi0VarArr2 = bi0Var.c;
                    pi0 pi0Var = pi0VarArr2[0];
                    pi0[] pi0VarArr3 = bi0Var.d;
                    i10 = 2;
                    pi0VarArr = new pi0[]{pi0Var, pi0VarArr3[0], pi0VarArr2[1], pi0VarArr3[1], pi0VarArr2[2], pi0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    pi0 pi0Var2 = pi0VarArr[i11];
                    pi0 pi0Var3 = pi0VarArr[i11 + 1];
                    if (pi0Var2 != null && !pi0Var2.c && pi0Var2.f) {
                        pi0Var2.e = true;
                        if (pi0Var3 != null) {
                            Bitmap bitmap = pi0Var3.b;
                            if (!pi0Var3.d) {
                                if (bitmap.getWidth() == pi0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (pi0Var3 != null) {
                            pi0Var3.a();
                        }
                        pi0Var3 = new pi0();
                        Bitmap createBitmap = Bitmap.createBitmap(pi0Var2.b.getWidth(), pi0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        pi0Var3.b = createBitmap;
                        pi0Var3.a = new Canvas(createBitmap);
                        synchronized (bi0Var.b) {
                            pi0[] pi0VarArr4 = bi0Var.d;
                            int i12 = 0;
                            while (true) {
                                pi0[] pi0VarArr5 = bi0Var.c;
                                if (i12 >= pi0VarArr5.length) {
                                    i12 = 0;
                                } else if (pi0VarArr5[i12] != pi0Var2) {
                                    i12++;
                                }
                            }
                            pi0VarArr4[i12] = pi0Var3;
                        }
                        Bitmap bitmap2 = pi0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (bi0Var.b) {
                            if (!pi0Var3.d) {
                                pi0Var3.f = false;
                                pi0Var3.b.eraseColor(0);
                            }
                            pi0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            pi0Var3.f = true;
                            Bitmap bitmap3 = pi0Var3.b;
                            int i13 = 0;
                            while (true) {
                                pi0[] pi0VarArr6 = bi0Var.c;
                                if (i13 >= pi0VarArr6.length) {
                                    i13 = 0;
                                } else if (pi0VarArr6[i13] != pi0Var2) {
                                    i13++;
                                }
                            }
                            bi0Var.b(bitmap3, i13);
                        }
                        if (!pi0Var2.d) {
                            pi0Var2.f = false;
                            pi0Var2.b.eraseColor(0);
                        }
                        pi0Var2.e = false;
                        if (!pi0Var2.d && pi0Var2.c) {
                            pi0Var2.d = true;
                            pi0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && bi0Var.e && bi0Var.h != null) {
                    bi0Var.postInvalidateOnAnimation();
                }
                if (bi0Var.e && (bi0Var.F || bi0Var.H)) {
                    AndroidUtilities.runOnUIThread(new ai0(bi0Var, i10));
                    return;
                } else {
                    bi0Var.e = false;
                    return;
                }
            case 1:
                bi0 bi0Var2 = this.b;
                bi0Var2.H = true;
                bi0Var2.postInvalidateOnAnimation();
                return;
            default:
                bi0 bi0Var3 = this.b;
                bi0Var3.d();
                qi0.a.postRunnable(bi0Var3.s);
                return;
        }
    }
}
