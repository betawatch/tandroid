package androidx.fragment.app;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
            r0.o.a(this.a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9 = this.b;
        ViewGroup viewGroup = this.a;
        if (z9 || !this.d) {
            viewGroup.endViewTransition(null);
            this.c = true;
        } else {
            this.d = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j3, Transformation transformation, float f10) {
        this.d = true;
        if (this.b) {
            return !this.c;
        }
        if (!super.getTransformation(j3, transformation, f10)) {
            this.b = true;
            r0.o.a(this.a, this);
        }
        return true;
    }
}
