package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class di0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ei0 b;

    public /* synthetic */ di0(ei0 ei0Var, int i10) {
        this.a = i10;
        this.b = ei0Var;
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
        si0[] si0VarArr;
        switch (this.a) {
            case 0:
                ei0 ei0Var = this.b;
                synchronized (ei0Var.b) {
                    si0[] si0VarArr2 = ei0Var.c;
                    si0 si0Var = si0VarArr2[0];
                    si0[] si0VarArr3 = ei0Var.d;
                    i10 = 2;
                    si0VarArr = new si0[]{si0Var, si0VarArr3[0], si0VarArr2[1], si0VarArr3[1], si0VarArr2[2], si0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    si0 si0Var2 = si0VarArr[i11];
                    si0 si0Var3 = si0VarArr[i11 + 1];
                    if (si0Var2 != null && !si0Var2.c && si0Var2.f) {
                        si0Var2.e = true;
                        if (si0Var3 != null) {
                            Bitmap bitmap = si0Var3.b;
                            if (!si0Var3.d) {
                                if (bitmap.getWidth() == si0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (si0Var3 != null) {
                            si0Var3.a();
                        }
                        si0Var3 = new si0();
                        Bitmap createBitmap = Bitmap.createBitmap(si0Var2.b.getWidth(), si0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        si0Var3.b = createBitmap;
                        si0Var3.a = new Canvas(createBitmap);
                        synchronized (ei0Var.b) {
                            si0[] si0VarArr4 = ei0Var.d;
                            int i12 = 0;
                            while (true) {
                                si0[] si0VarArr5 = ei0Var.c;
                                if (i12 >= si0VarArr5.length) {
                                    i12 = 0;
                                } else if (si0VarArr5[i12] != si0Var2) {
                                    i12++;
                                }
                            }
                            si0VarArr4[i12] = si0Var3;
                        }
                        Bitmap bitmap2 = si0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (ei0Var.b) {
                            if (!si0Var3.d) {
                                si0Var3.f = false;
                                si0Var3.b.eraseColor(0);
                            }
                            si0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            si0Var3.f = true;
                            Bitmap bitmap3 = si0Var3.b;
                            int i13 = 0;
                            while (true) {
                                si0[] si0VarArr6 = ei0Var.c;
                                if (i13 >= si0VarArr6.length) {
                                    i13 = 0;
                                } else if (si0VarArr6[i13] != si0Var2) {
                                    i13++;
                                }
                            }
                            ei0Var.b(bitmap3, i13);
                        }
                        if (!si0Var2.d) {
                            si0Var2.f = false;
                            si0Var2.b.eraseColor(0);
                        }
                        si0Var2.e = false;
                        if (!si0Var2.d && si0Var2.c) {
                            si0Var2.d = true;
                            si0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && ei0Var.e && ei0Var.h != null) {
                    ei0Var.postInvalidateOnAnimation();
                }
                if (ei0Var.e && (ei0Var.F || ei0Var.H)) {
                    AndroidUtilities.runOnUIThread(new di0(ei0Var, i10));
                    return;
                } else {
                    ei0Var.e = false;
                    return;
                }
            case 1:
                ei0 ei0Var2 = this.b;
                ei0Var2.H = true;
                ei0Var2.postInvalidateOnAnimation();
                return;
            default:
                ei0 ei0Var3 = this.b;
                ei0Var3.d();
                ti0.a.postRunnable(ei0Var3.s);
                return;
        }
    }
}
