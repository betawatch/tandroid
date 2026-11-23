package ch;

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
import kg.x1;
import org.telegram.messenger.cz;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.voip.i3;
import org.telegram.ui.Components.voip.l1;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xh;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.cx;
import org.telegram.ui.gv;
import org.telegram.ui.kc1;
import org.telegram.ui.pq0;
import org.telegram.ui.rn;
import tg.s1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                    if (cz.o() > 0) {
                        org.telegram.messenger.g0.a4(profileStoriesView);
                        org.telegram.messenger.g0.h3(new f2.a(profileStoriesView, 9), 180L);
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
                x1 x1Var = (x1) this.c;
                bVar3.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bVar3.b = intValue;
                x1Var.c(intValue);
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
                ch chVar = bnVar2.b1;
                if (chVar != null) {
                    chVar.setAlpha(f11);
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
                q9 q9Var = (q9) this.b;
                q9 q9Var2 = (q9) this.c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9Var.setScaleX(floatValue7);
                q9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !q9Var2.getImageReceiver().I()) {
                    q9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 12:
                ((xa) this.b).accept(Float.valueOf(((lb) this.c).getTranslationY()));
                break;
            case 13:
                ((rl) this.b).accept(Float.valueOf(((lb) this.c).getTranslationY()));
                break;
            case 14:
                xh xhVar = (xh) this.b;
                ot otVar = (ot) this.c;
                xhVar.getClass();
                otVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ui uiVar = xhVar.d0;
                uiVar.K1();
                mi miVar = uiVar.w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar.e2;
                if (miVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.m(uiVar.j4);
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
                rw0 rw0Var = (rw0) this.b;
                qw0[] qw0VarArr = (qw0[]) this.c;
                rw0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i7 < qw0VarArr.length) {
                    rw0Var.c[i7] = (rw0Var.d[i7] * floatValue8) + ((1.0f - floatValue8) * rw0Var.e[i7]);
                    i7++;
                }
                rw0Var.invalidate();
                break;
            case 17:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.b;
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.c;
                k0Var.getClass();
                yVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                k0Var.invalidate();
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
                x2 x2Var = (x2) this.b;
                l1 l1Var = (l1) this.c;
                l1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                l1Var.c();
                int i11 = l1Var.h;
                if (((i11 >= 0 && i11 <= 2) || (i11 >= 180 && i11 <= 182)) && x2Var.S) {
                    x2Var.R.pause();
                    AnimatorSet animatorSet = x2Var.Q;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 20:
                i3 i3Var = (i3) this.b;
                u2 u2Var = (u2) this.c;
                i3Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (i3Var.c - r3)) + i3Var.e);
                i3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (i3Var.d - r3)) + i3Var.f);
                u2Var.invalidate();
                break;
            case 21:
                cx.v1(((gv) this.b).M, (bx) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                pq0 pq0Var = photoViewer.F2;
                if (pq0Var != null) {
                    pq0Var.invalidateOutline();
                    break;
                }
                break;
            case 23:
                a8.xa xaVar = (a8.xa) this.b;
                int[] iArr = (int[]) this.c;
                xaVar.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i12 = intValue2 - xaVar.b;
                ((ek0) xaVar.d).scrollBy(0, i12);
                iArr[0] = iArr[0] + i12;
                xaVar.b = intValue2;
                break;
            case 24:
                kc1 kc1Var = (kc1) this.b;
                ti tiVar = (ti) this.c;
                kc1Var.getClass();
                kc1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tiVar.invalidate();
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
                s1 s1Var = (s1) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                s1Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 >= 0.5f) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        s1Var.s0.b(s1Var.z0, false);
                    }
                    float f17 = (floatValue11 - 0.5f) / 0.5f;
                    s1Var.setRotationY((1.0f - f17) * (-90.0f));
                    s1Var.A0 = (f17 * 0.3f) + 0.7f;
                    s1Var.invalidate();
                    break;
                } else {
                    float f18 = floatValue11 / 0.5f;
                    s1Var.setRotationY(90.0f * f18);
                    s1Var.A0 = ((1.0f - f18) * 0.3f) + 0.7f;
                    s1Var.invalidate();
                    break;
                }
        }
    }
}
