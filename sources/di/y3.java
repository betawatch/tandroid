package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.vh;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y3(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.d;
                c6Var.P1();
                g4 g4Var = c6Var.c2;
                int i7 = this.b;
                g4Var.setVisibility(i7 == 0 ? 0 : 8);
                c6Var.o2.setVisibility(i7 == 1 ? 0 : 8);
                c6Var.x2.setVisibility(i7 == 2 ? 0 : 8);
                c6Var.z2.setVisibility(i7 == 3 ? 0 : 8);
                c6Var.v2();
                c6Var.Y2 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ki kiVar = (ki) this.d;
                kiVar.w2.setAlpha(0.0f);
                kiVar.w2.setTranslationY(org.telegram.messenger.g0.L(78.0f) + this.b);
                vh vhVar = kiVar.Z1;
                ci ciVar = kiVar.w2;
                Float valueOf = Float.valueOf(1.0f);
                vhVar.getClass();
                vhVar.a(ciVar, valueOf);
                kiVar.V2.setAlpha(0.0f);
                r1.g gVar = new r1.g((Object) kiVar.x2, (r1.e) r1.g.p, 0.0f);
                gVar.m.a(0.75f);
                gVar.m.b(500.0f);
                gVar.b(new org.telegram.ui.Components.c7(this, 3));
                gVar.a(new bi.v0(4, this, (vg) this.c));
                kiVar.r3 = gVar;
                gVar.h();
                break;
            default:
                a8.xa xaVar = (a8.xa) this.d;
                ((uj0) xaVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                xaVar.c = null;
                break;
        }
    }
}
