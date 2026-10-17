package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class b5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b5(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.d;
                k7Var.g2();
                j5 j5Var = k7Var.g0;
                int i10 = this.b;
                j5Var.setVisibility(i10 == 0 ? 0 : 8);
                k7Var.s0.setVisibility(i10 == 1 ? 0 : 8);
                k7Var.B0.setVisibility(i10 == 2 ? 0 : 8);
                k7Var.D0.setVisibility(i10 == 3 ? 0 : 8);
                k7Var.O2();
                k7Var.c1 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ti tiVar = (ti) this.d;
                tiVar.B0.setAlpha(0.0f);
                tiVar.B0.setTranslationY(AndroidUtilities.dp(78.0f) + this.b);
                hi hiVar = tiVar.e0;
                li liVar = tiVar.B0;
                Float valueOf = Float.valueOf(1.0f);
                hiVar.getClass();
                hiVar.a(liVar, valueOf);
                tiVar.a1.setAlpha(0.0f);
                o1.k kVar = new o1.k(tiVar.C0, o1.h.n, 0.0f);
                kVar.u.a(0.75f);
                kVar.u.b(500.0f);
                kVar.b(new org.telegram.ui.Components.l7(this, 3));
                kVar.a(new gi.b4(3, this, (gh) this.c));
                tiVar.w1 = kVar;
                kVar.h();
                break;
            default:
                a5.a aVar = (a5.a) this.d;
                ((im0) aVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                aVar.c = null;
                break;
        }
    }
}
