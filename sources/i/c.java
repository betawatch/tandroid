package i;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import j7.x7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c extends x7 {
    public final ObjectAnimator a;
    public final boolean b;

    public c(AnimationDrawable animationDrawable, boolean z4, boolean z10) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i10 = z4 ? numberOfFrames - 1 : 0;
        int i11 = z4 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.b = numberOfFrames2;
        int[] iArr = dVar.a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.a;
        int i12 = 0;
        for (int i13 = 0; i13 < numberOfFrames2; i13++) {
            int duration = animationDrawable.getDuration(z4 ? (numberOfFrames2 - i13) - 1 : i13);
            iArr2[i13] = duration;
            i12 += duration;
        }
        dVar.c = i12;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
        j.a.a(ofInt, true);
        ofInt.setDuration(dVar.c);
        ofInt.setInterpolator(dVar);
        this.b = z10;
        this.a = ofInt;
    }

    @Override // j7.x7
    public final boolean a() {
        return this.b;
    }

    @Override // j7.x7
    public final void b() {
        this.a.reverse();
    }

    @Override // j7.x7
    public final void c() {
        this.a.start();
    }

    @Override // j7.x7
    public final void d() {
        this.a.cancel();
    }
}
