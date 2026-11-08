package mi;

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
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import bi.de;
import di.g3;
import e2.r0;
import fi.b5;
import fi.v3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import jg.j0;
import jg.x;
import l2.z0;
import m9.u;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.aj;
import org.telegram.messenger.cj;
import org.telegram.messenger.dj;
import org.telegram.messenger.g0;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.r2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.g1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.ue;
import org.telegram.ui.Components.xq;
import org.telegram.ui.an;
import org.telegram.ui.ic1;
import org.telegram.ui.l51;
import org.telegram.ui.pe;
import org.telegram.ui.qj;
import r0.i0;
import v4.a1;
import v4.d1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public abstract class l extends v4.k {
    public static final xq V = new xq(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final an F;
    public final pj0 G;
    public boolean N;
    public d1 O;
    public pn P;
    public boolean Q;
    public final f6 R;
    public pe T;
    public pe U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public l(an anVar, pj0 pj0Var, f6 f6Var) {
        this.R = f6Var;
        this.F = anVar;
        this.G = pj0Var;
        this.o = V;
        this.n = true;
        this.m = false;
    }

    @Override // v4.k
    public final void B(v4.i iVar) {
        v4.i iVar2;
        d1 d1Var = iVar.a;
        View view = d1Var == null ? null : d1Var.a;
        d1 d1Var2 = iVar.b;
        View view2 = d1Var2 != null ? d1Var2.a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(iVar.a);
            duration.translationX(iVar.e - iVar.c);
            duration.translationY(iVar.f - iVar.d);
            iVar2 = iVar;
            duration.alpha(0.0f).setListener(new i(this, iVar2, duration, view, 0)).start();
        } else {
            iVar2 = iVar;
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(iVar2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new i(this, iVar2, animate, view2, 1)).start();
        }
    }

    @Override // v4.k
    public final void C(d1 d1Var, v4.j jVar) {
        T(d1Var, jVar, false);
    }

    @Override // v4.k
    public final boolean J(v4.i iVar, d1 d1Var) {
        dz0 dz0Var;
        if (r2.a) {
            a8.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(d1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = d1Var.a;
        if (this.K.contains(view) && (dz0Var = (dz0) this.U.run()) != null) {
            dz0Var.a(view);
        }
        if (iVar.b == d1Var) {
            iVar.b = null;
        } else {
            if (iVar.a != d1Var) {
                return false;
            }
            iVar.a = null;
        }
        X(view);
        d(d1Var);
        return true;
    }

    @Override // v4.k
    public final long L() {
        return 0L;
    }

    @Override // v4.k
    public void N() {
        this.G.setClipChildren(true);
        while (true) {
            ArrayList arrayList = this.L;
            if (arrayList.isEmpty()) {
                U();
                return;
            }
            ((Runnable) arrayList.remove(0)).run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(final d1 d1Var, v4.j jVar, boolean z9) {
        d1 d1Var2;
        int i7;
        x1 x1Var;
        q1 q1Var;
        boolean z10;
        float f10;
        boolean z11;
        final k kVar;
        final q1 q1Var2;
        x1 x1Var2;
        final int i10;
        final x1 x1Var3;
        ValueAnimator valueAnimator;
        final boolean z12;
        int[] iArr;
        int i11 = jVar.c;
        int i12 = jVar.e;
        View view = d1Var.a;
        int i13 = i12 - i11;
        AnimatorSet animatorSet = new AnimatorSet();
        int i14 = 0;
        final int i15 = 1;
        if (i13 != 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.z.add(d1Var);
        final k kVar2 = (k) jVar;
        an anVar = this.F;
        if (anVar != null && (view instanceof f0)) {
            f0 f0Var = (f0) view;
            float translationY = f0Var.getTranslationY();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new h(this, f0Var, translationY, i14));
            animatorSet.playTogether(ofFloat);
        } else {
            if (anVar == null || !(view instanceof ra)) {
                if (view instanceof q1) {
                    final q1 q1Var3 = (q1) view;
                    final x1 transitionParams = q1Var3.getTransitionParams();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(q1Var3, q1Var3.Xc, 0.0f));
                    if (kVar2.n) {
                        q1Var3.u3(kVar2.o, kVar2.p, kVar2.q, kVar2.r);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        final float f11 = q1Var3.getCurrentMessagesGroup() == null ? transitionParams.v0 : q1Var3.getCurrentMessagesGroup().m.n;
                        final float c22 = q1Var3.getCurrentMessagesGroup() == null ? q1Var3.c2() : q1Var3.getCurrentMessagesGroup().c;
                        if (f11 != c22) {
                            valueAnimator = ofFloat2;
                            z12 = true;
                        } else {
                            valueAnimator = ofFloat2;
                            z12 = false;
                        }
                        if (transitionParams.C0) {
                            z10 = false;
                            iArr = new int[4];
                            int i16 = 0;
                            for (int i17 = 4; i16 < i17; i17 = 4) {
                                iArr[i16] = q1Var3.getPhotoImage().W0[i16];
                                i16++;
                            }
                        } else {
                            z10 = false;
                            iArr = null;
                        }
                        final int[] iArr2 = iArr;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        i7 = 2;
                        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: mi.a
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                k kVar3 = k.this;
                                float f12 = 1.0f - floatValue;
                                float f13 = kVar3.o * f12;
                                x1 x1Var4 = transitionParams;
                                float f14 = (x1Var4.n0 * floatValue) + f13;
                                float f15 = (x1Var4.o0 * floatValue) + (kVar3.p * f12);
                                float f16 = (x1Var4.p0 * floatValue) + (kVar3.q * f12);
                                float f17 = (x1Var4.q0 * floatValue) + (kVar3.r * f12);
                                boolean z13 = z12;
                                q1 q1Var4 = q1Var3;
                                if (z13) {
                                    float f18 = (c22 * floatValue) + (f11 * f12);
                                    x1Var4.v0 = f18;
                                    if (q1Var4.getCurrentMessagesGroup() != null) {
                                        q1Var4.getCurrentMessagesGroup().m.n = f18;
                                    }
                                }
                                if (x1Var4.C0) {
                                    ImageReceiver photoImage = q1Var4.getPhotoImage();
                                    int[] iArr3 = iArr2;
                                    int[] iArr4 = x1Var4.B0;
                                    photoImage.K0((int) ((iArr4[0] * floatValue) + (iArr3[0] * f12)), (int) ((iArr4[1] * floatValue) + (iArr3[1] * f12)), (int) ((iArr4[2] * floatValue) + (iArr3[2] * f12)), (int) ((iArr4[3] * floatValue) + (iArr3[3] * f12)));
                                }
                                q1Var4.u3(f14, f15, f16, f17);
                                d1Var.a.invalidate();
                            }
                        };
                        x1Var = transitionParams;
                        q1Var = q1Var3;
                        d1Var2 = d1Var;
                        valueAnimator2.addUpdateListener(animatorUpdateListener);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[z10 ? 1 : 0] = valueAnimator2;
                        animatorSet.playTogether(animatorArr);
                    } else {
                        i7 = 2;
                        x1Var = transitionParams;
                        q1Var = q1Var3;
                        d1Var2 = d1Var;
                        z10 = false;
                    }
                    if (kVar2.v == 0 && kVar2.t == 0 && kVar2.u == 0 && kVar2.s == 0) {
                        f10 = 0.0f;
                        x1Var.l0 = 0.0f;
                        x1Var.m0 = 0.0f;
                        z11 = z10;
                    } else {
                        f10 = 0.0f;
                        pj0 pj0Var = this.G;
                        pj0Var.setClipChildren(z10);
                        pj0Var.invalidate();
                        float[] fArr = new float[i7];
                        // fill-array-data instruction
                        fArr[0] = 1.0f;
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr);
                        if (kVar2.l) {
                            x1Var.l0 = -kVar2.s;
                            x1Var.m0 = -kVar2.t;
                        } else {
                            x1Var.l0 = (-kVar2.s) - q1Var.getAnimationOffsetX();
                            x1Var.m0 = (-kVar2.t) - q1Var.getAnimationOffsetX();
                        }
                        ofFloat3.addUpdateListener(new g3(kVar2, x1Var, q1Var, 3));
                        z11 = false;
                        animatorSet.playTogether(ofFloat3);
                    }
                    dj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        kVar2.j = z11;
                    }
                    if (kVar2.j) {
                        float[] fArr2 = new float[i7];
                        // fill-array-data instruction
                        fArr2[0] = 1.0f;
                        fArr2[1] = 0.0f;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr2);
                        x1 x1Var4 = x1Var;
                        final cj cjVar = currentMessagesGroup.m;
                        final pj0 pj0Var2 = (pj0) view.getParent();
                        final float f12 = currentMessagesGroup.m.n;
                        if (currentMessagesGroup.c) {
                            f10 = 1.0f;
                        }
                        final boolean z13 = f12 != f10;
                        x1Var2 = x1Var4;
                        final float f13 = f10;
                        kVar = kVar2;
                        q1Var2 = q1Var;
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mi.b
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                k kVar3 = kVar;
                                cj cjVar2 = cj.this;
                                cjVar2.f = kVar3.f * floatValue;
                                cjVar2.h = kVar3.g * floatValue;
                                cjVar2.e = kVar3.h * floatValue;
                                cjVar2.g = kVar3.i * floatValue;
                                if (z13) {
                                    cjVar2.n = com.google.android.recaptcha.internal.a.z(1.0f, floatValue, f13, f12 * floatValue);
                                }
                                pj0 pj0Var3 = pj0Var2;
                                if (pj0Var3 != null) {
                                    pj0Var3.invalidate();
                                }
                            }
                        });
                        ofFloat4.addListener(new m.a(cjVar, 1));
                        i10 = 0;
                        animatorSet.playTogether(ofFloat4);
                    } else {
                        kVar = kVar2;
                        q1Var2 = q1Var;
                        x1Var2 = x1Var;
                        i10 = 0;
                    }
                    if (kVar.k) {
                        float[] fArr3 = new float[i7];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(fArr3);
                        x1Var3 = x1Var2;
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mi.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i10) {
                                    case 0:
                                        x1Var3.A0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        q1Var2.invalidate();
                                        break;
                                    default:
                                        x1Var3.L1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        q1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i10] = ofFloat5;
                        animatorSet.playTogether(animatorArr2);
                    } else {
                        x1Var3 = x1Var2;
                    }
                    if (kVar.m) {
                        float[] fArr4 = new float[i7];
                        // fill-array-data instruction
                        fArr4[0] = 0.0f;
                        fArr4[1] = 1.0f;
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(fArr4);
                        x1Var3.h = true;
                        ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mi.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i15) {
                                    case 0:
                                        x1Var3.A0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        q1Var2.invalidate();
                                        break;
                                    default:
                                        x1Var3.L1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        q1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        animatorSet.playTogether(ofFloat6);
                    }
                } else {
                    d1Var2 = d1Var;
                    if (view instanceof t0) {
                        t0 t0Var = (t0) view;
                        s0 transitionParams2 = t0Var.getTransitionParams();
                        if (kVar2.m) {
                            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            transitionParams2.b = true;
                            ofFloat7.addUpdateListener(new de(9, transitionParams2, t0Var));
                            animatorSet.playTogether(ofFloat7);
                        }
                    }
                }
                if (z9) {
                    Interpolator interpolator = this.o;
                    if (interpolator != null) {
                        animatorSet.setInterpolator(interpolator);
                    }
                } else {
                    animatorSet.setInterpolator(xq.g);
                }
                animatorSet.setDuration((long) (250 * (z9 ? 1.9f : 1.0f)));
                animatorSet.addListener(new b5(this, d1Var2, i13, view));
                animatorSet.start();
                this.J.put(d1Var2, animatorSet);
            }
            ra raVar = (ra) view;
            float translationY2 = raVar.getTranslationY();
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat8.addUpdateListener(new h(this, raVar, translationY2, i15));
            animatorSet.playTogether(ofFloat8);
        }
        d1Var2 = d1Var;
        if (z9) {
        }
        animatorSet.setDuration((long) (250 * (z9 ? 1.9f : 1.0f)));
        animatorSet.addListener(new b5(this, d1Var2, i13, view));
        animatorSet.start();
        this.J.put(d1Var2, animatorSet);
    }

    public final void U() {
        dz0 dz0Var;
        HashMap hashMap = this.J;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (this.K.isEmpty() || (dz0Var = (dz0) this.U.run()) == null) {
            return;
        }
        ArrayList arrayList2 = dz0Var.c;
        if (dz0Var.e) {
            return;
        }
        dz0Var.e = true;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            cz0 cz0Var = (cz0) obj2;
            Runnable runnable = cz0Var.d;
            if (runnable != null) {
                dz0.b(runnable);
                cz0Var.d = null;
            }
        }
        arrayList2.clear();
        bz0 bz0Var = dz0Var.a;
        if (bz0Var != null) {
            bz0Var.h();
        }
        Runnable runnable2 = dz0Var.d;
        if (runnable2 != null) {
            dz0Var.d = null;
            dz0.b(runnable2);
        }
    }

    public final void V(dj djVar) {
        if (djVar == null) {
            return;
        }
        ArrayList arrayList = djVar.d;
        cj cjVar = djVar.m;
        if (arrayList.size() == 0) {
            cjVar.i = true;
            return;
        }
        if (cjVar.b == 0 && cjVar.d == 0 && cjVar.a == 0 && cjVar.c == 0) {
            pj0 pj0Var = this.G;
            int childCount = pj0Var.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt = pj0Var.getChildAt(i7);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    ij messageObject = q1Var.getMessageObject();
                    if (q1Var.getTransitionParams().w0 && arrayList.contains(messageObject)) {
                        cjVar.b = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                        cjVar.d = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                        cjVar.a = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                        cjVar.c = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                        cjVar.o = q1Var.c2();
                        cjVar.k = q1Var.I2();
                        cjVar.l = q1Var.H2();
                        cjVar.p = true;
                        break;
                    }
                }
                i7++;
            }
        }
        this.I.add(djVar);
    }

    public abstract void W();

    public final void X(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z9 = view instanceof f0;
        pj0 pj0Var = this.G;
        if (z9) {
            int measuredHeight = (pj0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((f0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof ra) {
            int measuredHeight2 = (pj0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((ra) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof q1) {
            q1 q1Var = (q1) view;
            q1Var.getTransitionParams().e();
            q1Var.setAnimationOffsetX(0.0f);
        } else {
            if (!(view instanceof t0)) {
                view.setTranslationX(0.0f);
                return;
            }
            s0 transitionParams = ((t0) view).getTransitionParams();
            transitionParams.b = false;
            transitionParams.c = 1.0f;
        }
    }

    public final void Y(pe peVar, pe peVar2) {
        this.T = peVar;
        this.U = peVar2;
    }

    public final boolean Z(View view) {
        d1 T;
        if (this.N || (T = this.G.T(view)) == null) {
            return false;
        }
        return this.q.contains(T) || this.y.contains(T);
    }

    @Override // v4.f1, v4.l0
    public final boolean a(d1 d1Var, r0 r0Var, r0 r0Var2) {
        ArrayList arrayList;
        int i7;
        boolean a10 = super.a(d1Var, r0Var, r0Var2);
        if (a10 && this.N) {
            int i10 = 0;
            boolean z9 = false;
            while (true) {
                arrayList = this.q;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((d1) arrayList.get(i10)).c() == 0) {
                    z9 = true;
                }
                i10++;
            }
            if (z9) {
                i7 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    i7 += ((d1) arrayList.get(i11)).a.getHeight();
                }
            } else {
                i7 = 0;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((d1) arrayList.get(i12)).a.setTranslationY(i7);
            }
        }
        return a10;
    }

    public final boolean a0(View view) {
        d1 T = this.G.T(view);
        if (T != null) {
            return this.p.contains(T) || this.A.contains(T);
        }
        return false;
    }

    @Override // v4.k, v4.l0
    public final void f(d1 d1Var) {
        dz0 dz0Var;
        Animator animator = (Animator) this.J.remove(d1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = d1Var.a;
        if (this.K.contains(view) && (dz0Var = (dz0) this.U.run()) != null) {
            dz0Var.a(view);
        }
        super.f(d1Var);
        X(view);
    }

    @Override // v4.k, v4.l0
    public void g() {
        if (r2.a) {
            a8.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((dj) obj).m.p = false;
        }
        arrayList.clear();
        U();
        pn pnVar = this.P;
        if (pnVar != null) {
            pnVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.j jVar = (v4.j) arrayList2.get(size2);
            X(jVar.a.a);
            v(jVar.a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            d1 d1Var = (d1) arrayList3.get(size3);
            X(d1Var.a);
            d(d1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            d1 d1Var2 = (d1) arrayList4.get(size4);
            X(d1Var2.a);
            u(d1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((v4.i) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (k()) {
            ArrayList arrayList6 = this.u;
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
                for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                    v4.j jVar2 = (v4.j) arrayList7.get(size7);
                    X(jVar2.a.a);
                    v(jVar2.a);
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
                    d1 d1Var3 = (d1) arrayList9.get(size9);
                    X(d1Var3.a);
                    u(d1Var3);
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
                    I((v4.i) arrayList11.get(size11));
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

    @Override // v4.l0
    public final long i() {
        return 250L;
    }

    @Override // v4.l0
    public final long j() {
        return 250L;
    }

    @Override // v4.l0
    public final r0 l(a1 a1Var, d1 d1Var, int i7, List list) {
        r0 l10 = super.l(a1Var, d1Var, i7, list);
        View view = d1Var.a;
        if (!(view instanceof q1)) {
            return l10;
        }
        j jVar = new j();
        jVar.a = l10.a;
        jVar.b = l10.b;
        x1 transitionParams = ((q1) view).getTransitionParams();
        jVar.c = transitionParams.b;
        jVar.d = transitionParams.c;
        jVar.e = transitionParams.d;
        jVar.f = transitionParams.e;
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0477 A[EDGE_INSN: B:226:0x0477->B:227:0x0477 BREAK  A[LOOP:9: B:195:0x03be->B:219:0x046d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0201  */
    @Override // v4.k, v4.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        boolean z9;
        boolean z10;
        pj0 pj0Var;
        boolean z11;
        boolean z12;
        int size;
        int i7;
        HashMap hashMap;
        float f10;
        int i10;
        ArrayList arrayList;
        pj0 pj0Var2;
        float f11;
        boolean z13;
        ArrayList arrayList2;
        int i11;
        int i12;
        ArrayList arrayList3;
        boolean z14;
        boolean z15;
        pe peVar;
        int i13;
        dj currentMessagesGroup;
        boolean z16;
        pj0 pj0Var3;
        boolean z17;
        ij messageObject;
        pe peVar2;
        int i14;
        int i15;
        boolean z18;
        an anVar;
        Runnable runnable;
        ue ueVar;
        int i16;
        l lVar = this;
        ArrayList arrayList4 = lVar.p;
        boolean isEmpty = arrayList4.isEmpty();
        ArrayList arrayList5 = lVar.r;
        boolean isEmpty2 = arrayList5.isEmpty();
        ArrayList arrayList6 = lVar.s;
        boolean isEmpty3 = arrayList6.isEmpty();
        ArrayList arrayList7 = lVar.q;
        boolean isEmpty4 = arrayList7.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        boolean z19 = lVar.N;
        pj0 pj0Var4 = lVar.G;
        if (z19) {
            z9 = false;
            for (0; i16 < arrayList7.size(); i16 + 1) {
                if (lVar.Q) {
                    i16 = ((d1) arrayList7.get(i16)).c() != (pj0Var4.getAdapter() == null ? 0 : pj0Var4.getAdapter().b()) - 1 ? i16 + 1 : 0;
                    z9 = true;
                } else {
                    if (((d1) arrayList7.get(i16)).c() != 0) {
                    }
                    z9 = true;
                }
            }
        } else {
            z9 = false;
        }
        lVar.W();
        ArrayList arrayList8 = lVar.y;
        float f12 = 1.0f;
        if (z9) {
            boolean isEmpty5 = arrayList4.isEmpty();
            boolean isEmpty6 = arrayList5.isEmpty();
            boolean isEmpty7 = arrayList6.isEmpty();
            boolean isEmpty8 = arrayList7.isEmpty();
            if (!isEmpty5 || !isEmpty6 || !isEmpty8 || !isEmpty7) {
                int i17 = 0;
                for (0; i14 < arrayList7.size(); i14 + 1) {
                    View view = ((d1) arrayList7.get(i14)).a;
                    if (view instanceof q1) {
                        q1 q1Var = (q1) view;
                        i14 = (q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0) ? i14 + 1 : 0;
                    }
                    i17 += ((d1) arrayList7.get(i14)).a.getHeight();
                }
                int size2 = arrayList4.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj = arrayList4.get(i18);
                    i18++;
                    lVar.D((d1) obj);
                }
                arrayList4.clear();
                if (!isEmpty6) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList5);
                    arrayList5.clear();
                    int size3 = arrayList9.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj2 = arrayList9.get(i19);
                        i19++;
                        v4.j jVar = (v4.j) obj2;
                        lVar.T(jVar.a, jVar, false);
                    }
                    arrayList9.clear();
                }
                if (!isEmpty8) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.addAll(arrayList7);
                    arrayList7.clear();
                    int size4 = arrayList10.size();
                    int i20 = 0;
                    while (i20 < size4) {
                        Object obj3 = arrayList10.get(i20);
                        i20++;
                        d1 d1Var = (d1) obj3;
                        View view2 = d1Var.a;
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList8.add(d1Var);
                        view2.setTranslationY(i17);
                        View view3 = d1Var.a;
                        view3.setScaleX(f12);
                        view3.setScaleY(f12);
                        q1 q1Var2 = view3 instanceof q1 ? (q1) view3 : null;
                        if (q1Var2 == null || !q1Var2.getTransitionParams().y0) {
                            view3.setAlpha(f12);
                        }
                        an anVar2 = lVar.F;
                        if (anVar2 != null) {
                            ArrayList arrayList11 = anVar2.I4;
                            if (q1Var2 != null && arrayList11.contains(q1Var2.getMessageObject())) {
                                arrayList11.remove(q1Var2.getMessageObject());
                                qj qjVar = anVar2.Z;
                                if (qjVar.f0 == null || !((ueVar = qjVar.L0) == null || ueVar.p0)) {
                                    i15 = size4;
                                } else {
                                    i15 = size4;
                                    if (System.currentTimeMillis() - qjVar.M0 > 300) {
                                        z18 = true;
                                        qjVar.M0 = -1L;
                                        if (z18) {
                                            if (ij.S4(q1Var2.getMessageObject().k)) {
                                                if (Math.abs(view2.getTranslationY()) < view2.getMeasuredHeight() * 3.0f) {
                                                    new ic1(q1Var2, anVar2.Z, lVar.G, anVar2.fa, lVar.R).f.start();
                                                }
                                            } else if (iz.o() != 0 && Math.abs(view2.getTranslationY()) < pj0Var4.getMeasuredHeight()) {
                                                anVar = anVar2;
                                                ValueAnimator valueAnimator = new l51(q1Var2, anVar2, lVar.G, anVar2.fa, lVar.R).d;
                                                if (valueAnimator != null) {
                                                    valueAnimator.start();
                                                }
                                                qj qjVar2 = anVar.Z;
                                                runnable = qjVar2.f0;
                                                if (runnable != null) {
                                                    g0.r(runnable);
                                                    qjVar2.g0 = true;
                                                    qjVar2.f0.run();
                                                    qjVar2.f0 = null;
                                                    animate.translationY(0.0f).setDuration(250L).setInterpolator(lVar.o).setListener(new j0(lVar, d1Var, view2, animate)).start();
                                                    size4 = i15;
                                                    f12 = 1.0f;
                                                }
                                            }
                                            anVar = anVar2;
                                            qj qjVar22 = anVar.Z;
                                            runnable = qjVar22.f0;
                                            if (runnable != null) {
                                            }
                                        }
                                        animate.translationY(0.0f).setDuration(250L).setInterpolator(lVar.o).setListener(new j0(lVar, d1Var, view2, animate)).start();
                                        size4 = i15;
                                        f12 = 1.0f;
                                    }
                                }
                                z18 = false;
                                qjVar.M0 = -1L;
                                if (z18) {
                                }
                                animate.translationY(0.0f).setDuration(250L).setInterpolator(lVar.o).setListener(new j0(lVar, d1Var, view2, animate)).start();
                                size4 = i15;
                                f12 = 1.0f;
                            }
                        }
                        i15 = size4;
                        animate.translationY(0.0f).setDuration(250L).setInterpolator(lVar.o).setListener(new j0(lVar, d1Var, view2, animate)).start();
                        size4 = i15;
                        f12 = 1.0f;
                    }
                    arrayList10.clear();
                }
            }
        } else {
            boolean isEmpty9 = arrayList4.isEmpty();
            boolean isEmpty10 = arrayList5.isEmpty();
            boolean isEmpty11 = arrayList6.isEmpty();
            boolean isEmpty12 = arrayList7.isEmpty();
            if (!isEmpty9 || !isEmpty10 || !isEmpty12 || !isEmpty11) {
                boolean z20 = (lVar.U == null || (peVar2 = lVar.T) == null || !((Boolean) peVar2.run()).booleanValue()) ? false : true;
                ArrayList arrayList12 = lVar.K;
                ArrayList arrayList13 = lVar.A;
                int i21 = 1;
                ArrayList arrayList14 = lVar.S;
                if (z20) {
                    LongSparseArray longSparseArray = null;
                    int i22 = 0;
                    while (i22 < arrayList4.size()) {
                        d1 d1Var2 = (d1) arrayList4.get(i22);
                        if (arrayList14.contains(d1Var2)) {
                            z16 = isEmpty10;
                            View view4 = d1Var2.a;
                            z17 = isEmpty11;
                            if (!(view4 instanceof q1) || ((q1) view4).getCurrentMessagesGroup() == null || (messageObject = ((q1) d1Var2.a).getMessageObject()) == null || messageObject.d1() == 0) {
                                pj0Var3 = pj0Var4;
                            } else {
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                pj0Var3 = pj0Var4;
                                ArrayList arrayList15 = (ArrayList) longSparseArray.get(messageObject.d1());
                                if (arrayList15 == null) {
                                    long d12 = messageObject.d1();
                                    ArrayList arrayList16 = new ArrayList();
                                    longSparseArray.put(d12, arrayList16);
                                    arrayList15 = arrayList16;
                                }
                                arrayList14.remove(d1Var2);
                                arrayList4.remove(i22);
                                i22--;
                                arrayList15.add(d1Var2);
                            }
                        } else {
                            z16 = isEmpty10;
                            pj0Var3 = pj0Var4;
                            z17 = isEmpty11;
                        }
                        i22++;
                        isEmpty10 = z16;
                        isEmpty11 = z17;
                        pj0Var4 = pj0Var3;
                    }
                    z10 = isEmpty10;
                    pj0Var = pj0Var4;
                    z11 = isEmpty11;
                    if (longSparseArray != null) {
                        int i23 = 0;
                        z12 = false;
                        while (i23 < longSparseArray.size()) {
                            ArrayList arrayList17 = (ArrayList) longSparseArray.valueAt(i23);
                            if (arrayList17.size() > 0) {
                                View view5 = ((d1) arrayList17.get(0)).a;
                                if (!(view5 instanceof q1) || (currentMessagesGroup = ((q1) view5).getCurrentMessagesGroup()) == null || currentMessagesGroup.d.size() <= arrayList17.size()) {
                                    if (r2.a) {
                                        a8.b("animate remove group impl with thanos");
                                    }
                                    arrayList13.addAll(arrayList17);
                                    dz0 dz0Var = (dz0) lVar.U.run();
                                    for (int i24 = 0; i24 < arrayList17.size(); i24++) {
                                    }
                                    ArrayList arrayList18 = new ArrayList();
                                    i13 = i23;
                                    for (int i25 = 0; i25 < arrayList17.size(); i25++) {
                                        arrayList18.add(((d1) arrayList17.get(i25)).a);
                                    }
                                    z0 z0Var = new z0(lVar, arrayList18, arrayList17, 7);
                                    bz0 bz0Var = dz0Var.a;
                                    if (bz0Var != null) {
                                        bz0Var.d(arrayList18, z0Var);
                                        Choreographer.getInstance().postFrameCallback(dz0Var.b);
                                    } else {
                                        dz0Var.c.add(new cz0(arrayList18, z0Var));
                                    }
                                    arrayList12.add((View) arrayList18.get(0));
                                    pj0Var.C0();
                                    z12 = true;
                                    i23 = i13 + 1;
                                } else {
                                    arrayList4.addAll(arrayList17);
                                }
                            }
                            i13 = i23;
                            i23 = i13 + 1;
                        }
                        size = arrayList4.size();
                        boolean z21 = z12;
                        i7 = 0;
                        while (true) {
                            hashMap = lVar.J;
                            if (i7 < size) {
                                break;
                            }
                            Object obj4 = arrayList4.get(i7);
                            int i26 = i7 + 1;
                            d1 d1Var3 = (d1) obj4;
                            boolean z22 = arrayList14.remove(d1Var3) && z20;
                            if (r2.a) {
                                arrayList2 = arrayList4;
                                i11 = size;
                                a8.b("animate remove impl ".concat(z22 ? " with thanos" : ""));
                            } else {
                                arrayList2 = arrayList4;
                                i11 = size;
                            }
                            View view6 = d1Var3.a;
                            arrayList13.add(d1Var3);
                            if (!z22 || (peVar = lVar.U) == null) {
                                i12 = i26;
                                arrayList3 = arrayList13;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view6, (Property<View, Float>) View.ALPHA, view6.getAlpha(), 0.0f);
                                z14 = z20;
                                z15 = z22;
                                ofFloat.setDuration(lVar.d);
                                ofFloat.addListener(new f(lVar, view6, d1Var3));
                                hashMap.put(d1Var3, ofFloat);
                                ofFloat.start();
                            } else {
                                dz0 dz0Var2 = (dz0) peVar.run();
                                i12 = i26;
                                z0 z0Var2 = new z0(lVar, view6, d1Var3, 8);
                                bz0 bz0Var2 = dz0Var2.a;
                                if (bz0Var2 != null) {
                                    bz0Var2.b(1.0f, view6, z0Var2);
                                    Choreographer.getInstance().postFrameCallback(dz0Var2.b);
                                } else {
                                    dz0Var2.c.add(new cz0(view6, z0Var2));
                                }
                                arrayList12.add(view6);
                                arrayList3 = arrayList13;
                                z14 = z20;
                                z15 = z22;
                            }
                            pj0Var.C0();
                            z20 = z14;
                            if (z15) {
                                z21 = true;
                            }
                            size = i11;
                            arrayList4 = arrayList2;
                            i7 = i12;
                            arrayList13 = arrayList3;
                        }
                        arrayList4.clear();
                        if (!z10) {
                            ArrayList arrayList19 = new ArrayList();
                            arrayList19.addAll(arrayList5);
                            lVar.u.add(arrayList19);
                            arrayList5.clear();
                            g gVar = new g(lVar, arrayList19, z21, 0);
                            if (!lVar.C || isEmpty9) {
                                gVar.run();
                            } else {
                                View view7 = ((v4.j) arrayList19.get(0)).a.a;
                                WeakHashMap weakHashMap = i0.a;
                                view7.postOnAnimationDelayed(gVar, 0L);
                            }
                        }
                        if (!z11) {
                            ArrayList arrayList20 = new ArrayList();
                            arrayList20.addAll(arrayList6);
                            lVar.v.add(arrayList20);
                            arrayList6.clear();
                            u uVar = new u(lVar, arrayList20, false, 24);
                            if (!lVar.C || isEmpty9) {
                                uVar.run();
                            } else {
                                View view8 = ((v4.i) arrayList20.get(0)).a.a;
                                WeakHashMap weakHashMap2 = i0.a;
                                view8.postOnAnimationDelayed(uVar, 0L);
                            }
                        }
                        if (!isEmpty12) {
                            ArrayList arrayList21 = new ArrayList();
                            arrayList21.addAll(arrayList7);
                            arrayList7.clear();
                            Collections.sort(arrayList21, new x(7));
                            int size5 = arrayList21.size();
                            int i27 = 0;
                            while (i27 < size5) {
                                int i28 = i27 + 1;
                                d1 d1Var4 = (d1) arrayList21.get(i27);
                                if (r2.a) {
                                    a8.b("animate add impl");
                                }
                                View view9 = d1Var4.a;
                                arrayList8.add(d1Var4);
                                if (d1Var4 == lVar.O) {
                                    view9.setAlpha(1.0f);
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                if (view9 instanceof q1) {
                                    q1 q1Var3 = (q1) view9;
                                    if (q1Var3.getAnimationOffsetX() != 0.0f) {
                                        g1 g1Var = q1Var3.Xc;
                                        float[] fArr = new float[2];
                                        fArr[0] = q1Var3.getAnimationOffsetX();
                                        fArr[i21] = 0.0f;
                                        Animator[] animatorArr = new Animator[i21];
                                        animatorArr[0] = ObjectAnimator.ofFloat(q1Var3, g1Var, fArr);
                                        animatorSet.playTogether(animatorArr);
                                    }
                                    q1Var3.setPivotX(((q1Var3.getBackgroundDrawableRight() - q1Var3.getBackgroundDrawableLeft()) / 2.0f) + q1Var3.getBackgroundDrawableLeft());
                                    f10 = 0.0f;
                                    view9.animate().translationY(0.0f).setDuration(lVar.c).start();
                                } else {
                                    f10 = 0.0f;
                                    view9.animate().translationX(0.0f).translationY(0.0f).setDuration(lVar.c).start();
                                }
                                long max = (long) ((1.0f - Math.max(f10, Math.min(1.0f, view9.getBottom() / pj0Var.getMeasuredHeight()))) * 100.0f);
                                if (!(view9 instanceof q1)) {
                                    i10 = size5;
                                    arrayList = arrayList21;
                                    pj0Var2 = pj0Var;
                                    f11 = 1.0f;
                                } else if (d1Var4 == lVar.O) {
                                    pn pnVar = lVar.P;
                                    if (pnVar != null) {
                                        pnVar.h.setAlpha(0.0f);
                                    }
                                    pj0Var2 = pj0Var;
                                    pj0Var2.setClipChildren(false);
                                    final q1 q1Var4 = (q1) view9;
                                    View view10 = (View) lVar.P.getParent();
                                    float x10 = view10.getX() + lVar.P.getX() + lVar.P.h.getX();
                                    float y10 = view10.getY() + lVar.P.getY() + lVar.P.h.getY();
                                    float x11 = q1Var4.getX() + pj0Var2.getX() + q1Var4.getPhotoImage().K0;
                                    float y11 = q1Var4.getY() + pj0Var2.getY() + q1Var4.getPhotoImage().L0;
                                    final float width = lVar.P.h.getWidth();
                                    final float height = lVar.P.h.getHeight();
                                    final float f13 = q1Var4.getPhotoImage().M0;
                                    final float f14 = q1Var4.getPhotoImage().N0;
                                    final float f15 = x10 - x11;
                                    final float f16 = y10 - y11;
                                    final float f17 = q1Var4.getPhotoImage().K0;
                                    final float f18 = q1Var4.getPhotoImage().L0;
                                    q1Var4.getTransitionParams().g0 = true;
                                    q1Var4.getTransitionParams().K1 = true;
                                    q1Var4.getPhotoImage().y0(f17 + f15, f17 + f16, width, height);
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mi.d
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            q1 q1Var5 = q1.this;
                                            q1Var5.getTransitionParams().L1 = floatValue;
                                            if (q1Var5.getTransitionParams().L1 > 1.0f) {
                                                q1Var5.getTransitionParams().L1 = 1.0f;
                                            }
                                            float f19 = 1.0f - floatValue;
                                            q1Var5.getPhotoImage().y0((f15 * f19) + f17, (f16 * f19) + f18, (f13 * floatValue) + (width * f19), (f14 * floatValue) + (height * f19));
                                            q1Var5.invalidate();
                                        }
                                    });
                                    i10 = size5;
                                    arrayList = arrayList21;
                                    f11 = 1.0f;
                                    lVar = this;
                                    ofFloat2.addListener(new e(lVar, q1Var4, f17, f18, f13, f14));
                                    animatorSet.play(ofFloat2);
                                    max = max;
                                    z13 = false;
                                    view9.setAlpha(0.0f);
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), f11));
                                    if (z13) {
                                        view9.setScaleX(f11);
                                        view9.setScaleY(f11);
                                    } else {
                                        view9.setScaleX(0.9f);
                                        view9.setScaleY(0.9f);
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_Y, view9.getScaleY(), f11));
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_X, view9.getScaleX(), f11));
                                    }
                                    if (d1Var4 != lVar.O) {
                                        animatorSet.setDuration(350L);
                                        animatorSet.setInterpolator(new OvershootInterpolator());
                                    } else {
                                        animatorSet.setStartDelay(max);
                                        animatorSet.setDuration(250L);
                                    }
                                    animatorSet.addListener(new f(lVar, d1Var4, view9));
                                    hashMap.put(d1Var4, animatorSet);
                                    animatorSet.start();
                                    i21 = 1;
                                    i27 = i28;
                                    pj0Var = pj0Var2;
                                    size5 = i10;
                                    arrayList21 = arrayList;
                                } else {
                                    i10 = size5;
                                    arrayList = arrayList21;
                                    pj0Var2 = pj0Var;
                                    f11 = 1.0f;
                                    dj currentMessagesGroup2 = ((q1) view9).getCurrentMessagesGroup();
                                    if (currentMessagesGroup2 != null) {
                                        Long valueOf = Long.valueOf(currentMessagesGroup2.a);
                                        HashMap hashMap2 = lVar.M;
                                        Long l10 = (Long) hashMap2.get(valueOf);
                                        if (l10 == null) {
                                            hashMap2.put(Long.valueOf(currentMessagesGroup2.a), Long.valueOf(max));
                                        } else {
                                            max = l10.longValue();
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
                                z13 = true;
                                view9.setAlpha(0.0f);
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), f11));
                                if (z13) {
                                }
                                if (d1Var4 != lVar.O) {
                                }
                                animatorSet.addListener(new f(lVar, d1Var4, view9));
                                hashMap.put(d1Var4, animatorSet);
                                animatorSet.start();
                                i21 = 1;
                                i27 = i28;
                                pj0Var = pj0Var2;
                                size5 = i10;
                                arrayList21 = arrayList;
                            }
                            arrayList21.clear();
                        }
                    }
                } else {
                    z10 = isEmpty10;
                    pj0Var = pj0Var4;
                    z11 = isEmpty11;
                }
                z12 = false;
                size = arrayList4.size();
                boolean z212 = z12;
                i7 = 0;
                while (true) {
                    hashMap = lVar.J;
                    if (i7 < size) {
                    }
                    size = i11;
                    arrayList4 = arrayList2;
                    i7 = i12;
                    arrayList13 = arrayList3;
                }
                arrayList4.clear();
                if (!z10) {
                }
                if (!z11) {
                }
                if (!isEmpty12) {
                }
            }
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new v3(lVar, 9));
        ofFloat3.setDuration(lVar.d + 250);
        ofFloat3.start();
    }

    @Override // v4.k, v4.f1
    public final void p(d1 d1Var) {
        R(d1Var);
        View view = d1Var.a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof q1) {
            ((q1) view).getTransitionParams().i = true;
        }
        this.q.add(d1Var);
    }

    @Override // v4.k, v4.f1
    public final boolean q(d1 d1Var, d1 d1Var2, r0 r0Var, int i7, int i10, int i11, int i12) {
        if (d1Var == d1Var2) {
            return r(d1Var, r0Var, i7, i10, i11, i12);
        }
        View view = d1Var.a;
        float animationOffsetX = view instanceof q1 ? ((q1) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(d1Var);
        int i13 = (int) ((i11 - i7) - animationOffsetX);
        int i14 = (int) ((i12 - i10) - translationY);
        if (view instanceof q1) {
            ((q1) view).setAnimationOffsetX(animationOffsetX);
        } else {
            view.setTranslationX(animationOffsetX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = d1Var2.a;
        R(d1Var2);
        if (view2 instanceof q1) {
            ((q1) view2).setAnimationOffsetX(-i13);
        } else {
            view2.setTranslationX(-i13);
        }
        view2.setTranslationY(-i14);
        view2.setAlpha(0.0f);
        this.s.add(new v4.i(d1Var, d1Var2, i7, i10, i11, i12));
        F();
        return true;
    }

    @Override // v4.k, v4.f1
    public final boolean r(d1 d1Var, r0 r0Var, int i7, int i10, int i11, int i12) {
        int translationX;
        int i13;
        q1 q1Var;
        t0 t0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        View view;
        int i14;
        float f15;
        boolean z9;
        dj djVar;
        int i15;
        boolean Q3;
        View view2 = d1Var.a;
        if (view2 instanceof q1) {
            q1 q1Var2 = (q1) view2;
            translationX = i7 + ((int) q1Var2.getAnimationOffsetX());
            i13 = q1Var2.getTransitionParams().t2 != q1Var2.getTopMediaOffset() ? (q1Var2.getTransitionParams().t2 - q1Var2.getTopMediaOffset()) + i10 : i10;
            q1Var = q1Var2;
            t0Var = null;
        } else if (view2 instanceof t0) {
            translationX = i7 + ((int) view2.getTranslationX());
            i13 = i10;
            t0Var = (t0) view2;
            q1Var = null;
        } else {
            translationX = i7 + ((int) view2.getTranslationX());
            i13 = i10;
            q1Var = null;
            t0Var = null;
        }
        int i16 = translationX;
        int translationY = i13 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (q1Var != null) {
            float f16 = q1Var.getPhotoImage().K0;
            float f17 = q1Var.getPhotoImage().L0;
            float f18 = q1Var.getPhotoImage().M0;
            float f19 = q1Var.getPhotoImage().N0;
            f10 = 0.0f;
            int i17 = 0;
            for (int i18 = 4; i17 < i18; i18 = 4) {
                iArr[i17] = q1Var.getPhotoImage().W0[i17];
                i17++;
            }
            f12 = f16;
            f13 = f17;
            f11 = f19;
            f14 = f18;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
            f14 = 0.0f;
        }
        R(d1Var);
        int i19 = i11 - i16;
        int i20 = i12 - translationY;
        if (i20 != 0) {
            view2.setTranslationY(-i20);
        }
        float f20 = f11;
        t0 t0Var2 = t0Var;
        k kVar = new k(d1Var, i16, translationY, i11, i12);
        if (q1Var != null) {
            x1 transitionParams = q1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.u0;
            Rect rect = transitionParams.E0;
            dj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
            if (i19 != 0) {
                q1Var.setAnimationOffsetX(-i19);
            }
            boolean z10 = r0Var instanceof j;
            pj0 pj0Var = this.G;
            if (z10) {
                ImageReceiver photoImage = q1Var.getPhotoImage();
                view = view2;
                j jVar = (j) r0Var;
                i14 = i19;
                boolean z11 = (!transitionParams.w0 || jVar.f == f10 || jVar.e == f10) ? false : true;
                kVar.n = z11;
                if (z11) {
                    pj0Var.setClipChildren(false);
                    pj0Var.invalidate();
                    transitionParams.g0 = true;
                    if (q1Var.getMessageObject().i4()) {
                        transitionParams.n0 = f12;
                        transitionParams.o0 = f13;
                        transitionParams.p0 = f14;
                        transitionParams.q0 = f20;
                        transitionParams.B0 = iArr;
                    } else {
                        transitionParams.n0 = photoImage.K0;
                        transitionParams.o0 = photoImage.L0;
                        transitionParams.p0 = photoImage.M0;
                        transitionParams.q0 = photoImage.N0;
                        transitionParams.B0 = photoImage.W0;
                    }
                    transitionParams.C0 = false;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= 4) {
                            break;
                        }
                        if (iArr2[i21] != transitionParams.B0[i21]) {
                            transitionParams.C0 = true;
                            break;
                        }
                        i21++;
                    }
                    float f21 = transitionParams.n0;
                    float f22 = jVar.c;
                    if (f21 == f22 && transitionParams.o0 == jVar.d && transitionParams.q0 == jVar.f && transitionParams.p0 == jVar.e && !transitionParams.C0) {
                        transitionParams.g0 = false;
                        kVar.n = false;
                    } else {
                        kVar.o = f22;
                        kVar.p = jVar.d;
                        kVar.q = jVar.e;
                        kVar.r = jVar.f;
                        if (currentMessagesGroup != null) {
                            boolean z12 = currentMessagesGroup.c;
                            cj cjVar = currentMessagesGroup.m;
                            boolean z13 = cjVar.o;
                            if (z12 != z13) {
                                cjVar.n = z13 ? 1.0f : f10;
                            }
                        }
                        if (transitionParams.C0) {
                            if (transitionParams.B0 == photoImage.W0) {
                                transitionParams.B0 = new int[4];
                                for (int i22 = 0; i22 < 4; i22++) {
                                    transitionParams.B0[i22] = photoImage.W0[i22];
                                }
                            }
                            photoImage.L0(iArr2);
                        }
                        q1Var.u3(kVar.o, kVar.p, kVar.q, kVar.r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.w0 && (((Q3 = q1Var.getMessageObject().Q3()) && rect.left != q1Var.getBackgroundDrawableLeft()) || ((!Q3 && rect.right != q1Var.getBackgroundDrawableRight()) || rect.top != q1Var.getBackgroundDrawableTop() || rect.bottom != q1Var.getBackgroundDrawableBottom()))) {
                    kVar.v = q1Var.getBackgroundDrawableBottom() - rect.bottom;
                    kVar.u = q1Var.getBackgroundDrawableTop() - rect.top;
                    if (q1Var.X6 != transitionParams.F0) {
                        kVar.s = q1Var.getBackgroundDrawableLeft() - rect.left;
                        kVar.t = q1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (Q3) {
                        kVar.s = q1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        kVar.t = q1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    kVar.l = true;
                    transitionParams.x0 = true;
                    transitionParams.h0 = -kVar.s;
                    transitionParams.i0 = -kVar.t;
                    transitionParams.k0 = -kVar.u;
                    transitionParams.j0 = -kVar.v;
                    pj0Var.setClipChildren(false);
                    pj0Var.invalidate();
                }
            } else {
                view = view2;
                i14 = i19;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    pj0 pj0Var2 = (pj0) view.getParent();
                    cj cjVar2 = currentMessagesGroup.m;
                    boolean z14 = true;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    while (i23 < pj0Var2.getChildCount()) {
                        View childAt = pj0Var2.getChildAt(i23);
                        if (childAt instanceof q1) {
                            q1 q1Var3 = (q1) childAt;
                            if (q1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !q1Var3.getMessageObject().Z) {
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                djVar = currentMessagesGroup;
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                i15 = i23;
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if (i26 == 0 || backgroundDrawableLeft < i26) {
                                    i26 = backgroundDrawableLeft;
                                }
                                if (i27 == 0 || backgroundDrawableRight > i27) {
                                    i27 = backgroundDrawableRight;
                                }
                                if (q1Var3.getTransitionParams().w0 || cjVar2.p) {
                                    if (i24 == 0 || backgroundDrawableTop < i24) {
                                        i24 = backgroundDrawableTop;
                                    }
                                    if (i25 == 0 || backgroundDrawableBottom > i25) {
                                        i25 = backgroundDrawableBottom;
                                    }
                                    z14 = false;
                                }
                                i23 = i15 + 1;
                                currentMessagesGroup = djVar;
                            }
                        }
                        djVar = currentMessagesGroup;
                        i15 = i23;
                        i23 = i15 + 1;
                        currentMessagesGroup = djVar;
                    }
                    cjVar2.p = false;
                    if (i24 == 0 && i25 == 0 && i26 == 0 && i27 == 0) {
                        kVar.j = false;
                        cjVar2.j = false;
                    } else {
                        int i28 = (-i24) + cjVar2.b;
                        kVar.f = i28;
                        int i29 = (-i25) + cjVar2.d;
                        kVar.g = i29;
                        int i30 = (-i26) + cjVar2.a;
                        kVar.h = i30;
                        int i31 = (-i27) + cjVar2.c;
                        kVar.i = i31;
                        kVar.j = true;
                        cjVar2.j = true;
                        cjVar2.f = i28;
                        cjVar2.h = i29;
                        cjVar2.e = i30;
                        cjVar2.g = i31;
                        cjVar2.n = cjVar2.o ? 1.0f : f10;
                        pj0Var2.setClipChildren(false);
                        pj0Var2.invalidate();
                    }
                    cjVar2.i = z14;
                }
            }
            Integer valueOf = Integer.valueOf(q1Var.getMessageObject().f1());
            HashMap hashMap = this.H;
            dj djVar2 = (dj) hashMap.get(valueOf);
            if (djVar2 != null) {
                cj cjVar3 = djVar2.m;
                hashMap.remove(Integer.valueOf(q1Var.getMessageObject().f1()));
                if (transitionParams.w0) {
                    int backgroundDrawableLeft2 = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                    int backgroundDrawableRight2 = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                    int backgroundDrawableTop2 = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                    int backgroundDrawableBottom2 = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                    kVar.w = true;
                    transitionParams.x0 = true;
                    kVar.s = backgroundDrawableLeft2 - cjVar3.a;
                    kVar.t = backgroundDrawableRight2 - cjVar3.c;
                    kVar.u = backgroundDrawableTop2 - cjVar3.b;
                    kVar.v = backgroundDrawableBottom2 - cjVar3.d;
                    kVar.l = false;
                    transitionParams.h0 = (int) ((-r6) - q1Var.getAnimationOffsetX());
                    transitionParams.i0 = (int) ((-kVar.t) - q1Var.getAnimationOffsetX());
                    transitionParams.k0 = (int) ((-kVar.u) - q1Var.getTranslationY());
                    transitionParams.j0 = (int) ((-kVar.v) - q1Var.getTranslationY());
                    transitionParams.D0 = true;
                    pj0Var.setClipChildren(false);
                    pj0Var.invalidate();
                } else {
                    cjVar3.i = true;
                }
            }
            aj ajVar = q1Var.L;
            if (transitionParams.z0 != (q1Var.B6 || q1Var.J || (ajVar != null && (ajVar.l & 8) == 0 && q1Var.K.i))) {
                z9 = true;
                kVar.k = true;
                f15 = f10;
                transitionParams.A0 = f15;
            } else {
                f15 = f10;
                z9 = true;
            }
            boolean a10 = transitionParams.a();
            kVar.m = a10;
            if (a10) {
                transitionParams.h = z9;
                transitionParams.L1 = f15;
            }
            if (i14 == 0 && i20 == 0 && !kVar.n && !kVar.w && !kVar.j && !kVar.k && !kVar.l && !a10) {
                v(d1Var);
                return false;
            }
        } else if (t0Var2 != null) {
            s0 transitionParams2 = t0Var2.getTransitionParams();
            transitionParams2.getClass();
            if (i19 != 0) {
                view2.setTranslationX(-i19);
            }
            boolean a11 = !transitionParams2.a ? false : transitionParams2.d.E0.a();
            kVar.m = a11;
            if (a11) {
                transitionParams2.b = true;
                transitionParams2.c = 0.0f;
            }
            if (i19 == 0 && i20 == 0 && !a11) {
                v(d1Var);
                return false;
            }
        } else if (view2 instanceof f0) {
            ((f0) view2).setAnimating(true);
        } else if (view2 instanceof ra) {
            ((ra) view2).setAnimating(true);
        } else {
            if (i19 == 0 && i20 == 0) {
                v(d1Var);
                return false;
            }
            if (i19 != 0) {
                view2.setTranslationX(-i19);
            }
        }
        this.r.add(kVar);
        F();
        return true;
    }

    @Override // v4.k, v4.f1
    public final void s(d1 d1Var, r0 r0Var) {
        if (r2.a) {
            a8.b("animate remove");
        }
        super.s(d1Var, r0Var);
        View view = d1Var.a;
        if (r0Var != null) {
            int i7 = r0Var.b;
            int top = view.getTop();
            int left = view.getLeft() - r0Var.a;
            if (top - i7 != 0) {
                view.setTranslationY(-r1);
            }
            if (!(view instanceof q1)) {
                if (left != 0) {
                    view.setTranslationX(-left);
                    return;
                }
                return;
            }
            q1 q1Var = (q1) view;
            if (left != 0) {
                q1Var.setAnimationOffsetX(-left);
            }
            if (r0Var instanceof j) {
                j jVar = (j) r0Var;
                q1Var.u3(jVar.c, jVar.d, jVar.e, jVar.f);
            }
        }
    }
}
