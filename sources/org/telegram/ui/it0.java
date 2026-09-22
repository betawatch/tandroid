package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class it0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ it0(PhotoViewer photoViewer, int i10) {
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
                        photoViewer.a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.i6.zf), PorterDuff.Mode.MULTIPLY));
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
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.f3();
                break;
            case 3:
                photoViewer.L1.o0(false);
                au0 au0Var = photoViewer.L1;
                au0Var.u1.setTypeface(pg.s0.e(au0Var.P1).j);
                au0Var.Z0.setVisibility(0);
                au0Var.W0.setVisibility(0);
                au0Var.X0.setVisibility(0);
                org.telegram.ui.Components.fd0 fd0Var = photoViewer.y4;
                int childCount = fd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    fd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.p6 = null;
                photoViewer.u4 = 3;
                photoViewer.f1().L.b(photoViewer.u4 != 0);
                ci.j4 j4Var = photoViewer.K1;
                if (j4Var != null) {
                    j4Var.b(photoViewer.u4 != 3);
                }
                photoViewer.o6 = -1;
                float q22 = photoViewer.q2(false);
                photoViewer.a6 = q22;
                photoViewer.e6 = q22;
                photoViewer.c6 = 0.0f;
                photoViewer.d6 = 0.0f;
                photoViewer.v3(q22);
                photoViewer.t2 = true;
                photoViewer.e0.invalidate();
                bv0 bv0Var = photoViewer.d;
                if (bv0Var == null || !bv0Var.O()) {
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
                AndroidUtilities.runOnUIThread(new pl0(this, 20));
                break;
            case 6:
                photoViewer.m6 = 1.0f;
                Runnable runnable = photoViewer.p4;
                if (runnable != null) {
                    bo boVar = photoViewer.l4;
                    if (boVar == null && (viVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
                        if (n2Var instanceof bo) {
                            boVar = (bo) n2Var;
                        }
                    }
                    if (boVar != null) {
                        boVar.h8(runnable);
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
