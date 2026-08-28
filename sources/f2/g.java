package f2;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import gh.kb;
import gh.lb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.voip.b3;
import org.telegram.ui.Components.voip.n3;
import org.telegram.ui.Components.voip.y2;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.xa;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cy;
import org.telegram.ui.dy;
import org.telegram.ui.ho;
import org.telegram.ui.hw;
import org.telegram.ui.ph1;
import org.telegram.ui.qn;
import org.telegram.ui.st0;
import org.telegram.ui.u11;
import org.telegram.ui.z11;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = 0;
        switch (this.a) {
            case 0:
                ((n) this.b).P((q1) this.c);
                break;
            case 1:
                lb lbVar = (lb) this.b;
                kb kbVar = (kb) this.c;
                lbVar.getClass();
                kbVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lbVar.R();
                break;
            case 2:
                hg.e0 e0Var = (hg.e0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i9 < arrayList.size()) {
                    hg.e0.g((View) arrayList.get(i9), floatValue);
                    i9++;
                }
                e0Var.m.g0.invalidate();
                break;
            case 3:
                ih.q qVar = (ih.q) this.b;
                View view = (View) this.c;
                qVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = 1.0f - floatValue2;
                view.setAlpha(f10);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue2);
                qVar.y.setAlpha(floatValue2);
                qVar.y.setTranslationY(AndroidUtilities.dp(5.0f) * f10);
                break;
            case 4:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                boolean[] zArr = (boolean[]) this.c;
                int i10 = ProfileStoriesView.o0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new ih.g(profileStoriesView, 7), 180L);
                    }
                }
                profileStoriesView.S = Math.max(1.0f, floatValue3);
                profileStoriesView.invalidate();
                break;
            case 5:
                qn qnVar = (qn) this.b;
                qn qnVar2 = (qn) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar2.Q9 = floatValue4;
                qnVar2.fragmentView.invalidate();
                qnVar2.t0.invalidate();
                float f11 = 1.0f - floatValue4;
                float dp = AndroidUtilities.dp(8.0f) * f11;
                qnVar.W0.setTranslationY(dp);
                qnVar.W0.getAvatarImageView().setTranslationY(-dp);
                float f12 = (-AndroidUtilities.dp(8.0f)) * floatValue4;
                qnVar2.W0.setTranslationY(f12);
                qnVar2.W0.getAvatarImageView().setTranslationY(-f12);
                float f13 = (floatValue4 * 0.2f) + 0.8f;
                qnVar.W0.getAvatarImageView().setScaleX(f13);
                qnVar.W0.getAvatarImageView().setScaleY(f13);
                qnVar.W0.getAvatarImageView().setAlpha(floatValue4);
                float f14 = (0.2f * f11) + 0.8f;
                qnVar2.W0.getAvatarImageView().setScaleX(f14);
                qnVar2.W0.getAvatarImageView().setScaleY(f14);
                qnVar2.W0.getAvatarImageView().setAlpha(f11);
                sg sgVar = qnVar2.I0;
                if (sgVar != null) {
                    sgVar.setAlpha(f11);
                    break;
                }
                break;
            case 6:
                ho hoVar = (ho) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                hoVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hoVar.J.setAlpha(floatValue5);
                float f15 = 1.0f - floatValue5;
                hoVar.J.setTranslationY(((-r5.getHeight()) / 2.0f) * f15);
                hoVar.J.setScaleY((floatValue5 * 0.8f) + 0.2f);
                while (i9 < arrayList2.size()) {
                    ((View) arrayList2.get(i9)).setTranslationY((-hoVar.J.getHeight()) * f15);
                    i9++;
                }
                break;
            case 7:
                o9 o9Var = (o9) this.b;
                o9 o9Var2 = (o9) this.c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o9Var.setScaleX(floatValue6);
                o9Var.setScaleY(floatValue6);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !o9Var2.getImageReceiver().hasBitmapImage()) {
                    o9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 8:
                ((xa) this.b).accept(Float.valueOf(((org.telegram.ui.Components.lb) this.c).getTranslationY()));
                break;
            case 9:
                ((dl) this.b).accept(Float.valueOf(((org.telegram.ui.Components.lb) this.c).getTranslationY()));
                break;
            case 10:
                qh qhVar = (qh) this.b;
                mt mtVar = (mt) this.c;
                qhVar.getClass();
                mtVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ki kiVar = qhVar.V;
                kiVar.U1();
                ci ciVar = kiVar.u0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f0;
                if (ciVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(kiVar.h2);
                    break;
                }
                break;
            case 11:
                com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) this.b;
                wt wtVar = (wt) this.c;
                lVar.getClass();
                wtVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i9 < ((ArrayList) lVar.d).size()) {
                    if (!hg.h0.b) {
                        ((View) ((ArrayList) lVar.d).get(i9)).invalidate();
                    }
                    i9++;
                }
                break;
            case 12:
                kx0 kx0Var = (kx0) this.b;
                jx0[] jx0VarArr = (jx0[]) this.c;
                kx0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i9 < jx0VarArr.length) {
                    kx0Var.c[i9] = (kx0Var.d[i9] * floatValue7) + ((1.0f - floatValue7) * kx0Var.e[i9]);
                    i9++;
                }
                kx0Var.invalidate();
                break;
            case 13:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.b;
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.c;
                k0Var.getClass();
                tVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                k0Var.invalidate();
                break;
            case 14:
                View view2 = (View) this.b;
                View view3 = (View) this.c;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = 1.0f - floatValue8;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f16);
                view2.setAlpha(floatValue8);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue8);
                view3.setAlpha(f16);
                break;
            case 15:
                b3 b3Var = (b3) this.b;
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.c;
                n1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n1Var.c();
                int i11 = n1Var.h;
                if (((i11 >= 0 && i11 <= 2) || (i11 >= 180 && i11 <= 182)) && b3Var.N) {
                    b3Var.M.pause();
                    AnimatorSet animatorSet = b3Var.L;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 16:
                n3 n3Var = (n3) this.b;
                y2 y2Var = (y2) this.c;
                n3Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (n3Var.c - r3)) + n3Var.e);
                n3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (n3Var.d - r3)) + n3Var.f);
                y2Var.invalidate();
                break;
            case 17:
                dy.q1(((hw) this.b).M, (cy) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                View view4 = (View) this.c;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view4.invalidateOutline();
                ImageView imageView = photoViewer.t3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                st0 st0Var = photoViewer.A2;
                if (st0Var != null) {
                    st0Var.invalidateOutline();
                    break;
                }
                break;
            case 19:
                z11 z11Var = (z11) this.b;
                int[] iArr = (int[]) this.c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jb0 jb0Var = z11Var.n;
                if (jb0Var != null) {
                    jb0Var.K = 1.0f;
                    jb0Var.i();
                    z11Var.n.s(1.0f - floatValue9);
                }
                jb0 jb0Var2 = z11Var.h;
                jb0Var2.K = floatValue9;
                jb0Var2.i();
                z11Var.h.s(floatValue9);
                if (iArr != null) {
                    int d = i0.a.d(floatValue9, z11Var.e[0], iArr[0]);
                    int d9 = i0.a.d(floatValue9, z11Var.e[1], iArr[1]);
                    int d10 = i0.a.d(floatValue9, z11Var.e[2], iArr[2]);
                    int d11 = i0.a.d(floatValue9, z11Var.e[3], iArr[3]);
                    u11 u11Var = z11Var.A;
                    u11Var.a.n(d, d9, d10, d11);
                    u11Var.invalidate();
                }
                z11Var.w.invalidate();
                break;
            case 20:
                a6.a aVar = (a6.a) this.b;
                int[] iArr2 = (int[]) this.c;
                aVar.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i12 = intValue - aVar.c;
                ((wk0) aVar.d).scrollBy(0, i12);
                iArr2[0] = iArr2[0] + i12;
                aVar.c = intValue;
                break;
            case 21:
                ph1 ph1Var = (ph1) this.b;
                ji jiVar = (ji) this.c;
                ph1Var.getClass();
                ph1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jiVar.invalidate();
                break;
            case 22:
                TextView textView = (TextView) this.b;
                TextView textView2 = (TextView) this.c;
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                textView2.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                qf.g gVar = (qf.g) this.b;
                sf.d dVar = (sf.d) this.c;
                gVar.getClass();
                dVar.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar.b;
                int size = arrayList3.size();
                while (i9 < size) {
                    Object obj = arrayList3.get(i9);
                    i9++;
                    sf.d dVar2 = (sf.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f = (int) ((dVar2.g / 255.0f) * (255 - dVar.f));
                    }
                }
                gVar.invalidate();
                break;
            case 24:
                qf.g gVar2 = (qf.g) this.b;
                sf.b bVar = (sf.b) this.c;
                gVar2.getClass();
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList4 = gVar2.c;
                int size2 = arrayList4.size();
                while (i9 < size2) {
                    Object obj2 = arrayList4.get(i9);
                    i9++;
                    sf.b bVar2 = (sf.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue10 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue10) * bVar2.e);
                    }
                }
                gVar2.invalidate();
                break;
            case 25:
                qf.n nVar = (qf.n) this.b;
                qf.o oVar = (qf.o) this.c;
                nVar.getClass();
                oVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 26:
                j4.x0 x0Var = (j4.x0) this.b;
                kh.p pVar = (kh.p) this.c;
                x0Var.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x0Var.b = intValue2;
                pVar.h(intValue2);
                break;
            case 27:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.b;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.c;
                v0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w0Var.invalidate();
                break;
            default:
                vf.a aVar2 = (vf.a) this.b;
                int[] iArr3 = (int[]) this.c;
                aVar2.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue11, iArr3[0], aVar2.h[0]), i0.a.d(floatValue11, iArr3[1], aVar2.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar2.b = linearGradient;
                linearGradient.setLocalMatrix(aVar2.c);
                paint.setShader(aVar2.b);
                aVar2.a.setPaint(paint, 0);
                aVar2.g.setColor(i0.a.d(0.1f, i0.a.d(floatValue11, iArr3[1], aVar2.h[1]), -1));
                aVar2.f.setColor(i0.a.d(0.1f, i0.a.d(floatValue11, iArr3[0], aVar2.h[0]), -16777216));
                aVar2.invalidateSelf();
                break;
        }
    }
}
