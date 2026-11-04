package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.zy;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pc extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ pc(View view, int i3, float f10, int i10) {
        this.a = i10;
        this.d = view;
        this.b = i3;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qc qcVar = (qc) this.d;
                qcVar.d0 = this.c;
                if (qcVar.getValue() != this.b) {
                    qcVar.e(qcVar.getValue());
                }
                qcVar.invalidate();
                break;
            case 1:
                zy zyVar = (zy) this.d;
                int i3 = this.b;
                zyVar.b(i3 == 5 ? 0.0f : -this.c, i3 + 1);
                zyVar.E = 0.0f;
                zyVar.invalidate();
                break;
            default:
                ((org.telegram.ui.web.i1) this.d).c(this.b, this.c, false);
                break;
        }
    }

    public pc(qc qcVar, float f10, int i3) {
        this.a = 0;
        this.d = qcVar;
        this.c = f10;
        this.b = i3;
    }
}
