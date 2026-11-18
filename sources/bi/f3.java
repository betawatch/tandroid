package bi;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import di.ec;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.vy0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class f3 extends a5.h {
    public vy0 c;
    public vy0 d;
    public final org.telegram.ui.Components.c6 e;
    public final Path f;
    public final Path h;
    public final Paint n;
    public final Paint r;
    public final float s;
    public ec w;
    public boolean x;
    public int y;

    public f3(View view, float f10) {
        super(view);
        this.e = new org.telegram.ui.Components.c6(new a3.f(this, 23), 320L, lr.h, 0);
        Path path = new Path();
        this.f = path;
        this.h = new Path();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.y = -1;
        this.s = f10;
        d(path, f10, false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ((Paint) this.b).setColor(-698031);
        ((Paint) this.b).setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.33f)));
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void d(Path path, float f10, final boolean z10) {
        y10 y10Var = new y10() { // from class: bi.e3
            @Override // org.telegram.messenger.y10
            public final Object a(Object obj) {
                Float f11 = (Float) obj;
                return Float.valueOf(z10 ? 48.0f - f11.floatValue() : f11.floatValue());
            }
        };
        path.rewind();
        float f11 = f10 * 24.5f;
        path.moveTo(a8.p0.h((Float) y10Var.a(Float.valueOf(46.83f)), f10), org.telegram.messenger.g0.L(f11));
        path.lineTo(a8.p0.h((Float) y10Var.a(Float.valueOf(23.5f)), f10), org.telegram.messenger.g0.L(1.17f * f10));
        path.cubicTo(a8.p0.h((Float) y10Var.a(Float.valueOf(22.75f)), f10), org.telegram.messenger.g0.L(0.42f * f10), a8.p0.h((Float) y10Var.a(Float.valueOf(21.73f)), f10), 0.0f, a8.p0.h((Float) y10Var.a(Float.valueOf(20.68f)), f10), 0.0f);
        float f12 = f10 * 0.05f;
        path.cubicTo(a8.p0.h((Float) y10Var.a(Float.valueOf(19.62f)), f10), 0.0f, a8.p0.h((Float) y10Var.a(Float.valueOf(2.73f)), f10), org.telegram.messenger.g0.L(f12), a8.p0.h((Float) y10Var.a(Float.valueOf(1.55f)), f10), org.telegram.messenger.g0.L(f12));
        path.cubicTo(a8.p0.h((Float) y10Var.a(Float.valueOf(0.36f)), f10), org.telegram.messenger.g0.L(f12), a8.p0.h((Float) y10Var.a(Float.valueOf(-0.23f)), f10), org.telegram.messenger.g0.L(1.4885f * f10), a8.p0.h((Float) y10Var.a(Float.valueOf(0.6f)), f10), org.telegram.messenger.g0.L(2.32f * f10));
        path.lineTo(a8.p0.h((Float) y10Var.a(Float.valueOf(45.72f)), f10), org.telegram.messenger.g0.L(47.44f * f10));
        float h = a8.p0.h((Float) y10Var.a(Float.valueOf(46.56f)), f10);
        float L = org.telegram.messenger.g0.L(48.28f * f10);
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(h, L, a8.p0.h((Float) y10Var.a(valueOf), f10), org.telegram.messenger.g0.L(47.68f * f10), a8.p0.h((Float) y10Var.a(valueOf), f10), org.telegram.messenger.g0.L(46.5f * f10));
        path.cubicTo(a8.p0.h((Float) y10Var.a(valueOf), f10), org.telegram.messenger.g0.L(45.31f * f10), a8.p0.h((Float) y10Var.a(valueOf), f10), org.telegram.messenger.g0.L(28.38f * f10), a8.p0.h((Float) y10Var.a(valueOf), f10), org.telegram.messenger.g0.L(27.32f * f10));
        path.cubicTo(a8.p0.h((Float) y10Var.a(valueOf), f10), org.telegram.messenger.g0.L(26.26f * f10), a8.p0.h((Float) y10Var.a(Float.valueOf(47.5f)), f10), org.telegram.messenger.g0.L(25.24f * f10), a8.p0.h((Float) y10Var.a(Float.valueOf(46.82f)), f10), org.telegram.messenger.g0.L(f11));
        path.close();
    }

    public final void c(Canvas canvas, vy0 vy0Var, float f10) {
        canvas.save();
        canvas.translate(f10, f10);
        float width = (getBounds().width() / 2.0f) + org.telegram.messenger.g0.L(this.x ? -7.0f : 6.0f);
        float height = (getBounds().height() / 2.0f) - org.telegram.messenger.g0.L(this.x ? 5.0f : 6.0f);
        canvas.rotate(this.x ? -45.0f : 45.0f, width, height);
        float min = Math.min(1.0f, org.telegram.messenger.g0.L(40.0f) / vy0Var.c);
        canvas.scale(min, min, width, height);
        vy0Var.c(width - (vy0Var.k() / 2.0f), height + org.telegram.messenger.g0.L(1.0f), 1.0f, this.y, canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - org.telegram.messenger.g0.L(48.0f), getBounds().top);
        Paint paint = this.r;
        int alpha = paint.getAlpha();
        Path path = this.f;
        if (alpha > 0) {
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, (Paint) this.b);
        ec ecVar = this.w;
        float f10 = this.s;
        if (ecVar != null) {
            float f11 = f10 * 48.0f;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), null);
            this.w.f(0, 0, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f));
            this.w.d();
            this.w.a(canvas2, -1);
            Path path2 = this.h;
            path2.set(path);
            path2.toggleInverseFillType();
            canvas2.drawPath(path2, this.n);
            canvas2.restore();
            invalidateSelf();
        } else {
            canvas2 = canvas;
        }
        if (this.c != null) {
            org.telegram.ui.Components.c6 c6Var = this.e;
            float e10 = c6Var.e(false, 1.0f);
            if (!c6Var.i) {
                this.d = null;
            }
            canvas2.save();
            if (this.d == null || !c6Var.i) {
                c(canvas2, this.c, 0.0f);
            } else {
                canvas2.clipPath(path);
                float L = org.telegram.messenger.g0.L(f10 * 64.0f);
                c(canvas2, this.d, L * e10);
                c(canvas2, this.c, (1.0f - e10) * (-L));
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z10, boolean z11) {
        Paint paint = (Paint) this.b;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
        } else {
            boolean z12 = this.x ? !z10 : z10;
            paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{org.telegram.ui.ActionBar.n6.b(z12 ? 0.07f : 0.05f, (z12 ? -0.15f : -0.1f) - (z11 ? 0.125f : 0.0f), stargiftattributebackdrop.center_color | (-16777216)), org.telegram.ui.ActionBar.n6.b(z12 ? 0.07f : 0.05f, (z12 ? -0.15f : -0.1f) - (z11 ? 0.125f : 0.0f), stargiftattributebackdrop.edge_color | (-16777216))}, new float[]{z12 ? 1.0f : 0.0f, z12 ? 0.0f : 1.0f}, Shader.TileMode.CLAMP));
        }
    }

    public final void f(int i7) {
        Paint paint = (Paint) this.b;
        paint.setShader(null);
        paint.setColor(i7);
    }

    public final void g(int i7, CharSequence charSequence, boolean z10) {
        this.d = null;
        this.e.e(true, 1.0f);
        this.c = new vy0(charSequence, i7, z10 ? org.telegram.messenger.g0.o() : null);
        invalidateSelf();
    }

    public final void h(int i7, String str) {
        vy0 vy0Var = this.c;
        if (vy0Var == null) {
            g(i7, str, true);
        } else {
            if (TextUtils.equals(vy0Var.j(), str)) {
                return;
            }
            this.d = this.c;
            this.c = new vy0(str, i7, org.telegram.messenger.g0.o());
            this.e.e(true, 0.0f);
            invalidateSelf();
        }
    }
}
