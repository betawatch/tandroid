package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.gz;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ec extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ ec(View view, int i7, float f10, int i10) {
        this.a = i10;
        this.d = view;
        this.b = i7;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                fc fcVar = (fc) this.d;
                fcVar.d0 = this.c;
                if (fcVar.getValue() != this.b) {
                    fcVar.e(fcVar.getValue());
                }
                fcVar.invalidate();
                break;
            case 1:
                gz gzVar = (gz) this.d;
                int i7 = this.b;
                gzVar.b(i7 == 5 ? 0.0f : -this.c, i7 + 1);
                gzVar.E = 0.0f;
                gzVar.invalidate();
                break;
            default:
                ((org.telegram.ui.web.j1) this.d).c(this.b, this.c, false);
                break;
        }
    }

    public ec(fc fcVar, float f10, int i7) {
        this.a = 0;
        this.d = fcVar;
        this.c = f10;
        this.b = i7;
    }
}
