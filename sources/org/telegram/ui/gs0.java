package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ gs0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.gi giVar;
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                photoViewer.l6 = null;
                org.telegram.ui.Components.ge0 ge0Var = photoViewer.y1;
                if (ge0Var != null) {
                    if (ge0Var.b.j()) {
                        photoViewer.W0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.g6.zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.W0.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.c6 = 0.0f;
                    photoViewer.a0.invalidate();
                    break;
                }
                break;
            case 1:
                photoViewer.p3 = null;
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.g3();
                break;
            case 3:
                photoViewer.H1.n0(false);
                ys0 ys0Var = photoViewer.H1;
                ys0Var.q1.setTypeface(yf.r0.e(ys0Var.L1).j);
                ys0Var.V0.setVisibility(0);
                ys0Var.S0.setVisibility(0);
                ys0Var.T0.setVisibility(0);
                org.telegram.ui.Components.rc0 rc0Var = photoViewer.u4;
                int childCount = rc0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    rc0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.l6 = null;
                photoViewer.q4 = 3;
                photoViewer.f1().H.b(photoViewer.q4 != 0);
                lh.a4 a4Var = photoViewer.G1;
                if (a4Var != null) {
                    a4Var.b(photoViewer.q4 != 3);
                }
                photoViewer.k6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.W5 = r22;
                photoViewer.a6 = r22;
                photoViewer.Y5 = 0.0f;
                photoViewer.Z5 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.p2 = true;
                photoViewer.a0.invalidate();
                au0 au0Var = photoViewer.d;
                if (au0Var == null || !au0Var.O()) {
                    photoViewer.R1();
                    break;
                }
                break;
            case 4:
                AnimatorSet animatorSet = photoViewer.x1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.k1.setVisibility(8);
                    photoViewer.x1 = null;
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new zk0(this, 21));
                break;
            case 6:
                photoViewer.i6 = 1.0f;
                Runnable runnable = photoViewer.l4;
                if (runnable != null) {
                    rn rnVar = photoViewer.h4;
                    if (rnVar == null && (giVar = photoViewer.W1) != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = giVar.b0;
                        if (n2Var instanceof rn) {
                            rnVar = (rn) n2Var;
                        }
                    }
                    if (rnVar != null) {
                        rnVar.h8(runnable);
                        break;
                    } else {
                        runnable.run();
                        photoViewer.l4 = null;
                        break;
                    }
                }
                break;
            case 7:
                photoViewer.l6 = null;
                photoViewer.a0.invalidate();
                break;
            case 8:
                photoViewer.u3[0].setTag(null);
                break;
            default:
                photoViewer.u3[0].setTag(null);
                break;
        }
    }
}
