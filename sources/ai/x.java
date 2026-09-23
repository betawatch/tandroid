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
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nl;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.nu0;
import org.telegram.ui.pi1;
import org.telegram.ui.qy;
import org.telegram.ui.r21;
import org.telegram.ui.ry;
import org.telegram.ui.so;
import org.telegram.ui.uw;
import org.telegram.ui.x21;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                xn xnVar = (xn) this.b;
                xn xnVar2 = (xn) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar2.U9 = floatValue5;
                xnVar2.fragmentView.invalidate();
                xnVar2.x0.invalidate();
                float f10 = 1.0f - floatValue5;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                xnVar.a1.setTranslationY(dp);
                xnVar.a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue5;
                xnVar2.a1.setTranslationY(f11);
                xnVar2.a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue5 * 0.2f) + 0.8f;
                xnVar.a1.getAvatarImageView().setScaleX(f12);
                xnVar.a1.getAvatarImageView().setScaleY(f12);
                xnVar.a1.getAvatarImageView().setAlpha(floatValue5);
                float f13 = (0.2f * f10) + 0.8f;
                xnVar2.a1.getAvatarImageView().setScaleX(f13);
                xnVar2.a1.getAvatarImageView().setScaleY(f13);
                xnVar2.a1.getAvatarImageView().setAlpha(f10);
                ch chVar = xnVar2.M0;
                if (chVar != null) {
                    chVar.setAlpha(f10);
                    break;
                }
                break;
            case 10:
                so soVar = (so) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                soVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                soVar.N.setAlpha(floatValue6);
                float f14 = 1.0f - floatValue6;
                soVar.N.setTranslationY(((-r5.getHeight()) / 2.0f) * f14);
                soVar.N.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i10 < arrayList3.size()) {
                    ((View) arrayList3.get(i10)).setTranslationY((-soVar.N.getHeight()) * f14);
                    i10++;
                }
                break;
            case 11:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.b;
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) this.c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue7);
                w9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !w9Var2.getImageReceiver().hasBitmapImage()) {
                    w9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 12:
                ((org.telegram.ui.Components.gb) this.b).accept(Float.valueOf(((org.telegram.ui.Components.ub) this.c).getTranslationY()));
                break;
            case 13:
                ((nl) this.b).accept(Float.valueOf(((org.telegram.ui.Components.ub) this.c).getTranslationY()));
                break;
            case 14:
                bi biVar = (bi) this.b;
                cu cuVar = (cu) this.c;
                biVar.getClass();
                cuVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                wi wiVar = biVar.c0;
                wiVar.U1();
                oi oiVar = wiVar.y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar.j0;
                if (oiVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(wiVar.l2);
                    break;
                }
                break;
            case 15:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.b;
                mu muVar = (mu) this.c;
                mVar.getClass();
                muVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!zg.f0.b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                break;
            case 16:
                cy0 cy0Var = (cy0) this.b;
                by0[] by0VarArr = (by0[]) this.c;
                cy0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < by0VarArr.length) {
                    cy0Var.c[i10] = (cy0Var.d[i10] * floatValue8) + ((1.0f - floatValue8) * cy0Var.e[i10]);
                    i10++;
                }
                cy0Var.invalidate();
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
                ry.q1(((uw) this.b).M, (qy) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                nu0 nu0Var = photoViewer.E2;
                if (nu0Var != null) {
                    nu0Var.invalidateOutline();
                    break;
                }
                break;
            case 23:
                x21 x21Var = (x21) this.b;
                int[] iArr2 = (int[]) this.c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bc0 bc0Var = x21Var.n;
                if (bc0Var != null) {
                    bc0Var.K = 1.0f;
                    bc0Var.i();
                    x21Var.n.s(1.0f - floatValue10);
                }
                bc0 bc0Var2 = x21Var.h;
                bc0Var2.K = floatValue10;
                bc0Var2.i();
                x21Var.h.s(floatValue10);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue10, x21Var.e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue10, x21Var.e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue10, x21Var.e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue10, x21Var.e[3], iArr2[3]);
                    r21 r21Var = x21Var.E;
                    r21Var.a.n(d, d10, d11, d12);
                    r21Var.invalidate();
                }
                x21Var.w.invalidate();
                break;
            case 24:
                a5.a aVar2 = (a5.a) this.b;
                int[] iArr3 = (int[]) this.c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i13 = intValue2 - aVar2.b;
                ((ml0) aVar2.d).scrollBy(0, i13);
                iArr3[0] = iArr3[0] + i13;
                aVar2.b = intValue2;
                break;
            case 25:
                pi1 pi1Var = (pi1) this.b;
                vi viVar = (vi) this.c;
                pi1Var.getClass();
                pi1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                viVar.invalidate();
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
                qk0 qk0Var = (qk0) this.b;
                Drawable drawable = (Drawable) this.c;
                qk0Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view5 = ((rg.k1) qk0Var.c).A0;
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
