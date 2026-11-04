package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import b8.pf;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s1 extends FrameLayout {
    public final FrameLayout a;
    public final View b;
    public final ImageView c;
    public final r1 d;
    public boolean e;
    public ValueAnimator f;
    public boolean h;
    public float n;
    public ValueAnimator r;

    public s1(Context context, hh.b bVar) {
        super(context);
        pf.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        eh.j jVar = new eh.j();
        jVar.a = bVar;
        jVar.a();
        jVar.g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f = org.telegram.messenger.g0.L(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, mf.e(40, 40, 17));
        View view = new View(context);
        this.b = view;
        view.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(40.0f), -13522392));
        frameLayout.addView(view, mf.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        r1 r1Var = new r1(context);
        this.d = r1Var;
        addView(r1Var, mf.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, mf.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10 && z11) {
            return;
        }
        this.e = z10;
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f = null;
        }
        boolean z12 = true;
        r1 r1Var = this.d;
        if (z11) {
            r1Var.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(r1Var.getAlpha(), z10 ? 0.0f : 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new q1(this, 0));
            this.f.setDuration(320L);
            this.f.setInterpolator(xq.h);
            this.f.start();
        } else {
            r1Var.setAlpha(z10 ? 0.0f : 1.0f);
            r1Var.setVisibility(z10 ? 8 : 0);
        }
        if (!this.h && z10) {
            z12 = false;
        }
        c(z12, z11);
    }

    public final void b(boolean z10, boolean z11) {
        this.h = z10;
        int i3 = R.drawable.msg_voice_unmuted;
        ImageView imageView = this.c;
        if (z11) {
            if (z10) {
                i3 = R.drawable.msg_voice_muted;
            }
            imageView.setImageResource(i3);
        } else {
            if (z10) {
                i3 = R.drawable.msg_voice_muted;
            }
            org.telegram.messenger.g0.R3(imageView, i3);
        }
        c(z10 || !this.e, z11);
    }

    public final void c(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.r = null;
        }
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z10 ? 1.0f : 0.0f);
            this.r = ofFloat;
            ofFloat.addUpdateListener(new q1(this, 1));
            this.r.setInterpolator(xq.h);
            this.r.setDuration(420L);
            this.r.start();
            return;
        }
        float f10 = z10 ? 1.0f : 0.0f;
        this.n = f10;
        View view = this.b;
        view.setAlpha(1.0f - f10);
        view.setScaleX(1.0f - this.n);
        view.setScaleY(1.0f - this.n);
        this.c.setColorFilter(new PorterDuffColorFilter(i0.a.f(this.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
        this.a.invalidate();
    }
}
