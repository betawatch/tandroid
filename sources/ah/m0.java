package ah;

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
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.voip.a3;
import org.telegram.ui.Components.voip.m3;
import org.telegram.ui.Components.voip.o1;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.zt;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a31;
import org.telegram.ui.co;
import org.telegram.ui.g31;
import org.telegram.ui.tu0;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.xi1;
import org.telegram.ui.xo;
import org.telegram.ui.xw;
import rg.c2;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList.size()) {
                    u0.g((View) arrayList.get(i10), floatValue);
                    i10++;
                }
                u0Var.m.k0.invalidate();
                break;
            case 1:
                bi.u uVar = (bi.u) this.b;
                View view = (View) this.c;
                uVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue2;
                view.setAlpha(f7);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue2);
                uVar.y.setAlpha(floatValue2);
                uVar.y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                break;
            case 2:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                boolean[] zArr = (boolean[]) this.c;
                int i11 = ProfileStoriesView.s0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new a3.c(profileStoriesView, 19), 180L);
                    }
                }
                profileStoriesView.W = Math.max(1.0f, floatValue3);
                profileStoriesView.invalidate();
                break;
            case 3:
                TextView textView = (TextView) this.b;
                TextView textView2 = (TextView) this.c;
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                textView2.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                jg.g gVar = (jg.g) this.b;
                lg.d dVar = (lg.d) this.c;
                gVar.getClass();
                dVar.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar.b;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    lg.d dVar2 = (lg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f = (int) ((dVar2.g / 255.0f) * (255 - dVar.f));
                    }
                }
                gVar.invalidate();
                break;
            case 5:
                jg.g gVar2 = (jg.g) this.b;
                lg.b bVar = (lg.b) this.c;
                gVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar2.c;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    lg.b bVar2 = (lg.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue4 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue4) * bVar2.e);
                    }
                }
                gVar2.invalidate();
                break;
            case 6:
                jg.n nVar = (jg.n) this.b;
                jg.o oVar = (jg.o) this.c;
                nVar.getClass();
                oVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 7:
                j5.b bVar3 = (j5.b) this.b;
                fi.f fVar = (fi.f) this.c;
                bVar3.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bVar3.b = intValue;
                fVar.c(intValue);
                break;
            case 8:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.b;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.c;
                v0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w0Var.invalidate();
                break;
            case 9:
                og.a aVar = (og.a) this.b;
                int[] iArr = (int[]) this.c;
                aVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue5, iArr[0], aVar.h[0]), i0.a.d(floatValue5, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.b = linearGradient;
                linearGradient.setLocalMatrix(aVar.c);
                paint.setShader(aVar.b);
                aVar.a.setPaint(paint, 0);
                aVar.g.setColor(i0.a.d(0.1f, i0.a.d(floatValue5, iArr[1], aVar.h[1]), -1));
                aVar.f.setColor(i0.a.d(0.1f, i0.a.d(floatValue5, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                break;
            case 10:
                co coVar = (co) this.b;
                co coVar2 = (co) this.c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar2.U9 = floatValue6;
                coVar2.fragmentView.invalidate();
                coVar2.x0.invalidate();
                float f10 = 1.0f - floatValue6;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                coVar.a1.setTranslationY(dp);
                coVar.a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue6;
                coVar2.a1.setTranslationY(f11);
                coVar2.a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue6 * 0.2f) + 0.8f;
                coVar.a1.getAvatarImageView().setScaleX(f12);
                coVar.a1.getAvatarImageView().setScaleY(f12);
                coVar.a1.getAvatarImageView().setAlpha(floatValue6);
                float f13 = (0.2f * f10) + 0.8f;
                coVar2.a1.getAvatarImageView().setScaleX(f13);
                coVar2.a1.getAvatarImageView().setScaleY(f13);
                coVar2.a1.getAvatarImageView().setAlpha(f10);
                dh dhVar = coVar2.M0;
                if (dhVar != null) {
                    dhVar.setAlpha(f10);
                    break;
                }
                break;
            case 11:
                xo xoVar = (xo) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                xoVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xoVar.N.setAlpha(floatValue7);
                float f14 = 1.0f - floatValue7;
                xoVar.N.setTranslationY(((-r5.getHeight()) / 2.0f) * f14);
                xoVar.N.setScaleY((floatValue7 * 0.8f) + 0.2f);
                while (i10 < arrayList4.size()) {
                    ((View) arrayList4.get(i10)).setTranslationY((-xoVar.N.getHeight()) * f14);
                    i10++;
                }
                break;
            case 12:
                x9 x9Var = (x9) this.b;
                x9 x9Var2 = (x9) this.c;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9Var.setScaleX(floatValue8);
                x9Var.setScaleY(floatValue8);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !x9Var2.getImageReceiver().hasBitmapImage()) {
                    x9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 13:
                ((gb) this.b).accept(Float.valueOf(((ub) this.c).getTranslationY()));
                break;
            case 14:
                ((ml) this.b).accept(Float.valueOf(((ub) this.c).getTranslationY()));
                break;
            case 15:
                ai aiVar = (ai) this.b;
                zt ztVar = (zt) this.c;
                aiVar.getClass();
                ztVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                vi viVar = aiVar.c0;
                viVar.U1();
                ni niVar = viVar.y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.j0;
                if (niVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(viVar.l2);
                    break;
                }
                break;
            case 16:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.b;
                ju juVar = (ju) this.c;
                mVar.getClass();
                juVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!y0.b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                break;
            case 17:
                cy0 cy0Var = (cy0) this.b;
                by0[] by0VarArr = (by0[]) this.c;
                cy0Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < by0VarArr.length) {
                    cy0Var.c[i10] = (cy0Var.d[i10] * floatValue9) + ((1.0f - floatValue9) * cy0Var.e[i10]);
                    i10++;
                }
                cy0Var.invalidate();
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
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue10;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue10);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue10);
                view3.setAlpha(f15);
                break;
            case 20:
                a3 a3Var = (a3) this.b;
                o1 o1Var = (o1) this.c;
                o1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o1Var.c();
                int i12 = o1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && a3Var.R) {
                    a3Var.Q.pause();
                    AnimatorSet animatorSet = a3Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 21:
                m3 m3Var = (m3) this.b;
                x2 x2Var = (x2) this.c;
                m3Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (m3Var.c - r3)) + m3Var.e);
                m3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (m3Var.d - r3)) + m3Var.f);
                x2Var.invalidate();
                break;
            case 22:
                uy.q1(((xw) this.b).M, (ty) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                View view4 = (View) this.c;
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view4.invalidateOutline();
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                tu0 tu0Var = photoViewer.E2;
                if (tu0Var != null) {
                    tu0Var.invalidateOutline();
                    break;
                }
                break;
            case 24:
                g31 g31Var = (g31) this.b;
                int[] iArr2 = (int[]) this.c;
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dc0 dc0Var = g31Var.n;
                if (dc0Var != null) {
                    dc0Var.K = 1.0f;
                    dc0Var.i();
                    g31Var.n.s(1.0f - floatValue11);
                }
                dc0 dc0Var2 = g31Var.h;
                dc0Var2.K = floatValue11;
                dc0Var2.i();
                g31Var.h.s(floatValue11);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue11, g31Var.e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue11, g31Var.e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue11, g31Var.e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue11, g31Var.e[3], iArr2[3]);
                    a31 a31Var = g31Var.E;
                    a31Var.a.n(d, d10, d11, d12);
                    a31Var.invalidate();
                }
                g31Var.w.invalidate();
                break;
            case 25:
                a5.a aVar2 = (a5.a) this.b;
                int[] iArr3 = (int[]) this.c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i13 = intValue2 - aVar2.b;
                ((ll0) aVar2.d).scrollBy(0, i13);
                iArr3[0] = iArr3[0] + i13;
                aVar2.b = intValue2;
                break;
            case 26:
                xi1 xi1Var = (xi1) this.b;
                ui uiVar = (ui) this.c;
                xi1Var.getClass();
                xi1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uiVar.invalidate();
                break;
            case 27:
                c2 c2Var = (c2) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                c2Var.getClass();
                float floatValue12 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue12 >= 0.5f) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        c2Var.r0.b(c2Var.y0, false);
                    }
                    float f16 = (floatValue12 - 0.5f) / 0.5f;
                    c2Var.setRotationY((1.0f - f16) * (-90.0f));
                    c2Var.z0 = (f16 * 0.3f) + 0.7f;
                    c2Var.invalidate();
                    break;
                } else {
                    float f17 = floatValue12 / 0.5f;
                    c2Var.setRotationY(90.0f * f17);
                    c2Var.z0 = ((1.0f - f17) * 0.3f) + 0.7f;
                    c2Var.invalidate();
                    break;
                }
            default:
                ((s4.j) this.b).P((s4.c1) this.c);
                break;
        }
    }
}
