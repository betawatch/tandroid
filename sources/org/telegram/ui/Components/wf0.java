package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf0 b;

    public /* synthetic */ wf0(xf0 xf0Var, int i7) {
        this.a = i7;
        this.b = xf0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r3.getHeight() != r5.b.getHeight()) goto L30;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        kg0[] kg0VarArr;
        switch (this.a) {
            case 0:
                xf0 xf0Var = this.b;
                synchronized (xf0Var.b) {
                    kg0[] kg0VarArr2 = xf0Var.c;
                    kg0 kg0Var = kg0VarArr2[0];
                    kg0[] kg0VarArr3 = xf0Var.d;
                    i7 = 2;
                    kg0VarArr = new kg0[]{kg0Var, kg0VarArr3[0], kg0VarArr2[1], kg0VarArr3[1], kg0VarArr2[2], kg0VarArr3[2]};
                }
                boolean z10 = false;
                for (int i10 = 0; i10 < 6; i10 += 2) {
                    kg0 kg0Var2 = kg0VarArr[i10];
                    kg0 kg0Var3 = kg0VarArr[i10 + 1];
                    if (kg0Var2 != null && !kg0Var2.c && kg0Var2.f) {
                        kg0Var2.e = true;
                        if (kg0Var3 != null) {
                            Bitmap bitmap = kg0Var3.b;
                            if (!kg0Var3.d) {
                                if (bitmap.getWidth() == kg0Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (kg0Var3 != null) {
                            kg0Var3.a();
                        }
                        kg0Var3 = new kg0();
                        Bitmap createBitmap = Bitmap.createBitmap(kg0Var2.b.getWidth(), kg0Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        kg0Var3.b = createBitmap;
                        kg0Var3.a = new Canvas(createBitmap);
                        synchronized (xf0Var.b) {
                            kg0[] kg0VarArr4 = xf0Var.d;
                            int i11 = 0;
                            while (true) {
                                kg0[] kg0VarArr5 = xf0Var.c;
                                if (i11 >= kg0VarArr5.length) {
                                    i11 = 0;
                                } else if (kg0VarArr5[i11] != kg0Var2) {
                                    i11++;
                                }
                            }
                            kg0VarArr4[i11] = kg0Var3;
                        }
                        Bitmap bitmap2 = kg0Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / org.telegram.messenger.ks.K2));
                        synchronized (xf0Var.b) {
                            if (!kg0Var3.d) {
                                kg0Var3.f = false;
                                kg0Var3.b.eraseColor(0);
                            }
                            kg0Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            kg0Var3.f = true;
                            Bitmap bitmap3 = kg0Var3.b;
                            int i12 = 0;
                            while (true) {
                                kg0[] kg0VarArr6 = xf0Var.c;
                                if (i12 >= kg0VarArr6.length) {
                                    i12 = 0;
                                } else if (kg0VarArr6[i12] != kg0Var2) {
                                    i12++;
                                }
                            }
                            xf0Var.b(i12, bitmap3);
                        }
                        if (!kg0Var2.d) {
                            kg0Var2.f = false;
                            kg0Var2.b.eraseColor(0);
                        }
                        kg0Var2.e = false;
                        if (!kg0Var2.d && kg0Var2.c) {
                            kg0Var2.d = true;
                            kg0Var2.b.recycle();
                        }
                        z10 = true;
                    }
                }
                if (z10 && xf0Var.e && xf0Var.h != null) {
                    xf0Var.postInvalidateOnAnimation();
                }
                if (xf0Var.e && (xf0Var.G || xf0Var.I)) {
                    org.telegram.messenger.g0.g3(new wf0(xf0Var, i7));
                    return;
                } else {
                    xf0Var.e = false;
                    return;
                }
            case 1:
                xf0 xf0Var2 = this.b;
                xf0Var2.I = true;
                xf0Var2.postInvalidateOnAnimation();
                return;
            default:
                xf0 xf0Var3 = this.b;
                xf0Var3.c();
                lg0.a.postRunnable(xf0Var3.s);
                return;
        }
    }
}
