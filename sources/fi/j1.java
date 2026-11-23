package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import c8.sa;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class j1 extends FrameLayout {
    public final FrameLayout a;
    public final View b;
    public final ImageView c;
    public final i1 d;
    public boolean e;
    public ValueAnimator f;
    public boolean h;
    public float n;
    public ValueAnimator r;

    public j1(Context context, gh.b bVar) {
        super(context);
        sa.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        dh.j jVar = new dh.j();
        jVar.a = bVar;
        jVar.a();
        jVar.g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f = org.telegram.messenger.g0.L(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, na.e(40, 40, 17));
        View view = new View(context);
        this.b = view;
        view.setBackground(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(40.0f), -13522392));
        frameLayout.addView(view, na.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        i1 i1Var = new i1(context);
        this.d = i1Var;
        addView(i1Var, na.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, na.e(40, 40, 17));
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
        i1 i1Var = this.d;
        if (z11) {
            i1Var.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i1Var.getAlpha(), z10 ? 0.0f : 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new h1(this, 0));
            this.f.setDuration(320L);
            this.f.setInterpolator(kr.h);
            this.f.start();
        } else {
            i1Var.setAlpha(z10 ? 0.0f : 1.0f);
            i1Var.setVisibility(z10 ? 8 : 0);
        }
        if (!this.h && z10) {
            z12 = false;
        }
        c(z12, z11);
    }

    public final void b(boolean z10, boolean z11) {
        this.h = z10;
        int i7 = R.drawable.msg_voice_unmuted;
        ImageView imageView = this.c;
        if (z11) {
            if (z10) {
                i7 = R.drawable.msg_voice_muted;
            }
            imageView.setImageResource(i7);
        } else {
            if (z10) {
                i7 = R.drawable.msg_voice_muted;
            }
            org.telegram.messenger.g0.P3(imageView, i7);
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
            ofFloat.addUpdateListener(new h1(this, 1));
            this.r.setInterpolator(kr.h);
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
