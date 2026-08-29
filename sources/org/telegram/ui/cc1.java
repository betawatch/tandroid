package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cc1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 10:
                ((r0.n0) this.b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qc1 qc1Var = ((ec1) this.b).a;
                if (!qc1Var.l1.a()) {
                    qc1Var.N1.setVisibility(8);
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((rd1) this.b).a = null;
                break;
            case 2:
                super.onAnimationEnd(animator);
                ((xe1) this.b).setScrollEnabled(true);
                break;
            case 3:
                bg1 bg1Var = (bg1) this.b;
                if (animator.equals(bg1Var.e.G)) {
                    bg1Var.e.G = null;
                    break;
                }
                break;
            case 4:
                sg1 sg1Var = (sg1) this.b;
                sg1Var.d = null;
                sg1Var.a = null;
                sg1Var.b = false;
                sg1Var.f.c.setAllowDrawCursor(true);
                break;
            case 5:
                org.telegram.ui.Components.if0 if0Var = (org.telegram.ui.Components.if0) this.b;
                ((ji1) if0Var.b).getClass();
                ((ji1) if0Var.b).c.setVisibility(4);
                break;
            case 6:
                ((org.telegram.ui.web.z0) this.b).s.setVisibility(8);
                break;
            case 7:
                ph.v vVar = (ph.v) this.b;
                vVar.setVisibility(8);
                vVar.a = null;
                break;
            case 8:
                ((ph.p2) this.b).y.setVisibility(8);
                break;
            case 9:
                ((ph.n3) this.b).E.setVisibility(8);
                break;
            case 10:
                ((r0.n0) this.b).c();
                break;
            case 11:
                super.onAnimationEnd(animator);
                tf.g gVar = (tf.g) this.b;
                if (!gVar.e1) {
                    gVar.q0 = false;
                    gVar.p0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.b0 = false;
                break;
            case 12:
                ((vf.e) this.b).h.setVisibility(8);
                break;
            default:
                ((CropAreaView) this.b).V = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 10:
                ((r0.n0) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public cc1(r0.n0 n0Var, View view) {
        this.a = 10;
        this.b = n0Var;
    }
}
