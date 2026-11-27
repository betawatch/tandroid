// default package

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class bb2 extends zb3 {
    public static final k43 V = new k43(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final zu1 F;
    public final d79 G;
    public boolean N;
    public f89 O;
    public y92 P;
    public boolean Q;
    public final vnb R;
    public wo1 T;
    public fl1 U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public bb2(zu1 zu1Var, d79 d79Var, vnb vnbVar) {
        this.R = vnbVar;
        this.F = zu1Var;
        this.G = d79Var;
        this.o = V;
        this.n = true;
        this.m = false;
    }

    @Override // zb3
    public final void B(xb3 xb3Var) {
        bb2 bb2Var;
        xb3 xb3Var2;
        f89 f89Var = xb3Var.a;
        View view = f89Var == null ? null : f89Var.a;
        f89 f89Var2 = xb3Var.b;
        View view2 = f89Var2 != null ? f89Var2.a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(xb3Var.a);
            duration.translationX(xb3Var.e - xb3Var.c);
            duration.translationY(xb3Var.f - xb3Var.d);
            bb2Var = this;
            xb3Var2 = xb3Var;
            duration.alpha(0.0f).setListener(new ya2(bb2Var, xb3Var2, duration, view, (byte) 0)).start();
        } else {
            bb2Var = this;
            xb3Var2 = xb3Var;
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(xb3Var2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new ya2(bb2Var, xb3Var2, animate, view2, (byte) 1)).start();
        }
    }

    @Override // zb3
    public final void C(f89 f89Var, yb3 yb3Var) {
        S(f89Var, yb3Var, false);
    }

    @Override // zb3
    public final boolean J(xb3 xb3Var, f89 f89Var) {
        hnb hnbVar;
        if (f11.a) {
            cc4.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(f89Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = f89Var.a;
        if (this.K.contains(view) && (hnbVar = (hnb) this.U.run()) != null) {
            hnbVar.a(view);
        }
        if (xb3Var.b == f89Var) {
            xb3Var.b = null;
        } else {
            if (xb3Var.a != f89Var) {
                return false;
            }
            xb3Var.a = null;
        }
        W(view);
        d(f89Var);
        return true;
    }

    @Override // zb3
    public final long L() {
        return 0L;
    }

    @Override // zb3
    public void N() {
        this.G.setClipChildren(true);
        while (true) {
            ArrayList arrayList = this.L;
            if (arrayList.isEmpty()) {
                T();
                return;
            }
            ((Runnable) arrayList.remove(0)).run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(final f89 f89Var, yb3 yb3Var, boolean z) {
        f89 f89Var2;
        dc2 dc2Var;
        int i;
        wb2 wb2Var;
        boolean z2;
        float f;
        boolean z3;
        final ab2 ab2Var;
        final wb2 wb2Var2;
        dc2 dc2Var2;
        final byte b;
        final dc2 dc2Var3;
        ValueAnimator valueAnimator;
        final boolean z4;
        int[] iArr;
        int i2 = yb3Var.c;
        int i3 = yb3Var.e;
        View view = f89Var.a;
        int i4 = i3 - i2;
        AnimatorSet animatorSet = new AnimatorSet();
        byte b2 = 0;
        final byte b3 = 1;
        if (i4 != 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.z.add(f89Var);
        final ab2 ab2Var2 = (ab2) yb3Var;
        if (this.F != null) {
            if (view instanceof eq0) {
                eq0 eq0Var = (eq0) view;
                float translationY = eq0Var.getTranslationY();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new xa2(this, eq0Var, translationY, b2));
                animatorSet.playTogether(ofFloat);
            } else if (view instanceof gbc) {
                gbc gbcVar = (gbc) view;
                float translationY2 = gbcVar.getTranslationY();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new xa2(this, gbcVar, translationY2, b3));
                animatorSet.playTogether(ofFloat2);
            }
            f89Var2 = f89Var;
            if (z) {
                k43 k43Var = this.o;
                if (k43Var != null) {
                    animatorSet.setInterpolator(k43Var);
                }
            } else {
                animatorSet.setInterpolator(k43.g);
            }
            animatorSet.setDuration((long) (250.0f * (z ? 1.9f : 1.0f)));
            animatorSet.addListener(new eq1(this, f89Var2, i4, view));
            animatorSet.start();
            this.J.put(f89Var2, animatorSet);
        }
        if (view instanceof wb2) {
            final wb2 wb2Var3 = (wb2) view;
            final dc2 transitionParams = wb2Var3.getTransitionParams();
            animatorSet.playTogether(ObjectAnimator.ofFloat(wb2Var3, wb2Var3.xd, 0.0f));
            if (ab2Var2.n) {
                wb2Var3.x3(ab2Var2.o, ab2Var2.p, ab2Var2.q, ab2Var2.r);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                final float f2 = wb2Var3.getCurrentMessagesGroup() == null ? transitionParams.v0 : wb2Var3.getCurrentMessagesGroup().m.n;
                final float f22 = wb2Var3.getCurrentMessagesGroup() == null ? wb2Var3.f2() : wb2Var3.getCurrentMessagesGroup().c;
                if (f2 != f22) {
                    valueAnimator = ofFloat3;
                    z4 = true;
                } else {
                    valueAnimator = ofFloat3;
                    z4 = false;
                }
                if (transitionParams.C0) {
                    z2 = false;
                    iArr = new int[4];
                    int i5 = 0;
                    for (int i6 = 4; i5 < i6; i6 = 4) {
                        iArr[i5] = wb2Var3.getPhotoImage().X0[i5];
                        i5++;
                    }
                } else {
                    z2 = false;
                    iArr = null;
                }
                final int[] iArr2 = iArr;
                ValueAnimator valueAnimator2 = valueAnimator;
                i = 2;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: qa2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ab2 ab2Var3 = ab2.this;
                        float f3 = 1.0f - floatValue;
                        float f4 = ab2Var3.o * f3;
                        dc2 dc2Var4 = transitionParams;
                        float f5 = (dc2Var4.n0 * floatValue) + f4;
                        float f6 = (dc2Var4.o0 * floatValue) + (ab2Var3.p * f3);
                        float f7 = (dc2Var4.p0 * floatValue) + (ab2Var3.q * f3);
                        float f8 = (dc2Var4.q0 * floatValue) + (ab2Var3.r * f3);
                        boolean z5 = z4;
                        wb2 wb2Var4 = wb2Var3;
                        if (z5) {
                            float f9 = (f22 * floatValue) + (f2 * f3);
                            dc2Var4.v0 = f9;
                            if (wb2Var4.getCurrentMessagesGroup() != null) {
                                wb2Var4.getCurrentMessagesGroup().m.n = f9;
                            }
                        }
                        if (dc2Var4.C0) {
                            ImageReceiver photoImage = wb2Var4.getPhotoImage();
                            int[] iArr3 = iArr2;
                            int[] iArr4 = dc2Var4.B0;
                            photoImage.r0((int) ((iArr4[0] * floatValue) + (iArr3[0] * f3)), (int) ((iArr4[1] * floatValue) + (iArr3[1] * f3)), (int) ((iArr4[2] * floatValue) + (iArr3[2] * f3)), (int) ((iArr4[3] * floatValue) + (iArr3[3] * f3)));
                        }
                        wb2Var4.x3(f5, f6, f7, f8);
                        f89Var.a.invalidate();
                    }
                };
                dc2Var = transitionParams;
                wb2Var = wb2Var3;
                f89Var2 = f89Var;
                valueAnimator2.addUpdateListener(animatorUpdateListener);
                Animator[] animatorArr = new Animator[1];
                animatorArr[z2 ? 1 : 0] = valueAnimator2;
                animatorSet.playTogether(animatorArr);
            } else {
                dc2Var = transitionParams;
                i = 2;
                wb2Var = wb2Var3;
                f89Var2 = f89Var;
                z2 = false;
            }
            if (ab2Var2.v == 0 && ab2Var2.t == 0 && ab2Var2.u == 0 && ab2Var2.s == 0) {
                f = 0.0f;
                dc2Var.l0 = 0.0f;
                dc2Var.m0 = 0.0f;
                z3 = z2;
            } else {
                f = 0.0f;
                d79 d79Var = this.G;
                d79Var.setClipChildren(z2);
                d79Var.invalidate();
                float[] fArr = new float[i];
                // fill-array-data instruction
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr);
                boolean z5 = ab2Var2.l;
                int i7 = ab2Var2.s;
                if (z5) {
                    dc2Var.l0 = -i7;
                    dc2Var.m0 = -ab2Var2.t;
                } else {
                    dc2Var.l0 = (-i7) - wb2Var.getAnimationOffsetX();
                    dc2Var.m0 = (-ab2Var2.t) - wb2Var.getAnimationOffsetX();
                }
                ofFloat4.addUpdateListener(new nk(ab2Var2, dc2Var, wb2Var, b3));
                z3 = false;
                animatorSet.playTogether(ofFloat4);
            }
            m47 currentMessagesGroup = wb2Var.getCurrentMessagesGroup();
            if (currentMessagesGroup == null) {
                ab2Var2.j = z3;
            }
            if (ab2Var2.j) {
                float[] fArr2 = new float[i];
                // fill-array-data instruction
                fArr2[0] = 1.0f;
                fArr2[1] = 0.0f;
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(fArr2);
                dc2 dc2Var4 = dc2Var;
                final l47 l47Var = currentMessagesGroup.m;
                final d79 d79Var2 = (d79) view.getParent();
                final float f3 = currentMessagesGroup.m.n;
                if (currentMessagesGroup.c) {
                    f = 1.0f;
                }
                final boolean z6 = f3 != f;
                dc2Var2 = dc2Var4;
                final float f4 = f;
                ab2Var = ab2Var2;
                wb2Var2 = wb2Var;
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ra2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ab2 ab2Var3 = ab2Var;
                        l47 l47Var2 = l47.this;
                        l47Var2.f = ab2Var3.f * floatValue;
                        l47Var2.h = ab2Var3.g * floatValue;
                        l47Var2.e = ab2Var3.h * floatValue;
                        l47Var2.g = ab2Var3.i * floatValue;
                        if (z6) {
                            l47Var2.n = qd4.A(1.0f, floatValue, f4, f3 * floatValue);
                        }
                        d79 d79Var3 = d79Var2;
                        if (d79Var3 != null) {
                            d79Var3.invalidate();
                        }
                    }
                });
                ofFloat5.addListener(new jb1((Object) l47Var, (byte) 21));
                b = 0;
                animatorSet.playTogether(ofFloat5);
            } else {
                ab2Var = ab2Var2;
                wb2Var2 = wb2Var;
                dc2Var2 = dc2Var;
                b = 0;
            }
            if (ab2Var.k) {
                float[] fArr3 = new float[i];
                // fill-array-data instruction
                fArr3[0] = 0.0f;
                fArr3[1] = 1.0f;
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(fArr3);
                dc2Var3 = dc2Var2;
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sa2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        byte b4 = b;
                        wb2 wb2Var4 = wb2Var2;
                        dc2 dc2Var5 = dc2Var3;
                        switch (b4) {
                            case 0:
                                dc2Var5.A0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                wb2Var4.invalidate();
                                break;
                            default:
                                dc2Var5.L1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                wb2Var4.invalidate();
                                break;
                        }
                    }
                });
                Animator[] animatorArr2 = new Animator[1];
                animatorArr2[b] = ofFloat6;
                animatorSet.playTogether(animatorArr2);
            } else {
                dc2Var3 = dc2Var2;
            }
            if (ab2Var.m) {
                float[] fArr4 = new float[i];
                // fill-array-data instruction
                fArr4[0] = 0.0f;
                fArr4[1] = 1.0f;
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(fArr4);
                dc2Var3.h = true;
                ofFloat7.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sa2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        byte b4 = b3;
                        wb2 wb2Var4 = wb2Var2;
                        dc2 dc2Var5 = dc2Var3;
                        switch (b4) {
                            case 0:
                                dc2Var5.A0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                wb2Var4.invalidate();
                                break;
                            default:
                                dc2Var5.L1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                wb2Var4.invalidate();
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat7);
            }
        } else {
            f89Var2 = f89Var;
            if (view instanceof dl1) {
                dl1 dl1Var = (dl1) view;
                cl1 transitionParams2 = dl1Var.getTransitionParams();
                if (ab2Var2.m) {
                    ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    transitionParams2.b = true;
                    ofFloat8.addUpdateListener(new lk(transitionParams2, dl1Var, (byte) 9));
                    animatorSet.playTogether(ofFloat8);
                }
            }
        }
        if (z) {
        }
        animatorSet.setDuration((long) (250.0f * (z ? 1.9f : 1.0f)));
        animatorSet.addListener(new eq1(this, f89Var2, i4, view));
        animatorSet.start();
        this.J.put(f89Var2, animatorSet);
    }

    public final void T() {
        hnb hnbVar;
        HashMap hashMap = this.J;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (this.K.isEmpty() || (hnbVar = (hnb) this.U.run()) == null) {
            return;
        }
        ArrayList arrayList2 = hnbVar.c;
        if (hnbVar.e) {
            return;
        }
        hnbVar.e = true;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            gnb gnbVar = (gnb) obj2;
            Runnable runnable = gnbVar.d;
            if (runnable != null) {
                hnb.b(runnable);
                gnbVar.d = null;
            }
        }
        arrayList2.clear();
        fnb fnbVar = hnbVar.a;
        if (fnbVar != null) {
            fnbVar.g();
        }
        Runnable runnable2 = hnbVar.d;
        if (runnable2 != null) {
            hnbVar.d = null;
            hnb.b(runnable2);
        }
    }

    public final void U(m47 m47Var) {
        if (m47Var == null) {
            return;
        }
        ArrayList arrayList = m47Var.d;
        l47 l47Var = m47Var.m;
        if (arrayList.size() == 0) {
            l47Var.i = true;
            return;
        }
        if (l47Var.b == 0 && l47Var.d == 0 && l47Var.a == 0 && l47Var.c == 0) {
            d79 d79Var = this.G;
            int childCount = d79Var.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = d79Var.getChildAt(i);
                if (childAt instanceof wb2) {
                    wb2 wb2Var = (wb2) childAt;
                    r47 messageObject = wb2Var.getMessageObject();
                    if (wb2Var.getTransitionParams().w0 && arrayList.contains(messageObject)) {
                        l47Var.b = wb2Var.getBackgroundDrawableTop() + wb2Var.getPaddingTop() + wb2Var.getTop();
                        l47Var.d = wb2Var.getBackgroundDrawableBottom() + wb2Var.getPaddingTop() + wb2Var.getTop();
                        l47Var.a = wb2Var.getBackgroundDrawableLeft() + wb2Var.getLeft();
                        l47Var.c = wb2Var.getBackgroundDrawableRight() + wb2Var.getLeft();
                        l47Var.o = wb2Var.f2();
                        l47Var.k = wb2Var.L2();
                        l47Var.l = wb2Var.K2();
                        l47Var.p = true;
                        break;
                    }
                }
                i++;
            }
        }
        this.I.add(m47Var);
    }

    public abstract void V();

    public final void W(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z = view instanceof eq0;
        d79 d79Var = this.G;
        if (z) {
            int measuredHeight = (d79Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((eq0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof gbc) {
            int measuredHeight2 = (d79Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((gbc) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof wb2) {
            wb2 wb2Var = (wb2) view;
            wb2Var.getTransitionParams().e();
            wb2Var.setAnimationOffsetX(0.0f);
        } else {
            if (!(view instanceof dl1)) {
                view.setTranslationX(0.0f);
                return;
            }
            cl1 transitionParams = ((dl1) view).getTransitionParams();
            transitionParams.b = false;
            transitionParams.c = 1.0f;
        }
    }

    public final void X(wo1 wo1Var, fl1 fl1Var) {
        this.T = wo1Var;
        this.U = fl1Var;
    }

    public final boolean Y(View view) {
        f89 U;
        if (this.N || (U = this.G.U(view)) == null) {
            return false;
        }
        return this.q.contains(U) || this.y.contains(U);
    }

    public final boolean Z(View view) {
        f89 U = this.G.U(view);
        if (U != null) {
            return this.p.contains(U) || this.A.contains(U);
        }
        return false;
    }

    @Override // cma, o79
    public final boolean a(f89 f89Var, l09 l09Var, l09 l09Var2) {
        ArrayList arrayList;
        int i;
        boolean a = super.a(f89Var, l09Var, l09Var2);
        if (a && this.N) {
            int i2 = 0;
            boolean z = false;
            while (true) {
                arrayList = this.q;
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (((f89) arrayList.get(i2)).c() == 0) {
                    z = true;
                }
                i2++;
            }
            if (z) {
                i = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    i += ((f89) arrayList.get(i3)).a.getHeight();
                }
            } else {
                i = 0;
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ((f89) arrayList.get(i4)).a.setTranslationY(i);
            }
        }
        return a;
    }

    @Override // zb3, o79
    public final void f(f89 f89Var) {
        hnb hnbVar;
        Animator animator = (Animator) this.J.remove(f89Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = f89Var.a;
        if (this.K.contains(view) && (hnbVar = (hnb) this.U.run()) != null) {
            hnbVar.a(view);
        }
        super.f(f89Var);
        W(view);
    }

    @Override // zb3, o79
    public void g() {
        if (f11.a) {
            cc4.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((m47) obj).m.p = false;
        }
        arrayList.clear();
        T();
        y92 y92Var = this.P;
        if (y92Var != null) {
            y92Var.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            yb3 yb3Var = (yb3) arrayList2.get(size2);
            W(yb3Var.a.a);
            v(yb3Var.a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            f89 f89Var = (f89) arrayList3.get(size3);
            W(f89Var.a);
            d(f89Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            f89 f89Var2 = (f89) arrayList4.get(size4);
            W(f89Var2.a);
            u(f89Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((xb3) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (k()) {
            ArrayList arrayList6 = this.u;
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
                for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                    yb3 yb3Var2 = (yb3) arrayList7.get(size7);
                    W(yb3Var2.a.a);
                    v(yb3Var2.a);
                    arrayList7.remove(size7);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(arrayList7);
                    }
                }
            }
            ArrayList arrayList8 = this.t;
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
                for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                    f89 f89Var3 = (f89) arrayList9.get(size9);
                    W(f89Var3.a);
                    u(f89Var3);
                    arrayList9.remove(size9);
                    if (arrayList9.isEmpty()) {
                        arrayList8.remove(arrayList9);
                    }
                }
            }
            ArrayList arrayList10 = this.v;
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                ArrayList arrayList11 = (ArrayList) arrayList10.get(size10);
                for (int size11 = arrayList11.size() - 1; size11 >= 0; size11--) {
                    I((xb3) arrayList11.get(size11));
                    if (arrayList11.isEmpty()) {
                        arrayList10.remove(arrayList11);
                    }
                }
            }
            E(this.A);
            E(this.z);
            E(this.y);
            E(this.B);
            e();
        }
    }

    @Override // o79
    public final long i() {
        return 250L;
    }

    @Override // o79
    public final long j() {
        return 250L;
    }

    @Override // o79
    public final l09 l(c89 c89Var, f89 f89Var, int i, List list) {
        l09 l = super.l(c89Var, f89Var, i, list);
        View view = f89Var.a;
        if (!(view instanceof wb2)) {
            return l;
        }
        za2 za2Var = new za2((byte) 4);
        za2Var.b = l.b;
        za2Var.c = l.c;
        dc2 transitionParams = ((wb2) view).getTransitionParams();
        za2Var.e = transitionParams.b;
        za2Var.f = transitionParams.c;
        za2Var.g = transitionParams.d;
        za2Var.h = transitionParams.e;
        return za2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x047c A[EDGE_INSN: B:223:0x047c->B:224:0x047c BREAK  A[LOOP:9: B:192:0x03be->B:216:0x046f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fc  */
    @Override // zb3, o79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        int size;
        int i;
        HashMap hashMap;
        int i2;
        boolean z6;
        ArrayList arrayList2;
        int i3;
        int i4;
        boolean z7;
        ArrayList arrayList3;
        ArrayList arrayList4;
        fl1 fl1Var;
        int i5;
        m47 currentMessagesGroup;
        boolean z8;
        boolean z9;
        ArrayList arrayList5;
        boolean z10;
        r47 messageObject;
        wo1 wo1Var;
        int i6;
        int i7;
        boolean z11;
        zu1 zu1Var;
        Runnable runnable;
        q67 q67Var;
        int i8;
        bb2 bb2Var = this;
        ArrayList arrayList6 = bb2Var.p;
        boolean isEmpty = arrayList6.isEmpty();
        ArrayList arrayList7 = bb2Var.r;
        boolean isEmpty2 = arrayList7.isEmpty();
        ArrayList arrayList8 = bb2Var.s;
        boolean isEmpty3 = arrayList8.isEmpty();
        ArrayList arrayList9 = bb2Var.q;
        boolean isEmpty4 = arrayList9.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        boolean z12 = bb2Var.N;
        d79 d79Var = bb2Var.G;
        byte b = 1;
        if (z12) {
            z = false;
            for (0; i8 < arrayList9.size(); i8 + 1) {
                if (bb2Var.Q) {
                    i8 = ((f89) arrayList9.get(i8)).c() != (d79Var.getAdapter() == null ? 0 : d79Var.getAdapter().b()) - 1 ? i8 + 1 : 0;
                    z = true;
                } else {
                    if (((f89) arrayList9.get(i8)).c() != 0) {
                    }
                    z = true;
                }
            }
        } else {
            z = false;
        }
        bb2Var.V();
        ArrayList arrayList10 = bb2Var.y;
        float f = 1.0f;
        if (z) {
            boolean isEmpty5 = arrayList6.isEmpty();
            boolean isEmpty6 = arrayList7.isEmpty();
            boolean isEmpty7 = arrayList8.isEmpty();
            boolean isEmpty8 = arrayList9.isEmpty();
            if (!isEmpty5 || !isEmpty6 || !isEmpty8 || !isEmpty7) {
                int i9 = 0;
                for (0; i6 < arrayList9.size(); i6 + 1) {
                    View view = ((f89) arrayList9.get(i6)).a;
                    if (view instanceof wb2) {
                        wb2 wb2Var = (wb2) view;
                        i6 = (wb2Var.getCurrentPosition() != null && (wb2Var.getCurrentPosition().l & 1) == 0) ? i6 + 1 : 0;
                    }
                    i9 += ((f89) arrayList9.get(i6)).a.getHeight();
                }
                int size2 = arrayList6.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList6.get(i10);
                    i10++;
                    bb2Var.D((f89) obj);
                }
                arrayList6.clear();
                if (!isEmpty6) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.addAll(arrayList7);
                    arrayList7.clear();
                    int size3 = arrayList11.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj2 = arrayList11.get(i11);
                        i11++;
                        yb3 yb3Var = (yb3) obj2;
                        bb2Var.S(yb3Var.a, yb3Var, false);
                    }
                    arrayList11.clear();
                }
                if (!isEmpty8) {
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.addAll(arrayList9);
                    arrayList9.clear();
                    int i12 = 0;
                    for (int size4 = arrayList12.size(); i12 < size4; size4 = i7) {
                        int i13 = i12 + 1;
                        f89 f89Var = (f89) arrayList12.get(i12);
                        View view2 = f89Var.a;
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList10.add(f89Var);
                        view2.setTranslationY(i9);
                        View view3 = f89Var.a;
                        view3.setScaleX(f);
                        view3.setScaleY(f);
                        wb2 wb2Var2 = view3 instanceof wb2 ? (wb2) view3 : null;
                        if (wb2Var2 == null || !wb2Var2.getTransitionParams().y0) {
                            view3.setAlpha(f);
                        }
                        zu1 zu1Var2 = bb2Var.F;
                        if (zu1Var2 != null) {
                            ArrayList arrayList13 = zu1Var2.K4;
                            if (wb2Var2 != null && arrayList13.contains(wb2Var2.getMessageObject())) {
                                arrayList13.remove(wb2Var2.getMessageObject());
                                nr1 nr1Var = zu1Var2.a0;
                                if (nr1Var.g0 == null || !((q67Var = nr1Var.M0) == null || q67Var.u0)) {
                                    i7 = size4;
                                } else {
                                    i7 = size4;
                                    if (System.currentTimeMillis() - nr1Var.N0 > 300) {
                                        z11 = true;
                                        nr1Var.N0 = -1L;
                                        if (z11) {
                                            if (r47.Q4(wb2Var2.getMessageObject().k)) {
                                                if (Math.abs(view2.getTranslationY()) < view2.getMeasuredHeight() * 3.0f) {
                                                    new ync(wb2Var2, zu1Var2.a0, bb2Var.G, zu1Var2.ja, bb2Var.R).f.start();
                                                }
                                            } else if (xea.o() != 0 && Math.abs(view2.getTranslationY()) < d79Var.getMeasuredHeight()) {
                                                zu1Var = zu1Var2;
                                                ValueAnimator valueAnimator = new klb(wb2Var2, zu1Var2, bb2Var.G, zu1Var2.ja, bb2Var.R).d;
                                                if (valueAnimator != null) {
                                                    valueAnimator.start();
                                                }
                                                nr1 nr1Var2 = zu1Var.a0;
                                                runnable = nr1Var2.g0;
                                                if (runnable != null) {
                                                    hl.r(runnable);
                                                    nr1Var2.h0 = true;
                                                    nr1Var2.g0.run();
                                                    nr1Var2.g0 = null;
                                                }
                                            }
                                            zu1Var = zu1Var2;
                                            nr1 nr1Var22 = zu1Var.a0;
                                            runnable = nr1Var22.g0;
                                            if (runnable != null) {
                                            }
                                        }
                                        animate.translationY(0.0f).setDuration(250L).setInterpolator(bb2Var.o).setListener(new wa2((Object) bb2Var, (Object) f89Var, view2, (Object) animate, (byte) 0)).start();
                                        i9 = i9;
                                        i12 = i13;
                                        f = 1.0f;
                                    }
                                }
                                z11 = false;
                                nr1Var.N0 = -1L;
                                if (z11) {
                                }
                                animate.translationY(0.0f).setDuration(250L).setInterpolator(bb2Var.o).setListener(new wa2((Object) bb2Var, (Object) f89Var, view2, (Object) animate, (byte) 0)).start();
                                i9 = i9;
                                i12 = i13;
                                f = 1.0f;
                            }
                        }
                        i7 = size4;
                        animate.translationY(0.0f).setDuration(250L).setInterpolator(bb2Var.o).setListener(new wa2((Object) bb2Var, (Object) f89Var, view2, (Object) animate, (byte) 0)).start();
                        i9 = i9;
                        i12 = i13;
                        f = 1.0f;
                    }
                    arrayList12.clear();
                }
            }
        } else {
            boolean isEmpty9 = arrayList6.isEmpty();
            boolean isEmpty10 = arrayList7.isEmpty();
            boolean isEmpty11 = arrayList8.isEmpty();
            boolean isEmpty12 = arrayList9.isEmpty();
            if (!isEmpty9 || !isEmpty10 || !isEmpty12 || !isEmpty11) {
                boolean z13 = (bb2Var.U == null || (wo1Var = bb2Var.T) == null || !((Boolean) wo1Var.run()).booleanValue()) ? false : true;
                ArrayList arrayList14 = bb2Var.K;
                ArrayList arrayList15 = bb2Var.A;
                ArrayList arrayList16 = bb2Var.S;
                if (z13) {
                    LongSparseArray longSparseArray = null;
                    int i14 = 0;
                    while (i14 < arrayList6.size()) {
                        f89 f89Var2 = (f89) arrayList6.get(i14);
                        if (arrayList16.contains(f89Var2)) {
                            z8 = isEmpty10;
                            View view4 = f89Var2.a;
                            z9 = isEmpty11;
                            if ((view4 instanceof wb2) && ((wb2) view4).getCurrentMessagesGroup() != null && (messageObject = ((wb2) f89Var2.a).getMessageObject()) != null && messageObject.c1() != 0) {
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                arrayList5 = arrayList10;
                                z10 = z13;
                                ArrayList arrayList17 = (ArrayList) longSparseArray.get(messageObject.c1());
                                if (arrayList17 == null) {
                                    long c1 = messageObject.c1();
                                    ArrayList arrayList18 = new ArrayList();
                                    longSparseArray.put(c1, arrayList18);
                                    arrayList17 = arrayList18;
                                }
                                arrayList16.remove(f89Var2);
                                arrayList6.remove(i14);
                                i14--;
                                arrayList17.add(f89Var2);
                                i14++;
                                z13 = z10;
                                isEmpty10 = z8;
                                isEmpty11 = z9;
                                arrayList10 = arrayList5;
                            }
                        } else {
                            z8 = isEmpty10;
                            z9 = isEmpty11;
                        }
                        arrayList5 = arrayList10;
                        z10 = z13;
                        i14++;
                        z13 = z10;
                        isEmpty10 = z8;
                        isEmpty11 = z9;
                        arrayList10 = arrayList5;
                    }
                    z2 = isEmpty10;
                    z3 = isEmpty11;
                    arrayList = arrayList10;
                    z4 = z13;
                    if (longSparseArray != null) {
                        int i15 = 0;
                        z5 = false;
                        while (i15 < longSparseArray.size()) {
                            ArrayList arrayList19 = (ArrayList) longSparseArray.valueAt(i15);
                            if (arrayList19.size() > 0) {
                                View view5 = ((f89) arrayList19.get(0)).a;
                                if (!(view5 instanceof wb2) || (currentMessagesGroup = ((wb2) view5).getCurrentMessagesGroup()) == null || currentMessagesGroup.d.size() <= arrayList19.size()) {
                                    if (f11.a) {
                                        cc4.b("animate remove group impl with thanos");
                                    }
                                    arrayList15.addAll(arrayList19);
                                    hnb hnbVar = (hnb) bb2Var.U.run();
                                    for (int i16 = 0; i16 < arrayList19.size(); i16++) {
                                    }
                                    ArrayList arrayList20 = new ArrayList();
                                    i5 = i15;
                                    for (int i17 = 0; i17 < arrayList19.size(); i17++) {
                                        arrayList20.add(((f89) arrayList19.get(i17)).a);
                                    }
                                    on1 on1Var = new on1(bb2Var, arrayList20, arrayList19, (byte) 20);
                                    fnb fnbVar = hnbVar.a;
                                    if (fnbVar != null) {
                                        fnbVar.d(arrayList20, on1Var);
                                        Choreographer.getInstance().postFrameCallback(hnbVar.b);
                                    } else {
                                        hnbVar.c.add(new gnb(arrayList20, on1Var));
                                    }
                                    arrayList14.add((View) arrayList20.get(0));
                                    d79Var.E0();
                                    z5 = true;
                                    i15 = i5 + 1;
                                } else {
                                    arrayList6.addAll(arrayList19);
                                }
                            }
                            i5 = i15;
                            i15 = i5 + 1;
                        }
                        size = arrayList6.size();
                        boolean z14 = z5;
                        i = 0;
                        while (true) {
                            hashMap = bb2Var.J;
                            if (i < size) {
                                break;
                            }
                            Object obj3 = arrayList6.get(i);
                            int i18 = i + 1;
                            f89 f89Var3 = (f89) obj3;
                            boolean z15 = arrayList16.remove(f89Var3) && z4;
                            if (f11.a) {
                                arrayList2 = arrayList6;
                                i3 = size;
                                cc4.b("animate remove impl ".concat(z15 ? " with thanos" : ""));
                            } else {
                                arrayList2 = arrayList6;
                                i3 = size;
                            }
                            View view6 = f89Var3.a;
                            arrayList15.add(f89Var3);
                            if (!z15 || (fl1Var = bb2Var.U) == null) {
                                i4 = i18;
                                z7 = z4;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view6, (Property<View, Float>) View.ALPHA, view6.getAlpha(), 0.0f);
                                arrayList3 = arrayList15;
                                arrayList4 = arrayList16;
                                ofFloat.setDuration(bb2Var.d);
                                ofFloat.addListener(new va2(bb2Var, view6, f89Var3));
                                hashMap.put(f89Var3, ofFloat);
                                ofFloat.start();
                            } else {
                                hnb hnbVar2 = (hnb) fl1Var.run();
                                i4 = i18;
                                on1 on1Var2 = new on1(bb2Var, view6, f89Var3, (byte) 21);
                                fnb fnbVar2 = hnbVar2.a;
                                if (fnbVar2 != null) {
                                    fnbVar2.b(1.0f, view6, on1Var2);
                                    Choreographer.getInstance().postFrameCallback(hnbVar2.b);
                                } else {
                                    hnbVar2.c.add(new gnb(view6, on1Var2));
                                }
                                arrayList14.add(view6);
                                z7 = z4;
                                arrayList3 = arrayList15;
                                arrayList4 = arrayList16;
                            }
                            d79Var.E0();
                            if (z15) {
                                z14 = true;
                            }
                            arrayList15 = arrayList3;
                            size = i3;
                            arrayList6 = arrayList2;
                            i = i4;
                            arrayList16 = arrayList4;
                            z4 = z7;
                        }
                        arrayList6.clear();
                        if (!z2) {
                            ArrayList arrayList21 = new ArrayList();
                            arrayList21.addAll(arrayList7);
                            bb2Var.u.add(arrayList21);
                            arrayList7.clear();
                            q6 q6Var = new q6(bb2Var, arrayList21, z14, b);
                            if (!bb2Var.C || isEmpty9) {
                                q6Var.run();
                            } else {
                                View view7 = ((yb3) arrayList21.get(0)).a.a;
                                WeakHashMap weakHashMap = ihc.a;
                                view7.postOnAnimationDelayed(q6Var, 0L);
                            }
                        }
                        if (!z3) {
                            ArrayList arrayList22 = new ArrayList();
                            arrayList22.addAll(arrayList8);
                            bb2Var.v.add(arrayList22);
                            arrayList8.clear();
                            iqd iqdVar = new iqd((Object) bb2Var, (Object) arrayList22, false, (byte) 4);
                            if (!bb2Var.C || isEmpty9) {
                                iqdVar.run();
                            } else {
                                View view8 = ((xb3) arrayList22.get(0)).a.a;
                                WeakHashMap weakHashMap2 = ihc.a;
                                view8.postOnAnimationDelayed(iqdVar, 0L);
                            }
                        }
                        if (!isEmpty12) {
                            ArrayList arrayList23 = new ArrayList();
                            arrayList23.addAll(arrayList9);
                            arrayList9.clear();
                            Collections.sort(arrayList23, new ta((byte) 23));
                            int i19 = 0;
                            for (int size5 = arrayList23.size(); i19 < size5; size5 = i2) {
                                int i20 = i19 + 1;
                                f89 f89Var4 = (f89) arrayList23.get(i19);
                                if (f11.a) {
                                    cc4.b("animate add impl");
                                }
                                View view9 = f89Var4.a;
                                ArrayList arrayList24 = arrayList;
                                arrayList24.add(f89Var4);
                                if (f89Var4 == bb2Var.O) {
                                    view9.setAlpha(1.0f);
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                if (view9 instanceof wb2) {
                                    wb2 wb2Var3 = (wb2) view9;
                                    if (wb2Var3.getAnimationOffsetX() != 0.0f) {
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(wb2Var3, wb2Var3.xd, wb2Var3.getAnimationOffsetX(), 0.0f));
                                    }
                                    wb2Var3.setPivotX(((wb2Var3.getBackgroundDrawableRight() - wb2Var3.getBackgroundDrawableLeft()) / 2.0f) + wb2Var3.getBackgroundDrawableLeft());
                                    view9.animate().translationY(0.0f).setDuration(bb2Var.c).start();
                                } else {
                                    view9.animate().translationX(0.0f).translationY(0.0f).setDuration(bb2Var.c).start();
                                }
                                long max = (long) ((1.0f - Math.max(0.0f, Math.min(1.0f, view9.getBottom() / d79Var.getMeasuredHeight()))) * 100.0f);
                                if (!(view9 instanceof wb2)) {
                                    i2 = size5;
                                } else if (f89Var4 == bb2Var.O) {
                                    y92 y92Var = bb2Var.P;
                                    if (y92Var != null) {
                                        y92Var.h.setAlpha(0.0f);
                                    }
                                    d79Var.setClipChildren(false);
                                    final wb2 wb2Var4 = (wb2) view9;
                                    View view10 = (View) bb2Var.P.getParent();
                                    float x = view10.getX() + bb2Var.P.getX() + bb2Var.P.h.getX();
                                    float y = view10.getY() + bb2Var.P.getY() + bb2Var.P.h.getY();
                                    float x2 = wb2Var4.getX() + d79Var.getX() + wb2Var4.getPhotoImage().L0;
                                    float y2 = wb2Var4.getY() + d79Var.getY() + wb2Var4.getPhotoImage().M0;
                                    final float width = bb2Var.P.h.getWidth();
                                    final float height = bb2Var.P.h.getHeight();
                                    final float f2 = wb2Var4.getPhotoImage().N0;
                                    final float f3 = wb2Var4.getPhotoImage().O0;
                                    final float f4 = x - x2;
                                    final float f5 = y - y2;
                                    final float f6 = wb2Var4.getPhotoImage().L0;
                                    final float f7 = wb2Var4.getPhotoImage().M0;
                                    wb2Var4.getTransitionParams().g0 = true;
                                    wb2Var4.getTransitionParams().K1 = true;
                                    wb2Var4.getPhotoImage().i0(f6 + f4, f6 + f5, width, height);
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ta2
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            wb2 wb2Var5 = wb2.this;
                                            wb2Var5.getTransitionParams().L1 = floatValue;
                                            if (wb2Var5.getTransitionParams().L1 > 1.0f) {
                                                wb2Var5.getTransitionParams().L1 = 1.0f;
                                            }
                                            float f8 = 1.0f - floatValue;
                                            wb2Var5.getPhotoImage().i0((f4 * f8) + f6, (f5 * f8) + f7, (f2 * floatValue) + (width * f8), (f3 * floatValue) + (height * f8));
                                            wb2Var5.invalidate();
                                        }
                                    });
                                    i2 = size5;
                                    bb2Var = this;
                                    ofFloat2.addListener(new ua2(bb2Var, wb2Var4, f6, f7, f2, f3));
                                    animatorSet.play(ofFloat2);
                                    max = max;
                                    z6 = false;
                                    view9.setAlpha(0.0f);
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), 1.0f));
                                    if (z6) {
                                        view9.setScaleX(1.0f);
                                        view9.setScaleY(1.0f);
                                    } else {
                                        view9.setScaleX(0.9f);
                                        view9.setScaleY(0.9f);
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_Y, view9.getScaleY(), 1.0f));
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_X, view9.getScaleX(), 1.0f));
                                    }
                                    if (f89Var4 != bb2Var.O) {
                                        animatorSet.setDuration(350L);
                                        animatorSet.setInterpolator(new OvershootInterpolator());
                                    } else {
                                        animatorSet.setStartDelay(max);
                                        animatorSet.setDuration(250L);
                                    }
                                    animatorSet.addListener(new va2(bb2Var, f89Var4, view9));
                                    hashMap.put(f89Var4, animatorSet);
                                    animatorSet.start();
                                    i19 = i20;
                                    arrayList = arrayList24;
                                } else {
                                    i2 = size5;
                                    m47 currentMessagesGroup2 = ((wb2) view9).getCurrentMessagesGroup();
                                    if (currentMessagesGroup2 != null) {
                                        Long valueOf = Long.valueOf(currentMessagesGroup2.a);
                                        HashMap hashMap2 = bb2Var.M;
                                        Long l = (Long) hashMap2.get(valueOf);
                                        if (l == null) {
                                            hashMap2.put(Long.valueOf(currentMessagesGroup2.a), Long.valueOf(max));
                                        } else {
                                            max = l.longValue();
                                            if (currentMessagesGroup2 != null && currentMessagesGroup2.m.j) {
                                                animatorSet.setStartDelay(140L);
                                            }
                                        }
                                    }
                                    max = max;
                                    if (currentMessagesGroup2 != null) {
                                        animatorSet.setStartDelay(140L);
                                    }
                                }
                                z6 = true;
                                view9.setAlpha(0.0f);
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), 1.0f));
                                if (z6) {
                                }
                                if (f89Var4 != bb2Var.O) {
                                }
                                animatorSet.addListener(new va2(bb2Var, f89Var4, view9));
                                hashMap.put(f89Var4, animatorSet);
                                animatorSet.start();
                                i19 = i20;
                                arrayList = arrayList24;
                            }
                            arrayList23.clear();
                        }
                    }
                } else {
                    z2 = isEmpty10;
                    z3 = isEmpty11;
                    arrayList = arrayList10;
                    z4 = z13;
                }
                z5 = false;
                size = arrayList6.size();
                boolean z142 = z5;
                i = 0;
                while (true) {
                    hashMap = bb2Var.J;
                    if (i < size) {
                    }
                    arrayList15 = arrayList3;
                    size = i3;
                    arrayList6 = arrayList2;
                    i = i4;
                    arrayList16 = arrayList4;
                    z4 = z7;
                }
                arrayList6.clear();
                if (!z2) {
                }
                if (!z3) {
                }
                if (!isEmpty12) {
                }
            }
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new az1(bb2Var, (byte) 5));
        ofFloat3.setDuration(bb2Var.d + 250);
        ofFloat3.start();
    }

    @Override // zb3, cma
    public final void p(f89 f89Var) {
        R(f89Var);
        View view = f89Var.a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof wb2) {
            ((wb2) view).getTransitionParams().i = true;
        }
        this.q.add(f89Var);
    }

    @Override // zb3, cma
    public final boolean q(f89 f89Var, f89 f89Var2, l09 l09Var, int i, int i2, int i3, int i4) {
        if (f89Var == f89Var2) {
            return r(f89Var, l09Var, i, i2, i3, i4);
        }
        View view = f89Var.a;
        float animationOffsetX = view instanceof wb2 ? ((wb2) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(f89Var);
        int i5 = (int) ((i3 - i) - animationOffsetX);
        int i6 = (int) ((i4 - i2) - translationY);
        if (view instanceof wb2) {
            ((wb2) view).setAnimationOffsetX(animationOffsetX);
        } else {
            view.setTranslationX(animationOffsetX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = f89Var2.a;
        R(f89Var2);
        if (view2 instanceof wb2) {
            ((wb2) view2).setAnimationOffsetX(-i5);
        } else {
            view2.setTranslationX(-i5);
        }
        view2.setTranslationY(-i6);
        view2.setAlpha(0.0f);
        this.s.add(new xb3(f89Var, f89Var2, i, i2, i3, i4));
        F();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e0, code lost:
    
        if (r6.top != r9.getBackgroundDrawableTop()) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e8, code lost:
    
        if (r6.bottom == r9.getBackgroundDrawableBottom()) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0216  */
    @Override // zb3, cma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(f89 f89Var, l09 l09Var, int i, int i2, int i3, int i4) {
        int translationX;
        int i5;
        wb2 wb2Var;
        dl1 dl1Var;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        View view;
        int i6;
        float f6;
        boolean z;
        m47 m47Var;
        int i7;
        boolean O3;
        View view2 = f89Var.a;
        if (view2 instanceof wb2) {
            wb2 wb2Var2 = (wb2) view2;
            translationX = i + ((int) wb2Var2.getAnimationOffsetX());
            i5 = wb2Var2.getTransitionParams().t2 != wb2Var2.getTopMediaOffset() ? (wb2Var2.getTransitionParams().t2 - wb2Var2.getTopMediaOffset()) + i2 : i2;
            wb2Var = wb2Var2;
            dl1Var = null;
        } else if (view2 instanceof dl1) {
            translationX = i + ((int) view2.getTranslationX());
            i5 = i2;
            dl1Var = (dl1) view2;
            wb2Var = null;
        } else {
            translationX = i + ((int) view2.getTranslationX());
            i5 = i2;
            wb2Var = null;
            dl1Var = null;
        }
        int i8 = translationX;
        int translationY = i5 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (wb2Var != null) {
            float f7 = wb2Var.getPhotoImage().L0;
            float f8 = wb2Var.getPhotoImage().M0;
            float f9 = wb2Var.getPhotoImage().N0;
            float f10 = wb2Var.getPhotoImage().O0;
            f = 0.0f;
            int i9 = 0;
            for (int i10 = 4; i9 < i10; i10 = 4) {
                iArr[i9] = wb2Var.getPhotoImage().X0[i9];
                i9++;
            }
            f3 = f7;
            f4 = f8;
            f2 = f10;
            f5 = f9;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
            f5 = 0.0f;
        }
        R(f89Var);
        int i11 = i3 - i8;
        int i12 = i4 - translationY;
        if (i12 != 0) {
            view2.setTranslationY(-i12);
        }
        float f11 = f2;
        dl1 dl1Var2 = dl1Var;
        ab2 ab2Var = new ab2(f89Var, i8, translationY, i3, i4);
        if (wb2Var != null) {
            dc2 transitionParams = wb2Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.u0;
            Rect rect = transitionParams.E0;
            m47 currentMessagesGroup = wb2Var.getCurrentMessagesGroup();
            if (i11 != 0) {
                wb2Var.setAnimationOffsetX(-i11);
            }
            boolean z2 = l09Var instanceof za2;
            d79 d79Var = this.G;
            if (z2) {
                ImageReceiver photoImage = wb2Var.getPhotoImage();
                view = view2;
                za2 za2Var = (za2) l09Var;
                i6 = i11;
                boolean z3 = (!transitionParams.w0 || za2Var.h == f || za2Var.g == f) ? false : true;
                ab2Var.n = z3;
                if (z3) {
                    d79Var.setClipChildren(false);
                    d79Var.invalidate();
                    transitionParams.g0 = true;
                    if (wb2Var.getMessageObject().g4()) {
                        transitionParams.n0 = f3;
                        transitionParams.o0 = f4;
                        transitionParams.p0 = f5;
                        transitionParams.q0 = f11;
                        transitionParams.B0 = iArr;
                    } else {
                        transitionParams.n0 = photoImage.L0;
                        transitionParams.o0 = photoImage.M0;
                        transitionParams.p0 = photoImage.N0;
                        transitionParams.q0 = photoImage.O0;
                        transitionParams.B0 = photoImage.X0;
                    }
                    transitionParams.C0 = false;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= 4) {
                            break;
                        }
                        if (iArr2[i13] != transitionParams.B0[i13]) {
                            transitionParams.C0 = true;
                            break;
                        }
                        i13++;
                    }
                    float f12 = transitionParams.n0;
                    float f13 = za2Var.e;
                    if (f12 == f13 && transitionParams.o0 == za2Var.f && transitionParams.q0 == za2Var.h && transitionParams.p0 == za2Var.g && !transitionParams.C0) {
                        transitionParams.g0 = false;
                        ab2Var.n = false;
                    } else {
                        ab2Var.o = f13;
                        ab2Var.p = za2Var.f;
                        ab2Var.q = za2Var.g;
                        ab2Var.r = za2Var.h;
                        if (currentMessagesGroup != null) {
                            boolean z4 = currentMessagesGroup.c;
                            l47 l47Var = currentMessagesGroup.m;
                            boolean z5 = l47Var.o;
                            if (z4 != z5) {
                                l47Var.n = z5 ? 1.0f : f;
                            }
                        }
                        if (transitionParams.C0) {
                            if (transitionParams.B0 == photoImage.X0) {
                                transitionParams.B0 = new int[4];
                                for (int i14 = 0; i14 < 4; i14++) {
                                    transitionParams.B0[i14] = photoImage.X0[i14];
                                }
                            }
                            photoImage.s0(iArr2);
                        }
                        wb2Var.x3(ab2Var.o, ab2Var.p, ab2Var.q, ab2Var.r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.w0) {
                    if ((O3 = wb2Var.getMessageObject().O3())) {
                        ab2Var.v = wb2Var.getBackgroundDrawableBottom() - rect.bottom;
                        ab2Var.u = wb2Var.getBackgroundDrawableTop() - rect.top;
                        if (wb2Var.Y6 == transitionParams.F0) {
                            ab2Var.s = wb2Var.getBackgroundDrawableLeft() - rect.left;
                            ab2Var.t = wb2Var.getBackgroundDrawableRight() - rect.right;
                        } else if (O3) {
                            ab2Var.s = wb2Var.getBackgroundDrawableLeft() - rect.left;
                        } else {
                            ab2Var.t = wb2Var.getBackgroundDrawableRight() - rect.right;
                        }
                        ab2Var.l = true;
                        transitionParams.x0 = true;
                        transitionParams.h0 = -ab2Var.s;
                        transitionParams.i0 = -ab2Var.t;
                        transitionParams.k0 = -ab2Var.u;
                        transitionParams.j0 = -ab2Var.v;
                        d79Var.setClipChildren(false);
                        d79Var.invalidate();
                    } else {
                        ab2Var.v = wb2Var.getBackgroundDrawableBottom() - rect.bottom;
                        ab2Var.u = wb2Var.getBackgroundDrawableTop() - rect.top;
                        if (wb2Var.Y6 == transitionParams.F0) {
                        }
                        ab2Var.l = true;
                        transitionParams.x0 = true;
                        transitionParams.h0 = -ab2Var.s;
                        transitionParams.i0 = -ab2Var.t;
                        transitionParams.k0 = -ab2Var.u;
                        transitionParams.j0 = -ab2Var.v;
                        d79Var.setClipChildren(false);
                        d79Var.invalidate();
                    }
                }
            } else {
                view = view2;
                i6 = i11;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    d79 d79Var2 = (d79) view.getParent();
                    l47 l47Var2 = currentMessagesGroup.m;
                    boolean z6 = true;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    while (i15 < d79Var2.getChildCount()) {
                        View childAt = d79Var2.getChildAt(i15);
                        if (childAt instanceof wb2) {
                            wb2 wb2Var3 = (wb2) childAt;
                            if (wb2Var3.getCurrentMessagesGroup() == currentMessagesGroup && !wb2Var3.getMessageObject().Z) {
                                int backgroundDrawableLeft = wb2Var3.getBackgroundDrawableLeft() + wb2Var3.getLeft();
                                m47Var = currentMessagesGroup;
                                int backgroundDrawableRight = wb2Var3.getBackgroundDrawableRight() + wb2Var3.getLeft();
                                i7 = i15;
                                int backgroundDrawableTop = wb2Var3.getBackgroundDrawableTop() + wb2Var3.getPaddingTop() + wb2Var3.getTop();
                                int backgroundDrawableBottom = wb2Var3.getBackgroundDrawableBottom() + wb2Var3.getPaddingTop() + wb2Var3.getTop();
                                if (i18 == 0 || backgroundDrawableLeft < i18) {
                                    i18 = backgroundDrawableLeft;
                                }
                                if (i19 == 0 || backgroundDrawableRight > i19) {
                                    i19 = backgroundDrawableRight;
                                }
                                if (wb2Var3.getTransitionParams().w0 || l47Var2.p) {
                                    if (i16 == 0 || backgroundDrawableTop < i16) {
                                        i16 = backgroundDrawableTop;
                                    }
                                    if (i17 == 0 || backgroundDrawableBottom > i17) {
                                        i17 = backgroundDrawableBottom;
                                    }
                                    z6 = false;
                                }
                                i15 = i7 + 1;
                                currentMessagesGroup = m47Var;
                            }
                        }
                        m47Var = currentMessagesGroup;
                        i7 = i15;
                        i15 = i7 + 1;
                        currentMessagesGroup = m47Var;
                    }
                    l47Var2.p = false;
                    if (i16 == 0 && i17 == 0 && i18 == 0 && i19 == 0) {
                        ab2Var.j = false;
                        l47Var2.j = false;
                    } else {
                        int i20 = (-i16) + l47Var2.b;
                        ab2Var.f = i20;
                        int i21 = (-i17) + l47Var2.d;
                        ab2Var.g = i21;
                        int i22 = (-i18) + l47Var2.a;
                        ab2Var.h = i22;
                        int i23 = (-i19) + l47Var2.c;
                        ab2Var.i = i23;
                        ab2Var.j = true;
                        l47Var2.j = true;
                        l47Var2.f = i20;
                        l47Var2.h = i21;
                        l47Var2.e = i22;
                        l47Var2.g = i23;
                        l47Var2.n = l47Var2.o ? 1.0f : f;
                        d79Var2.setClipChildren(false);
                        d79Var2.invalidate();
                    }
                    l47Var2.i = z6;
                }
            }
            Integer valueOf = Integer.valueOf(wb2Var.getMessageObject().e1());
            HashMap hashMap = this.H;
            m47 m47Var2 = (m47) hashMap.get(valueOf);
            if (m47Var2 != null) {
                l47 l47Var3 = m47Var2.m;
                hashMap.remove(Integer.valueOf(wb2Var.getMessageObject().e1()));
                if (transitionParams.w0) {
                    int backgroundDrawableLeft2 = wb2Var.getBackgroundDrawableLeft() + wb2Var.getLeft();
                    int backgroundDrawableRight2 = wb2Var.getBackgroundDrawableRight() + wb2Var.getLeft();
                    int backgroundDrawableTop2 = wb2Var.getBackgroundDrawableTop() + wb2Var.getPaddingTop() + wb2Var.getTop();
                    int backgroundDrawableBottom2 = wb2Var.getBackgroundDrawableBottom() + wb2Var.getPaddingTop() + wb2Var.getTop();
                    ab2Var.w = true;
                    transitionParams.x0 = true;
                    ab2Var.s = backgroundDrawableLeft2 - l47Var3.a;
                    ab2Var.t = backgroundDrawableRight2 - l47Var3.c;
                    ab2Var.u = backgroundDrawableTop2 - l47Var3.b;
                    ab2Var.v = backgroundDrawableBottom2 - l47Var3.d;
                    ab2Var.l = false;
                    transitionParams.h0 = (int) ((-r6) - wb2Var.getAnimationOffsetX());
                    transitionParams.i0 = (int) ((-ab2Var.t) - wb2Var.getAnimationOffsetX());
                    transitionParams.k0 = (int) ((-ab2Var.u) - wb2Var.getTranslationY());
                    transitionParams.j0 = (int) ((-ab2Var.v) - wb2Var.getTranslationY());
                    transitionParams.D0 = true;
                    d79Var.setClipChildren(false);
                    d79Var.invalidate();
                } else {
                    l47Var3.i = true;
                }
            }
            j47 j47Var = wb2Var.M;
            if (transitionParams.z0 != (wb2Var.C6 || wb2Var.K || (j47Var != null && (j47Var.l & 8) == 0 && wb2Var.L.i))) {
                z = true;
                ab2Var.k = true;
                f6 = f;
                transitionParams.A0 = f6;
            } else {
                f6 = f;
                z = true;
            }
            boolean a = transitionParams.a();
            ab2Var.m = a;
            if (a) {
                transitionParams.h = z;
                transitionParams.L1 = f6;
            }
            if (i6 == 0 && i12 == 0 && !ab2Var.n && !ab2Var.w && !ab2Var.j && !ab2Var.k && !ab2Var.l && !a) {
                v(f89Var);
                return false;
            }
        } else if (dl1Var2 != null) {
            cl1 transitionParams2 = dl1Var2.getTransitionParams();
            transitionParams2.getClass();
            if (i11 != 0) {
                view2.setTranslationX(-i11);
            }
            boolean a2 = !transitionParams2.a ? false : transitionParams2.d.F0.a();
            ab2Var.m = a2;
            if (a2) {
                transitionParams2.b = true;
                transitionParams2.c = 0.0f;
            }
            if (i11 == 0 && i12 == 0 && !a2) {
                v(f89Var);
                return false;
            }
        } else if (view2 instanceof eq0) {
            ((eq0) view2).setAnimating(true);
        } else if (view2 instanceof gbc) {
            ((gbc) view2).setAnimating(true);
        } else if (i11 != 0) {
            view2.setTranslationX(-i11);
        } else if (i12 == 0) {
            v(f89Var);
            return false;
        }
        this.r.add(ab2Var);
        F();
        return true;
    }

    @Override // zb3, cma
    public final void s(f89 f89Var, l09 l09Var) {
        if (f11.a) {
            cc4.b("animate remove");
        }
        super.s(f89Var, l09Var);
        View view = f89Var.a;
        if (l09Var != null) {
            int i = l09Var.c;
            int top = view.getTop();
            int left = view.getLeft() - l09Var.b;
            if (top - i != 0) {
                view.setTranslationY(-r0);
            }
            if (!(view instanceof wb2)) {
                if (left != 0) {
                    view.setTranslationX(-left);
                    return;
                }
                return;
            }
            wb2 wb2Var = (wb2) view;
            if (left != 0) {
                wb2Var.setAnimationOffsetX(-left);
            }
            if (l09Var instanceof za2) {
                za2 za2Var = (za2) l09Var;
                wb2Var.x3(za2Var.e, za2Var.f, za2Var.g, za2Var.h);
            }
        }
    }
}
