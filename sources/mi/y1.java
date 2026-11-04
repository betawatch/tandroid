package mi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import b8.pf;
import java.util.HashSet;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class y1 extends ImageView implements org.telegram.ui.ActionBar.z5 {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public final org.telegram.ui.ActionBar.e6 h;
    public boolean n;
    public boolean r;
    public boolean s;

    public y1(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = 20;
        this.f = k6.d6;
        this.n = true;
        this.s = true;
        this.b = i3;
        this.a = i3;
        this.h = e6Var;
        if (i3 != 0) {
            setImageResource(i3);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        pf.a(this);
        updateColors();
    }

    public final void a() {
        e(this.a);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Ci));
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.i6));
        hashSet.add(Integer.valueOf(this.f));
    }

    public final void b() {
        if (this.s) {
            this.s = false;
            updateColors();
        }
    }

    public final void c(int i3) {
        if (this.f == i3) {
            return;
        }
        this.f = i3;
        updateColors();
    }

    public final void d() {
        this.c = true;
        a2 a2Var = new a2(getContext(), this.b);
        a2Var.d = this.f;
        a2Var.a(this.d);
        setImageDrawable(a2Var);
    }

    public final void e(int i3) {
        if (this.b == i3) {
            return;
        }
        this.b = i3;
        if (!this.c) {
            org.telegram.messenger.g0.R3(this, i3);
            return;
        }
        a2 a2Var = new a2(getContext(), i3);
        a2Var.d = this.f;
        a2Var.a(this.d);
        org.telegram.messenger.g0.S3(this, a2Var);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (this.n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.n = z10;
        animate.alpha(z10 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(xq.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof a2) {
            ((a2) getDrawable()).a(z10);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        if (!z10) {
            setBackground(k6.b0(k6.w0(this.f, e6Var), k6.w0(k6.i6, e6Var), org.telegram.messenger.g0.L(this.e), org.telegram.messenger.g0.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(k6.w0(k6.G6, e6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int x02 = k6.x0(null, this.s ? k6.Ci : k6.G6, false);
            setBackground(k6.b0(k6.w(k6.w0(this.f, e6Var), k6.r1(0.1f, x02)), k6.r1(0.1f, x02), org.telegram.messenger.g0.L(this.e), org.telegram.messenger.g0.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }
}
