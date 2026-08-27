package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class ra extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ ra(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                sb sbVar = this.b;
                sbVar.f2 = null;
                sbVar.r.setTranslationY(0.0f);
                sbVar.r.b(0.0f);
                break;
            case 1:
                sb sbVar2 = this.b;
                sbVar2.n.removeView(sbVar2.I0);
                sbVar2.I0 = null;
                sbVar2.j2 = null;
                sbVar2.l2 = null;
                sbVar2.Y0.H.b(sbVar2.b0 != 1);
                break;
            default:
                sb sbVar3 = this.b;
                bb bbVar = sbVar3.y2;
                if (bbVar != null) {
                    if (bbVar.getParent() != null) {
                        ((ViewGroup) sbVar3.y2.getParent()).removeView(sbVar3.y2);
                    }
                    sbVar3.y2 = null;
                }
                sbVar3.A2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
