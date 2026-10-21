package ah;

import ai.ne;
import ai.oe;
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
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.voip.a3;
import org.telegram.ui.Components.voip.m3;
import org.telegram.ui.Components.voip.o1;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.zh;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.au0;
import org.telegram.ui.ay;
import org.telegram.ui.cy;
import org.telegram.ui.fw;
import org.telegram.ui.io;
import org.telegram.ui.kh1;
import org.telegram.ui.qn;
import rg.b2;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                oe oeVar = (oe) this.b;
                ne neVar = (ne) this.c;
                oeVar.getClass();
                neVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oeVar.f1();
                break;
            case 2:
                ci.q qVar = (ci.q) this.b;
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
                        AndroidUtilities.runOnUIThread(new androidx.fragment.app.d(profileStoriesView, 13), 180L);
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
            case 6:
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
            case 7:
                jg.n nVar = (jg.n) this.b;
                jg.o oVar = (jg.o) this.c;
                nVar.getClass();
                oVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 8:
                j5.c cVar = (j5.c) this.b;
                j5.b bVar3 = (j5.b) this.c;
                cVar.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                cVar.b = intValue;
                bVar3.i(intValue);
                break;
            case 9:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.b;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.c;
                v0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w0Var.invalidate();
                break;
            case 10:
                og.a aVar = (og.a) this.b;
                int[] iArr = (int[]) this.c;
                aVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.f(floatValue5, iArr[0], aVar.h[0]), i0.a.f(floatValue5, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.b = linearGradient;
                linearGradient.setLocalMatrix(aVar.c);
                paint.setShader(aVar.b);
                aVar.a.setPaint(paint, 0);
                aVar.g.setColor(i0.a.f(0.1f, i0.a.f(floatValue5, iArr[1], aVar.h[1]), -1));
                aVar.f.setColor(i0.a.f(0.1f, i0.a.f(floatValue5, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                break;
            case 11:
                qn qnVar = (qn) this.b;
                qn qnVar2 = (qn) this.c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar2.U9 = floatValue6;
                qnVar2.fragmentView.invalidate();
                qnVar2.x0.invalidate();
                float f10 = 1.0f - floatValue6;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                qnVar.a1.setTranslationY(dp);
                qnVar.a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue6;
                qnVar2.a1.setTranslationY(f11);
                qnVar2.a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue6 * 0.2f) + 0.8f;
                qnVar.a1.getAvatarImageView().setScaleX(f12);
                qnVar.a1.getAvatarImageView().setScaleY(f12);
                qnVar.a1.getAvatarImageView().setAlpha(floatValue6);
                float f13 = (0.2f * f10) + 0.8f;
                qnVar2.a1.getAvatarImageView().setScaleX(f13);
                qnVar2.a1.getAvatarImageView().setScaleY(f13);
                qnVar2.a1.getAvatarImageView().setAlpha(f10);
                ch chVar = qnVar2.M0;
                if (chVar != null) {
                    chVar.setAlpha(f10);
                    break;
                }
                break;
            case 12:
                io ioVar = (io) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ioVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ioVar.N.setAlpha(floatValue7);
                float f14 = 1.0f - floatValue7;
                ioVar.N.setTranslationY(((-r6.getHeight()) / 2.0f) * f14);
                ioVar.N.setScaleY((floatValue7 * 0.8f) + 0.2f);
                while (i10 < arrayList4.size()) {
                    ((View) arrayList4.get(i10)).setTranslationY((-ioVar.N.getHeight()) * f14);
                    i10++;
                }
                break;
            case 13:
                w9 w9Var = (w9) this.b;
                w9 w9Var2 = (w9) this.c;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue8);
                w9Var.setScaleY(floatValue8);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !w9Var2.getImageReceiver().hasBitmapImage()) {
                    w9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 14:
                ((gb) this.b).accept(Float.valueOf(((ub) this.c).getTranslationY()));
                break;
            case 15:
                ((xl) this.b).accept(Float.valueOf(((ub) this.c).getTranslationY()));
                break;
            case 16:
                zh zhVar = (zh) this.b;
                iu iuVar = (iu) this.c;
                zhVar.getClass();
                iuVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ti tiVar = zhVar.c0;
                tiVar.Y1();
                li liVar = tiVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.j0;
                if (liVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.l(tiVar.o2);
                    break;
                }
                break;
            case 17:
                c2.b bVar4 = (c2.b) this.b;
                su suVar = (su) this.c;
                bVar4.getClass();
                suVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) bVar4.d).size()) {
                    if (!x0.b) {
                        ((View) ((ArrayList) bVar4.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                break;
            case 18:
                xy0 xy0Var = (xy0) this.b;
                wy0[] wy0VarArr = (wy0[]) this.c;
                xy0Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < wy0VarArr.length) {
                    xy0Var.c[i10] = (xy0Var.d[i10] * floatValue9) + ((1.0f - floatValue9) * xy0Var.e[i10]);
                    i10++;
                }
                xy0Var.invalidate();
                break;
            case 19:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.c;
                l0Var.getClass();
                tVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l0Var.invalidate();
                break;
            case 20:
                View view2 = (View) this.b;
                View view3 = (View) this.c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue10;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue10);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue10);
                view3.setAlpha(f15);
                break;
            case 21:
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
            case 22:
                m3 m3Var = (m3) this.b;
                x2 x2Var = (x2) this.c;
                m3Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (m3Var.c - r3)) + m3Var.e);
                m3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (m3Var.d - r3)) + m3Var.f);
                x2Var.invalidate();
                break;
            case 23:
                cy.n1(((fw) this.b).M, (ay) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
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
                au0 au0Var = photoViewer.E2;
                if (au0Var != null) {
                    au0Var.invalidateOutline();
                    break;
                }
                break;
            case 25:
                a5.a aVar2 = (a5.a) this.b;
                int[] iArr2 = (int[]) this.c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i13 = intValue2 - aVar2.b;
                ((jm0) aVar2.d).scrollBy(0, i13);
                iArr2[0] = iArr2[0] + i13;
                aVar2.b = intValue2;
                break;
            case 26:
                kh1 kh1Var = (kh1) this.b;
                si siVar = (si) this.c;
                kh1Var.getClass();
                kh1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                siVar.invalidate();
                break;
            case 27:
                ((View) ((g.a0) ((a4.l) this.b).b).d.getParent()).invalidate();
                break;
            default:
                b2 b2Var = (b2) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                b2Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 >= 0.5f) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        b2Var.r0.b(b2Var.y0, false);
                    }
                    float f16 = (floatValue11 - 0.5f) / 0.5f;
                    b2Var.setRotationY((1.0f - f16) * (-90.0f));
                    b2Var.z0 = (f16 * 0.3f) + 0.7f;
                    b2Var.invalidate();
                    break;
                } else {
                    float f17 = floatValue11 / 0.5f;
                    b2Var.setRotationY(90.0f * f17);
                    b2Var.z0 = ((1.0f - f17) * 0.3f) + 0.7f;
                    b2Var.invalidate();
                    break;
                }
        }
    }
}
