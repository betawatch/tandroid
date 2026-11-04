package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nf0 b;

    public /* synthetic */ mf0(nf0 nf0Var, int i3) {
        this.a = i3;
        this.b = nf0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r3.getHeight() != r5.b.getHeight()) goto L30;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        ag0[] ag0VarArr;
        switch (this.a) {
            case 0:
                nf0 nf0Var = this.b;
                synchronized (nf0Var.b) {
                    ag0[] ag0VarArr2 = nf0Var.c;
                    ag0 ag0Var = ag0VarArr2[0];
                    ag0[] ag0VarArr3 = nf0Var.d;
                    i3 = 2;
                    ag0VarArr = new ag0[]{ag0Var, ag0VarArr3[0], ag0VarArr2[1], ag0VarArr3[1], ag0VarArr2[2], ag0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i10 = 0; i10 < 6; i10 += 2) {
                    ag0 ag0Var2 = ag0VarArr[i10];
                    ag0 ag0Var3 = ag0VarArr[i10 + 1];
                    if (ag0Var2 != null && !ag0Var2.c && ag0Var2.f) {
                        ag0Var2.e = true;
                        if (ag0Var3 != null) {
                            Bitmap bitmap = ag0Var3.b;
                            if (!ag0Var3.d) {
                                if (bitmap.getWidth() == ag0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (ag0Var3 != null) {
                            ag0Var3.a();
                        }
                        ag0Var3 = new ag0();
                        Bitmap createBitmap = Bitmap.createBitmap(ag0Var2.b.getWidth(), ag0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        ag0Var3.b = createBitmap;
                        ag0Var3.a = new Canvas(createBitmap);
                        synchronized (nf0Var.b) {
                            ag0[] ag0VarArr4 = nf0Var.d;
                            int i11 = 0;
                            while (true) {
                                ag0[] ag0VarArr5 = nf0Var.c;
                                if (i11 >= ag0VarArr5.length) {
                                    i11 = 0;
                                } else if (ag0VarArr5[i11] != ag0Var2) {
                                    i11++;
                                }
                            }
                            ag0VarArr4[i11] = ag0Var3;
                        }
                        Bitmap bitmap2 = ag0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / org.telegram.messenger.hs.K2));
                        synchronized (nf0Var.b) {
                            if (!ag0Var3.d) {
                                ag0Var3.f = false;
                                ag0Var3.b.eraseColor(0);
                            }
                            ag0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            ag0Var3.f = true;
                            Bitmap bitmap3 = ag0Var3.b;
                            int i12 = 0;
                            while (true) {
                                ag0[] ag0VarArr6 = nf0Var.c;
                                if (i12 >= ag0VarArr6.length) {
                                    i12 = 0;
                                } else if (ag0VarArr6[i12] != ag0Var2) {
                                    i12++;
                                }
                            }
                            nf0Var.b(bitmap3, i12);
                        }
                        if (!ag0Var2.d) {
                            ag0Var2.f = false;
                            ag0Var2.b.eraseColor(0);
                        }
                        ag0Var2.e = false;
                        if (!ag0Var2.d && ag0Var2.c) {
                            ag0Var2.d = true;
                            ag0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && nf0Var.e && nf0Var.h != null) {
                    nf0Var.postInvalidateOnAnimation();
                }
                if (nf0Var.e && (nf0Var.G || nf0Var.I)) {
                    org.telegram.messenger.g0.h3(new mf0(nf0Var, i3));
                    return;
                } else {
                    nf0Var.e = false;
                    return;
                }
            case 1:
                nf0 nf0Var2 = this.b;
                nf0Var2.I = true;
                nf0Var2.postInvalidateOnAnimation();
                return;
            default:
                nf0 nf0Var3 = this.b;
                nf0Var3.c();
                bg0.a.postRunnable(nf0Var3.s);
                return;
        }
    }
}
