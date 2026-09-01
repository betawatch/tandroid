package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ps0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ ps0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.mi miVar;
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                photoViewer.m6 = null;
                org.telegram.ui.Components.af0 af0Var = photoViewer.z1;
                if (af0Var != null) {
                    if (af0Var.b.j()) {
                        photoViewer.X0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.k6.zf), PorterDuff.Mode.MULTIPLY));
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
                ht0 ht0Var = photoViewer.I1;
                ht0Var.r1.setTypeface(dg.e1.e(ht0Var.M1).j);
                ht0Var.W0.setVisibility(0);
                ht0Var.T0.setVisibility(0);
                ht0Var.U0.setVisibility(0);
                org.telegram.ui.Components.jd0 jd0Var = photoViewer.v4;
                int childCount = jd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    jd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.m6 = null;
                photoViewer.r4 = 3;
                photoViewer.f1().I.b(photoViewer.r4 != 0);
                qh.i3 i3Var = photoViewer.H1;
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
                ju0 ju0Var = photoViewer.d;
                if (ju0Var == null || !ju0Var.O()) {
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
                AndroidUtilities.runOnUIThread(new gl0(this, 21));
                break;
            case 6:
                photoViewer.j6 = 1.0f;
                Runnable runnable = photoViewer.m4;
                if (runnable != null) {
                    xn xnVar = photoViewer.i4;
                    if (xnVar == null && (miVar = photoViewer.X1) != null) {
                        org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
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
