package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public gp0(PhotoViewer photoViewer, int i3) {
        this.b = photoViewer;
        this.a = i3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kq0 kq0Var;
        PhotoViewer photoViewer = this.b;
        int i3 = photoViewer.v4;
        if (i3 == 1) {
            photoViewer.D1.a();
            pg.m mVar = photoViewer.D1.b;
            mVar.d = null;
            mVar.K = false;
            photoViewer.V0.setVisibility(8);
            photoViewer.D1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.D1.b.a;
            cropAreaView.o0 = 0.0f;
            cropAreaView.p0 = 1.0f;
            cropAreaView.q0 = 0.0f;
            cropAreaView.r0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i3 == 2) {
            try {
                photoViewer.f0.removeView(photoViewer.J1);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            photoViewer.J1 = null;
        } else if (i3 == 3) {
            photoViewer.M1.m0(false);
            try {
                photoViewer.f0.removeView(photoViewer.M1.getView());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            photoViewer.M1 = null;
        } else if (i3 == 4) {
            photoViewer.P1 = true;
            photoViewer.f0.invalidate();
            photoViewer.f0.post(new hk0(8, this, photoViewer.O1));
            photoViewer.O1 = null;
            photoViewer.w5.m(false, true);
            photoViewer.x5.m(false, true);
        } else if (i3 == 5) {
            photoViewer.r5.setVisibility(8);
            org.telegram.ui.Components.od0 od0Var = photoViewer.r5;
            od0Var.d = null;
            od0Var.a.o(false, null, 0L, 0.0f);
        }
        photoViewer.q6 = null;
        int i10 = photoViewer.v4;
        photoViewer.v4 = this.a;
        photoViewer.h1().M.b(photoViewer.v4 != 0);
        gi.p3 p3Var = photoViewer.L1;
        if (p3Var != null) {
            p3Var.b(photoViewer.v4 != 3);
        }
        if (photoViewer.v4 != 3) {
            photoViewer.a6 = 0.0f;
        }
        if (photoViewer.d2 == 1) {
            photoViewer.D1.setVisibility(0);
        }
        if (photoViewer.d2 == 11 && (i10 == 3 || i10 == 2 || i10 == 1 || i10 == 4)) {
            photoViewer.d6 = photoViewer.i6;
            photoViewer.e6 = photoViewer.j6;
            photoViewer.f6 = photoViewer.k6;
            photoViewer.g6 = photoViewer.l6;
        } else {
            float u22 = photoViewer.u2(false);
            photoViewer.f6 = u22;
            photoViewer.b6 = u22;
            photoViewer.z3(u22);
            photoViewer.d6 = 0.0f;
            photoViewer.e6 = 0.0f;
        }
        photoViewer.p6 = -1;
        photoViewer.f0.invalidate();
        oq0 oq0Var = photoViewer.j7;
        if (oq0Var != null) {
            PhotoViewer photoViewer2 = oq0Var.d;
            photoViewer2.d = oq0Var.c;
            WindowManager.LayoutParams layoutParams = photoViewer2.e0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = org.telegram.messenger.hs.v4;
            photoViewer2.h0.setFocusable(false);
            photoViewer2.f0.setFocusable(false);
            photoViewer2.M0.setAlpha(org.telegram.messenger.hs.e4);
            photoViewer2.f0.setAlpha(1.0f);
            ArrayList arrayList = oq0Var.b;
            int i11 = oq0Var.a;
            photoViewer2.c2(null, null, null, null, arrayList, null, null, i11, oq0Var.c.E((org.telegram.messenger.zi) arrayList.get(i11), null, oq0Var.a, true, false));
            photoViewer.j7 = null;
            wp0 wp0Var = new wp0();
            wp0Var.c = false;
            photoViewer.n3(false, false, wp0Var);
            photoViewer.n3(true, true, wp0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        ci.t4 t4Var = photoViewer.Q0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(t4Var, (Property<ci.t4, Float>) property, 0.0f));
        ci.t4 t4Var2 = photoViewer.Q0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(t4Var2, (Property<ci.t4, Float>) property2, 1.0f));
        ug.c2 c2Var = photoViewer.q5;
        if (c2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(c2Var, (Property<ug.c2, Float>) property2, 1.0f));
        }
        ei.e3 e3Var = photoViewer.t5;
        if (e3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(e3Var, (Property<ei.e3, Float>) property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.T0, (Property<mi.x1, Float>) property, 0.0f));
        if (photoViewer.d2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.G, (Property<org.telegram.ui.Components.p7, Float>) property, 0.0f));
        }
        if (photoViewer.j2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.R1, (Property<cq0, Float>) property, 0.0f));
        }
        int i12 = photoViewer.d2;
        if (i12 == 0 || i12 == 4) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, (Property<CheckBox, Float>) property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.P0, (Property<PhotoViewer.CounterView, Float>) property2, 1.0f));
        } else if (i12 == 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.D1, (Property<org.telegram.ui.Components.ad0, Float>) property2, 1.0f));
        }
        if (photoViewer.f1.getTag() != null) {
            photoViewer.f1.setVisibility(photoViewer.e2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f1, (Property<org.telegram.ui.ActionBar.e0, Float>) property2, 1.0f));
        }
        if (photoViewer.g1.getTag() != null) {
            photoViewer.g1.setVisibility((!photoViewer.e2 && photoViewer.K4 && ((kq0Var = photoViewer.d) == null || kq0Var.O())) ? 0 : 8);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.g1, (Property<org.telegram.ui.Components.u70, Float>) property2, 1.0f));
        }
        if (photoViewer.h1.getTag() != null) {
            photoViewer.h1.setVisibility(photoViewer.e2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.h1, (Property<oo0, Float>) property2, 1.0f));
        }
        View view = photoViewer.k0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.k0, (Property<View, Float>) property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new fp0(this, i10));
        animatorSet.start();
    }
}
