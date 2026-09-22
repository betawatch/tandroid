package ii;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class z1 extends ImageView implements org.telegram.ui.ActionBar.z5 {
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

    public z1(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = 20;
        this.f = i6.d6;
        this.n = true;
        this.s = true;
        this.b = i10;
        this.a = i10;
        this.h = e6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.z5.a(this);
        e();
    }

    public final void a() {
        f(this.a);
    }

    public final void b() {
        if (this.s) {
            this.s = false;
            e();
        }
    }

    public final void c(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        e();
    }

    public final void d() {
        this.c = true;
        b2 b2Var = new b2(getContext(), this.b);
        b2Var.d = this.f;
        b2Var.a(this.d);
        setImageDrawable(b2Var);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        boolean z10 = this.r;
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        if (!z10) {
            setBackground(i6.Z(i6.v0(this.f, e6Var), i6.v0(i6.i6, e6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(i6.v0(i6.G6, e6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int w02 = i6.w0(null, this.s ? i6.Oh : i6.G6, false);
            setBackground(i6.Z(i6.v(i6.v0(this.f, e6Var), i6.l1(0.1f, w02)), i6.l1(0.1f, w02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void f(int i10) {
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

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (this.n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.n = z10;
        animate.alpha(z10 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(qr.h).start();
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
        e();
    }
}
