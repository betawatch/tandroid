// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class kh7 extends FrameLayout {
    public final FrameLayout a;
    public final View b;
    public final ImageView c;
    public final fo0 d;
    public boolean e;
    public ValueAnimator f;
    public boolean h;
    public float n;
    public ValueAnimator r;

    public kh7(Context context, bl0 bl0Var) {
        super(context);
        ote.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        u9b u9bVar = new u9b();
        u9bVar.a = bl0Var;
        u9bVar.a();
        u9bVar.g.setColor(-14670806);
        u9bVar.invalidateSelf();
        u9bVar.f = gl.L(1.0f);
        frameLayout.setBackground(u9bVar);
        addView(frameLayout, nme.e(40, 40, 17));
        View view = new View(context);
        this.b = view;
        view.setBackground(bkb.K(gl.L(40.0f), -13522392));
        frameLayout.addView(view, nme.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        fo0 fo0Var = new fo0(context);
        this.d = fo0Var;
        addView(fo0Var, nme.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, nme.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z, boolean z2) {
        if (this.e == z && z2) {
            return;
        }
        this.e = z;
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f = null;
        }
        boolean z3 = true;
        fo0 fo0Var = this.d;
        if (z2) {
            fo0Var.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fo0Var.getAlpha(), z ? 0.0f : 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new jh7(this, (byte) 0));
            this.f.setDuration(320L);
            this.f.setInterpolator(s33.h);
            this.f.start();
        } else {
            fo0Var.setAlpha(z ? 0.0f : 1.0f);
            fo0Var.setVisibility(z ? 8 : 0);
        }
        if (!this.h && z) {
            z3 = false;
        }
        c(z3, z2);
    }

    public final void b(boolean z, boolean z2) {
        this.h = z;
        int i = R.drawable.msg_voice_unmuted;
        ImageView imageView = this.c;
        if (z2) {
            if (z) {
                i = R.drawable.msg_voice_muted;
            }
            imageView.setImageResource(i);
        } else {
            if (z) {
                i = R.drawable.msg_voice_muted;
            }
            gl.L3(imageView, i);
        }
        c(z || !this.e, z2);
    }

    public final void c(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.r = null;
        }
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z ? 1.0f : 0.0f);
            this.r = ofFloat;
            ofFloat.addUpdateListener(new jh7(this, (byte) 1));
            this.r.setInterpolator(s33.h);
            this.r.setDuration(420L);
            this.r.start();
            return;
        }
        float f = z ? 1.0f : 0.0f;
        this.n = f;
        View view = this.b;
        view.setAlpha(1.0f - f);
        view.setScaleX(1.0f - this.n);
        view.setScaleY(1.0f - this.n);
        this.c.setColorFilter(new PorterDuffColorFilter(bm2.f(this.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
        this.a.invalidate();
    }
}
