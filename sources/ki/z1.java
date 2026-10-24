package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class z1 extends ImageView implements org.telegram.ui.ActionBar.b6 {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public final org.telegram.ui.ActionBar.g6 h;
    public boolean n;
    public boolean r;
    public boolean s;

    public z1(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = 20;
        this.f = k6.d6;
        this.n = true;
        this.s = true;
        this.b = i10;
        this.a = i10;
        this.h = g6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.b6.a(this);
        updateColors();
    }

    public final void a() {
        e(this.a);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Oh));
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

    public final void c(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        updateColors();
    }

    public final void d() {
        this.c = true;
        b2 b2Var = new b2(getContext(), this.b);
        b2Var.d = this.f;
        b2Var.a(this.d);
        setImageDrawable(b2Var);
    }

    public final void e(int i10) {
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

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (this.n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.n = z10;
        animate.alpha(z10 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(bs.h).start();
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
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        boolean z10 = this.r;
        org.telegram.ui.ActionBar.g6 g6Var = this.h;
        if (!z10) {
            setBackground(k6.a0(k6.w0(this.f, g6Var), k6.w0(k6.i6, g6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(k6.w0(k6.G6, g6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int x02 = k6.x0(null, this.s ? k6.Oh : k6.G6, false);
            setBackground(k6.a0(k6.v(k6.w0(this.f, g6Var), k6.o1(0.1f, x02)), k6.o1(0.1f, x02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }
}
