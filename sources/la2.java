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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class la2 extends gb3 {
    public static final s33 V = new s33(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final mu1 F;
    public final o39 G;
    public boolean N;
    public s49 O;
    public i92 P;
    public boolean Q;
    public final wjb R;
    public go1 T;
    public ll1 U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public la2(mu1 mu1Var, o39 o39Var, wjb wjbVar) {
        this.R = wjbVar;
        this.F = mu1Var;
        this.G = o39Var;
        this.o = V;
        this.n = true;
        this.m = false;
    }

    @Override // gb3
    public final void B(eb3 eb3Var) {
        la2 la2Var;
        eb3 eb3Var2;
        s49 s49Var = eb3Var.a;
        View view = s49Var == null ? null : s49Var.a;
        s49 s49Var2 = eb3Var.b;
        View view2 = s49Var2 != null ? s49Var2.a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(eb3Var.a);
            duration.translationX(eb3Var.e - eb3Var.c);
            duration.translationY(eb3Var.f - eb3Var.d);
            la2Var = this;
            eb3Var2 = eb3Var;
            duration.alpha(0.0f).setListener(new ia2(la2Var, eb3Var2, duration, view, (byte) 0)).start();
        } else {
            la2Var = this;
            eb3Var2 = eb3Var;
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(eb3Var2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new ia2(la2Var, eb3Var2, animate, view2, (byte) 1)).start();
        }
    }

    @Override // gb3
    public final void C(s49 s49Var, fb3 fb3Var) {
        S(s49Var, fb3Var, false);
    }

    @Override // gb3
    public final boolean J(eb3 eb3Var, s49 s49Var) {
        ijb ijbVar;
        if (w01.a) {
            fa4.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(s49Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = s49Var.a;
        if (this.K.contains(view) && (ijbVar = (ijb) this.U.run()) != null) {
            ijbVar.a(view);
        }
        if (eb3Var.b == s49Var) {
            eb3Var.b = null;
        } else {
            if (eb3Var.a != s49Var) {
                return false;
            }
            eb3Var.a = null;
        }
        W(view);
        d(s49Var);
        return true;
    }

    @Override // gb3
    public final long L() {
        return 0L;
    }

    @Override // gb3
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
    public final void S(final s49 s49Var, fb3 fb3Var, boolean z) {
        s49 s49Var2;
        nb2 nb2Var;
        int i;
        gb2 gb2Var;
        boolean z2;
        float f;
        boolean z3;
        final ka2 ka2Var;
        final gb2 gb2Var2;
        nb2 nb2Var2;
        final byte b;
        final nb2 nb2Var3;
        ValueAnimator valueAnimator;
        final boolean z4;
        int[] iArr;
        int i2 = fb3Var.c;
        int i3 = fb3Var.e;
        View view = s49Var.a;
        int i4 = i3 - i2;
        AnimatorSet animatorSet = new AnimatorSet();
        byte b2 = 0;
        final byte b3 = 1;
        if (i4 != 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.z.add(s49Var);
        final ka2 ka2Var2 = (ka2) fb3Var;
        if (this.F != null) {
            if (view instanceof eq0) {
                eq0 eq0Var = (eq0) view;
                float translationY = eq0Var.getTranslationY();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ha2(this, eq0Var, translationY, b2));
                animatorSet.playTogether(ofFloat);
            } else if (view instanceof g7c) {
                g7c g7cVar = (g7c) view;
                float translationY2 = g7cVar.getTranslationY();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ha2(this, g7cVar, translationY2, b3));
                animatorSet.playTogether(ofFloat2);
            }
            s49Var2 = s49Var;
            if (z) {
                s33 s33Var = this.o;
                if (s33Var != null) {
                    animatorSet.setInterpolator(s33Var);
                }
            } else {
                animatorSet.setInterpolator(s33.g);
            }
            animatorSet.setDuration((long) (250.0f * (z ? 1.9f : 1.0f)));
            animatorSet.addListener(new qp1(this, s49Var2, i4, view));
            animatorSet.start();
            this.J.put(s49Var2, animatorSet);
        }
        if (view instanceof gb2) {
            final gb2 gb2Var3 = (gb2) view;
            final nb2 transitionParams = gb2Var3.getTransitionParams();
            animatorSet.playTogether(ObjectAnimator.ofFloat(gb2Var3, gb2Var3.xd, 0.0f));
            if (ka2Var2.n) {
                gb2Var3.x3(ka2Var2.o, ka2Var2.p, ka2Var2.q, ka2Var2.r);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                final float f2 = gb2Var3.getCurrentMessagesGroup() == null ? transitionParams.v0 : gb2Var3.getCurrentMessagesGroup().m.n;
                final float f22 = gb2Var3.getCurrentMessagesGroup() == null ? gb2Var3.f2() : gb2Var3.getCurrentMessagesGroup().c;
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
                        iArr[i5] = gb2Var3.getPhotoImage().X0[i5];
                        i5++;
                    }
                } else {
                    z2 = false;
                    iArr = null;
                }
                final int[] iArr2 = iArr;
                ValueAnimator valueAnimator2 = valueAnimator;
                i = 2;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: aa2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ka2 ka2Var3 = ka2.this;
                        float f3 = 1.0f - floatValue;
                        float f4 = ka2Var3.o * f3;
                        nb2 nb2Var4 = transitionParams;
                        float f5 = (nb2Var4.n0 * floatValue) + f4;
                        float f6 = (nb2Var4.o0 * floatValue) + (ka2Var3.p * f3);
                        float f7 = (nb2Var4.p0 * floatValue) + (ka2Var3.q * f3);
                        float f8 = (nb2Var4.q0 * floatValue) + (ka2Var3.r * f3);
                        boolean z5 = z4;
                        gb2 gb2Var4 = gb2Var3;
                        if (z5) {
                            float f9 = (f22 * floatValue) + (f2 * f3);
                            nb2Var4.v0 = f9;
                            if (gb2Var4.getCurrentMessagesGroup() != null) {
                                gb2Var4.getCurrentMessagesGroup().m.n = f9;
                            }
                        }
                        if (nb2Var4.C0) {
                            ImageReceiver photoImage = gb2Var4.getPhotoImage();
                            int[] iArr3 = iArr2;
                            int[] iArr4 = nb2Var4.B0;
                            photoImage.r0((int) ((iArr4[0] * floatValue) + (iArr3[0] * f3)), (int) ((iArr4[1] * floatValue) + (iArr3[1] * f3)), (int) ((iArr4[2] * floatValue) + (iArr3[2] * f3)), (int) ((iArr4[3] * floatValue) + (iArr3[3] * f3)));
                        }
                        gb2Var4.x3(f5, f6, f7, f8);
                        s49Var.a.invalidate();
                    }
                };
                nb2Var = transitionParams;
                gb2Var = gb2Var3;
                s49Var2 = s49Var;
                valueAnimator2.addUpdateListener(animatorUpdateListener);
                Animator[] animatorArr = new Animator[1];
                animatorArr[z2 ? 1 : 0] = valueAnimator2;
                animatorSet.playTogether(animatorArr);
            } else {
                nb2Var = transitionParams;
                i = 2;
                gb2Var = gb2Var3;
                s49Var2 = s49Var;
                z2 = false;
            }
            if (ka2Var2.v == 0 && ka2Var2.t == 0 && ka2Var2.u == 0 && ka2Var2.s == 0) {
                f = 0.0f;
                nb2Var.l0 = 0.0f;
                nb2Var.m0 = 0.0f;
                z3 = z2;
            } else {
                f = 0.0f;
                o39 o39Var = this.G;
                o39Var.setClipChildren(z2);
                o39Var.invalidate();
                float[] fArr = new float[i];
                // fill-array-data instruction
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr);
                boolean z5 = ka2Var2.l;
                int i7 = ka2Var2.s;
                if (z5) {
                    nb2Var.l0 = -i7;
                    nb2Var.m0 = -ka2Var2.t;
                } else {
                    nb2Var.l0 = (-i7) - gb2Var.getAnimationOffsetX();
                    nb2Var.m0 = (-ka2Var2.t) - gb2Var.getAnimationOffsetX();
                }
                ofFloat4.addUpdateListener(new nk(ka2Var2, nb2Var, gb2Var, b3));
                z3 = false;
                animatorSet.playTogether(ofFloat4);
            }
            f27 currentMessagesGroup = gb2Var.getCurrentMessagesGroup();
            if (currentMessagesGroup == null) {
                ka2Var2.j = z3;
            }
            if (ka2Var2.j) {
                float[] fArr2 = new float[i];
                // fill-array-data instruction
                fArr2[0] = 1.0f;
                fArr2[1] = 0.0f;
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(fArr2);
                nb2 nb2Var4 = nb2Var;
                final e27 e27Var = currentMessagesGroup.m;
                final o39 o39Var2 = (o39) view.getParent();
                final float f3 = currentMessagesGroup.m.n;
                if (currentMessagesGroup.c) {
                    f = 1.0f;
                }
                final boolean z6 = f3 != f;
                nb2Var2 = nb2Var4;
                final float f4 = f;
                ka2Var = ka2Var2;
                gb2Var2 = gb2Var;
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ba2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ka2 ka2Var3 = ka2Var;
                        e27 e27Var2 = e27.this;
                        e27Var2.f = ka2Var3.f * floatValue;
                        e27Var2.h = ka2Var3.g * floatValue;
                        e27Var2.e = ka2Var3.h * floatValue;
                        e27Var2.g = ka2Var3.i * floatValue;
                        if (z6) {
                            e27Var2.n = tb4.A(1.0f, floatValue, f4, f3 * floatValue);
                        }
                        o39 o39Var3 = o39Var2;
                        if (o39Var3 != null) {
                            o39Var3.invalidate();
                        }
                    }
                });
                ofFloat5.addListener(new bb1((Object) e27Var, (byte) 21));
                b = 0;
                animatorSet.playTogether(ofFloat5);
            } else {
                ka2Var = ka2Var2;
                gb2Var2 = gb2Var;
                nb2Var2 = nb2Var;
                b = 0;
            }
            if (ka2Var.k) {
                float[] fArr3 = new float[i];
                // fill-array-data instruction
                fArr3[0] = 0.0f;
                fArr3[1] = 1.0f;
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(fArr3);
                nb2Var3 = nb2Var2;
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ca2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        byte b4 = b;
                        gb2 gb2Var4 = gb2Var2;
                        nb2 nb2Var5 = nb2Var3;
                        switch (b4) {
                            case 0:
                                nb2Var5.A0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                gb2Var4.invalidate();
                                break;
                            default:
                                nb2Var5.L1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                gb2Var4.invalidate();
                                break;
                        }
                    }
                });
                Animator[] animatorArr2 = new Animator[1];
                animatorArr2[b] = ofFloat6;
                animatorSet.playTogether(animatorArr2);
            } else {
                nb2Var3 = nb2Var2;
            }
            if (ka2Var.m) {
                float[] fArr4 = new float[i];
                // fill-array-data instruction
                fArr4[0] = 0.0f;
                fArr4[1] = 1.0f;
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(fArr4);
                nb2Var3.h = true;
                ofFloat7.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ca2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        byte b4 = b3;
                        gb2 gb2Var4 = gb2Var2;
                        nb2 nb2Var5 = nb2Var3;
                        switch (b4) {
                            case 0:
                                nb2Var5.A0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                gb2Var4.invalidate();
                                break;
                            default:
                                nb2Var5.L1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                gb2Var4.invalidate();
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat7);
            }
        } else {
            s49Var2 = s49Var;
            if (view instanceof uk1) {
                uk1 uk1Var = (uk1) view;
                tk1 transitionParams2 = uk1Var.getTransitionParams();
                if (ka2Var2.m) {
                    ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    transitionParams2.b = true;
                    ofFloat8.addUpdateListener(new pk(transitionParams2, uk1Var, (byte) 9));
                    animatorSet.playTogether(ofFloat8);
                }
            }
        }
        if (z) {
        }
        animatorSet.setDuration((long) (250.0f * (z ? 1.9f : 1.0f)));
        animatorSet.addListener(new qp1(this, s49Var2, i4, view));
        animatorSet.start();
        this.J.put(s49Var2, animatorSet);
    }

    public final void T() {
        ijb ijbVar;
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
        if (this.K.isEmpty() || (ijbVar = (ijb) this.U.run()) == null) {
            return;
        }
        ArrayList arrayList2 = ijbVar.c;
        if (ijbVar.e) {
            return;
        }
        ijbVar.e = true;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            hjb hjbVar = (hjb) obj2;
            Runnable runnable = hjbVar.d;
            if (runnable != null) {
                ijb.b(runnable);
                hjbVar.d = null;
            }
        }
        arrayList2.clear();
        gjb gjbVar = ijbVar.a;
        if (gjbVar != null) {
            gjbVar.g();
        }
        Runnable runnable2 = ijbVar.d;
        if (runnable2 != null) {
            ijbVar.d = null;
            ijb.b(runnable2);
        }
    }

    public final void U(f27 f27Var) {
        if (f27Var == null) {
            return;
        }
        ArrayList arrayList = f27Var.d;
        e27 e27Var = f27Var.m;
        if (arrayList.size() == 0) {
            e27Var.i = true;
            return;
        }
        if (e27Var.b == 0 && e27Var.d == 0 && e27Var.a == 0 && e27Var.c == 0) {
            o39 o39Var = this.G;
            int childCount = o39Var.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = o39Var.getChildAt(i);
                if (childAt instanceof gb2) {
                    gb2 gb2Var = (gb2) childAt;
                    k27 messageObject = gb2Var.getMessageObject();
                    if (gb2Var.getTransitionParams().w0 && arrayList.contains(messageObject)) {
                        e27Var.b = gb2Var.getBackgroundDrawableTop() + gb2Var.getPaddingTop() + gb2Var.getTop();
                        e27Var.d = gb2Var.getBackgroundDrawableBottom() + gb2Var.getPaddingTop() + gb2Var.getTop();
                        e27Var.a = gb2Var.getBackgroundDrawableLeft() + gb2Var.getLeft();
                        e27Var.c = gb2Var.getBackgroundDrawableRight() + gb2Var.getLeft();
                        e27Var.o = gb2Var.f2();
                        e27Var.k = gb2Var.L2();
                        e27Var.l = gb2Var.K2();
                        e27Var.p = true;
                        break;
                    }
                }
                i++;
            }
        }
        this.I.add(f27Var);
    }

    public abstract void V();

    public final void W(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z = view instanceof eq0;
        o39 o39Var = this.G;
        if (z) {
            int measuredHeight = (o39Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((eq0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof g7c) {
            int measuredHeight2 = (o39Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((g7c) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof gb2) {
            gb2 gb2Var = (gb2) view;
            gb2Var.getTransitionParams().e();
            gb2Var.setAnimationOffsetX(0.0f);
        } else {
            if (!(view instanceof uk1)) {
                view.setTranslationX(0.0f);
                return;
            }
            tk1 transitionParams = ((uk1) view).getTransitionParams();
            transitionParams.b = false;
            transitionParams.c = 1.0f;
        }
    }

    public final void X(go1 go1Var, ll1 ll1Var) {
        this.T = go1Var;
        this.U = ll1Var;
    }

    public final boolean Y(View view) {
        s49 T;
        if (this.N || (T = this.G.T(view)) == null) {
            return false;
        }
        return this.q.contains(T) || this.y.contains(T);
    }

    public final boolean Z(View view) {
        s49 T = this.G.T(view);
        if (T != null) {
            return this.p.contains(T) || this.A.contains(T);
        }
        return false;
    }

    @Override // hia, b49
    public final boolean a(s49 s49Var, zw8 zw8Var, zw8 zw8Var2) {
        ArrayList arrayList;
        int i;
        boolean a = super.a(s49Var, zw8Var, zw8Var2);
        if (a && this.N) {
            int i2 = 0;
            boolean z = false;
            while (true) {
                arrayList = this.q;
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (((s49) arrayList.get(i2)).c() == 0) {
                    z = true;
                }
                i2++;
            }
            if (z) {
                i = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    i += ((s49) arrayList.get(i3)).a.getHeight();
                }
            } else {
                i = 0;
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ((s49) arrayList.get(i4)).a.setTranslationY(i);
            }
        }
        return a;
    }

    @Override // gb3, b49
    public final void f(s49 s49Var) {
        ijb ijbVar;
        Animator animator = (Animator) this.J.remove(s49Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = s49Var.a;
        if (this.K.contains(view) && (ijbVar = (ijb) this.U.run()) != null) {
            ijbVar.a(view);
        }
        super.f(s49Var);
        W(view);
    }

    @Override // gb3, b49
    public void g() {
        if (w01.a) {
            fa4.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((f27) obj).m.p = false;
        }
        arrayList.clear();
        T();
        i92 i92Var = this.P;
        if (i92Var != null) {
            i92Var.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            fb3 fb3Var = (fb3) arrayList2.get(size2);
            W(fb3Var.a.a);
            v(fb3Var.a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            s49 s49Var = (s49) arrayList3.get(size3);
            W(s49Var.a);
            d(s49Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            s49 s49Var2 = (s49) arrayList4.get(size4);
            W(s49Var2.a);
            u(s49Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((eb3) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (k()) {
            ArrayList arrayList6 = this.u;
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
                for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                    fb3 fb3Var2 = (fb3) arrayList7.get(size7);
                    W(fb3Var2.a.a);
                    v(fb3Var2.a);
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
                    s49 s49Var3 = (s49) arrayList9.get(size9);
                    W(s49Var3.a);
                    u(s49Var3);
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
                    I((eb3) arrayList11.get(size11));
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

    @Override // b49
    public final long i() {
        return 250L;
    }

    @Override // b49
    public final long j() {
        return 250L;
    }

    @Override // b49
    public final zw8 l(p49 p49Var, s49 s49Var, int i, List list) {
        zw8 l = super.l(p49Var, s49Var, i, list);
        View view = s49Var.a;
        if (!(view instanceof gb2)) {
            return l;
        }
        ja2 ja2Var = new ja2((byte) 4);
        ja2Var.b = l.b;
        ja2Var.c = l.c;
        nb2 transitionParams = ((gb2) view).getTransitionParams();
        ja2Var.e = transitionParams.b;
        ja2Var.f = transitionParams.c;
        ja2Var.g = transitionParams.d;
        ja2Var.h = transitionParams.e;
        return ja2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0482 A[EDGE_INSN: B:224:0x0482->B:225:0x0482 BREAK  A[LOOP:9: B:193:0x03c8->B:217:0x0477], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ff  */
    @Override // gb3, b49
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        boolean z;
        boolean z2;
        boolean z3;
        o39 o39Var;
        boolean z4;
        long j;
        boolean z5;
        int size;
        int i;
        HashMap hashMap;
        boolean z6;
        int i2;
        o39 o39Var2;
        boolean z7;
        ArrayList arrayList;
        int i3;
        int i4;
        boolean z8;
        boolean z9;
        ArrayList arrayList2;
        ll1 ll1Var;
        int i5;
        f27 currentMessagesGroup;
        boolean z10;
        boolean z11;
        o39 o39Var3;
        boolean z12;
        k27 messageObject;
        go1 go1Var;
        int i6;
        s49 s49Var;
        int i7;
        boolean z13;
        mu1 mu1Var;
        Runnable runnable;
        j47 j47Var;
        int i8;
        la2 la2Var = this;
        ArrayList arrayList3 = la2Var.p;
        boolean isEmpty = arrayList3.isEmpty();
        ArrayList arrayList4 = la2Var.r;
        boolean isEmpty2 = arrayList4.isEmpty();
        ArrayList arrayList5 = la2Var.s;
        boolean isEmpty3 = arrayList5.isEmpty();
        ArrayList arrayList6 = la2Var.q;
        boolean isEmpty4 = arrayList6.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        boolean z14 = la2Var.N;
        o39 o39Var4 = la2Var.G;
        byte b = 1;
        if (z14) {
            z = false;
            for (0; i8 < arrayList6.size(); i8 + 1) {
                if (la2Var.Q) {
                    i8 = ((s49) arrayList6.get(i8)).c() != (o39Var4.getAdapter() == null ? 0 : o39Var4.getAdapter().b()) - 1 ? i8 + 1 : 0;
                    z = true;
                } else {
                    if (((s49) arrayList6.get(i8)).c() != 0) {
                    }
                    z = true;
                }
            }
        } else {
            z = false;
        }
        la2Var.V();
        ArrayList arrayList7 = la2Var.y;
        float f = 1.0f;
        if (z) {
            boolean isEmpty5 = arrayList3.isEmpty();
            boolean isEmpty6 = arrayList4.isEmpty();
            boolean isEmpty7 = arrayList5.isEmpty();
            boolean isEmpty8 = arrayList6.isEmpty();
            if (!isEmpty5 || !isEmpty6 || !isEmpty8 || !isEmpty7) {
                int i9 = 0;
                for (0; i6 < arrayList6.size(); i6 + 1) {
                    View view = ((s49) arrayList6.get(i6)).a;
                    if (view instanceof gb2) {
                        gb2 gb2Var = (gb2) view;
                        i6 = (gb2Var.getCurrentPosition() != null && (gb2Var.getCurrentPosition().l & 1) == 0) ? i6 + 1 : 0;
                    }
                    i9 += ((s49) arrayList6.get(i6)).a.getHeight();
                }
                int size2 = arrayList3.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    la2Var.D((s49) obj);
                }
                arrayList3.clear();
                if (!isEmpty6) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.addAll(arrayList4);
                    arrayList4.clear();
                    int size3 = arrayList8.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj2 = arrayList8.get(i11);
                        i11++;
                        fb3 fb3Var = (fb3) obj2;
                        la2Var.S(fb3Var.a, fb3Var, false);
                    }
                    arrayList8.clear();
                }
                if (!isEmpty8) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList6);
                    arrayList6.clear();
                    int size4 = arrayList9.size();
                    int i12 = 0;
                    while (i12 < size4) {
                        int i13 = i12 + 1;
                        s49 s49Var2 = (s49) arrayList9.get(i12);
                        View view2 = s49Var2.a;
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList7.add(s49Var2);
                        view2.setTranslationY(i9);
                        View view3 = s49Var2.a;
                        view3.setScaleX(f);
                        view3.setScaleY(f);
                        gb2 gb2Var2 = view3 instanceof gb2 ? (gb2) view3 : null;
                        if (gb2Var2 == null || !gb2Var2.getTransitionParams().y0) {
                            view3.setAlpha(f);
                        }
                        mu1 mu1Var2 = la2Var.F;
                        if (mu1Var2 != null) {
                            ArrayList arrayList10 = mu1Var2.K4;
                            if (gb2Var2 != null && arrayList10.contains(gb2Var2.getMessageObject())) {
                                arrayList10.remove(gb2Var2.getMessageObject());
                                ar1 ar1Var = mu1Var2.a0;
                                if (ar1Var.g0 == null || !((j47Var = ar1Var.M0) == null || j47Var.u0)) {
                                    s49Var = s49Var2;
                                } else {
                                    s49Var = s49Var2;
                                    if (System.currentTimeMillis() - ar1Var.N0 > 300) {
                                        z13 = true;
                                        i7 = size4;
                                        ar1Var.N0 = -1L;
                                        if (z13) {
                                            if (k27.Q4(gb2Var2.getMessageObject().k)) {
                                                if (Math.abs(view2.getTranslationY()) < view2.getMeasuredHeight() * 3.0f) {
                                                    new mjc(gb2Var2, mu1Var2.a0, la2Var.G, mu1Var2.ja, la2Var.R).f.start();
                                                }
                                            } else if (gba.o() != 0 && Math.abs(view2.getTranslationY()) < o39Var4.getMeasuredHeight()) {
                                                mu1Var = mu1Var2;
                                                ValueAnimator valueAnimator = new ohb(gb2Var2, mu1Var2, la2Var.G, mu1Var2.ja, la2Var.R).d;
                                                if (valueAnimator != null) {
                                                    valueAnimator.start();
                                                }
                                                ar1 ar1Var2 = mu1Var.a0;
                                                runnable = ar1Var2.g0;
                                                if (runnable != null) {
                                                    gl.r(runnable);
                                                    ar1Var2.h0 = true;
                                                    ar1Var2.g0.run();
                                                    ar1Var2.g0 = null;
                                                }
                                            }
                                            mu1Var = mu1Var2;
                                            ar1 ar1Var22 = mu1Var.a0;
                                            runnable = ar1Var22.g0;
                                            if (runnable != null) {
                                            }
                                        }
                                        animate.translationY(0.0f).setDuration(250L).setInterpolator(la2Var.o).setListener(new ga2((Object) la2Var, (Object) s49Var, view2, (Object) animate, (byte) 0)).start();
                                        i9 = i9;
                                        i12 = i13;
                                        size4 = i7;
                                        f = 1.0f;
                                    }
                                }
                                z13 = false;
                                i7 = size4;
                                ar1Var.N0 = -1L;
                                if (z13) {
                                }
                                animate.translationY(0.0f).setDuration(250L).setInterpolator(la2Var.o).setListener(new ga2((Object) la2Var, (Object) s49Var, view2, (Object) animate, (byte) 0)).start();
                                i9 = i9;
                                i12 = i13;
                                size4 = i7;
                                f = 1.0f;
                            }
                        }
                        s49Var = s49Var2;
                        i7 = size4;
                        animate.translationY(0.0f).setDuration(250L).setInterpolator(la2Var.o).setListener(new ga2((Object) la2Var, (Object) s49Var, view2, (Object) animate, (byte) 0)).start();
                        i9 = i9;
                        i12 = i13;
                        size4 = i7;
                        f = 1.0f;
                    }
                    arrayList9.clear();
                }
            }
        } else {
            boolean isEmpty9 = arrayList3.isEmpty();
            boolean isEmpty10 = arrayList4.isEmpty();
            boolean isEmpty11 = arrayList5.isEmpty();
            boolean isEmpty12 = arrayList6.isEmpty();
            if (!isEmpty9 || !isEmpty10 || !isEmpty12 || !isEmpty11) {
                boolean z15 = (la2Var.U == null || (go1Var = la2Var.T) == null || !((Boolean) go1Var.run()).booleanValue()) ? false : true;
                ArrayList arrayList11 = la2Var.K;
                ArrayList arrayList12 = la2Var.A;
                boolean z16 = z15;
                float f2 = 0.0f;
                ArrayList arrayList13 = la2Var.S;
                if (z16) {
                    LongSparseArray longSparseArray = null;
                    int i14 = 0;
                    j = 0;
                    while (i14 < arrayList3.size()) {
                        s49 s49Var3 = (s49) arrayList3.get(i14);
                        if (arrayList13.contains(s49Var3)) {
                            z10 = isEmpty10;
                            View view4 = s49Var3.a;
                            z11 = isEmpty11;
                            if ((view4 instanceof gb2) && ((gb2) view4).getCurrentMessagesGroup() != null && (messageObject = ((gb2) s49Var3.a).getMessageObject()) != null && messageObject.c1() != 0) {
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                o39Var3 = o39Var4;
                                z12 = isEmpty12;
                                ArrayList arrayList14 = (ArrayList) longSparseArray.get(messageObject.c1());
                                if (arrayList14 == null) {
                                    long c1 = messageObject.c1();
                                    ArrayList arrayList15 = new ArrayList();
                                    longSparseArray.put(c1, arrayList15);
                                    arrayList14 = arrayList15;
                                }
                                arrayList13.remove(s49Var3);
                                arrayList3.remove(i14);
                                i14--;
                                arrayList14.add(s49Var3);
                                i14++;
                                isEmpty12 = z12;
                                isEmpty10 = z10;
                                isEmpty11 = z11;
                                o39Var4 = o39Var3;
                            }
                        } else {
                            z10 = isEmpty10;
                            z11 = isEmpty11;
                        }
                        o39Var3 = o39Var4;
                        z12 = isEmpty12;
                        i14++;
                        isEmpty12 = z12;
                        isEmpty10 = z10;
                        isEmpty11 = z11;
                        o39Var4 = o39Var3;
                    }
                    z2 = isEmpty10;
                    z3 = isEmpty11;
                    o39Var = o39Var4;
                    z4 = isEmpty12;
                    if (longSparseArray != null) {
                        int i15 = 0;
                        z5 = false;
                        while (i15 < longSparseArray.size()) {
                            ArrayList arrayList16 = (ArrayList) longSparseArray.valueAt(i15);
                            if (arrayList16.size() > 0) {
                                View view5 = ((s49) arrayList16.get(0)).a;
                                if (!(view5 instanceof gb2) || (currentMessagesGroup = ((gb2) view5).getCurrentMessagesGroup()) == null || currentMessagesGroup.d.size() <= arrayList16.size()) {
                                    if (w01.a) {
                                        fa4.b("animate remove group impl with thanos");
                                    }
                                    arrayList12.addAll(arrayList16);
                                    ijb ijbVar = (ijb) la2Var.U.run();
                                    for (int i16 = 0; i16 < arrayList16.size(); i16++) {
                                    }
                                    ArrayList arrayList17 = new ArrayList();
                                    i5 = i15;
                                    for (int i17 = 0; i17 < arrayList16.size(); i17++) {
                                        arrayList17.add(((s49) arrayList16.get(i17)).a);
                                    }
                                    jn1 jn1Var = new jn1(la2Var, arrayList17, arrayList16, (byte) 16);
                                    gjb gjbVar = ijbVar.a;
                                    if (gjbVar != null) {
                                        gjbVar.d(arrayList17, jn1Var);
                                        Choreographer.getInstance().postFrameCallback(ijbVar.b);
                                    } else {
                                        ijbVar.c.add(new hjb(arrayList17, jn1Var));
                                    }
                                    arrayList11.add((View) arrayList17.get(0));
                                    o39Var.D0();
                                    z5 = true;
                                    i15 = i5 + 1;
                                } else {
                                    arrayList3.addAll(arrayList16);
                                }
                            }
                            i5 = i15;
                            i15 = i5 + 1;
                        }
                        size = arrayList3.size();
                        boolean z17 = z5;
                        i = 0;
                        while (true) {
                            hashMap = la2Var.J;
                            if (i < size) {
                                break;
                            }
                            Object obj3 = arrayList3.get(i);
                            int i18 = i + 1;
                            s49 s49Var4 = (s49) obj3;
                            boolean z18 = arrayList13.remove(s49Var4) && z16;
                            if (w01.a) {
                                arrayList = arrayList3;
                                i3 = size;
                                fa4.b("animate remove impl ".concat(z18 ? " with thanos" : ""));
                            } else {
                                arrayList = arrayList3;
                                i3 = size;
                            }
                            View view6 = s49Var4.a;
                            arrayList12.add(s49Var4);
                            if (!z18 || (ll1Var = la2Var.U) == null) {
                                i4 = i18;
                                z8 = z4;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view6, (Property<View, Float>) View.ALPHA, view6.getAlpha(), 0.0f);
                                z9 = z18;
                                arrayList2 = arrayList11;
                                ofFloat.setDuration(la2Var.d);
                                ofFloat.addListener(new fa2(la2Var, view6, s49Var4));
                                hashMap.put(s49Var4, ofFloat);
                                ofFloat.start();
                            } else {
                                ijb ijbVar2 = (ijb) ll1Var.run();
                                i4 = i18;
                                jn1 jn1Var2 = new jn1(la2Var, view6, s49Var4, (byte) 17);
                                gjb gjbVar2 = ijbVar2.a;
                                if (gjbVar2 != null) {
                                    gjbVar2.b(1.0f, view6, jn1Var2);
                                    Choreographer.getInstance().postFrameCallback(ijbVar2.b);
                                } else {
                                    ijbVar2.c.add(new hjb(view6, jn1Var2));
                                }
                                arrayList11.add(view6);
                                z8 = z4;
                                z9 = z18;
                                arrayList2 = arrayList11;
                            }
                            o39Var.D0();
                            if (z9) {
                                z17 = true;
                            }
                            arrayList11 = arrayList2;
                            size = i3;
                            arrayList3 = arrayList;
                            i = i4;
                            z4 = z8;
                        }
                        z6 = z4;
                        arrayList3.clear();
                        if (!z2) {
                            ArrayList arrayList18 = new ArrayList();
                            arrayList18.addAll(arrayList4);
                            la2Var.u.add(arrayList18);
                            arrayList4.clear();
                            p6 p6Var = new p6(la2Var, arrayList18, z17, b);
                            if (!la2Var.C || isEmpty9) {
                                p6Var.run();
                            } else {
                                View view7 = ((fb3) arrayList18.get(0)).a.a;
                                WeakHashMap weakHashMap = jdc.a;
                                view7.postOnAnimationDelayed(p6Var, j);
                            }
                        }
                        if (!z3) {
                            ArrayList arrayList19 = new ArrayList();
                            arrayList19.addAll(arrayList5);
                            la2Var.v.add(arrayList19);
                            arrayList5.clear();
                            rld rldVar = new rld((Object) la2Var, (Object) arrayList19, false, (byte) 4);
                            if (!la2Var.C || isEmpty9) {
                                rldVar.run();
                            } else {
                                View view8 = ((eb3) arrayList19.get(0)).a.a;
                                WeakHashMap weakHashMap2 = jdc.a;
                                view8.postOnAnimationDelayed(rldVar, 0L);
                            }
                        }
                        if (!z6) {
                            ArrayList arrayList20 = new ArrayList();
                            arrayList20.addAll(arrayList6);
                            arrayList6.clear();
                            Collections.sort(arrayList20, new sa((byte) 23));
                            int size5 = arrayList20.size();
                            int i19 = 0;
                            while (i19 < size5) {
                                int i20 = i19 + 1;
                                s49 s49Var5 = (s49) arrayList20.get(i19);
                                if (w01.a) {
                                    fa4.b("animate add impl");
                                }
                                View view9 = s49Var5.a;
                                arrayList7.add(s49Var5);
                                if (s49Var5 == la2Var.O) {
                                    view9.setAlpha(1.0f);
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                if (view9 instanceof gb2) {
                                    gb2 gb2Var3 = (gb2) view9;
                                    if (gb2Var3.getAnimationOffsetX() != f2) {
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(gb2Var3, gb2Var3.xd, gb2Var3.getAnimationOffsetX(), f2));
                                    }
                                    gb2Var3.setPivotX(((gb2Var3.getBackgroundDrawableRight() - gb2Var3.getBackgroundDrawableLeft()) / 2.0f) + gb2Var3.getBackgroundDrawableLeft());
                                    view9.animate().translationY(f2).setDuration(la2Var.c).start();
                                } else {
                                    float f3 = f2;
                                    view9.animate().translationX(f3).translationY(f3).setDuration(la2Var.c).start();
                                }
                                long max = (long) ((1.0f - Math.max(0.0f, Math.min(1.0f, view9.getBottom() / o39Var.getMeasuredHeight()))) * 100.0f);
                                if (!(view9 instanceof gb2)) {
                                    i2 = size5;
                                    o39Var2 = o39Var;
                                } else if (s49Var5 == la2Var.O) {
                                    i92 i92Var = la2Var.P;
                                    if (i92Var != null) {
                                        i92Var.h.setAlpha(0.0f);
                                    }
                                    o39Var2 = o39Var;
                                    o39Var2.setClipChildren(false);
                                    final gb2 gb2Var4 = (gb2) view9;
                                    View view10 = (View) la2Var.P.getParent();
                                    float x = view10.getX() + la2Var.P.getX() + la2Var.P.h.getX();
                                    float y = view10.getY() + la2Var.P.getY() + la2Var.P.h.getY();
                                    float x2 = gb2Var4.getX() + o39Var2.getX() + gb2Var4.getPhotoImage().L0;
                                    float y2 = gb2Var4.getY() + o39Var2.getY() + gb2Var4.getPhotoImage().M0;
                                    final float width = la2Var.P.h.getWidth();
                                    final float height = la2Var.P.h.getHeight();
                                    final float f4 = gb2Var4.getPhotoImage().N0;
                                    final float f5 = gb2Var4.getPhotoImage().O0;
                                    final float f6 = x - x2;
                                    final float f7 = y - y2;
                                    final float f8 = gb2Var4.getPhotoImage().L0;
                                    final float f9 = gb2Var4.getPhotoImage().M0;
                                    gb2Var4.getTransitionParams().g0 = true;
                                    gb2Var4.getTransitionParams().K1 = true;
                                    gb2Var4.getPhotoImage().i0(f8 + f6, f8 + f7, width, height);
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: da2
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            gb2 gb2Var5 = gb2.this;
                                            gb2Var5.getTransitionParams().L1 = floatValue;
                                            if (gb2Var5.getTransitionParams().L1 > 1.0f) {
                                                gb2Var5.getTransitionParams().L1 = 1.0f;
                                            }
                                            float f10 = 1.0f - floatValue;
                                            gb2Var5.getPhotoImage().i0((f6 * f10) + f8, (f7 * f10) + f9, (f4 * floatValue) + (width * f10), (f5 * floatValue) + (height * f10));
                                            gb2Var5.invalidate();
                                        }
                                    });
                                    i2 = size5;
                                    la2Var = this;
                                    ofFloat2.addListener(new ea2(la2Var, gb2Var4, f8, f9, f4, f5));
                                    animatorSet.play(ofFloat2);
                                    max = max;
                                    z7 = false;
                                    view9.setAlpha(0.0f);
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), 1.0f));
                                    if (z7) {
                                        view9.setScaleX(1.0f);
                                        view9.setScaleY(1.0f);
                                    } else {
                                        view9.setScaleX(0.9f);
                                        view9.setScaleY(0.9f);
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_Y, view9.getScaleY(), 1.0f));
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_X, view9.getScaleX(), 1.0f));
                                    }
                                    if (s49Var5 != la2Var.O) {
                                        animatorSet.setDuration(350L);
                                        animatorSet.setInterpolator(new OvershootInterpolator());
                                    } else {
                                        animatorSet.setStartDelay(max);
                                        animatorSet.setDuration(250L);
                                    }
                                    animatorSet.addListener(new fa2(la2Var, s49Var5, view9));
                                    hashMap.put(s49Var5, animatorSet);
                                    animatorSet.start();
                                    i19 = i20;
                                    o39Var = o39Var2;
                                    size5 = i2;
                                    f2 = 0.0f;
                                } else {
                                    i2 = size5;
                                    o39Var2 = o39Var;
                                    f27 currentMessagesGroup2 = ((gb2) view9).getCurrentMessagesGroup();
                                    if (currentMessagesGroup2 != null) {
                                        Long valueOf = Long.valueOf(currentMessagesGroup2.a);
                                        HashMap hashMap2 = la2Var.M;
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
                                z7 = true;
                                view9.setAlpha(0.0f);
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), 1.0f));
                                if (z7) {
                                }
                                if (s49Var5 != la2Var.O) {
                                }
                                animatorSet.addListener(new fa2(la2Var, s49Var5, view9));
                                hashMap.put(s49Var5, animatorSet);
                                animatorSet.start();
                                i19 = i20;
                                o39Var = o39Var2;
                                size5 = i2;
                                f2 = 0.0f;
                            }
                            arrayList20.clear();
                        }
                    }
                } else {
                    z2 = isEmpty10;
                    z3 = isEmpty11;
                    o39Var = o39Var4;
                    z4 = isEmpty12;
                    j = 0;
                }
                z5 = false;
                size = arrayList3.size();
                boolean z172 = z5;
                i = 0;
                while (true) {
                    hashMap = la2Var.J;
                    if (i < size) {
                    }
                    arrayList11 = arrayList2;
                    size = i3;
                    arrayList3 = arrayList;
                    i = i4;
                    z4 = z8;
                }
                z6 = z4;
                arrayList3.clear();
                if (!z2) {
                }
                if (!z3) {
                }
                if (!z6) {
                }
            }
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new uz1(la2Var, (byte) 4));
        ofFloat3.setDuration(la2Var.d + 250);
        ofFloat3.start();
    }

    @Override // gb3, hia
    public final void p(s49 s49Var) {
        R(s49Var);
        View view = s49Var.a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof gb2) {
            ((gb2) view).getTransitionParams().i = true;
        }
        this.q.add(s49Var);
    }

    @Override // gb3, hia
    public final boolean q(s49 s49Var, s49 s49Var2, zw8 zw8Var, int i, int i2, int i3, int i4) {
        if (s49Var == s49Var2) {
            return r(s49Var, zw8Var, i, i2, i3, i4);
        }
        View view = s49Var.a;
        float animationOffsetX = view instanceof gb2 ? ((gb2) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(s49Var);
        int i5 = (int) ((i3 - i) - animationOffsetX);
        int i6 = (int) ((i4 - i2) - translationY);
        if (view instanceof gb2) {
            ((gb2) view).setAnimationOffsetX(animationOffsetX);
        } else {
            view.setTranslationX(animationOffsetX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = s49Var2.a;
        R(s49Var2);
        if (view2 instanceof gb2) {
            ((gb2) view2).setAnimationOffsetX(-i5);
        } else {
            view2.setTranslationX(-i5);
        }
        view2.setTranslationY(-i6);
        view2.setAlpha(0.0f);
        this.s.add(new eb3(s49Var, s49Var2, i, i2, i3, i4));
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
    @Override // gb3, hia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(s49 s49Var, zw8 zw8Var, int i, int i2, int i3, int i4) {
        int translationX;
        int i5;
        gb2 gb2Var;
        uk1 uk1Var;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        View view;
        int i6;
        float f6;
        boolean z;
        f27 f27Var;
        int i7;
        boolean O3;
        View view2 = s49Var.a;
        if (view2 instanceof gb2) {
            gb2 gb2Var2 = (gb2) view2;
            translationX = i + ((int) gb2Var2.getAnimationOffsetX());
            i5 = gb2Var2.getTransitionParams().t2 != gb2Var2.getTopMediaOffset() ? (gb2Var2.getTransitionParams().t2 - gb2Var2.getTopMediaOffset()) + i2 : i2;
            gb2Var = gb2Var2;
            uk1Var = null;
        } else if (view2 instanceof uk1) {
            translationX = i + ((int) view2.getTranslationX());
            i5 = i2;
            uk1Var = (uk1) view2;
            gb2Var = null;
        } else {
            translationX = i + ((int) view2.getTranslationX());
            i5 = i2;
            gb2Var = null;
            uk1Var = null;
        }
        int i8 = translationX;
        int translationY = i5 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (gb2Var != null) {
            float f7 = gb2Var.getPhotoImage().L0;
            float f8 = gb2Var.getPhotoImage().M0;
            float f9 = gb2Var.getPhotoImage().N0;
            float f10 = gb2Var.getPhotoImage().O0;
            f = 0.0f;
            int i9 = 0;
            for (int i10 = 4; i9 < i10; i10 = 4) {
                iArr[i9] = gb2Var.getPhotoImage().X0[i9];
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
        R(s49Var);
        int i11 = i3 - i8;
        int i12 = i4 - translationY;
        if (i12 != 0) {
            view2.setTranslationY(-i12);
        }
        float f11 = f2;
        uk1 uk1Var2 = uk1Var;
        ka2 ka2Var = new ka2(s49Var, i8, translationY, i3, i4);
        if (gb2Var != null) {
            nb2 transitionParams = gb2Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.u0;
            Rect rect = transitionParams.E0;
            f27 currentMessagesGroup = gb2Var.getCurrentMessagesGroup();
            if (i11 != 0) {
                gb2Var.setAnimationOffsetX(-i11);
            }
            boolean z2 = zw8Var instanceof ja2;
            o39 o39Var = this.G;
            if (z2) {
                ImageReceiver photoImage = gb2Var.getPhotoImage();
                view = view2;
                ja2 ja2Var = (ja2) zw8Var;
                i6 = i11;
                boolean z3 = (!transitionParams.w0 || ja2Var.h == f || ja2Var.g == f) ? false : true;
                ka2Var.n = z3;
                if (z3) {
                    o39Var.setClipChildren(false);
                    o39Var.invalidate();
                    transitionParams.g0 = true;
                    if (gb2Var.getMessageObject().g4()) {
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
                    float f13 = ja2Var.e;
                    if (f12 == f13 && transitionParams.o0 == ja2Var.f && transitionParams.q0 == ja2Var.h && transitionParams.p0 == ja2Var.g && !transitionParams.C0) {
                        transitionParams.g0 = false;
                        ka2Var.n = false;
                    } else {
                        ka2Var.o = f13;
                        ka2Var.p = ja2Var.f;
                        ka2Var.q = ja2Var.g;
                        ka2Var.r = ja2Var.h;
                        if (currentMessagesGroup != null) {
                            boolean z4 = currentMessagesGroup.c;
                            e27 e27Var = currentMessagesGroup.m;
                            boolean z5 = e27Var.o;
                            if (z4 != z5) {
                                e27Var.n = z5 ? 1.0f : f;
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
                        gb2Var.x3(ka2Var.o, ka2Var.p, ka2Var.q, ka2Var.r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.w0) {
                    if ((O3 = gb2Var.getMessageObject().O3())) {
                        ka2Var.v = gb2Var.getBackgroundDrawableBottom() - rect.bottom;
                        ka2Var.u = gb2Var.getBackgroundDrawableTop() - rect.top;
                        if (gb2Var.Y6 == transitionParams.F0) {
                            ka2Var.s = gb2Var.getBackgroundDrawableLeft() - rect.left;
                            ka2Var.t = gb2Var.getBackgroundDrawableRight() - rect.right;
                        } else if (O3) {
                            ka2Var.s = gb2Var.getBackgroundDrawableLeft() - rect.left;
                        } else {
                            ka2Var.t = gb2Var.getBackgroundDrawableRight() - rect.right;
                        }
                        ka2Var.l = true;
                        transitionParams.x0 = true;
                        transitionParams.h0 = -ka2Var.s;
                        transitionParams.i0 = -ka2Var.t;
                        transitionParams.k0 = -ka2Var.u;
                        transitionParams.j0 = -ka2Var.v;
                        o39Var.setClipChildren(false);
                        o39Var.invalidate();
                    } else {
                        ka2Var.v = gb2Var.getBackgroundDrawableBottom() - rect.bottom;
                        ka2Var.u = gb2Var.getBackgroundDrawableTop() - rect.top;
                        if (gb2Var.Y6 == transitionParams.F0) {
                        }
                        ka2Var.l = true;
                        transitionParams.x0 = true;
                        transitionParams.h0 = -ka2Var.s;
                        transitionParams.i0 = -ka2Var.t;
                        transitionParams.k0 = -ka2Var.u;
                        transitionParams.j0 = -ka2Var.v;
                        o39Var.setClipChildren(false);
                        o39Var.invalidate();
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
                    o39 o39Var2 = (o39) view.getParent();
                    e27 e27Var2 = currentMessagesGroup.m;
                    boolean z6 = true;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    while (i15 < o39Var2.getChildCount()) {
                        View childAt = o39Var2.getChildAt(i15);
                        if (childAt instanceof gb2) {
                            gb2 gb2Var3 = (gb2) childAt;
                            if (gb2Var3.getCurrentMessagesGroup() == currentMessagesGroup && !gb2Var3.getMessageObject().Z) {
                                int backgroundDrawableLeft = gb2Var3.getBackgroundDrawableLeft() + gb2Var3.getLeft();
                                f27Var = currentMessagesGroup;
                                int backgroundDrawableRight = gb2Var3.getBackgroundDrawableRight() + gb2Var3.getLeft();
                                i7 = i15;
                                int backgroundDrawableTop = gb2Var3.getBackgroundDrawableTop() + gb2Var3.getPaddingTop() + gb2Var3.getTop();
                                int backgroundDrawableBottom = gb2Var3.getBackgroundDrawableBottom() + gb2Var3.getPaddingTop() + gb2Var3.getTop();
                                if (i18 == 0 || backgroundDrawableLeft < i18) {
                                    i18 = backgroundDrawableLeft;
                                }
                                if (i19 == 0 || backgroundDrawableRight > i19) {
                                    i19 = backgroundDrawableRight;
                                }
                                if (gb2Var3.getTransitionParams().w0 || e27Var2.p) {
                                    if (i16 == 0 || backgroundDrawableTop < i16) {
                                        i16 = backgroundDrawableTop;
                                    }
                                    if (i17 == 0 || backgroundDrawableBottom > i17) {
                                        i17 = backgroundDrawableBottom;
                                    }
                                    z6 = false;
                                }
                                i15 = i7 + 1;
                                currentMessagesGroup = f27Var;
                            }
                        }
                        f27Var = currentMessagesGroup;
                        i7 = i15;
                        i15 = i7 + 1;
                        currentMessagesGroup = f27Var;
                    }
                    e27Var2.p = false;
                    if (i16 == 0 && i17 == 0 && i18 == 0 && i19 == 0) {
                        ka2Var.j = false;
                        e27Var2.j = false;
                    } else {
                        int i20 = (-i16) + e27Var2.b;
                        ka2Var.f = i20;
                        int i21 = (-i17) + e27Var2.d;
                        ka2Var.g = i21;
                        int i22 = (-i18) + e27Var2.a;
                        ka2Var.h = i22;
                        int i23 = (-i19) + e27Var2.c;
                        ka2Var.i = i23;
                        ka2Var.j = true;
                        e27Var2.j = true;
                        e27Var2.f = i20;
                        e27Var2.h = i21;
                        e27Var2.e = i22;
                        e27Var2.g = i23;
                        e27Var2.n = e27Var2.o ? 1.0f : f;
                        o39Var2.setClipChildren(false);
                        o39Var2.invalidate();
                    }
                    e27Var2.i = z6;
                }
            }
            Integer valueOf = Integer.valueOf(gb2Var.getMessageObject().e1());
            HashMap hashMap = this.H;
            f27 f27Var2 = (f27) hashMap.get(valueOf);
            if (f27Var2 != null) {
                e27 e27Var3 = f27Var2.m;
                hashMap.remove(Integer.valueOf(gb2Var.getMessageObject().e1()));
                if (transitionParams.w0) {
                    int backgroundDrawableLeft2 = gb2Var.getBackgroundDrawableLeft() + gb2Var.getLeft();
                    int backgroundDrawableRight2 = gb2Var.getBackgroundDrawableRight() + gb2Var.getLeft();
                    int backgroundDrawableTop2 = gb2Var.getBackgroundDrawableTop() + gb2Var.getPaddingTop() + gb2Var.getTop();
                    int backgroundDrawableBottom2 = gb2Var.getBackgroundDrawableBottom() + gb2Var.getPaddingTop() + gb2Var.getTop();
                    ka2Var.w = true;
                    transitionParams.x0 = true;
                    ka2Var.s = backgroundDrawableLeft2 - e27Var3.a;
                    ka2Var.t = backgroundDrawableRight2 - e27Var3.c;
                    ka2Var.u = backgroundDrawableTop2 - e27Var3.b;
                    ka2Var.v = backgroundDrawableBottom2 - e27Var3.d;
                    ka2Var.l = false;
                    transitionParams.h0 = (int) ((-r6) - gb2Var.getAnimationOffsetX());
                    transitionParams.i0 = (int) ((-ka2Var.t) - gb2Var.getAnimationOffsetX());
                    transitionParams.k0 = (int) ((-ka2Var.u) - gb2Var.getTranslationY());
                    transitionParams.j0 = (int) ((-ka2Var.v) - gb2Var.getTranslationY());
                    transitionParams.D0 = true;
                    o39Var.setClipChildren(false);
                    o39Var.invalidate();
                } else {
                    e27Var3.i = true;
                }
            }
            c27 c27Var = gb2Var.M;
            if (transitionParams.z0 != (gb2Var.C6 || gb2Var.K || (c27Var != null && (c27Var.l & 8) == 0 && gb2Var.L.i))) {
                z = true;
                ka2Var.k = true;
                f6 = f;
                transitionParams.A0 = f6;
            } else {
                f6 = f;
                z = true;
            }
            boolean a = transitionParams.a();
            ka2Var.m = a;
            if (a) {
                transitionParams.h = z;
                transitionParams.L1 = f6;
            }
            if (i6 == 0 && i12 == 0 && !ka2Var.n && !ka2Var.w && !ka2Var.j && !ka2Var.k && !ka2Var.l && !a) {
                v(s49Var);
                return false;
            }
        } else if (uk1Var2 != null) {
            tk1 transitionParams2 = uk1Var2.getTransitionParams();
            transitionParams2.getClass();
            if (i11 != 0) {
                view2.setTranslationX(-i11);
            }
            boolean a2 = !transitionParams2.a ? false : transitionParams2.d.F0.a();
            ka2Var.m = a2;
            if (a2) {
                transitionParams2.b = true;
                transitionParams2.c = 0.0f;
            }
            if (i11 == 0 && i12 == 0 && !a2) {
                v(s49Var);
                return false;
            }
        } else if (view2 instanceof eq0) {
            ((eq0) view2).setAnimating(true);
        } else if (view2 instanceof g7c) {
            ((g7c) view2).setAnimating(true);
        } else if (i11 != 0) {
            view2.setTranslationX(-i11);
        } else if (i12 == 0) {
            v(s49Var);
            return false;
        }
        this.r.add(ka2Var);
        F();
        return true;
    }

    @Override // gb3, hia
    public final void s(s49 s49Var, zw8 zw8Var) {
        if (w01.a) {
            fa4.b("animate remove");
        }
        super.s(s49Var, zw8Var);
        View view = s49Var.a;
        if (zw8Var != null) {
            int i = zw8Var.c;
            int top = view.getTop();
            int left = view.getLeft() - zw8Var.b;
            if (top - i != 0) {
                view.setTranslationY(-r0);
            }
            if (!(view instanceof gb2)) {
                if (left != 0) {
                    view.setTranslationX(-left);
                    return;
                }
                return;
            }
            gb2 gb2Var = (gb2) view;
            if (left != 0) {
                gb2Var.setAnimationOffsetX(-left);
            }
            if (zw8Var instanceof ja2) {
                ja2 ja2Var = (ja2) zw8Var;
                gb2Var.x3(ja2Var.e, ja2Var.f, ja2Var.g, ja2Var.h);
            }
        }
    }
}
