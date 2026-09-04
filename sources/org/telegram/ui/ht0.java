package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ht0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ ht0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.vi viVar;
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                photoViewer.p6 = null;
                org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
                if (ue0Var != null) {
                    if (ue0Var.b.j()) {
                        photoViewer.a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.g6 = 0.0f;
                    photoViewer.e0.invalidate();
                    break;
                }
                break;
            case 1:
                photoViewer.t3 = null;
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.g3();
                break;
            case 3:
                photoViewer.L1.n0(false);
                zt0 zt0Var = photoViewer.L1;
                zt0Var.u1.setTypeface(qg.s0.e(zt0Var.P1).j);
                zt0Var.Z0.setVisibility(0);
                zt0Var.W0.setVisibility(0);
                zt0Var.X0.setVisibility(0);
                org.telegram.ui.Components.gd0 gd0Var = photoViewer.y4;
                int childCount = gd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    gd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.p6 = null;
                photoViewer.u4 = 3;
                photoViewer.f1().L.b(photoViewer.u4 != 0);
                di.j4 j4Var = photoViewer.K1;
                if (j4Var != null) {
                    j4Var.b(photoViewer.u4 != 3);
                }
                photoViewer.o6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.a6 = r22;
                photoViewer.e6 = r22;
                photoViewer.c6 = 0.0f;
                photoViewer.d6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.t2 = true;
                photoViewer.e0.invalidate();
                av0 av0Var = photoViewer.d;
                if (av0Var == null || !av0Var.O()) {
                    photoViewer.R1();
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
                AndroidUtilities.runOnUIThread(new rl0(this, 20));
                break;
            case 6:
                photoViewer.m6 = 1.0f;
                Runnable runnable = photoViewer.p4;
                if (runnable != null) {
                    co coVar = photoViewer.l4;
                    if (coVar == null && (viVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
                        if (n2Var instanceof co) {
                            coVar = (co) n2Var;
                        }
                    }
                    if (coVar != null) {
                        coVar.h8(runnable);
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
                photoViewer.e0.invalidate();
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
