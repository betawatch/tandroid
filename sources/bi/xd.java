package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.q00;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class xd extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ xd(View view, int i10, float f7, int i11) {
        this.a = i11;
        this.d = view;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                yd ydVar = (yd) this.d;
                ydVar.c0 = this.c;
                if (ydVar.getValue() != this.b) {
                    ydVar.e(ydVar.getValue());
                }
                ydVar.invalidate();
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

    public xd(yd ydVar, float f7, int i10) {
        this.a = 0;
        this.d = ydVar;
        this.c = f7;
        this.b = i10;
    }
}
