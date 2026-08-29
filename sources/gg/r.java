package gg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ float[] a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ s e;

    public r(s sVar, float[] fArr, float f9, float f10, boolean z10) {
        this.e = sVar;
        this.a = fArr;
        this.b = f9;
        this.c = f10;
        this.d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float[] fArr = this.a;
        float f9 = 1.0f - fArr[0];
        fArr[0] = 1.0f;
        s sVar = this.e;
        cg.i iVar = sVar.a;
        iVar.b.i = AndroidUtilities.lerp(this.b, this.c, 1.0f);
        dg.a aVar = iVar.b;
        aVar.f = (f9 * 360.0f * (this.d ? 1 : -1)) + aVar.f;
        aVar.b();
        sVar.a(iVar.b.i);
        iVar.h(750L);
    }
}
