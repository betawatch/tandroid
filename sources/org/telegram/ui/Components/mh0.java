package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nh0 b;

    public /* synthetic */ mh0(nh0 nh0Var, int i10) {
        this.a = i10;
        this.b = nh0Var;
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
        bi0[] bi0VarArr;
        switch (this.a) {
            case 0:
                nh0 nh0Var = this.b;
                synchronized (nh0Var.b) {
                    bi0[] bi0VarArr2 = nh0Var.c;
                    bi0 bi0Var = bi0VarArr2[0];
                    bi0[] bi0VarArr3 = nh0Var.d;
                    i10 = 2;
                    bi0VarArr = new bi0[]{bi0Var, bi0VarArr3[0], bi0VarArr2[1], bi0VarArr3[1], bi0VarArr2[2], bi0VarArr3[2]};
                }
                boolean z4 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    bi0 bi0Var2 = bi0VarArr[i11];
                    bi0 bi0Var3 = bi0VarArr[i11 + 1];
                    if (bi0Var2 != null && !bi0Var2.c && bi0Var2.f) {
                        bi0Var2.e = true;
                        if (bi0Var3 != null) {
                            Bitmap bitmap = bi0Var3.b;
                            if (!bi0Var3.d) {
                                if (bitmap.getWidth() == bi0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (bi0Var3 != null) {
                            bi0Var3.a();
                        }
                        bi0Var3 = new bi0();
                        Bitmap createBitmap = Bitmap.createBitmap(bi0Var2.b.getWidth(), bi0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        bi0Var3.b = createBitmap;
                        bi0Var3.a = new Canvas(createBitmap);
                        synchronized (nh0Var.b) {
                            bi0[] bi0VarArr4 = nh0Var.d;
                            int i12 = 0;
                            while (true) {
                                bi0[] bi0VarArr5 = nh0Var.c;
                                if (i12 >= bi0VarArr5.length) {
                                    i12 = 0;
                                } else if (bi0VarArr5[i12] != bi0Var2) {
                                    i12++;
                                }
                            }
                            bi0VarArr4[i12] = bi0Var3;
                        }
                        Bitmap bitmap2 = bi0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (nh0Var.b) {
                            if (!bi0Var3.d) {
                                bi0Var3.f = false;
                                bi0Var3.b.eraseColor(0);
                            }
                            bi0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            bi0Var3.f = true;
                            Bitmap bitmap3 = bi0Var3.b;
                            int i13 = 0;
                            while (true) {
                                bi0[] bi0VarArr6 = nh0Var.c;
                                if (i13 >= bi0VarArr6.length) {
                                    i13 = 0;
                                } else if (bi0VarArr6[i13] != bi0Var2) {
                                    i13++;
                                }
                            }
                            nh0Var.b(bitmap3, i13);
                        }
                        if (!bi0Var2.d) {
                            bi0Var2.f = false;
                            bi0Var2.b.eraseColor(0);
                        }
                        bi0Var2.e = false;
                        if (!bi0Var2.d && bi0Var2.c) {
                            bi0Var2.d = true;
                            bi0Var2.b.recycle();
                        }
                        z4 = true;
                    }
                }
                if (z4 && nh0Var.e && nh0Var.h != null) {
                    nh0Var.postInvalidateOnAnimation();
                }
                if (nh0Var.e && (nh0Var.C || nh0Var.E)) {
                    AndroidUtilities.runOnUIThread(new mh0(nh0Var, i10));
                    return;
                } else {
                    nh0Var.e = false;
                    return;
                }
            case 1:
                nh0 nh0Var2 = this.b;
                nh0Var2.E = true;
                nh0Var2.postInvalidateOnAnimation();
                return;
            default:
                nh0 nh0Var3 = this.b;
                nh0Var3.d();
                ci0.a.postRunnable(nh0Var3.s);
                return;
        }
    }
}
