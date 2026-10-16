package ji;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class z1 extends ImageView implements org.telegram.ui.ActionBar.x5 {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public final org.telegram.ui.ActionBar.c6 h;
    public boolean n;
    public boolean r;
    public boolean s;

    public z1(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = 20;
        this.f = org.telegram.ui.ActionBar.g6.d6;
        this.n = true;
        this.s = true;
        this.b = i10;
        this.a = i10;
        this.h = c6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.b6.a(this);
        d();
    }

    public final void a() {
        f(this.a);
    }

    public final void b() {
        if (this.s) {
            this.s = false;
            d();
        }
    }

    public final void c(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        d();
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        boolean z10 = this.r;
        org.telegram.ui.ActionBar.c6 c6Var = this.h;
        if (!z10) {
            setBackground(org.telegram.ui.ActionBar.g6.a0(org.telegram.ui.ActionBar.g6.w0(this.f, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, c6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, this.s ? org.telegram.ui.ActionBar.g6.Oh : org.telegram.ui.ActionBar.g6.G6, false);
            setBackground(org.telegram.ui.ActionBar.g6.a0(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(this.f, c6Var), org.telegram.ui.ActionBar.g6.m1(0.1f, x02)), org.telegram.ui.ActionBar.g6.m1(0.1f, x02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void e() {
        this.c = true;
        b2 b2Var = new b2(getContext(), this.b);
        b2Var.d = this.f;
        b2Var.a(this.d);
        setImageDrawable(b2Var);
    }

    public final void f(int i10) {
        if (this.b == i10) {
            return;
        }
        this.b = i10;
        if (!this.c) {
            AndroidUtilities.updateImageViewImageAnimated(this, i10);
            return;
        }
        b2 b2Var = new b2(getContext(), i10);
        b2Var.d = this.f;
        b2Var.a(this.d);
        AndroidUtilities.updateImageViewImageAnimated(this, b2Var);
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (this.n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.n = z10;
        animate.alpha(z10 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(es.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof b2) {
            ((b2) getDrawable()).a(z10);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z10) {
        if (this.r == z10) {
            return;
        }
        this.r = z10;
        d();
    }
}
