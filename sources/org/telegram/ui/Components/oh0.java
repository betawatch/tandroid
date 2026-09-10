package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph0 b;

    public /* synthetic */ oh0(ph0 ph0Var, int i10) {
        this.a = i10;
        this.b = ph0Var;
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
        di0[] di0VarArr;
        switch (this.a) {
            case 0:
                ph0 ph0Var = this.b;
                synchronized (ph0Var.b) {
                    di0[] di0VarArr2 = ph0Var.c;
                    di0 di0Var = di0VarArr2[0];
                    di0[] di0VarArr3 = ph0Var.d;
                    i10 = 2;
                    di0VarArr = new di0[]{di0Var, di0VarArr3[0], di0VarArr2[1], di0VarArr3[1], di0VarArr2[2], di0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    di0 di0Var2 = di0VarArr[i11];
                    di0 di0Var3 = di0VarArr[i11 + 1];
                    if (di0Var2 != null && !di0Var2.c && di0Var2.f) {
                        di0Var2.e = true;
                        if (di0Var3 != null) {
                            Bitmap bitmap = di0Var3.b;
                            if (!di0Var3.d) {
                                if (bitmap.getWidth() == di0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (di0Var3 != null) {
                            di0Var3.a();
                        }
                        di0Var3 = new di0();
                        Bitmap createBitmap = Bitmap.createBitmap(di0Var2.b.getWidth(), di0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        di0Var3.b = createBitmap;
                        di0Var3.a = new Canvas(createBitmap);
                        synchronized (ph0Var.b) {
                            di0[] di0VarArr4 = ph0Var.d;
                            int i12 = 0;
                            while (true) {
                                di0[] di0VarArr5 = ph0Var.c;
                                if (i12 >= di0VarArr5.length) {
                                    i12 = 0;
                                } else if (di0VarArr5[i12] != di0Var2) {
                                    i12++;
                                }
                            }
                            di0VarArr4[i12] = di0Var3;
                        }
                        Bitmap bitmap2 = di0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (ph0Var.b) {
                            if (!di0Var3.d) {
                                di0Var3.f = false;
                                di0Var3.b.eraseColor(0);
                            }
                            di0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            di0Var3.f = true;
                            Bitmap bitmap3 = di0Var3.b;
                            int i13 = 0;
                            while (true) {
                                di0[] di0VarArr6 = ph0Var.c;
                                if (i13 >= di0VarArr6.length) {
                                    i13 = 0;
                                } else if (di0VarArr6[i13] != di0Var2) {
                                    i13++;
                                }
                            }
                            ph0Var.b(bitmap3, i13);
                        }
                        if (!di0Var2.d) {
                            di0Var2.f = false;
                            di0Var2.b.eraseColor(0);
                        }
                        di0Var2.e = false;
                        if (!di0Var2.d && di0Var2.c) {
                            di0Var2.d = true;
                            di0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && ph0Var.e && ph0Var.h != null) {
                    ph0Var.postInvalidateOnAnimation();
                }
                if (ph0Var.e && (ph0Var.F || ph0Var.H)) {
                    AndroidUtilities.runOnUIThread(new oh0(ph0Var, i10));
                    return;
                } else {
                    ph0Var.e = false;
                    return;
                }
            case 1:
                ph0 ph0Var2 = this.b;
                ph0Var2.H = true;
                ph0Var2.postInvalidateOnAnimation();
                return;
            default:
                ph0 ph0Var3 = this.b;
                ph0Var3.d();
                ei0.a.postRunnable(ph0Var3.s);
                return;
        }
    }
}
