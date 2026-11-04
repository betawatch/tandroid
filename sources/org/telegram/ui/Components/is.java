package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class is implements org.telegram.messenger.cs {
    public static km M;
    public final org.telegram.messenger.q5 E;
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
    public final hs G = new hs(this, 0);
    public final hs I = new hs(this, 1);

    public is() {
        if (M == null) {
            km kmVar = new km();
            kmVar.b = new org.telegram.messenger.q5[2];
            M = kmVar;
        }
        km kmVar2 = M;
        int i3 = kmVar2.a + 1;
        kmVar2.a = i3;
        if (i3 > 1) {
            kmVar2.a = 0;
        }
        org.telegram.messenger.q5[] q5VarArr = (org.telegram.messenger.q5[]) kmVar2.b;
        int i10 = kmVar2.a;
        org.telegram.messenger.q5 q5Var = q5VarArr[i10];
        if (q5Var == null) {
            q5Var = new org.telegram.messenger.q5("draw_background_queue_" + kmVar2.a, true);
            q5VarArr[i10] = q5Var;
        }
        this.E = q5Var;
        this.L = M.a;
    }

    public void a(Canvas canvas, long j10, int i3, int i10, float f10) {
        if (this.F) {
            boolean z10 = org.telegram.messenger.r2.a;
            return;
        }
        this.x = i10;
        this.y = i3;
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
            i(j10);
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

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11;
        if (i3 == org.telegram.messenger.hs.j1) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || org.telegram.messenger.az.o() < 2) {
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
        if (i3 == org.telegram.messenger.hs.k1) {
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
        int i3 = org.telegram.messenger.hs.e().p & (~this.h);
        this.n = i3;
        if (i3 == 0 && this.r) {
            this.r = false;
        }
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.j1);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.k1);
    }

    public final void f() {
        if (this.a) {
            if (!this.f) {
                j();
            }
            this.a = false;
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.j1);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.k1);
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

    public final void l(int i3) {
        this.h = 7;
        if (this.a) {
            this.n = org.telegram.messenger.hs.e().p & (~this.h);
        }
    }

    public void h() {
    }
}
