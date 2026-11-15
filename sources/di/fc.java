package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.gz;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class fc extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ fc(View view, int i7, float f10, int i10) {
        this.a = i10;
        this.d = view;
        this.b = i7;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                gc gcVar = (gc) this.d;
                gcVar.d0 = this.c;
                if (gcVar.getValue() != this.b) {
                    gcVar.e(gcVar.getValue());
                }
                gcVar.invalidate();
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

    public fc(gc gcVar, float f10, int i7) {
        this.a = 0;
        this.d = gcVar;
        this.c = f10;
        this.b = i7;
    }
}
