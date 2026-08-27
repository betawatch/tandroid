package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l3(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i5 i5Var = (i5) this.d;
                i5Var.T1();
                q3 q3Var = i5Var.b0;
                int i10 = this.b;
                q3Var.setVisibility(i10 == 0 ? 0 : 8);
                i5Var.n0.setVisibility(i10 == 1 ? 0 : 8);
                i5Var.u0.setVisibility(i10 == 2 ? 0 : 8);
                i5Var.w0.setVisibility(i10 == 3 ? 0 : 8);
                i5Var.s2();
                i5Var.V0 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                gi giVar = (gi) this.d;
                giVar.u0.setAlpha(0.0f);
                giVar.u0.setTranslationY(AndroidUtilities.dp(78.0f) + this.b);
                uh uhVar = giVar.a0;
                yh yhVar = giVar.u0;
                Float valueOf = Float.valueOf(1.0f);
                uhVar.getClass();
                uhVar.a(yhVar, valueOf);
                giVar.T0.setAlpha(0.0f);
                o1.j jVar = new o1.j(giVar.v0, o1.h.n, 0.0f);
                jVar.u.a(0.75f);
                jVar.u.b(500.0f);
                jVar.b(new org.telegram.ui.Components.e7(this, 3));
                jVar.a(new nh.a4(3, this, (sg) this.c));
                giVar.p1 = jVar;
                jVar.f();
                break;
            default:
                b6.a aVar = (b6.a) this.d;
                ((zk0) aVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                aVar.b = null;
                break;
        }
    }
}
