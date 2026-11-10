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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x70 {
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
    public final boolean r = !org.telegram.messenger.sc.e(360928);

    public x70(CharacterStyle characterStyle, org.telegram.ui.ActionBar.h6 h6Var, float f10, float f11, int i7) {
        this.i = characterStyle;
        d(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.ze, h6Var));
        this.j = f10;
        this.k = f11;
        this.q = (long) Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(Canvas canvas) {
        boolean z9;
        boolean z10;
        boolean z11;
        float f10;
        boolean z12 = this.r;
        int L = z12 ? 0 : org.telegram.messenger.g0.L(4.0f);
        boolean z13 = this.a != L;
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
        if (z13) {
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
            z9 = 0;
            z10 = z12;
            z11 = true;
            f10 = f12;
        } else {
            r70 r70Var = (r70) arrayList.get(0);
            RectF rectF = org.telegram.messenger.g0.P;
            r70Var.computeBounds(rectF, false);
            this.m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i7 = 1; i7 < this.h; i7++) {
                r70 r70Var2 = (r70) arrayList.get(i7);
                RectF rectF2 = org.telegram.messenger.g0.P;
                r70Var2.computeBounds(rectF2, false);
                Rect rect2 = this.m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z9 = 0;
            z10 = z12;
            z11 = true;
            f10 = f12;
            this.n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.m.top - f11, 2.0d) + Math.pow(this.m.left - f12, 2.0d), Math.pow(this.m.top - f11, 2.0d) + Math.pow(this.m.right - f12, 2.0d)), Math.max(Math.pow(this.m.bottom - f11, 2.0d) + Math.pow(this.m.left - f12, 2.0d), Math.pow(this.m.bottom - f11, 2.0d) + Math.pow(this.m.right - f12, 2.0d))));
        }
        if (z10) {
            for (int i10 = z9; i10 < this.h; i10++) {
                canvas.drawPath((Path) arrayList.get(i10), this.d);
            }
            return z9;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.o < 0) {
            this.o = elapsedRealtime;
        }
        float interpolation = wq.f.getInterpolation(Math.min(1.0f, (elapsedRealtime - this.o) / this.q));
        float min = 1.0f - (this.p < 0 ? 0.0f : Math.min(1.0f, Math.max(0.0f, ((elapsedRealtime - 75) - r11) / 100.0f)));
        this.c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * min));
        this.c.setStrokeWidth(Math.min(1.0f, 0.0f) * org.telegram.messenger.g0.L(5.0f));
        for (int i11 = z9; i11 < this.h; i11++) {
            ((r70) arrayList.get(i11)).a();
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
            for (int i12 = z9; i12 < this.h; i12++) {
                canvas.drawPath((Path) arrayList.get(i12), this.d);
            }
            canvas.restore();
        } else {
            for (int i13 = z9; i13 < this.h; i13++) {
                canvas.drawPath((Path) arrayList.get(i13), this.d);
            }
        }
        return (interpolation < 1.0f || this.p >= 0) ? z11 : z9;
    }

    public final r70 b() {
        ArrayList arrayList = s;
        r70 r70Var = !arrayList.isEmpty() ? (r70) arrayList.remove(0) : new r70(0);
        r70Var.c = !this.r;
        r70Var.reset();
        ArrayList arrayList2 = this.g;
        arrayList2.add(r70Var);
        this.h = arrayList2.size();
        return r70Var;
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

    public final void d(int i7) {
        this.b = i7;
        Paint paint = this.c;
        if (paint != null) {
            paint.setColor(i7);
            this.e = Color.alpha(i7);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i7);
            this.f = Color.alpha(i7);
        }
    }
}
