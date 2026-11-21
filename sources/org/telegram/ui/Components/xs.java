package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class xs implements org.telegram.messenger.fs {
    public static cn M;
    public final org.telegram.messenger.r5 E;
    public boolean F;
    public boolean H;
    public boolean J;
    public int K;
    public final int L;
    public boolean a;
    public Bitmap b;
    public Canvas c;
    public Bitmap d;
    public Canvas e;
    public boolean f;
    public int n;
    public boolean r;
    public int w;
    public int x;
    public int y;
    public int h = 1;
    public final Paint s = new Paint(1);
    public final ws G = new ws(this, 0);
    public final ws I = new ws(this, 1);

    public xs() {
        if (M == null) {
            cn cnVar = new cn();
            cnVar.b = new org.telegram.messenger.r5[2];
            M = cnVar;
        }
        cn cnVar2 = M;
        int i7 = cnVar2.a + 1;
        cnVar2.a = i7;
        if (i7 > 1) {
            cnVar2.a = 0;
        }
        org.telegram.messenger.r5[] r5VarArr = (org.telegram.messenger.r5[]) cnVar2.b;
        int i10 = cnVar2.a;
        org.telegram.messenger.r5 r5Var = r5VarArr[i10];
        if (r5Var == null) {
            r5Var = new org.telegram.messenger.r5("draw_background_queue_" + cnVar2.a, true);
            r5VarArr[i10] = r5Var;
        }
        this.E = r5Var;
        this.L = M.a;
    }

    public void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        if (this.F) {
            boolean z10 = org.telegram.messenger.s2.a;
            return;
        }
        this.x = i10;
        this.y = i7;
        if (this.H) {
            this.H = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.b;
            this.e = this.c;
            this.b = bitmap;
            this.c = canvas2;
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null || this.J) {
            this.J = false;
            if (bitmap2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.d);
                org.telegram.messenger.g0.A2(arrayList);
                this.d = null;
            }
            int i11 = this.x + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i11 && this.d.getWidth() == this.y) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.y, i11, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f10);
            this.e.restore();
        }
        if (!this.f && !this.r) {
            this.f = true;
            i(j3);
            this.K = this.w;
            this.E.postRunnable(this.G);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.s;
            paint.setAlpha((int) (f10 * 255.0f));
            canvas.save();
            canvas.translate(0.0f, -0);
            b(canvas, bitmap4, paint);
            canvas.restore();
        }
    }

    public void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    public abstract void c(Canvas canvas);

    public abstract void d(Canvas canvas, float f10);

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        if (i7 == org.telegram.messenger.ks.j1) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || org.telegram.messenger.bz.o() < 2) {
                    int intValue = num.intValue() | this.n;
                    this.n = intValue;
                    if (intValue == 0 || this.r) {
                        return;
                    }
                    this.r = true;
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.h >= num2.intValue() || (i11 = this.n) == 0) {
                return;
            }
            int i12 = (~num2.intValue()) & i11;
            this.n = i12;
            if (i12 == 0 && this.r) {
                this.r = false;
            }
        }
    }

    public final void e() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.F = false;
        int i7 = org.telegram.messenger.ks.e().p & (~this.h);
        this.n = i7;
        if (i7 == 0 && this.r) {
            this.r = false;
        }
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.j1);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.k1);
    }

    public final void f() {
        if (this.a) {
            if (!this.f) {
                j();
            }
            this.a = false;
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.j1);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.k1);
        }
    }

    public abstract void g();

    public abstract void i(long j3);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.b = null;
        this.c = null;
        this.e = null;
        org.telegram.messenger.g0.A2(arrayList);
    }

    public final void k() {
        this.J = true;
        this.w++;
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d);
            this.d = null;
            org.telegram.messenger.g0.A2(arrayList);
        }
    }

    public final void l(int i7) {
        this.h = 7;
        if (this.a) {
            this.n = org.telegram.messenger.ks.e().p & (~this.h);
        }
    }

    public void h() {
    }
}
