package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg0 b;

    public /* synthetic */ qg0(rg0 rg0Var, int i9) {
        this.a = i9;
        this.b = rg0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r3.getHeight() != r5.b.getHeight()) goto L30;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i9;
        fh0[] fh0VarArr;
        switch (this.a) {
            case 0:
                rg0 rg0Var = this.b;
                synchronized (rg0Var.b) {
                    fh0[] fh0VarArr2 = rg0Var.c;
                    fh0 fh0Var = fh0VarArr2[0];
                    fh0[] fh0VarArr3 = rg0Var.d;
                    i9 = 2;
                    fh0VarArr = new fh0[]{fh0Var, fh0VarArr3[0], fh0VarArr2[1], fh0VarArr3[1], fh0VarArr2[2], fh0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i10 = 0; i10 < 6; i10 += 2) {
                    fh0 fh0Var2 = fh0VarArr[i10];
                    fh0 fh0Var3 = fh0VarArr[i10 + 1];
                    if (fh0Var2 != null && !fh0Var2.c && fh0Var2.f) {
                        fh0Var2.e = true;
                        if (fh0Var3 != null) {
                            Bitmap bitmap = fh0Var3.b;
                            if (!fh0Var3.d) {
                                if (bitmap.getWidth() == fh0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (fh0Var3 != null) {
                            fh0Var3.a();
                        }
                        fh0Var3 = new fh0();
                        Bitmap createBitmap = Bitmap.createBitmap(fh0Var2.b.getWidth(), fh0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        fh0Var3.b = createBitmap;
                        fh0Var3.a = new Canvas(createBitmap);
                        synchronized (rg0Var.b) {
                            fh0[] fh0VarArr4 = rg0Var.d;
                            int i11 = 0;
                            while (true) {
                                fh0[] fh0VarArr5 = rg0Var.c;
                                if (i11 >= fh0VarArr5.length) {
                                    i11 = 0;
                                } else if (fh0VarArr5[i11] != fh0Var2) {
                                    i11++;
                                }
                            }
                            fh0VarArr4[i11] = fh0Var3;
                        }
                        Bitmap bitmap2 = fh0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (rg0Var.b) {
                            if (!fh0Var3.d) {
                                fh0Var3.f = false;
                                fh0Var3.b.eraseColor(0);
                            }
                            fh0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            fh0Var3.f = true;
                            Bitmap bitmap3 = fh0Var3.b;
                            int i12 = 0;
                            while (true) {
                                fh0[] fh0VarArr6 = rg0Var.c;
                                if (i12 >= fh0VarArr6.length) {
                                    i12 = 0;
                                } else if (fh0VarArr6[i12] != fh0Var2) {
                                    i12++;
                                }
                            }
                            rg0Var.b(bitmap3, i12);
                        }
                        if (!fh0Var2.d) {
                            fh0Var2.f = false;
                            fh0Var2.b.eraseColor(0);
                        }
                        fh0Var2.e = false;
                        if (!fh0Var2.d && fh0Var2.c) {
                            fh0Var2.d = true;
                            fh0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && rg0Var.e && rg0Var.h != null) {
                    rg0Var.postInvalidateOnAnimation();
                }
                if (rg0Var.e && (rg0Var.B || rg0Var.D)) {
                    AndroidUtilities.runOnUIThread(new qg0(rg0Var, i9));
                    return;
                } else {
                    rg0Var.e = false;
                    return;
                }
            case 1:
                rg0 rg0Var2 = this.b;
                rg0Var2.D = true;
                rg0Var2.postInvalidateOnAnimation();
                return;
            default:
                rg0 rg0Var3 = this.b;
                rg0Var3.d();
                gh0.a.postRunnable(rg0Var3.s);
                return;
        }
    }
}
