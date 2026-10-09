package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ji0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki0 b;

    public /* synthetic */ ji0(ki0 ki0Var, int i10) {
        this.a = i10;
        this.b = ki0Var;
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
        yi0[] yi0VarArr;
        switch (this.a) {
            case 0:
                ki0 ki0Var = this.b;
                synchronized (ki0Var.b) {
                    yi0[] yi0VarArr2 = ki0Var.c;
                    yi0 yi0Var = yi0VarArr2[0];
                    yi0[] yi0VarArr3 = ki0Var.d;
                    i10 = 2;
                    yi0VarArr = new yi0[]{yi0Var, yi0VarArr3[0], yi0VarArr2[1], yi0VarArr3[1], yi0VarArr2[2], yi0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    yi0 yi0Var2 = yi0VarArr[i11];
                    yi0 yi0Var3 = yi0VarArr[i11 + 1];
                    if (yi0Var2 != null && !yi0Var2.c && yi0Var2.f) {
                        yi0Var2.e = true;
                        if (yi0Var3 != null) {
                            Bitmap bitmap = yi0Var3.b;
                            if (!yi0Var3.d) {
                                if (bitmap.getWidth() == yi0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (yi0Var3 != null) {
                            yi0Var3.a();
                        }
                        yi0Var3 = new yi0();
                        Bitmap createBitmap = Bitmap.createBitmap(yi0Var2.b.getWidth(), yi0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        yi0Var3.b = createBitmap;
                        yi0Var3.a = new Canvas(createBitmap);
                        synchronized (ki0Var.b) {
                            yi0[] yi0VarArr4 = ki0Var.d;
                            int i12 = 0;
                            while (true) {
                                yi0[] yi0VarArr5 = ki0Var.c;
                                if (i12 >= yi0VarArr5.length) {
                                    i12 = 0;
                                } else if (yi0VarArr5[i12] != yi0Var2) {
                                    i12++;
                                }
                            }
                            yi0VarArr4[i12] = yi0Var3;
                        }
                        Bitmap bitmap2 = yi0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (ki0Var.b) {
                            if (!yi0Var3.d) {
                                yi0Var3.f = false;
                                yi0Var3.b.eraseColor(0);
                            }
                            yi0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            yi0Var3.f = true;
                            Bitmap bitmap3 = yi0Var3.b;
                            int i13 = 0;
                            while (true) {
                                yi0[] yi0VarArr6 = ki0Var.c;
                                if (i13 >= yi0VarArr6.length) {
                                    i13 = 0;
                                } else if (yi0VarArr6[i13] != yi0Var2) {
                                    i13++;
                                }
                            }
                            ki0Var.b(bitmap3, i13);
                        }
                        if (!yi0Var2.d) {
                            yi0Var2.f = false;
                            yi0Var2.b.eraseColor(0);
                        }
                        yi0Var2.e = false;
                        if (!yi0Var2.d && yi0Var2.c) {
                            yi0Var2.d = true;
                            yi0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && ki0Var.e && ki0Var.h != null) {
                    ki0Var.postInvalidateOnAnimation();
                }
                if (ki0Var.e && (ki0Var.F || ki0Var.H)) {
                    AndroidUtilities.runOnUIThread(new ji0(ki0Var, i10));
                    return;
                } else {
                    ki0Var.e = false;
                    return;
                }
            case 1:
                ki0 ki0Var2 = this.b;
                ki0Var2.H = true;
                ki0Var2.postInvalidateOnAnimation();
                return;
            default:
                ki0 ki0Var3 = this.b;
                ki0Var3.d();
                zi0.a.postRunnable(ki0Var3.s);
                return;
        }
    }
}
