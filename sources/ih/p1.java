package ih;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p1 extends FrameLayout {
    public final FrameLayout a;
    public final View b;
    public final ImageView c;
    public final o1 d;
    public boolean e;
    public ValueAnimator f;
    public boolean h;
    public float n;
    public ValueAnimator r;

    public p1(Context context, lg.b bVar) {
        super(context);
        g7.g6.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        ig.i iVar = new ig.i();
        iVar.a(bVar);
        iVar.g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, g7.e6.e(40, 40, 17));
        View view = new View(context);
        this.b = view;
        view.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, g7.e6.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        o1 o1Var = new o1(context);
        this.d = o1Var;
        addView(o1Var, g7.e6.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, g7.e6.e(40, 40, 17));
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
        o1 o1Var = this.d;
        if (z11) {
            o1Var.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(o1Var.getAlpha(), z10 ? 0.0f : 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new n1(this, 0));
            this.f.setDuration(320L);
            this.f.setInterpolator(gr.h);
            this.f.start();
        } else {
            o1Var.setAlpha(z10 ? 0.0f : 1.0f);
            o1Var.setVisibility(z10 ? 8 : 0);
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
            ofFloat.addUpdateListener(new n1(this, 1));
            this.r.setInterpolator(gr.h);
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
        this.c.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
        this.a.invalidate();
    }
}
