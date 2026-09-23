package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh0 b;

    public /* synthetic */ fh0(gh0 gh0Var, int i10) {
        this.a = i10;
        this.b = gh0Var;
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
        uh0[] uh0VarArr;
        switch (this.a) {
            case 0:
                gh0 gh0Var = this.b;
                synchronized (gh0Var.b) {
                    uh0[] uh0VarArr2 = gh0Var.c;
                    uh0 uh0Var = uh0VarArr2[0];
                    uh0[] uh0VarArr3 = gh0Var.d;
                    i10 = 2;
                    uh0VarArr = new uh0[]{uh0Var, uh0VarArr3[0], uh0VarArr2[1], uh0VarArr3[1], uh0VarArr2[2], uh0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    uh0 uh0Var2 = uh0VarArr[i11];
                    uh0 uh0Var3 = uh0VarArr[i11 + 1];
                    if (uh0Var2 != null && !uh0Var2.c && uh0Var2.f) {
                        uh0Var2.e = true;
                        if (uh0Var3 != null) {
                            Bitmap bitmap = uh0Var3.b;
                            if (!uh0Var3.d) {
                                if (bitmap.getWidth() == uh0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (uh0Var3 != null) {
                            uh0Var3.a();
                        }
                        uh0Var3 = new uh0();
                        Bitmap createBitmap = Bitmap.createBitmap(uh0Var2.b.getWidth(), uh0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        uh0Var3.b = createBitmap;
                        uh0Var3.a = new Canvas(createBitmap);
                        synchronized (gh0Var.b) {
                            uh0[] uh0VarArr4 = gh0Var.d;
                            int i12 = 0;
                            while (true) {
                                uh0[] uh0VarArr5 = gh0Var.c;
                                if (i12 >= uh0VarArr5.length) {
                                    i12 = 0;
                                } else if (uh0VarArr5[i12] != uh0Var2) {
                                    i12++;
                                }
                            }
                            uh0VarArr4[i12] = uh0Var3;
                        }
                        Bitmap bitmap2 = uh0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (gh0Var.b) {
                            if (!uh0Var3.d) {
                                uh0Var3.f = false;
                                uh0Var3.b.eraseColor(0);
                            }
                            uh0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            uh0Var3.f = true;
                            Bitmap bitmap3 = uh0Var3.b;
                            int i13 = 0;
                            while (true) {
                                uh0[] uh0VarArr6 = gh0Var.c;
                                if (i13 >= uh0VarArr6.length) {
                                    i13 = 0;
                                } else if (uh0VarArr6[i13] != uh0Var2) {
                                    i13++;
                                }
                            }
                            gh0Var.b(bitmap3, i13);
                        }
                        if (!uh0Var2.d) {
                            uh0Var2.f = false;
                            uh0Var2.b.eraseColor(0);
                        }
                        uh0Var2.e = false;
                        if (!uh0Var2.d && uh0Var2.c) {
                            uh0Var2.d = true;
                            uh0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && gh0Var.e && gh0Var.h != null) {
                    gh0Var.postInvalidateOnAnimation();
                }
                if (gh0Var.e && (gh0Var.F || gh0Var.H)) {
                    AndroidUtilities.runOnUIThread(new fh0(gh0Var, i10));
                    return;
                } else {
                    gh0Var.e = false;
                    return;
                }
            case 1:
                gh0 gh0Var2 = this.b;
                gh0Var2.H = true;
                gh0Var2.postInvalidateOnAnimation();
                return;
            default:
                gh0 gh0Var3 = this.b;
                gh0Var3.d();
                vh0.a.postRunnable(gh0Var3.s);
                return;
        }
    }
}
