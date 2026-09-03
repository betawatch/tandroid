package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.j00;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class ab extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ ab(View view, int i10, float f10, int i11) {
        this.a = i11;
        this.d = view;
        this.b = i10;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                bb bbVar = (bb) this.d;
                bbVar.W = this.c;
                if (bbVar.getValue() != this.b) {
                    bbVar.e(bbVar.getValue());
                }
                bbVar.invalidate();
                break;
            case 1:
                j00 j00Var = (j00) this.d;
                int i10 = this.b;
                j00Var.b(i10 == 5 ? 0.0f : -this.c, i10 + 1);
                j00Var.y = 0.0f;
                j00Var.invalidate();
                break;
            default:
                ((org.telegram.ui.web.t1) this.d).c(this.b, this.c, false);
                break;
        }
    }

    public ab(bb bbVar, float f10, int i10) {
        this.a = 0;
        this.d = bbVar;
        this.c = f10;
        this.b = i10;
    }
}
