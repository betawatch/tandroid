package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh0 b;

    public /* synthetic */ nh0(oh0 oh0Var, int i10) {
        this.a = i10;
        this.b = oh0Var;
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
        ci0[] ci0VarArr;
        switch (this.a) {
            case 0:
                oh0 oh0Var = this.b;
                synchronized (oh0Var.b) {
                    ci0[] ci0VarArr2 = oh0Var.c;
                    ci0 ci0Var = ci0VarArr2[0];
                    ci0[] ci0VarArr3 = oh0Var.d;
                    i10 = 2;
                    ci0VarArr = new ci0[]{ci0Var, ci0VarArr3[0], ci0VarArr2[1], ci0VarArr3[1], ci0VarArr2[2], ci0VarArr3[2]};
                }
                boolean z4 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    ci0 ci0Var2 = ci0VarArr[i11];
                    ci0 ci0Var3 = ci0VarArr[i11 + 1];
                    if (ci0Var2 != null && !ci0Var2.c && ci0Var2.f) {
                        ci0Var2.e = true;
                        if (ci0Var3 != null) {
                            Bitmap bitmap = ci0Var3.b;
                            if (!ci0Var3.d) {
                                if (bitmap.getWidth() == ci0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (ci0Var3 != null) {
                            ci0Var3.a();
                        }
                        ci0Var3 = new ci0();
                        Bitmap createBitmap = Bitmap.createBitmap(ci0Var2.b.getWidth(), ci0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        ci0Var3.b = createBitmap;
                        ci0Var3.a = new Canvas(createBitmap);
                        synchronized (oh0Var.b) {
                            ci0[] ci0VarArr4 = oh0Var.d;
                            int i12 = 0;
                            while (true) {
                                ci0[] ci0VarArr5 = oh0Var.c;
                                if (i12 >= ci0VarArr5.length) {
                                    i12 = 0;
                                } else if (ci0VarArr5[i12] != ci0Var2) {
                                    i12++;
                                }
                            }
                            ci0VarArr4[i12] = ci0Var3;
                        }
                        Bitmap bitmap2 = ci0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (oh0Var.b) {
                            if (!ci0Var3.d) {
                                ci0Var3.f = false;
                                ci0Var3.b.eraseColor(0);
                            }
                            ci0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            ci0Var3.f = true;
                            Bitmap bitmap3 = ci0Var3.b;
                            int i13 = 0;
                            while (true) {
                                ci0[] ci0VarArr6 = oh0Var.c;
                                if (i13 >= ci0VarArr6.length) {
                                    i13 = 0;
                                } else if (ci0VarArr6[i13] != ci0Var2) {
                                    i13++;
                                }
                            }
                            oh0Var.b(bitmap3, i13);
                        }
                        if (!ci0Var2.d) {
                            ci0Var2.f = false;
                            ci0Var2.b.eraseColor(0);
                        }
                        ci0Var2.e = false;
                        if (!ci0Var2.d && ci0Var2.c) {
                            ci0Var2.d = true;
                            ci0Var2.b.recycle();
                        }
                        z4 = true;
                    }
                }
                if (z4 && oh0Var.e && oh0Var.h != null) {
                    oh0Var.postInvalidateOnAnimation();
                }
                if (oh0Var.e && (oh0Var.C || oh0Var.E)) {
                    AndroidUtilities.runOnUIThread(new nh0(oh0Var, i10));
                    return;
                } else {
                    oh0Var.e = false;
                    return;
                }
            case 1:
                oh0 oh0Var2 = this.b;
                oh0Var2.E = true;
                oh0Var2.postInvalidateOnAnimation();
                return;
            default:
                oh0 oh0Var3 = this.b;
                oh0Var3.d();
                di0.a.postRunnable(oh0Var3.s);
                return;
        }
    }
}
