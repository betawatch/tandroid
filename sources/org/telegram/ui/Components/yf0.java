package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf0 b;

    public /* synthetic */ yf0(zf0 zf0Var, int i7) {
        this.a = i7;
        this.b = zf0Var;
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
        mg0[] mg0VarArr;
        switch (this.a) {
            case 0:
                zf0 zf0Var = this.b;
                synchronized (zf0Var.b) {
                    mg0[] mg0VarArr2 = zf0Var.c;
                    mg0 mg0Var = mg0VarArr2[0];
                    mg0[] mg0VarArr3 = zf0Var.d;
                    i7 = 2;
                    mg0VarArr = new mg0[]{mg0Var, mg0VarArr3[0], mg0VarArr2[1], mg0VarArr3[1], mg0VarArr2[2], mg0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i10 = 0; i10 < 6; i10 += 2) {
                    mg0 mg0Var2 = mg0VarArr[i10];
                    mg0 mg0Var3 = mg0VarArr[i10 + 1];
                    if (mg0Var2 != null && !mg0Var2.c && mg0Var2.f) {
                        mg0Var2.e = true;
                        if (mg0Var3 != null) {
                            Bitmap bitmap = mg0Var3.b;
                            if (!mg0Var3.d) {
                                if (bitmap.getWidth() == mg0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (mg0Var3 != null) {
                            mg0Var3.a();
                        }
                        mg0Var3 = new mg0();
                        Bitmap createBitmap = Bitmap.createBitmap(mg0Var2.b.getWidth(), mg0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        mg0Var3.b = createBitmap;
                        mg0Var3.a = new Canvas(createBitmap);
                        synchronized (zf0Var.b) {
                            mg0[] mg0VarArr4 = zf0Var.d;
                            int i11 = 0;
                            while (true) {
                                mg0[] mg0VarArr5 = zf0Var.c;
                                if (i11 >= mg0VarArr5.length) {
                                    i11 = 0;
                                } else if (mg0VarArr5[i11] != mg0Var2) {
                                    i11++;
                                }
                            }
                            mg0VarArr4[i11] = mg0Var3;
                        }
                        Bitmap bitmap2 = mg0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / org.telegram.messenger.ls.K2));
                        synchronized (zf0Var.b) {
                            if (!mg0Var3.d) {
                                mg0Var3.f = false;
                                mg0Var3.b.eraseColor(0);
                            }
                            mg0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            mg0Var3.f = true;
                            Bitmap bitmap3 = mg0Var3.b;
                            int i12 = 0;
                            while (true) {
                                mg0[] mg0VarArr6 = zf0Var.c;
                                if (i12 >= mg0VarArr6.length) {
                                    i12 = 0;
                                } else if (mg0VarArr6[i12] != mg0Var2) {
                                    i12++;
                                }
                            }
                            zf0Var.b(i12, bitmap3);
                        }
                        if (!mg0Var2.d) {
                            mg0Var2.f = false;
                            mg0Var2.b.eraseColor(0);
                        }
                        mg0Var2.e = false;
                        if (!mg0Var2.d && mg0Var2.c) {
                            mg0Var2.d = true;
                            mg0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && zf0Var.e && zf0Var.h != null) {
                    zf0Var.postInvalidateOnAnimation();
                }
                if (zf0Var.e && (zf0Var.G || zf0Var.I)) {
                    org.telegram.messenger.g0.g3(new yf0(zf0Var, i7));
                    return;
                } else {
                    zf0Var.e = false;
                    return;
                }
            case 1:
                zf0 zf0Var2 = this.b;
                zf0Var2.I = true;
                zf0Var2.postInvalidateOnAnimation();
                return;
            default:
                zf0 zf0Var3 = this.b;
                zf0Var3.c();
                ng0.a.postRunnable(zf0Var3.s);
                return;
        }
    }
}
