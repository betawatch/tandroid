package li;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class x1 extends ImageView implements p6 {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public final u6 h;
    public boolean n;
    public boolean r;
    public boolean s;

    public x1(Context context, int i10, u6 u6Var) {
        super(context);
        this.e = 20;
        this.f = y6.d6;
        this.n = true;
        this.s = true;
        this.b = i10;
        this.a = i10;
        this.h = u6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        kb1.b(this);
        updateColors();
    }

    public final void a() {
        e(this.a);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.Oh));
        hashSet.add(Integer.valueOf(y6.G6));
        hashSet.add(Integer.valueOf(y6.i6));
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
        z1 z1Var = new z1(getContext(), this.b);
        z1Var.d = this.f;
        z1Var.a(this.d);
        setImageDrawable(z1Var);
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
        z1 z1Var = new z1(getContext(), i10);
        z1Var.d = this.f;
        z1Var.a(this.d);
        AndroidUtilities.updateImageViewImageAnimated(this, z1Var);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (this.n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.n = z10;
        animate.alpha(z10 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(ds.h).start();
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        boolean z10 = this.r;
        u6 u6Var = this.h;
        if (!z10) {
            setBackground(y6.a0(y6.w0(this.f, u6Var), y6.w0(y6.i6, u6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(y6.w0(y6.G6, u6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int x02 = y6.x0(null, this.s ? y6.Oh : y6.G6, false);
            setBackground(y6.a0(y6.v(y6.w0(this.f, u6Var), y6.o1(0.1f, x02)), y6.o1(0.1f, x02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }
}
