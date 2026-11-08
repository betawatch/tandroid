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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ jn0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        boolean z9;
        boolean z10;
        int i7;
        int i10 = 9;
        int i11 = 8;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                tg.z1 z1Var = (tg.z1) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((org.telegram.messenger.ze) photoViewer.f7.get(photoViewer.O4)).i);
                    tg.c2 c2Var = photoViewer.o5;
                    c2Var.L = true;
                    c2Var.E = z1Var;
                    Bitmap n10 = photoViewer.B4.n();
                    int i12 = photoViewer.B4.U;
                    tg.z1 z1Var2 = c2Var.E;
                    photoViewer.B4.v0(z1Var2 == null ? c2Var.I : (isEmpty || n10 == null) ? z1Var2.b() : c2Var.e(n10));
                    photoViewer.s5.setUndoCutState(true);
                    photoViewer.X2(true, true);
                    photoViewer.s5.post(new cn0(photoViewer, i10));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                if (surfaceTexture == null) {
                    Drawable[] drawableArr2 = PhotoViewer.Y8;
                    break;
                } else {
                    TextureView textureView = photoViewer2.B2;
                    if (textureView != null) {
                        if (photoViewer2.K3) {
                            photoViewer2.F3 = 2;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        photoViewer2.B2.setVisibility(0);
                        photoViewer2.E3 = false;
                        photoViewer2.e0.invalidate();
                        org.telegram.messenger.g0.i3(new cn0(photoViewer2, 17), 64L);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.hc.F(this.b.e0, true).j();
                break;
            case 3:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.L1.Q1 = photoViewer3.K1.c();
                photoViewer3.e0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer3.L1.S1);
                float L = (!(photoViewer3.L1.B0 instanceof tg.k2) || max <= 0) ? 0.0f : ((org.telegram.messenger.g0.q.y - max) - org.telegram.messenger.g0.L(80.0f)) - photoViewer3.L1.getSelectedEntityBottom();
                ValueAnimator valueAnimator = photoViewer3.r7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer3.r7 = null;
                }
                if (photoViewer3.t4 != 3) {
                    L = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer3.Y5, L);
                photoViewer3.r7 = ofFloat;
                ofFloat.addUpdateListener(new bn0(photoViewer3, i10));
                photoViewer3.r7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer3.r7;
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                valueAnimator2.setInterpolator(xqVar);
                photoViewer3.r7.start();
                AnimatorSet animatorSet = photoViewer3.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new bn0(photoViewer3, i11));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer3.J1 = animatorSet2;
                tg.m1 m1Var = photoViewer3.L1.U0;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m1Var, (Property<tg.m1, Float>) property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer3.L1.L0, (Property<tg.e0, Float>) property, Math.min(0, org.telegram.messenger.g0.L(40.0f) + r15));
                fi.a5 a5Var = photoViewer3.L1.O0;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(a5Var, (Property<fi.a5, Float>) property2, max > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer3.L1.j0, (Property<tg.v0, Float>) property2, max > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer3.L1.k0, (Property<tg.z0, Float>) property2, max > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(xqVar);
                animatorSet2.start();
                up0 up0Var = photoViewer3.L1;
                tg.e1 e1Var = up0Var.d1;
                if (e1Var != null) {
                    if (up0Var.Q1) {
                        e1Var.a(R.drawable.input_smile);
                    } else if (up0Var.P1) {
                        e1Var.a(R.drawable.input_keyboard);
                    } else {
                        e1Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = up0Var.h1;
                if (up0Var.Q1 || up0Var.P1) {
                    z9 = false;
                    z10 = false;
                } else {
                    z9 = true;
                    z10 = false;
                }
                org.telegram.messenger.g0.U3(1.0f, textView, z9, z10);
                org.telegram.messenger.g0.U3(1.0f, up0Var.f1, (up0Var.Q1 || up0Var.P1) ? z10 : true, z10);
                org.telegram.messenger.g0.U3(1.0f, up0Var.j1, (up0Var.Q1 || up0Var.P1) ? true : z10, z10);
                TextView textView2 = up0Var.i1;
                if (!up0Var.Q1 && !up0Var.P1) {
                    z11 = z10;
                }
                org.telegram.messenger.g0.U3(1.0f, textView2, z11, z10);
                break;
            case 4:
                PhotoViewer photoViewer4 = this.b;
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                if (!photoViewer4.p5.b.Q && (i7 = photoViewer4.O4) >= 0 && i7 < photoViewer4.f7.size() && (photoViewer4.f7.get(photoViewer4.O4) instanceof org.telegram.messenger.gf)) {
                    org.telegram.ui.Components.ud0 ud0Var = photoViewer4.p5;
                    fi.j3 j3Var = ud0Var.h;
                    if (j3Var != null) {
                        j3Var.dismiss();
                        ud0Var.h = null;
                    }
                    photoViewer4.p5.b.setLoading(true);
                    Utilities.e.c(new org.telegram.ui.Components.kn0(photoViewer4, gfVar, (org.telegram.messenger.gf) photoViewer4.f7.get(photoViewer4.O4), PhotoViewer.v1(), 27));
                    break;
                }
                break;
            case 5:
                PhotoViewer photoViewer5 = this.b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer5.f7.get(photoViewer5.O4);
                if (obj2 instanceof org.telegram.messenger.gf) {
                    ((org.telegram.messenger.gf) obj2).x = num.intValue();
                } else if (obj2 instanceof org.telegram.messenger.kf) {
                    ((org.telegram.messenger.kf) obj2).x = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer5.d.x(photoViewer5.O4)) {
                    photoViewer5.J2();
                }
                photoViewer5.V1.setTimer(num.intValue());
                break;
            case 6:
                PhotoViewer photoViewer6 = this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer6.Q7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer6.Q7.setTranslationY(photoViewer6.P0.getTranslationY() - (photoViewer6.U1.getAlpha() * jg.g.e(46.0f, photoViewer6.U1.getEditTextHeight(), 0)));
                }
                photoViewer6.e1.setTranslationY(photoViewer6.U1.getAlpha() * (-jg.g.e(46.0f, num2.intValue(), 0)));
                photoViewer6.f1.setTranslationY(photoViewer6.U1.getAlpha() * (-jg.g.e(46.0f, num2.intValue(), 0)));
                photoViewer6.g1.setTranslationY(photoViewer6.U1.getAlpha() * (-jg.g.e(46.0f, num2.intValue(), 0)));
                fi.i iVar = photoViewer6.U1.M;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - org.telegram.messenger.g0.L(14.0f));
                    break;
                }
                break;
            case 7:
                PhotoViewer photoViewer7 = this.b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer7.f7.get(photoViewer7.O4);
                if (obj3 instanceof org.telegram.messenger.gf) {
                    ((org.telegram.messenger.gf) obj3).x = num3.intValue();
                } else if (obj3 instanceof org.telegram.messenger.kf) {
                    ((org.telegram.messenger.kf) obj3).x = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer7.d.x(photoViewer7.O4)) {
                    photoViewer7.J2();
                }
                photoViewer7.U1.setTimer(num3.intValue());
                break;
            case 8:
                Integer num4 = (Integer) obj;
                fi.i iVar2 = this.b.V1.M;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    break;
                }
                break;
            case 9:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer8.u0(0, false);
                break;
            default:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.Y8;
                photoViewer9.u0(0, false);
                break;
        }
    }
}
