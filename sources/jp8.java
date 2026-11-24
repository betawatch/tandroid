// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jp8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kp8 b;

    public /* synthetic */ jp8(kp8 kp8Var, byte b) {
        this.a = b;
        this.b = kp8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r2.getHeight() == r4.b.getHeight()) goto L41;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b;
        hr8[] hr8VarArr;
        byte b2 = this.a;
        kp8 kp8Var = this.b;
        switch (b2) {
            case 0:
                synchronized (kp8Var.b) {
                    hr8[] hr8VarArr2 = kp8Var.c;
                    hr8 hr8Var = hr8VarArr2[0];
                    hr8[] hr8VarArr3 = kp8Var.d;
                    b = 2;
                    hr8VarArr = new hr8[]{hr8Var, hr8VarArr3[0], hr8VarArr2[1], hr8VarArr3[1], hr8VarArr2[2], hr8VarArr3[2]};
                }
                boolean z = false;
                for (int i = 0; i < 6; i += 2) {
                    hr8 hr8Var2 = hr8VarArr[i];
                    hr8 hr8Var3 = hr8VarArr[i + 1];
                    if (hr8Var2 != null && !hr8Var2.c && hr8Var2.f) {
                        hr8Var2.e = true;
                        if (hr8Var3 != null) {
                            Bitmap bitmap = hr8Var3.b;
                            if (!hr8Var3.d) {
                                if (bitmap.getWidth() == hr8Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (hr8Var3 != null) {
                            hr8Var3.a();
                        }
                        hr8Var3 = new hr8();
                        Bitmap createBitmap = Bitmap.createBitmap(hr8Var2.b.getWidth(), hr8Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        hr8Var3.b = createBitmap;
                        hr8Var3.a = new Canvas(createBitmap);
                        synchronized (kp8Var.b) {
                            hr8[] hr8VarArr4 = kp8Var.d;
                            int i2 = 0;
                            while (true) {
                                hr8[] hr8VarArr5 = kp8Var.c;
                                if (i2 >= hr8VarArr5.length) {
                                    i2 = 0;
                                } else if (hr8VarArr5[i2] != hr8Var2) {
                                    i2++;
                                }
                            }
                            hr8VarArr4[i2] = hr8Var3;
                        }
                        Bitmap bitmap2 = hr8Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / kk7.J2));
                        synchronized (kp8Var.b) {
                            if (!hr8Var3.d) {
                                hr8Var3.f = false;
                                hr8Var3.b.eraseColor(0);
                            }
                            hr8Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            hr8Var3.f = true;
                            Bitmap bitmap3 = hr8Var3.b;
                            int i3 = 0;
                            while (true) {
                                hr8[] hr8VarArr6 = kp8Var.c;
                                if (i3 >= hr8VarArr6.length) {
                                    i3 = 0;
                                } else if (hr8VarArr6[i3] != hr8Var2) {
                                    i3++;
                                }
                            }
                            kp8Var.a(i3, bitmap3);
                        }
                        if (!hr8Var2.d) {
                            hr8Var2.f = false;
                            hr8Var2.b.eraseColor(0);
                        }
                        hr8Var2.e = false;
                        if (!hr8Var2.d && hr8Var2.c) {
                            hr8Var2.d = true;
                            hr8Var2.b.recycle();
                        }
                        z = true;
                    }
                }
                if (z && kp8Var.e && kp8Var.h != null) {
                    kp8Var.postInvalidateOnAnimation();
                }
                if (kp8Var.e && (kp8Var.G || kp8Var.I)) {
                    gl.c3(new jp8(kp8Var, b));
                    return;
                } else {
                    kp8Var.e = false;
                    return;
                }
            case 1:
                kp8Var.I = true;
                kp8Var.postInvalidateOnAnimation();
                return;
            default:
                kp8Var.b();
                ir8.a.postRunnable(kp8Var.s);
                return;
        }
    }
}
