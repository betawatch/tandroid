package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.yh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m3(Object obj, int i9, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i9;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k5 k5Var = (k5) this.d;
                k5Var.T1();
                r3 r3Var = k5Var.b0;
                int i9 = this.b;
                r3Var.setVisibility(i9 == 0 ? 0 : 8);
                k5Var.n0.setVisibility(i9 == 1 ? 0 : 8);
                k5Var.u0.setVisibility(i9 == 2 ? 0 : 8);
                k5Var.w0.setVisibility(i9 == 3 ? 0 : 8);
                k5Var.s2();
                k5Var.V0 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ki kiVar = (ki) this.d;
                kiVar.u0.setAlpha(0.0f);
                kiVar.u0.setTranslationY(AndroidUtilities.dp(78.0f) + this.b);
                yh yhVar = kiVar.a0;
                ci ciVar = kiVar.u0;
                Float valueOf = Float.valueOf(1.0f);
                yhVar.getClass();
                yhVar.getClass();
                yhVar.b(ciVar, valueOf.floatValue());
                kiVar.T0.setAlpha(0.0f);
                o1.j jVar = new o1.j(kiVar.v0, o1.h.n, 0.0f);
                jVar.u.a(0.75f);
                jVar.u.b(500.0f);
                jVar.b(new org.telegram.ui.Components.e7(this, 3));
                jVar.a(new mh.c4(3, this, (wg) this.c));
                kiVar.p1 = jVar;
                jVar.f();
                break;
            default:
                a6.a aVar = (a6.a) this.d;
                ((wk0) aVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                aVar.b = null;
                break;
        }
    }
}
