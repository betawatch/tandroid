package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class ua extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;

    public /* synthetic */ ua(wb wbVar, int i9) {
        this.a = i9;
        this.b = wbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                wb wbVar = this.b;
                wbVar.f2 = null;
                wbVar.r.setTranslationY(0.0f);
                wbVar.r.b(0.0f);
                break;
            case 1:
                wb wbVar2 = this.b;
                wbVar2.n.removeView(wbVar2.I0);
                wbVar2.I0 = null;
                wbVar2.j2 = null;
                wbVar2.l2 = null;
                wbVar2.Y0.H.b(wbVar2.b0 != 1);
                break;
            default:
                wb wbVar3 = this.b;
                eb ebVar = wbVar3.y2;
                if (ebVar != null) {
                    if (ebVar.getParent() != null) {
                        ((ViewGroup) wbVar3.y2.getParent()).removeView(wbVar3.y2);
                    }
                    wbVar3.y2 = null;
                }
                wbVar3.A2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
