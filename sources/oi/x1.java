package oi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.ra;
import java.util.HashSet;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class x1 extends ImageView implements org.telegram.ui.ActionBar.b6 {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public final h6 h;
    public boolean n;
    public boolean r;
    public boolean s;

    public x1(int i7, Context context, h6 h6Var) {
        super(context);
        this.e = 20;
        this.f = m6.d6;
        this.n = true;
        this.s = true;
        this.b = i7;
        this.a = i7;
        this.h = h6Var;
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Fi));
        hashSet.add(Integer.valueOf(m6.G6));
        hashSet.add(Integer.valueOf(m6.i6));
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
        z1 z1Var = new z1(getContext(), this.b);
        z1Var.d = this.f;
        z1Var.a(this.d);
        setImageDrawable(z1Var);
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
        z1 z1Var = new z1(getContext(), i7);
        z1Var.d = this.f;
        z1Var.a(this.d);
        org.telegram.messenger.g0.Q3(this, z1Var);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (this.n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.n = z10;
        animate.alpha(z10 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(nr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof z1) {
            ((z1) getDrawable()).a(z10);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        boolean z10 = this.r;
        h6 h6Var = this.h;
        if (!z10) {
            setBackground(m6.b0(m6.w0(this.f, h6Var), m6.w0(m6.i6, h6Var), org.telegram.messenger.g0.L(this.e), org.telegram.messenger.g0.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(m6.w0(m6.G6, h6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int x02 = m6.x0(null, this.s ? m6.Fi : m6.G6, false);
            setBackground(m6.b0(m6.w(m6.w0(this.f, h6Var), m6.r1(0.1f, x02)), m6.r1(0.1f, x02), org.telegram.messenger.g0.L(this.e), org.telegram.messenger.g0.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }
}
