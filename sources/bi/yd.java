package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.cz;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yd extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ yd(View view, int i7, float f10, int i10) {
        this.a = i10;
        this.d = view;
        this.b = i7;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                zd zdVar = (zd) this.d;
                zdVar.c0 = this.c;
                if (zdVar.getValue() != this.b) {
                    zdVar.e(zdVar.getValue());
                }
                zdVar.invalidate();
                break;
            case 1:
                cz czVar = (cz) this.d;
                int i7 = this.b;
                czVar.b(i7 == 5 ? 0.0f : -this.c, i7 + 1);
                czVar.D = 0.0f;
                czVar.invalidate();
                break;
            default:
                ((org.telegram.ui.web.k1) this.d).c(this.b, this.c, false);
                break;
        }
    }

    public yd(zd zdVar, float f10, int i7) {
        this.a = 0;
        this.d = zdVar;
        this.c = f10;
        this.b = i7;
    }
}
