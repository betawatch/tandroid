package ig;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ float[] a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ s e;

    public r(s sVar, float[] fArr, float f10, float f11, boolean z4) {
        this.e = sVar;
        this.a = fArr;
        this.b = f10;
        this.c = f11;
        this.d = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float[] fArr = this.a;
        float f10 = 1.0f - fArr[0];
        fArr[0] = 1.0f;
        s sVar = this.e;
        eg.i iVar = sVar.a;
        iVar.b.i = AndroidUtilities.lerp(this.b, this.c, 1.0f);
        fg.a aVar = iVar.b;
        aVar.f = (f10 * 360.0f * (this.d ? 1 : -1)) + aVar.f;
        aVar.b();
        sVar.a(iVar.b.i);
        iVar.h(750L);
    }
}
