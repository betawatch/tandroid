// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.HashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class dd9 extends ImageView implements tjb {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public byte e;
    public int f;
    public final wjb h;
    public boolean n;
    public boolean r;
    public boolean s;

    public dd9(int i, wjb wjbVar, Context context) {
        super(context);
        this.e = (byte) 20;
        this.f = bkb.c6;
        this.n = true;
        this.s = true;
        this.b = i;
        this.a = i;
        this.h = wjbVar;
        if (i != 0) {
            setImageResource(i);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        ote.a(this);
        updateColors();
    }

    public final void a() {
        e(this.a);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Ei));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(this.f));
    }

    public final void b() {
        if (this.s) {
            this.s = false;
            updateColors();
        }
    }

    public final void c(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        updateColors();
    }

    public final void d() {
        this.c = true;
        fd9 fd9Var = new fd9(getContext(), this.b);
        fd9Var.d = this.f;
        fd9Var.a(this.d);
        setImageDrawable(fd9Var);
    }

    public final void e(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        if (!this.c) {
            gl.M3(this, i);
            return;
        }
        fd9 fd9Var = new fd9(getContext(), i);
        fd9Var.d = this.f;
        fd9Var.a(this.d);
        gl.N3(this, fd9Var);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.n == z) {
            return;
        }
        setClickable(z);
        ViewPropertyAnimator animate = animate();
        this.n = z;
        animate.alpha(z ? 1.0f : 0.5f).setDuration(320L).setInterpolator(s33.h).start();
    }

    public void setPremiumLocked(boolean z) {
        this.d = z;
        if (getDrawable() instanceof fd9) {
            ((fd9) getDrawable()).a(z);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z) {
        if (this.r == z) {
            return;
        }
        this.r = z;
        updateColors();
    }

    @Override // tjb
    public final void updateColors() {
        boolean z = this.r;
        wjb wjbVar = this.h;
        if (!z) {
            setBackground(bkb.Z(bkb.v0(this.f, wjbVar), bkb.v0(bkb.h6, wjbVar), gl.L(this.e), gl.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.F6, wjbVar), PorterDuff.Mode.SRC_IN));
        } else {
            int w0 = bkb.w0(null, this.s ? bkb.Ei : bkb.F6, false);
            setBackground(bkb.Z(bkb.v(bkb.v0(this.f, wjbVar), bkb.p1(0.1f, w0)), bkb.p1(0.1f, w0), gl.L(this.e), gl.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
        }
    }
}
