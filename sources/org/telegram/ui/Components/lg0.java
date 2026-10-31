package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mg0 b;

    public /* synthetic */ lg0(mg0 mg0Var, int i10) {
        this.a = i10;
        this.b = mg0Var;
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
        zg0[] zg0VarArr;
        switch (this.a) {
            case 0:
                mg0 mg0Var = this.b;
                synchronized (mg0Var.b) {
                    zg0[] zg0VarArr2 = mg0Var.c;
                    zg0 zg0Var = zg0VarArr2[0];
                    zg0[] zg0VarArr3 = mg0Var.d;
                    i10 = 2;
                    zg0VarArr = new zg0[]{zg0Var, zg0VarArr3[0], zg0VarArr2[1], zg0VarArr3[1], zg0VarArr2[2], zg0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    zg0 zg0Var2 = zg0VarArr[i11];
                    zg0 zg0Var3 = zg0VarArr[i11 + 1];
                    if (zg0Var2 != null && !zg0Var2.c && zg0Var2.f) {
                        zg0Var2.e = true;
                        if (zg0Var3 != null) {
                            Bitmap bitmap = zg0Var3.b;
                            if (!zg0Var3.d) {
                                if (bitmap.getWidth() == zg0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (zg0Var3 != null) {
                            zg0Var3.a();
                        }
                        zg0Var3 = new zg0();
                        Bitmap createBitmap = Bitmap.createBitmap(zg0Var2.b.getWidth(), zg0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        zg0Var3.b = createBitmap;
                        zg0Var3.a = new Canvas(createBitmap);
                        synchronized (mg0Var.b) {
                            zg0[] zg0VarArr4 = mg0Var.d;
                            int i12 = 0;
                            while (true) {
                                zg0[] zg0VarArr5 = mg0Var.c;
                                if (i12 >= zg0VarArr5.length) {
                                    i12 = 0;
                                } else if (zg0VarArr5[i12] != zg0Var2) {
                                    i12++;
                                }
                            }
                            zg0VarArr4[i12] = zg0Var3;
                        }
                        Bitmap bitmap2 = zg0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / org.telegram.messenger.zs.K2));
                        synchronized (mg0Var.b) {
                            if (!zg0Var3.d) {
                                zg0Var3.f = false;
                                zg0Var3.b.eraseColor(0);
                            }
                            zg0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            zg0Var3.f = true;
                            Bitmap bitmap3 = zg0Var3.b;
                            int i13 = 0;
                            while (true) {
                                zg0[] zg0VarArr6 = mg0Var.c;
                                if (i13 >= zg0VarArr6.length) {
                                    i13 = 0;
                                } else if (zg0VarArr6[i13] != zg0Var2) {
                                    i13++;
                                }
                            }
                            mg0Var.b(bitmap3, i13);
                        }
                        if (!zg0Var2.d) {
                            zg0Var2.f = false;
                            zg0Var2.b.eraseColor(0);
                        }
                        zg0Var2.e = false;
                        if (!zg0Var2.d && zg0Var2.c) {
                            zg0Var2.d = true;
                            zg0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && mg0Var.e && mg0Var.h != null) {
                    mg0Var.postInvalidateOnAnimation();
                }
                if (mg0Var.e && (mg0Var.F || mg0Var.H)) {
                    org.telegram.messenger.i0.g3(new lg0(mg0Var, i10));
                    return;
                } else {
                    mg0Var.e = false;
                    return;
                }
            case 1:
                mg0 mg0Var2 = this.b;
                mg0Var2.H = true;
                mg0Var2.postInvalidateOnAnimation();
                return;
            default:
                mg0 mg0Var3 = this.b;
                mg0Var3.c();
                ah0.a.postRunnable(mg0Var3.s);
                return;
        }
    }
}
