package li;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.ka;
import java.util.HashSet;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class x1 extends ImageView implements org.telegram.ui.ActionBar.c6 {
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
        ka.a(this);
        updateColors();
    }

    public final void a() {
        e(this.a);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Ci));
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
            org.telegram.messenger.g0.R3(this, i7);
            return;
        }
        z1 z1Var = new z1(getContext(), i7);
        z1Var.d = this.f;
        z1Var.a(this.d);
        org.telegram.messenger.g0.S3(this, z1Var);
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        if (this.n == z9) {
            return;
        }
        setClickable(z9);
        ViewPropertyAnimator animate = animate();
        this.n = z9;
        animate.alpha(z9 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(wq.h).start();
    }

    public void setPremiumLocked(boolean z9) {
        this.d = z9;
        if (getDrawable() instanceof z1) {
            ((z1) getDrawable()).a(z9);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z9) {
        if (this.r == z9) {
            return;
        }
        this.r = z9;
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        boolean z9 = this.r;
        h6 h6Var = this.h;
        if (!z9) {
            setBackground(m6.b0(m6.w0(this.f, h6Var), m6.w0(m6.i6, h6Var), org.telegram.messenger.g0.L(this.e), org.telegram.messenger.g0.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(m6.w0(m6.G6, h6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int x02 = m6.x0(null, this.s ? m6.Ci : m6.G6, false);
            setBackground(m6.b0(m6.w(m6.w0(this.f, h6Var), m6.r1(0.1f, x02)), m6.r1(0.1f, x02), org.telegram.messenger.g0.L(this.e), org.telegram.messenger.g0.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }
}
