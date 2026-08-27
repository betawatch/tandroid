package ag;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import hh.kb;
import hh.lb;
import hh.y9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.zk;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.fy;
import org.telegram.ui.gy;
import org.telegram.ui.jo;
import org.telegram.ui.kw;
import org.telegram.ui.oh1;
import org.telegram.ui.rn;
import org.telegram.ui.t11;
import org.telegram.ui.tt0;
import org.telegram.ui.y11;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                x1 x1Var = (x1) this.b;
                Drawable drawable = (Drawable) this.c;
                x1Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((y2) x1Var.c).w0;
                if (!(view instanceof org.telegram.ui.Cells.s1)) {
                    view.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.Cells.s1) view).Z2();
                    break;
                }
            case 1:
                ((f2.l) this.b).P((f2.o1) this.c);
                break;
            case 2:
                lb lbVar = (lb) this.b;
                kb kbVar = (kb) this.c;
                lbVar.getClass();
                kbVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lbVar.R();
                break;
            case 3:
                ig.d0 d0Var = (ig.d0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList.size()) {
                    ig.d0.g((View) arrayList.get(i10), floatValue);
                    i10++;
                }
                d0Var.m.g0.invalidate();
                break;
            case 4:
                jh.o oVar = (jh.o) this.b;
                View view2 = (View) this.c;
                oVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = 1.0f - floatValue2;
                view2.setAlpha(f10);
                view2.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue2);
                oVar.y.setAlpha(floatValue2);
                oVar.y.setTranslationY(AndroidUtilities.dp(5.0f) * f10);
                break;
            case 5:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                boolean[] zArr = (boolean[]) this.c;
                int i11 = ProfileStoriesView.o0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new y9(profileStoriesView, 14), 180L);
                    }
                }
                profileStoriesView.S = Math.max(1.0f, floatValue3);
                profileStoriesView.invalidate();
                break;
            case 6:
                rn rnVar = (rn) this.b;
                rn rnVar2 = (rn) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar2.Q9 = floatValue4;
                rnVar2.fragmentView.invalidate();
                rnVar2.t0.invalidate();
                float f11 = 1.0f - floatValue4;
                float dp = AndroidUtilities.dp(8.0f) * f11;
                rnVar.W0.setTranslationY(dp);
                rnVar.W0.getAvatarImageView().setTranslationY(-dp);
                float f12 = (-AndroidUtilities.dp(8.0f)) * floatValue4;
                rnVar2.W0.setTranslationY(f12);
                rnVar2.W0.getAvatarImageView().setTranslationY(-f12);
                float f13 = (floatValue4 * 0.2f) + 0.8f;
                rnVar.W0.getAvatarImageView().setScaleX(f13);
                rnVar.W0.getAvatarImageView().setScaleY(f13);
                rnVar.W0.getAvatarImageView().setAlpha(floatValue4);
                float f14 = (0.2f * f11) + 0.8f;
                rnVar2.W0.getAvatarImageView().setScaleX(f14);
                rnVar2.W0.getAvatarImageView().setScaleY(f14);
                rnVar2.W0.getAvatarImageView().setAlpha(f11);
                og ogVar = rnVar2.I0;
                if (ogVar != null) {
                    ogVar.setAlpha(f11);
                    break;
                }
                break;
            case 7:
                jo joVar = (jo) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                joVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                joVar.J.setAlpha(floatValue5);
                float f15 = 1.0f - floatValue5;
                joVar.J.setTranslationY(((-r3.getHeight()) / 2.0f) * f15);
                joVar.J.setScaleY((floatValue5 * 0.8f) + 0.2f);
                while (i10 < arrayList2.size()) {
                    ((View) arrayList2.get(i10)).setTranslationY((-joVar.J.getHeight()) * f15);
                    i10++;
                }
                break;
            case 8:
                n9 n9Var = (n9) this.b;
                n9 n9Var2 = (n9) this.c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n9Var.setScaleX(floatValue6);
                n9Var.setScaleY(floatValue6);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !n9Var2.getImageReceiver().hasBitmapImage()) {
                    n9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 9:
                ((va) this.b).accept(Float.valueOf(((jb) this.c).getTranslationY()));
                break;
            case 10:
                ((zk) this.b).accept(Float.valueOf(((jb) this.c).getTranslationY()));
                break;
            case 11:
                mh mhVar = (mh) this.b;
                lt ltVar = (lt) this.c;
                mhVar.getClass();
                ltVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                gi giVar = mhVar.V;
                giVar.U1();
                yh yhVar = giVar.u0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f0;
                if (yhVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(giVar.h2);
                    break;
                }
                break;
            case 12:
                com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) this.b;
                vt vtVar = (vt) this.c;
                lVar.getClass();
                vtVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) lVar.d).size()) {
                    if (!ig.g0.b) {
                        ((View) ((ArrayList) lVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                break;
            case 13:
                mx0 mx0Var = (mx0) this.b;
                lx0[] lx0VarArr = (lx0[]) this.c;
                mx0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < lx0VarArr.length) {
                    mx0Var.c[i10] = (mx0Var.d[i10] * floatValue7) + ((1.0f - floatValue7) * mx0Var.e[i10]);
                    i10++;
                }
                mx0Var.invalidate();
                break;
            case 14:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.b;
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.c;
                k0Var.getClass();
                tVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                k0Var.invalidate();
                break;
            case 15:
                View view3 = (View) this.b;
                View view4 = (View) this.c;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = 1.0f - floatValue8;
                view3.setTranslationY(AndroidUtilities.dp(8.0f) * f16);
                view3.setAlpha(floatValue8);
                view4.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue8);
                view4.setAlpha(f16);
                break;
            case 16:
                org.telegram.ui.Components.voip.b3 b3Var = (org.telegram.ui.Components.voip.b3) this.b;
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.c;
                n1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n1Var.c();
                int i12 = n1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && b3Var.N) {
                    b3Var.M.pause();
                    AnimatorSet animatorSet = b3Var.L;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 17:
                org.telegram.ui.Components.voip.n3 n3Var = (org.telegram.ui.Components.voip.n3) this.b;
                org.telegram.ui.Components.voip.y2 y2Var = (org.telegram.ui.Components.voip.y2) this.c;
                n3Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (n3Var.c - r2)) + n3Var.e);
                n3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (n3Var.d - r2)) + n3Var.f);
                y2Var.invalidate();
                break;
            case 18:
                gy.q1(((kw) this.b).M, (fy) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
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
                tt0 tt0Var = photoViewer.A2;
                if (tt0Var != null) {
                    tt0Var.invalidateOutline();
                    break;
                }
                break;
            case 20:
                y11 y11Var = (y11) this.b;
                int[] iArr = (int[]) this.c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nb0 nb0Var = y11Var.n;
                if (nb0Var != null) {
                    nb0Var.K = 1.0f;
                    nb0Var.i();
                    y11Var.n.s(1.0f - floatValue9);
                }
                nb0 nb0Var2 = y11Var.h;
                nb0Var2.K = floatValue9;
                nb0Var2.i();
                y11Var.h.s(floatValue9);
                if (iArr != null) {
                    int d = i0.b.d(floatValue9, y11Var.e[0], iArr[0]);
                    int d10 = i0.b.d(floatValue9, y11Var.e[1], iArr[1]);
                    int d11 = i0.b.d(floatValue9, y11Var.e[2], iArr[2]);
                    int d12 = i0.b.d(floatValue9, y11Var.e[3], iArr[3]);
                    t11 t11Var = y11Var.A;
                    t11Var.a.n(d, d10, d11, d12);
                    t11Var.invalidate();
                }
                y11Var.w.invalidate();
                break;
            case 21:
                b6.a aVar = (b6.a) this.b;
                int[] iArr2 = (int[]) this.c;
                aVar.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i13 = intValue - aVar.c;
                ((zk0) aVar.d).scrollBy(0, i13);
                iArr2[0] = iArr2[0] + i13;
                aVar.c = intValue;
                break;
            case 22:
                oh1 oh1Var = (oh1) this.b;
                fi fiVar = (fi) this.c;
                oh1Var.getClass();
                oh1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fiVar.invalidate();
                break;
            case 23:
                TextView textView = (TextView) this.b;
                TextView textView2 = (TextView) this.c;
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                textView2.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                rf.g gVar = (rf.g) this.b;
                tf.d dVar = (tf.d) this.c;
                gVar.getClass();
                dVar.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar.b;
                int size = arrayList3.size();
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    tf.d dVar2 = (tf.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f = (int) ((dVar2.g / 255.0f) * (255 - dVar.f));
                    }
                }
                gVar.invalidate();
                break;
            case 25:
                rf.g gVar2 = (rf.g) this.b;
                tf.b bVar = (tf.b) this.c;
                gVar2.getClass();
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList4 = gVar2.c;
                int size2 = arrayList4.size();
                while (i10 < size2) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    tf.b bVar2 = (tf.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue10 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue10) * bVar2.e);
                    }
                }
                gVar2.invalidate();
                break;
            case 26:
                rf.n nVar = (rf.n) this.b;
                rf.o oVar2 = (rf.o) this.c;
                nVar.getClass();
                oVar2.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 27:
                j4.x0 x0Var = (j4.x0) this.b;
                lh.p pVar = (lh.p) this.c;
                x0Var.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x0Var.b = intValue2;
                pVar.d(intValue2);
                break;
            default:
                org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) this.b;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.c;
                u0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v0Var.invalidate();
                break;
        }
    }
}
