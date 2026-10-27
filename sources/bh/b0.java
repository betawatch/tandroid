package bh;

import a8.ng;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bi.de;
import bi.ee;
import bi.u6;
import java.util.ArrayList;
import jg.e1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.voip.a3;
import org.telegram.ui.Components.voip.d3;
import org.telegram.ui.Components.voip.p3;
import org.telegram.ui.Components.voip.r1;
import org.telegram.ui.Components.wh;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.yl;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.dy;
import org.telegram.ui.ew;
import org.telegram.ui.ey;
import org.telegram.ui.ju0;
import org.telegram.ui.oo;
import org.telegram.ui.uh1;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList.size()) {
                    i0.g((View) arrayList.get(i10), floatValue);
                    i10++;
                }
                i0Var.m.k0.invalidate();
                break;
            case 1:
                ee eeVar = (ee) this.b;
                de deVar = (de) this.c;
                eeVar.getClass();
                deVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eeVar.f1();
                break;
            case 2:
                di.q qVar = (di.q) this.b;
                View view = (View) this.c;
                qVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue2;
                view.setAlpha(f7);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue2);
                qVar.y.setAlpha(floatValue2);
                qVar.y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                break;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                boolean[] zArr = (boolean[]) this.c;
                int i11 = ProfileStoriesView.s0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new u6(profileStoriesView, 20), 180L);
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
                kg.h hVar = (kg.h) this.b;
                mg.d dVar = (mg.d) this.c;
                hVar.getClass();
                dVar.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = hVar.b;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    mg.d dVar2 = (mg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f = (int) ((dVar2.g / 255.0f) * (255 - dVar.f));
                    }
                }
                hVar.invalidate();
                break;
            case 6:
                kg.h hVar2 = (kg.h) this.b;
                mg.b bVar = (mg.b) this.c;
                hVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = hVar2.c;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    mg.b bVar2 = (mg.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue4 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue4) * bVar2.e);
                    }
                }
                hVar2.invalidate();
                break;
            case 7:
                kg.o oVar = (kg.o) this.b;
                kg.p pVar = (kg.p) this.c;
                oVar.getClass();
                pVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oVar.invalidate();
                break;
            case 8:
                k5.b bVar3 = (k5.b) this.b;
                e1 e1Var = (e1) this.c;
                bVar3.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bVar3.b = intValue;
                e1Var.i(intValue);
                break;
            case 9:
                org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) this.b;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.c;
                u0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v0Var.invalidate();
                break;
            case 10:
                wn wnVar = (wn) this.b;
                wn wnVar2 = (wn) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar2.ka = floatValue5;
                wnVar2.fragmentView.invalidate();
                wnVar2.x0.invalidate();
                float f10 = 1.0f - floatValue5;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                wnVar.m1.setTranslationY(dp);
                wnVar.m1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue5;
                wnVar2.m1.setTranslationY(f11);
                wnVar2.m1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue5 * 0.2f) + 0.8f;
                wnVar.m1.getAvatarImageView().setScaleX(f12);
                wnVar.m1.getAvatarImageView().setScaleY(f12);
                wnVar.m1.getAvatarImageView().setAlpha(floatValue5);
                float f13 = (0.2f * f10) + 0.8f;
                wnVar2.m1.getAvatarImageView().setScaleX(f13);
                wnVar2.m1.getAvatarImageView().setScaleY(f13);
                wnVar2.m1.getAvatarImageView().setAlpha(f10);
                ch chVar = wnVar2.Y0;
                if (chVar != null) {
                    chVar.setAlpha(f10);
                    break;
                }
                break;
            case 11:
                oo ooVar = (oo) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ooVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ooVar.N.setAlpha(floatValue6);
                float f14 = 1.0f - floatValue6;
                ooVar.N.setTranslationY(((-r6.getHeight()) / 2.0f) * f14);
                ooVar.N.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i10 < arrayList4.size()) {
                    ((View) arrayList4.get(i10)).setTranslationY((-ooVar.N.getHeight()) * f14);
                    i10++;
                }
                break;
            case 12:
                y9 y9Var = (y9) this.b;
                y9 y9Var2 = (y9) this.c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.setScaleX(floatValue7);
                y9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !y9Var2.getImageReceiver().hasBitmapImage()) {
                    y9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 13:
                ((gb) this.b).accept(Float.valueOf(((ub) this.c).getTranslationY()));
                break;
            case 14:
                ((yl) this.b).accept(Float.valueOf(((ub) this.c).getTranslationY()));
                break;
            case 15:
                wh whVar = (wh) this.b;
                ju juVar = (ju) this.c;
                whVar.getClass();
                juVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ti tiVar = whVar.c0;
                tiVar.c2();
                li liVar = tiVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.j0;
                if (liVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.l(tiVar.o2);
                    break;
                }
                break;
            case 16:
                c2.b bVar4 = (c2.b) this.b;
                tu tuVar = (tu) this.c;
                bVar4.getClass();
                tuVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) bVar4.d).size()) {
                    if (!m0.b) {
                        ((View) ((ArrayList) bVar4.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                break;
            case 17:
                kz0 kz0Var = (kz0) this.b;
                jz0[] jz0VarArr = (jz0[]) this.c;
                kz0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < jz0VarArr.length) {
                    kz0Var.c[i10] = (kz0Var.d[i10] * floatValue8) + ((1.0f - floatValue8) * kz0Var.e[i10]);
                    i10++;
                }
                kz0Var.invalidate();
                break;
            case 18:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.c;
                l0Var.getClass();
                tVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l0Var.invalidate();
                break;
            case 19:
                View view2 = (View) this.b;
                View view3 = (View) this.c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue9;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue9);
                view3.setAlpha(f15);
                break;
            case 20:
                d3 d3Var = (d3) this.b;
                r1 r1Var = (r1) this.c;
                r1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r1Var.c();
                int i12 = r1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && d3Var.R) {
                    d3Var.Q.pause();
                    AnimatorSet animatorSet = d3Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 21:
                p3 p3Var = (p3) this.b;
                a3 a3Var = (a3) this.c;
                p3Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.c - r3)) + p3Var.e);
                p3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.d - r3)) + p3Var.f);
                a3Var.invalidate();
                break;
            case 22:
                ey.r1(((ew) this.b).M, (dy) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                View view4 = (View) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view4.invalidateOutline();
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                ju0 ju0Var = photoViewer.E2;
                if (ju0Var != null) {
                    ju0Var.invalidateOutline();
                    break;
                }
                break;
            case 24:
                ng ngVar = (ng) this.b;
                int[] iArr = (int[]) this.c;
                ngVar.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i13 = intValue2 - ngVar.b;
                ((nm0) ngVar.d).scrollBy(0, i13);
                iArr[0] = iArr[0] + i13;
                ngVar.b = intValue2;
                break;
            case 25:
                uh1 uh1Var = (uh1) this.b;
                si siVar = (si) this.c;
                uh1Var.getClass();
                uh1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                siVar.invalidate();
                break;
            case 26:
                pg.a aVar = (pg.a) this.b;
                int[] iArr2 = (int[]) this.c;
                aVar.getClass();
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.f(floatValue10, iArr2[0], aVar.h[0]), i0.a.f(floatValue10, iArr2[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.b = linearGradient;
                linearGradient.setLocalMatrix(aVar.c);
                paint.setShader(aVar.b);
                aVar.a.setPaint(paint, 0);
                aVar.g.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[1], aVar.h[1]), -1));
                aVar.f.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                break;
            case 27:
                ((View) ((g.a0) ((a4.l) this.b).b).d.getParent()).invalidate();
                break;
            default:
                ((s4.l) this.b).P((s4.e1) this.c);
                break;
        }
    }
}
