package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.mz;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ic extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ ic(View view, int i7, float f10, int i10) {
        this.a = i10;
        this.d = view;
        this.b = i7;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                jc jcVar = (jc) this.d;
                jcVar.d0 = this.c;
                if (jcVar.getValue() != this.b) {
                    jcVar.e(jcVar.getValue());
                }
                jcVar.invalidate();
                break;
            case 1:
                mz mzVar = (mz) this.d;
                int i7 = this.b;
                mzVar.b(i7 == 5 ? 0.0f : -this.c, i7 + 1);
                mzVar.E = 0.0f;
                mzVar.invalidate();
                break;
            default:
                ((org.telegram.ui.web.j1) this.d).c(this.b, this.c, false);
                break;
        }
    }

    public ic(jc jcVar, float f10, int i7) {
        this.a = 0;
        this.d = jcVar;
        this.c = f10;
        this.b = i7;
    }
}
