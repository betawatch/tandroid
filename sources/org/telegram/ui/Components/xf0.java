package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yf0 b;

    public /* synthetic */ xf0(yf0 yf0Var, int i7) {
        this.a = i7;
        this.b = yf0Var;
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
        lg0[] lg0VarArr;
        switch (this.a) {
            case 0:
                yf0 yf0Var = this.b;
                synchronized (yf0Var.b) {
                    lg0[] lg0VarArr2 = yf0Var.c;
                    lg0 lg0Var = lg0VarArr2[0];
                    lg0[] lg0VarArr3 = yf0Var.d;
                    i7 = 2;
                    lg0VarArr = new lg0[]{lg0Var, lg0VarArr3[0], lg0VarArr2[1], lg0VarArr3[1], lg0VarArr2[2], lg0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i10 = 0; i10 < 6; i10 += 2) {
                    lg0 lg0Var2 = lg0VarArr[i10];
                    lg0 lg0Var3 = lg0VarArr[i10 + 1];
                    if (lg0Var2 != null && !lg0Var2.c && lg0Var2.f) {
                        lg0Var2.e = true;
                        if (lg0Var3 != null) {
                            Bitmap bitmap = lg0Var3.b;
                            if (!lg0Var3.d) {
                                if (bitmap.getWidth() == lg0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (lg0Var3 != null) {
                            lg0Var3.a();
                        }
                        lg0Var3 = new lg0();
                        Bitmap createBitmap = Bitmap.createBitmap(lg0Var2.b.getWidth(), lg0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        lg0Var3.b = createBitmap;
                        lg0Var3.a = new Canvas(createBitmap);
                        synchronized (yf0Var.b) {
                            lg0[] lg0VarArr4 = yf0Var.d;
                            int i11 = 0;
                            while (true) {
                                lg0[] lg0VarArr5 = yf0Var.c;
                                if (i11 >= lg0VarArr5.length) {
                                    i11 = 0;
                                } else if (lg0VarArr5[i11] != lg0Var2) {
                                    i11++;
                                }
                            }
                            lg0VarArr4[i11] = lg0Var3;
                        }
                        Bitmap bitmap2 = lg0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / org.telegram.messenger.ks.K2));
                        synchronized (yf0Var.b) {
                            if (!lg0Var3.d) {
                                lg0Var3.f = false;
                                lg0Var3.b.eraseColor(0);
                            }
                            lg0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            lg0Var3.f = true;
                            Bitmap bitmap3 = lg0Var3.b;
                            int i12 = 0;
                            while (true) {
                                lg0[] lg0VarArr6 = yf0Var.c;
                                if (i12 >= lg0VarArr6.length) {
                                    i12 = 0;
                                } else if (lg0VarArr6[i12] != lg0Var2) {
                                    i12++;
                                }
                            }
                            yf0Var.b(i12, bitmap3);
                        }
                        if (!lg0Var2.d) {
                            lg0Var2.f = false;
                            lg0Var2.b.eraseColor(0);
                        }
                        lg0Var2.e = false;
                        if (!lg0Var2.d && lg0Var2.c) {
                            lg0Var2.d = true;
                            lg0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && yf0Var.e && yf0Var.h != null) {
                    yf0Var.postInvalidateOnAnimation();
                }
                if (yf0Var.e && (yf0Var.G || yf0Var.I)) {
                    org.telegram.messenger.g0.g3(new xf0(yf0Var, i7));
                    return;
                } else {
                    yf0Var.e = false;
                    return;
                }
            case 1:
                yf0 yf0Var2 = this.b;
                yf0Var2.I = true;
                yf0Var2.postInvalidateOnAnimation();
                return;
            default:
                yf0 yf0Var3 = this.b;
                yf0Var3.c();
                mg0.a.postRunnable(yf0Var3.s);
                return;
        }
    }
}
