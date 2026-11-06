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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class pp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public pp0(PhotoViewer photoViewer, int i7) {
        this.b = photoViewer;
        this.a = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        uq0 uq0Var;
        PhotoViewer photoViewer = this.b;
        int i7 = photoViewer.t4;
        if (i7 == 1) {
            photoViewer.C1.a();
            og.o oVar = photoViewer.C1.b;
            oVar.d = null;
            oVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.b.a;
            cropAreaView.n0 = 0.0f;
            cropAreaView.o0 = 1.0f;
            cropAreaView.p0 = 0.0f;
            cropAreaView.q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i7 == 2) {
            try {
                photoViewer.e0.removeView(photoViewer.I1);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            photoViewer.I1 = null;
        } else if (i7 == 3) {
            photoViewer.L1.m0(false);
            try {
                photoViewer.e0.removeView(photoViewer.L1.getView());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            photoViewer.L1 = null;
        } else if (i7 == 4) {
            photoViewer.O1 = true;
            photoViewer.e0.invalidate();
            photoViewer.e0.post(new qn0(4, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.u5.m(false, true);
            photoViewer.v5.m(false, true);
        } else if (i7 == 5) {
            photoViewer.p5.setVisibility(8);
            org.telegram.ui.Components.ud0 ud0Var = photoViewer.p5;
            ud0Var.d = null;
            ud0Var.a.o(false, null, 0L, 0.0f);
        }
        photoViewer.o6 = null;
        int i10 = photoViewer.t4;
        photoViewer.t4 = this.a;
        photoViewer.a1().L.b(photoViewer.t4 != 0);
        fi.q3 q3Var = photoViewer.K1;
        if (q3Var != null) {
            q3Var.b(photoViewer.t4 != 3);
        }
        if (photoViewer.t4 != 3) {
            photoViewer.Y5 = 0.0f;
        }
        if (photoViewer.c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.c2 == 11 && (i10 == 3 || i10 == 2 || i10 == 1 || i10 == 4)) {
            photoViewer.b6 = photoViewer.g6;
            photoViewer.c6 = photoViewer.h6;
            photoViewer.d6 = photoViewer.i6;
            photoViewer.e6 = photoViewer.j6;
        } else {
            float o22 = photoViewer.o2(false);
            photoViewer.d6 = o22;
            photoViewer.Z5 = o22;
            photoViewer.t3(o22);
            photoViewer.b6 = 0.0f;
            photoViewer.c6 = 0.0f;
        }
        photoViewer.n6 = -1;
        photoViewer.e0.invalidate();
        yq0 yq0Var = photoViewer.h7;
        if (yq0Var != null) {
            PhotoViewer photoViewer2 = yq0Var.d;
            photoViewer2.d = yq0Var.c;
            WindowManager.LayoutParams layoutParams = photoViewer2.d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = org.telegram.messenger.qs.v4;
            photoViewer2.g0.setFocusable(false);
            photoViewer2.e0.setFocusable(false);
            photoViewer2.L0.setAlpha(org.telegram.messenger.qs.e4);
            photoViewer2.e0.setAlpha(1.0f);
            ArrayList arrayList = yq0Var.b;
            int i11 = yq0Var.a;
            photoViewer2.X1(null, null, null, null, arrayList, null, null, i11, yq0Var.c.E((org.telegram.messenger.ij) arrayList.get(i11), null, yq0Var.a, true, false));
            photoViewer.h7 = null;
            fq0 fq0Var = new fq0();
            fq0Var.c = false;
            photoViewer.h3(false, false, fq0Var);
            photoViewer.h3(true, true, fq0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        bi.m5 m5Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(m5Var, (Property<bi.m5, Float>) property, 0.0f));
        bi.m5 m5Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(m5Var2, (Property<bi.m5, Float>) property2, 1.0f));
        tg.c2 c2Var = photoViewer.o5;
        if (c2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(c2Var, (Property<tg.c2, Float>) property2, 1.0f));
        }
        di.b3 b3Var = photoViewer.r5;
        if (b3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(b3Var, (Property<di.b3, Float>) property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, (Property<li.w1, Float>) property, 0.0f));
        if (photoViewer.c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, (Property<org.telegram.ui.Components.r7, Float>) property, 0.0f));
        }
        if (photoViewer.i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, (Property<lq0, Float>) property, 0.0f));
        }
        int i12 = photoViewer.c2;
        if (i12 == 0 || i12 == 4) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, (Property<CheckBox, Float>) property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, (Property<PhotoViewer.CounterView, Float>) property2, 1.0f));
        } else if (i12 == 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, (Property<org.telegram.ui.Components.fd0, Float>) property2, 1.0f));
        }
        if (photoViewer.e1.getTag() != null) {
            photoViewer.e1.setVisibility(photoViewer.d2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.e1, (Property<org.telegram.ui.ActionBar.f0, Float>) property2, 1.0f));
        }
        if (photoViewer.f1.getTag() != null) {
            photoViewer.f1.setVisibility((!photoViewer.d2 && photoViewer.I4 && ((uq0Var = photoViewer.d) == null || uq0Var.O())) ? 0 : 8);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f1, (Property<org.telegram.ui.Components.y70, Float>) property2, 1.0f));
        }
        if (photoViewer.g1.getTag() != null) {
            photoViewer.g1.setVisibility(photoViewer.d2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.g1, (Property<xo0, Float>) property2, 1.0f));
        }
        View view = photoViewer.j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.j0, (Property<View, Float>) property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new op0(this, i10));
        animatorSet.start();
    }
}
