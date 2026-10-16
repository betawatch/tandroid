package jh;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ne.d;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gq;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class a extends FrameLayout implements d {
    public final ne.b a;
    public final ne.b b;
    public ImageView c;
    public ImageView d;
    public gq e;
    public c6 f;
    public float h;
    public dh.d n;

    public a(Context context) {
        super(context);
        es esVar = es.h;
        this.a = new ne.b(0, this, esVar, 320L, false);
        this.b = new ne.b(1, this, esVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, bh.b bVar, eh.a aVar, c6 c6Var) {
        int w02 = g6.w0(g6.Wk, c6Var);
        a aVar2 = new a(context);
        aVar2.f = c6Var;
        aVar2.setBlurredBackgroundDrawable(bVar.c(aVar2, aVar, false));
        aVar2.setIconColor(w02);
        int dp = AndroidUtilities.dp(22.0f);
        int m12 = g6.m1(0.15f, w02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar2.setBackground(g6.X(dp, m12, dp2, dp2, dp2, dp2));
        return aVar2;
    }

    public static a d(Context context, bh.b bVar, eh.a aVar, c6 c6Var, int i10, int i11) {
        int w02 = g6.w0(g6.Wk, c6Var);
        a aVar2 = new a(context);
        aVar2.f = c6Var;
        aVar2.setBlurredBackgroundDrawable(bVar.c(aVar2, aVar, false));
        aVar2.f(i10, i11);
        aVar2.setIconColor(w02);
        int dp = AndroidUtilities.dp(22.0f);
        int m12 = g6.m1(0.15f, w02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar2.setBackground(g6.X(dp, m12, dp2, dp2, dp2, dp2));
        return aVar2;
    }

    public final void a() {
        float f7 = 1.0f - this.a.e;
        float lerp = AndroidUtilities.lerp(f7 / 2.0f, f7, this.b.e);
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.c.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
            this.c.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7) * this.h);
            this.c.setVisibility(f7 > 0.0f ? 0 : 8);
        }
    }

    public final void b() {
        float f7 = this.a.e;
        float lerp = AndroidUtilities.lerp(f7 / 2.0f, f7, this.b.e);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.d.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
            this.d.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7));
            int i10 = f7 > 0.0f ? 0 : 8;
            if (this.d.getVisibility() != i10) {
                this.d.setVisibility(i10);
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
        this.n.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.b.a(z10, z11);
    }

    public final void f(int i10, int i11) {
        if (this.c == null) {
            if (i10 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.c, z5.e(i11, i11, 17));
            a();
        }
        this.c.setImageResource(i10);
    }

    public final void g() {
        dh.d dVar = this.n;
        if (dVar != null) {
            dVar.v();
            invalidate();
        }
        int i10 = g6.Wk;
        int w02 = g6.w0(i10, this.f);
        setIconColor(g6.w0(i10, this.f));
        int dp = AndroidUtilities.dp(22.0f);
        int m12 = g6.m1(0.15f, w02);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(g6.X(dp, m12, dp2, dp2, dp2, dp2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.n.setBounds(0, 0, i10, i11);
    }

    @Override // ne.d
    public final void p(int i10, float f7, float f10, e eVar) {
        if (i10 == 0) {
            a();
            b();
        }
        if (i10 == 1) {
            a();
            b();
        }
    }

    public void setBlurredBackgroundDrawable(dh.d dVar) {
        this.n = dVar;
        dVar.p(AndroidUtilities.dp(6.0f));
        this.n.q(AndroidUtilities.dp(22.0f));
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        e(z10, false);
    }

    public void setIcon(int i10) {
        f(i10, 48);
    }

    public void setIconColor(int i10) {
        BlendMode blendMode;
        ImageView imageView = this.c;
        if (imageView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29) {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        } else {
            blendMode = BlendMode.SRC_IN;
            imageView.setColorFilter(new BlendModeColorFilter(i10, blendMode));
        }
    }

    public void setIconPadding(int i10) {
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setPadding(0, i10, 0, 0);
        }
    }

    @Override // ne.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
