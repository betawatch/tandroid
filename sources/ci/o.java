package ci;

import a3.l0;
import ag.p2;
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
import c3.i0;
import j9.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bj;
import org.telegram.messenger.dj;
import org.telegram.messenger.ej;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.v2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.g1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.r0;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.cf;
import org.telegram.ui.d71;
import org.telegram.ui.fe1;
import org.telegram.ui.mk;
import org.telegram.ui.un;
import r0.h0;
import s4.c1;
import s4.z0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public abstract class o extends s4.j {
    public static final gr V = new gr(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final un F;
    public final tk0 G;
    public boolean N;
    public c1 O;
    public xn P;
    public boolean Q;
    public final p6 R;
    public cf T;
    public cf U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public o(un unVar, tk0 tk0Var, p6 p6Var) {
        this.R = p6Var;
        this.F = unVar;
        this.G = tk0Var;
        this.o = V;
        this.n = true;
        this.m = false;
    }

    @Override // s4.j
    public final void B(s4.h hVar) {
        s4.h hVar2;
        c1 c1Var = hVar.a;
        View view = c1Var == null ? null : c1Var.a;
        c1 c1Var2 = hVar.b;
        View view2 = c1Var2 != null ? c1Var2.a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(hVar.a);
            duration.translationX(hVar.e - hVar.c);
            duration.translationY(hVar.f - hVar.d);
            hVar2 = hVar;
            duration.alpha(0.0f).setListener(new l(this, hVar2, duration, view, 0)).start();
        } else {
            hVar2 = hVar;
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(hVar2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new l(this, hVar2, animate, view2, 1)).start();
        }
    }

    @Override // s4.j
    public final void C(c1 c1Var, s4.i iVar) {
        T(c1Var, iVar, false);
    }

    @Override // s4.j
    public final boolean J(s4.h hVar, c1 c1Var) {
        h01 h01Var;
        if (v2.a) {
            f8.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(c1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = c1Var.a;
        if (this.K.contains(view) && (h01Var = (h01) this.U.run()) != null) {
            h01Var.a(view);
        }
        if (hVar.b == c1Var) {
            hVar.b = null;
        } else {
            if (hVar.a != c1Var) {
                return false;
            }
            hVar.a = null;
        }
        X(view);
        d(c1Var);
        return true;
    }

    @Override // s4.j
    public final long L() {
        return 0L;
    }

    @Override // s4.j
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
    /* JADX WARN: Removed duplicated region for block: B:11:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(final c1 c1Var, s4.i iVar, boolean z10) {
        c1 c1Var2;
        int i10;
        x1 x1Var;
        q1 q1Var;
        boolean z11;
        float f7;
        boolean z12;
        final n nVar;
        final q1 q1Var2;
        x1 x1Var2;
        final int i11;
        final x1 x1Var3;
        ValueAnimator valueAnimator;
        final boolean z13;
        int[] iArr;
        int i12 = iVar.c;
        int i13 = iVar.e;
        View view = c1Var.a;
        int i14 = i13 - i12;
        AnimatorSet animatorSet = new AnimatorSet();
        int i15 = 0;
        final int i16 = 1;
        if (i14 != 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.z.add(c1Var);
        final n nVar2 = (n) iVar;
        un unVar = this.F;
        if (unVar != null && (view instanceof f0)) {
            f0 f0Var = (f0) view;
            float translationY = f0Var.getTranslationY();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new j(this, f0Var, translationY, i15));
            animatorSet.playTogether(ofFloat);
        } else {
            if (unVar == null || !(view instanceof ra)) {
                if (view instanceof q1) {
                    final q1 q1Var3 = (q1) view;
                    final x1 transitionParams = q1Var3.getTransitionParams();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(q1Var3, q1Var3.Vc, 0.0f));
                    if (nVar2.n) {
                        q1Var3.q3(nVar2.o, nVar2.p, nVar2.q, nVar2.r);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        final float f10 = q1Var3.getCurrentMessagesGroup() == null ? transitionParams.v0 : q1Var3.getCurrentMessagesGroup().m.n;
                        final float a2 = q1Var3.getCurrentMessagesGroup() == null ? q1Var3.a2() : q1Var3.getCurrentMessagesGroup().c;
                        if (f10 != a2) {
                            valueAnimator = ofFloat2;
                            z13 = true;
                        } else {
                            valueAnimator = ofFloat2;
                            z13 = false;
                        }
                        if (transitionParams.C0) {
                            z11 = false;
                            iArr = new int[4];
                            int i17 = 0;
                            for (int i18 = 4; i17 < i18; i18 = 4) {
                                iArr[i17] = q1Var3.getPhotoImage().W0[i17];
                                i17++;
                            }
                        } else {
                            z11 = false;
                            iArr = null;
                        }
                        final int[] iArr2 = iArr;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        i10 = 2;
                        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: ci.a
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                n nVar3 = n.this;
                                float f11 = 1.0f - floatValue;
                                float f12 = nVar3.o * f11;
                                x1 x1Var4 = transitionParams;
                                float f13 = (x1Var4.n0 * floatValue) + f12;
                                float f14 = (x1Var4.o0 * floatValue) + (nVar3.p * f11);
                                float f15 = (x1Var4.p0 * floatValue) + (nVar3.q * f11);
                                float f16 = (x1Var4.q0 * floatValue) + (nVar3.r * f11);
                                boolean z14 = z13;
                                q1 q1Var4 = q1Var3;
                                if (z14) {
                                    float f17 = (a2 * floatValue) + (f10 * f11);
                                    x1Var4.v0 = f17;
                                    if (q1Var4.getCurrentMessagesGroup() != null) {
                                        q1Var4.getCurrentMessagesGroup().m.n = f17;
                                    }
                                }
                                if (x1Var4.C0) {
                                    ImageReceiver photoImage = q1Var4.getPhotoImage();
                                    int[] iArr3 = iArr2;
                                    int[] iArr4 = x1Var4.B0;
                                    photoImage.K0((int) ((iArr4[0] * floatValue) + (iArr3[0] * f11)), (int) ((iArr4[1] * floatValue) + (iArr3[1] * f11)), (int) ((iArr4[2] * floatValue) + (iArr3[2] * f11)), (int) ((iArr4[3] * floatValue) + (iArr3[3] * f11)));
                                }
                                q1Var4.q3(f13, f14, f15, f16);
                                c1Var.a.invalidate();
                            }
                        };
                        x1Var = transitionParams;
                        q1Var = q1Var3;
                        c1Var2 = c1Var;
                        valueAnimator2.addUpdateListener(animatorUpdateListener);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[z11 ? 1 : 0] = valueAnimator2;
                        animatorSet.playTogether(animatorArr);
                    } else {
                        i10 = 2;
                        x1Var = transitionParams;
                        q1Var = q1Var3;
                        c1Var2 = c1Var;
                        z11 = false;
                    }
                    if (nVar2.v == 0 && nVar2.t == 0 && nVar2.u == 0 && nVar2.s == 0) {
                        f7 = 0.0f;
                        x1Var.l0 = 0.0f;
                        x1Var.m0 = 0.0f;
                        z12 = z11;
                    } else {
                        f7 = 0.0f;
                        tk0 tk0Var = this.G;
                        tk0Var.setClipChildren(z11);
                        tk0Var.invalidate();
                        float[] fArr = new float[i10];
                        // fill-array-data instruction
                        fArr[0] = 1.0f;
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr);
                        if (nVar2.l) {
                            x1Var.l0 = -nVar2.s;
                            x1Var.m0 = -nVar2.t;
                        } else {
                            x1Var.l0 = (-nVar2.s) - q1Var.getAnimationOffsetX();
                            x1Var.m0 = (-nVar2.t) - q1Var.getAnimationOffsetX();
                        }
                        z12 = false;
                        ofFloat3.addUpdateListener(new b(nVar2, x1Var, q1Var, false ? 1 : 0));
                        animatorSet.playTogether(ofFloat3);
                    }
                    ej currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        nVar2.j = z12;
                    }
                    if (nVar2.j) {
                        float[] fArr2 = new float[i10];
                        // fill-array-data instruction
                        fArr2[0] = 1.0f;
                        fArr2[1] = 0.0f;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr2);
                        x1 x1Var4 = x1Var;
                        final dj djVar = currentMessagesGroup.m;
                        final tk0 tk0Var2 = (tk0) view.getParent();
                        final float f11 = currentMessagesGroup.m.n;
                        if (currentMessagesGroup.c) {
                            f7 = 1.0f;
                        }
                        final boolean z14 = f11 != f7;
                        x1Var2 = x1Var4;
                        final float f12 = f7;
                        nVar = nVar2;
                        q1Var2 = q1Var;
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ci.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                n nVar3 = nVar;
                                dj djVar2 = dj.this;
                                djVar2.f = nVar3.f * floatValue;
                                djVar2.h = nVar3.g * floatValue;
                                djVar2.e = nVar3.h * floatValue;
                                djVar2.g = nVar3.i * floatValue;
                                if (z14) {
                                    djVar2.n = i0.z(1.0f, floatValue, f12, f11 * floatValue);
                                }
                                tk0 tk0Var3 = tk0Var2;
                                if (tk0Var3 != null) {
                                    tk0Var3.invalidate();
                                }
                            }
                        });
                        ofFloat4.addListener(new bg.e(djVar, 1));
                        i11 = 0;
                        animatorSet.playTogether(ofFloat4);
                    } else {
                        nVar = nVar2;
                        q1Var2 = q1Var;
                        x1Var2 = x1Var;
                        i11 = 0;
                    }
                    if (nVar.k) {
                        float[] fArr3 = new float[i10];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(fArr3);
                        x1Var3 = x1Var2;
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ci.d
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i11) {
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
                        animatorArr2[i11] = ofFloat5;
                        animatorSet.playTogether(animatorArr2);
                    } else {
                        x1Var3 = x1Var2;
                    }
                    if (nVar.m) {
                        float[] fArr4 = new float[i10];
                        // fill-array-data instruction
                        fArr4[0] = 0.0f;
                        fArr4[1] = 1.0f;
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(fArr4);
                        x1Var3.h = true;
                        ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ci.d
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i16) {
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
                    c1Var2 = c1Var;
                    if (view instanceof s0) {
                        s0 s0Var = (s0) view;
                        r0 transitionParams2 = s0Var.getTransitionParams();
                        if (nVar2.m) {
                            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            transitionParams2.b = true;
                            ofFloat7.addUpdateListener(new p2(5, transitionParams2, s0Var));
                            animatorSet.playTogether(ofFloat7);
                        }
                    }
                }
                if (z10) {
                    Interpolator interpolator = this.o;
                    if (interpolator != null) {
                        animatorSet.setInterpolator(interpolator);
                    }
                } else {
                    animatorSet.setInterpolator(gr.g);
                }
                animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
                animatorSet.addListener(new k(this, c1Var2, i14, view));
                animatorSet.start();
                this.J.put(c1Var2, animatorSet);
            }
            ra raVar = (ra) view;
            float translationY2 = raVar.getTranslationY();
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat8.addUpdateListener(new j(this, raVar, translationY2, i16));
            animatorSet.playTogether(ofFloat8);
        }
        c1Var2 = c1Var;
        if (z10) {
        }
        animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
        animatorSet.addListener(new k(this, c1Var2, i14, view));
        animatorSet.start();
        this.J.put(c1Var2, animatorSet);
    }

    public final void U() {
        h01 h01Var;
        HashMap hashMap = this.J;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (this.K.isEmpty() || (h01Var = (h01) this.U.run()) == null) {
            return;
        }
        ArrayList arrayList2 = h01Var.c;
        if (h01Var.e) {
            return;
        }
        h01Var.e = true;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            g01 g01Var = (g01) obj2;
            Runnable runnable = g01Var.d;
            if (runnable != null) {
                h01.b(runnable);
                g01Var.d = null;
            }
        }
        arrayList2.clear();
        f01 f01Var = h01Var.a;
        if (f01Var != null) {
            f01Var.h();
        }
        Runnable runnable2 = h01Var.d;
        if (runnable2 != null) {
            h01Var.d = null;
            h01.b(runnable2);
        }
    }

    public final void V(ej ejVar) {
        if (ejVar == null) {
            return;
        }
        ArrayList arrayList = ejVar.d;
        dj djVar = ejVar.m;
        if (arrayList.size() == 0) {
            djVar.i = true;
            return;
        }
        if (djVar.b == 0 && djVar.d == 0 && djVar.a == 0 && djVar.c == 0) {
            tk0 tk0Var = this.G;
            int childCount = tk0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = tk0Var.getChildAt(i10);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    jj messageObject = q1Var.getMessageObject();
                    if (q1Var.getTransitionParams().w0 && arrayList.contains(messageObject)) {
                        djVar.b = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                        djVar.d = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                        djVar.a = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                        djVar.c = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                        djVar.o = q1Var.a2();
                        djVar.k = q1Var.F2();
                        djVar.l = q1Var.E2();
                        djVar.p = true;
                        break;
                    }
                }
                i10++;
            }
        }
        this.I.add(ejVar);
    }

    public abstract void W();

    public final void X(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z10 = view instanceof f0;
        tk0 tk0Var = this.G;
        if (z10) {
            int measuredHeight = (tk0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
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
            int measuredHeight2 = (tk0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
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
            if (!(view instanceof s0)) {
                view.setTranslationX(0.0f);
                return;
            }
            r0 transitionParams = ((s0) view).getTransitionParams();
            transitionParams.b = false;
            transitionParams.c = 1.0f;
        }
    }

    public final void Y(cf cfVar, cf cfVar2) {
        this.T = cfVar;
        this.U = cfVar2;
    }

    public final boolean Z(View view) {
        c1 T;
        if (this.N || (T = this.G.T(view)) == null) {
            return false;
        }
        return this.q.contains(T) || this.y.contains(T);
    }

    @Override // s4.f1, s4.l0
    public final boolean a(c1 c1Var, ac.g gVar, ac.g gVar2) {
        ArrayList arrayList;
        int i10;
        boolean a2 = super.a(c1Var, gVar, gVar2);
        if (a2 && this.N) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.q;
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (((c1) arrayList.get(i11)).c() == 0) {
                    z10 = true;
                }
                i11++;
            }
            if (z10) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    i10 += ((c1) arrayList.get(i12)).a.getHeight();
                }
            } else {
                i10 = 0;
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((c1) arrayList.get(i13)).a.setTranslationY(i10);
            }
        }
        return a2;
    }

    public final boolean a0(View view) {
        c1 T = this.G.T(view);
        if (T != null) {
            return this.p.contains(T) || this.A.contains(T);
        }
        return false;
    }

    @Override // s4.j, s4.l0
    public final void f(c1 c1Var) {
        h01 h01Var;
        Animator animator = (Animator) this.J.remove(c1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = c1Var.a;
        if (this.K.contains(view) && (h01Var = (h01) this.U.run()) != null) {
            h01Var.a(view);
        }
        super.f(c1Var);
        X(view);
    }

    @Override // s4.j, s4.l0
    public void g() {
        if (v2.a) {
            f8.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ej) obj).m.p = false;
        }
        arrayList.clear();
        U();
        xn xnVar = this.P;
        if (xnVar != null) {
            xnVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.i iVar = (s4.i) arrayList2.get(size2);
            X(iVar.a.a);
            v(iVar.a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            c1 c1Var = (c1) arrayList3.get(size3);
            X(c1Var.a);
            d(c1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            c1 c1Var2 = (c1) arrayList4.get(size4);
            X(c1Var2.a);
            u(c1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((s4.h) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (k()) {
            ArrayList arrayList6 = this.u;
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
                for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                    s4.i iVar2 = (s4.i) arrayList7.get(size7);
                    X(iVar2.a.a);
                    v(iVar2.a);
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
                    c1 c1Var3 = (c1) arrayList9.get(size9);
                    X(c1Var3.a);
                    u(c1Var3);
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
                    I((s4.h) arrayList11.get(size11));
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

    @Override // s4.l0
    public final long i() {
        return 250L;
    }

    @Override // s4.l0
    public final long j() {
        return 250L;
    }

    @Override // s4.l0
    public final ac.g l(z0 z0Var, c1 c1Var, int i10, List list) {
        ac.g l4 = super.l(z0Var, c1Var, i10, list);
        View view = c1Var.a;
        if (!(view instanceof q1)) {
            return l4;
        }
        m mVar = new m();
        mVar.a = l4.a;
        mVar.b = l4.b;
        x1 transitionParams = ((q1) view).getTransitionParams();
        mVar.c = transitionParams.b;
        mVar.d = transitionParams.c;
        mVar.e = transitionParams.d;
        mVar.f = transitionParams.e;
        return mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0485 A[EDGE_INSN: B:225:0x0485->B:226:0x0485 BREAK  A[LOOP:9: B:194:0x03cb->B:218:0x047b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0201  */
    @Override // s4.j, s4.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int size;
        int i10;
        HashMap hashMap;
        float f7;
        int i11;
        boolean z15;
        ArrayList arrayList2;
        int i12;
        int i13;
        boolean z16;
        ArrayList arrayList3;
        ArrayList arrayList4;
        cf cfVar;
        int i14;
        ej currentMessagesGroup;
        boolean z17;
        boolean z18;
        ArrayList arrayList5;
        boolean z19;
        jj messageObject;
        cf cfVar2;
        int i15;
        int i16;
        boolean z20;
        un unVar;
        Runnable runnable;
        pe peVar;
        int i17;
        o oVar = this;
        ArrayList arrayList6 = oVar.p;
        boolean isEmpty = arrayList6.isEmpty();
        ArrayList arrayList7 = oVar.r;
        boolean isEmpty2 = arrayList7.isEmpty();
        ArrayList arrayList8 = oVar.s;
        boolean isEmpty3 = arrayList8.isEmpty();
        ArrayList arrayList9 = oVar.q;
        boolean isEmpty4 = arrayList9.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        boolean z21 = oVar.N;
        tk0 tk0Var = oVar.G;
        if (z21) {
            z10 = false;
            for (0; i17 < arrayList9.size(); i17 + 1) {
                if (oVar.Q) {
                    i17 = ((c1) arrayList9.get(i17)).c() != (tk0Var.getAdapter() == null ? 0 : tk0Var.getAdapter().b()) - 1 ? i17 + 1 : 0;
                    z10 = true;
                } else {
                    if (((c1) arrayList9.get(i17)).c() != 0) {
                    }
                    z10 = true;
                }
            }
        } else {
            z10 = false;
        }
        oVar.W();
        ArrayList arrayList10 = oVar.y;
        float f10 = 1.0f;
        if (z10) {
            boolean isEmpty5 = arrayList6.isEmpty();
            boolean isEmpty6 = arrayList7.isEmpty();
            boolean isEmpty7 = arrayList8.isEmpty();
            boolean isEmpty8 = arrayList9.isEmpty();
            if (!isEmpty5 || !isEmpty6 || !isEmpty8 || !isEmpty7) {
                int i18 = 0;
                for (0; i15 < arrayList9.size(); i15 + 1) {
                    View view = ((c1) arrayList9.get(i15)).a;
                    if (view instanceof q1) {
                        q1 q1Var = (q1) view;
                        i15 = (q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0) ? i15 + 1 : 0;
                    }
                    i18 += ((c1) arrayList9.get(i15)).a.getHeight();
                }
                int size2 = arrayList6.size();
                int i19 = 0;
                while (i19 < size2) {
                    Object obj = arrayList6.get(i19);
                    i19++;
                    oVar.D((c1) obj);
                }
                arrayList6.clear();
                if (!isEmpty6) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.addAll(arrayList7);
                    arrayList7.clear();
                    int size3 = arrayList11.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        Object obj2 = arrayList11.get(i20);
                        i20++;
                        s4.i iVar = (s4.i) obj2;
                        oVar.T(iVar.a, iVar, false);
                    }
                    arrayList11.clear();
                }
                if (!isEmpty8) {
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.addAll(arrayList9);
                    arrayList9.clear();
                    int i21 = 0;
                    for (int size4 = arrayList12.size(); i21 < size4; size4 = i16) {
                        int i22 = i21 + 1;
                        c1 c1Var = (c1) arrayList12.get(i21);
                        View view2 = c1Var.a;
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList10.add(c1Var);
                        view2.setTranslationY(i18);
                        View view3 = c1Var.a;
                        view3.setScaleX(f10);
                        view3.setScaleY(f10);
                        q1 q1Var2 = view3 instanceof q1 ? (q1) view3 : null;
                        if (q1Var2 == null || !q1Var2.getTransitionParams().y0) {
                            view3.setAlpha(f10);
                        }
                        un unVar2 = oVar.F;
                        if (unVar2 != null) {
                            ArrayList arrayList13 = unVar2.I4;
                            if (q1Var2 != null && arrayList13.contains(q1Var2.getMessageObject())) {
                                arrayList13.remove(q1Var2.getMessageObject());
                                mk mkVar = unVar2.Z;
                                if (mkVar.f0 == null || !((peVar = mkVar.L0) == null || peVar.p0)) {
                                    i16 = size4;
                                } else {
                                    i16 = size4;
                                    if (System.currentTimeMillis() - mkVar.M0 > 300) {
                                        z20 = true;
                                        mkVar.M0 = -1L;
                                        if (z20) {
                                            if (jj.R4(q1Var2.getMessageObject().k)) {
                                                if (Math.abs(view2.getTranslationY()) < view2.getMeasuredHeight() * 3.0f) {
                                                    new fe1(q1Var2, unVar2.Z, oVar.G, unVar2.fa, oVar.R).f.start();
                                                }
                                            } else if (tz.o() != 0 && Math.abs(view2.getTranslationY()) < tk0Var.getMeasuredHeight()) {
                                                unVar = unVar2;
                                                ValueAnimator valueAnimator = new d71(q1Var2, unVar2, oVar.G, unVar2.fa, oVar.R).d;
                                                if (valueAnimator != null) {
                                                    valueAnimator.start();
                                                }
                                                mk mkVar2 = unVar.Z;
                                                runnable = mkVar2.f0;
                                                if (runnable != null) {
                                                    org.telegram.messenger.i0.r(runnable);
                                                    mkVar2.g0 = true;
                                                    mkVar2.f0.run();
                                                    mkVar2.f0 = null;
                                                    animate.translationY(0.0f).setDuration(250L).setInterpolator(oVar.o).setListener(new i((Object) oVar, (Object) c1Var, view2, (Object) animate, 0)).start();
                                                    i18 = i18;
                                                    i21 = i22;
                                                    f10 = 1.0f;
                                                }
                                            }
                                            unVar = unVar2;
                                            mk mkVar22 = unVar.Z;
                                            runnable = mkVar22.f0;
                                            if (runnable != null) {
                                            }
                                        }
                                        animate.translationY(0.0f).setDuration(250L).setInterpolator(oVar.o).setListener(new i((Object) oVar, (Object) c1Var, view2, (Object) animate, 0)).start();
                                        i18 = i18;
                                        i21 = i22;
                                        f10 = 1.0f;
                                    }
                                }
                                z20 = false;
                                mkVar.M0 = -1L;
                                if (z20) {
                                }
                                animate.translationY(0.0f).setDuration(250L).setInterpolator(oVar.o).setListener(new i((Object) oVar, (Object) c1Var, view2, (Object) animate, 0)).start();
                                i18 = i18;
                                i21 = i22;
                                f10 = 1.0f;
                            }
                        }
                        i16 = size4;
                        animate.translationY(0.0f).setDuration(250L).setInterpolator(oVar.o).setListener(new i((Object) oVar, (Object) c1Var, view2, (Object) animate, 0)).start();
                        i18 = i18;
                        i21 = i22;
                        f10 = 1.0f;
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
                boolean z22 = (oVar.U == null || (cfVar2 = oVar.T) == null || !((Boolean) cfVar2.run()).booleanValue()) ? false : true;
                ArrayList arrayList14 = oVar.K;
                ArrayList arrayList15 = oVar.A;
                int i23 = 1;
                ArrayList arrayList16 = oVar.S;
                if (z22) {
                    LongSparseArray longSparseArray = null;
                    int i24 = 0;
                    while (i24 < arrayList6.size()) {
                        c1 c1Var2 = (c1) arrayList6.get(i24);
                        if (arrayList16.contains(c1Var2)) {
                            z17 = isEmpty10;
                            View view4 = c1Var2.a;
                            z18 = isEmpty11;
                            if ((view4 instanceof q1) && ((q1) view4).getCurrentMessagesGroup() != null && (messageObject = ((q1) c1Var2.a).getMessageObject()) != null && messageObject.d1() != 0) {
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                arrayList5 = arrayList10;
                                z19 = z22;
                                ArrayList arrayList17 = (ArrayList) longSparseArray.get(messageObject.d1());
                                if (arrayList17 == null) {
                                    long d12 = messageObject.d1();
                                    ArrayList arrayList18 = new ArrayList();
                                    longSparseArray.put(d12, arrayList18);
                                    arrayList17 = arrayList18;
                                }
                                arrayList16.remove(c1Var2);
                                arrayList6.remove(i24);
                                i24--;
                                arrayList17.add(c1Var2);
                                i24++;
                                z22 = z19;
                                isEmpty10 = z17;
                                isEmpty11 = z18;
                                arrayList10 = arrayList5;
                            }
                        } else {
                            z17 = isEmpty10;
                            z18 = isEmpty11;
                        }
                        arrayList5 = arrayList10;
                        z19 = z22;
                        i24++;
                        z22 = z19;
                        isEmpty10 = z17;
                        isEmpty11 = z18;
                        arrayList10 = arrayList5;
                    }
                    z11 = isEmpty10;
                    z12 = isEmpty11;
                    arrayList = arrayList10;
                    z13 = z22;
                    if (longSparseArray != null) {
                        int i25 = 0;
                        z14 = false;
                        while (i25 < longSparseArray.size()) {
                            ArrayList arrayList19 = (ArrayList) longSparseArray.valueAt(i25);
                            if (arrayList19.size() > 0) {
                                View view5 = ((c1) arrayList19.get(0)).a;
                                if (!(view5 instanceof q1) || (currentMessagesGroup = ((q1) view5).getCurrentMessagesGroup()) == null || currentMessagesGroup.d.size() <= arrayList19.size()) {
                                    if (v2.a) {
                                        f8.b("animate remove group impl with thanos");
                                    }
                                    arrayList15.addAll(arrayList19);
                                    h01 h01Var = (h01) oVar.U.run();
                                    for (int i26 = 0; i26 < arrayList19.size(); i26++) {
                                    }
                                    ArrayList arrayList20 = new ArrayList();
                                    i14 = i25;
                                    for (int i27 = 0; i27 < arrayList19.size(); i27++) {
                                        arrayList20.add(((c1) arrayList19.get(i27)).a);
                                    }
                                    l0 l0Var = new l0(oVar, arrayList20, arrayList19, 16);
                                    f01 f01Var = h01Var.a;
                                    if (f01Var != null) {
                                        f01Var.d(arrayList20, l0Var);
                                        Choreographer.getInstance().postFrameCallback(h01Var.b);
                                    } else {
                                        h01Var.c.add(new g01(arrayList20, l0Var));
                                    }
                                    arrayList14.add((View) arrayList20.get(0));
                                    tk0Var.C0();
                                    z14 = true;
                                    i25 = i14 + 1;
                                } else {
                                    arrayList6.addAll(arrayList19);
                                }
                            }
                            i14 = i25;
                            i25 = i14 + 1;
                        }
                        size = arrayList6.size();
                        boolean z23 = z14;
                        i10 = 0;
                        while (true) {
                            hashMap = oVar.J;
                            if (i10 < size) {
                                break;
                            }
                            Object obj3 = arrayList6.get(i10);
                            int i28 = i10 + 1;
                            c1 c1Var3 = (c1) obj3;
                            boolean z24 = arrayList16.remove(c1Var3) && z13;
                            if (v2.a) {
                                arrayList2 = arrayList6;
                                i12 = size;
                                f8.b("animate remove impl ".concat(z24 ? " with thanos" : ""));
                            } else {
                                arrayList2 = arrayList6;
                                i12 = size;
                            }
                            View view6 = c1Var3.a;
                            arrayList15.add(c1Var3);
                            if (!z24 || (cfVar = oVar.U) == null) {
                                i13 = i28;
                                z16 = z13;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view6, (Property<View, Float>) View.ALPHA, view6.getAlpha(), 0.0f);
                                arrayList3 = arrayList15;
                                arrayList4 = arrayList16;
                                ofFloat.setDuration(oVar.d);
                                ofFloat.addListener(new g(oVar, view6, c1Var3));
                                hashMap.put(c1Var3, ofFloat);
                                ofFloat.start();
                            } else {
                                h01 h01Var2 = (h01) cfVar.run();
                                i13 = i28;
                                l0 l0Var2 = new l0(oVar, view6, c1Var3, 17);
                                f01 f01Var2 = h01Var2.a;
                                if (f01Var2 != null) {
                                    f01Var2.b(1.0f, view6, l0Var2);
                                    Choreographer.getInstance().postFrameCallback(h01Var2.b);
                                } else {
                                    h01Var2.c.add(new g01(view6, l0Var2));
                                }
                                arrayList14.add(view6);
                                z16 = z13;
                                arrayList3 = arrayList15;
                                arrayList4 = arrayList16;
                            }
                            tk0Var.C0();
                            arrayList15 = arrayList3;
                            arrayList16 = arrayList4;
                            if (z24) {
                                z23 = true;
                            }
                            size = i12;
                            arrayList6 = arrayList2;
                            i10 = i13;
                            z13 = z16;
                        }
                        arrayList6.clear();
                        if (!z11) {
                            ArrayList arrayList21 = new ArrayList();
                            arrayList21.addAll(arrayList7);
                            oVar.u.add(arrayList21);
                            arrayList7.clear();
                            h hVar = new h(oVar, arrayList21, z23, 0);
                            if (!oVar.C || isEmpty9) {
                                hVar.run();
                            } else {
                                View view7 = ((s4.i) arrayList21.get(0)).a.a;
                                WeakHashMap weakHashMap = h0.a;
                                view7.postOnAnimationDelayed(hVar, 0L);
                            }
                        }
                        if (!z12) {
                            ArrayList arrayList22 = new ArrayList();
                            arrayList22.addAll(arrayList8);
                            oVar.v.add(arrayList22);
                            arrayList8.clear();
                            u uVar = new u(oVar, arrayList22, false, 9);
                            if (!oVar.C || isEmpty9) {
                                uVar.run();
                            } else {
                                View view8 = ((s4.h) arrayList22.get(0)).a.a;
                                WeakHashMap weakHashMap2 = h0.a;
                                view8.postOnAnimationDelayed(uVar, 0L);
                            }
                        }
                        if (!isEmpty12) {
                            ArrayList arrayList23 = new ArrayList();
                            arrayList23.addAll(arrayList9);
                            arrayList9.clear();
                            Collections.sort(arrayList23, new a4.d(5));
                            int i29 = 0;
                            for (int size5 = arrayList23.size(); i29 < size5; size5 = i11) {
                                int i30 = i29 + 1;
                                c1 c1Var4 = (c1) arrayList23.get(i29);
                                if (v2.a) {
                                    f8.b("animate add impl");
                                }
                                View view9 = c1Var4.a;
                                ArrayList arrayList24 = arrayList;
                                arrayList24.add(c1Var4);
                                if (c1Var4 == oVar.O) {
                                    view9.setAlpha(1.0f);
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                if (view9 instanceof q1) {
                                    q1 q1Var3 = (q1) view9;
                                    if (q1Var3.getAnimationOffsetX() != 0.0f) {
                                        g1 g1Var = q1Var3.Vc;
                                        float[] fArr = new float[2];
                                        fArr[0] = q1Var3.getAnimationOffsetX();
                                        fArr[i23] = 0.0f;
                                        Animator[] animatorArr = new Animator[i23];
                                        animatorArr[0] = ObjectAnimator.ofFloat(q1Var3, g1Var, fArr);
                                        animatorSet.playTogether(animatorArr);
                                    }
                                    q1Var3.setPivotX(((q1Var3.getBackgroundDrawableRight() - q1Var3.getBackgroundDrawableLeft()) / 2.0f) + q1Var3.getBackgroundDrawableLeft());
                                    f7 = 0.0f;
                                    view9.animate().translationY(0.0f).setDuration(oVar.c).start();
                                } else {
                                    f7 = 0.0f;
                                    view9.animate().translationX(0.0f).translationY(0.0f).setDuration(oVar.c).start();
                                }
                                long max = (long) ((1.0f - Math.max(f7, Math.min(1.0f, view9.getBottom() / tk0Var.getMeasuredHeight()))) * 100.0f);
                                if (!(view9 instanceof q1)) {
                                    i11 = size5;
                                } else if (c1Var4 == oVar.O) {
                                    xn xnVar = oVar.P;
                                    if (xnVar != null) {
                                        xnVar.h.setAlpha(0.0f);
                                    }
                                    tk0Var.setClipChildren(false);
                                    final q1 q1Var4 = (q1) view9;
                                    View view10 = (View) oVar.P.getParent();
                                    float x10 = view10.getX() + oVar.P.getX() + oVar.P.h.getX();
                                    float y3 = view10.getY() + oVar.P.getY() + oVar.P.h.getY();
                                    float x11 = q1Var4.getX() + tk0Var.getX() + q1Var4.getPhotoImage().K0;
                                    float y10 = q1Var4.getY() + tk0Var.getY() + q1Var4.getPhotoImage().L0;
                                    final float width = oVar.P.h.getWidth();
                                    final float height = oVar.P.h.getHeight();
                                    final float f11 = q1Var4.getPhotoImage().M0;
                                    final float f12 = q1Var4.getPhotoImage().N0;
                                    final float f13 = x10 - x11;
                                    final float f14 = y3 - y10;
                                    final float f15 = q1Var4.getPhotoImage().K0;
                                    final float f16 = q1Var4.getPhotoImage().L0;
                                    q1Var4.getTransitionParams().g0 = true;
                                    q1Var4.getTransitionParams().K1 = true;
                                    q1Var4.getPhotoImage().y0(f15 + f13, f15 + f14, width, height);
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ci.e
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            q1 q1Var5 = q1.this;
                                            q1Var5.getTransitionParams().L1 = floatValue;
                                            if (q1Var5.getTransitionParams().L1 > 1.0f) {
                                                q1Var5.getTransitionParams().L1 = 1.0f;
                                            }
                                            float f17 = 1.0f - floatValue;
                                            q1Var5.getPhotoImage().y0((f13 * f17) + f15, (f14 * f17) + f16, (f11 * floatValue) + (width * f17), (f12 * floatValue) + (height * f17));
                                            q1Var5.invalidate();
                                        }
                                    });
                                    i11 = size5;
                                    oVar = this;
                                    ofFloat2.addListener(new f(oVar, q1Var4, f15, f16, f11, f12));
                                    animatorSet.play(ofFloat2);
                                    max = max;
                                    z15 = false;
                                    view9.setAlpha(0.0f);
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), 1.0f));
                                    if (z15) {
                                        view9.setScaleX(1.0f);
                                        view9.setScaleY(1.0f);
                                    } else {
                                        view9.setScaleX(0.9f);
                                        view9.setScaleY(0.9f);
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_Y, view9.getScaleY(), 1.0f));
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_X, view9.getScaleX(), 1.0f));
                                    }
                                    if (c1Var4 != oVar.O) {
                                        animatorSet.setDuration(350L);
                                        animatorSet.setInterpolator(new OvershootInterpolator());
                                    } else {
                                        animatorSet.setStartDelay(max);
                                        animatorSet.setDuration(250L);
                                    }
                                    animatorSet.addListener(new g(oVar, c1Var4, view9));
                                    hashMap.put(c1Var4, animatorSet);
                                    animatorSet.start();
                                    i23 = 1;
                                    i29 = i30;
                                    arrayList = arrayList24;
                                } else {
                                    i11 = size5;
                                    ej currentMessagesGroup2 = ((q1) view9).getCurrentMessagesGroup();
                                    if (currentMessagesGroup2 != null) {
                                        Long valueOf = Long.valueOf(currentMessagesGroup2.a);
                                        HashMap hashMap2 = oVar.M;
                                        Long l4 = (Long) hashMap2.get(valueOf);
                                        if (l4 == null) {
                                            hashMap2.put(Long.valueOf(currentMessagesGroup2.a), Long.valueOf(max));
                                        } else {
                                            max = l4.longValue();
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
                                z15 = true;
                                view9.setAlpha(0.0f);
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), 1.0f));
                                if (z15) {
                                }
                                if (c1Var4 != oVar.O) {
                                }
                                animatorSet.addListener(new g(oVar, c1Var4, view9));
                                hashMap.put(c1Var4, animatorSet);
                                animatorSet.start();
                                i23 = 1;
                                i29 = i30;
                                arrayList = arrayList24;
                            }
                            arrayList23.clear();
                        }
                    }
                } else {
                    z11 = isEmpty10;
                    z12 = isEmpty11;
                    arrayList = arrayList10;
                    z13 = z22;
                }
                z14 = false;
                size = arrayList6.size();
                boolean z232 = z14;
                i10 = 0;
                while (true) {
                    hashMap = oVar.J;
                    if (i10 < size) {
                    }
                    size = i12;
                    arrayList6 = arrayList2;
                    i10 = i13;
                    z13 = z16;
                }
                arrayList6.clear();
                if (!z11) {
                }
                if (!z12) {
                }
                if (!isEmpty12) {
                }
            }
        }
        int i31 = 2;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new bg.k(oVar, i31));
        ofFloat3.setDuration(oVar.d + 250);
        ofFloat3.start();
    }

    @Override // s4.j, s4.f1
    public final void p(c1 c1Var) {
        R(c1Var);
        View view = c1Var.a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof q1) {
            ((q1) view).getTransitionParams().i = true;
        }
        this.q.add(c1Var);
    }

    @Override // s4.j, s4.f1
    public final boolean q(c1 c1Var, c1 c1Var2, ac.g gVar, int i10, int i11, int i12, int i13) {
        if (c1Var == c1Var2) {
            return r(c1Var, gVar, i10, i11, i12, i13);
        }
        View view = c1Var.a;
        float animationOffsetX = view instanceof q1 ? ((q1) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(c1Var);
        int i14 = (int) ((i12 - i10) - animationOffsetX);
        int i15 = (int) ((i13 - i11) - translationY);
        if (view instanceof q1) {
            ((q1) view).setAnimationOffsetX(animationOffsetX);
        } else {
            view.setTranslationX(animationOffsetX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = c1Var2.a;
        R(c1Var2);
        if (view2 instanceof q1) {
            ((q1) view2).setAnimationOffsetX(-i14);
        } else {
            view2.setTranslationX(-i14);
        }
        view2.setTranslationY(-i15);
        view2.setAlpha(0.0f);
        this.s.add(new s4.h(c1Var, c1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override // s4.j, s4.f1
    public final boolean r(c1 c1Var, ac.g gVar, int i10, int i11, int i12, int i13) {
        int translationX;
        int i14;
        q1 q1Var;
        s0 s0Var;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        View view;
        int i15;
        float f14;
        boolean z10;
        ej ejVar;
        int i16;
        boolean P3;
        View view2 = c1Var.a;
        if (view2 instanceof q1) {
            q1 q1Var2 = (q1) view2;
            translationX = i10 + ((int) q1Var2.getAnimationOffsetX());
            i14 = q1Var2.getTransitionParams().t2 != q1Var2.getTopMediaOffset() ? (q1Var2.getTransitionParams().t2 - q1Var2.getTopMediaOffset()) + i11 : i11;
            q1Var = q1Var2;
            s0Var = null;
        } else if (view2 instanceof s0) {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            s0Var = (s0) view2;
            q1Var = null;
        } else {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            q1Var = null;
            s0Var = null;
        }
        int i17 = translationX;
        int translationY = i14 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (q1Var != null) {
            float f15 = q1Var.getPhotoImage().K0;
            float f16 = q1Var.getPhotoImage().L0;
            float f17 = q1Var.getPhotoImage().M0;
            float f18 = q1Var.getPhotoImage().N0;
            f7 = 0.0f;
            int i18 = 0;
            for (int i19 = 4; i18 < i19; i19 = 4) {
                iArr[i18] = q1Var.getPhotoImage().W0[i18];
                i18++;
            }
            f11 = f15;
            f12 = f16;
            f10 = f18;
            f13 = f17;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        R(c1Var);
        int i20 = i12 - i17;
        int i21 = i13 - translationY;
        if (i21 != 0) {
            view2.setTranslationY(-i21);
        }
        float f19 = f10;
        s0 s0Var2 = s0Var;
        n nVar = new n(c1Var, i17, translationY, i12, i13);
        if (q1Var != null) {
            x1 transitionParams = q1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.u0;
            Rect rect = transitionParams.E0;
            ej currentMessagesGroup = q1Var.getCurrentMessagesGroup();
            if (i20 != 0) {
                q1Var.setAnimationOffsetX(-i20);
            }
            boolean z11 = gVar instanceof m;
            tk0 tk0Var = this.G;
            if (z11) {
                ImageReceiver photoImage = q1Var.getPhotoImage();
                view = view2;
                m mVar = (m) gVar;
                i15 = i20;
                boolean z12 = (!transitionParams.w0 || mVar.f == f7 || mVar.e == f7) ? false : true;
                nVar.n = z12;
                if (z12) {
                    tk0Var.setClipChildren(false);
                    tk0Var.invalidate();
                    transitionParams.g0 = true;
                    if (q1Var.getMessageObject().h4()) {
                        transitionParams.n0 = f11;
                        transitionParams.o0 = f12;
                        transitionParams.p0 = f13;
                        transitionParams.q0 = f19;
                        transitionParams.B0 = iArr;
                    } else {
                        transitionParams.n0 = photoImage.K0;
                        transitionParams.o0 = photoImage.L0;
                        transitionParams.p0 = photoImage.M0;
                        transitionParams.q0 = photoImage.N0;
                        transitionParams.B0 = photoImage.W0;
                    }
                    transitionParams.C0 = false;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= 4) {
                            break;
                        }
                        if (iArr2[i22] != transitionParams.B0[i22]) {
                            transitionParams.C0 = true;
                            break;
                        }
                        i22++;
                    }
                    float f20 = transitionParams.n0;
                    float f21 = mVar.c;
                    if (f20 == f21 && transitionParams.o0 == mVar.d && transitionParams.q0 == mVar.f && transitionParams.p0 == mVar.e && !transitionParams.C0) {
                        transitionParams.g0 = false;
                        nVar.n = false;
                    } else {
                        nVar.o = f21;
                        nVar.p = mVar.d;
                        nVar.q = mVar.e;
                        nVar.r = mVar.f;
                        if (currentMessagesGroup != null) {
                            boolean z13 = currentMessagesGroup.c;
                            dj djVar = currentMessagesGroup.m;
                            boolean z14 = djVar.o;
                            if (z13 != z14) {
                                djVar.n = z14 ? 1.0f : f7;
                            }
                        }
                        if (transitionParams.C0) {
                            if (transitionParams.B0 == photoImage.W0) {
                                transitionParams.B0 = new int[4];
                                for (int i23 = 0; i23 < 4; i23++) {
                                    transitionParams.B0[i23] = photoImage.W0[i23];
                                }
                            }
                            photoImage.L0(iArr2);
                        }
                        q1Var.q3(nVar.o, nVar.p, nVar.q, nVar.r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.w0 && (((P3 = q1Var.getMessageObject().P3()) && rect.left != q1Var.getBackgroundDrawableLeft()) || ((!P3 && rect.right != q1Var.getBackgroundDrawableRight()) || rect.top != q1Var.getBackgroundDrawableTop() || rect.bottom != q1Var.getBackgroundDrawableBottom()))) {
                    nVar.v = q1Var.getBackgroundDrawableBottom() - rect.bottom;
                    nVar.u = q1Var.getBackgroundDrawableTop() - rect.top;
                    if (q1Var.W6 != transitionParams.F0) {
                        nVar.s = q1Var.getBackgroundDrawableLeft() - rect.left;
                        nVar.t = q1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (P3) {
                        nVar.s = q1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        nVar.t = q1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    nVar.l = true;
                    transitionParams.x0 = true;
                    transitionParams.h0 = -nVar.s;
                    transitionParams.i0 = -nVar.t;
                    transitionParams.k0 = -nVar.u;
                    transitionParams.j0 = -nVar.v;
                    tk0Var.setClipChildren(false);
                    tk0Var.invalidate();
                }
            } else {
                view = view2;
                i15 = i20;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    tk0 tk0Var2 = (tk0) view.getParent();
                    dj djVar2 = currentMessagesGroup.m;
                    boolean z15 = true;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i24 < tk0Var2.getChildCount()) {
                        View childAt = tk0Var2.getChildAt(i24);
                        if (childAt instanceof q1) {
                            q1 q1Var3 = (q1) childAt;
                            if (q1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !q1Var3.getMessageObject().Z) {
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                ejVar = currentMessagesGroup;
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                i16 = i24;
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if (i27 == 0 || backgroundDrawableLeft < i27) {
                                    i27 = backgroundDrawableLeft;
                                }
                                if (i28 == 0 || backgroundDrawableRight > i28) {
                                    i28 = backgroundDrawableRight;
                                }
                                if (q1Var3.getTransitionParams().w0 || djVar2.p) {
                                    if (i25 == 0 || backgroundDrawableTop < i25) {
                                        i25 = backgroundDrawableTop;
                                    }
                                    if (i26 == 0 || backgroundDrawableBottom > i26) {
                                        i26 = backgroundDrawableBottom;
                                    }
                                    z15 = false;
                                }
                                i24 = i16 + 1;
                                currentMessagesGroup = ejVar;
                            }
                        }
                        ejVar = currentMessagesGroup;
                        i16 = i24;
                        i24 = i16 + 1;
                        currentMessagesGroup = ejVar;
                    }
                    djVar2.p = false;
                    if (i25 == 0 && i26 == 0 && i27 == 0 && i28 == 0) {
                        nVar.j = false;
                        djVar2.j = false;
                    } else {
                        int i29 = (-i25) + djVar2.b;
                        nVar.f = i29;
                        int i30 = (-i26) + djVar2.d;
                        nVar.g = i30;
                        int i31 = (-i27) + djVar2.a;
                        nVar.h = i31;
                        int i32 = (-i28) + djVar2.c;
                        nVar.i = i32;
                        nVar.j = true;
                        djVar2.j = true;
                        djVar2.f = i29;
                        djVar2.h = i30;
                        djVar2.e = i31;
                        djVar2.g = i32;
                        djVar2.n = djVar2.o ? 1.0f : f7;
                        tk0Var2.setClipChildren(false);
                        tk0Var2.invalidate();
                    }
                    djVar2.i = z15;
                }
            }
            Integer valueOf = Integer.valueOf(q1Var.getMessageObject().f1());
            HashMap hashMap = this.H;
            ej ejVar2 = (ej) hashMap.get(valueOf);
            if (ejVar2 != null) {
                dj djVar3 = ejVar2.m;
                hashMap.remove(Integer.valueOf(q1Var.getMessageObject().f1()));
                if (transitionParams.w0) {
                    int backgroundDrawableLeft2 = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                    int backgroundDrawableRight2 = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                    int backgroundDrawableTop2 = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                    int backgroundDrawableBottom2 = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                    nVar.w = true;
                    transitionParams.x0 = true;
                    nVar.s = backgroundDrawableLeft2 - djVar3.a;
                    nVar.t = backgroundDrawableRight2 - djVar3.c;
                    nVar.u = backgroundDrawableTop2 - djVar3.b;
                    nVar.v = backgroundDrawableBottom2 - djVar3.d;
                    nVar.l = false;
                    transitionParams.h0 = (int) ((-r6) - q1Var.getAnimationOffsetX());
                    transitionParams.i0 = (int) ((-nVar.t) - q1Var.getAnimationOffsetX());
                    transitionParams.k0 = (int) ((-nVar.u) - q1Var.getTranslationY());
                    transitionParams.j0 = (int) ((-nVar.v) - q1Var.getTranslationY());
                    transitionParams.D0 = true;
                    tk0Var.setClipChildren(false);
                    tk0Var.invalidate();
                } else {
                    djVar3.i = true;
                }
            }
            bj bjVar = q1Var.L;
            if (transitionParams.z0 != (q1Var.A6 || q1Var.J || (bjVar != null && (bjVar.l & 8) == 0 && q1Var.K.i))) {
                z10 = true;
                nVar.k = true;
                f14 = f7;
                transitionParams.A0 = f14;
            } else {
                f14 = f7;
                z10 = true;
            }
            boolean a2 = transitionParams.a();
            nVar.m = a2;
            if (a2) {
                transitionParams.h = z10;
                transitionParams.L1 = f14;
            }
            if (i15 == 0 && i21 == 0 && !nVar.n && !nVar.w && !nVar.j && !nVar.k && !nVar.l && !a2) {
                v(c1Var);
                return false;
            }
        } else if (s0Var2 != null) {
            r0 transitionParams2 = s0Var2.getTransitionParams();
            transitionParams2.getClass();
            if (i20 != 0) {
                view2.setTranslationX(-i20);
            }
            boolean a10 = !transitionParams2.a ? false : transitionParams2.d.E0.a();
            nVar.m = a10;
            if (a10) {
                transitionParams2.b = true;
                transitionParams2.c = 0.0f;
            }
            if (i20 == 0 && i21 == 0 && !a10) {
                v(c1Var);
                return false;
            }
        } else if (view2 instanceof f0) {
            ((f0) view2).setAnimating(true);
        } else if (view2 instanceof ra) {
            ((ra) view2).setAnimating(true);
        } else {
            if (i20 == 0 && i21 == 0) {
                v(c1Var);
                return false;
            }
            if (i20 != 0) {
                view2.setTranslationX(-i20);
            }
        }
        this.r.add(nVar);
        F();
        return true;
    }

    @Override // s4.j, s4.f1
    public final void s(c1 c1Var, ac.g gVar) {
        if (v2.a) {
            f8.b("animate remove");
        }
        super.s(c1Var, gVar);
        View view = c1Var.a;
        if (gVar != null) {
            int i10 = gVar.b;
            int top = view.getTop();
            int left = view.getLeft() - gVar.a;
            if (top - i10 != 0) {
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
            if (gVar instanceof m) {
                m mVar = (m) gVar;
                q1Var.q3(mVar.c, mVar.d, mVar.e, mVar.f);
            }
        }
    }
}
