package i;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import c8.h0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c extends h0 {
    public final ObjectAnimator a;
    public final boolean b;

    public c(AnimationDrawable animationDrawable, boolean z9, boolean z10) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i7 = z9 ? numberOfFrames - 1 : 0;
        int i10 = z9 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.b = numberOfFrames2;
        int[] iArr = dVar.a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.a;
        int i11 = 0;
        for (int i12 = 0; i12 < numberOfFrames2; i12++) {
            int duration = animationDrawable.getDuration(z9 ? (numberOfFrames2 - i12) - 1 : i12);
            iArr2[i12] = duration;
            i11 += duration;
        }
        dVar.c = i11;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i7, i10);
        j.a.a(ofInt, true);
        ofInt.setDuration(dVar.c);
        ofInt.setInterpolator(dVar);
        this.b = z10;
        this.a = ofInt;
    }

    @Override // c8.h0
    public final boolean a() {
        return this.b;
    }

    @Override // c8.h0
    public final void b() {
        this.a.reverse();
    }

    @Override // c8.h0
    public final void c() {
        this.a.start();
    }

    @Override // c8.h0
    public final void d() {
        this.a.cancel();
    }
}
