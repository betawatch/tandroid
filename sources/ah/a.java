package ah;

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
import ff.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a extends c implements td.b {
    public final td.a d;
    public final int[] e;
    public final Drawable f;
    public final TextPaint h;
    public StaticLayout n;
    public int r;
    public int s;

    public a(Context context, b6 b6Var) {
        super(b6Var);
        this.d = new td.a(0, this, gr.h, 320L, false);
        this.e = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.f = context.getResources().getDrawable(org.telegram.messenger.R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(f6.P2);
        int v02 = f6.v0(f6.i6, b6Var);
        if (this.b != v02) {
            f6.B1(this.a, v02, false);
            this.b = v02;
        }
        b();
        c();
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override // ah.c
    public final void a(int i9) {
        this.a.setAlpha(i9);
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
        s.b(canvas, this.f, 1.0f - this.d.e);
        if (this.n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i9) {
        if (this.s != i9) {
            this.s = i9;
            this.h.setColor(i9);
            this.f.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
            c();
        }
    }

    @Override // ah.c, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float exactCenterY = rect.exactCenterY();
        float dp = AndroidUtilities.dp(22.33f) + rect.left;
        AndroidUtilities.dp(27.0f);
        AndroidUtilities.dp(44.0f);
        s.d(this.f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.n == null || this.r != width) {
            this.r = width;
            this.n = new StaticLayout(LocaleController.getString(org.telegram.messenger.R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
