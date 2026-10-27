package bi;

import a8.ng;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class x4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x4(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                h7 h7Var = (h7) this.d;
                h7Var.n2();
                f5 f5Var = h7Var.g0;
                int i10 = this.b;
                f5Var.setVisibility(i10 == 0 ? 0 : 8);
                h7Var.s0.setVisibility(i10 == 1 ? 0 : 8);
                h7Var.B0.setVisibility(i10 == 2 ? 0 : 8);
                h7Var.D0.setVisibility(i10 == 3 ? 0 : 8);
                h7Var.W2();
                h7Var.c1 = null;
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
                ei eiVar = tiVar.e0;
                li liVar = tiVar.B0;
                Float valueOf = Float.valueOf(1.0f);
                eiVar.getClass();
                eiVar.a(liVar, valueOf);
                tiVar.a1.setAlpha(0.0f);
                o1.j jVar = new o1.j(tiVar.C0, o1.h.n, 0.0f);
                jVar.u.a(0.75f);
                jVar.u.b(500.0f);
                jVar.b(new org.telegram.ui.Components.n7(this, 3));
                jVar.a(new hi.k4(3, this, (gh) this.c));
                tiVar.w1 = jVar;
                jVar.h();
                break;
            default:
                ng ngVar = (ng) this.d;
                ((nm0) ngVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                ngVar.c = null;
                break;
        }
    }
}
