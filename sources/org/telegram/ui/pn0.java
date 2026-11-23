package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pn0 implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ pn0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        boolean z10;
        boolean z11;
        int i7;
        int i10 = 9;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                tg.f2 f2Var = (tg.f2) obj;
                Drawable[] drawableArr = PhotoViewer.f9;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((org.telegram.messenger.xe) photoViewer.g7.get(photoViewer.P4)).i);
                    tg.i2 i2Var = photoViewer.p5;
                    i2Var.M = true;
                    i2Var.F = f2Var;
                    Bitmap n10 = photoViewer.C4.n();
                    int i11 = photoViewer.C4.V;
                    tg.f2 f2Var2 = i2Var.F;
                    photoViewer.C4.w0(f2Var2 == null ? i2Var.J : (isEmpty || n10 == null) ? f2Var2.b() : i2Var.e(n10));
                    photoViewer.t5.setUndoCutState(true);
                    photoViewer.Z2(true, true);
                    photoViewer.t5.post(new kn0(photoViewer, i10));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                if (surfaceTexture == null) {
                    Drawable[] drawableArr2 = PhotoViewer.f9;
                    break;
                } else {
                    TextureView textureView = photoViewer2.C2;
                    if (textureView != null) {
                        if (photoViewer2.L3) {
                            photoViewer2.G3 = 2;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        photoViewer2.C2.setVisibility(0);
                        photoViewer2.F3 = false;
                        photoViewer2.f0.invalidate();
                        org.telegram.messenger.g0.h3(new kn0(photoViewer2, 12), 64L);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.kc.F(this.b.f0, true).j();
                break;
            case 3:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.M1.V1 = photoViewer3.L1.c();
                photoViewer3.f0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer3.M1.X1);
                float L = (!(photoViewer3.M1.C0 instanceof tg.q2) || max <= 0) ? 0.0f : ((org.telegram.messenger.g0.q.y - max) - org.telegram.messenger.g0.L(80.0f)) - photoViewer3.M1.getSelectedEntityBottom();
                ValueAnimator valueAnimator = photoViewer3.y7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer3.y7 = null;
                }
                if (photoViewer3.u4 != 3) {
                    L = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer3.Z5, L);
                photoViewer3.y7 = ofFloat;
                ofFloat.addUpdateListener(new en0(photoViewer3, 10));
                photoViewer3.y7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer3.y7;
                org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
                valueAnimator2.setInterpolator(krVar);
                photoViewer3.y7.start();
                AnimatorSet animatorSet = photoViewer3.K1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new en0(photoViewer3, i10));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer3.K1 = animatorSet2;
                tg.r1 r1Var = photoViewer3.M1.V0;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r1Var, (Property<tg.r1, Float>) property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer3.M1.M0, (Property<tg.j0, Float>) property, Math.min(0, org.telegram.messenger.g0.L(40.0f) + r15));
                hi.i5 i5Var = photoViewer3.M1.P0;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(i5Var, (Property<hi.i5, Float>) property2, max > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer3.M1.k0, (Property<tg.a1, Float>) property2, max > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer3.M1.l0, (Property<tg.e1, Float>) property2, max > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(krVar);
                animatorSet2.start();
                vp0 vp0Var = photoViewer3.M1;
                tg.j1 j1Var = vp0Var.e1;
                if (j1Var != null) {
                    if (vp0Var.V1) {
                        j1Var.a(R.drawable.input_smile);
                    } else if (vp0Var.U1) {
                        j1Var.a(R.drawable.input_keyboard);
                    } else {
                        j1Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = vp0Var.i1;
                if (vp0Var.V1 || vp0Var.U1) {
                    z10 = false;
                    z11 = false;
                } else {
                    z10 = true;
                    z11 = false;
                }
                org.telegram.messenger.g0.S3(1.0f, textView, z10, z11);
                org.telegram.messenger.g0.S3(1.0f, vp0Var.g1, (vp0Var.V1 || vp0Var.U1) ? z11 : true, z11);
                org.telegram.messenger.g0.S3(1.0f, vp0Var.k1, (vp0Var.V1 || vp0Var.U1) ? true : z11, z11);
                TextView textView2 = vp0Var.j1;
                if (!vp0Var.V1 && !vp0Var.U1) {
                    z12 = z11;
                }
                org.telegram.messenger.g0.S3(1.0f, textView2, z12, z11);
                break;
            case 4:
                PhotoViewer photoViewer4 = this.b;
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                if (!photoViewer4.q5.b.R && (i7 = photoViewer4.P4) >= 0 && i7 < photoViewer4.g7.size() && (photoViewer4.g7.get(photoViewer4.P4) instanceof org.telegram.messenger.ef)) {
                    org.telegram.ui.Components.ee0 ee0Var = photoViewer4.q5;
                    hi.q3 q3Var = ee0Var.h;
                    if (q3Var != null) {
                        q3Var.dismiss();
                        ee0Var.h = null;
                    }
                    photoViewer4.q5.b.setLoading(true);
                    Utilities.e.c(new yd0(photoViewer4, efVar, (org.telegram.messenger.ef) photoViewer4.g7.get(photoViewer4.P4), PhotoViewer.v1(), 5));
                    break;
                }
                break;
            case 5:
                PhotoViewer photoViewer5 = this.b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer5.g7.get(photoViewer5.P4);
                if (obj2 instanceof org.telegram.messenger.ef) {
                    ((org.telegram.messenger.ef) obj2).x = num.intValue();
                } else if (obj2 instanceof org.telegram.messenger.hf) {
                    ((org.telegram.messenger.hf) obj2).x = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer5.d.x(photoViewer5.P4)) {
                    photoViewer5.L2();
                }
                photoViewer5.W1.setTimer(num.intValue());
                break;
            case 6:
                PhotoViewer photoViewer6 = this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer6.X7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer6.X7.setTranslationY(photoViewer6.Q0.getTranslationY() - (photoViewer6.V1.getAlpha() * i5.c.d(46.0f, photoViewer6.V1.getEditTextHeight(), 0)));
                }
                photoViewer6.f1.setTranslationY(photoViewer6.V1.getAlpha() * (-i5.c.d(46.0f, num2.intValue(), 0)));
                photoViewer6.g1.setTranslationY(photoViewer6.V1.getAlpha() * (-i5.c.d(46.0f, num2.intValue(), 0)));
                photoViewer6.h1.setTranslationY(photoViewer6.V1.getAlpha() * (-i5.c.d(46.0f, num2.intValue(), 0)));
                hi.j jVar = photoViewer6.V1.N;
                if (jVar != null) {
                    jVar.setTranslationY((-num2.intValue()) - org.telegram.messenger.g0.L(14.0f));
                    break;
                }
                break;
            case 7:
                PhotoViewer photoViewer7 = this.b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer7.g7.get(photoViewer7.P4);
                if (obj3 instanceof org.telegram.messenger.ef) {
                    ((org.telegram.messenger.ef) obj3).x = num3.intValue();
                } else if (obj3 instanceof org.telegram.messenger.hf) {
                    ((org.telegram.messenger.hf) obj3).x = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer7.d.x(photoViewer7.P4)) {
                    photoViewer7.L2();
                }
                photoViewer7.V1.setTimer(num3.intValue());
                break;
            case 8:
                Integer num4 = (Integer) obj;
                hi.j jVar2 = this.b.W1.N;
                if (jVar2 != null) {
                    jVar2.setTranslationY(num4.intValue());
                    break;
                }
                break;
            case 9:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.f9;
                photoViewer8.u0(0, false);
                break;
            default:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.f9;
                photoViewer9.u0(0, false);
                break;
        }
    }
}
