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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class on0 implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ on0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        boolean z10;
        boolean z11;
        int i7;
        int i10 = 9;
        int i11 = 8;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                tg.c2 c2Var = (tg.c2) obj;
                Drawable[] drawableArr = PhotoViewer.Z8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((org.telegram.messenger.ye) photoViewer.g7.get(photoViewer.P4)).i);
                    tg.f2 f2Var = photoViewer.p5;
                    f2Var.M = true;
                    f2Var.F = c2Var;
                    Bitmap n10 = photoViewer.C4.n();
                    int i12 = photoViewer.C4.V;
                    tg.c2 c2Var2 = f2Var.F;
                    photoViewer.C4.v0(c2Var2 == null ? f2Var.J : (isEmpty || n10 == null) ? c2Var2.b() : f2Var.e(n10));
                    photoViewer.t5.setUndoCutState(true);
                    photoViewer.Y2(true, true);
                    photoViewer.t5.post(new hn0(photoViewer, i10));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                if (surfaceTexture == null) {
                    Drawable[] drawableArr2 = PhotoViewer.Z8;
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
                        org.telegram.messenger.g0.h3(new hn0(photoViewer2, 17), 64L);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.lc.F(this.b.f0, true).j();
                break;
            case 3:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.M1.R1 = photoViewer3.L1.c();
                photoViewer3.f0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer3.M1.T1);
                float L = (!(photoViewer3.M1.C0 instanceof tg.n2) || max <= 0) ? 0.0f : ((org.telegram.messenger.g0.q.y - max) - org.telegram.messenger.g0.L(80.0f)) - photoViewer3.M1.getSelectedEntityBottom();
                ValueAnimator valueAnimator = photoViewer3.s7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer3.s7 = null;
                }
                if (photoViewer3.u4 != 3) {
                    L = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer3.Z5, L);
                photoViewer3.s7 = ofFloat;
                ofFloat.addUpdateListener(new gn0(photoViewer3, i10));
                photoViewer3.s7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer3.s7;
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
                valueAnimator2.setInterpolator(nrVar);
                photoViewer3.s7.start();
                AnimatorSet animatorSet = photoViewer3.K1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new gn0(photoViewer3, i11));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer3.K1 = animatorSet2;
                tg.n1 n1Var = photoViewer3.M1.V0;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(n1Var, (Property<tg.n1, Float>) property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer3.M1.M0, (Property<tg.f0, Float>) property, Math.min(0, org.telegram.messenger.g0.L(40.0f) + r15));
                hi.x4 x4Var = photoViewer3.M1.P0;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(x4Var, (Property<hi.x4, Float>) property2, max > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer3.M1.k0, (Property<tg.w0, Float>) property2, max > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer3.M1.l0, (Property<tg.a1, Float>) property2, max > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(nrVar);
                animatorSet2.start();
                vp0 vp0Var = photoViewer3.M1;
                tg.f1 f1Var = vp0Var.e1;
                if (f1Var != null) {
                    if (vp0Var.R1) {
                        f1Var.a(R.drawable.input_smile);
                    } else if (vp0Var.Q1) {
                        f1Var.a(R.drawable.input_keyboard);
                    } else {
                        f1Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = vp0Var.i1;
                if (vp0Var.R1 || vp0Var.Q1) {
                    z10 = false;
                    z11 = false;
                } else {
                    z10 = true;
                    z11 = false;
                }
                org.telegram.messenger.g0.S3(1.0f, textView, z10, z11);
                org.telegram.messenger.g0.S3(1.0f, vp0Var.g1, (vp0Var.R1 || vp0Var.Q1) ? z11 : true, z11);
                org.telegram.messenger.g0.S3(1.0f, vp0Var.k1, (vp0Var.R1 || vp0Var.Q1) ? true : z11, z11);
                TextView textView2 = vp0Var.j1;
                if (!vp0Var.R1 && !vp0Var.Q1) {
                    z12 = z11;
                }
                org.telegram.messenger.g0.S3(1.0f, textView2, z12, z11);
                break;
            case 4:
                PhotoViewer photoViewer4 = this.b;
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                if (!photoViewer4.q5.b.R && (i7 = photoViewer4.P4) >= 0 && i7 < photoViewer4.g7.size() && (photoViewer4.g7.get(photoViewer4.P4) instanceof org.telegram.messenger.ff)) {
                    org.telegram.ui.Components.fe0 fe0Var = photoViewer4.q5;
                    hi.h3 h3Var = fe0Var.h;
                    if (h3Var != null) {
                        h3Var.dismiss();
                        fe0Var.h = null;
                    }
                    photoViewer4.q5.b.setLoading(true);
                    Utilities.e.c(new kg0((org.telegram.messenger.gs) photoViewer4, (Object) ffVar, photoViewer4.g7.get(photoViewer4.P4), PhotoViewer.v1(), 4));
                    break;
                }
                break;
            case 5:
                PhotoViewer photoViewer5 = this.b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer5.g7.get(photoViewer5.P4);
                if (obj2 instanceof org.telegram.messenger.ff) {
                    ((org.telegram.messenger.ff) obj2).x = num.intValue();
                } else if (obj2 instanceof org.telegram.messenger.jf) {
                    ((org.telegram.messenger.jf) obj2).x = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer5.d.x(photoViewer5.P4)) {
                    photoViewer5.K2();
                }
                photoViewer5.W1.setTimer(num.intValue());
                break;
            case 6:
                PhotoViewer photoViewer6 = this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer6.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer6.R7.setTranslationY(photoViewer6.Q0.getTranslationY() - (photoViewer6.V1.getAlpha() * i5.c.d(46.0f, photoViewer6.V1.getEditTextHeight(), 0)));
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
                if (obj3 instanceof org.telegram.messenger.ff) {
                    ((org.telegram.messenger.ff) obj3).x = num3.intValue();
                } else if (obj3 instanceof org.telegram.messenger.jf) {
                    ((org.telegram.messenger.jf) obj3).x = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer7.d.x(photoViewer7.P4)) {
                    photoViewer7.K2();
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
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                photoViewer8.u0(0, false);
                break;
            default:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                photoViewer9.u0(0, false);
                break;
        }
    }
}
