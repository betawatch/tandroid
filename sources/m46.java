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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class m46 {
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
    public final boolean r = !e66.e(360928);

    public m46(CharacterStyle characterStyle, wjb wjbVar, float f, float f2, int i) {
        this.i = characterStyle;
        d(bkb.v0(bkb.Be, wjbVar));
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
        int L = z4 ? 0 : gl.L(4.0f);
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
            b46 b46Var = (b46) arrayList.get(0);
            RectF rectF = gl.P;
            b46Var.computeBounds(rectF, false);
            this.m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i = 1; i < this.h; i++) {
                b46 b46Var2 = (b46) arrayList.get(i);
                RectF rectF2 = gl.P;
                b46Var2.computeBounds(rectF2, false);
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
        float interpolation = s33.f.getInterpolation(Math.min(1.0f, (elapsedRealtime - j) / this.q));
        float min = 1.0f - (this.p < 0 ? 0.0f : Math.min(1.0f, Math.max(0.0f, ((elapsedRealtime - 75) - r11) / 100.0f)));
        this.c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * min));
        this.c.setStrokeWidth(Math.min(1.0f, 0.0f) * gl.L(5.0f));
        for (int i3 = z; i3 < this.h; i3++) {
            ((b46) arrayList.get(i3)).a();
            canvas.drawPath((Path) arrayList.get(i3), this.c);
        }
        this.d.setAlpha((int) (this.f * 0.8f * min));
        this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * gl.L(5.0f));
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

    public final b46 b() {
        ArrayList arrayList = s;
        b46 b46Var = !arrayList.isEmpty() ? (b46) arrayList.remove(0) : new b46(0);
        b46Var.c = !this.r;
        b46Var.reset();
        ArrayList arrayList2 = this.g;
        arrayList2.add(b46Var);
        this.h = arrayList2.size();
        return b46Var;
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
