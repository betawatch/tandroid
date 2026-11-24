// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ff9 extends ImageView implements vlb {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public byte e;
    public int f;
    public final ylb h;
    public boolean n;
    public boolean r;
    public boolean s;

    public ff9(int i, ylb ylbVar, Context context) {
        super(context);
        this.e = (byte) 20;
        this.f = cmb.c6;
        this.n = true;
        this.s = true;
        this.b = i;
        this.a = i;
        this.h = ylbVar;
        if (i != 0) {
            setImageResource(i);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        rve.a(this);
        updateColors();
    }

    public final void a() {
        e(this.a);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Ei));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.h6));
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
        hf9 hf9Var = new hf9(getContext(), this.b);
        hf9Var.d = this.f;
        hf9Var.a(this.d);
        setImageDrawable(hf9Var);
    }

    public final void e(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        if (!this.c) {
            gm.L3(this, i);
            return;
        }
        hf9 hf9Var = new hf9(getContext(), i);
        hf9Var.d = this.f;
        hf9Var.a(this.d);
        gm.M3(this, hf9Var);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.n == z) {
            return;
        }
        setClickable(z);
        ViewPropertyAnimator animate = animate();
        this.n = z;
        animate.alpha(z ? 1.0f : 0.5f).setDuration(320L).setInterpolator(d53.h).start();
    }

    public void setPremiumLocked(boolean z) {
        this.d = z;
        if (getDrawable() instanceof hf9) {
            ((hf9) getDrawable()).a(z);
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

    @Override // vlb
    public final void updateColors() {
        boolean z = this.r;
        ylb ylbVar = this.h;
        if (!z) {
            setBackground(cmb.Z(cmb.v0(this.f, ylbVar), cmb.v0(cmb.h6, ylbVar), gm.L(this.e), gm.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.F6, ylbVar), PorterDuff.Mode.SRC_IN));
        } else {
            int w0 = cmb.w0(null, this.s ? cmb.Ei : cmb.F6, false);
            setBackground(cmb.Z(cmb.v(cmb.v0(this.f, ylbVar), cmb.p1(0.1f, w0)), cmb.p1(0.1f, w0), gm.L(this.e), gm.L(this.e)));
            setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
        }
    }
}
