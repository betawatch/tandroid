package bg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import jh.eb;
import jh.fb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a21;
import org.telegram.ui.ey;
import org.telegram.ui.fy;
import org.telegram.ui.jw;
import org.telegram.ui.ko;
import org.telegram.ui.qt0;
import org.telegram.ui.rh1;
import org.telegram.ui.tn;
import org.telegram.ui.v11;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                e3 e3Var = (e3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                e3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue >= 0.5f) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        e3Var.n0.b(e3Var.u0, false);
                    }
                    float f9 = (floatValue - 0.5f) / 0.5f;
                    e3Var.setRotationY((1.0f - f9) * (-90.0f));
                    e3Var.v0 = (f9 * 0.3f) + 0.7f;
                    e3Var.invalidate();
                    break;
                } else {
                    float f10 = floatValue / 0.5f;
                    e3Var.setRotationY(90.0f * f10);
                    e3Var.v0 = ((1.0f - f10) * 0.3f) + 0.7f;
                    e3Var.invalidate();
                    break;
                }
            case 1:
                c3 c3Var = (c3) this.b;
                Drawable drawable = (Drawable) this.c;
                c3Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((cg.f2) c3Var.c).w0;
                if (!(view instanceof org.telegram.ui.Cells.s1)) {
                    view.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.Cells.s1) view).a3();
                    break;
                }
            case 2:
                ((f2.l) this.b).P((f2.n1) this.c);
                break;
            case 3:
                fb fbVar = (fb) this.b;
                eb ebVar = (eb) this.c;
                fbVar.getClass();
                ebVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fbVar.R();
                break;
            case 4:
                kg.d0 d0Var = (kg.d0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList.size()) {
                    kg.d0.g((View) arrayList.get(i10), floatValue2);
                    i10++;
                }
                d0Var.m.g0.invalidate();
                break;
            case 5:
                lh.o oVar = (lh.o) this.b;
                View view2 = (View) this.c;
                oVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f11 = 1.0f - floatValue3;
                view2.setAlpha(f11);
                view2.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue3);
                oVar.y.setAlpha(floatValue3);
                oVar.y.setTranslationY(AndroidUtilities.dp(5.0f) * f11);
                break;
            case 6:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                int i11 = ProfileStoriesView.o0;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr2[0] && floatValue4 > 0.2f) {
                    zArr2[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new jh.o(profileStoriesView, 28), 180L);
                    }
                }
                profileStoriesView.S = Math.max(1.0f, floatValue4);
                profileStoriesView.invalidate();
                break;
            case 7:
                tn tnVar = (tn) this.b;
                tn tnVar2 = (tn) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar2.Q9 = floatValue5;
                tnVar2.fragmentView.invalidate();
                tnVar2.t0.invalidate();
                float f12 = 1.0f - floatValue5;
                float dp = AndroidUtilities.dp(8.0f) * f12;
                tnVar.W0.setTranslationY(dp);
                tnVar.W0.getAvatarImageView().setTranslationY(-dp);
                float f13 = (-AndroidUtilities.dp(8.0f)) * floatValue5;
                tnVar2.W0.setTranslationY(f13);
                tnVar2.W0.getAvatarImageView().setTranslationY(-f13);
                float f14 = (floatValue5 * 0.2f) + 0.8f;
                tnVar.W0.getAvatarImageView().setScaleX(f14);
                tnVar.W0.getAvatarImageView().setScaleY(f14);
                tnVar.W0.getAvatarImageView().setAlpha(floatValue5);
                float f15 = (0.2f * f12) + 0.8f;
                tnVar2.W0.getAvatarImageView().setScaleX(f15);
                tnVar2.W0.getAvatarImageView().setScaleY(f15);
                tnVar2.W0.getAvatarImageView().setAlpha(f12);
                vg vgVar = tnVar2.I0;
                if (vgVar != null) {
                    vgVar.setAlpha(f12);
                    break;
                }
                break;
            case 8:
                ko koVar = (ko) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                koVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                koVar.J.setAlpha(floatValue6);
                float f16 = 1.0f - floatValue6;
                koVar.J.setTranslationY(((-r3.getHeight()) / 2.0f) * f16);
                koVar.J.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i10 < arrayList2.size()) {
                    ((View) arrayList2.get(i10)).setTranslationY((-koVar.J.getHeight()) * f16);
                    i10++;
                }
                break;
            case 9:
                t9 t9Var = (t9) this.b;
                t9 t9Var2 = (t9) this.c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9Var.setScaleX(floatValue7);
                t9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !t9Var2.getImageReceiver().hasBitmapImage()) {
                    t9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 10:
                ((cb) this.b).accept(Float.valueOf(((rb) this.c).getTranslationY()));
                break;
            case 11:
                ((hl) this.b).accept(Float.valueOf(((rb) this.c).getTranslationY()));
                break;
            case 12:
                th thVar = (th) this.b;
                st stVar = (st) this.c;
                thVar.getClass();
                stVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ni niVar = thVar.V;
                niVar.U1();
                fi fiVar = niVar.u0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f0;
                if (fiVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(niVar.h2);
                    break;
                }
                break;
            case 13:
                ab.m mVar = (ab.m) this.b;
                cu cuVar = (cu) this.c;
                mVar.getClass();
                cuVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!kg.g0.b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                break;
            case 14:
                vx0 vx0Var = (vx0) this.b;
                ux0[] ux0VarArr = (ux0[]) this.c;
                vx0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < ux0VarArr.length) {
                    vx0Var.c[i10] = (vx0Var.d[i10] * floatValue8) + ((1.0f - floatValue8) * vx0Var.e[i10]);
                    i10++;
                }
                vx0Var.invalidate();
                break;
            case 15:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.c;
                l0Var.getClass();
                uVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l0Var.invalidate();
                break;
            case 16:
                View view3 = (View) this.b;
                View view4 = (View) this.c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f17 = 1.0f - floatValue9;
                view3.setTranslationY(AndroidUtilities.dp(8.0f) * f17);
                view3.setAlpha(floatValue9);
                view4.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue9);
                view4.setAlpha(f17);
                break;
            case 17:
                org.telegram.ui.Components.voip.e3 e3Var2 = (org.telegram.ui.Components.voip.e3) this.b;
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.c;
                o1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o1Var.c();
                int i12 = o1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && e3Var2.N) {
                    e3Var2.M.pause();
                    AnimatorSet animatorSet = e3Var2.L;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 18:
                org.telegram.ui.Components.voip.q3 q3Var = (org.telegram.ui.Components.voip.q3) this.b;
                org.telegram.ui.Components.voip.b3 b3Var = (org.telegram.ui.Components.voip.b3) this.c;
                q3Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (q3Var.c - r2)) + q3Var.e);
                q3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (q3Var.d - r2)) + q3Var.f);
                b3Var.invalidate();
                break;
            case 19:
                fy.q1(((jw) this.b).M, (ey) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                View view5 = (View) this.c;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view5.invalidateOutline();
                ImageView imageView = photoViewer.t3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                qt0 qt0Var = photoViewer.A2;
                if (qt0Var != null) {
                    qt0Var.invalidateOutline();
                    break;
                }
                break;
            case 21:
                a21 a21Var = (a21) this.b;
                int[] iArr = (int[]) this.c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yb0 yb0Var = a21Var.n;
                if (yb0Var != null) {
                    yb0Var.K = 1.0f;
                    yb0Var.i();
                    a21Var.n.s(1.0f - floatValue10);
                }
                yb0 yb0Var2 = a21Var.h;
                yb0Var2.K = floatValue10;
                yb0Var2.i();
                a21Var.h.s(floatValue10);
                if (iArr != null) {
                    int d = i0.a.d(floatValue10, a21Var.e[0], iArr[0]);
                    int d10 = i0.a.d(floatValue10, a21Var.e[1], iArr[1]);
                    int d11 = i0.a.d(floatValue10, a21Var.e[2], iArr[2]);
                    int d12 = i0.a.d(floatValue10, a21Var.e[3], iArr[3]);
                    v11 v11Var = a21Var.A;
                    v11Var.a.n(d, d10, d11, d12);
                    v11Var.invalidate();
                }
                a21Var.w.invalidate();
                break;
            case 22:
                ag.j2 j2Var = (ag.j2) this.b;
                int[] iArr2 = (int[]) this.c;
                j2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i13 = intValue - j2Var.b;
                ((jl0) j2Var.d).scrollBy(0, i13);
                iArr2[0] = iArr2[0] + i13;
                j2Var.b = intValue;
                break;
            case 23:
                rh1 rh1Var = (rh1) this.b;
                mi miVar = (mi) this.c;
                rh1Var.getClass();
                rh1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                miVar.invalidate();
                break;
            case 24:
                TextView textView = (TextView) this.b;
                TextView textView2 = (TextView) this.c;
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                textView2.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                tf.g gVar = (tf.g) this.b;
                vf.d dVar = (vf.d) this.c;
                gVar.getClass();
                dVar.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar.b;
                int size = arrayList3.size();
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    vf.d dVar2 = (vf.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f = (int) ((dVar2.g / 255.0f) * (255 - dVar.f));
                    }
                }
                gVar.invalidate();
                break;
            case 26:
                tf.g gVar2 = (tf.g) this.b;
                vf.b bVar = (vf.b) this.c;
                gVar2.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList4 = gVar2.c;
                int size2 = arrayList4.size();
                while (i10 < size2) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    vf.b bVar2 = (vf.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue11 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue11) * bVar2.e);
                    }
                }
                gVar2.invalidate();
                break;
            case 27:
                tf.n nVar = (tf.n) this.b;
                tf.o oVar2 = (tf.o) this.c;
                nVar.getClass();
                oVar2.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            default:
                l4.y0 y0Var = (l4.y0) this.b;
                sf.f1 f1Var = (sf.f1) this.c;
                y0Var.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y0Var.b = intValue2;
                f1Var.d(intValue2);
                break;
        }
    }
}
