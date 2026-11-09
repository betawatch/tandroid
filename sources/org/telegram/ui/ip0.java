package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ip0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ ip0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.di diVar;
        int i7 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i7) {
            case 0:
                photoViewer.o6 = null;
                org.telegram.ui.Components.gd0 gd0Var = photoViewer.C1;
                if (gd0Var != null) {
                    if (gd0Var.b.j()) {
                        org.telegram.ui.ActionBar.s6.s(photoViewer.a1, org.telegram.ui.ActionBar.l6.ng, photoViewer.v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f6 = 0.0f;
                    photoViewer.e0.invalidate();
                    break;
                }
                break;
            case 1:
                photoViewer.s3 = null;
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.d3();
                break;
            case 3:
                photoViewer.L1.m0(false);
                wp0 wp0Var = photoViewer.L1;
                wp0Var.d1.setTypeface(sg.l0.e(wp0Var.y1).j);
                wp0Var.I0.setVisibility(0);
                wp0Var.F0.setVisibility(0);
                wp0Var.G0.setVisibility(0);
                org.telegram.ui.Components.tb0 tb0Var = photoViewer.x4;
                int childCount = tb0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    tb0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.o6 = null;
                photoViewer.t4 = 3;
                photoViewer.a1().L.b(photoViewer.t4 != 0);
                fi.q3 q3Var = photoViewer.K1;
                if (q3Var != null) {
                    q3Var.b(photoViewer.t4 != 3);
                }
                photoViewer.n6 = -1;
                float o22 = photoViewer.o2(false);
                photoViewer.Z5 = o22;
                photoViewer.d6 = o22;
                photoViewer.b6 = 0.0f;
                photoViewer.c6 = 0.0f;
                photoViewer.t3(o22);
                photoViewer.t2 = true;
                photoViewer.e0.invalidate();
                wq0 wq0Var = photoViewer.d;
                if (wq0Var == null || !wq0Var.P()) {
                    photoViewer.Q1();
                    break;
                }
                break;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.o1.setVisibility(8);
                    photoViewer.B1 = null;
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.h3(new gf0(this, 24));
                break;
            case 6:
                photoViewer.l6 = 1.0f;
                Runnable runnable = photoViewer.o4;
                if (runnable != null) {
                    cn cnVar = photoViewer.k4;
                    if (cnVar == null && (diVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                        if (f2Var instanceof cn) {
                            cnVar = (cn) f2Var;
                        }
                    }
                    if (cnVar != null) {
                        cnVar.x8(runnable);
                        break;
                    } else {
                        runnable.run();
                        photoViewer.o4 = null;
                        break;
                    }
                }
                break;
            case 7:
                photoViewer.o6 = null;
                photoViewer.e0.invalidate();
                break;
            case 8:
                photoViewer.x3[0].setTag(null);
                break;
            default:
                photoViewer.x3[0].setTag(null);
                break;
        }
    }
}
