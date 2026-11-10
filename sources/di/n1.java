package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import c8.ka;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n1 extends FrameLayout {
    public final FrameLayout a;
    public final View b;
    public final ImageView c;
    public final m1 d;
    public boolean e;
    public ValueAnimator f;
    public boolean h;
    public float n;
    public ValueAnimator r;

    public n1(Context context, gh.b bVar) {
        super(context);
        ka.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        dh.j jVar = new dh.j();
        jVar.a = bVar;
        jVar.a();
        jVar.g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f = org.telegram.messenger.g0.L(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, ha.e(40, 40, 17));
        View view = new View(context);
        this.b = view;
        view.setBackground(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(40.0f), -13522392));
        frameLayout.addView(view, ha.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        m1 m1Var = new m1(context);
        this.d = m1Var;
        addView(m1Var, ha.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, ha.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z9, boolean z10) {
        if (this.e == z9 && z10) {
            return;
        }
        this.e = z9;
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f = null;
        }
        boolean z11 = true;
        m1 m1Var = this.d;
        if (z10) {
            m1Var.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(m1Var.getAlpha(), z9 ? 0.0f : 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new l1(this, 0));
            this.f.setDuration(320L);
            this.f.setInterpolator(wq.h);
            this.f.start();
        } else {
            m1Var.setAlpha(z9 ? 0.0f : 1.0f);
            m1Var.setVisibility(z9 ? 8 : 0);
        }
        if (!this.h && z9) {
            z11 = false;
        }
        c(z11, z10);
    }

    public final void b(boolean z9, boolean z10) {
        this.h = z9;
        int i7 = R.drawable.msg_voice_unmuted;
        ImageView imageView = this.c;
        if (z10) {
            if (z9) {
                i7 = R.drawable.msg_voice_muted;
            }
            imageView.setImageResource(i7);
        } else {
            if (z9) {
                i7 = R.drawable.msg_voice_muted;
            }
            org.telegram.messenger.g0.R3(imageView, i7);
        }
        c(z9 || !this.e, z10);
    }

    public final void c(boolean z9, boolean z10) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.r = null;
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z9 ? 1.0f : 0.0f);
            this.r = ofFloat;
            ofFloat.addUpdateListener(new l1(this, 1));
            this.r.setInterpolator(wq.h);
            this.r.setDuration(420L);
            this.r.start();
            return;
        }
        float f10 = z9 ? 1.0f : 0.0f;
        this.n = f10;
        View view = this.b;
        view.setAlpha(1.0f - f10);
        view.setScaleX(1.0f - this.n);
        view.setScaleY(1.0f - this.n);
        this.c.setColorFilter(new PorterDuffColorFilter(i0.a.f(this.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
        this.a.invalidate();
    }
}
