package ai;

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
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bo;
import org.telegram.ui.f31;
import org.telegram.ui.ty;
import org.telegram.ui.uu0;
import org.telegram.ui.uy;
import org.telegram.ui.wo;
import org.telegram.ui.xi1;
import org.telegram.ui.xw;
import org.telegram.ui.z21;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.b;
                View view = (View) this.c;
                a0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue;
                view.setAlpha(f7);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue);
                a0Var.y.setAlpha(floatValue);
                a0Var.y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                break;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                boolean[] zArr = (boolean[]) this.c;
                int i11 = ProfileStoriesView.s0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue2 > 0.2f) {
                    zArr[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new a3.d(profileStoriesView, 9), 180L);
                    }
                }
                profileStoriesView.W = Math.max(1.0f, floatValue2);
                profileStoriesView.invalidate();
                break;
            case 2:
                TextView textView = (TextView) this.b;
                TextView textView2 = (TextView) this.c;
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                textView2.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                ig.g gVar = (ig.g) this.b;
                kg.d dVar = (kg.d) this.c;
                gVar.getClass();
                dVar.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = gVar.b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    kg.d dVar2 = (kg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f = (int) ((dVar2.g / 255.0f) * (255 - dVar.f));
                    }
                }
                gVar.invalidate();
                break;
            case 4:
                ig.g gVar2 = (ig.g) this.b;
                kg.b bVar = (kg.b) this.c;
                gVar2.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar2.c;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    kg.b bVar2 = (kg.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue3 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue3) * bVar2.e);
                    }
                }
                gVar2.invalidate();
                break;
            case 5:
                ig.n nVar = (ig.n) this.b;
                ig.o oVar = (ig.o) this.c;
                nVar.getClass();
                oVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 6:
                ii.b0 b0Var = (ii.b0) this.b;
                ei.d5 d5Var = (ei.d5) this.c;
                b0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b0Var.a = intValue;
                d5Var.d(intValue);
                break;
            case 7:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.b;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.c;
                v0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w0Var.invalidate();
                break;
            case 8:
                ng.a aVar = (ng.a) this.b;
                int[] iArr = (int[]) this.c;
                aVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue4, iArr[0], aVar.h[0]), i0.a.d(floatValue4, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.b = linearGradient;
                linearGradient.setLocalMatrix(aVar.c);
                paint.setShader(aVar.b);
                aVar.a.setPaint(paint, 0);
                aVar.g.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[1], aVar.h[1]), -1));
                aVar.f.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                break;
            case 9:
                bo boVar = (bo) this.b;
                bo boVar2 = (bo) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar2.U9 = floatValue5;
                boVar2.fragmentView.invalidate();
                boVar2.x0.invalidate();
                float f10 = 1.0f - floatValue5;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                boVar.a1.setTranslationY(dp);
                boVar.a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue5;
                boVar2.a1.setTranslationY(f11);
                boVar2.a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue5 * 0.2f) + 0.8f;
                boVar.a1.getAvatarImageView().setScaleX(f12);
                boVar.a1.getAvatarImageView().setScaleY(f12);
                boVar.a1.getAvatarImageView().setAlpha(floatValue5);
                float f13 = (0.2f * f10) + 0.8f;
                boVar2.a1.getAvatarImageView().setScaleX(f13);
                boVar2.a1.getAvatarImageView().setScaleY(f13);
                boVar2.a1.getAvatarImageView().setAlpha(f10);
                bh bhVar = boVar2.M0;
                if (bhVar != null) {
                    bhVar.setAlpha(f10);
                    break;
                }
                break;
            case 10:
                wo woVar = (wo) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                woVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                woVar.N.setAlpha(floatValue6);
                float f14 = 1.0f - floatValue6;
                woVar.N.setTranslationY(((-r5.getHeight()) / 2.0f) * f14);
                woVar.N.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i10 < arrayList3.size()) {
                    ((View) arrayList3.get(i10)).setTranslationY((-woVar.N.getHeight()) * f14);
                    i10++;
                }
                break;
            case 11:
                org.telegram.ui.Components.u9 u9Var = (org.telegram.ui.Components.u9) this.b;
                org.telegram.ui.Components.u9 u9Var2 = (org.telegram.ui.Components.u9) this.c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9Var.setScaleX(floatValue7);
                u9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !u9Var2.getImageReceiver().hasBitmapImage()) {
                    u9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 12:
                ((org.telegram.ui.Components.eb) this.b).accept(Float.valueOf(((org.telegram.ui.Components.sb) this.c).getTranslationY()));
                break;
            case 13:
                ((ml) this.b).accept(Float.valueOf(((org.telegram.ui.Components.sb) this.c).getTranslationY()));
                break;
            case 14:
                ai aiVar = (ai) this.b;
                bu buVar = (bu) this.c;
                aiVar.getClass();
                buVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                vi viVar = aiVar.c0;
                viVar.U1();
                ni niVar = viVar.y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.j0;
                if (niVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(viVar.l2);
                    break;
                }
                break;
            case 15:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.b;
                lu luVar = (lu) this.c;
                mVar.getClass();
                luVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!zg.f0.b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                break;
            case 16:
                dy0 dy0Var = (dy0) this.b;
                cy0[] cy0VarArr = (cy0[]) this.c;
                dy0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < cy0VarArr.length) {
                    dy0Var.c[i10] = (dy0Var.d[i10] * floatValue8) + ((1.0f - floatValue8) * dy0Var.e[i10]);
                    i10++;
                }
                dy0Var.invalidate();
                break;
            case 17:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.b;
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.c;
                m0Var.getClass();
                uVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m0Var.invalidate();
                break;
            case 18:
                View view2 = (View) this.c;
                View view3 = (View) this.b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue9;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue9);
                view3.setAlpha(f15);
                break;
            case 19:
                org.telegram.ui.Components.voip.c3 c3Var = (org.telegram.ui.Components.voip.c3) this.b;
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.c;
                q1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                q1Var.c();
                int i12 = q1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && c3Var.R) {
                    c3Var.Q.pause();
                    AnimatorSet animatorSet = c3Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 20:
                org.telegram.ui.Components.voip.o3 o3Var = (org.telegram.ui.Components.voip.o3) this.b;
                org.telegram.ui.Components.voip.z2 z2Var = (org.telegram.ui.Components.voip.z2) this.c;
                o3Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.c - r3)) + o3Var.e);
                o3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.d - r3)) + o3Var.f);
                z2Var.invalidate();
                break;
            case 21:
                uy.q1(((xw) this.b).M, (ty) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 22:
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
                uu0 uu0Var = photoViewer.E2;
                if (uu0Var != null) {
                    uu0Var.invalidateOutline();
                    break;
                }
                break;
            case 23:
                f31 f31Var = (f31) this.b;
                int[] iArr2 = (int[]) this.c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cc0 cc0Var = f31Var.n;
                if (cc0Var != null) {
                    cc0Var.K = 1.0f;
                    cc0Var.i();
                    f31Var.n.s(1.0f - floatValue10);
                }
                cc0 cc0Var2 = f31Var.h;
                cc0Var2.K = floatValue10;
                cc0Var2.i();
                f31Var.h.s(floatValue10);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue10, f31Var.e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue10, f31Var.e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue10, f31Var.e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue10, f31Var.e[3], iArr2[3]);
                    z21 z21Var = f31Var.E;
                    z21Var.a.n(d, d10, d11, d12);
                    z21Var.invalidate();
                }
                f31Var.w.invalidate();
                break;
            case 24:
                a5.a aVar2 = (a5.a) this.b;
                int[] iArr3 = (int[]) this.c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i13 = intValue2 - aVar2.b;
                ((ll0) aVar2.d).scrollBy(0, i13);
                iArr3[0] = iArr3[0] + i13;
                aVar2.b = intValue2;
                break;
            case 25:
                xi1 xi1Var = (xi1) this.b;
                ui uiVar = (ui) this.c;
                xi1Var.getClass();
                xi1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uiVar.invalidate();
                break;
            case 26:
                qg.d2 d2Var = (qg.d2) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                d2Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 >= 0.5f) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        d2Var.r0.b(d2Var.y0, false);
                    }
                    float f16 = (floatValue11 - 0.5f) / 0.5f;
                    d2Var.setRotationY((1.0f - f16) * (-90.0f));
                    d2Var.z0 = (f16 * 0.3f) + 0.7f;
                    d2Var.invalidate();
                    break;
                } else {
                    float f17 = floatValue11 / 0.5f;
                    d2Var.setRotationY(90.0f * f17);
                    d2Var.z0 = ((1.0f - f17) * 0.3f) + 0.7f;
                    d2Var.invalidate();
                    break;
                }
            case 27:
                pk0 pk0Var = (pk0) this.b;
                Drawable drawable = (Drawable) this.c;
                pk0Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view5 = ((rg.k1) pk0Var.c).A0;
                if (!(view5 instanceof org.telegram.ui.Cells.t1)) {
                    view5.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.Cells.t1) view5).a3();
                    break;
                }
            default:
                ((s4.j) this.b).P((s4.c1) this.c);
                break;
        }
    }

    public /* synthetic */ x(View view, View view2) {
        this.a = 18;
        this.c = view;
        this.b = view2;
    }
}
