package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t extends AnimatorListenerAdapter {
    public final /* synthetic */ float[] a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ u e;

    public t(u uVar, float[] fArr, float f10, float f11, boolean z10) {
        this.e = uVar;
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
        u uVar = this.e;
        q qVar = uVar.a;
        qVar.b.i = AndroidUtilities.lerp(this.b, this.c, 1.0f);
        ag.a aVar = qVar.b;
        aVar.f = (f10 * 360.0f * (this.d ? 1 : -1)) + aVar.f;
        aVar.b();
        uVar.a(qVar.b.i);
        qVar.h(750L);
    }
}
