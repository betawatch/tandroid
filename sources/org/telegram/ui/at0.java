package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class at0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public at0(PhotoViewer photoViewer, int i10) {
        this.b = photoViewer;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        hu0 hu0Var;
        PhotoViewer photoViewer = this.b;
        int i10 = photoViewer.r4;
        if (i10 == 1) {
            photoViewer.z1.a();
            yf.n nVar = photoViewer.z1.b;
            nVar.d = null;
            nVar.G = false;
            photoViewer.R0.setVisibility(8);
            photoViewer.z1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.z1.b.a;
            cropAreaView.k0 = 0.0f;
            cropAreaView.l0 = 1.0f;
            cropAreaView.m0 = 0.0f;
            cropAreaView.n0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i10 == 2) {
            try {
                photoViewer.b0.removeView(photoViewer.F1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.F1 = null;
        } else if (i10 == 3) {
            photoViewer.I1.n0(false);
            try {
                photoViewer.b0.removeView(photoViewer.I1.getView());
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            photoViewer.I1 = null;
        } else if (i10 == 4) {
            photoViewer.L1 = true;
            photoViewer.b0.invalidate();
            photoViewer.b0.post(new zq0(5, this, photoViewer.K1));
            photoViewer.K1 = null;
            photoViewer.s5.m(false, true);
            photoViewer.t5.m(false, true);
        } else if (i10 == 5) {
            photoViewer.n5.setVisibility(8);
            org.telegram.ui.Components.of0 of0Var = photoViewer.n5;
            of0Var.d = null;
            of0Var.a.o(false, null, 0L, 0.0f);
        }
        photoViewer.m6 = null;
        int i11 = photoViewer.r4;
        photoViewer.r4 = this.a;
        photoViewer.f1().I.b(photoViewer.r4 != 0);
        ph.i3 i3Var = photoViewer.H1;
        if (i3Var != null) {
            i3Var.b(photoViewer.r4 != 3);
        }
        if (photoViewer.r4 != 3) {
            photoViewer.W5 = 0.0f;
        }
        if (photoViewer.Z1 == 1) {
            photoViewer.z1.setVisibility(0);
        }
        if (photoViewer.Z1 == 11 && (i11 == 3 || i11 == 2 || i11 == 1 || i11 == 4)) {
            photoViewer.Z5 = photoViewer.e6;
            photoViewer.a6 = photoViewer.f6;
            photoViewer.b6 = photoViewer.g6;
            photoViewer.c6 = photoViewer.h6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.b6 = r22;
            photoViewer.X5 = r22;
            photoViewer.w3(r22);
            photoViewer.Z5 = 0.0f;
            photoViewer.a6 = 0.0f;
        }
        photoViewer.l6 = -1;
        photoViewer.b0.invalidate();
        mu0 mu0Var = photoViewer.f7;
        if (mu0Var != null) {
            PhotoViewer photoViewer2 = mu0Var.d;
            photoViewer2.d = mu0Var.c;
            WindowManager.LayoutParams layoutParams = photoViewer2.a0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.d0.setFocusable(false);
            photoViewer2.b0.setFocusable(false);
            photoViewer2.I0.setAlpha(255);
            photoViewer2.b0.setAlpha(1.0f);
            ArrayList arrayList = mu0Var.b;
            int i12 = mu0Var.a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i12, mu0Var.c.E((MessageObject) arrayList.get(i12), null, mu0Var.a, true, false));
            photoViewer.f7 = null;
            qt0 qt0Var = new qt0();
            qt0Var.c = false;
            photoViewer.k3(false, false, qt0Var);
            photoViewer.k3(true, true, qt0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        dg.s1 s1Var = photoViewer.M0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(s1Var, (Property<dg.s1, Float>) property, 0.0f));
        dg.s1 s1Var2 = photoViewer.M0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(s1Var2, (Property<dg.s1, Float>) property2, 1.0f));
        dg.q3 q3Var = photoViewer.m5;
        if (q3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(q3Var, (Property<dg.q3, Float>) property2, 1.0f));
        }
        nh.a3 a3Var = photoViewer.p5;
        if (a3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(a3Var, (Property<nh.a3, Float>) property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.P0, (Property<org.telegram.ui.Components.qp0, Float>) property, 0.0f));
        if (photoViewer.Z1 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C, (Property<eg.l1, Float>) property, 0.0f));
        }
        if (photoViewer.f2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N1, (Property<wt0, Float>) property, 0.0f));
        }
        int i13 = photoViewer.Z1;
        if (i13 == 0 || i13 == 4) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.K0, (Property<CheckBox, Float>) property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.L0, (Property<PhotoViewer.CounterView, Float>) property2, 1.0f));
        } else if (i13 == 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.z1, (Property<org.telegram.ui.Components.ye0, Float>) property2, 1.0f));
        }
        if (photoViewer.b1.getTag() != null) {
            photoViewer.b1.setVisibility(photoViewer.a2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.b1, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
        }
        if (photoViewer.c1.getTag() != null) {
            photoViewer.c1.setVisibility((!photoViewer.a2 && photoViewer.G4 && ((hu0Var = photoViewer.d) == null || hu0Var.N())) ? 0 : 8);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.c1, (Property<org.telegram.ui.Components.g90, Float>) property2, 1.0f));
        }
        if (photoViewer.d1.getTag() != null) {
            photoViewer.d1.setVisibility(photoViewer.a2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.d1, (Property<ds0, Float>) property2, 1.0f));
        }
        View view = photoViewer.g0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.g0, (Property<View, Float>) property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new zs0(this, i11));
        animatorSet.start();
    }
}
