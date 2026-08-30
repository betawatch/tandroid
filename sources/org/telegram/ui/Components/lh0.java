package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh0 b;

    public /* synthetic */ lh0(mh0 mh0Var, int i10) {
        this.a = i10;
        this.b = mh0Var;
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
        ai0[] ai0VarArr;
        switch (this.a) {
            case 0:
                mh0 mh0Var = this.b;
                synchronized (mh0Var.b) {
                    ai0[] ai0VarArr2 = mh0Var.c;
                    ai0 ai0Var = ai0VarArr2[0];
                    ai0[] ai0VarArr3 = mh0Var.d;
                    i10 = 2;
                    ai0VarArr = new ai0[]{ai0Var, ai0VarArr3[0], ai0VarArr2[1], ai0VarArr3[1], ai0VarArr2[2], ai0VarArr3[2]};
                }
                boolean z4 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    ai0 ai0Var2 = ai0VarArr[i11];
                    ai0 ai0Var3 = ai0VarArr[i11 + 1];
                    if (ai0Var2 != null && !ai0Var2.c && ai0Var2.f) {
                        ai0Var2.e = true;
                        if (ai0Var3 != null) {
                            Bitmap bitmap = ai0Var3.b;
                            if (!ai0Var3.d) {
                                if (bitmap.getWidth() == ai0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (ai0Var3 != null) {
                            ai0Var3.a();
                        }
                        ai0Var3 = new ai0();
                        Bitmap createBitmap = Bitmap.createBitmap(ai0Var2.b.getWidth(), ai0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        ai0Var3.b = createBitmap;
                        ai0Var3.a = new Canvas(createBitmap);
                        synchronized (mh0Var.b) {
                            ai0[] ai0VarArr4 = mh0Var.d;
                            int i12 = 0;
                            while (true) {
                                ai0[] ai0VarArr5 = mh0Var.c;
                                if (i12 >= ai0VarArr5.length) {
                                    i12 = 0;
                                } else if (ai0VarArr5[i12] != ai0Var2) {
                                    i12++;
                                }
                            }
                            ai0VarArr4[i12] = ai0Var3;
                        }
                        Bitmap bitmap2 = ai0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (mh0Var.b) {
                            if (!ai0Var3.d) {
                                ai0Var3.f = false;
                                ai0Var3.b.eraseColor(0);
                            }
                            ai0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            ai0Var3.f = true;
                            Bitmap bitmap3 = ai0Var3.b;
                            int i13 = 0;
                            while (true) {
                                ai0[] ai0VarArr6 = mh0Var.c;
                                if (i13 >= ai0VarArr6.length) {
                                    i13 = 0;
                                } else if (ai0VarArr6[i13] != ai0Var2) {
                                    i13++;
                                }
                            }
                            mh0Var.b(bitmap3, i13);
                        }
                        if (!ai0Var2.d) {
                            ai0Var2.f = false;
                            ai0Var2.b.eraseColor(0);
                        }
                        ai0Var2.e = false;
                        if (!ai0Var2.d && ai0Var2.c) {
                            ai0Var2.d = true;
                            ai0Var2.b.recycle();
                        }
                        z4 = true;
                    }
                }
                if (z4 && mh0Var.e && mh0Var.h != null) {
                    mh0Var.postInvalidateOnAnimation();
                }
                if (mh0Var.e && (mh0Var.C || mh0Var.E)) {
                    AndroidUtilities.runOnUIThread(new lh0(mh0Var, i10));
                    return;
                } else {
                    mh0Var.e = false;
                    return;
                }
            case 1:
                mh0 mh0Var2 = this.b;
                mh0Var2.E = true;
                mh0Var2.postInvalidateOnAnimation();
                return;
            default:
                mh0 mh0Var3 = this.b;
                mh0Var3.d();
                bi0.a.postRunnable(mh0Var3.s);
                return;
        }
    }
}
