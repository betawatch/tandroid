package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class at0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ at0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.wi wiVar;
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                photoViewer.p6 = null;
                org.telegram.ui.Components.ef0 ef0Var = photoViewer.C1;
                if (ef0Var != null) {
                    if (ef0Var.b.j()) {
                        photoViewer.a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.zf), PorterDuff.Mode.MULTIPLY));
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
                st0 st0Var = photoViewer.L1;
                st0Var.u1.setTypeface(pg.u0.e(st0Var.P1).j);
                st0Var.Z0.setVisibility(0);
                st0Var.W0.setVisibility(0);
                st0Var.X0.setVisibility(0);
                org.telegram.ui.Components.qd0 qd0Var = photoViewer.y4;
                int childCount = qd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    qd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.p6 = null;
                photoViewer.u4 = 3;
                photoViewer.f1().L.b(photoViewer.u4 != 0);
                ci.i4 i4Var = photoViewer.K1;
                if (i4Var != null) {
                    i4Var.b(photoViewer.u4 != 3);
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
                tu0 tu0Var = photoViewer.d;
                if (tu0Var == null || !tu0Var.O()) {
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
                AndroidUtilities.runOnUIThread(new il0(this, 20));
                break;
            case 6:
                photoViewer.m6 = 1.0f;
                Runnable runnable = photoViewer.p4;
                if (runnable != null) {
                    wn wnVar = photoViewer.l4;
                    if (wnVar == null && (wiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.m2 m2Var = wiVar.f0;
                        if (m2Var instanceof wn) {
                            wnVar = (wn) m2Var;
                        }
                    }
                    if (wnVar != null) {
                        wnVar.h8(runnable);
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
