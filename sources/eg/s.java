package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s extends AnimatorListenerAdapter {
    public final /* synthetic */ float[] a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ t e;

    public s(t tVar, float[] fArr, float f10, float f11, boolean z10) {
        this.e = tVar;
        this.a = fArr;
        this.b = f10;
        this.c = f11;
        this.d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float[] fArr = this.a;
        float f10 = 1.0f - fArr[0];
        fArr[0] = 1.0f;
        t tVar = this.e;
        ag.k kVar = tVar.a;
        kVar.b.i = AndroidUtilities.lerp(this.b, this.c, 1.0f);
        bg.a aVar = kVar.b;
        aVar.f = (f10 * 360.0f * (this.d ? 1 : -1)) + aVar.f;
        aVar.b();
        tVar.a(kVar.b.i);
        kVar.h(750L);
    }
}
