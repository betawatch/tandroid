package bg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b4.e0;
import cb.m;
import eg.w2;
import eg.y2;
import f2.l;
import f2.m1;
import fg.d2;
import java.util.ArrayList;
import mh.fb;
import mh.gb;
import ng.d0;
import ng.g0;
import oh.o;
import oh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.voip.a3;
import org.telegram.ui.Components.voip.d3;
import org.telegram.ui.Components.voip.l0;
import org.telegram.ui.Components.voip.o1;
import org.telegram.ui.Components.voip.p3;
import org.telegram.ui.Components.voip.u;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xt;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cu0;
import org.telegram.ui.fi1;
import org.telegram.ui.j21;
import org.telegram.ui.o21;
import org.telegram.ui.oy;
import org.telegram.ui.po;
import org.telegram.ui.py;
import org.telegram.ui.tw;
import org.telegram.ui.xn;
import wf.g;
import wf.n;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 1;
        int i11 = 0;
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                int[] iArr = (int[]) this.c;
                bVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue, iArr[0], bVar.h[0]), i0.a.d(floatValue, iArr[1], bVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                bVar.b = linearGradient;
                linearGradient.setLocalMatrix(bVar.c);
                paint.setShader(bVar.b);
                bVar.a.setPaint(paint, 0);
                bVar.g.setColor(i0.a.d(0.1f, i0.a.d(floatValue, iArr[1], bVar.h[1]), -1));
                bVar.f.setColor(i0.a.d(0.1f, i0.a.d(floatValue, iArr[0], bVar.h[0]), -16777216));
                bVar.invalidateSelf();
                break;
            case 1:
                y2 y2Var = (y2) this.b;
                boolean[] zArr = (boolean[]) this.c;
                y2Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 >= 0.5f) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        y2Var.o0.b(y2Var.v0, false);
                    }
                    float f10 = (floatValue2 - 0.5f) / 0.5f;
                    y2Var.setRotationY((1.0f - f10) * (-90.0f));
                    y2Var.w0 = (f10 * 0.3f) + 0.7f;
                    y2Var.invalidate();
                    break;
                } else {
                    float f11 = floatValue2 / 0.5f;
                    y2Var.setRotationY(90.0f * f11);
                    y2Var.w0 = ((1.0f - f11) * 0.3f) + 0.7f;
                    y2Var.invalidate();
                    break;
                }
            case 2:
                ((l) this.b).P((m1) this.c);
                break;
            case 3:
                w2 w2Var = (w2) this.b;
                Drawable drawable = (Drawable) this.c;
                w2Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((d2) w2Var.c).x0;
                if (!(view instanceof t1)) {
                    view.invalidate();
                    break;
                } else {
                    ((t1) view).a3();
                    break;
                }
            case 4:
                gb gbVar = (gb) this.b;
                fb fbVar = (fb) this.c;
                gbVar.getClass();
                fbVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gbVar.M();
                break;
            case 5:
                d0 d0Var = (d0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i11 < arrayList.size()) {
                    d0.g((View) arrayList.get(i11), floatValue3);
                    i11++;
                }
                d0Var.m.h0.invalidate();
                break;
            case 6:
                o oVar = (o) this.b;
                View view2 = (View) this.c;
                oVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue4;
                view2.setAlpha(f12);
                view2.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue4);
                oVar.y.setAlpha(floatValue4);
                oVar.y.setTranslationY(AndroidUtilities.dp(5.0f) * f12);
                break;
            case 7:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                int i12 = ProfileStoriesView.p0;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr2[0] && floatValue5 > 0.2f) {
                    zArr2[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new t3(profileStoriesView, i10), 180L);
                    }
                }
                profileStoriesView.T = Math.max(1.0f, floatValue5);
                profileStoriesView.invalidate();
                break;
            case 8:
                xn xnVar = (xn) this.b;
                xn xnVar2 = (xn) this.c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar2.R9 = floatValue6;
                xnVar2.fragmentView.invalidate();
                xnVar2.u0.invalidate();
                float f13 = 1.0f - floatValue6;
                float dp = AndroidUtilities.dp(8.0f) * f13;
                xnVar.X0.setTranslationY(dp);
                xnVar.X0.getAvatarImageView().setTranslationY(-dp);
                float f14 = (-AndroidUtilities.dp(8.0f)) * floatValue6;
                xnVar2.X0.setTranslationY(f14);
                xnVar2.X0.getAvatarImageView().setTranslationY(-f14);
                float f15 = (floatValue6 * 0.2f) + 0.8f;
                xnVar.X0.getAvatarImageView().setScaleX(f15);
                xnVar.X0.getAvatarImageView().setScaleY(f15);
                xnVar.X0.getAvatarImageView().setAlpha(floatValue6);
                float f16 = (0.2f * f13) + 0.8f;
                xnVar2.X0.getAvatarImageView().setScaleX(f16);
                xnVar2.X0.getAvatarImageView().setScaleY(f16);
                xnVar2.X0.getAvatarImageView().setAlpha(f13);
                sg sgVar = xnVar2.J0;
                if (sgVar != null) {
                    sgVar.setAlpha(f13);
                    break;
                }
                break;
            case 9:
                po poVar = (po) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                poVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                poVar.K.setAlpha(floatValue7);
                float f17 = 1.0f - floatValue7;
                poVar.K.setTranslationY(((-r5.getHeight()) / 2.0f) * f17);
                poVar.K.setScaleY((floatValue7 * 0.8f) + 0.2f);
                while (i11 < arrayList2.size()) {
                    ((View) arrayList2.get(i11)).setTranslationY((-poVar.K.getHeight()) * f17);
                    i11++;
                }
                break;
            case 10:
                p9 p9Var = (p9) this.b;
                p9 p9Var2 = (p9) this.c;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9Var.setScaleX(floatValue8);
                p9Var.setScaleY(floatValue8);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !p9Var2.getImageReceiver().hasBitmapImage()) {
                    p9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 11:
                ((xa) this.b).accept(Float.valueOf(((nb) this.c).getTranslationY()));
                break;
            case 12:
                ((il) this.b).accept(Float.valueOf(((nb) this.c).getTranslationY()));
                break;
            case 13:
                qh qhVar = (qh) this.b;
                xt xtVar = (xt) this.c;
                qhVar.getClass();
                xtVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mi miVar = qhVar.W;
                miVar.U1();
                ei eiVar = miVar.v0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar.g0;
                if (eiVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(miVar.i2);
                    break;
                }
                break;
            case 14:
                m mVar = (m) this.b;
                hu huVar = (hu) this.c;
                mVar.getClass();
                huVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i11 < ((ArrayList) mVar.d).size()) {
                    if (!g0.b) {
                        ((View) ((ArrayList) mVar.d).get(i11)).invalidate();
                    }
                    i11++;
                }
                break;
            case 15:
                gy0 gy0Var = (gy0) this.b;
                fy0[] fy0VarArr = (fy0[]) this.c;
                gy0Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i11 < fy0VarArr.length) {
                    gy0Var.c[i11] = (gy0Var.d[i11] * floatValue9) + ((1.0f - floatValue9) * gy0Var.e[i11]);
                    i11++;
                }
                gy0Var.invalidate();
                break;
            case 16:
                l0 l0Var = (l0) this.b;
                u uVar = (u) this.c;
                l0Var.getClass();
                uVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l0Var.invalidate();
                break;
            case 17:
                View view3 = (View) this.b;
                View view4 = (View) this.c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f18 = 1.0f - floatValue10;
                view3.setTranslationY(AndroidUtilities.dp(8.0f) * f18);
                view3.setAlpha(floatValue10);
                view4.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue10);
                view4.setAlpha(f18);
                break;
            case 18:
                d3 d3Var = (d3) this.b;
                o1 o1Var = (o1) this.c;
                o1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o1Var.c();
                int i13 = o1Var.h;
                if (((i13 >= 0 && i13 <= 2) || (i13 >= 180 && i13 <= 182)) && d3Var.O) {
                    d3Var.N.pause();
                    AnimatorSet animatorSet = d3Var.M;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 19:
                p3 p3Var = (p3) this.b;
                a3 a3Var = (a3) this.c;
                p3Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.c - r3)) + p3Var.e);
                p3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.d - r3)) + p3Var.f);
                a3Var.invalidate();
                break;
            case 20:
                py.q1(((tw) this.b).M, (oy) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                View view5 = (View) this.c;
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.getClass();
                photoViewer.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view5.invalidateOutline();
                ImageView imageView = photoViewer.u3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                cu0 cu0Var = photoViewer.B2;
                if (cu0Var != null) {
                    cu0Var.invalidateOutline();
                    break;
                }
                break;
            case 22:
                o21 o21Var = (o21) this.b;
                int[] iArr2 = (int[]) this.c;
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc0 fc0Var = o21Var.n;
                if (fc0Var != null) {
                    fc0Var.K = 1.0f;
                    fc0Var.i();
                    o21Var.n.s(1.0f - floatValue11);
                }
                fc0 fc0Var2 = o21Var.h;
                fc0Var2.K = floatValue11;
                fc0Var2.i();
                o21Var.h.s(floatValue11);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue11, o21Var.e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue11, o21Var.e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue11, o21Var.e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue11, o21Var.e[3], iArr2[3]);
                    j21 j21Var = o21Var.B;
                    j21Var.a.n(d, d10, d11, d12);
                    j21Var.invalidate();
                }
                o21Var.w.invalidate();
                break;
            case 23:
                e0 e0Var = (e0) this.b;
                int[] iArr3 = (int[]) this.c;
                e0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i14 = intValue - e0Var.b;
                ((tl0) e0Var.d).scrollBy(0, i14);
                iArr3[0] = iArr3[0] + i14;
                e0Var.b = intValue;
                break;
            case 24:
                fi1 fi1Var = (fi1) this.b;
                li liVar = (li) this.c;
                fi1Var.getClass();
                fi1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                liVar.invalidate();
                break;
            case 25:
                TextView textView = (TextView) this.b;
                TextView textView2 = (TextView) this.c;
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                textView2.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 26:
                g gVar = (g) this.b;
                yf.d dVar = (yf.d) this.c;
                gVar.getClass();
                dVar.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar.b;
                int size = arrayList3.size();
                while (i11 < size) {
                    Object obj = arrayList3.get(i11);
                    i11++;
                    yf.d dVar2 = (yf.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f = (int) ((dVar2.g / 255.0f) * (255 - dVar.f));
                    }
                }
                gVar.invalidate();
                break;
            case 27:
                g gVar2 = (g) this.b;
                yf.b bVar2 = (yf.b) this.c;
                gVar2.getClass();
                float floatValue12 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList4 = gVar2.c;
                int size2 = arrayList4.size();
                while (i11 < size2) {
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    yf.b bVar3 = (yf.b) obj2;
                    if (bVar3 == bVar2) {
                        bVar2.d = (int) (floatValue12 * 255.0f);
                    } else {
                        bVar3.d = (int) ((1.0f - floatValue12) * bVar3.e);
                    }
                }
                gVar2.invalidate();
                break;
            default:
                n nVar = (n) this.b;
                wf.o oVar2 = (wf.o) this.c;
                nVar.getClass();
                oVar2.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
        }
    }
}
