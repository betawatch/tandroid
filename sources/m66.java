// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m66 {
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
    public final boolean r = !e86.e(360928);

    public m66(CharacterStyle characterStyle, ylb ylbVar, float f, float f2, int i) {
        this.i = characterStyle;
        d(cmb.v0(cmb.Be, ylbVar));
        this.j = f;
        this.k = f2;
        this.q = (long) Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(Canvas canvas) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        boolean z4 = this.r;
        int L = z4 ? 0 : gm.L(4.0f);
        boolean z5 = this.a != L;
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
        if (z5) {
            this.a = L;
            Paint paint3 = this.c;
            if (L <= 0) {
                paint3.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                paint3.setPathEffect(new CornerPathEffect(this.a));
                this.d.setPathEffect(new CornerPathEffect(this.a));
            }
        }
        Rect rect = this.m;
        float f2 = this.k;
        float f3 = this.j;
        ArrayList arrayList = this.g;
        if (rect != null || this.h <= 0) {
            z = 0;
            z2 = z4;
            z3 = true;
            f = f3;
        } else {
            b66 b66Var = (b66) arrayList.get(0);
            RectF rectF = gm.P;
            b66Var.computeBounds(rectF, false);
            this.m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i = 1; i < this.h; i++) {
                b66 b66Var2 = (b66) arrayList.get(i);
                RectF rectF2 = gm.P;
                b66Var2.computeBounds(rectF2, false);
                Rect rect2 = this.m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z = 0;
            z2 = z4;
            z3 = true;
            f = f3;
            this.n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.m.top - f2, 2.0d) + Math.pow(this.m.left - f3, 2.0d), Math.pow(this.m.top - f2, 2.0d) + Math.pow(this.m.right - f3, 2.0d)), Math.max(Math.pow(this.m.bottom - f2, 2.0d) + Math.pow(this.m.left - f3, 2.0d), Math.pow(this.m.bottom - f2, 2.0d) + Math.pow(this.m.right - f3, 2.0d))));
        }
        if (z2) {
            for (int i2 = z; i2 < this.h; i2++) {
                canvas.drawPath((Path) arrayList.get(i2), this.d);
            }
            return z;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.o;
        if (j < 0) {
            this.o = elapsedRealtime;
            j = elapsedRealtime;
        }
        float interpolation = d53.f.getInterpolation(Math.min(1.0f, (elapsedRealtime - j) / this.q));
        float min = 1.0f - (this.p < 0 ? 0.0f : Math.min(1.0f, Math.max(0.0f, ((elapsedRealtime - 75) - r11) / 100.0f)));
        this.c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * min));
        this.c.setStrokeWidth(Math.min(1.0f, 0.0f) * gm.L(5.0f));
        for (int i3 = z; i3 < this.h; i3++) {
            ((b66) arrayList.get(i3)).a();
            canvas.drawPath((Path) arrayList.get(i3), this.c);
        }
        this.d.setAlpha((int) (this.f * 0.8f * min));
        this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * gm.L(5.0f));
        if (interpolation < 1.0f) {
            float f4 = interpolation * this.n;
            canvas.save();
            Path path = this.l;
            path.reset();
            path.addCircle(f, f2, f4, Path.Direction.CW);
            canvas.clipPath(path);
            for (int i4 = z; i4 < this.h; i4++) {
                canvas.drawPath((Path) arrayList.get(i4), this.d);
            }
            canvas.restore();
        } else {
            for (int i5 = z; i5 < this.h; i5++) {
                canvas.drawPath((Path) arrayList.get(i5), this.d);
            }
        }
        return (interpolation < 1.0f || this.p >= 0) ? z3 : z;
    }

    public final b66 b() {
        ArrayList arrayList = s;
        b66 b66Var = !arrayList.isEmpty() ? (b66) arrayList.remove(0) : new b66(0);
        b66Var.c = !this.r;
        b66Var.reset();
        ArrayList arrayList2 = this.g;
        arrayList2.add(b66Var);
        this.h = arrayList2.size();
        return b66Var;
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

    public final void d(int i) {
        this.b = i;
        Paint paint = this.c;
        if (paint != null) {
            paint.setColor(i);
            this.e = Color.alpha(i);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i);
            this.f = Color.alpha(i);
        }
    }
}
