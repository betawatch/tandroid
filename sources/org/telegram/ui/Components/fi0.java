package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi0 b;

    public /* synthetic */ fi0(gi0 gi0Var, int i10) {
        this.a = i10;
        this.b = gi0Var;
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
        ui0[] ui0VarArr;
        switch (this.a) {
            case 0:
                gi0 gi0Var = this.b;
                synchronized (gi0Var.b) {
                    ui0[] ui0VarArr2 = gi0Var.c;
                    ui0 ui0Var = ui0VarArr2[0];
                    ui0[] ui0VarArr3 = gi0Var.d;
                    i10 = 2;
                    ui0VarArr = new ui0[]{ui0Var, ui0VarArr3[0], ui0VarArr2[1], ui0VarArr3[1], ui0VarArr2[2], ui0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    ui0 ui0Var2 = ui0VarArr[i11];
                    ui0 ui0Var3 = ui0VarArr[i11 + 1];
                    if (ui0Var2 != null && !ui0Var2.c && ui0Var2.f) {
                        ui0Var2.e = true;
                        if (ui0Var3 != null) {
                            Bitmap bitmap = ui0Var3.b;
                            if (!ui0Var3.d) {
                                if (bitmap.getWidth() == ui0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (ui0Var3 != null) {
                            ui0Var3.a();
                        }
                        ui0Var3 = new ui0();
                        Bitmap createBitmap = Bitmap.createBitmap(ui0Var2.b.getWidth(), ui0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        ui0Var3.b = createBitmap;
                        ui0Var3.a = new Canvas(createBitmap);
                        synchronized (gi0Var.b) {
                            ui0[] ui0VarArr4 = gi0Var.d;
                            int i12 = 0;
                            while (true) {
                                ui0[] ui0VarArr5 = gi0Var.c;
                                if (i12 >= ui0VarArr5.length) {
                                    i12 = 0;
                                } else if (ui0VarArr5[i12] != ui0Var2) {
                                    i12++;
                                }
                            }
                            ui0VarArr4[i12] = ui0Var3;
                        }
                        Bitmap bitmap2 = ui0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (gi0Var.b) {
                            if (!ui0Var3.d) {
                                ui0Var3.f = false;
                                ui0Var3.b.eraseColor(0);
                            }
                            ui0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            ui0Var3.f = true;
                            Bitmap bitmap3 = ui0Var3.b;
                            int i13 = 0;
                            while (true) {
                                ui0[] ui0VarArr6 = gi0Var.c;
                                if (i13 >= ui0VarArr6.length) {
                                    i13 = 0;
                                } else if (ui0VarArr6[i13] != ui0Var2) {
                                    i13++;
                                }
                            }
                            gi0Var.b(bitmap3, i13);
                        }
                        if (!ui0Var2.d) {
                            ui0Var2.f = false;
                            ui0Var2.b.eraseColor(0);
                        }
                        ui0Var2.e = false;
                        if (!ui0Var2.d && ui0Var2.c) {
                            ui0Var2.d = true;
                            ui0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && gi0Var.e && gi0Var.h != null) {
                    gi0Var.postInvalidateOnAnimation();
                }
                if (gi0Var.e && (gi0Var.F || gi0Var.H)) {
                    AndroidUtilities.runOnUIThread(new fi0(gi0Var, i10));
                    return;
                } else {
                    gi0Var.e = false;
                    return;
                }
            case 1:
                gi0 gi0Var2 = this.b;
                gi0Var2.H = true;
                gi0Var2.postInvalidateOnAnimation();
                return;
            default:
                gi0 gi0Var3 = this.b;
                gi0Var3.d();
                vi0.a.postRunnable(gi0Var3.s);
                return;
        }
    }
}
