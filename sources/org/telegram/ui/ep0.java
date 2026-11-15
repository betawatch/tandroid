package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ep0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ ep0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.ki kiVar;
        int i7 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i7) {
            case 0:
                photoViewer.p6 = null;
                org.telegram.ui.Components.gd0 gd0Var = photoViewer.D1;
                if (gd0Var != null) {
                    if (gd0Var.b.j()) {
                        org.telegram.ui.ActionBar.q6.s(photoViewer.b1, org.telegram.ui.ActionBar.j6.qg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
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
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.e3();
                break;
            case 3:
                photoViewer.M1.m0(false);
                tp0 tp0Var = photoViewer.M1;
                tp0Var.e1.setTypeface(sg.k0.e(tp0Var.z1).j);
                tp0Var.J0.setVisibility(0);
                tp0Var.G0.setVisibility(0);
                tp0Var.H0.setVisibility(0);
                org.telegram.ui.Components.tb0 tb0Var = photoViewer.y4;
                int childCount = tb0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    tb0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.p6 = null;
                photoViewer.u4 = 3;
                photoViewer.b1().M.b(photoViewer.u4 != 0);
                hi.p3 p3Var = photoViewer.L1;
                if (p3Var != null) {
                    p3Var.b(photoViewer.u4 != 3);
                }
                photoViewer.o6 = -1;
                float p22 = photoViewer.p2(false);
                photoViewer.a6 = p22;
                photoViewer.e6 = p22;
                photoViewer.c6 = 0.0f;
                photoViewer.d6 = 0.0f;
                photoViewer.u3(p22);
                photoViewer.u2 = true;
                photoViewer.f0.invalidate();
                sq0 sq0Var = photoViewer.d;
                if (sq0Var == null || !sq0Var.P()) {
                    photoViewer.Q1();
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
                org.telegram.messenger.g0.h3(new ef0(this, 24));
                break;
            case 6:
                photoViewer.m6 = 1.0f;
                Runnable runnable = photoViewer.p4;
                if (runnable != null) {
                    an anVar = photoViewer.l4;
                    if (anVar == null && (kiVar = photoViewer.b2) != null) {
                        org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
                        if (e2Var instanceof an) {
                            anVar = (an) e2Var;
                        }
                    }
                    if (anVar != null) {
                        anVar.y8(runnable);
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
