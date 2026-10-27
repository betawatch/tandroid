package i;

import a8.qc;
import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c extends qc {
    public final ObjectAnimator a;
    public final boolean b;

    public c(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i10 = z10 ? numberOfFrames - 1 : 0;
        int i11 = z10 ? 0 : numberOfFrames - 1;
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
            int duration = animationDrawable.getDuration(z10 ? (numberOfFrames2 - i13) - 1 : i13);
            iArr2[i13] = duration;
            i12 += duration;
        }
        dVar.c = i12;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
        j.a.a(ofInt, true);
        ofInt.setDuration(dVar.c);
        ofInt.setInterpolator(dVar);
        this.b = z11;
        this.a = ofInt;
    }

    @Override // a8.qc
    public final boolean a() {
        return this.b;
    }

    @Override // a8.qc
    public final void b() {
        this.a.reverse();
    }

    @Override // a8.qc
    public final void c() {
        this.a.start();
    }

    @Override // a8.qc
    public final void d() {
        this.a.cancel();
    }
}
