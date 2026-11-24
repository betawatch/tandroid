// default package

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kf8 extends zf8 implements g94 {
    public final fn0 d;
    public final int[] e;
    public final Drawable f;
    public final TextPaint h;
    public StaticLayout n;
    public int r;
    public int s;

    public kf8(Context context, ylb ylbVar) {
        super(ylbVar);
        this.d = new fn0(0, this, d53.h, 320L, false);
        this.e = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.f = b10.d(context, org.telegram.messenger.beta.R.drawable.outline_poll_add_24);
        this.h = new TextPaint(cmb.O2);
        int v0 = cmb.v0(cmb.h6, ylbVar);
        if (this.b != v0) {
            cmb.F1(this.a, v0, false);
            this.b = v0;
        }
        b();
        c();
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        b();
        c();
        invalidateSelf();
    }

    @Override // zf8
    public final void a(int i) {
        this.a.setAlpha(i);
        b();
        c();
    }

    public final void b() {
        this.f.setAlpha((int) ((1.0f - this.d.e) * this.c));
    }

    public final void c() {
        this.h.setAlpha((int) ((1.0f - this.d.e) * this.c));
    }

    public final void d(boolean z, boolean z2) {
        this.d.a(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.a.draw(canvas);
        ur3.b(canvas, this.f, 1.0f - this.d.e);
        if (this.n != null) {
            canvas.save();
            canvas.translate(gm.L(44.0f) + bounds.left, gm.L(13.66f) + bounds.top);
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i) {
        if (this.s != i) {
            this.s = i;
            this.h.setColor(i);
            this.f.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            c();
        }
    }

    @Override // zf8, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float exactCenterY = rect.exactCenterY();
        float L = gm.L(22.33f) + rect.left;
        gm.L(27.0f);
        ur3.d(this.f, L, exactCenterY, 17);
        int width = rect.width() - gm.L(56.0f);
        if (this.n == null || this.r != width) {
            this.r = width;
            this.n = new StaticLayout(jb6.M0(2131746917, null), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}
