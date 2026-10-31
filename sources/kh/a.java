package kh;

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
import fe.e;
import fe.f;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import rf.o;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a extends c implements e {
    public final fe.b d;
    public final int[] e;
    public final Drawable f;
    public final TextPaint h;
    public StaticLayout n;
    public int r;
    public int s;

    public a(Context context, p6 p6Var) {
        super(p6Var);
        this.d = new fe.b(0, this, gr.h, 320L, false);
        this.e = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.f = i0.a.f(context, org.telegram.messenger.beta.R.drawable.outline_poll_add_24);
        this.h = new TextPaint(t6.P2);
        int w02 = t6.w0(t6.i6, p6Var);
        if (this.b != w02) {
            t6.H1(this.a, w02, false);
            this.b = w02;
        }
        b();
        c();
    }

    @Override // kh.c
    public final void a(int i10) {
        this.a.setAlpha(i10);
        b();
        c();
    }

    public final void b() {
        this.f.setAlpha((int) ((1.0f - this.d.e) * this.c));
    }

    public final void c() {
        this.h.setAlpha((int) ((1.0f - this.d.e) * this.c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.a.draw(canvas);
        o.b(canvas, this.f, 1.0f - this.d.e);
        if (this.n != null) {
            canvas.save();
            canvas.translate(i0.L(44.0f) + bounds.left, i0.L(13.66f) + bounds.top);
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.s != i10) {
            this.s = i10;
            this.h.setColor(i10);
            this.f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            c();
        }
    }

    @Override // kh.c, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float exactCenterY = rect.exactCenterY();
        float L = i0.L(22.33f) + rect.left;
        i0.L(27.0f);
        i0.L(44.0f);
        o.d(this.f, L, exactCenterY, 17);
        int width = rect.width() - i0.L(56.0f);
        if (this.n == null || this.r != width) {
            this.r = width;
            this.n = new StaticLayout(cd.L0(2131747199, null), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, f fVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
