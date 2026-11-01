package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng0 b;

    public /* synthetic */ mg0(ng0 ng0Var, int i10) {
        this.a = i10;
        this.b = ng0Var;
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
        ah0[] ah0VarArr;
        switch (this.a) {
            case 0:
                ng0 ng0Var = this.b;
                synchronized (ng0Var.b) {
                    ah0[] ah0VarArr2 = ng0Var.c;
                    ah0 ah0Var = ah0VarArr2[0];
                    ah0[] ah0VarArr3 = ng0Var.d;
                    i10 = 2;
                    ah0VarArr = new ah0[]{ah0Var, ah0VarArr3[0], ah0VarArr2[1], ah0VarArr3[1], ah0VarArr2[2], ah0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < 6; i11 += 2) {
                    ah0 ah0Var2 = ah0VarArr[i11];
                    ah0 ah0Var3 = ah0VarArr[i11 + 1];
                    if (ah0Var2 != null && !ah0Var2.c && ah0Var2.f) {
                        ah0Var2.e = true;
                        if (ah0Var3 != null) {
                            Bitmap bitmap = ah0Var3.b;
                            if (!ah0Var3.d) {
                                if (bitmap.getWidth() == ah0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (ah0Var3 != null) {
                            ah0Var3.a();
                        }
                        ah0Var3 = new ah0();
                        Bitmap createBitmap = Bitmap.createBitmap(ah0Var2.b.getWidth(), ah0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        ah0Var3.b = createBitmap;
                        ah0Var3.a = new Canvas(createBitmap);
                        synchronized (ng0Var.b) {
                            ah0[] ah0VarArr4 = ng0Var.d;
                            int i12 = 0;
                            while (true) {
                                ah0[] ah0VarArr5 = ng0Var.c;
                                if (i12 >= ah0VarArr5.length) {
                                    i12 = 0;
                                } else if (ah0VarArr5[i12] != ah0Var2) {
                                    i12++;
                                }
                            }
                            ah0VarArr4[i12] = ah0Var3;
                        }
                        Bitmap bitmap2 = ah0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / org.telegram.messenger.at.K2));
                        synchronized (ng0Var.b) {
                            if (!ah0Var3.d) {
                                ah0Var3.f = false;
                                ah0Var3.b.eraseColor(0);
                            }
                            ah0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            ah0Var3.f = true;
                            Bitmap bitmap3 = ah0Var3.b;
                            int i13 = 0;
                            while (true) {
                                ah0[] ah0VarArr6 = ng0Var.c;
                                if (i13 >= ah0VarArr6.length) {
                                    i13 = 0;
                                } else if (ah0VarArr6[i13] != ah0Var2) {
                                    i13++;
                                }
                            }
                            ng0Var.b(bitmap3, i13);
                        }
                        if (!ah0Var2.d) {
                            ah0Var2.f = false;
                            ah0Var2.b.eraseColor(0);
                        }
                        ah0Var2.e = false;
                        if (!ah0Var2.d && ah0Var2.c) {
                            ah0Var2.d = true;
                            ah0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && ng0Var.e && ng0Var.h != null) {
                    ng0Var.postInvalidateOnAnimation();
                }
                if (ng0Var.e && (ng0Var.F || ng0Var.H)) {
                    org.telegram.messenger.i0.g3(new mg0(ng0Var, i10));
                    return;
                } else {
                    ng0Var.e = false;
                    return;
                }
            case 1:
                ng0 ng0Var2 = this.b;
                ng0Var2.H = true;
                ng0Var2.postInvalidateOnAnimation();
                return;
            default:
                ng0 ng0Var3 = this.b;
                ng0Var3.c();
                bh0.a.postRunnable(ng0Var3.s);
                return;
        }
    }
}
