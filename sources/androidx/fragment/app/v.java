package androidx.fragment.app;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class v extends AnimationSet implements Runnable {
    public final ViewGroup a;
    public boolean b;
    public boolean c;
    public boolean d;

    public v(Animation animation, ViewGroup viewGroup) {
        super(false);
        this.d = true;
        this.a = viewGroup;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j3, Transformation transformation) {
        this.d = true;
        if (this.b) {
            return !this.c;
        }
        if (!super.getTransformation(j3, transformation)) {
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
    public final boolean getTransformation(long j3, Transformation transformation, float f7) {
        this.d = true;
        if (this.b) {
            return !this.c;
        }
        if (!super.getTransformation(j3, transformation, f7)) {
            this.b = true;
            r0.p.a(this.a, this);
        }
        return true;
    }
}
