package li;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.ka;
import java.util.HashSet;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class x1 extends ImageView implements org.telegram.ui.ActionBar.a6 {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public final f6 h;
    public boolean n;
    public boolean r;
    public boolean s;

    public x1(int i7, Context context, f6 f6Var) {
        super(context);
        this.e = 20;
        this.f = k6.d6;
        this.n = true;
        this.s = true;
        this.b = i7;
        this.a = i7;
        this.h = f6Var;
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

    @Override // org.telegram.ui.ActionBar.a6
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
        animate.alpha(z9 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(xq.h).start();
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        boolean z9 = this.r;
        f6 f6Var = this.h;
        if (!z9) {
            setBackground(k6.b0(k6.w0(this.f, f6Var), k6.w0(k6.i6, f6Var), org.telegram.messenger.g0.L(this.e), org.telegram.messenger.g0.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(k6.w0(k6.G6, f6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int x02 = k6.x0(null, this.s ? k6.Ci : k6.G6, false);
            setBackground(k6.b0(k6.w(k6.w0(this.f, f6Var), k6.r1(0.1f, x02)), k6.r1(0.1f, x02), org.telegram.messenger.g0.L(this.e), org.telegram.messenger.g0.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }
}
