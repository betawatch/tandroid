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
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.voip.b3;
import org.telegram.ui.Components.voip.n3;
import org.telegram.ui.Components.voip.o1;
import org.telegram.ui.Components.voip.y2;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xu;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bv0;
import org.telegram.ui.bx;
import org.telegram.ui.fo;
import org.telegram.ui.g31;
import org.telegram.ui.gj1;
import org.telegram.ui.l31;
import org.telegram.ui.xy;
import org.telegram.ui.yy;
import org.telegram.ui.zo;
import rg.c2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList.size()) {
                    t0.g((View) arrayList.get(i10), floatValue);
                    i10++;
                }
                t0Var.m.k0.invalidate();
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
                        AndroidUtilities.runOnUIThread(new a3.d(profileStoriesView, 20), 180L);
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
                f1.a aVar = (f1.a) this.c;
                bVar3.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bVar3.b = intValue;
                aVar.c(intValue);
                break;
            case 8:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.b;
                org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) this.c;
                w0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x0Var.invalidate();
                break;
            case 9:
                og.a aVar2 = (og.a) this.b;
                int[] iArr = (int[]) this.c;
                aVar2.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue5, iArr[0], aVar2.h[0]), i0.a.d(floatValue5, iArr[1], aVar2.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar2.b = linearGradient;
                linearGradient.setLocalMatrix(aVar2.c);
                paint.setShader(aVar2.b);
                aVar2.a.setPaint(paint, 0);
                aVar2.g.setColor(i0.a.d(0.1f, i0.a.d(floatValue5, iArr[1], aVar2.h[1]), -1));
                aVar2.f.setColor(i0.a.d(0.1f, i0.a.d(floatValue5, iArr[0], aVar2.h[0]), -16777216));
                aVar2.invalidateSelf();
                break;
            case 10:
                fo foVar = (fo) this.b;
                fo foVar2 = (fo) this.c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar2.U9 = floatValue6;
                foVar2.fragmentView.invalidate();
                foVar2.x0.invalidate();
                float f10 = 1.0f - floatValue6;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                foVar.a1.setTranslationY(dp);
                foVar.a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue6;
                foVar2.a1.setTranslationY(f11);
                foVar2.a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue6 * 0.2f) + 0.8f;
                foVar.a1.getAvatarImageView().setScaleX(f12);
                foVar.a1.getAvatarImageView().setScaleY(f12);
                foVar.a1.getAvatarImageView().setAlpha(floatValue6);
                float f13 = (0.2f * f10) + 0.8f;
                foVar2.a1.getAvatarImageView().setScaleX(f13);
                foVar2.a1.getAvatarImageView().setScaleY(f13);
                foVar2.a1.getAvatarImageView().setAlpha(f10);
                dh dhVar = foVar2.M0;
                if (dhVar != null) {
                    dhVar.setAlpha(f10);
                    break;
                }
                break;
            case 11:
                zo zoVar = (zo) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                zoVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zoVar.N.setAlpha(floatValue7);
                float f14 = 1.0f - floatValue7;
                zoVar.N.setTranslationY(((-r5.getHeight()) / 2.0f) * f14);
                zoVar.N.setScaleY((floatValue7 * 0.8f) + 0.2f);
                while (i10 < arrayList4.size()) {
                    ((View) arrayList4.get(i10)).setTranslationY((-zoVar.N.getHeight()) * f14);
                    i10++;
                }
                break;
            case 12:
                z9 z9Var = (z9) this.b;
                z9 z9Var2 = (z9) this.c;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9Var.setScaleX(floatValue8);
                z9Var.setScaleY(floatValue8);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !z9Var2.getImageReceiver().hasBitmapImage()) {
                    z9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 13:
                ((ib) this.b).accept(Float.valueOf(((wb) this.c).getTranslationY()));
                break;
            case 14:
                ((am) this.b).accept(Float.valueOf(((wb) this.c).getTranslationY()));
                break;
            case 15:
                ai aiVar = (ai) this.b;
                nu nuVar = (nu) this.c;
                aiVar.getClass();
                nuVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                vi viVar = aiVar.c0;
                viVar.Y1();
                ni niVar = viVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.j0;
                if (niVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.l(viVar.o2);
                    break;
                }
                break;
            case 16:
                c2.b bVar4 = (c2.b) this.b;
                xu xuVar = (xu) this.c;
                bVar4.getClass();
                xuVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) bVar4.d).size()) {
                    if (!x0.b) {
                        ((View) ((ArrayList) bVar4.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                break;
            case 17:
                az0 az0Var = (az0) this.b;
                zy0[] zy0VarArr = (zy0[]) this.c;
                az0Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < zy0VarArr.length) {
                    az0Var.c[i10] = (az0Var.d[i10] * floatValue9) + ((1.0f - floatValue9) * az0Var.e[i10]);
                    i10++;
                }
                az0Var.invalidate();
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
                b3 b3Var = (b3) this.b;
                o1 o1Var = (o1) this.c;
                o1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o1Var.c();
                int i12 = o1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && b3Var.R) {
                    b3Var.Q.pause();
                    AnimatorSet animatorSet = b3Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 21:
                n3 n3Var = (n3) this.b;
                y2 y2Var = (y2) this.c;
                n3Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (n3Var.c - r3)) + n3Var.e);
                n3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (n3Var.d - r3)) + n3Var.f);
                y2Var.invalidate();
                break;
            case 22:
                yy.n1(((bx) this.b).M, (xy) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                bv0 bv0Var = photoViewer.E2;
                if (bv0Var != null) {
                    bv0Var.invalidateOutline();
                    break;
                }
                break;
            case 24:
                l31 l31Var = (l31) this.b;
                int[] iArr2 = (int[]) this.c;
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cd0 cd0Var = l31Var.n;
                if (cd0Var != null) {
                    cd0Var.K = 1.0f;
                    cd0Var.i();
                    l31Var.n.s(1.0f - floatValue11);
                }
                cd0 cd0Var2 = l31Var.h;
                cd0Var2.K = floatValue11;
                cd0Var2.i();
                l31Var.h.s(floatValue11);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue11, l31Var.e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue11, l31Var.e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue11, l31Var.e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue11, l31Var.e[3], iArr2[3]);
                    g31 g31Var = l31Var.E;
                    g31Var.a.n(d, d10, d11, d12);
                    g31Var.invalidate();
                }
                l31Var.w.invalidate();
                break;
            case 25:
                a5.a aVar3 = (a5.a) this.b;
                int[] iArr3 = (int[]) this.c;
                aVar3.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i13 = intValue2 - aVar3.b;
                ((mm0) aVar3.d).scrollBy(0, i13);
                iArr3[0] = iArr3[0] + i13;
                aVar3.b = intValue2;
                break;
            case 26:
                gj1 gj1Var = (gj1) this.b;
                ui uiVar = (ui) this.c;
                gj1Var.getClass();
                gj1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uiVar.invalidate();
                break;
            case 27:
                ((View) ((g.a0) ((k6.h) this.b).b).d.getParent()).invalidate();
                break;
            case 28:
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
                ((s4.k) this.b).P((s4.b1) this.c);
                break;
        }
    }
}
