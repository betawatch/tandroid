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
import di.nc;
import di.oc;
import java.util.ArrayList;
import kg.f1;
import org.telegram.messenger.bz;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.voip.j3;
import org.telegram.ui.Components.voip.m1;
import org.telegram.ui.Components.voip.v2;
import org.telegram.ui.Components.voip.y2;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.wh;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.ax;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.fv;
import org.telegram.ui.ic1;
import org.telegram.ui.pq0;
import org.telegram.ui.rn;
import tg.v1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w(int i7, Object obj, Object obj2) {
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
                oc ocVar = (oc) this.b;
                nc ncVar = (nc) this.c;
                ocVar.getClass();
                ncVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ocVar.f1();
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
                    if (bz.o() > 0) {
                        org.telegram.messenger.g0.a4(profileStoriesView);
                        org.telegram.messenger.g0.h3(new f2.a(profileStoriesView, 8), 180L);
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
                f1 f1Var = (f1) this.c;
                bVar3.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bVar3.b = intValue;
                f1Var.c(intValue);
                break;
            case 9:
                bn bnVar = (bn) this.b;
                bn bnVar2 = (bn) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.ra = floatValue5;
                bnVar2.fragmentView.invalidate();
                bnVar2.A0.invalidate();
                float f11 = 1.0f - floatValue5;
                float L = org.telegram.messenger.g0.L(8.0f) * f11;
                bnVar.p1.setTranslationY(L);
                bnVar.p1.getAvatarImageView().setTranslationY(-L);
                float f12 = (-org.telegram.messenger.g0.L(8.0f)) * floatValue5;
                bnVar2.p1.setTranslationY(f12);
                bnVar2.p1.getAvatarImageView().setTranslationY(-f12);
                float f13 = (floatValue5 * 0.2f) + 0.8f;
                bnVar.p1.getAvatarImageView().setScaleX(f13);
                bnVar.p1.getAvatarImageView().setScaleY(f13);
                bnVar.p1.getAvatarImageView().setAlpha(floatValue5);
                float f14 = (0.2f * f11) + 0.8f;
                bnVar2.p1.getAvatarImageView().setScaleX(f14);
                bnVar2.p1.getAvatarImageView().setScaleY(f14);
                bnVar2.p1.getAvatarImageView().setAlpha(f11);
                bh bhVar = bnVar2.b1;
                if (bhVar != null) {
                    bhVar.setAlpha(f11);
                    break;
                }
                break;
            case 10:
                rn rnVar = (rn) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                rnVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar.O.setAlpha(floatValue6);
                float f15 = 1.0f - floatValue6;
                rnVar.O.setTranslationY(((-r6.getHeight()) / 2.0f) * f15);
                rnVar.O.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i7 < arrayList4.size()) {
                    ((View) arrayList4.get(i7)).setTranslationY((-rnVar.O.getHeight()) * f15);
                    i7++;
                }
                break;
            case 11:
                p9 p9Var = (p9) this.b;
                p9 p9Var2 = (p9) this.c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9Var.setScaleX(floatValue7);
                p9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !p9Var2.getImageReceiver().J()) {
                    p9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 12:
                ((wa) this.b).accept(Float.valueOf(((kb) this.c).getTranslationY()));
                break;
            case 13:
                ((pl) this.b).accept(Float.valueOf(((kb) this.c).getTranslationY()));
                break;
            case 14:
                wh whVar = (wh) this.b;
                mt mtVar = (mt) this.c;
                whVar.getClass();
                mtVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ti tiVar = whVar.d0;
                tiVar.K1();
                li liVar = tiVar.w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.e2;
                if (liVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.m(tiVar.j4);
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
                qw0 qw0Var = (qw0) this.b;
                pw0[] pw0VarArr = (pw0[]) this.c;
                qw0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i7 < pw0VarArr.length) {
                    qw0Var.c[i7] = (qw0Var.d[i7] * floatValue8) + ((1.0f - floatValue8) * qw0Var.e[i7]);
                    i7++;
                }
                qw0Var.invalidate();
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
                bx.v1(((fv) this.b).M, (ax) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                View view4 = (View) this.c;
                Drawable[] drawableArr = PhotoViewer.f9;
                photoViewer.getClass();
                photoViewer.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view4.invalidateOutline();
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                pq0 pq0Var = photoViewer.F2;
                if (pq0Var != null) {
                    pq0Var.invalidateOutline();
                    break;
                }
                break;
            case 23:
                xa xaVar = (xa) this.b;
                int[] iArr = (int[]) this.c;
                xaVar.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i12 = intValue2 - xaVar.b;
                ((ek0) xaVar.d).scrollBy(0, i12);
                iArr[0] = iArr[0] + i12;
                xaVar.b = intValue2;
                break;
            case 24:
                ic1 ic1Var = (ic1) this.b;
                si siVar = (si) this.c;
                ic1Var.getClass();
                ic1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                siVar.invalidate();
                break;
            case 25:
                u0 u0Var = (u0) this.b;
                v0 v0Var = (v0) this.c;
                u0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v0Var.invalidate();
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
                ((View) ((g.b0) ((cb.c) this.b).b).d.getParent()).invalidate();
                break;
            default:
                v1 v1Var = (v1) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                v1Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 >= 0.5f) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        v1Var.t0.b(v1Var.A0, false);
                    }
                    float f17 = (floatValue11 - 0.5f) / 0.5f;
                    v1Var.setRotationY((1.0f - f17) * (-90.0f));
                    v1Var.B0 = (f17 * 0.3f) + 0.7f;
                    v1Var.invalidate();
                    break;
                } else {
                    float f18 = floatValue11 / 0.5f;
                    v1Var.setRotationY(90.0f * f18);
                    v1Var.B0 = ((1.0f - f18) * 0.3f) + 0.7f;
                    v1Var.invalidate();
                    break;
                }
        }
    }
}
