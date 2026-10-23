package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ei0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi0 b;

    public /* synthetic */ ei0(fi0 fi0Var, int i10) {
        this.a = i10;
        this.b = fi0Var;
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
        ti0[] ti0VarArr;
        switch (this.a) {
            case 0:
                fi0 fi0Var = this.b;
                synchronized (fi0Var.b) {
                    ti0[] ti0VarArr2 = fi0Var.c;
                    ti0 ti0Var = ti0VarArr2[0];
                    ti0[] ti0VarArr3 = fi0Var.d;
                    i10 = 2;
                    ti0VarArr = new ti0[]{ti0Var, ti0VarArr3[0], ti0VarArr2[1], ti0VarArr3[1], ti0VarArr2[2], ti0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    ti0 ti0Var2 = ti0VarArr[i11];
                    ti0 ti0Var3 = ti0VarArr[i11 + 1];
                    if (ti0Var2 != null && !ti0Var2.c && ti0Var2.f) {
                        ti0Var2.e = true;
                        if (ti0Var3 != null) {
                            Bitmap bitmap = ti0Var3.b;
                            if (!ti0Var3.d) {
                                if (bitmap.getWidth() == ti0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (ti0Var3 != null) {
                            ti0Var3.a();
                        }
                        ti0Var3 = new ti0();
                        Bitmap createBitmap = Bitmap.createBitmap(ti0Var2.b.getWidth(), ti0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        ti0Var3.b = createBitmap;
                        ti0Var3.a = new Canvas(createBitmap);
                        synchronized (fi0Var.b) {
                            ti0[] ti0VarArr4 = fi0Var.d;
                            int i12 = 0;
                            while (true) {
                                ti0[] ti0VarArr5 = fi0Var.c;
                                if (i12 >= ti0VarArr5.length) {
                                    i12 = 0;
                                } else if (ti0VarArr5[i12] != ti0Var2) {
                                    i12++;
                                }
                            }
                            ti0VarArr4[i12] = ti0Var3;
                        }
                        Bitmap bitmap2 = ti0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / 180));
                        synchronized (fi0Var.b) {
                            if (!ti0Var3.d) {
                                ti0Var3.f = false;
                                ti0Var3.b.eraseColor(0);
                            }
                            ti0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            ti0Var3.f = true;
                            Bitmap bitmap3 = ti0Var3.b;
                            int i13 = 0;
                            while (true) {
                                ti0[] ti0VarArr6 = fi0Var.c;
                                if (i13 >= ti0VarArr6.length) {
                                    i13 = 0;
                                } else if (ti0VarArr6[i13] != ti0Var2) {
                                    i13++;
                                }
                            }
                            fi0Var.b(bitmap3, i13);
                        }
                        if (!ti0Var2.d) {
                            ti0Var2.f = false;
                            ti0Var2.b.eraseColor(0);
                        }
                        ti0Var2.e = false;
                        if (!ti0Var2.d && ti0Var2.c) {
                            ti0Var2.d = true;
                            ti0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && fi0Var.e && fi0Var.h != null) {
                    fi0Var.postInvalidateOnAnimation();
                }
                if (fi0Var.e && (fi0Var.F || fi0Var.H)) {
                    AndroidUtilities.runOnUIThread(new ei0(fi0Var, i10));
                    return;
                } else {
                    fi0Var.e = false;
                    return;
                }
            case 1:
                fi0 fi0Var2 = this.b;
                fi0Var2.H = true;
                fi0Var2.postInvalidateOnAnimation();
                return;
            default:
                fi0 fi0Var3 = this.b;
                fi0Var3.d();
                ui0.a.postRunnable(fi0Var3.s);
                return;
        }
    }
}
