package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.si;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class a4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a4(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.d;
                f6Var.X1();
                j4 j4Var = f6Var.c2;
                int i7 = this.b;
                j4Var.setVisibility(i7 == 0 ? 0 : 8);
                f6Var.o2.setVisibility(i7 == 1 ? 0 : 8);
                f6Var.x2.setVisibility(i7 == 2 ? 0 : 8);
                f6Var.z2.setVisibility(i7 == 3 ? 0 : 8);
                f6Var.J2();
                f6Var.Y2 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                si siVar = (si) this.d;
                siVar.w2.setAlpha(0.0f);
                siVar.w2.setTranslationY(org.telegram.messenger.g0.L(78.0f) + this.b);
                di diVar = siVar.Z1;
                ki kiVar = siVar.w2;
                Float valueOf = Float.valueOf(1.0f);
                diVar.getClass();
                diVar.a(kiVar, valueOf);
                siVar.V2.setAlpha(0.0f);
                r1.g gVar = new r1.g((Object) siVar.x2, (r1.e) r1.g.p, 0.0f);
                gVar.m.a(0.75f);
                gVar.m.b(500.0f);
                gVar.b(new org.telegram.ui.Components.i7(this, 3));
                gVar.a(new bi.v0(4, this, (eh) this.c));
                siVar.r3 = gVar;
                gVar.h();
                break;
            default:
                a8.xa xaVar = (a8.xa) this.d;
                ((ck0) xaVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                xaVar.c = null;
                break;
        }
    }
}
