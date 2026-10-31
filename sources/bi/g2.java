package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class g2 extends ImageView implements org.telegram.ui.ActionBar.k6 {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public final org.telegram.ui.ActionBar.p6 h;
    public boolean n;
    public boolean r;
    public boolean s;

    public g2(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.e = 20;
        this.f = org.telegram.ui.ActionBar.t6.d6;
        this.n = true;
        this.s = true;
        this.b = i10;
        this.a = i10;
        this.h = p6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.e6.a(this);
        updateColors();
    }

    public final void a() {
        e(this.a);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(this.f));
    }

    public final void b() {
        if (this.s) {
            this.s = false;
            updateColors();
        }
    }

    public final void c(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        updateColors();
    }

    public final void d() {
        this.c = true;
        i2 i2Var = new i2(getContext(), this.b);
        i2Var.d = this.f;
        i2Var.a(this.d);
        setImageDrawable(i2Var);
    }

    public final void e(int i10) {
        if (this.b == i10) {
            return;
        }
        this.b = i10;
        if (!this.c) {
            org.telegram.messenger.i0.Q3(this, i10);
            return;
        }
        i2 i2Var = new i2(getContext(), i10);
        i2Var.d = this.f;
        i2Var.a(this.d);
        org.telegram.messenger.i0.R3(this, i2Var);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (this.n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.n = z10;
        animate.alpha(z10 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(gr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof i2) {
            ((i2) getDrawable()).a(z10);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z10) {
        if (this.r == z10) {
            return;
        }
        this.r = z10;
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        boolean z10 = this.r;
        org.telegram.ui.ActionBar.p6 p6Var = this.h;
        if (!z10) {
            setBackground(org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.w0(this.f, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var), org.telegram.messenger.i0.L(this.e), org.telegram.messenger.i0.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, this.s ? org.telegram.ui.ActionBar.t6.Ci : org.telegram.ui.ActionBar.t6.G6, false);
            setBackground(org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(this.f, p6Var), org.telegram.ui.ActionBar.t6.r1(0.1f, x02)), org.telegram.ui.ActionBar.t6.r1(0.1f, x02), org.telegram.messenger.i0.L(this.e), org.telegram.messenger.i0.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }
}
