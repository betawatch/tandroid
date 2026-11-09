package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lf0 b;

    public /* synthetic */ kf0(lf0 lf0Var, int i7) {
        this.a = i7;
        this.b = lf0Var;
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
        yf0[] yf0VarArr;
        switch (this.a) {
            case 0:
                lf0 lf0Var = this.b;
                synchronized (lf0Var.b) {
                    yf0[] yf0VarArr2 = lf0Var.c;
                    yf0 yf0Var = yf0VarArr2[0];
                    yf0[] yf0VarArr3 = lf0Var.d;
                    i7 = 2;
                    yf0VarArr = new yf0[]{yf0Var, yf0VarArr3[0], yf0VarArr2[1], yf0VarArr3[1], yf0VarArr2[2], yf0VarArr3[2]};
                }
                boolean z9 = false;
                for (int i10 = 0; i10 < 6; i10 += 2) {
                    yf0 yf0Var2 = yf0VarArr[i10];
                    yf0 yf0Var3 = yf0VarArr[i10 + 1];
                    if (yf0Var2 != null && !yf0Var2.c && yf0Var2.f) {
                        yf0Var2.e = true;
                        if (yf0Var3 != null) {
                            Bitmap bitmap = yf0Var3.b;
                            if (!yf0Var3.d) {
                                if (bitmap.getWidth() == yf0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (yf0Var3 != null) {
                            yf0Var3.a();
                        }
                        yf0Var3 = new yf0();
                        Bitmap createBitmap = Bitmap.createBitmap(yf0Var2.b.getWidth(), yf0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        yf0Var3.b = createBitmap;
                        yf0Var3.a = new Canvas(createBitmap);
                        synchronized (lf0Var.b) {
                            yf0[] yf0VarArr4 = lf0Var.d;
                            int i11 = 0;
                            while (true) {
                                yf0[] yf0VarArr5 = lf0Var.c;
                                if (i11 >= yf0VarArr5.length) {
                                    i11 = 0;
                                } else if (yf0VarArr5[i11] != yf0Var2) {
                                    i11++;
                                }
                            }
                            yf0VarArr4[i11] = yf0Var3;
                        }
                        Bitmap bitmap2 = yf0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / org.telegram.messenger.qs.K2));
                        synchronized (lf0Var.b) {
                            if (!yf0Var3.d) {
                                yf0Var3.f = false;
                                yf0Var3.b.eraseColor(0);
                            }
                            yf0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            yf0Var3.f = true;
                            Bitmap bitmap3 = yf0Var3.b;
                            int i12 = 0;
                            while (true) {
                                yf0[] yf0VarArr6 = lf0Var.c;
                                if (i12 >= yf0VarArr6.length) {
                                    i12 = 0;
                                } else if (yf0VarArr6[i12] != yf0Var2) {
                                    i12++;
                                }
                            }
                            lf0Var.b(i12, bitmap3);
                        }
                        if (!yf0Var2.d) {
                            yf0Var2.f = false;
                            yf0Var2.b.eraseColor(0);
                        }
                        yf0Var2.e = false;
                        if (!yf0Var2.d && yf0Var2.c) {
                            yf0Var2.d = true;
                            yf0Var2.b.recycle();
                        }
                        z9 = true;
                    }
                }
                if (z9 && lf0Var.e && lf0Var.h != null) {
                    lf0Var.postInvalidateOnAnimation();
                }
                if (lf0Var.e && (lf0Var.F || lf0Var.H)) {
                    org.telegram.messenger.g0.h3(new kf0(lf0Var, i7));
                    return;
                } else {
                    lf0Var.e = false;
                    return;
                }
            case 1:
                lf0 lf0Var2 = this.b;
                lf0Var2.H = true;
                lf0Var2.postInvalidateOnAnimation();
                return;
            default:
                lf0 lf0Var3 = this.b;
                lf0Var3.c();
                zf0.a.postRunnable(lf0Var3.s);
                return;
        }
    }
}
