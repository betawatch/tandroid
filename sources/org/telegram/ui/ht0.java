package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        org.telegram.ui.Components.yi yiVar;
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                photoViewer.p6 = null;
                org.telegram.ui.Components.df0 df0Var = photoViewer.C1;
                if (df0Var != null) {
                    if (df0Var.b.j()) {
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
                zt0Var.u1.setTypeface(og.x0.e(zt0Var.P1).j);
                zt0Var.Z0.setVisibility(0);
                zt0Var.W0.setVisibility(0);
                zt0Var.X0.setVisibility(0);
                org.telegram.ui.Components.pd0 pd0Var = photoViewer.y4;
                int childCount = pd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    pd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.p6 = null;
                photoViewer.u4 = 3;
                photoViewer.f1().L.b(photoViewer.u4 != 0);
                bi.b5 b5Var = photoViewer.K1;
                if (b5Var != null) {
                    b5Var.b(photoViewer.u4 != 3);
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
                cv0 cv0Var = photoViewer.d;
                if (cv0Var == null || !cv0Var.O()) {
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
                AndroidUtilities.runOnUIThread(new ql0(this, 20));
                break;
            case 6:
                photoViewer.m6 = 1.0f;
                Runnable runnable = photoViewer.p4;
                if (runnable != null) {
                    eo eoVar = photoViewer.l4;
                    if (eoVar == null && (yiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f0;
                        if (p2Var instanceof eo) {
                            eoVar = (eo) p2Var;
                        }
                    }
                    if (eoVar != null) {
                        eoVar.h8(runnable);
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
