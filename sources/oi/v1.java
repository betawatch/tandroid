package oi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.ra;
import java.util.HashSet;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class v1 extends ImageView implements org.telegram.ui.ActionBar.c6 {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public final i6 h;
    public boolean n;
    public boolean r;
    public boolean s;

    public v1(int i7, Context context, i6 i6Var) {
        super(context);
        this.e = 20;
        this.f = n6.d6;
        this.n = true;
        this.s = true;
        this.b = i7;
        this.a = i7;
        this.h = i6Var;
        if (i7 != 0) {
            setImageResource(i7);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        ra.a(this);
        updateColors();
    }

    public final void a() {
        e(this.a);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.Fi));
        hashSet.add(Integer.valueOf(n6.G6));
        hashSet.add(Integer.valueOf(n6.i6));
        hashSet.add(Integer.valueOf(this.f));
    }

    public final void b() {
        if (this.s) {
            this.s = false;
            updateColors();
        }
    }

    public final void c(int i7) {
        if (this.f == i7) {
            return;
        }
        this.f = i7;
        updateColors();
    }

    public final void d() {
        this.c = true;
        x1 x1Var = new x1(getContext(), this.b);
        x1Var.d = this.f;
        x1Var.a(this.d);
        setImageDrawable(x1Var);
    }

    public final void e(int i7) {
        if (this.b == i7) {
            return;
        }
        this.b = i7;
        if (!this.c) {
            org.telegram.messenger.g0.P3(this, i7);
            return;
        }
        x1 x1Var = new x1(getContext(), i7);
        x1Var.d = this.f;
        x1Var.a(this.d);
        org.telegram.messenger.g0.Q3(this, x1Var);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (this.n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.n = z10;
        animate.alpha(z10 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(lr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof x1) {
            ((x1) getDrawable()).a(z10);
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        boolean z10 = this.r;
        i6 i6Var = this.h;
        if (!z10) {
            setBackground(n6.b0(n6.w0(this.f, i6Var), n6.w0(n6.i6, i6Var), org.telegram.messenger.g0.L(this.e), org.telegram.messenger.g0.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(n6.w0(n6.G6, i6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int x02 = n6.x0(null, this.s ? n6.Fi : n6.G6, false);
            setBackground(n6.b0(n6.w(n6.w0(this.f, i6Var), n6.r1(0.1f, x02)), n6.r1(0.1f, x02), org.telegram.messenger.g0.L(this.e), org.telegram.messenger.g0.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }
}
