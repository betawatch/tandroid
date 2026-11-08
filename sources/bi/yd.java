package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.dz;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                dz dzVar = (dz) this.d;
                int i7 = this.b;
                dzVar.b(i7 == 5 ? 0.0f : -this.c, i7 + 1);
                dzVar.D = 0.0f;
                dzVar.invalidate();
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
