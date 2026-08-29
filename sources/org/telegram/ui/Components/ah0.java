package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bh0 b;

    public /* synthetic */ ah0(bh0 bh0Var, int i10) {
        this.a = i10;
        this.b = bh0Var;
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
        ph0[] ph0VarArr;
        switch (this.a) {
            case 0:
                bh0 bh0Var = this.b;
                synchronized (bh0Var.b) {
                    ph0[] ph0VarArr2 = bh0Var.c;
                    ph0 ph0Var = ph0VarArr2[0];
                    ph0[] ph0VarArr3 = bh0Var.d;
                    i10 = 2;
                    ph0VarArr = new ph0[]{ph0Var, ph0VarArr3[0], ph0VarArr2[1], ph0VarArr3[1], ph0VarArr2[2], ph0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    ph0 ph0Var2 = ph0VarArr[i11];
                    ph0 ph0Var3 = ph0VarArr[i11 + 1];
                    if (ph0Var2 != null && !ph0Var2.c && ph0Var2.f) {
                        ph0Var2.e = true;
                        if (ph0Var3 != null) {
                            Bitmap bitmap = ph0Var3.b;
                            if (!ph0Var3.d) {
                                if (bitmap.getWidth() == ph0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (ph0Var3 != null) {
                            ph0Var3.a();
                        }
                        ph0Var3 = new ph0();
                        Bitmap createBitmap = Bitmap.createBitmap(ph0Var2.b.getWidth(), ph0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        ph0Var3.b = createBitmap;
                        ph0Var3.a = new Canvas(createBitmap);
                        synchronized (bh0Var.b) {
                            ph0[] ph0VarArr4 = bh0Var.d;
                            int i12 = 0;
                            while (true) {
                                ph0[] ph0VarArr5 = bh0Var.c;
                                if (i12 >= ph0VarArr5.length) {
                                    i12 = 0;
                                } else if (ph0VarArr5[i12] != ph0Var2) {
                                    i12++;
                                }
                            }
                            ph0VarArr4[i12] = ph0Var3;
                        }
                        Bitmap bitmap2 = ph0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (bh0Var.b) {
                            if (!ph0Var3.d) {
                                ph0Var3.f = false;
                                ph0Var3.b.eraseColor(0);
                            }
                            ph0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            ph0Var3.f = true;
                            Bitmap bitmap3 = ph0Var3.b;
                            int i13 = 0;
                            while (true) {
                                ph0[] ph0VarArr6 = bh0Var.c;
                                if (i13 >= ph0VarArr6.length) {
                                    i13 = 0;
                                } else if (ph0VarArr6[i13] != ph0Var2) {
                                    i13++;
                                }
                            }
                            bh0Var.b(bitmap3, i13);
                        }
                        if (!ph0Var2.d) {
                            ph0Var2.f = false;
                            ph0Var2.b.eraseColor(0);
                        }
                        ph0Var2.e = false;
                        if (!ph0Var2.d && ph0Var2.c) {
                            ph0Var2.d = true;
                            ph0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && bh0Var.e && bh0Var.h != null) {
                    bh0Var.postInvalidateOnAnimation();
                }
                if (bh0Var.e && (bh0Var.B || bh0Var.D)) {
                    AndroidUtilities.runOnUIThread(new ah0(bh0Var, i10));
                    return;
                } else {
                    bh0Var.e = false;
                    return;
                }
            case 1:
                bh0 bh0Var2 = this.b;
                bh0Var2.D = true;
                bh0Var2.postInvalidateOnAnimation();
                return;
            default:
                bh0 bh0Var3 = this.b;
                bh0Var3.d();
                qh0.a.postRunnable(bh0Var3.s);
                return;
        }
    }
}
