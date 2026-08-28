package i;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import f7.h8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends h8 {
    public final ObjectAnimator a;
    public final boolean b;

    public c(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i9 = z10 ? numberOfFrames - 1 : 0;
        int i10 = z10 ? 0 : numberOfFrames - 1;
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
            int duration = animationDrawable.getDuration(z10 ? (numberOfFrames2 - i12) - 1 : i12);
            iArr2[i12] = duration;
            i11 += duration;
        }
        dVar.c = i11;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i9, i10);
        j.a.a(ofInt, true);
        ofInt.setDuration(dVar.c);
        ofInt.setInterpolator(dVar);
        this.b = z11;
        this.a = ofInt;
    }

    @Override // f7.h8
    public final boolean a() {
        return this.b;
    }

    @Override // f7.h8
    public final void b() {
        this.a.reverse();
    }

    @Override // f7.h8
    public final void c() {
        this.a.start();
    }

    @Override // f7.h8
    public final void d() {
        this.a.cancel();
    }
}
