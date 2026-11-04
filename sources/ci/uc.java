package ci;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b8.kg;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.zk;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cc1;
import org.telegram.ui.fq0;
import org.telegram.ui.ln;
import org.telegram.ui.tw;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.zu;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uc(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = 0;
        switch (this.a) {
            case 0:
                wc wcVar = (wc) this.b;
                vc vcVar = (vc) this.c;
                wcVar.getClass();
                vcVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wcVar.f1();
                break;
            case 1:
                dh.a0 a0Var = (dh.a0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i3 < arrayList.size()) {
                    dh.a0.g((View) arrayList.get(i3), floatValue);
                    i3++;
                }
                a0Var.m.l0.invalidate();
                break;
            case 2:
                ei.q qVar = (ei.q) this.b;
                View view = (View) this.c;
                qVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = 1.0f - floatValue2;
                view.setAlpha(f10);
                view.setTranslationY((-org.telegram.messenger.g0.L(5.0f)) * floatValue2);
                qVar.E.setAlpha(floatValue2);
                qVar.E.setTranslationY(org.telegram.messenger.g0.L(5.0f) * f10);
                break;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                boolean[] zArr = (boolean[]) this.c;
                int i10 = ProfileStoriesView.t0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (az.o() > 0) {
                        org.telegram.messenger.g0.c4(profileStoriesView);
                        org.telegram.messenger.g0.i3(new d1(profileStoriesView, 27), 180L);
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
                mg.g gVar = (mg.g) this.b;
                og.d dVar = (og.d) this.c;
                gVar.getClass();
                dVar.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar.b;
                int size = arrayList2.size();
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    og.d dVar2 = (og.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f = (int) ((dVar2.g / 255.0f) * (255 - dVar.f));
                    }
                }
                gVar.invalidate();
                break;
            case 6:
                mg.g gVar2 = (mg.g) this.b;
                og.b bVar = (og.b) this.c;
                gVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar2.c;
                int size2 = arrayList3.size();
                while (i3 < size2) {
                    Object obj2 = arrayList3.get(i3);
                    i3++;
                    og.b bVar2 = (og.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue4 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue4) * bVar2.e);
                    }
                }
                gVar2.invalidate();
                break;
            case 7:
                mg.n nVar = (mg.n) this.b;
                mg.o oVar = (mg.o) this.c;
                nVar.getClass();
                oVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 8:
                l5.c cVar = (l5.c) this.b;
                l5.b bVar3 = (l5.b) this.c;
                cVar.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                cVar.b = intValue;
                bVar3.e(intValue);
                break;
            case 9:
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) this.b;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.c;
                s0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t0Var.invalidate();
                break;
            case 10:
                wm wmVar = (wm) this.b;
                wm wmVar2 = (wm) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar2.oa = floatValue5;
                wmVar2.fragmentView.invalidate();
                wmVar2.A0.invalidate();
                float f11 = 1.0f - floatValue5;
                float L = org.telegram.messenger.g0.L(8.0f) * f11;
                wmVar.p1.setTranslationY(L);
                wmVar.p1.getAvatarImageView().setTranslationY(-L);
                float f12 = (-org.telegram.messenger.g0.L(8.0f)) * floatValue5;
                wmVar2.p1.setTranslationY(f12);
                wmVar2.p1.getAvatarImageView().setTranslationY(-f12);
                float f13 = (floatValue5 * 0.2f) + 0.8f;
                wmVar.p1.getAvatarImageView().setScaleX(f13);
                wmVar.p1.getAvatarImageView().setScaleY(f13);
                wmVar.p1.getAvatarImageView().setAlpha(floatValue5);
                float f14 = (0.2f * f11) + 0.8f;
                wmVar2.p1.getAvatarImageView().setScaleX(f14);
                wmVar2.p1.getAvatarImageView().setScaleY(f14);
                wmVar2.p1.getAvatarImageView().setAlpha(f11);
                jg jgVar = wmVar2.b1;
                if (jgVar != null) {
                    jgVar.setAlpha(f11);
                    break;
                }
                break;
            case 11:
                ln lnVar = (ln) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                lnVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lnVar.O.setAlpha(floatValue6);
                float f15 = 1.0f - floatValue6;
                lnVar.O.setTranslationY(((-r6.getHeight()) / 2.0f) * f15);
                lnVar.O.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i3 < arrayList4.size()) {
                    ((View) arrayList4.get(i3)).setTranslationY((-lnVar.O.getHeight()) * f15);
                    i3++;
                }
                break;
            case 12:
                org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) this.b;
                org.telegram.ui.Components.k9 k9Var2 = (org.telegram.ui.Components.k9) this.c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k9Var.setScaleX(floatValue7);
                k9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !k9Var2.getImageReceiver().I()) {
                    k9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 13:
                ((org.telegram.ui.Components.ra) this.b).accept(Float.valueOf(((org.telegram.ui.Components.fb) this.c).getTranslationY()));
                break;
            case 14:
                ((zk) this.b).accept(Float.valueOf(((org.telegram.ui.Components.fb) this.c).getTranslationY()));
                break;
            case 15:
                dh dhVar = (dh) this.b;
                xs xsVar = (xs) this.c;
                dhVar.getClass();
                xsVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                bi biVar = dhVar.d0;
                biVar.J1();
                th thVar = biVar.t2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.b2;
                if (thVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.m(biVar.g4);
                    break;
                }
                break;
            case 16:
                b4.n nVar2 = (b4.n) this.b;
                org.telegram.messenger.t tVar = (org.telegram.messenger.t) this.c;
                nVar2.getClass();
                tVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i3 < ((ArrayList) nVar2.d).size()) {
                    if (!dh.d0.b) {
                        ((View) ((ArrayList) nVar2.d).get(i3)).invalidate();
                    }
                    i3++;
                }
                break;
            case 17:
                ew0 ew0Var = (ew0) this.b;
                dw0[] dw0VarArr = (dw0[]) this.c;
                ew0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i3 < dw0VarArr.length) {
                    ew0Var.c[i3] = (ew0Var.d[i3] * floatValue8) + ((1.0f - floatValue8) * ew0Var.e[i3]);
                    i3++;
                }
                ew0Var.invalidate();
                break;
            case 18:
                org.telegram.ui.Components.voip.x xVar = (org.telegram.ui.Components.voip.x) this.b;
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.c;
                xVar.getClass();
                rVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                xVar.invalidate();
                break;
            case 19:
                View view2 = (View) this.b;
                View view3 = (View) this.c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = 1.0f - floatValue9;
                view2.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f16);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-org.telegram.messenger.g0.L(6.0f)) * floatValue9);
                view3.setAlpha(f16);
                break;
            case 20:
                org.telegram.ui.Components.voip.j2 j2Var = (org.telegram.ui.Components.voip.j2) this.b;
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.c;
                x0Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x0Var.c();
                int i11 = x0Var.h;
                if (((i11 >= 0 && i11 <= 2) || (i11 >= 180 && i11 <= 182)) && j2Var.S) {
                    j2Var.R.pause();
                    AnimatorSet animatorSet = j2Var.Q;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.b;
                org.telegram.ui.Components.voip.g2 g2Var = (org.telegram.ui.Components.voip.g2) this.c;
                u2Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (u2Var.c - r3)) + u2Var.e);
                u2Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (u2Var.d - r3)) + u2Var.f);
                g2Var.invalidate();
                break;
            case 22:
                uw.u1(((zu) this.b).M, (tw) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                View view4 = (View) this.c;
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.getClass();
                photoViewer.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view4.invalidateOutline();
                ImageView imageView = photoViewer.y3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                fq0 fq0Var = photoViewer.F2;
                if (fq0Var != null) {
                    fq0Var.invalidateOutline();
                    break;
                }
                break;
            case 24:
                kg kgVar = (kg) this.b;
                int[] iArr = (int[]) this.c;
                kgVar.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i12 = intValue2 - kgVar.b;
                ((tj0) kgVar.d).scrollBy(0, i12);
                iArr[0] = iArr[0] + i12;
                kgVar.b = intValue2;
                break;
            case 25:
                cc1 cc1Var = (cc1) this.b;
                ai aiVar = (ai) this.c;
                cc1Var.getClass();
                cc1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aiVar.invalidate();
                break;
            case 26:
                ((View) ((g.b0) ((bb.c) this.b).b).d.getParent()).invalidate();
                break;
            case 27:
                rg.a aVar = (rg.a) this.b;
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
            default:
                ((u4.k) this.b).P((u4.d1) this.c);
                break;
        }
    }
}
