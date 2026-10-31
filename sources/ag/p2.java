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
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uh;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ay;
import org.telegram.ui.fe1;
import org.telegram.ui.hw;
import org.telegram.ui.oo;
import org.telegram.ui.un;
import org.telegram.ui.zr0;
import org.telegram.ui.zx;
import rh.a9;
import rh.z8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                TextView textView = (TextView) this.b;
                TextView textView2 = (TextView) this.c;
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                textView2.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                bg.i iVar = (bg.i) this.b;
                dg.e eVar = (dg.e) this.c;
                iVar.getClass();
                eVar.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = iVar.b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    dg.e eVar2 = (dg.e) obj;
                    if (eVar2 != eVar) {
                        eVar2.f = (int) ((eVar2.g / 255.0f) * (255 - eVar.f));
                    }
                }
                iVar.invalidate();
                break;
            case 2:
                bg.i iVar2 = (bg.i) this.b;
                dg.b bVar = (dg.b) this.c;
                iVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = iVar2.c;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    dg.b bVar2 = (dg.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue) * bVar2.e);
                    }
                }
                iVar2.invalidate();
                break;
            case 3:
                bg.s sVar = (bg.s) this.b;
                bg.t tVar = (bg.t) this.c;
                sVar.getClass();
                tVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                break;
            case 4:
                bi.d0 d0Var = (bi.d0) this.b;
                a1.c cVar = (a1.c) this.c;
                d0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d0Var.a = intValue;
                cVar.d(intValue);
                break;
            case 5:
                org.telegram.ui.Cells.r0 r0Var = (org.telegram.ui.Cells.r0) this.b;
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) this.c;
                r0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s0Var.invalidate();
                break;
            case 6:
                gg.a aVar = (gg.a) this.b;
                int[] iArr = (int[]) this.c;
                aVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.b.f(floatValue2, iArr[0], aVar.h[0]), i0.b.f(floatValue2, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.b = linearGradient;
                linearGradient.setLocalMatrix(aVar.c);
                paint.setShader(aVar.b);
                aVar.a.r.put(0, paint);
                aVar.g.setColor(i0.b.f(0.1f, i0.b.f(floatValue2, iArr[1], aVar.h[1]), -1));
                aVar.f.setColor(i0.b.f(0.1f, i0.b.f(floatValue2, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                break;
            case 7:
                jg.h2 h2Var = (jg.h2) this.b;
                boolean[] zArr = (boolean[]) this.c;
                h2Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue3 >= 0.5f) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        h2Var.r0.b(h2Var.y0, false);
                    }
                    float f7 = (floatValue3 - 0.5f) / 0.5f;
                    h2Var.setRotationY((1.0f - f7) * (-90.0f));
                    h2Var.z0 = (f7 * 0.3f) + 0.7f;
                    h2Var.invalidate();
                    break;
                } else {
                    float f10 = floatValue3 / 0.5f;
                    h2Var.setRotationY(90.0f * f10);
                    h2Var.z0 = ((1.0f - f10) * 0.3f) + 0.7f;
                    h2Var.invalidate();
                    break;
                }
            case 8:
                bg.f fVar = (bg.f) this.b;
                Drawable drawable = (Drawable) this.c;
                fVar.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((kg.v1) fVar.b).s2;
                if (!(view instanceof org.telegram.ui.Cells.q1)) {
                    view.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.Cells.q1) view).n2();
                    break;
                }
            case 9:
                un unVar = (un) this.b;
                un unVar2 = (un) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar2.na = floatValue4;
                unVar2.fragmentView.invalidate();
                unVar2.z0.invalidate();
                float f11 = 1.0f - floatValue4;
                float L = org.telegram.messenger.i0.L(8.0f) * f11;
                unVar.o1.setTranslationY(L);
                unVar.o1.getAvatarImageView().setTranslationY(-L);
                float f12 = (-org.telegram.messenger.i0.L(8.0f)) * floatValue4;
                unVar2.o1.setTranslationY(f12);
                unVar2.o1.getAvatarImageView().setTranslationY(-f12);
                float f13 = (floatValue4 * 0.2f) + 0.8f;
                unVar.o1.getAvatarImageView().setScaleX(f13);
                unVar.o1.getAvatarImageView().setScaleY(f13);
                unVar.o1.getAvatarImageView().setAlpha(floatValue4);
                float f14 = (0.2f * f11) + 0.8f;
                unVar2.o1.getAvatarImageView().setScaleX(f14);
                unVar2.o1.getAvatarImageView().setScaleY(f14);
                unVar2.o1.getAvatarImageView().setAlpha(f11);
                hg hgVar = unVar2.a1;
                if (hgVar != null) {
                    hgVar.setAlpha(f11);
                    break;
                }
                break;
            case 10:
                oo ooVar = (oo) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ooVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ooVar.N.setAlpha(floatValue5);
                float f15 = 1.0f - floatValue5;
                ooVar.N.setTranslationY(((-r7.getHeight()) / 2.0f) * f15);
                ooVar.N.setScaleY((floatValue5 * 0.8f) + 0.2f);
                while (i10 < arrayList3.size()) {
                    ((View) arrayList3.get(i10)).setTranslationY((-ooVar.N.getHeight()) * f15);
                    i10++;
                }
                break;
            case 11:
                g9 g9Var = (g9) this.b;
                g9 g9Var2 = (g9) this.c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9Var.setScaleX(floatValue6);
                g9Var.setScaleY(floatValue6);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !g9Var2.getImageReceiver().I()) {
                    g9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 12:
                ((ma) this.b).accept(Float.valueOf(((bb) this.c).getTranslationY()));
                break;
            case 13:
                ((gl) this.b).accept(Float.valueOf(((bb) this.c).getTranslationY()));
                break;
            case 14:
                dh dhVar = (dh) this.b;
                mt mtVar = (mt) this.c;
                dhVar.getClass();
                mtVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                bi biVar = dhVar.c0;
                biVar.I1();
                uh uhVar = biVar.s2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
                if (uhVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.l(biVar.f4);
                    break;
                }
                break;
            case 15:
                ac.a aVar2 = (ac.a) this.b;
                org.telegram.messenger.u uVar = (org.telegram.messenger.u) this.c;
                aVar2.getClass();
                uVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) aVar2.d).size()) {
                    if (!sg.e0.b) {
                        ((View) ((ArrayList) aVar2.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                break;
            case 16:
                jx0 jx0Var = (jx0) this.b;
                ix0[] ix0VarArr = (ix0[]) this.c;
                jx0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < ix0VarArr.length) {
                    jx0Var.c[i10] = (jx0Var.d[i10] * floatValue7) + ((1.0f - floatValue7) * jx0Var.e[i10]);
                    i10++;
                }
                jx0Var.invalidate();
                break;
            case 17:
                org.telegram.ui.Components.voip.w wVar = (org.telegram.ui.Components.voip.w) this.b;
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.c;
                wVar.getClass();
                rVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                wVar.invalidate();
                break;
            case 18:
                View view2 = (View) this.b;
                View view3 = (View) this.c;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = 1.0f - floatValue8;
                view2.setTranslationY(org.telegram.messenger.i0.L(8.0f) * f16);
                view2.setAlpha(floatValue8);
                view3.setTranslationY((-org.telegram.messenger.i0.L(6.0f)) * floatValue8);
                view3.setAlpha(f16);
                break;
            case 19:
                org.telegram.ui.Components.voip.j2 j2Var = (org.telegram.ui.Components.voip.j2) this.b;
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.c;
                x0Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x0Var.c();
                int i11 = x0Var.h;
                if (((i11 >= 0 && i11 <= 2) || (i11 >= 180 && i11 <= 182)) && j2Var.R) {
                    j2Var.Q.pause();
                    AnimatorSet animatorSet = j2Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 20:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.b;
                org.telegram.ui.Components.voip.f2 f2Var = (org.telegram.ui.Components.voip.f2) this.c;
                v2Var.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (v2Var.c - r3)) + v2Var.e);
                v2Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (v2Var.d - r3)) + v2Var.f);
                f2Var.invalidate();
                break;
            case 21:
                ay.t1(((hw) this.b).M, (zx) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                zr0 zr0Var = photoViewer.E2;
                if (zr0Var != null) {
                    zr0Var.invalidateOutline();
                    break;
                }
                break;
            case 23:
                a5.a aVar3 = (a5.a) this.b;
                int[] iArr2 = (int[]) this.c;
                aVar3.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i12 = intValue2 - aVar3.b;
                ((tk0) aVar3.d).scrollBy(0, i12);
                iArr2[0] = iArr2[0] + i12;
                aVar3.b = intValue2;
                break;
            case 24:
                fe1 fe1Var = (fe1) this.b;
                ih.e eVar3 = (ih.e) this.c;
                fe1Var.getClass();
                fe1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar3.invalidate();
                break;
            case 25:
                ((View) ((g.b0) ((a4.l) this.b).b).d.getParent()).invalidate();
                break;
            case 26:
                a9 a9Var = (a9) this.b;
                z8 z8Var = (z8) this.c;
                a9Var.getClass();
                z8Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a9Var.f1();
                break;
            case 27:
                ((s4.j) this.b).P((s4.c1) this.c);
                break;
            default:
                sg.b0 b0Var = (sg.b0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList4.size()) {
                    sg.b0.g((View) arrayList4.get(i10), floatValue9);
                    i10++;
                }
                b0Var.m.k0.invalidate();
                break;
        }
    }
}
