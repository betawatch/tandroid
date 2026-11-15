package ch;

import a8.xa;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import di.kc;
import di.lc;
import fi.c1;
import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.voip.j3;
import org.telegram.ui.Components.voip.m1;
import org.telegram.ui.Components.voip.v2;
import org.telegram.ui.Components.voip.y2;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.an;
import org.telegram.ui.dv;
import org.telegram.ui.hc1;
import org.telegram.ui.nq0;
import org.telegram.ui.qn;
import org.telegram.ui.xw;
import org.telegram.ui.yw;
import tg.q1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = 0;
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i7 < arrayList.size()) {
                    b0.g((View) arrayList.get(i7), floatValue);
                    i7++;
                }
                b0Var.m.l0.invalidate();
                break;
            case 1:
                lc lcVar = (lc) this.b;
                kc kcVar = (kc) this.c;
                lcVar.getClass();
                kcVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcVar.f1();
                break;
            case 2:
                fi.p pVar = (fi.p) this.b;
                View view = (View) this.c;
                pVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = 1.0f - floatValue2;
                view.setAlpha(f10);
                view.setTranslationY((-org.telegram.messenger.g0.L(5.0f)) * floatValue2);
                pVar.E.setAlpha(floatValue2);
                pVar.E.setTranslationY(org.telegram.messenger.g0.L(5.0f) * f10);
                break;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                boolean[] zArr = (boolean[]) this.c;
                int i10 = ProfileStoriesView.t0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (gz.o() > 0) {
                        org.telegram.messenger.g0.b4(profileStoriesView);
                        org.telegram.messenger.g0.i3(new c1(profileStoriesView, 5), 180L);
                    }
                }
                profileStoriesView.a0 = Math.max(1.0f, floatValue3);
                profileStoriesView.invalidate();
                break;
            case 4:
                TextView textView = (TextView) this.b;
                TextView textView2 = (TextView) this.c;
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                textView2.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                lg.g gVar = (lg.g) this.b;
                ng.d dVar = (ng.d) this.c;
                gVar.getClass();
                dVar.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar.b;
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ng.d dVar2 = (ng.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f = (int) ((dVar2.g / 255.0f) * (255 - dVar.f));
                    }
                }
                gVar.invalidate();
                break;
            case 6:
                lg.g gVar2 = (lg.g) this.b;
                ng.b bVar = (ng.b) this.c;
                gVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar2.c;
                int size2 = arrayList3.size();
                while (i7 < size2) {
                    Object obj2 = arrayList3.get(i7);
                    i7++;
                    ng.b bVar2 = (ng.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue4 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue4) * bVar2.e);
                    }
                }
                gVar2.invalidate();
                break;
            case 7:
                lg.n nVar = (lg.n) this.b;
                lg.o oVar = (lg.o) this.c;
                nVar.getClass();
                oVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 8:
                m5.b bVar3 = (m5.b) this.b;
                ki.e eVar = (ki.e) this.c;
                bVar3.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bVar3.b = intValue;
                eVar.d(intValue);
                break;
            case 9:
                an anVar = (an) this.b;
                an anVar2 = (an) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar2.qa = floatValue5;
                anVar2.fragmentView.invalidate();
                anVar2.A0.invalidate();
                float f11 = 1.0f - floatValue5;
                float L = org.telegram.messenger.g0.L(8.0f) * f11;
                anVar.p1.setTranslationY(L);
                anVar.p1.getAvatarImageView().setTranslationY(-L);
                float f12 = (-org.telegram.messenger.g0.L(8.0f)) * floatValue5;
                anVar2.p1.setTranslationY(f12);
                anVar2.p1.getAvatarImageView().setTranslationY(-f12);
                float f13 = (floatValue5 * 0.2f) + 0.8f;
                anVar.p1.getAvatarImageView().setScaleX(f13);
                anVar.p1.getAvatarImageView().setScaleY(f13);
                anVar.p1.getAvatarImageView().setAlpha(floatValue5);
                float f14 = (0.2f * f11) + 0.8f;
                anVar2.p1.getAvatarImageView().setScaleX(f14);
                anVar2.p1.getAvatarImageView().setScaleY(f14);
                anVar2.p1.getAvatarImageView().setAlpha(f11);
                rg rgVar = anVar2.b1;
                if (rgVar != null) {
                    rgVar.setAlpha(f11);
                    break;
                }
                break;
            case 10:
                qn qnVar = (qn) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                qnVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar.O.setAlpha(floatValue6);
                float f15 = 1.0f - floatValue6;
                qnVar.O.setTranslationY(((-r6.getHeight()) / 2.0f) * f15);
                qnVar.O.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i7 < arrayList4.size()) {
                    ((View) arrayList4.get(i7)).setTranslationY((-qnVar.O.getHeight()) * f15);
                    i7++;
                }
                break;
            case 11:
                i9 i9Var = (i9) this.b;
                i9 i9Var2 = (i9) this.c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9Var.setScaleX(floatValue7);
                i9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !i9Var2.getImageReceiver().I()) {
                    i9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 12:
                ((oa) this.b).accept(Float.valueOf(((cb) this.c).getTranslationY()));
                break;
            case 13:
                ((il) this.b).accept(Float.valueOf(((cb) this.c).getTranslationY()));
                break;
            case 14:
                nh nhVar = (nh) this.b;
                ft ftVar = (ft) this.c;
                nhVar.getClass();
                ftVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ki kiVar = nhVar.d0;
                kiVar.J1();
                ci ciVar = kiVar.w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.e2;
                if (ciVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.m(kiVar.j4);
                    break;
                }
                break;
            case 15:
                ab.q qVar = (ab.q) this.b;
                org.telegram.messenger.t tVar = (org.telegram.messenger.t) this.c;
                qVar.getClass();
                tVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i7 < ((ArrayList) qVar.d).size()) {
                    if (!f0.b) {
                        ((View) ((ArrayList) qVar.d).get(i7)).invalidate();
                    }
                    i7++;
                }
                break;
            case 16:
                iw0 iw0Var = (iw0) this.b;
                hw0[] hw0VarArr = (hw0[]) this.c;
                iw0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i7 < hw0VarArr.length) {
                    iw0Var.c[i7] = (iw0Var.d[i7] * floatValue8) + ((1.0f - floatValue8) * iw0Var.e[i7]);
                    i7++;
                }
                iw0Var.invalidate();
                break;
            case 17:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) this.c;
                l0Var.getClass();
                zVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l0Var.invalidate();
                break;
            case 18:
                View view2 = (View) this.b;
                View view3 = (View) this.c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = 1.0f - floatValue9;
                view2.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f16);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-org.telegram.messenger.g0.L(6.0f)) * floatValue9);
                view3.setAlpha(f16);
                break;
            case 19:
                y2 y2Var = (y2) this.b;
                m1 m1Var = (m1) this.c;
                m1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m1Var.c();
                int i11 = m1Var.h;
                if (((i11 >= 0 && i11 <= 2) || (i11 >= 180 && i11 <= 182)) && y2Var.S) {
                    y2Var.R.pause();
                    AnimatorSet animatorSet = y2Var.Q;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 20:
                j3 j3Var = (j3) this.b;
                v2 v2Var = (v2) this.c;
                j3Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (j3Var.c - r3)) + j3Var.e);
                j3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (j3Var.d - r3)) + j3Var.f);
                v2Var.invalidate();
                break;
            case 21:
                yw.u1(((dv) this.b).M, (xw) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                View view4 = (View) this.c;
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view4.invalidateOutline();
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                nq0 nq0Var = photoViewer.F2;
                if (nq0Var != null) {
                    nq0Var.invalidateOutline();
                    break;
                }
                break;
            case 23:
                xa xaVar = (xa) this.b;
                int[] iArr = (int[]) this.c;
                xaVar.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i12 = intValue2 - xaVar.b;
                ((uj0) xaVar.d).scrollBy(0, i12);
                iArr[0] = iArr[0] + i12;
                xaVar.b = intValue2;
                break;
            case 24:
                hc1 hc1Var = (hc1) this.b;
                ji jiVar = (ji) this.c;
                hc1Var.getClass();
                hc1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jiVar.invalidate();
                break;
            case 25:
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) this.b;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.c;
                s0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t0Var.invalidate();
                break;
            case 26:
                qg.a aVar = (qg.a) this.b;
                int[] iArr2 = (int[]) this.c;
                aVar.getClass();
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.f(floatValue10, iArr2[0], aVar.h[0]), i0.a.f(floatValue10, iArr2[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.b = linearGradient;
                linearGradient.setLocalMatrix(aVar.c);
                paint.setShader(aVar.b);
                aVar.a.r.put(0, paint);
                aVar.g.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[1], aVar.h[1]), -1));
                aVar.f.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                break;
            case 27:
                ((View) ((g.b0) ((ob.c) this.b).b).d.getParent()).invalidate();
                break;
            default:
                q1 q1Var = (q1) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                q1Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 >= 0.5f) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        q1Var.s0.b(q1Var.z0, false);
                    }
                    float f17 = (floatValue11 - 0.5f) / 0.5f;
                    q1Var.setRotationY((1.0f - f17) * (-90.0f));
                    q1Var.A0 = (f17 * 0.3f) + 0.7f;
                    q1Var.invalidate();
                    break;
                } else {
                    float f18 = floatValue11 / 0.5f;
                    q1Var.setRotationY(90.0f * f18);
                    q1Var.A0 = ((1.0f - f18) * 0.3f) + 0.7f;
                    q1Var.invalidate();
                    break;
                }
        }
    }
}
