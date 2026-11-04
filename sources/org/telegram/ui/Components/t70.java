package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.view.ViewConfiguration;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t70 {
    public static final ArrayList s = new ArrayList();
    public int a;
    public int b;
    public Paint c;
    public Paint d;
    public int e;
    public int f;
    public final CharacterStyle i;
    public final float j;
    public final float k;
    public Rect m;
    public float n;
    public final long q;
    public final ArrayList g = new ArrayList();
    public int h = 0;
    public final Path l = new Path();
    public long o = -1;
    public long p = -1;
    public final boolean r = !org.telegram.messenger.lc.e(360928);

    public t70(CharacterStyle characterStyle, org.telegram.ui.ActionBar.e6 e6Var, float f10, float f11, int i3) {
        this.i = characterStyle;
        d(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ze, e6Var));
        this.j = f10;
        this.k = f11;
        this.q = (long) Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(Canvas canvas) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        boolean z13 = this.r;
        int L = z13 ? 0 : org.telegram.messenger.g0.L(4.0f);
        boolean z14 = this.a != L;
        if (this.c == null) {
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.c.setColor(this.b);
            this.e = Color.alpha(this.b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.b);
            this.f = Color.alpha(this.b);
        }
        if (z14) {
            this.a = L;
            if (L <= 0) {
                this.c.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                this.c.setPathEffect(new CornerPathEffect(this.a));
                this.d.setPathEffect(new CornerPathEffect(this.a));
            }
        }
        Rect rect = this.m;
        float f11 = this.k;
        float f12 = this.j;
        ArrayList arrayList = this.g;
        if (rect != null || this.h <= 0) {
            z10 = 0;
            z11 = z13;
            z12 = true;
            f10 = f12;
        } else {
            n70 n70Var = (n70) arrayList.get(0);
            RectF rectF = org.telegram.messenger.g0.P;
            n70Var.computeBounds(rectF, false);
            this.m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i3 = 1; i3 < this.h; i3++) {
                n70 n70Var2 = (n70) arrayList.get(i3);
                RectF rectF2 = org.telegram.messenger.g0.P;
                n70Var2.computeBounds(rectF2, false);
                Rect rect2 = this.m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z10 = 0;
            z11 = z13;
            z12 = true;
            f10 = f12;
            this.n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.m.top - f11, 2.0d) + Math.pow(this.m.left - f12, 2.0d), Math.pow(this.m.top - f11, 2.0d) + Math.pow(this.m.right - f12, 2.0d)), Math.max(Math.pow(this.m.bottom - f11, 2.0d) + Math.pow(this.m.left - f12, 2.0d), Math.pow(this.m.bottom - f11, 2.0d) + Math.pow(this.m.right - f12, 2.0d))));
        }
        if (z11) {
            for (int i10 = z10; i10 < this.h; i10++) {
                canvas.drawPath((Path) arrayList.get(i10), this.d);
            }
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.o < 0) {
                this.o = elapsedRealtime;
            }
            float interpolation = xq.f.getInterpolation(Math.min(1.0f, (elapsedRealtime - this.o) / this.q));
            float min = 1.0f - (this.p < 0 ? 0.0f : Math.min(1.0f, Math.max(0.0f, ((elapsedRealtime - 75) - r11) / 100.0f)));
            this.c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * min));
            this.c.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
            for (int i11 = z10; i11 < this.h; i11++) {
                ((n70) arrayList.get(i11)).a();
                canvas.drawPath((Path) arrayList.get(i11), this.c);
            }
            this.d.setAlpha((int) (this.f * 0.8f * min));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
            if (interpolation < 1.0f) {
                float f13 = interpolation * this.n;
                canvas.save();
                Path path = this.l;
                path.reset();
                path.addCircle(f10, f11, f13, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i12 = z10; i12 < this.h; i12++) {
                    canvas.drawPath((Path) arrayList.get(i12), this.d);
                }
                canvas.restore();
            } else {
                for (int i13 = z10; i13 < this.h; i13++) {
                    canvas.drawPath((Path) arrayList.get(i13), this.d);
                }
            }
            if (interpolation < 1.0f || this.p >= 0) {
                return z12;
            }
        }
        return z10;
    }

    public final n70 b() {
        ArrayList arrayList = s;
        n70 n70Var = !arrayList.isEmpty() ? (n70) arrayList.remove(0) : new n70(0);
        n70Var.c = !this.r;
        n70Var.reset();
        ArrayList arrayList2 = this.g;
        arrayList2.add(n70Var);
        this.h = arrayList2.size();
        return n70Var;
    }

    public final void c() {
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return;
        }
        s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i3) {
        this.b = i3;
        Paint paint = this.c;
        if (paint != null) {
            paint.setColor(i3);
            this.e = Color.alpha(i3);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i3);
            this.f = Color.alpha(i3);
        }
    }
}
