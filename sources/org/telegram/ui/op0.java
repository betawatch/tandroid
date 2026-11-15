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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class op0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public op0(PhotoViewer photoViewer, int i7) {
        this.b = photoViewer;
        this.a = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        sq0 sq0Var;
        PhotoViewer photoViewer = this.b;
        int i7 = photoViewer.u4;
        if (i7 == 1) {
            photoViewer.D1.a();
            og.o oVar = photoViewer.D1.b;
            oVar.d = null;
            oVar.K = false;
            photoViewer.V0.setVisibility(8);
            photoViewer.D1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.D1.b.a;
            cropAreaView.o0 = 0.0f;
            cropAreaView.p0 = 1.0f;
            cropAreaView.q0 = 0.0f;
            cropAreaView.r0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i7 == 2) {
            try {
                photoViewer.f0.removeView(photoViewer.J1);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            photoViewer.J1 = null;
        } else if (i7 == 3) {
            photoViewer.M1.m0(false);
            try {
                photoViewer.f0.removeView(photoViewer.M1.getView());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            photoViewer.M1 = null;
        } else if (i7 == 4) {
            photoViewer.P1 = true;
            photoViewer.f0.invalidate();
            photoViewer.f0.post(new mp0(0, this, photoViewer.O1));
            photoViewer.O1 = null;
            photoViewer.v5.m(false, true);
            photoViewer.w5.m(false, true);
        } else if (i7 == 5) {
            photoViewer.q5.setVisibility(8);
            org.telegram.ui.Components.ud0 ud0Var = photoViewer.q5;
            ud0Var.d = null;
            ud0Var.a.o(false, null, 0L, 0.0f);
        }
        photoViewer.p6 = null;
        int i10 = photoViewer.u4;
        photoViewer.u4 = this.a;
        photoViewer.b1().M.b(photoViewer.u4 != 0);
        hi.p3 p3Var = photoViewer.L1;
        if (p3Var != null) {
            p3Var.b(photoViewer.u4 != 3);
        }
        if (photoViewer.u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.d2 == 1) {
            photoViewer.D1.setVisibility(0);
        }
        if (photoViewer.d2 == 11 && (i10 == 3 || i10 == 2 || i10 == 1 || i10 == 4)) {
            photoViewer.c6 = photoViewer.h6;
            photoViewer.d6 = photoViewer.i6;
            photoViewer.e6 = photoViewer.j6;
            photoViewer.f6 = photoViewer.k6;
        } else {
            float p22 = photoViewer.p2(false);
            photoViewer.e6 = p22;
            photoViewer.a6 = p22;
            photoViewer.u3(p22);
            photoViewer.c6 = 0.0f;
            photoViewer.d6 = 0.0f;
        }
        photoViewer.o6 = -1;
        photoViewer.f0.invalidate();
        wq0 wq0Var = photoViewer.i7;
        if (wq0Var != null) {
            PhotoViewer photoViewer2 = wq0Var.d;
            photoViewer2.d = wq0Var.c;
            WindowManager.LayoutParams layoutParams = photoViewer2.e0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = org.telegram.messenger.ns.v4;
            photoViewer2.h0.setFocusable(false);
            photoViewer2.f0.setFocusable(false);
            photoViewer2.M0.setAlpha(org.telegram.messenger.ns.e4);
            photoViewer2.f0.setAlpha(1.0f);
            ArrayList arrayList = wq0Var.b;
            int i11 = wq0Var.a;
            photoViewer2.X1(null, null, null, null, arrayList, null, null, i11, wq0Var.c.E((org.telegram.messenger.gj) arrayList.get(i11), null, wq0Var.a, true, false));
            photoViewer.i7 = null;
            eq0 eq0Var = new eq0();
            eq0Var.c = false;
            photoViewer.i3(false, false, eq0Var);
            photoViewer.i3(true, true, eq0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        di.k4 k4Var = photoViewer.Q0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(k4Var, (Property<di.k4, Float>) property, 0.0f));
        di.k4 k4Var2 = photoViewer.Q0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(k4Var2, (Property<di.k4, Float>) property2, 1.0f));
        tg.e2 e2Var = photoViewer.p5;
        if (e2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(e2Var, (Property<tg.e2, Float>) property2, 1.0f));
        }
        fi.w2 w2Var = photoViewer.s5;
        if (w2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(w2Var, (Property<fi.w2, Float>) property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.T0, (Property<oi.u1, Float>) property, 0.0f));
        if (photoViewer.d2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.G, (Property<org.telegram.ui.Components.o7, Float>) property, 0.0f));
        }
        if (photoViewer.j2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.R1, (Property<kq0, Float>) property, 0.0f));
        }
        int i12 = photoViewer.d2;
        if (i12 == 0 || i12 == 4) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, (Property<CheckBox, Float>) property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.P0, (Property<PhotoViewer.CounterView, Float>) property2, 1.0f));
        } else if (i12 == 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.D1, (Property<org.telegram.ui.Components.gd0, Float>) property2, 1.0f));
        }
        if (photoViewer.f1.getTag() != null) {
            photoViewer.f1.setVisibility(photoViewer.e2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f1, (Property<org.telegram.ui.ActionBar.f0, Float>) property2, 1.0f));
        }
        if (photoViewer.g1.getTag() != null) {
            photoViewer.g1.setVisibility((!photoViewer.e2 && photoViewer.J4 && ((sq0Var = photoViewer.d) == null || sq0Var.O())) ? 0 : 8);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.g1, (Property<org.telegram.ui.Components.b80, Float>) property2, 1.0f));
        }
        if (photoViewer.h1.getTag() != null) {
            photoViewer.h1.setVisibility(photoViewer.e2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.h1, (Property<vo0, Float>) property2, 1.0f));
        }
        View view = photoViewer.k0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.k0, (Property<View, Float>) property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new np0(this, i10));
        animatorSet.start();
    }
}
