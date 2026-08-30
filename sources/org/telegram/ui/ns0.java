package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ns0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ ns0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.li liVar;
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                photoViewer.m6 = null;
                org.telegram.ui.Components.ye0 ye0Var = photoViewer.z1;
                if (ye0Var != null) {
                    if (ye0Var.b.j()) {
                        photoViewer.X0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.X0.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.d6 = 0.0f;
                    photoViewer.b0.invalidate();
                    break;
                }
                break;
            case 1:
                photoViewer.q3 = null;
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.g3();
                break;
            case 3:
                photoViewer.I1.n0(false);
                ft0 ft0Var = photoViewer.I1;
                ft0Var.r1.setTypeface(cg.f1.e(ft0Var.M1).j);
                ft0Var.W0.setVisibility(0);
                ft0Var.T0.setVisibility(0);
                ft0Var.U0.setVisibility(0);
                org.telegram.ui.Components.hd0 hd0Var = photoViewer.v4;
                int childCount = hd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    hd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.m6 = null;
                photoViewer.r4 = 3;
                photoViewer.f1().I.b(photoViewer.r4 != 0);
                ph.i3 i3Var = photoViewer.H1;
                if (i3Var != null) {
                    i3Var.b(photoViewer.r4 != 3);
                }
                photoViewer.l6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.X5 = r22;
                photoViewer.b6 = r22;
                photoViewer.Z5 = 0.0f;
                photoViewer.a6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.q2 = true;
                photoViewer.b0.invalidate();
                hu0 hu0Var = photoViewer.d;
                if (hu0Var == null || !hu0Var.O()) {
                    photoViewer.R1();
                    break;
                }
                break;
            case 4:
                AnimatorSet animatorSet = photoViewer.y1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.l1.setVisibility(8);
                    photoViewer.y1 = null;
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new el0(this, 21));
                break;
            case 6:
                photoViewer.j6 = 1.0f;
                Runnable runnable = photoViewer.m4;
                if (runnable != null) {
                    xn xnVar = photoViewer.i4;
                    if (xnVar == null && (liVar = photoViewer.X1) != null) {
                        org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
                        if (p2Var instanceof xn) {
                            xnVar = (xn) p2Var;
                        }
                    }
                    if (xnVar != null) {
                        xnVar.h8(runnable);
                        break;
                    } else {
                        runnable.run();
                        photoViewer.m4 = null;
                        break;
                    }
                }
                break;
            case 7:
                photoViewer.m6 = null;
                photoViewer.b0.invalidate();
                break;
            case 8:
                photoViewer.v3[0].setTag(null);
                break;
            default:
                photoViewer.v3[0].setTag(null);
                break;
        }
    }
}
