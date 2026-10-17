package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.q00;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class ge extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ ge(View view, int i10, float f7, int i11) {
        this.a = i11;
        this.d = view;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                he heVar = (he) this.d;
                heVar.c0 = this.c;
                if (heVar.getValue() != this.b) {
                    heVar.e(heVar.getValue());
                }
                heVar.invalidate();
                break;
            case 1:
                q00 q00Var = (q00) this.d;
                int i10 = this.b;
                q00Var.b(i10 == 5 ? 0.0f : -this.c, i10 + 1);
                q00Var.y = 0.0f;
                q00Var.invalidate();
                break;
            default:
                ((org.telegram.ui.web.t1) this.d).c(this.b, this.c, false);
                break;
        }
    }

    public ge(he heVar, float f7, int i10) {
        this.a = 0;
        this.d = heVar;
        this.c = f7;
        this.b = i10;
    }
}
