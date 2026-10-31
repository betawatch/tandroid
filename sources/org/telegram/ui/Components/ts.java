package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class ts implements org.telegram.messenger.us {
    public static tm L;
    public final org.telegram.messenger.s5 D;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
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
    public final ss F = new ss(this, 0);
    public final ss H = new ss(this, 1);

    public ts() {
        if (L == null) {
            tm tmVar = new tm();
            tmVar.b = new org.telegram.messenger.s5[2];
            L = tmVar;
        }
        tm tmVar2 = L;
        int i10 = tmVar2.a + 1;
        tmVar2.a = i10;
        if (i10 > 1) {
            tmVar2.a = 0;
        }
        org.telegram.messenger.s5[] s5VarArr = (org.telegram.messenger.s5[]) tmVar2.b;
        int i11 = tmVar2.a;
        org.telegram.messenger.s5 s5Var = s5VarArr[i11];
        if (s5Var == null) {
            s5Var = new org.telegram.messenger.s5("draw_background_queue_" + tmVar2.a, true);
            s5VarArr[i11] = s5Var;
        }
        this.D = s5Var;
        this.K = L.a;
    }

    public void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        if (this.E) {
            boolean z10 = org.telegram.messenger.v2.a;
            return;
        }
        this.x = i11;
        this.y = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.b;
            this.e = this.c;
            this.b = bitmap;
            this.c = canvas2;
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null || this.I) {
            this.I = false;
            if (bitmap2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.d);
                org.telegram.messenger.i0.A2(arrayList);
                this.d = null;
            }
            int i12 = this.x + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.y) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.y, i12, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f7);
            this.e.restore();
        }
        if (!this.f && !this.r) {
            this.f = true;
            i(j10);
            this.J = this.w;
            this.D.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.s;
            paint.setAlpha((int) (f7 * 255.0f));
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

    public abstract void d(Canvas canvas, float f7);

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == org.telegram.messenger.zs.j1) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || org.telegram.messenger.tz.o() < 2) {
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
        if (i10 == org.telegram.messenger.zs.k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.h >= num2.intValue() || (i12 = this.n) == 0) {
                return;
            }
            int i13 = (~num2.intValue()) & i12;
            this.n = i13;
            if (i13 == 0 && this.r) {
                this.r = false;
            }
        }
    }

    public final void e() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.E = false;
        int i10 = org.telegram.messenger.zs.e().p & (~this.h);
        this.n = i10;
        if (i10 == 0 && this.r) {
            this.r = false;
        }
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.j1);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.k1);
    }

    public final void f() {
        if (this.a) {
            if (!this.f) {
                j();
            }
            this.a = false;
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.j1);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.k1);
        }
    }

    public abstract void g();

    public abstract void i(long j10);

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
        org.telegram.messenger.i0.A2(arrayList);
    }

    public final void k() {
        this.I = true;
        this.w++;
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d);
            this.d = null;
            org.telegram.messenger.i0.A2(arrayList);
        }
    }

    public final void l(int i10) {
        this.h = 7;
        if (this.a) {
            this.n = org.telegram.messenger.zs.e().p & (~this.h);
        }
    }

    public void h() {
    }
}
