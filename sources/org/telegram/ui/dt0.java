package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class dt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ dt0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.xi xiVar;
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                photoViewer.p6 = null;
                org.telegram.ui.Components.gf0 gf0Var = photoViewer.C1;
                if (gf0Var != null) {
                    if (gf0Var.b.j()) {
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
                photoViewer.g3();
                break;
            case 3:
                photoViewer.L1.o0(false);
                vt0 vt0Var = photoViewer.L1;
                vt0Var.u1.setTypeface(pg.u0.e(vt0Var.P1).j);
                vt0Var.Z0.setVisibility(0);
                vt0Var.W0.setVisibility(0);
                vt0Var.X0.setVisibility(0);
                org.telegram.ui.Components.sd0 sd0Var = photoViewer.y4;
                int childCount = sd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    sd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.p6 = null;
                photoViewer.u4 = 3;
                photoViewer.f1().L.b(photoViewer.u4 != 0);
                ci.i4 i4Var = photoViewer.K1;
                if (i4Var != null) {
                    i4Var.b(photoViewer.u4 != 3);
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
                wu0 wu0Var = photoViewer.d;
                if (wu0Var == null || !wu0Var.O()) {
                    photoViewer.S1();
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
                AndroidUtilities.runOnUIThread(new nl0(this, 21));
                break;
            case 6:
                photoViewer.m6 = 1.0f;
                Runnable runnable = photoViewer.p4;
                if (runnable != null) {
                    yn ynVar = photoViewer.l4;
                    if (ynVar == null && (xiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f0;
                        if (n2Var instanceof yn) {
                            ynVar = (yn) n2Var;
                        }
                    }
                    if (ynVar != null) {
                        ynVar.h8(runnable);
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
