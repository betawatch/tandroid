// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kr8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lr8 b;

    public /* synthetic */ kr8(lr8 lr8Var, byte b) {
        this.a = b;
        this.b = lr8Var;
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
        kt8[] kt8VarArr;
        byte b2 = this.a;
        lr8 lr8Var = this.b;
        switch (b2) {
            case 0:
                synchronized (lr8Var.b) {
                    kt8[] kt8VarArr2 = lr8Var.c;
                    kt8 kt8Var = kt8VarArr2[0];
                    kt8[] kt8VarArr3 = lr8Var.d;
                    b = 2;
                    kt8VarArr = new kt8[]{kt8Var, kt8VarArr3[0], kt8VarArr2[1], kt8VarArr3[1], kt8VarArr2[2], kt8VarArr3[2]};
                }
                boolean z = false;
                for (int i = 0; i < 6; i += 2) {
                    kt8 kt8Var2 = kt8VarArr[i];
                    kt8 kt8Var3 = kt8VarArr[i + 1];
                    if (kt8Var2 != null && !kt8Var2.c && kt8Var2.f) {
                        kt8Var2.e = true;
                        if (kt8Var3 != null) {
                            Bitmap bitmap = kt8Var3.b;
                            if (!kt8Var3.d) {
                                if (bitmap.getWidth() == kt8Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (kt8Var3 != null) {
                            kt8Var3.a();
                        }
                        kt8Var3 = new kt8();
                        Bitmap createBitmap = Bitmap.createBitmap(kt8Var2.b.getWidth(), kt8Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        kt8Var3.b = createBitmap;
                        kt8Var3.a = new Canvas(createBitmap);
                        synchronized (lr8Var.b) {
                            kt8[] kt8VarArr4 = lr8Var.d;
                            int i2 = 0;
                            while (true) {
                                kt8[] kt8VarArr5 = lr8Var.c;
                                if (i2 >= kt8VarArr5.length) {
                                    i2 = 0;
                                } else if (kt8VarArr5[i2] != kt8Var2) {
                                    i2++;
                                }
                            }
                            kt8VarArr4[i2] = kt8Var3;
                        }
                        Bitmap bitmap2 = kt8Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / nm7.J2));
                        synchronized (lr8Var.b) {
                            if (!kt8Var3.d) {
                                kt8Var3.f = false;
                                kt8Var3.b.eraseColor(0);
                            }
                            kt8Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            kt8Var3.f = true;
                            Bitmap bitmap3 = kt8Var3.b;
                            int i3 = 0;
                            while (true) {
                                kt8[] kt8VarArr6 = lr8Var.c;
                                if (i3 >= kt8VarArr6.length) {
                                    i3 = 0;
                                } else if (kt8VarArr6[i3] != kt8Var2) {
                                    i3++;
                                }
                            }
                            lr8Var.a(i3, bitmap3);
                        }
                        if (!kt8Var2.d) {
                            kt8Var2.f = false;
                            kt8Var2.b.eraseColor(0);
                        }
                        kt8Var2.e = false;
                        if (!kt8Var2.d && kt8Var2.c) {
                            kt8Var2.d = true;
                            kt8Var2.b.recycle();
                        }
                        z = true;
                    }
                }
                if (z && lr8Var.e && lr8Var.h != null) {
                    lr8Var.postInvalidateOnAnimation();
                }
                if (lr8Var.e && (lr8Var.G || lr8Var.I)) {
                    gm.c3(new kr8(lr8Var, b));
                    return;
                } else {
                    lr8Var.e = false;
                    return;
                }
            case 1:
                lr8Var.I = true;
                lr8Var.postInvalidateOnAnimation();
                return;
            default:
                lr8Var.b();
                lt8.a.postRunnable(lr8Var.s);
                return;
        }
    }
}
