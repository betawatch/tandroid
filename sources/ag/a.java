package ag;

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
import dg.a3;
import dg.y2;
import eg.e2;
import f2.l;
import f2.l1;
import java.util.ArrayList;
import lh.fb;
import lh.gb;
import mg.d0;
import mg.g0;
import nh.p;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.voip.c3;
import org.telegram.ui.Components.voip.k0;
import org.telegram.ui.Components.voip.n1;
import org.telegram.ui.Components.voip.o3;
import org.telegram.ui.Components.voip.t;
import org.telegram.ui.Components.voip.z2;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.xa;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.au0;
import org.telegram.ui.di1;
import org.telegram.ui.h21;
import org.telegram.ui.m21;
import org.telegram.ui.ny;
import org.telegram.ui.oy;
import org.telegram.ui.po;
import org.telegram.ui.sw;
import org.telegram.ui.xn;
import vf.g;
import vf.n;
import vf.o;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        int i10 = 0;
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
                a3 a3Var = (a3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                a3Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 >= 0.5f) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        a3Var.o0.b(a3Var.v0, false);
                    }
                    float f10 = (floatValue2 - 0.5f) / 0.5f;
                    a3Var.setRotationY((1.0f - f10) * (-90.0f));
                    a3Var.w0 = (f10 * 0.3f) + 0.7f;
                    a3Var.invalidate();
                    break;
                } else {
                    float f11 = floatValue2 / 0.5f;
                    a3Var.setRotationY(90.0f * f11);
                    a3Var.w0 = ((1.0f - f11) * 0.3f) + 0.7f;
                    a3Var.invalidate();
                    break;
                }
            case 2:
                y2 y2Var = (y2) this.b;
                Drawable drawable = (Drawable) this.c;
                y2Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((e2) y2Var.c).x0;
                if (!(view instanceof t1)) {
                    view.invalidate();
                    break;
                } else {
                    ((t1) view).a3();
                    break;
                }
            case 3:
                ((l) this.b).P((l1) this.c);
                break;
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
                while (i10 < arrayList.size()) {
                    d0.g((View) arrayList.get(i10), floatValue3);
                    i10++;
                }
                d0Var.m.h0.invalidate();
                break;
            case 6:
                p pVar = (p) this.b;
                View view2 = (View) this.c;
                pVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue4;
                view2.setAlpha(f12);
                view2.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue4);
                pVar.y.setAlpha(floatValue4);
                pVar.y.setTranslationY(AndroidUtilities.dp(5.0f) * f12);
                break;
            case 7:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                int i11 = ProfileStoriesView.p0;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr2[0] && floatValue5 > 0.2f) {
                    zArr2[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new lh.b(profileStoriesView, 28), 180L);
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
                while (i10 < arrayList2.size()) {
                    ((View) arrayList2.get(i10)).setTranslationY((-poVar.K.getHeight()) * f17);
                    i10++;
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
                ((gl) this.b).accept(Float.valueOf(((nb) this.c).getTranslationY()));
                break;
            case 13:
                qh qhVar = (qh) this.b;
                vt vtVar = (vt) this.c;
                qhVar.getClass();
                vtVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                li liVar = qhVar.W;
                liVar.U1();
                di diVar = liVar.v0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.g0;
                if (diVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(liVar.i2);
                    break;
                }
                break;
            case 14:
                m mVar = (m) this.b;
                fu fuVar = (fu) this.c;
                mVar.getClass();
                fuVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!g0.b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                break;
            case 15:
                fy0 fy0Var = (fy0) this.b;
                ey0[] ey0VarArr = (ey0[]) this.c;
                fy0Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < ey0VarArr.length) {
                    fy0Var.c[i10] = (fy0Var.d[i10] * floatValue9) + ((1.0f - floatValue9) * fy0Var.e[i10]);
                    i10++;
                }
                fy0Var.invalidate();
                break;
            case 16:
                k0 k0Var = (k0) this.b;
                t tVar = (t) this.c;
                k0Var.getClass();
                tVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                k0Var.invalidate();
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
                c3 c3Var = (c3) this.b;
                n1 n1Var = (n1) this.c;
                n1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n1Var.c();
                int i12 = n1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && c3Var.O) {
                    c3Var.N.pause();
                    AnimatorSet animatorSet = c3Var.M;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 19:
                o3 o3Var = (o3) this.b;
                z2 z2Var = (z2) this.c;
                o3Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.c - r3)) + o3Var.e);
                o3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.d - r3)) + o3Var.f);
                z2Var.invalidate();
                break;
            case 20:
                oy.q1(((sw) this.b).M, (ny) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                au0 au0Var = photoViewer.B2;
                if (au0Var != null) {
                    au0Var.invalidateOutline();
                    break;
                }
                break;
            case 22:
                m21 m21Var = (m21) this.b;
                int[] iArr2 = (int[]) this.c;
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dc0 dc0Var = m21Var.n;
                if (dc0Var != null) {
                    dc0Var.K = 1.0f;
                    dc0Var.i();
                    m21Var.n.s(1.0f - floatValue11);
                }
                dc0 dc0Var2 = m21Var.h;
                dc0Var2.K = floatValue11;
                dc0Var2.i();
                m21Var.h.s(floatValue11);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue11, m21Var.e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue11, m21Var.e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue11, m21Var.e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue11, m21Var.e[3], iArr2[3]);
                    h21 h21Var = m21Var.B;
                    h21Var.a.n(d, d10, d11, d12);
                    h21Var.invalidate();
                }
                m21Var.w.invalidate();
                break;
            case 23:
                e0 e0Var = (e0) this.b;
                int[] iArr3 = (int[]) this.c;
                e0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i13 = intValue - e0Var.b;
                ((sl0) e0Var.d).scrollBy(0, i13);
                iArr3[0] = iArr3[0] + i13;
                e0Var.b = intValue;
                break;
            case 24:
                di1 di1Var = (di1) this.b;
                ki kiVar = (ki) this.c;
                di1Var.getClass();
                di1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kiVar.invalidate();
                break;
            case 25:
                TextView textView = (TextView) this.b;
                TextView textView2 = (TextView) this.c;
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                textView2.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 26:
                g gVar = (g) this.b;
                xf.d dVar = (xf.d) this.c;
                gVar.getClass();
                dVar.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar.b;
                int size = arrayList3.size();
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    xf.d dVar2 = (xf.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f = (int) ((dVar2.g / 255.0f) * (255 - dVar.f));
                    }
                }
                gVar.invalidate();
                break;
            case 27:
                g gVar2 = (g) this.b;
                xf.b bVar2 = (xf.b) this.c;
                gVar2.getClass();
                float floatValue12 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList4 = gVar2.c;
                int size2 = arrayList4.size();
                while (i10 < size2) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    xf.b bVar3 = (xf.b) obj2;
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
                o oVar = (o) this.c;
                nVar.getClass();
                oVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
        }
    }
}
