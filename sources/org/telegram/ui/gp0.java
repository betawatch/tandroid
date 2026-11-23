package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ gp0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.ti tiVar;
        int i7 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i7) {
            case 0:
                photoViewer.p6 = null;
                org.telegram.ui.Components.qd0 qd0Var = photoViewer.D1;
                if (qd0Var != null) {
                    if (qd0Var.b.j()) {
                        org.telegram.ui.ActionBar.u6.s(photoViewer.b1, org.telegram.ui.ActionBar.n6.qg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.b1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.g6 = 0.0f;
                    photoViewer.f0.invalidate();
                    break;
                }
                break;
            case 1:
                photoViewer.t3 = null;
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.f9;
                photoViewer.f3();
                break;
            case 3:
                photoViewer.M1.p0(false);
                vp0 vp0Var = photoViewer.M1;
                vp0Var.e1.setTypeface(sg.j0.e(vp0Var.z1).j);
                vp0Var.J0.setVisibility(0);
                vp0Var.G0.setVisibility(0);
                vp0Var.H0.setVisibility(0);
                org.telegram.ui.Components.cc0 cc0Var = photoViewer.y4;
                cc0Var.f = true;
                int childCount = cc0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    cc0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.p6 = null;
                photoViewer.u4 = 3;
                photoViewer.b1().M.b(photoViewer.u4 != 0);
                hi.x3 x3Var = photoViewer.L1;
                if (x3Var != null) {
                    x3Var.b(photoViewer.u4 != 3);
                }
                photoViewer.o6 = -1;
                float q22 = photoViewer.q2(false);
                photoViewer.a6 = q22;
                photoViewer.e6 = q22;
                photoViewer.c6 = 0.0f;
                photoViewer.d6 = 0.0f;
                photoViewer.v3(q22);
                photoViewer.u2 = true;
                photoViewer.f0.invalidate();
                uq0 uq0Var = photoViewer.d;
                if (uq0Var == null || !uq0Var.P()) {
                    photoViewer.R1();
                    break;
                }
                break;
            case 4:
                AnimatorSet animatorSet = photoViewer.C1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.p1.setVisibility(8);
                    photoViewer.C1 = null;
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.g3(new gf0(this, 24));
                break;
            case 6:
                photoViewer.m6 = 1.0f;
                Runnable runnable = photoViewer.p4;
                if (runnable != null) {
                    bn bnVar = photoViewer.l4;
                    if (bnVar == null && (tiVar = photoViewer.b2) != null) {
                        org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
                        if (g2Var instanceof bn) {
                            bnVar = (bn) g2Var;
                        }
                    }
                    if (bnVar != null) {
                        bnVar.y8(runnable);
                        break;
                    } else {
                        runnable.run();
                        photoViewer.p4 = null;
                        break;
                    }
                }
                break;
            case 7:
                photoViewer.p6 = null;
                photoViewer.f0.invalidate();
                break;
            case 8:
                photoViewer.y3[0].setTag(null);
                break;
            default:
                photoViewer.y3[0].setTag(null);
                break;
        }
    }
}
