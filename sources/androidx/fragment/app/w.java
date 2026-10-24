package androidx.fragment.app;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class w extends AnimationSet implements Runnable {
    public final ViewGroup a;
    public boolean b;
    public boolean c;
    public boolean d;

    public w(Animation animation, ViewGroup viewGroup) {
        super(false);
        this.d = true;
        this.a = viewGroup;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation) {
        this.d = true;
        if (this.b) {
            return !this.c;
        }
        if (!super.getTransformation(j10, transformation)) {
            this.b = true;
            r0.p.a(this.a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.b;
        ViewGroup viewGroup = this.a;
        if (z10 || !this.d) {
            viewGroup.endViewTransition(null);
            this.c = true;
        } else {
            this.d = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation, float f7) {
        this.d = true;
        if (this.b) {
            return !this.c;
        }
        if (!super.getTransformation(j10, transformation, f7)) {
            this.b = true;
            r0.p.a(this.a, this);
        }
        return true;
    }
}
