package i;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import j7.y7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c extends y7 {
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

    @Override // j7.y7
    public final boolean a() {
        return this.b;
    }

    @Override // j7.y7
    public final void b() {
        this.a.reverse();
    }

    @Override // j7.y7
    public final void c() {
        this.a.start();
    }

    @Override // j7.y7
    public final void d() {
        this.a.cancel();
    }
}
