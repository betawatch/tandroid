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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m80 {
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
    public final boolean r = !LiteMode.isEnabled(LiteMode.FLAGS_CHAT);

    public m80(CharacterStyle characterStyle, org.telegram.ui.ActionBar.b6 b6Var, float f10, float f11, int i9) {
        this.i = characterStyle;
        d(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ld, b6Var));
        this.j = f10;
        this.k = f11;
        this.q = (long) Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        boolean z13 = this.r;
        int dp = z13 ? 0 : AndroidUtilities.dp(4.0f);
        boolean z14 = this.a != dp;
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
            this.a = dp;
            if (dp <= 0) {
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
            z10 = z13;
            f10 = f12;
            z11 = false;
            z12 = true;
        } else {
            f80 f80Var = (f80) arrayList.get(0);
            RectF rectF = AndroidUtilities.rectTmp;
            f80Var.computeBounds(rectF, false);
            this.m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i9 = 1; i9 < this.h; i9++) {
                f80 f80Var2 = (f80) arrayList.get(i9);
                RectF rectF2 = AndroidUtilities.rectTmp;
                f80Var2.computeBounds(rectF2, false);
                Rect rect2 = this.m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z10 = z13;
            z11 = false;
            f10 = f12;
            z12 = true;
            this.n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.m.top - f11, 2.0d) + Math.pow(this.m.left - f12, 2.0d), Math.pow(this.m.top - f11, 2.0d) + Math.pow(this.m.right - f12, 2.0d)), Math.max(Math.pow(this.m.bottom - f11, 2.0d) + Math.pow(this.m.left - f12, 2.0d), Math.pow(this.m.bottom - f11, 2.0d) + Math.pow(this.m.right - f12, 2.0d))));
        }
        if (z10) {
            for (int i10 = 0; i10 < this.h; i10++) {
                canvas.drawPath((Path) arrayList.get(i10), this.d);
            }
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.o < 0) {
                this.o = elapsedRealtime;
            }
            float interpolation = gr.f.getInterpolation(Math.min(1.0f, (elapsedRealtime - this.o) / this.q));
            float min = 1.0f - (this.p < 0 ? 0.0f : Math.min(1.0f, Math.max(0.0f, ((elapsedRealtime - 75) - r11) / 100.0f)));
            this.c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * min));
            this.c.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            for (int i11 = 0; i11 < this.h; i11++) {
                ((f80) arrayList.get(i11)).a();
                canvas.drawPath((Path) arrayList.get(i11), this.c);
            }
            this.d.setAlpha((int) (this.f * 0.8f * min));
            this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
            if (interpolation < 1.0f) {
                float f13 = interpolation * this.n;
                canvas.save();
                Path path = this.l;
                path.reset();
                path.addCircle(f10, f11, f13, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i12 = 0; i12 < this.h; i12++) {
                    canvas.drawPath((Path) arrayList.get(i12), this.d);
                }
                canvas.restore();
            } else {
                for (int i13 = 0; i13 < this.h; i13++) {
                    canvas.drawPath((Path) arrayList.get(i13), this.d);
                }
            }
            if (interpolation < 1.0f || this.p >= 0) {
                return z12;
            }
        }
        return z11;
    }

    public final f80 b() {
        ArrayList arrayList = s;
        f80 f80Var = !arrayList.isEmpty() ? (f80) arrayList.remove(0) : new f80(0);
        f80Var.c = !this.r;
        f80Var.reset();
        ArrayList arrayList2 = this.g;
        arrayList2.add(f80Var);
        this.h = arrayList2.size();
        return f80Var;
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

    public final void d(int i9) {
        this.b = i9;
        Paint paint = this.c;
        if (paint != null) {
            paint.setColor(i9);
            this.e = Color.alpha(i9);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i9);
            this.f = Color.alpha(i9);
        }
    }
}
