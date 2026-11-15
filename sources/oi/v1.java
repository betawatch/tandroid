package oi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.na;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class v1 extends ImageView implements org.telegram.ui.ActionBar.z5 {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public final e6 h;
    public boolean n;
    public boolean r;
    public boolean s;

    public v1(int i7, Context context, e6 e6Var) {
        super(context);
        this.e = 20;
        this.f = j6.d6;
        this.n = true;
        this.s = true;
        this.b = i7;
        this.a = i7;
        this.h = e6Var;
        if (i7 != 0) {
            setImageResource(i7);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        na.a(this);
        updateColors();
    }

    public final void a() {
        e(this.a);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.Fi));
        hashSet.add(Integer.valueOf(j6.G6));
        hashSet.add(Integer.valueOf(j6.i6));
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
            org.telegram.messenger.g0.Q3(this, i7);
            return;
        }
        x1 x1Var = new x1(getContext(), i7);
        x1Var.d = this.f;
        x1Var.a(this.d);
        org.telegram.messenger.g0.R3(this, x1Var);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (this.n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.n = z10;
        animate.alpha(z10 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(er.h).start();
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        boolean z10 = this.r;
        e6 e6Var = this.h;
        if (!z10) {
            setBackground(j6.b0(j6.w0(this.f, e6Var), j6.w0(j6.i6, e6Var), org.telegram.messenger.g0.L(this.e), org.telegram.messenger.g0.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(j6.w0(j6.G6, e6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int x02 = j6.x0(null, this.s ? j6.Fi : j6.G6, false);
            setBackground(j6.b0(j6.w(j6.w0(this.f, e6Var), j6.r1(0.1f, x02)), j6.r1(0.1f, x02), org.telegram.messenger.g0.L(this.e), org.telegram.messenger.g0.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }
}
