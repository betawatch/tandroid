package bi;

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
import org.telegram.messenger.iz;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.ys;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cn;
import org.telegram.ui.fv;
import org.telegram.ui.mc1;
import org.telegram.ui.rn;
import org.telegram.ui.rq0;
import org.telegram.ui.yw;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class de implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ de(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = 0;
        switch (this.a) {
            case 0:
                fe feVar = (fe) this.b;
                ee eeVar = (ee) this.c;
                feVar.getClass();
                eeVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                feVar.f1();
                break;
            case 1:
                ch.b0 b0Var = (ch.b0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i7 < arrayList.size()) {
                    ch.b0.g((View) arrayList.get(i7), floatValue);
                    i7++;
                }
                b0Var.m.k0.invalidate();
                break;
            case 2:
                di.p pVar = (di.p) this.b;
                View view = (View) this.c;
                pVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = 1.0f - floatValue2;
                view.setAlpha(f10);
                view.setTranslationY((-org.telegram.messenger.g0.L(5.0f)) * floatValue2);
                pVar.D.setAlpha(floatValue2);
                pVar.D.setTranslationY(org.telegram.messenger.g0.L(5.0f) * f10);
                break;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                boolean[] zArr = (boolean[]) this.c;
                int i10 = ProfileStoriesView.s0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (iz.o() > 0) {
                        org.telegram.messenger.g0.c4(profileStoriesView);
                        org.telegram.messenger.g0.i3(new ab(profileStoriesView, 21), 180L);
                    }
                }
                profileStoriesView.W = Math.max(1.0f, floatValue3);
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
                li.z zVar = (li.z) this.b;
                l2.x xVar = (l2.x) this.c;
                zVar.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                zVar.a = intValue;
                xVar.d(intValue);
                break;
            case 9:
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) this.b;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.c;
                s0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t0Var.invalidate();
                break;
            case 10:
                cn cnVar = (cn) this.b;
                cn cnVar2 = (cn) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar2.pa = floatValue5;
                cnVar2.fragmentView.invalidate();
                cnVar2.z0.invalidate();
                float f11 = 1.0f - floatValue5;
                float L = org.telegram.messenger.g0.L(8.0f) * f11;
                cnVar.o1.setTranslationY(L);
                cnVar.o1.getAvatarImageView().setTranslationY(-L);
                float f12 = (-org.telegram.messenger.g0.L(8.0f)) * floatValue5;
                cnVar2.o1.setTranslationY(f12);
                cnVar2.o1.getAvatarImageView().setTranslationY(-f12);
                float f13 = (floatValue5 * 0.2f) + 0.8f;
                cnVar.o1.getAvatarImageView().setScaleX(f13);
                cnVar.o1.getAvatarImageView().setScaleY(f13);
                cnVar.o1.getAvatarImageView().setAlpha(floatValue5);
                float f14 = (0.2f * f11) + 0.8f;
                cnVar2.o1.getAvatarImageView().setScaleX(f14);
                cnVar2.o1.getAvatarImageView().setScaleY(f14);
                cnVar2.o1.getAvatarImageView().setAlpha(f11);
                kg kgVar = cnVar2.a1;
                if (kgVar != null) {
                    kgVar.setAlpha(f11);
                    break;
                }
                break;
            case 11:
                rn rnVar = (rn) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                rnVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar.N.setAlpha(floatValue6);
                float f15 = 1.0f - floatValue6;
                rnVar.N.setTranslationY(((-r6.getHeight()) / 2.0f) * f15);
                rnVar.N.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i7 < arrayList4.size()) {
                    ((View) arrayList4.get(i7)).setTranslationY((-rnVar.N.getHeight()) * f15);
                    i7++;
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
                ((al) this.b).accept(Float.valueOf(((org.telegram.ui.Components.fb) this.c).getTranslationY()));
                break;
            case 15:
                fh fhVar = (fh) this.b;
                ys ysVar = (ys) this.c;
                fhVar.getClass();
                ysVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ci ciVar = fhVar.c0;
                ciVar.J1();
                uh uhVar = ciVar.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar.d2;
                if (uhVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.m(ciVar.i4);
                    break;
                }
                break;
            case 16:
                ab.q qVar = (ab.q) this.b;
                org.telegram.messenger.t tVar = (org.telegram.messenger.t) this.c;
                qVar.getClass();
                tVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i7 < ((ArrayList) qVar.d).size()) {
                    if (!ch.e0.b) {
                        ((View) ((ArrayList) qVar.d).get(i7)).invalidate();
                    }
                    i7++;
                }
                break;
            case 17:
                fw0 fw0Var = (fw0) this.b;
                ew0[] ew0VarArr = (ew0[]) this.c;
                fw0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i7 < ew0VarArr.length) {
                    fw0Var.c[i7] = (fw0Var.d[i7] * floatValue8) + ((1.0f - floatValue8) * fw0Var.e[i7]);
                    i7++;
                }
                fw0Var.invalidate();
                break;
            case 18:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.b;
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.c;
                k0Var.getClass();
                yVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                k0Var.invalidate();
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
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.b;
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.c;
                i1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i1Var.c();
                int i11 = i1Var.h;
                if (((i11 >= 0 && i11 <= 2) || (i11 >= 180 && i11 <= 182)) && u2Var.R) {
                    u2Var.Q.pause();
                    AnimatorSet animatorSet = u2Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.Components.voip.f3 f3Var = (org.telegram.ui.Components.voip.f3) this.b;
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.c;
                f3Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (f3Var.c - r3)) + f3Var.e);
                f3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (f3Var.d - r3)) + f3Var.f);
                r2Var.invalidate();
                break;
            case 22:
                zw.u1(((fv) this.b).M, (yw) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                View view4 = (View) this.c;
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view4.invalidateOutline();
                ImageView imageView = photoViewer.w3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                rq0 rq0Var = photoViewer.E2;
                if (rq0Var != null) {
                    rq0Var.invalidateOutline();
                    break;
                }
                break;
            case 24:
                a8.wa waVar = (a8.wa) this.b;
                int[] iArr = (int[]) this.c;
                waVar.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i12 = intValue2 - waVar.b;
                ((pj0) waVar.d).scrollBy(0, i12);
                iArr[0] = iArr[0] + i12;
                waVar.b = intValue2;
                break;
            case 25:
                mc1 mc1Var = (mc1) this.b;
                bi biVar = (bi) this.c;
                mc1Var.getClass();
                mc1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                biVar.invalidate();
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
                ((View) ((g.b0) ((aa.n) this.b).b).d.getParent()).invalidate();
                break;
            default:
                tg.q1 q1Var = (tg.q1) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                q1Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 >= 0.5f) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        q1Var.r0.b(q1Var.y0, false);
                    }
                    float f17 = (floatValue11 - 0.5f) / 0.5f;
                    q1Var.setRotationY((1.0f - f17) * (-90.0f));
                    q1Var.z0 = (f17 * 0.3f) + 0.7f;
                    q1Var.invalidate();
                    break;
                } else {
                    float f18 = floatValue11 / 0.5f;
                    q1Var.setRotationY(90.0f * f18);
                    q1Var.z0 = ((1.0f - f18) * 0.3f) + 0.7f;
                    q1Var.invalidate();
                    break;
                }
        }
    }
}
