package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.q00;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class ie extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ ie(View view, int i10, float f7, int i11) {
        this.a = i11;
        this.d = view;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                je jeVar = (je) this.d;
                jeVar.c0 = this.c;
                if (jeVar.getValue() != this.b) {
                    jeVar.e(jeVar.getValue());
                }
                jeVar.invalidate();
                break;
            case 1:
                q00 q00Var = (q00) this.d;
                int i10 = this.b;
                q00Var.b(i10 == 5 ? 0.0f : -this.c, i10 + 1);
                q00Var.y = 0.0f;
                q00Var.invalidate();
                break;
            default:
                ((org.telegram.ui.web.u1) this.d).c(this.b, this.c, false);
                break;
        }
    }

    public ie(je jeVar, float f7, int i10) {
        this.a = 0;
        this.d = jeVar;
        this.c = f7;
        this.b = i10;
    }
}
