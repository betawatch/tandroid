package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qh0 b;

    public /* synthetic */ ph0(qh0 qh0Var, int i10) {
        this.a = i10;
        this.b = qh0Var;
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
        ei0[] ei0VarArr;
        switch (this.a) {
            case 0:
                qh0 qh0Var = this.b;
                synchronized (qh0Var.b) {
                    ei0[] ei0VarArr2 = qh0Var.c;
                    ei0 ei0Var = ei0VarArr2[0];
                    ei0[] ei0VarArr3 = qh0Var.d;
                    i10 = 2;
                    ei0VarArr = new ei0[]{ei0Var, ei0VarArr3[0], ei0VarArr2[1], ei0VarArr3[1], ei0VarArr2[2], ei0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    ei0 ei0Var2 = ei0VarArr[i11];
                    ei0 ei0Var3 = ei0VarArr[i11 + 1];
                    if (ei0Var2 != null && !ei0Var2.c && ei0Var2.f) {
                        ei0Var2.e = true;
                        if (ei0Var3 != null) {
                            Bitmap bitmap = ei0Var3.b;
                            if (!ei0Var3.d) {
                                if (bitmap.getWidth() == ei0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (ei0Var3 != null) {
                            ei0Var3.a();
                        }
                        ei0Var3 = new ei0();
                        Bitmap createBitmap = Bitmap.createBitmap(ei0Var2.b.getWidth(), ei0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        ei0Var3.b = createBitmap;
                        ei0Var3.a = new Canvas(createBitmap);
                        synchronized (qh0Var.b) {
                            ei0[] ei0VarArr4 = qh0Var.d;
                            int i12 = 0;
                            while (true) {
                                ei0[] ei0VarArr5 = qh0Var.c;
                                if (i12 >= ei0VarArr5.length) {
                                    i12 = 0;
                                } else if (ei0VarArr5[i12] != ei0Var2) {
                                    i12++;
                                }
                            }
                            ei0VarArr4[i12] = ei0Var3;
                        }
                        Bitmap bitmap2 = ei0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (qh0Var.b) {
                            if (!ei0Var3.d) {
                                ei0Var3.f = false;
                                ei0Var3.b.eraseColor(0);
                            }
                            ei0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            ei0Var3.f = true;
                            Bitmap bitmap3 = ei0Var3.b;
                            int i13 = 0;
                            while (true) {
                                ei0[] ei0VarArr6 = qh0Var.c;
                                if (i13 >= ei0VarArr6.length) {
                                    i13 = 0;
                                } else if (ei0VarArr6[i13] != ei0Var2) {
                                    i13++;
                                }
                            }
                            qh0Var.b(bitmap3, i13);
                        }
                        if (!ei0Var2.d) {
                            ei0Var2.f = false;
                            ei0Var2.b.eraseColor(0);
                        }
                        ei0Var2.e = false;
                        if (!ei0Var2.d && ei0Var2.c) {
                            ei0Var2.d = true;
                            ei0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && qh0Var.e && qh0Var.h != null) {
                    qh0Var.postInvalidateOnAnimation();
                }
                if (qh0Var.e && (qh0Var.F || qh0Var.H)) {
                    AndroidUtilities.runOnUIThread(new ph0(qh0Var, i10));
                    return;
                } else {
                    qh0Var.e = false;
                    return;
                }
            case 1:
                qh0 qh0Var2 = this.b;
                qh0Var2.H = true;
                qh0Var2.postInvalidateOnAnimation();
                return;
            default:
                qh0 qh0Var3 = this.b;
                qh0Var3.d();
                fi0.a.postRunnable(qh0Var3.s);
                return;
        }
    }
}
