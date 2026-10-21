package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci0 b;

    public /* synthetic */ bi0(ci0 ci0Var, int i10) {
        this.a = i10;
        this.b = ci0Var;
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
        qi0[] qi0VarArr;
        switch (this.a) {
            case 0:
                ci0 ci0Var = this.b;
                synchronized (ci0Var.b) {
                    qi0[] qi0VarArr2 = ci0Var.c;
                    qi0 qi0Var = qi0VarArr2[0];
                    qi0[] qi0VarArr3 = ci0Var.d;
                    i10 = 2;
                    qi0VarArr = new qi0[]{qi0Var, qi0VarArr3[0], qi0VarArr2[1], qi0VarArr3[1], qi0VarArr2[2], qi0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    qi0 qi0Var2 = qi0VarArr[i11];
                    qi0 qi0Var3 = qi0VarArr[i11 + 1];
                    if (qi0Var2 != null && !qi0Var2.c && qi0Var2.f) {
                        qi0Var2.e = true;
                        if (qi0Var3 != null) {
                            Bitmap bitmap = qi0Var3.b;
                            if (!qi0Var3.d) {
                                if (bitmap.getWidth() == qi0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (qi0Var3 != null) {
                            qi0Var3.a();
                        }
                        qi0Var3 = new qi0();
                        Bitmap createBitmap = Bitmap.createBitmap(qi0Var2.b.getWidth(), qi0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        qi0Var3.b = createBitmap;
                        qi0Var3.a = new Canvas(createBitmap);
                        synchronized (ci0Var.b) {
                            qi0[] qi0VarArr4 = ci0Var.d;
                            int i12 = 0;
                            while (true) {
                                qi0[] qi0VarArr5 = ci0Var.c;
                                if (i12 >= qi0VarArr5.length) {
                                    i12 = 0;
                                } else if (qi0VarArr5[i12] != qi0Var2) {
                                    i12++;
                                }
                            }
                            qi0VarArr4[i12] = qi0Var3;
                        }
                        Bitmap bitmap2 = qi0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (ci0Var.b) {
                            if (!qi0Var3.d) {
                                qi0Var3.f = false;
                                qi0Var3.b.eraseColor(0);
                            }
                            qi0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            qi0Var3.f = true;
                            Bitmap bitmap3 = qi0Var3.b;
                            int i13 = 0;
                            while (true) {
                                qi0[] qi0VarArr6 = ci0Var.c;
                                if (i13 >= qi0VarArr6.length) {
                                    i13 = 0;
                                } else if (qi0VarArr6[i13] != qi0Var2) {
                                    i13++;
                                }
                            }
                            ci0Var.b(bitmap3, i13);
                        }
                        if (!qi0Var2.d) {
                            qi0Var2.f = false;
                            qi0Var2.b.eraseColor(0);
                        }
                        qi0Var2.e = false;
                        if (!qi0Var2.d && qi0Var2.c) {
                            qi0Var2.d = true;
                            qi0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && ci0Var.e && ci0Var.h != null) {
                    ci0Var.postInvalidateOnAnimation();
                }
                if (ci0Var.e && (ci0Var.F || ci0Var.H)) {
                    AndroidUtilities.runOnUIThread(new bi0(ci0Var, i10));
                    return;
                } else {
                    ci0Var.e = false;
                    return;
                }
            case 1:
                ci0 ci0Var2 = this.b;
                ci0Var2.H = true;
                ci0Var2.postInvalidateOnAnimation();
                return;
            default:
                ci0 ci0Var3 = this.b;
                ci0Var3.d();
                ri0.a.postRunnable(ci0Var3.s);
                return;
        }
    }
}
