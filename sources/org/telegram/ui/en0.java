package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class en0 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ en0(PhotoViewer photoViewer, int i3) {
        this.a = i3;
        this.b = photoViewer;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        boolean z10;
        boolean z11;
        int i3;
        int i10 = 9;
        int i11 = 8;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                ug.z1 z1Var = (ug.z1) obj;
                Drawable[] drawableArr = PhotoViewer.V8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((org.telegram.messenger.se) photoViewer.h7.get(photoViewer.Q4)).i);
                    ug.c2 c2Var = photoViewer.q5;
                    c2Var.M = true;
                    c2Var.F = z1Var;
                    Bitmap n4 = photoViewer.D4.n();
                    int i12 = photoViewer.D4.V;
                    ug.z1 z1Var2 = c2Var.F;
                    photoViewer.D4.v0(z1Var2 == null ? c2Var.J : (isEmpty || n4 == null) ? z1Var2.b() : c2Var.e(n4));
                    photoViewer.u5.setUndoCutState(true);
                    photoViewer.d3(true, true);
                    photoViewer.u5.post(new xm0(photoViewer, i10));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                org.telegram.ui.Components.fc.F(this.b.f0, true).j();
                break;
            case 2:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.M1.R1 = photoViewer2.L1.c();
                photoViewer2.f0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.M1.T1);
                float L = (!(photoViewer2.M1.C0 instanceof ug.l2) || max <= 0) ? 0.0f : ((org.telegram.messenger.g0.q.y - max) - org.telegram.messenger.g0.L(80.0f)) - photoViewer2.M1.getSelectedEntityBottom();
                ValueAnimator valueAnimator = photoViewer2.t7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.t7 = null;
                }
                if (photoViewer2.v4 != 3) {
                    L = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.a6, L);
                photoViewer2.t7 = ofFloat;
                ofFloat.addUpdateListener(new wm0(photoViewer2, i10));
                photoViewer2.t7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.t7;
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                valueAnimator2.setInterpolator(xqVar);
                photoViewer2.t7.start();
                AnimatorSet animatorSet = photoViewer2.K1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new wm0(photoViewer2, i11));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.K1 = animatorSet2;
                ug.l1 l1Var = photoViewer2.M1.V0;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(l1Var, (Property<ug.l1, Float>) property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.M1.M0, (Property<ug.d0, Float>) property, Math.min(0, org.telegram.messenger.g0.L(40.0f) + r15));
                gi.y4 y4Var = photoViewer2.M1.P0;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(y4Var, (Property<gi.y4, Float>) property2, max > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.M1.k0, (Property<ug.u0, Float>) property2, max > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.M1.l0, (Property<ug.y0, Float>) property2, max > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(xqVar);
                animatorSet2.start();
                lp0 lp0Var = photoViewer2.M1;
                ug.d1 d1Var = lp0Var.e1;
                if (d1Var != null) {
                    if (lp0Var.R1) {
                        d1Var.a(R.drawable.input_smile);
                    } else if (lp0Var.Q1) {
                        d1Var.a(R.drawable.input_keyboard);
                    } else {
                        d1Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = lp0Var.i1;
                if (lp0Var.R1 || lp0Var.Q1) {
                    z10 = false;
                    z11 = false;
                } else {
                    z10 = true;
                    z11 = false;
                }
                org.telegram.messenger.g0.U3(1.0f, textView, z10, z11);
                org.telegram.messenger.g0.U3(1.0f, lp0Var.g1, (lp0Var.R1 || lp0Var.Q1) ? z11 : true, z11);
                org.telegram.messenger.g0.U3(1.0f, lp0Var.k1, (lp0Var.R1 || lp0Var.Q1) ? true : z11, z11);
                TextView textView2 = lp0Var.j1;
                if (!lp0Var.R1 && !lp0Var.Q1) {
                    z12 = z11;
                }
                org.telegram.messenger.g0.U3(1.0f, textView2, z12, z11);
                break;
            case 3:
                PhotoViewer photoViewer3 = this.b;
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                if (!photoViewer3.r5.b.R && (i3 = photoViewer3.Q4) >= 0 && i3 < photoViewer3.h7.size() && (photoViewer3.h7.get(photoViewer3.Q4) instanceof org.telegram.messenger.ye)) {
                    org.telegram.ui.Components.od0 od0Var = photoViewer3.r5;
                    gi.h3 h3Var = od0Var.h;
                    if (h3Var != null) {
                        h3Var.dismiss();
                        od0Var.h = null;
                    }
                    photoViewer3.r5.b.setLoading(true);
                    Utilities.e.c(new ih0(photoViewer3, yeVar, (org.telegram.messenger.ye) photoViewer3.h7.get(photoViewer3.Q4), PhotoViewer.A1(), 3));
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer4 = this.b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.h7.get(photoViewer4.Q4);
                if (obj2 instanceof org.telegram.messenger.ye) {
                    ((org.telegram.messenger.ye) obj2).x = num.intValue();
                } else if (obj2 instanceof org.telegram.messenger.bf) {
                    ((org.telegram.messenger.bf) obj2).x = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.Q4)) {
                    photoViewer4.P2();
                }
                photoViewer4.W1.setTimer(num.intValue());
                break;
            case 5:
                PhotoViewer photoViewer5 = this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.S7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.S7.setTranslationY(photoViewer5.Q0.getTranslationY() - (photoViewer5.V1.getAlpha() * k2.p1.d(46.0f, photoViewer5.V1.getEditTextHeight(), 0)));
                }
                photoViewer5.f1.setTranslationY(photoViewer5.V1.getAlpha() * (-k2.p1.d(46.0f, num2.intValue(), 0)));
                photoViewer5.g1.setTranslationY(photoViewer5.V1.getAlpha() * (-k2.p1.d(46.0f, num2.intValue(), 0)));
                photoViewer5.h1.setTranslationY(photoViewer5.V1.getAlpha() * (-k2.p1.d(46.0f, num2.intValue(), 0)));
                gi.i iVar = photoViewer5.V1.N;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - org.telegram.messenger.g0.L(14.0f));
                    break;
                }
                break;
            case 6:
                PhotoViewer photoViewer6 = this.b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.h7.get(photoViewer6.Q4);
                if (obj3 instanceof org.telegram.messenger.ye) {
                    ((org.telegram.messenger.ye) obj3).x = num3.intValue();
                } else if (obj3 instanceof org.telegram.messenger.bf) {
                    ((org.telegram.messenger.bf) obj3).x = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.Q4)) {
                    photoViewer6.P2();
                }
                photoViewer6.V1.setTimer(num3.intValue());
                break;
            case 7:
                Integer num4 = (Integer) obj;
                gi.i iVar2 = this.b.W1.N;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    break;
                }
                break;
            case 8:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.V8;
                photoViewer7.C0(0, false);
                break;
            default:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.V8;
                photoViewer8.C0(0, false);
                break;
        }
    }
}
