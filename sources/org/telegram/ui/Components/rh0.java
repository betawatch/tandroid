package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sh0 b;

    public /* synthetic */ rh0(sh0 sh0Var, int i10) {
        this.a = i10;
        this.b = sh0Var;
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
        gi0[] gi0VarArr;
        switch (this.a) {
            case 0:
                sh0 sh0Var = this.b;
                synchronized (sh0Var.b) {
                    gi0[] gi0VarArr2 = sh0Var.c;
                    gi0 gi0Var = gi0VarArr2[0];
                    gi0[] gi0VarArr3 = sh0Var.d;
                    i10 = 2;
                    gi0VarArr = new gi0[]{gi0Var, gi0VarArr3[0], gi0VarArr2[1], gi0VarArr3[1], gi0VarArr2[2], gi0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    gi0 gi0Var2 = gi0VarArr[i11];
                    gi0 gi0Var3 = gi0VarArr[i11 + 1];
                    if (gi0Var2 != null && !gi0Var2.c && gi0Var2.f) {
                        gi0Var2.e = true;
                        if (gi0Var3 != null) {
                            Bitmap bitmap = gi0Var3.b;
                            if (!gi0Var3.d) {
                                if (bitmap.getWidth() == gi0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (gi0Var3 != null) {
                            gi0Var3.a();
                        }
                        gi0Var3 = new gi0();
                        Bitmap createBitmap = Bitmap.createBitmap(gi0Var2.b.getWidth(), gi0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        gi0Var3.b = createBitmap;
                        gi0Var3.a = new Canvas(createBitmap);
                        synchronized (sh0Var.b) {
                            gi0[] gi0VarArr4 = sh0Var.d;
                            int i12 = 0;
                            while (true) {
                                gi0[] gi0VarArr5 = sh0Var.c;
                                if (i12 >= gi0VarArr5.length) {
                                    i12 = 0;
                                } else if (gi0VarArr5[i12] != gi0Var2) {
                                    i12++;
                                }
                            }
                            gi0VarArr4[i12] = gi0Var3;
                        }
                        Bitmap bitmap2 = gi0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (sh0Var.b) {
                            if (!gi0Var3.d) {
                                gi0Var3.f = false;
                                gi0Var3.b.eraseColor(0);
                            }
                            gi0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            gi0Var3.f = true;
                            Bitmap bitmap3 = gi0Var3.b;
                            int i13 = 0;
                            while (true) {
                                gi0[] gi0VarArr6 = sh0Var.c;
                                if (i13 >= gi0VarArr6.length) {
                                    i13 = 0;
                                } else if (gi0VarArr6[i13] != gi0Var2) {
                                    i13++;
                                }
                            }
                            sh0Var.b(bitmap3, i13);
                        }
                        if (!gi0Var2.d) {
                            gi0Var2.f = false;
                            gi0Var2.b.eraseColor(0);
                        }
                        gi0Var2.e = false;
                        if (!gi0Var2.d && gi0Var2.c) {
                            gi0Var2.d = true;
                            gi0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && sh0Var.e && sh0Var.h != null) {
                    sh0Var.postInvalidateOnAnimation();
                }
                if (sh0Var.e && (sh0Var.F || sh0Var.H)) {
                    AndroidUtilities.runOnUIThread(new rh0(sh0Var, i10));
                    return;
                } else {
                    sh0Var.e = false;
                    return;
                }
            case 1:
                sh0 sh0Var2 = this.b;
                sh0Var2.H = true;
                sh0Var2.postInvalidateOnAnimation();
                return;
            default:
                sh0 sh0Var3 = this.b;
                sh0Var3.d();
                hi0.a.postRunnable(sh0Var3.s);
                return;
        }
    }
}
