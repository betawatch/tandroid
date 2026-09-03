package oh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class o1 extends FrameLayout {
    public final FrameLayout a;
    public final View b;
    public final ImageView c;
    public final n1 d;
    public boolean e;
    public ValueAnimator f;
    public boolean h;
    public float n;
    public ValueAnimator r;

    public o1(Context context, rg.b bVar) {
        super(context);
        k7.e6.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        og.i iVar = new og.i();
        iVar.a(bVar);
        iVar.g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, k7.c6.e(40, 40, 17));
        View view = new View(context);
        this.b = view;
        view.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, k7.c6.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        n1 n1Var = new n1(context);
        this.d = n1Var;
        addView(n1Var, k7.c6.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, k7.c6.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z4, boolean z10) {
        if (this.e == z4 && z10) {
            return;
        }
        this.e = z4;
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f = null;
        }
        boolean z11 = true;
        n1 n1Var = this.d;
        if (z10) {
            n1Var.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(n1Var.getAlpha(), z4 ? 0.0f : 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new m1(this, 0));
            this.f.setDuration(320L);
            this.f.setInterpolator(pr.h);
            this.f.start();
        } else {
            n1Var.setAlpha(z4 ? 0.0f : 1.0f);
            n1Var.setVisibility(z4 ? 8 : 0);
        }
        if (!this.h && z4) {
            z11 = false;
        }
        c(z11, z10);
    }

    public final void b(boolean z4, boolean z10) {
        this.h = z4;
        ImageView imageView = this.c;
        if (z10) {
            imageView.setImageResource(z4 ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
        } else {
            AndroidUtilities.updateImageViewImageAnimated(imageView, z4 ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
        }
        c(z4 || !this.e, z10);
    }

    public final void c(boolean z4, boolean z10) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.r = null;
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z4 ? 1.0f : 0.0f);
            this.r = ofFloat;
            ofFloat.addUpdateListener(new m1(this, 1));
            this.r.setInterpolator(pr.h);
            this.r.setDuration(420L);
            this.r.start();
            return;
        }
        float f10 = z4 ? 1.0f : 0.0f;
        this.n = f10;
        View view = this.b;
        view.setAlpha(1.0f - f10);
        view.setScaleX(1.0f - this.n);
        view.setScaleY(1.0f - this.n);
        this.c.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
        this.a.invalidate();
    }
}
