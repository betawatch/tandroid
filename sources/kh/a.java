package kh;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import dh.c;
import fh.g;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a extends FrameLayout implements te.b, b6 {
    public final te.a a;
    public final te.a b;
    public ImageView c;
    public ImageView d;
    public cp e;
    public g6 f;
    public float h;
    public int n;
    public g r;

    public a(Context context) {
        super(context);
        xq xqVar = xq.h;
        this.a = new te.a(0, this, xqVar, 320L, false);
        this.b = new te.a(1, this, xqVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, c cVar, gh.a aVar, g6 g6Var) {
        int i7 = l6.Kl;
        int w02 = l6.w0(i7, g6Var);
        a aVar2 = new a(context);
        aVar2.f = g6Var;
        aVar2.setBlurredBackgroundDrawable(cVar.c(aVar2, aVar, false));
        aVar2.setIconColor(w02);
        int L = g0.L(22.0f);
        int r12 = l6.r1(0.15f, w02);
        int L2 = g0.L(6.0f);
        y Y = l6.Y(L, r12, L2, L2, L2, L2);
        o6 K = s6.K(0.15f, i7);
        aVar2.setBackground(Y);
        s6.j(aVar2, Y, null, K, g6Var);
        return aVar2;
    }

    public static a d(Context context, c cVar, gh.a aVar, g6 g6Var, int i7, int i10) {
        int i11 = l6.Kl;
        int w02 = l6.w0(i11, g6Var);
        a aVar2 = new a(context);
        aVar2.f = g6Var;
        aVar2.setBlurredBackgroundDrawable(cVar.c(aVar2, aVar, false));
        aVar2.f(i7, i10);
        aVar2.setIconColor(w02);
        int L = g0.L(22.0f);
        int r12 = l6.r1(0.15f, w02);
        int L2 = g0.L(6.0f);
        y Y = l6.Y(L, r12, L2, L2, L2, L2);
        o6 K = s6.K(0.15f, i11);
        aVar2.setBackground(Y);
        s6.j(aVar2, Y, null, K, g6Var);
        return aVar2;
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            a();
            b();
        }
        if (i7 == 1) {
            a();
            b();
        }
    }

    public final void a() {
        float f10 = 1.0f - this.a.e;
        float T1 = g0.T1(f10 / 2.0f, f10, this.b.e);
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setAlpha(T1);
            this.c.setScaleX(g0.T1(0.4f, 1.0f, f10));
            this.c.setScaleY(g0.T1(0.4f, 1.0f, f10) * this.h);
            this.c.setVisibility(f10 > 0.0f ? 0 : 8);
        }
    }

    public final void b() {
        float f10 = this.a.e;
        float T1 = g0.T1(f10 / 2.0f, f10, this.b.e);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setAlpha(T1);
            this.d.setScaleX(g0.T1(0.4f, 1.0f, f10));
            this.d.setScaleY(g0.T1(0.4f, 1.0f, f10));
            int i7 = f10 > 0.0f ? 0 : 8;
            if (this.d.getVisibility() != i7) {
                this.d.setVisibility(i7);
                this.e.c = -1L;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.r.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z9, boolean z10) {
        super.setEnabled(z9);
        this.b.a(z9, z10);
    }

    public final void f(int i7, int i10) {
        if (this.c == null) {
            if (i7 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.c, ha.e(i10, i10, 17));
            a();
        }
        this.c.setImageResource(i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.r.setBounds(0, 0, i7, i10);
    }

    public void setBlurredBackgroundDrawable(g gVar) {
        this.r = gVar;
        gVar.q(g0.L(6.0f));
        this.r.r(g0.L(22.0f));
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        e(z9, false);
    }

    public void setIcon(int i7) {
        f(i7, 48);
    }

    public void setIconColor(int i7) {
        BlendMode blendMode;
        ImageView imageView = this.c;
        if (imageView == null) {
            return;
        }
        this.n = i7;
        if (Build.VERSION.SDK_INT < 29) {
            imageView.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        } else {
            blendMode = BlendMode.SRC_IN;
            imageView.setColorFilter(new BlendModeColorFilter(i7, blendMode));
        }
    }

    public void setIconPadding(int i7) {
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setPadding(0, i7, 0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        g gVar = this.r;
        if (gVar != null) {
            gVar.updateColors();
            invalidate();
        }
        int w02 = l6.w0(l6.Kl, this.f);
        if (this.c != null && w02 != this.n) {
            setIconColor(w02);
        }
        int L = g0.L(22.0f);
        int r12 = l6.r1(0.15f, w02);
        if (getBackground() instanceof RippleDrawable) {
            l6.H1(getBackground(), r12, true);
        } else {
            int L2 = g0.L(6.0f);
            setBackground(l6.Y(L, r12, L2, L2, L2, L2));
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
