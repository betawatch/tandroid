package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.i0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ float[] a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ s e;

    public r(s sVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = sVar;
        this.a = fArr;
        this.b = f7;
        this.c = f10;
        this.d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float[] fArr = this.a;
        float f7 = 1.0f - fArr[0];
        fArr[0] = 1.0f;
        this.e.a.b.l = i0.T1(this.b, this.c, 1.0f);
        lg.h hVar = this.e.a.b;
        hVar.f = (f7 * 360.0f * (this.d ? 1 : -1)) + hVar.f;
        this.e.a.b.b();
        s sVar = this.e;
        sVar.a(sVar.a.b.l);
        this.e.a.j(750L);
    }
}
