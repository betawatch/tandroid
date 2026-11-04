package ni;

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
import ci.uc;
import ei.j3;
import gi.z4;
import ii.v3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import l9.u;
import lg.y;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.g0;
import org.telegram.messenger.r2;
import org.telegram.messenger.ri;
import org.telegram.messenger.ti;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.g1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.a51;
import org.telegram.ui.cc1;
import org.telegram.ui.me;
import org.telegram.ui.mj;
import org.telegram.ui.wm;
import r0.i0;
import u4.a1;
import u4.d1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public abstract class l extends u4.k {
    public static final xq V = new xq(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final wm F;
    public final tj0 G;
    public boolean N;
    public d1 O;
    public on P;
    public boolean Q;
    public final e6 R;
    public me T;
    public me U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public l(wm wmVar, tj0 tj0Var, e6 e6Var) {
        this.R = e6Var;
        this.F = wmVar;
        this.G = tj0Var;
        this.o = V;
        this.n = true;
        this.m = false;
    }

    @Override // u4.k
    public final void B(u4.i iVar) {
        u4.i iVar2;
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

    @Override // u4.k
    public final void C(d1 d1Var, u4.j jVar) {
        T(d1Var, jVar, false);
    }

    @Override // u4.k
    public final boolean J(u4.i iVar, d1 d1Var) {
        cz0 cz0Var;
        if (r2.a) {
            a8.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(d1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = d1Var.a;
        if (this.K.contains(view) && (cz0Var = (cz0) this.U.run()) != null) {
            cz0Var.a(view);
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

    @Override // u4.k
    public final long L() {
        return 0L;
    }

    @Override // u4.k
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
    /* JADX WARN: Removed duplicated region for block: B:11:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(final d1 d1Var, u4.j jVar, boolean z10) {
        d1 d1Var2;
        int i3;
        x1 x1Var;
        q1 q1Var;
        boolean z11;
        boolean z12;
        final k kVar;
        final q1 q1Var2;
        x1 x1Var2;
        final int i10;
        final x1 x1Var3;
        ValueAnimator valueAnimator;
        final boolean z13;
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
        wm wmVar = this.F;
        if (wmVar != null && (view instanceof f0)) {
            f0 f0Var = (f0) view;
            float translationY = f0Var.getTranslationY();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new h(this, f0Var, translationY, i14));
            animatorSet.playTogether(ofFloat);
        } else {
            if (wmVar == null || !(view instanceof ra)) {
                if (view instanceof q1) {
                    final q1 q1Var3 = (q1) view;
                    final x1 transitionParams = q1Var3.getTransitionParams();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(q1Var3, q1Var3.Wc, 0.0f));
                    if (kVar2.n) {
                        q1Var3.s3(kVar2.o, kVar2.p, kVar2.q, kVar2.r);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        final float f10 = q1Var3.getCurrentMessagesGroup() == null ? transitionParams.v0 : q1Var3.getCurrentMessagesGroup().m.n;
                        final float c2 = q1Var3.getCurrentMessagesGroup() == null ? q1Var3.c2() : q1Var3.getCurrentMessagesGroup().c;
                        if (f10 != c2) {
                            valueAnimator = ofFloat2;
                            z13 = true;
                        } else {
                            valueAnimator = ofFloat2;
                            z13 = false;
                        }
                        if (transitionParams.C0) {
                            z11 = false;
                            iArr = new int[4];
                            int i16 = 0;
                            for (int i17 = 4; i16 < i17; i17 = 4) {
                                iArr[i16] = q1Var3.getPhotoImage().X0[i16];
                                i16++;
                            }
                        } else {
                            z11 = false;
                            iArr = null;
                        }
                        final int[] iArr2 = iArr;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        i3 = 2;
                        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: ni.a
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                k kVar3 = k.this;
                                float f11 = 1.0f - floatValue;
                                float f12 = kVar3.o * f11;
                                x1 x1Var4 = transitionParams;
                                float f13 = (x1Var4.n0 * floatValue) + f12;
                                float f14 = (x1Var4.o0 * floatValue) + (kVar3.p * f11);
                                float f15 = (x1Var4.p0 * floatValue) + (kVar3.q * f11);
                                float f16 = (x1Var4.q0 * floatValue) + (kVar3.r * f11);
                                boolean z14 = z13;
                                q1 q1Var4 = q1Var3;
                                if (z14) {
                                    float f17 = (c2 * floatValue) + (f10 * f11);
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
                                q1Var4.s3(f13, f14, f15, f16);
                                d1Var.a.invalidate();
                            }
                        };
                        x1Var = transitionParams;
                        q1Var = q1Var3;
                        d1Var2 = d1Var;
                        valueAnimator2.addUpdateListener(animatorUpdateListener);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[z11 ? 1 : 0] = valueAnimator2;
                        animatorSet.playTogether(animatorArr);
                    } else {
                        i3 = 2;
                        x1Var = transitionParams;
                        q1Var = q1Var3;
                        d1Var2 = d1Var;
                        z11 = false;
                    }
                    int i18 = 3;
                    if (kVar2.v == 0 && kVar2.t == 0 && kVar2.u == 0 && kVar2.s == 0) {
                        x1Var.l0 = 0.0f;
                        x1Var.m0 = 0.0f;
                        z12 = z11;
                    } else {
                        tj0 tj0Var = this.G;
                        tj0Var.setClipChildren(z11);
                        tj0Var.invalidate();
                        float[] fArr = new float[i3];
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
                        ofFloat3.addUpdateListener(new j3(kVar2, x1Var, q1Var, i18));
                        z12 = false;
                        animatorSet.playTogether(ofFloat3);
                    }
                    ui currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        kVar2.j = z12;
                    }
                    if (kVar2.j) {
                        float[] fArr2 = new float[i3];
                        // fill-array-data instruction
                        fArr2[0] = 1.0f;
                        fArr2[1] = 0.0f;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr2);
                        x1 x1Var4 = x1Var;
                        final ti tiVar = currentMessagesGroup.m;
                        final tj0 tj0Var2 = (tj0) view.getParent();
                        final float f11 = currentMessagesGroup.m.n;
                        float f12 = currentMessagesGroup.c ? 1.0f : 0.0f;
                        final boolean z14 = f11 != f12;
                        x1Var2 = x1Var4;
                        final float f13 = f12;
                        kVar = kVar2;
                        q1Var2 = q1Var;
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ni.b
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                k kVar3 = kVar;
                                ti tiVar2 = ti.this;
                                tiVar2.f = kVar3.f * floatValue;
                                tiVar2.h = kVar3.g * floatValue;
                                tiVar2.e = kVar3.h * floatValue;
                                tiVar2.g = kVar3.i * floatValue;
                                if (z14) {
                                    tiVar2.n = com.google.android.recaptcha.internal.a.y(1.0f, floatValue, f13, f11 * floatValue);
                                }
                                tj0 tj0Var3 = tj0Var2;
                                if (tj0Var3 != null) {
                                    tj0Var3.invalidate();
                                }
                            }
                        });
                        ofFloat4.addListener(new v3(tiVar, 3));
                        i10 = 0;
                        animatorSet.playTogether(ofFloat4);
                    } else {
                        kVar = kVar2;
                        q1Var2 = q1Var;
                        x1Var2 = x1Var;
                        i10 = 0;
                    }
                    if (kVar.k) {
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        x1Var3 = x1Var2;
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ni.c
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
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        x1Var3.h = true;
                        ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ni.c
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
                            ofFloat7.addUpdateListener(new uc(9, transitionParams2, t0Var));
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
                    animatorSet.setInterpolator(xq.g);
                }
                animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
                animatorSet.addListener(new z4(this, d1Var2, i13, view));
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
        if (z10) {
        }
        animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
        animatorSet.addListener(new z4(this, d1Var2, i13, view));
        animatorSet.start();
        this.J.put(d1Var2, animatorSet);
    }

    public final void U() {
        cz0 cz0Var;
        HashMap hashMap = this.J;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (this.K.isEmpty() || (cz0Var = (cz0) this.U.run()) == null) {
            return;
        }
        ArrayList arrayList2 = cz0Var.c;
        if (cz0Var.e) {
            return;
        }
        cz0Var.e = true;
        int size2 = arrayList2.size();
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            bz0 bz0Var = (bz0) obj2;
            Runnable runnable = bz0Var.d;
            if (runnable != null) {
                cz0.b(runnable);
                bz0Var.d = null;
            }
        }
        arrayList2.clear();
        az0 az0Var = cz0Var.a;
        if (az0Var != null) {
            az0Var.h();
        }
        Runnable runnable2 = cz0Var.d;
        if (runnable2 != null) {
            cz0Var.d = null;
            cz0.b(runnable2);
        }
    }

    public final void V(ui uiVar) {
        if (uiVar == null) {
            return;
        }
        ArrayList arrayList = uiVar.d;
        ti tiVar = uiVar.m;
        if (arrayList.size() == 0) {
            tiVar.i = true;
            return;
        }
        if (tiVar.b == 0 && tiVar.d == 0 && tiVar.a == 0 && tiVar.c == 0) {
            tj0 tj0Var = this.G;
            int childCount = tj0Var.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = tj0Var.getChildAt(i3);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    zi messageObject = q1Var.getMessageObject();
                    if (q1Var.getTransitionParams().w0 && arrayList.contains(messageObject)) {
                        tiVar.b = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                        tiVar.d = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                        tiVar.a = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                        tiVar.c = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                        tiVar.o = q1Var.c2();
                        tiVar.k = q1Var.H2();
                        tiVar.l = q1Var.G2();
                        tiVar.p = true;
                        break;
                    }
                }
                i3++;
            }
        }
        this.I.add(uiVar);
    }

    public abstract void W();

    public final void X(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z10 = view instanceof f0;
        tj0 tj0Var = this.G;
        if (z10) {
            int measuredHeight = (tj0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
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
            int measuredHeight2 = (tj0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
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

    public final void Y(me meVar, me meVar2) {
        this.T = meVar;
        this.U = meVar2;
    }

    public final boolean Z(View view) {
        d1 T;
        if (this.N || (T = this.G.T(view)) == null) {
            return false;
        }
        return this.q.contains(T) || this.y.contains(T);
    }

    @Override // u4.f1, u4.m0
    public final boolean a(d1 d1Var, d2.t0 t0Var, d2.t0 t0Var2) {
        ArrayList arrayList;
        int i3;
        boolean a10 = super.a(d1Var, t0Var, t0Var2);
        if (a10 && this.N) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.q;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((d1) arrayList.get(i10)).c() == 0) {
                    z10 = true;
                }
                i10++;
            }
            if (z10) {
                i3 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    i3 += ((d1) arrayList.get(i11)).a.getHeight();
                }
            } else {
                i3 = 0;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((d1) arrayList.get(i12)).a.setTranslationY(i3);
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

    @Override // u4.k, u4.m0
    public final void f(d1 d1Var) {
        cz0 cz0Var;
        Animator animator = (Animator) this.J.remove(d1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = d1Var.a;
        if (this.K.contains(view) && (cz0Var = (cz0) this.U.run()) != null) {
            cz0Var.a(view);
        }
        super.f(d1Var);
        X(view);
    }

    @Override // u4.k, u4.m0
    public void g() {
        if (r2.a) {
            a8.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((ui) obj).m.p = false;
        }
        arrayList.clear();
        U();
        on onVar = this.P;
        if (onVar != null) {
            onVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            u4.j jVar = (u4.j) arrayList2.get(size2);
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
            I((u4.i) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (k()) {
            ArrayList arrayList6 = this.u;
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
                for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                    u4.j jVar2 = (u4.j) arrayList7.get(size7);
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
                    I((u4.i) arrayList11.get(size11));
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

    @Override // u4.m0
    public final long i() {
        return 250L;
    }

    @Override // u4.m0
    public final long j() {
        return 250L;
    }

    @Override // u4.m0
    public final d2.t0 l(a1 a1Var, d1 d1Var, int i3, List list) {
        d2.t0 l10 = super.l(a1Var, d1Var, i3, list);
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

    /* JADX WARN: Removed duplicated region for block: B:197:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x047b A[EDGE_INSN: B:226:0x047b->B:227:0x047b BREAK  A[LOOP:9: B:195:0x03c1->B:219:0x0471], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0201  */
    @Override // u4.k, u4.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        boolean z10;
        boolean z11;
        tj0 tj0Var;
        boolean z12;
        long j10;
        boolean z13;
        int size;
        int i3;
        HashMap hashMap;
        float f10;
        int i10;
        ArrayList arrayList;
        tj0 tj0Var2;
        float f11;
        boolean z14;
        ArrayList arrayList2;
        int i11;
        int i12;
        ArrayList arrayList3;
        boolean z15;
        ArrayList arrayList4;
        me meVar;
        int i13;
        ui currentMessagesGroup;
        boolean z16;
        tj0 tj0Var3;
        boolean z17;
        zi messageObject;
        me meVar2;
        int i14;
        int i15;
        boolean z18;
        wm wmVar;
        Runnable runnable;
        se seVar;
        int i16;
        l lVar = this;
        ArrayList arrayList5 = lVar.p;
        boolean isEmpty = arrayList5.isEmpty();
        ArrayList arrayList6 = lVar.r;
        boolean isEmpty2 = arrayList6.isEmpty();
        ArrayList arrayList7 = lVar.s;
        boolean isEmpty3 = arrayList7.isEmpty();
        ArrayList arrayList8 = lVar.q;
        boolean isEmpty4 = arrayList8.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        boolean z19 = lVar.N;
        tj0 tj0Var4 = lVar.G;
        if (z19) {
            z10 = false;
            for (0; i16 < arrayList8.size(); i16 + 1) {
                if (lVar.Q) {
                    i16 = ((d1) arrayList8.get(i16)).c() != (tj0Var4.getAdapter() == null ? 0 : tj0Var4.getAdapter().b()) - 1 ? i16 + 1 : 0;
                    z10 = true;
                } else {
                    if (((d1) arrayList8.get(i16)).c() != 0) {
                    }
                    z10 = true;
                }
            }
        } else {
            z10 = false;
        }
        lVar.W();
        ArrayList arrayList9 = lVar.y;
        float f12 = 1.0f;
        if (z10) {
            boolean isEmpty5 = arrayList5.isEmpty();
            boolean isEmpty6 = arrayList6.isEmpty();
            boolean isEmpty7 = arrayList7.isEmpty();
            boolean isEmpty8 = arrayList8.isEmpty();
            if (!isEmpty5 || !isEmpty6 || !isEmpty8 || !isEmpty7) {
                int i17 = 0;
                for (0; i14 < arrayList8.size(); i14 + 1) {
                    View view = ((d1) arrayList8.get(i14)).a;
                    if (view instanceof q1) {
                        q1 q1Var = (q1) view;
                        i14 = (q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0) ? i14 + 1 : 0;
                    }
                    i17 += ((d1) arrayList8.get(i14)).a.getHeight();
                }
                int size2 = arrayList5.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj = arrayList5.get(i18);
                    i18++;
                    lVar.D((d1) obj);
                }
                arrayList5.clear();
                if (!isEmpty6) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.addAll(arrayList6);
                    arrayList6.clear();
                    int size3 = arrayList10.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj2 = arrayList10.get(i19);
                        i19++;
                        u4.j jVar = (u4.j) obj2;
                        lVar.T(jVar.a, jVar, false);
                    }
                    arrayList10.clear();
                }
                if (!isEmpty8) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.addAll(arrayList8);
                    arrayList8.clear();
                    int size4 = arrayList11.size();
                    int i20 = 0;
                    while (i20 < size4) {
                        Object obj3 = arrayList11.get(i20);
                        i20++;
                        d1 d1Var = (d1) obj3;
                        View view2 = d1Var.a;
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList9.add(d1Var);
                        view2.setTranslationY(i17);
                        View view3 = d1Var.a;
                        view3.setScaleX(f12);
                        view3.setScaleY(f12);
                        q1 q1Var2 = view3 instanceof q1 ? (q1) view3 : null;
                        if (q1Var2 == null || !q1Var2.getTransitionParams().y0) {
                            view3.setAlpha(f12);
                        }
                        wm wmVar2 = lVar.F;
                        if (wmVar2 != null) {
                            ArrayList arrayList12 = wmVar2.J4;
                            if (q1Var2 != null && arrayList12.contains(q1Var2.getMessageObject())) {
                                arrayList12.remove(q1Var2.getMessageObject());
                                mj mjVar = wmVar2.a0;
                                if (mjVar.g0 == null || !((seVar = mjVar.M0) == null || seVar.q0)) {
                                    i15 = size4;
                                } else {
                                    i15 = size4;
                                    if (System.currentTimeMillis() - mjVar.N0 > 300) {
                                        z18 = true;
                                        mjVar.N0 = -1L;
                                        if (z18) {
                                            if (zi.S4(q1Var2.getMessageObject().k)) {
                                                if (Math.abs(view2.getTranslationY()) < view2.getMeasuredHeight() * 3.0f) {
                                                    new cc1(q1Var2, wmVar2.a0, lVar.G, wmVar2.ga, lVar.R).f.start();
                                                }
                                            } else if (az.o() != 0 && Math.abs(view2.getTranslationY()) < tj0Var4.getMeasuredHeight()) {
                                                wmVar = wmVar2;
                                                ValueAnimator valueAnimator = new a51(q1Var2, wmVar2, lVar.G, wmVar2.ga, lVar.R).d;
                                                if (valueAnimator != null) {
                                                    valueAnimator.start();
                                                }
                                                mj mjVar2 = wmVar.a0;
                                                runnable = mjVar2.g0;
                                                if (runnable != null) {
                                                    g0.r(runnable);
                                                    mjVar2.h0 = true;
                                                    mjVar2.g0.run();
                                                    mjVar2.g0 = null;
                                                    animate.translationY(0.0f).setDuration(250L).setInterpolator(lVar.o).setListener(new kg.g0(lVar, d1Var, view2, animate)).start();
                                                    size4 = i15;
                                                    f12 = 1.0f;
                                                }
                                            }
                                            wmVar = wmVar2;
                                            mj mjVar22 = wmVar.a0;
                                            runnable = mjVar22.g0;
                                            if (runnable != null) {
                                            }
                                        }
                                        animate.translationY(0.0f).setDuration(250L).setInterpolator(lVar.o).setListener(new kg.g0(lVar, d1Var, view2, animate)).start();
                                        size4 = i15;
                                        f12 = 1.0f;
                                    }
                                }
                                z18 = false;
                                mjVar.N0 = -1L;
                                if (z18) {
                                }
                                animate.translationY(0.0f).setDuration(250L).setInterpolator(lVar.o).setListener(new kg.g0(lVar, d1Var, view2, animate)).start();
                                size4 = i15;
                                f12 = 1.0f;
                            }
                        }
                        i15 = size4;
                        animate.translationY(0.0f).setDuration(250L).setInterpolator(lVar.o).setListener(new kg.g0(lVar, d1Var, view2, animate)).start();
                        size4 = i15;
                        f12 = 1.0f;
                    }
                    arrayList11.clear();
                }
            }
        } else {
            boolean isEmpty9 = arrayList5.isEmpty();
            boolean isEmpty10 = arrayList6.isEmpty();
            boolean isEmpty11 = arrayList7.isEmpty();
            boolean isEmpty12 = arrayList8.isEmpty();
            if (!isEmpty9 || !isEmpty10 || !isEmpty12 || !isEmpty11) {
                boolean z20 = (lVar.U == null || (meVar2 = lVar.T) == null || !((Boolean) meVar2.run()).booleanValue()) ? false : true;
                ArrayList arrayList13 = lVar.K;
                ArrayList arrayList14 = lVar.A;
                int i21 = 1;
                ArrayList arrayList15 = lVar.S;
                if (z20) {
                    LongSparseArray longSparseArray = null;
                    int i22 = 0;
                    j10 = 0;
                    while (i22 < arrayList5.size()) {
                        d1 d1Var2 = (d1) arrayList5.get(i22);
                        if (arrayList15.contains(d1Var2)) {
                            z16 = isEmpty10;
                            View view4 = d1Var2.a;
                            z17 = isEmpty11;
                            if (!(view4 instanceof q1) || ((q1) view4).getCurrentMessagesGroup() == null || (messageObject = ((q1) d1Var2.a).getMessageObject()) == null || messageObject.d1() == 0) {
                                tj0Var3 = tj0Var4;
                            } else {
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                tj0Var3 = tj0Var4;
                                ArrayList arrayList16 = (ArrayList) longSparseArray.get(messageObject.d1());
                                if (arrayList16 == null) {
                                    long d12 = messageObject.d1();
                                    ArrayList arrayList17 = new ArrayList();
                                    longSparseArray.put(d12, arrayList17);
                                    arrayList16 = arrayList17;
                                }
                                arrayList15.remove(d1Var2);
                                arrayList5.remove(i22);
                                i22--;
                                arrayList16.add(d1Var2);
                            }
                        } else {
                            z16 = isEmpty10;
                            tj0Var3 = tj0Var4;
                            z17 = isEmpty11;
                        }
                        i22++;
                        isEmpty10 = z16;
                        isEmpty11 = z17;
                        tj0Var4 = tj0Var3;
                    }
                    z11 = isEmpty10;
                    tj0Var = tj0Var4;
                    z12 = isEmpty11;
                    if (longSparseArray != null) {
                        int i23 = 0;
                        z13 = false;
                        while (i23 < longSparseArray.size()) {
                            ArrayList arrayList18 = (ArrayList) longSparseArray.valueAt(i23);
                            if (arrayList18.size() > 0) {
                                View view5 = ((d1) arrayList18.get(0)).a;
                                if (!(view5 instanceof q1) || (currentMessagesGroup = ((q1) view5).getCurrentMessagesGroup()) == null || currentMessagesGroup.d.size() <= arrayList18.size()) {
                                    if (r2.a) {
                                        a8.b("animate remove group impl with thanos");
                                    }
                                    arrayList14.addAll(arrayList18);
                                    cz0 cz0Var = (cz0) lVar.U.run();
                                    for (int i24 = 0; i24 < arrayList18.size(); i24++) {
                                    }
                                    ArrayList arrayList19 = new ArrayList();
                                    i13 = i23;
                                    for (int i25 = 0; i25 < arrayList18.size(); i25++) {
                                        arrayList19.add(((d1) arrayList18.get(i25)).a);
                                    }
                                    y yVar = new y(lVar, arrayList19, arrayList18, 11);
                                    az0 az0Var = cz0Var.a;
                                    if (az0Var != null) {
                                        az0Var.e(arrayList19, yVar);
                                        Choreographer.getInstance().postFrameCallback(cz0Var.b);
                                    } else {
                                        cz0Var.c.add(new bz0(arrayList19, yVar));
                                    }
                                    arrayList13.add((View) arrayList19.get(0));
                                    tj0Var.C0();
                                    z13 = true;
                                    i23 = i13 + 1;
                                } else {
                                    arrayList5.addAll(arrayList18);
                                }
                            }
                            i13 = i23;
                            i23 = i13 + 1;
                        }
                        size = arrayList5.size();
                        boolean z21 = z13;
                        i3 = 0;
                        while (true) {
                            hashMap = lVar.J;
                            if (i3 < size) {
                                break;
                            }
                            Object obj4 = arrayList5.get(i3);
                            int i26 = i3 + 1;
                            d1 d1Var3 = (d1) obj4;
                            boolean z22 = arrayList15.remove(d1Var3) && z20;
                            if (r2.a) {
                                arrayList2 = arrayList5;
                                i11 = size;
                                a8.b("animate remove impl ".concat(z22 ? " with thanos" : ""));
                            } else {
                                arrayList2 = arrayList5;
                                i11 = size;
                            }
                            View view6 = d1Var3.a;
                            arrayList14.add(d1Var3);
                            if (!z22 || (meVar = lVar.U) == null) {
                                i12 = i26;
                                arrayList3 = arrayList15;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view6, (Property<View, Float>) View.ALPHA, view6.getAlpha(), 0.0f);
                                z15 = z20;
                                arrayList4 = arrayList13;
                                ofFloat.setDuration(lVar.d);
                                ofFloat.addListener(new f(lVar, view6, d1Var3));
                                hashMap.put(d1Var3, ofFloat);
                                ofFloat.start();
                            } else {
                                cz0 cz0Var2 = (cz0) meVar.run();
                                i12 = i26;
                                y yVar2 = new y(lVar, view6, d1Var3, 12);
                                az0 az0Var2 = cz0Var2.a;
                                if (az0Var2 != null) {
                                    az0Var2.b(1.0f, view6, yVar2);
                                    Choreographer.getInstance().postFrameCallback(cz0Var2.b);
                                } else {
                                    cz0Var2.c.add(new bz0(view6, yVar2));
                                }
                                arrayList13.add(view6);
                                arrayList3 = arrayList15;
                                z15 = z20;
                                arrayList4 = arrayList13;
                            }
                            tj0Var.C0();
                            z20 = z15;
                            arrayList13 = arrayList4;
                            if (z22) {
                                z21 = true;
                            }
                            size = i11;
                            arrayList5 = arrayList2;
                            i3 = i12;
                            arrayList15 = arrayList3;
                        }
                        arrayList5.clear();
                        if (!z11) {
                            ArrayList arrayList20 = new ArrayList();
                            arrayList20.addAll(arrayList6);
                            lVar.u.add(arrayList20);
                            arrayList6.clear();
                            g gVar = new g(lVar, arrayList20, z21, 0);
                            if (!lVar.C || isEmpty9) {
                                gVar.run();
                            } else {
                                View view7 = ((u4.j) arrayList20.get(0)).a.a;
                                WeakHashMap weakHashMap = i0.a;
                                view7.postOnAnimationDelayed(gVar, j10);
                            }
                        }
                        if (!z12) {
                            ArrayList arrayList21 = new ArrayList();
                            arrayList21.addAll(arrayList7);
                            lVar.v.add(arrayList21);
                            arrayList7.clear();
                            u uVar = new u(lVar, arrayList21, false, 22);
                            if (!lVar.C || isEmpty9) {
                                uVar.run();
                            } else {
                                View view8 = ((u4.i) arrayList21.get(0)).a.a;
                                WeakHashMap weakHashMap2 = i0.a;
                                view8.postOnAnimationDelayed(uVar, 0L);
                            }
                        }
                        if (!isEmpty12) {
                            ArrayList arrayList22 = new ArrayList();
                            arrayList22.addAll(arrayList8);
                            arrayList8.clear();
                            Collections.sort(arrayList22, new a3.u(29));
                            int size5 = arrayList22.size();
                            int i27 = 0;
                            while (i27 < size5) {
                                int i28 = i27 + 1;
                                d1 d1Var4 = (d1) arrayList22.get(i27);
                                if (r2.a) {
                                    a8.b("animate add impl");
                                }
                                View view9 = d1Var4.a;
                                arrayList9.add(d1Var4);
                                if (d1Var4 == lVar.O) {
                                    view9.setAlpha(1.0f);
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                if (view9 instanceof q1) {
                                    q1 q1Var3 = (q1) view9;
                                    if (q1Var3.getAnimationOffsetX() != 0.0f) {
                                        g1 g1Var = q1Var3.Wc;
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
                                long max = (long) ((1.0f - Math.max(f10, Math.min(1.0f, view9.getBottom() / tj0Var.getMeasuredHeight()))) * 100.0f);
                                if (!(view9 instanceof q1)) {
                                    i10 = size5;
                                    arrayList = arrayList22;
                                    tj0Var2 = tj0Var;
                                    f11 = 1.0f;
                                } else if (d1Var4 == lVar.O) {
                                    on onVar = lVar.P;
                                    if (onVar != null) {
                                        onVar.h.setAlpha(0.0f);
                                    }
                                    tj0Var2 = tj0Var;
                                    tj0Var2.setClipChildren(false);
                                    final q1 q1Var4 = (q1) view9;
                                    View view10 = (View) lVar.P.getParent();
                                    float x10 = view10.getX() + lVar.P.getX() + lVar.P.h.getX();
                                    float y9 = view10.getY() + lVar.P.getY() + lVar.P.h.getY();
                                    float x11 = q1Var4.getX() + tj0Var2.getX() + q1Var4.getPhotoImage().L0;
                                    float y10 = q1Var4.getY() + tj0Var2.getY() + q1Var4.getPhotoImage().M0;
                                    final float width = lVar.P.h.getWidth();
                                    final float height = lVar.P.h.getHeight();
                                    final float f13 = q1Var4.getPhotoImage().N0;
                                    final float f14 = q1Var4.getPhotoImage().O0;
                                    final float f15 = x10 - x11;
                                    final float f16 = y9 - y10;
                                    final float f17 = q1Var4.getPhotoImage().L0;
                                    final float f18 = q1Var4.getPhotoImage().M0;
                                    q1Var4.getTransitionParams().g0 = true;
                                    q1Var4.getTransitionParams().K1 = true;
                                    q1Var4.getPhotoImage().y0(f17 + f15, f17 + f16, width, height);
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ni.d
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
                                    arrayList = arrayList22;
                                    f11 = 1.0f;
                                    lVar = this;
                                    ofFloat2.addListener(new e(lVar, q1Var4, f17, f18, f13, f14));
                                    animatorSet.play(ofFloat2);
                                    max = max;
                                    z14 = false;
                                    view9.setAlpha(0.0f);
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), f11));
                                    if (z14) {
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
                                    tj0Var = tj0Var2;
                                    size5 = i10;
                                    arrayList22 = arrayList;
                                } else {
                                    i10 = size5;
                                    arrayList = arrayList22;
                                    tj0Var2 = tj0Var;
                                    f11 = 1.0f;
                                    ui currentMessagesGroup2 = ((q1) view9).getCurrentMessagesGroup();
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
                                z14 = true;
                                view9.setAlpha(0.0f);
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), f11));
                                if (z14) {
                                }
                                if (d1Var4 != lVar.O) {
                                }
                                animatorSet.addListener(new f(lVar, d1Var4, view9));
                                hashMap.put(d1Var4, animatorSet);
                                animatorSet.start();
                                i21 = 1;
                                i27 = i28;
                                tj0Var = tj0Var2;
                                size5 = i10;
                                arrayList22 = arrayList;
                            }
                            arrayList22.clear();
                        }
                    }
                } else {
                    z11 = isEmpty10;
                    tj0Var = tj0Var4;
                    z12 = isEmpty11;
                    j10 = 0;
                }
                z13 = false;
                size = arrayList5.size();
                boolean z212 = z13;
                i3 = 0;
                while (true) {
                    hashMap = lVar.J;
                    if (i3 < size) {
                    }
                    size = i11;
                    arrayList5 = arrayList2;
                    i3 = i12;
                    arrayList15 = arrayList3;
                }
                arrayList5.clear();
                if (!z11) {
                }
                if (!z12) {
                }
                if (!isEmpty12) {
                }
            }
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new gi.j3(lVar, 10));
        ofFloat3.setDuration(lVar.d + 250);
        ofFloat3.start();
    }

    @Override // u4.k, u4.f1
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

    @Override // u4.k, u4.f1
    public final boolean q(d1 d1Var, d1 d1Var2, d2.t0 t0Var, int i3, int i10, int i11, int i12) {
        if (d1Var == d1Var2) {
            return r(d1Var, t0Var, i3, i10, i11, i12);
        }
        View view = d1Var.a;
        float animationOffsetX = view instanceof q1 ? ((q1) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(d1Var);
        int i13 = (int) ((i11 - i3) - animationOffsetX);
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
        this.s.add(new u4.i(d1Var, d1Var2, i3, i10, i11, i12));
        F();
        return true;
    }

    @Override // u4.k, u4.f1
    public final boolean r(d1 d1Var, d2.t0 t0Var, int i3, int i10, int i11, int i12) {
        int translationX;
        int i13;
        q1 q1Var;
        t0 t0Var2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        View view;
        int i14;
        float f15;
        boolean z10;
        ui uiVar;
        int i15;
        boolean Q3;
        View view2 = d1Var.a;
        if (view2 instanceof q1) {
            q1 q1Var2 = (q1) view2;
            translationX = i3 + ((int) q1Var2.getAnimationOffsetX());
            i13 = q1Var2.getTransitionParams().t2 != q1Var2.getTopMediaOffset() ? (q1Var2.getTransitionParams().t2 - q1Var2.getTopMediaOffset()) + i10 : i10;
            q1Var = q1Var2;
            t0Var2 = null;
        } else if (view2 instanceof t0) {
            translationX = i3 + ((int) view2.getTranslationX());
            i13 = i10;
            t0Var2 = (t0) view2;
            q1Var = null;
        } else {
            translationX = i3 + ((int) view2.getTranslationX());
            i13 = i10;
            q1Var = null;
            t0Var2 = null;
        }
        int i16 = translationX;
        int translationY = i13 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (q1Var != null) {
            float f16 = q1Var.getPhotoImage().L0;
            float f17 = q1Var.getPhotoImage().M0;
            float f18 = q1Var.getPhotoImage().N0;
            float f19 = q1Var.getPhotoImage().O0;
            f10 = 0.0f;
            int i17 = 0;
            for (int i18 = 4; i17 < i18; i18 = 4) {
                iArr[i17] = q1Var.getPhotoImage().X0[i17];
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
        t0 t0Var3 = t0Var2;
        k kVar = new k(d1Var, i16, translationY, i11, i12);
        if (q1Var != null) {
            x1 transitionParams = q1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.u0;
            Rect rect = transitionParams.E0;
            ui currentMessagesGroup = q1Var.getCurrentMessagesGroup();
            if (i19 != 0) {
                q1Var.setAnimationOffsetX(-i19);
            }
            boolean z11 = t0Var instanceof j;
            tj0 tj0Var = this.G;
            if (z11) {
                ImageReceiver photoImage = q1Var.getPhotoImage();
                view = view2;
                j jVar = (j) t0Var;
                i14 = i19;
                boolean z12 = (!transitionParams.w0 || jVar.f == f10 || jVar.e == f10) ? false : true;
                kVar.n = z12;
                if (z12) {
                    tj0Var.setClipChildren(false);
                    tj0Var.invalidate();
                    transitionParams.g0 = true;
                    if (q1Var.getMessageObject().i4()) {
                        transitionParams.n0 = f12;
                        transitionParams.o0 = f13;
                        transitionParams.p0 = f14;
                        transitionParams.q0 = f20;
                        transitionParams.B0 = iArr;
                    } else {
                        transitionParams.n0 = photoImage.L0;
                        transitionParams.o0 = photoImage.M0;
                        transitionParams.p0 = photoImage.N0;
                        transitionParams.q0 = photoImage.O0;
                        transitionParams.B0 = photoImage.X0;
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
                            boolean z13 = currentMessagesGroup.c;
                            ti tiVar = currentMessagesGroup.m;
                            boolean z14 = tiVar.o;
                            if (z13 != z14) {
                                tiVar.n = z14 ? 1.0f : f10;
                            }
                        }
                        if (transitionParams.C0) {
                            if (transitionParams.B0 == photoImage.X0) {
                                transitionParams.B0 = new int[4];
                                for (int i22 = 0; i22 < 4; i22++) {
                                    transitionParams.B0[i22] = photoImage.X0[i22];
                                }
                            }
                            photoImage.L0(iArr2);
                        }
                        q1Var.s3(kVar.o, kVar.p, kVar.q, kVar.r);
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
                    tj0Var.setClipChildren(false);
                    tj0Var.invalidate();
                }
            } else {
                view = view2;
                i14 = i19;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    tj0 tj0Var2 = (tj0) view.getParent();
                    ti tiVar2 = currentMessagesGroup.m;
                    boolean z15 = true;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    while (i23 < tj0Var2.getChildCount()) {
                        View childAt = tj0Var2.getChildAt(i23);
                        if (childAt instanceof q1) {
                            q1 q1Var3 = (q1) childAt;
                            if (q1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !q1Var3.getMessageObject().Z) {
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                uiVar = currentMessagesGroup;
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
                                if (q1Var3.getTransitionParams().w0 || tiVar2.p) {
                                    if (i24 == 0 || backgroundDrawableTop < i24) {
                                        i24 = backgroundDrawableTop;
                                    }
                                    if (i25 == 0 || backgroundDrawableBottom > i25) {
                                        i25 = backgroundDrawableBottom;
                                    }
                                    z15 = false;
                                }
                                i23 = i15 + 1;
                                currentMessagesGroup = uiVar;
                            }
                        }
                        uiVar = currentMessagesGroup;
                        i15 = i23;
                        i23 = i15 + 1;
                        currentMessagesGroup = uiVar;
                    }
                    tiVar2.p = false;
                    if (i24 == 0 && i25 == 0 && i26 == 0 && i27 == 0) {
                        kVar.j = false;
                        tiVar2.j = false;
                    } else {
                        int i28 = (-i24) + tiVar2.b;
                        kVar.f = i28;
                        int i29 = (-i25) + tiVar2.d;
                        kVar.g = i29;
                        int i30 = (-i26) + tiVar2.a;
                        kVar.h = i30;
                        int i31 = (-i27) + tiVar2.c;
                        kVar.i = i31;
                        kVar.j = true;
                        tiVar2.j = true;
                        tiVar2.f = i28;
                        tiVar2.h = i29;
                        tiVar2.e = i30;
                        tiVar2.g = i31;
                        tiVar2.n = tiVar2.o ? 1.0f : f10;
                        tj0Var2.setClipChildren(false);
                        tj0Var2.invalidate();
                    }
                    tiVar2.i = z15;
                }
            }
            Integer valueOf = Integer.valueOf(q1Var.getMessageObject().f1());
            HashMap hashMap = this.H;
            ui uiVar2 = (ui) hashMap.get(valueOf);
            if (uiVar2 != null) {
                ti tiVar3 = uiVar2.m;
                hashMap.remove(Integer.valueOf(q1Var.getMessageObject().f1()));
                if (transitionParams.w0) {
                    int backgroundDrawableLeft2 = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                    int backgroundDrawableRight2 = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                    int backgroundDrawableTop2 = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                    int backgroundDrawableBottom2 = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                    kVar.w = true;
                    transitionParams.x0 = true;
                    kVar.s = backgroundDrawableLeft2 - tiVar3.a;
                    kVar.t = backgroundDrawableRight2 - tiVar3.c;
                    kVar.u = backgroundDrawableTop2 - tiVar3.b;
                    kVar.v = backgroundDrawableBottom2 - tiVar3.d;
                    kVar.l = false;
                    transitionParams.h0 = (int) ((-r6) - q1Var.getAnimationOffsetX());
                    transitionParams.i0 = (int) ((-kVar.t) - q1Var.getAnimationOffsetX());
                    transitionParams.k0 = (int) ((-kVar.u) - q1Var.getTranslationY());
                    transitionParams.j0 = (int) ((-kVar.v) - q1Var.getTranslationY());
                    transitionParams.D0 = true;
                    tj0Var.setClipChildren(false);
                    tj0Var.invalidate();
                } else {
                    tiVar3.i = true;
                }
            }
            ri riVar = q1Var.M;
            if (transitionParams.z0 != (q1Var.B6 || q1Var.K || (riVar != null && (riVar.l & 8) == 0 && q1Var.L.i))) {
                z10 = true;
                kVar.k = true;
                f15 = f10;
                transitionParams.A0 = f15;
            } else {
                f15 = f10;
                z10 = true;
            }
            boolean a10 = transitionParams.a();
            kVar.m = a10;
            if (a10) {
                transitionParams.h = z10;
                transitionParams.L1 = f15;
            }
            if (i14 == 0 && i20 == 0 && !kVar.n && !kVar.w && !kVar.j && !kVar.k && !kVar.l && !a10) {
                v(d1Var);
                return false;
            }
        } else if (t0Var3 != null) {
            s0 transitionParams2 = t0Var3.getTransitionParams();
            transitionParams2.getClass();
            if (i19 != 0) {
                view2.setTranslationX(-i19);
            }
            boolean a11 = !transitionParams2.a ? false : transitionParams2.d.F0.a();
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

    @Override // u4.k, u4.f1
    public final void s(d1 d1Var, d2.t0 t0Var) {
        if (r2.a) {
            a8.b("animate remove");
        }
        super.s(d1Var, t0Var);
        View view = d1Var.a;
        if (t0Var != null) {
            int i3 = t0Var.b;
            int top = view.getTop();
            int left = view.getLeft() - t0Var.a;
            if (top - i3 != 0) {
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
            if (t0Var instanceof j) {
                j jVar = (j) t0Var;
                q1Var.s3(jVar.c, jVar.d, jVar.e, jVar.f);
            }
        }
    }
}
