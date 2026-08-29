package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
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

    public n1(Context context, og.b bVar) {
        super(context);
        i7.h6.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        lg.i iVar = new lg.i();
        iVar.a(bVar);
        iVar.g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, i7.f6.e(40, 40, 17));
        View view = new View(context);
        this.b = view;
        view.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, i7.f6.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        m1 m1Var = new m1(context);
        this.d = m1Var;
        addView(m1Var, i7.f6.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, i7.f6.e(40, 40, 17));
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
        m1 m1Var = this.d;
        if (z11) {
            m1Var.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(m1Var.getAlpha(), z10 ? 0.0f : 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new l1(this, 0));
            this.f.setDuration(320L);
            this.f.setInterpolator(jr.h);
            this.f.start();
        } else {
            m1Var.setAlpha(z10 ? 0.0f : 1.0f);
            m1Var.setVisibility(z10 ? 8 : 0);
        }
        if (!this.h && z10) {
            z12 = false;
        }
        c(z12, z11);
    }

    public final void b(boolean z10, boolean z11) {
        this.h = z10;
        ImageView imageView = this.c;
        if (z11) {
            imageView.setImageResource(z10 ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
        } else {
            AndroidUtilities.updateImageViewImageAnimated(imageView, z10 ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
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
            ofFloat.addUpdateListener(new l1(this, 1));
            this.r.setInterpolator(jr.h);
            this.r.setDuration(420L);
            this.r.start();
            return;
        }
        float f9 = z10 ? 1.0f : 0.0f;
        this.n = f9;
        View view = this.b;
        view.setAlpha(1.0f - f9);
        view.setScaleX(1.0f - this.n);
        view.setScaleY(1.0f - this.n);
        this.c.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
        this.a.invalidate();
    }
}
