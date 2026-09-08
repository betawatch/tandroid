package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fh0 b;

    public /* synthetic */ eh0(fh0 fh0Var, int i10) {
        this.a = i10;
        this.b = fh0Var;
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
        th0[] th0VarArr;
        switch (this.a) {
            case 0:
                fh0 fh0Var = this.b;
                synchronized (fh0Var.b) {
                    th0[] th0VarArr2 = fh0Var.c;
                    th0 th0Var = th0VarArr2[0];
                    th0[] th0VarArr3 = fh0Var.d;
                    i10 = 2;
                    th0VarArr = new th0[]{th0Var, th0VarArr3[0], th0VarArr2[1], th0VarArr3[1], th0VarArr2[2], th0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    th0 th0Var2 = th0VarArr[i11];
                    th0 th0Var3 = th0VarArr[i11 + 1];
                    if (th0Var2 != null && !th0Var2.c && th0Var2.f) {
                        th0Var2.e = true;
                        if (th0Var3 != null) {
                            Bitmap bitmap = th0Var3.b;
                            if (!th0Var3.d) {
                                if (bitmap.getWidth() == th0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (th0Var3 != null) {
                            th0Var3.a();
                        }
                        th0Var3 = new th0();
                        Bitmap createBitmap = Bitmap.createBitmap(th0Var2.b.getWidth(), th0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        th0Var3.b = createBitmap;
                        th0Var3.a = new Canvas(createBitmap);
                        synchronized (fh0Var.b) {
                            th0[] th0VarArr4 = fh0Var.d;
                            int i12 = 0;
                            while (true) {
                                th0[] th0VarArr5 = fh0Var.c;
                                if (i12 >= th0VarArr5.length) {
                                    i12 = 0;
                                } else if (th0VarArr5[i12] != th0Var2) {
                                    i12++;
                                }
                            }
                            th0VarArr4[i12] = th0Var3;
                        }
                        Bitmap bitmap2 = th0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (fh0Var.b) {
                            if (!th0Var3.d) {
                                th0Var3.f = false;
                                th0Var3.b.eraseColor(0);
                            }
                            th0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            th0Var3.f = true;
                            Bitmap bitmap3 = th0Var3.b;
                            int i13 = 0;
                            while (true) {
                                th0[] th0VarArr6 = fh0Var.c;
                                if (i13 >= th0VarArr6.length) {
                                    i13 = 0;
                                } else if (th0VarArr6[i13] != th0Var2) {
                                    i13++;
                                }
                            }
                            fh0Var.b(bitmap3, i13);
                        }
                        if (!th0Var2.d) {
                            th0Var2.f = false;
                            th0Var2.b.eraseColor(0);
                        }
                        th0Var2.e = false;
                        if (!th0Var2.d && th0Var2.c) {
                            th0Var2.d = true;
                            th0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && fh0Var.e && fh0Var.h != null) {
                    fh0Var.postInvalidateOnAnimation();
                }
                if (fh0Var.e && (fh0Var.F || fh0Var.H)) {
                    AndroidUtilities.runOnUIThread(new eh0(fh0Var, i10));
                    return;
                } else {
                    fh0Var.e = false;
                    return;
                }
            case 1:
                fh0 fh0Var2 = this.b;
                fh0Var2.H = true;
                fh0Var2.postInvalidateOnAnimation();
                return;
            default:
                fh0 fh0Var3 = this.b;
                fh0Var3.d();
                uh0.a.postRunnable(fh0Var3.s);
                return;
        }
    }
}
