package gg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.voip.c3;
import org.telegram.ui.Components.voip.o3;
import org.telegram.ui.Components.voip.z2;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cj1;
import org.telegram.ui.e31;
import org.telegram.ui.eo;
import org.telegram.ui.k31;
import org.telegram.ui.vu0;
import org.telegram.ui.vy;
import org.telegram.ui.wy;
import org.telegram.ui.yo;
import org.telegram.ui.zw;
import xh.s8;
import xh.t8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                TextView textView = (TextView) this.b;
                TextView textView2 = (TextView) this.c;
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                textView2.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                hg.g gVar = (hg.g) this.b;
                jg.d dVar = (jg.d) this.c;
                gVar.getClass();
                dVar.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = gVar.b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    jg.d dVar2 = (jg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f = (int) ((dVar2.g / 255.0f) * (255 - dVar.f));
                    }
                }
                gVar.invalidate();
                break;
            case 2:
                hg.g gVar2 = (hg.g) this.b;
                jg.b bVar = (jg.b) this.c;
                gVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar2.c;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    jg.b bVar2 = (jg.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue) * bVar2.e);
                    }
                }
                gVar2.invalidate();
                break;
            case 3:
                hg.n nVar = (hg.n) this.b;
                hg.o oVar = (hg.o) this.c;
                nVar.getClass();
                oVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 4:
                hi.c0 c0Var = (hi.c0) this.b;
                a1.c cVar = (a1.c) this.c;
                c0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                c0Var.a = intValue;
                cVar.g(intValue);
                break;
            case 5:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.b;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.c;
                v0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w0Var.invalidate();
                break;
            case 6:
                mg.a aVar = (mg.a) this.b;
                int[] iArr = (int[]) this.c;
                aVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue2, iArr[0], aVar.h[0]), i0.a.d(floatValue2, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.b = linearGradient;
                linearGradient.setLocalMatrix(aVar.c);
                paint.setShader(aVar.b);
                aVar.a.setPaint(paint, 0);
                aVar.g.setColor(i0.a.d(0.1f, i0.a.d(floatValue2, iArr[1], aVar.h[1]), -1));
                aVar.f.setColor(i0.a.d(0.1f, i0.a.d(floatValue2, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                break;
            case 7:
                eo eoVar = (eo) this.b;
                eo eoVar2 = (eo) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar2.U9 = floatValue3;
                eoVar2.fragmentView.invalidate();
                eoVar2.x0.invalidate();
                float f7 = 1.0f - floatValue3;
                float dp = AndroidUtilities.dp(8.0f) * f7;
                eoVar.a1.setTranslationY(dp);
                eoVar.a1.getAvatarImageView().setTranslationY(-dp);
                float f10 = (-AndroidUtilities.dp(8.0f)) * floatValue3;
                eoVar2.a1.setTranslationY(f10);
                eoVar2.a1.getAvatarImageView().setTranslationY(-f10);
                float f11 = (floatValue3 * 0.2f) + 0.8f;
                eoVar.a1.getAvatarImageView().setScaleX(f11);
                eoVar.a1.getAvatarImageView().setScaleY(f11);
                eoVar.a1.getAvatarImageView().setAlpha(floatValue3);
                float f12 = (0.2f * f7) + 0.8f;
                eoVar2.a1.getAvatarImageView().setScaleX(f12);
                eoVar2.a1.getAvatarImageView().setScaleY(f12);
                eoVar2.a1.getAvatarImageView().setAlpha(f7);
                fh fhVar = eoVar2.M0;
                if (fhVar != null) {
                    fhVar.setAlpha(f7);
                    break;
                }
                break;
            case 8:
                yo yoVar = (yo) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                yoVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yoVar.N.setAlpha(floatValue4);
                float f13 = 1.0f - floatValue4;
                yoVar.N.setTranslationY(((-r6.getHeight()) / 2.0f) * f13);
                yoVar.N.setScaleY((floatValue4 * 0.8f) + 0.2f);
                while (i10 < arrayList3.size()) {
                    ((View) arrayList3.get(i10)).setTranslationY((-yoVar.N.getHeight()) * f13);
                    i10++;
                }
                break;
            case 9:
                w9 w9Var = (w9) this.b;
                w9 w9Var2 = (w9) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue5);
                w9Var.setScaleY(floatValue5);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !w9Var2.getImageReceiver().hasBitmapImage()) {
                    w9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 10:
                ((fb) this.b).accept(Float.valueOf(((tb) this.c).getTranslationY()));
                break;
            case 11:
                ((rl) this.b).accept(Float.valueOf(((tb) this.c).getTranslationY()));
                break;
            case 12:
                di diVar = (di) this.b;
                fu fuVar = (fu) this.c;
                diVar.getClass();
                fuVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                yi yiVar = diVar.c0;
                yiVar.U1();
                qi qiVar = yiVar.y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.j0;
                if (qiVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(yiVar.l2);
                    break;
                }
                break;
            case 13:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.b;
                pu puVar = (pu) this.c;
                mVar.getClass();
                puVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!yg.f0.b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                break;
            case 14:
                py0 py0Var = (py0) this.b;
                oy0[] oy0VarArr = (oy0[]) this.c;
                py0Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < oy0VarArr.length) {
                    py0Var.c[i10] = (py0Var.d[i10] * floatValue6) + ((1.0f - floatValue6) * py0Var.e[i10]);
                    i10++;
                }
                py0Var.invalidate();
                break;
            case 15:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.b;
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.c;
                m0Var.getClass();
                tVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m0Var.invalidate();
                break;
            case 16:
                View view = (View) this.b;
                View view2 = (View) this.c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f14 = 1.0f - floatValue7;
                view.setTranslationY(AndroidUtilities.dp(8.0f) * f14);
                view.setAlpha(floatValue7);
                view2.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue7);
                view2.setAlpha(f14);
                break;
            case 17:
                c3 c3Var = (c3) this.b;
                org.telegram.ui.Components.voip.p1 p1Var = (org.telegram.ui.Components.voip.p1) this.c;
                p1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p1Var.c();
                int i11 = p1Var.h;
                if (((i11 >= 0 && i11 <= 2) || (i11 >= 180 && i11 <= 182)) && c3Var.R) {
                    c3Var.Q.pause();
                    AnimatorSet animatorSet = c3Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 18:
                o3 o3Var = (o3) this.b;
                z2 z2Var = (z2) this.c;
                o3Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.c - r3)) + o3Var.e);
                o3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.d - r3)) + o3Var.f);
                z2Var.invalidate();
                break;
            case 19:
                wy.q1(((zw) this.b).M, (vy) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                View view3 = (View) this.c;
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view3.invalidateOutline();
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                vu0 vu0Var = photoViewer.E2;
                if (vu0Var != null) {
                    vu0Var.invalidateOutline();
                    break;
                }
                break;
            case 21:
                k31 k31Var = (k31) this.b;
                int[] iArr2 = (int[]) this.c;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lc0 lc0Var = k31Var.n;
                if (lc0Var != null) {
                    lc0Var.K = 1.0f;
                    lc0Var.i();
                    k31Var.n.s(1.0f - floatValue8);
                }
                lc0 lc0Var2 = k31Var.h;
                lc0Var2.K = floatValue8;
                lc0Var2.i();
                k31Var.h.s(floatValue8);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue8, k31Var.e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue8, k31Var.e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue8, k31Var.e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue8, k31Var.e[3], iArr2[3]);
                    e31 e31Var = k31Var.E;
                    e31Var.a.n(d, d10, d11, d12);
                    e31Var.invalidate();
                }
                k31Var.w.invalidate();
                break;
            case 22:
                a5.a aVar2 = (a5.a) this.b;
                int[] iArr3 = (int[]) this.c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i12 = intValue2 - aVar2.b;
                ((vl0) aVar2.d).scrollBy(0, i12);
                iArr3[0] = iArr3[0] + i12;
                aVar2.b = intValue2;
                break;
            case 23:
                cj1 cj1Var = (cj1) this.b;
                xi xiVar = (xi) this.c;
                cj1Var.getClass();
                cj1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xiVar.invalidate();
                break;
            case 24:
                pg.a2 a2Var = (pg.a2) this.b;
                boolean[] zArr = (boolean[]) this.c;
                a2Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue9 >= 0.5f) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        a2Var.r0.b(a2Var.y0, false);
                    }
                    float f15 = (floatValue9 - 0.5f) / 0.5f;
                    a2Var.setRotationY((1.0f - f15) * (-90.0f));
                    a2Var.z0 = (f15 * 0.3f) + 0.7f;
                    a2Var.invalidate();
                    break;
                } else {
                    float f16 = floatValue9 / 0.5f;
                    a2Var.setRotationY(90.0f * f16);
                    a2Var.z0 = ((1.0f - f16) * 0.3f) + 0.7f;
                    a2Var.invalidate();
                    break;
                }
            case 25:
                vv0 vv0Var = (vv0) this.b;
                Drawable drawable = (Drawable) this.c;
                vv0Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view4 = ((qg.m1) vv0Var.c).A0;
                if (!(view4 instanceof org.telegram.ui.Cells.t1)) {
                    view4.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.Cells.t1) view4).a3();
                    break;
                }
            case 26:
                ((s4.j) this.b).P((s4.c1) this.c);
                break;
            case 27:
                t8 t8Var = (t8) this.b;
                s8 s8Var = (s8) this.c;
                t8Var.getClass();
                s8Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t8Var.a1();
                break;
            default:
                yg.c0 c0Var2 = (yg.c0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList4.size()) {
                    yg.c0.g((View) arrayList4.get(i10), floatValue10);
                    i10++;
                }
                c0Var2.m.k0.invalidate();
                break;
        }
    }
}
