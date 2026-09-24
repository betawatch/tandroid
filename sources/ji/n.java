package ji;

import ai.x;
import ai.x4;
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
import b2.q0;
import com.google.android.gms.internal.vision.e2;
import gg.k0;
import gg.t;
import i9.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Cells.d1;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.cb1;
import org.telegram.ui.jk;
import org.telegram.ui.pi1;
import org.telegram.ui.wn;
import org.telegram.ui.yg;
import r0.i0;
import s4.c1;
import s4.z0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public abstract class n extends s4.j {
    public static final rr V = new rr(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final wn F;
    public final wl0 G;
    public boolean N;
    public c1 O;
    public ko P;
    public boolean Q;
    public final d6 R;
    public yg T;
    public yg U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public n(wn wnVar, wl0 wl0Var, d6 d6Var) {
        this.R = d6Var;
        this.F = wnVar;
        this.G = wl0Var;
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
            duration.alpha(0.0f).setListener(new k(this, hVar2, duration, view, 0)).start();
        } else {
            hVar2 = hVar;
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(hVar2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new k(this, hVar2, animate, view2, 1)).start();
        }
    }

    @Override // s4.j
    public final void C(c1 c1Var, s4.i iVar) {
        T(c1Var, iVar, false);
    }

    @Override // s4.j
    public final boolean J(s4.h hVar, c1 c1Var) {
        k11 k11Var;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(c1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = c1Var.a;
        if (this.K.contains(view) && (k11Var = (k11) this.U.run()) != null) {
            k11Var.a(view);
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
    /* JADX WARN: Removed duplicated region for block: B:11:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(final c1 c1Var, s4.i iVar, boolean z10) {
        c1 c1Var2;
        t1 t1Var;
        u1 u1Var;
        int i10;
        float f7;
        boolean z11;
        final m mVar;
        final u1 u1Var2;
        t1 t1Var2;
        final int i11;
        final t1 t1Var3;
        ValueAnimator valueAnimator;
        final boolean z12;
        char c10;
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
        final m mVar2 = (m) iVar;
        wn wnVar = this.F;
        if (wnVar != null && (view instanceof h0)) {
            h0 h0Var = (h0) view;
            float translationY = h0Var.getTranslationY();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new h(this, h0Var, translationY, i15));
            animatorSet.playTogether(ofFloat);
        } else {
            if (wnVar == null || !(view instanceof bb)) {
                if (view instanceof u1) {
                    final u1 u1Var3 = (u1) view;
                    final t1 transitionParams = u1Var3.getTransitionParams();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(u1Var3, u1Var3.Be, 0.0f));
                    if (mVar2.n) {
                        u1Var3.U3(mVar2.o, mVar2.p, mVar2.q, mVar2.r);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        final float f10 = u1Var3.getCurrentMessagesGroup() == null ? transitionParams.u0 : u1Var3.getCurrentMessagesGroup().transitionParams.captionEnterProgress;
                        final float P2 = u1Var3.getCurrentMessagesGroup() == null ? u1Var3.P2() : u1Var3.getCurrentMessagesGroup().hasCaption;
                        if (f10 != P2) {
                            valueAnimator = ofFloat2;
                            z12 = true;
                        } else {
                            valueAnimator = ofFloat2;
                            z12 = false;
                        }
                        if (transitionParams.B0) {
                            c10 = 0;
                            iArr = new int[4];
                            for (int i17 = 0; i17 < 4; i17++) {
                                iArr[i17] = u1Var3.getPhotoImage().getRoundRadius()[i17];
                            }
                        } else {
                            c10 = 0;
                            iArr = null;
                        }
                        final int[] iArr2 = iArr;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        i10 = 2;
                        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: ji.a
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                m mVar3 = m.this;
                                float f11 = 1.0f - floatValue;
                                float f12 = mVar3.o * f11;
                                t1 t1Var4 = transitionParams;
                                float f13 = (t1Var4.m0 * floatValue) + f12;
                                float f14 = (t1Var4.n0 * floatValue) + (mVar3.p * f11);
                                float f15 = (t1Var4.o0 * floatValue) + (mVar3.q * f11);
                                float f16 = (t1Var4.p0 * floatValue) + (mVar3.r * f11);
                                boolean z13 = z12;
                                u1 u1Var4 = u1Var3;
                                if (z13) {
                                    float f17 = (P2 * floatValue) + (f10 * f11);
                                    t1Var4.u0 = f17;
                                    if (u1Var4.getCurrentMessagesGroup() != null) {
                                        u1Var4.getCurrentMessagesGroup().transitionParams.captionEnterProgress = f17;
                                    }
                                }
                                if (t1Var4.B0) {
                                    ImageReceiver photoImage = u1Var4.getPhotoImage();
                                    int[] iArr3 = iArr2;
                                    int[] iArr4 = t1Var4.A0;
                                    photoImage.setRoundRadius((int) ((iArr4[0] * floatValue) + (iArr3[0] * f11)), (int) ((iArr4[1] * floatValue) + (iArr3[1] * f11)), (int) ((iArr4[2] * floatValue) + (iArr3[2] * f11)), (int) ((iArr4[3] * floatValue) + (iArr3[3] * f11)));
                                }
                                u1Var4.U3(f13, f14, f15, f16);
                                c1Var.a.invalidate();
                            }
                        };
                        t1Var = transitionParams;
                        u1Var = u1Var3;
                        c1Var2 = c1Var;
                        valueAnimator2.addUpdateListener(animatorUpdateListener);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[c10] = valueAnimator2;
                        animatorSet.playTogether(animatorArr);
                    } else {
                        t1Var = transitionParams;
                        u1Var = u1Var3;
                        c1Var2 = c1Var;
                        i10 = 2;
                    }
                    if (mVar2.v == 0 && mVar2.t == 0 && mVar2.u == 0 && mVar2.s == 0) {
                        f7 = 0.0f;
                        t1Var.k0 = 0.0f;
                        t1Var.l0 = 0.0f;
                        z11 = false;
                    } else {
                        f7 = 0.0f;
                        wl0 wl0Var = this.G;
                        wl0Var.setClipChildren(false);
                        wl0Var.invalidate();
                        float[] fArr = new float[i10];
                        // fill-array-data instruction
                        fArr[0] = 1.0f;
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr);
                        if (mVar2.l) {
                            t1Var.k0 = -mVar2.s;
                            t1Var.l0 = -mVar2.t;
                        } else {
                            t1Var.k0 = (-mVar2.s) - u1Var.getAnimationOffsetX();
                            t1Var.l0 = (-mVar2.t) - u1Var.getAnimationOffsetX();
                        }
                        ofFloat3.addUpdateListener(new x4(mVar2, t1Var, u1Var, 3));
                        z11 = false;
                        animatorSet.playTogether(ofFloat3);
                    }
                    MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        mVar2.j = z11;
                    }
                    if (mVar2.j) {
                        float[] fArr2 = new float[i10];
                        // fill-array-data instruction
                        fArr2[0] = 1.0f;
                        fArr2[1] = 0.0f;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr2);
                        t1 t1Var4 = t1Var;
                        final MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                        final wl0 wl0Var2 = (wl0) view.getParent();
                        final float f11 = currentMessagesGroup.transitionParams.captionEnterProgress;
                        if (currentMessagesGroup.hasCaption) {
                            f7 = 1.0f;
                        }
                        final boolean z13 = f11 != f7;
                        t1Var2 = t1Var4;
                        final float f12 = f7;
                        mVar = mVar2;
                        u1Var2 = u1Var;
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ji.b
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                m mVar3 = mVar;
                                MessageObject.GroupedMessages.TransitionParams transitionParams3 = MessageObject.GroupedMessages.TransitionParams.this;
                                transitionParams3.offsetTop = mVar3.f * floatValue;
                                transitionParams3.offsetBottom = mVar3.g * floatValue;
                                transitionParams3.offsetLeft = mVar3.h * floatValue;
                                transitionParams3.offsetRight = mVar3.i * floatValue;
                                if (z13) {
                                    transitionParams3.captionEnterProgress = e2.z(1.0f, floatValue, f12, f11 * floatValue);
                                }
                                wl0 wl0Var3 = wl0Var2;
                                if (wl0Var3 != null) {
                                    wl0Var3.invalidate();
                                }
                            }
                        });
                        ofFloat4.addListener(new i(transitionParams2));
                        i11 = 0;
                        animatorSet.playTogether(ofFloat4);
                    } else {
                        mVar = mVar2;
                        u1Var2 = u1Var;
                        t1Var2 = t1Var;
                        i11 = 0;
                    }
                    if (mVar.k) {
                        float[] fArr3 = new float[i10];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(fArr3);
                        t1Var3 = t1Var2;
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ji.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i11) {
                                    case 0:
                                        t1Var3.z0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        u1Var2.invalidate();
                                        break;
                                    default:
                                        t1Var3.K1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        u1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i11] = ofFloat5;
                        animatorSet.playTogether(animatorArr2);
                    } else {
                        t1Var3 = t1Var2;
                    }
                    if (mVar.m) {
                        float[] fArr4 = new float[i10];
                        // fill-array-data instruction
                        fArr4[0] = 0.0f;
                        fArr4[1] = 1.0f;
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(fArr4);
                        t1Var3.g = true;
                        ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ji.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i16) {
                                    case 0:
                                        t1Var3.z0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        u1Var2.invalidate();
                                        break;
                                    default:
                                        t1Var3.K1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        u1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        animatorSet.playTogether(ofFloat6);
                    }
                } else {
                    c1Var2 = c1Var;
                    if (view instanceof w0) {
                        w0 w0Var = (w0) view;
                        v0 transitionParams3 = w0Var.getTransitionParams();
                        if (mVar2.m) {
                            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            transitionParams3.b = true;
                            ofFloat7.addUpdateListener(new x(7, transitionParams3, w0Var));
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
                    animatorSet.setInterpolator(rr.g);
                }
                animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
                animatorSet.addListener(new j(this, c1Var2, i14, view));
                animatorSet.start();
                this.J.put(c1Var2, animatorSet);
            }
            bb bbVar = (bb) view;
            float translationY2 = bbVar.getTranslationY();
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat8.addUpdateListener(new h(this, bbVar, translationY2, i16));
            animatorSet.playTogether(ofFloat8);
        }
        c1Var2 = c1Var;
        if (z10) {
        }
        animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
        animatorSet.addListener(new j(this, c1Var2, i14, view));
        animatorSet.start();
        this.J.put(c1Var2, animatorSet);
    }

    public final void U() {
        k11 k11Var;
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
        if (this.K.isEmpty() || (k11Var = (k11) this.U.run()) == null) {
            return;
        }
        ArrayList arrayList2 = k11Var.c;
        if (k11Var.e) {
            return;
        }
        k11Var.e = true;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            j11 j11Var = (j11) obj2;
            Runnable runnable = j11Var.d;
            if (runnable != null) {
                k11.b(runnable);
                j11Var.d = null;
            }
        }
        arrayList2.clear();
        i11 i11Var = k11Var.a;
        if (i11Var != null) {
            i11Var.i();
        }
        Runnable runnable2 = k11Var.d;
        if (runnable2 != null) {
            k11Var.d = null;
            k11.b(runnable2);
        }
    }

    public final void V(MessageObject.GroupedMessages groupedMessages) {
        if (groupedMessages == null) {
            return;
        }
        if (groupedMessages.messages.size() == 0) {
            groupedMessages.transitionParams.drawBackgroundForDeletedItems = true;
            return;
        }
        MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
        if (transitionParams.top == 0 && transitionParams.bottom == 0 && transitionParams.left == 0 && transitionParams.right == 0) {
            wl0 wl0Var = this.G;
            int childCount = wl0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = wl0Var.getChildAt(i10);
                if (childAt instanceof u1) {
                    u1 u1Var = (u1) childAt;
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (u1Var.getTransitionParams().v0 && groupedMessages.messages.contains(messageObject)) {
                        groupedMessages.transitionParams.top = u1Var.getBackgroundDrawableTop() + u1Var.getPaddingTop() + u1Var.getTop();
                        groupedMessages.transitionParams.bottom = u1Var.getBackgroundDrawableBottom() + u1Var.getPaddingTop() + u1Var.getTop();
                        groupedMessages.transitionParams.left = u1Var.getBackgroundDrawableLeft() + u1Var.getLeft();
                        groupedMessages.transitionParams.right = u1Var.getBackgroundDrawableRight() + u1Var.getLeft();
                        groupedMessages.transitionParams.drawCaptionLayout = u1Var.P2();
                        groupedMessages.transitionParams.pinnedTop = u1Var.n3();
                        groupedMessages.transitionParams.pinnedBotton = u1Var.m3();
                        groupedMessages.transitionParams.isNewGroup = true;
                        break;
                    }
                }
                i10++;
            }
        }
        this.I.add(groupedMessages);
    }

    public abstract void W();

    public final void X(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z10 = view instanceof h0;
        wl0 wl0Var = this.G;
        if (z10) {
            int measuredHeight = (wl0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((h0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof bb) {
            int measuredHeight2 = (wl0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((bb) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof u1) {
            u1 u1Var = (u1) view;
            u1Var.getTransitionParams().j();
            u1Var.setAnimationOffsetX(0.0f);
        } else {
            if (!(view instanceof w0)) {
                view.setTranslationX(0.0f);
                return;
            }
            v0 transitionParams = ((w0) view).getTransitionParams();
            transitionParams.b = false;
            transitionParams.c = 1.0f;
        }
    }

    public final void Y(yg ygVar, yg ygVar2) {
        this.T = ygVar;
        this.U = ygVar2;
    }

    public final boolean Z(View view) {
        c1 T;
        if (this.N || (T = this.G.T(view)) == null) {
            return false;
        }
        return this.q.contains(T) || this.y.contains(T);
    }

    @Override // s4.f1, s4.m0
    public final boolean a(c1 c1Var, q0 q0Var, q0 q0Var2) {
        ArrayList arrayList;
        int i10;
        boolean a2 = super.a(c1Var, q0Var, q0Var2);
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

    @Override // s4.j, s4.m0
    public final void f(c1 c1Var) {
        k11 k11Var;
        Animator animator = (Animator) this.J.remove(c1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = c1Var.a;
        if (this.K.contains(view) && (k11Var = (k11) this.U.run()) != null) {
            k11Var.a(view);
        }
        super.f(c1Var);
        X(view);
    }

    @Override // s4.j, s4.m0
    public void g() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((MessageObject.GroupedMessages) obj).transitionParams.isNewGroup = false;
        }
        arrayList.clear();
        U();
        ko koVar = this.P;
        if (koVar != null) {
            koVar.h.setAlpha(1.0f);
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

    @Override // s4.m0
    public final long i() {
        return 250L;
    }

    @Override // s4.m0
    public final long j() {
        return 250L;
    }

    @Override // s4.m0
    public final q0 l(z0 z0Var, c1 c1Var, int i10, List list) {
        q0 l4 = super.l(z0Var, c1Var, i10, list);
        View view = c1Var.a;
        if (!(view instanceof u1)) {
            return l4;
        }
        l lVar = new l();
        lVar.a = l4.a;
        lVar.b = l4.b;
        t1 transitionParams = ((u1) view).getTransitionParams();
        lVar.c = transitionParams.a;
        lVar.d = transitionParams.b;
        lVar.e = transitionParams.c;
        lVar.f = transitionParams.d;
        return lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0478 A[EDGE_INSN: B:229:0x0478->B:230:0x0478 BREAK  A[LOOP:9: B:195:0x03bd->B:220:0x03bd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0200  */
    @Override // s4.j, s4.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        boolean z10;
        boolean z11;
        wl0 wl0Var;
        boolean z12;
        boolean z13;
        int size;
        int i10;
        HashMap hashMap;
        float f7;
        int i11;
        ArrayList arrayList;
        wl0 wl0Var2;
        float f10;
        boolean z14;
        ArrayList arrayList2;
        int i12;
        int i13;
        ArrayList arrayList3;
        boolean z15;
        boolean z16;
        yg ygVar;
        int i14;
        MessageObject.GroupedMessages currentMessagesGroup;
        boolean z17;
        wl0 wl0Var3;
        boolean z18;
        MessageObject messageObject;
        yg ygVar2;
        int i15;
        int i16;
        boolean z19;
        wn wnVar;
        Runnable runnable;
        nf nfVar;
        int i17;
        n nVar = this;
        ArrayList arrayList4 = nVar.p;
        boolean isEmpty = arrayList4.isEmpty();
        ArrayList arrayList5 = nVar.r;
        boolean isEmpty2 = arrayList5.isEmpty();
        ArrayList arrayList6 = nVar.s;
        boolean isEmpty3 = arrayList6.isEmpty();
        ArrayList arrayList7 = nVar.q;
        boolean isEmpty4 = arrayList7.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        boolean z20 = nVar.N;
        wl0 wl0Var4 = nVar.G;
        if (z20) {
            z10 = false;
            while (i17 < arrayList7.size()) {
                if (nVar.Q) {
                    i17 = ((c1) arrayList7.get(i17)).c() != (wl0Var4.getAdapter() == null ? 0 : wl0Var4.getAdapter().h()) - 1 ? i17 + 1 : 0;
                    z10 = true;
                } else {
                    if (((c1) arrayList7.get(i17)).c() != 0) {
                    }
                    z10 = true;
                }
            }
        } else {
            z10 = false;
        }
        nVar.W();
        ArrayList arrayList8 = nVar.y;
        float f11 = 1.0f;
        if (z10) {
            boolean isEmpty5 = arrayList4.isEmpty();
            boolean isEmpty6 = arrayList5.isEmpty();
            boolean isEmpty7 = arrayList6.isEmpty();
            boolean isEmpty8 = arrayList7.isEmpty();
            if (!isEmpty5 || !isEmpty6 || !isEmpty8 || !isEmpty7) {
                int i18 = 0;
                while (i15 < arrayList7.size()) {
                    View view = ((c1) arrayList7.get(i15)).a;
                    if (view instanceof u1) {
                        u1 u1Var = (u1) view;
                        i15 = (u1Var.getCurrentPosition() != null && (u1Var.getCurrentPosition().flags & 1) == 0) ? i15 + 1 : 0;
                    }
                    i18 += ((c1) arrayList7.get(i15)).a.getHeight();
                }
                int size2 = arrayList4.size();
                int i19 = 0;
                while (i19 < size2) {
                    Object obj = arrayList4.get(i19);
                    i19++;
                    nVar.D((c1) obj);
                }
                arrayList4.clear();
                if (!isEmpty6) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList5);
                    arrayList5.clear();
                    int size3 = arrayList9.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        Object obj2 = arrayList9.get(i20);
                        i20++;
                        s4.i iVar = (s4.i) obj2;
                        nVar.T(iVar.a, iVar, false);
                    }
                    arrayList9.clear();
                }
                if (!isEmpty8) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.addAll(arrayList7);
                    arrayList7.clear();
                    int size4 = arrayList10.size();
                    int i21 = 0;
                    while (i21 < size4) {
                        Object obj3 = arrayList10.get(i21);
                        i21++;
                        c1 c1Var = (c1) obj3;
                        View view2 = c1Var.a;
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList8.add(c1Var);
                        view2.setTranslationY(i18);
                        View view3 = c1Var.a;
                        view3.setScaleX(f11);
                        view3.setScaleY(f11);
                        u1 u1Var2 = view3 instanceof u1 ? (u1) view3 : null;
                        if (u1Var2 == null || !u1Var2.getTransitionParams().x0) {
                            view3.setAlpha(f11);
                        }
                        wn wnVar2 = nVar.F;
                        if (wnVar2 != null) {
                            ArrayList arrayList11 = wnVar2.u4;
                            if (u1Var2 != null && arrayList11.contains(u1Var2.getMessageObject())) {
                                arrayList11.remove(u1Var2.getMessageObject());
                                jk jkVar = wnVar2.Y;
                                if (jkVar.f0 == null || !((nfVar = jkVar.L0) == null || nfVar.q0)) {
                                    i16 = size4;
                                } else {
                                    i16 = size4;
                                    if (System.currentTimeMillis() - jkVar.M0 > 300) {
                                        z19 = true;
                                        jkVar.M0 = -1L;
                                        if (z19) {
                                            if (u1Var2.getMessageObject().isVoice()) {
                                                if (Math.abs(view2.getTranslationY()) < view2.getMeasuredHeight() * 3.0f) {
                                                    new pi1(u1Var2, wnVar2.Y, nVar.G, wnVar2.M9, nVar.R).f.start();
                                                }
                                            } else if (SharedConfig.getDevicePerformanceClass() != 0 && Math.abs(view2.getTranslationY()) < wl0Var4.getMeasuredHeight()) {
                                                wnVar = wnVar2;
                                                ValueAnimator valueAnimator = new cb1(u1Var2, wnVar2, nVar.G, wnVar2.M9, nVar.R).d;
                                                if (valueAnimator != null) {
                                                    valueAnimator.start();
                                                }
                                                jk jkVar2 = wnVar.Y;
                                                runnable = jkVar2.f0;
                                                if (runnable != null) {
                                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                                    jkVar2.g0 = true;
                                                    jkVar2.f0.run();
                                                    jkVar2.f0 = null;
                                                    animate.translationY(0.0f).setDuration(250L).setInterpolator(nVar.o).setListener(new k0(nVar, c1Var, view2, animate)).start();
                                                    size4 = i16;
                                                    f11 = 1.0f;
                                                }
                                            }
                                            wnVar = wnVar2;
                                            jk jkVar22 = wnVar.Y;
                                            runnable = jkVar22.f0;
                                            if (runnable != null) {
                                            }
                                        }
                                        animate.translationY(0.0f).setDuration(250L).setInterpolator(nVar.o).setListener(new k0(nVar, c1Var, view2, animate)).start();
                                        size4 = i16;
                                        f11 = 1.0f;
                                    }
                                }
                                z19 = false;
                                jkVar.M0 = -1L;
                                if (z19) {
                                }
                                animate.translationY(0.0f).setDuration(250L).setInterpolator(nVar.o).setListener(new k0(nVar, c1Var, view2, animate)).start();
                                size4 = i16;
                                f11 = 1.0f;
                            }
                        }
                        i16 = size4;
                        animate.translationY(0.0f).setDuration(250L).setInterpolator(nVar.o).setListener(new k0(nVar, c1Var, view2, animate)).start();
                        size4 = i16;
                        f11 = 1.0f;
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
                boolean z21 = (nVar.U == null || (ygVar2 = nVar.T) == null || !((Boolean) ygVar2.run()).booleanValue()) ? false : true;
                ArrayList arrayList12 = nVar.K;
                ArrayList arrayList13 = nVar.A;
                char c10 = 1;
                ArrayList arrayList14 = nVar.S;
                if (z21) {
                    LongSparseArray longSparseArray = null;
                    int i22 = 0;
                    while (i22 < arrayList4.size()) {
                        c1 c1Var2 = (c1) arrayList4.get(i22);
                        if (arrayList14.contains(c1Var2)) {
                            z17 = isEmpty10;
                            View view4 = c1Var2.a;
                            z18 = isEmpty11;
                            if (!(view4 instanceof u1) || ((u1) view4).getCurrentMessagesGroup() == null || (messageObject = ((u1) c1Var2.a).getMessageObject()) == null || messageObject.getGroupId() == 0) {
                                wl0Var3 = wl0Var4;
                            } else {
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                wl0Var3 = wl0Var4;
                                ArrayList arrayList15 = (ArrayList) longSparseArray.get(messageObject.getGroupId());
                                if (arrayList15 == null) {
                                    long groupId = messageObject.getGroupId();
                                    ArrayList arrayList16 = new ArrayList();
                                    longSparseArray.put(groupId, arrayList16);
                                    arrayList15 = arrayList16;
                                }
                                arrayList14.remove(c1Var2);
                                arrayList4.remove(i22);
                                i22--;
                                arrayList15.add(c1Var2);
                            }
                        } else {
                            z17 = isEmpty10;
                            wl0Var3 = wl0Var4;
                            z18 = isEmpty11;
                        }
                        i22++;
                        isEmpty10 = z17;
                        isEmpty11 = z18;
                        wl0Var4 = wl0Var3;
                    }
                    z11 = isEmpty10;
                    wl0Var = wl0Var4;
                    z12 = isEmpty11;
                    if (longSparseArray != null) {
                        int i23 = 0;
                        z13 = false;
                        while (i23 < longSparseArray.size()) {
                            ArrayList arrayList17 = (ArrayList) longSparseArray.valueAt(i23);
                            if (arrayList17.size() > 0) {
                                View view5 = ((c1) arrayList17.get(0)).a;
                                if (!(view5 instanceof u1) || (currentMessagesGroup = ((u1) view5).getCurrentMessagesGroup()) == null || currentMessagesGroup.messages.size() <= arrayList17.size()) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("animate remove group impl with thanos");
                                    }
                                    arrayList13.addAll(arrayList17);
                                    k11 k11Var = (k11) nVar.U.run();
                                    for (int i24 = 0; i24 < arrayList17.size(); i24++) {
                                    }
                                    ArrayList arrayList18 = new ArrayList();
                                    i14 = i23;
                                    for (int i25 = 0; i25 < arrayList17.size(); i25++) {
                                        arrayList18.add(((c1) arrayList17.get(i25)).a);
                                    }
                                    t tVar = new t(nVar, arrayList18, arrayList17, 19);
                                    i11 i11Var = k11Var.a;
                                    if (i11Var != null) {
                                        i11Var.f(arrayList18, tVar);
                                        Choreographer.getInstance().postFrameCallback(k11Var.b);
                                    } else {
                                        k11Var.c.add(new j11(arrayList18, tVar));
                                    }
                                    arrayList12.add((View) arrayList18.get(0));
                                    wl0Var.B0();
                                    z13 = true;
                                    i23 = i14 + 1;
                                } else {
                                    arrayList4.addAll(arrayList17);
                                }
                            }
                            i14 = i23;
                            i23 = i14 + 1;
                        }
                        size = arrayList4.size();
                        boolean z22 = z13;
                        i10 = 0;
                        while (true) {
                            hashMap = nVar.J;
                            if (i10 < size) {
                                break;
                            }
                            Object obj4 = arrayList4.get(i10);
                            int i26 = i10 + 1;
                            c1 c1Var3 = (c1) obj4;
                            boolean z23 = arrayList14.remove(c1Var3) && z21;
                            if (BuildVars.LOGS_ENABLED) {
                                arrayList2 = arrayList4;
                                i12 = size;
                                FileLog.d("animate remove impl ".concat(z23 ? " with thanos" : ""));
                            } else {
                                arrayList2 = arrayList4;
                                i12 = size;
                            }
                            View view6 = c1Var3.a;
                            arrayList13.add(c1Var3);
                            if (!z23 || (ygVar = nVar.U) == null) {
                                i13 = i26;
                                arrayList3 = arrayList13;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view6, (Property<View, Float>) View.ALPHA, view6.getAlpha(), 0.0f);
                                z15 = z21;
                                z16 = z23;
                                ofFloat.setDuration(nVar.d);
                                ofFloat.addListener(new f(nVar, view6, c1Var3));
                                hashMap.put(c1Var3, ofFloat);
                                ofFloat.start();
                            } else {
                                k11 k11Var2 = (k11) ygVar.run();
                                i13 = i26;
                                t tVar2 = new t(nVar, view6, c1Var3, 20);
                                i11 i11Var2 = k11Var2.a;
                                if (i11Var2 != null) {
                                    i11Var2.e(view6, 1.0f, tVar2);
                                    Choreographer.getInstance().postFrameCallback(k11Var2.b);
                                } else {
                                    k11Var2.c.add(new j11(view6, tVar2));
                                }
                                arrayList12.add(view6);
                                arrayList3 = arrayList13;
                                z15 = z21;
                                z16 = z23;
                            }
                            wl0Var.B0();
                            z21 = z15;
                            size = i12;
                            arrayList4 = arrayList2;
                            i10 = i13;
                            if (z16) {
                                arrayList13 = arrayList3;
                                z22 = true;
                            } else {
                                arrayList13 = arrayList3;
                            }
                        }
                        arrayList4.clear();
                        if (!z11) {
                            ArrayList arrayList19 = new ArrayList();
                            arrayList19.addAll(arrayList5);
                            nVar.u.add(arrayList19);
                            arrayList5.clear();
                            g gVar = new g(nVar, arrayList19, z22, 0);
                            if (!nVar.C || isEmpty9) {
                                gVar.run();
                            } else {
                                View view7 = ((s4.i) arrayList19.get(0)).a.a;
                                WeakHashMap weakHashMap = i0.a;
                                view7.postOnAnimationDelayed(gVar, 0L);
                            }
                        }
                        if (!z12) {
                            ArrayList arrayList20 = new ArrayList();
                            arrayList20.addAll(arrayList6);
                            nVar.v.add(arrayList20);
                            arrayList6.clear();
                            s sVar = new s(nVar, arrayList20, false, 18);
                            if (!nVar.C || isEmpty9) {
                                sVar.run();
                            } else {
                                View view8 = ((s4.h) arrayList20.get(0)).a.a;
                                WeakHashMap weakHashMap2 = i0.a;
                                view8.postOnAnimationDelayed(sVar, 0L);
                            }
                        }
                        if (!isEmpty12) {
                            ArrayList arrayList21 = new ArrayList();
                            arrayList21.addAll(arrayList7);
                            arrayList7.clear();
                            Collections.sort(arrayList21, new a4.e(19));
                            int size5 = arrayList21.size();
                            int i27 = 0;
                            while (i27 < size5) {
                                int i28 = i27 + 1;
                                c1 c1Var4 = (c1) arrayList21.get(i27);
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("animate add impl");
                                }
                                View view9 = c1Var4.a;
                                arrayList8.add(c1Var4);
                                if (c1Var4 == nVar.O) {
                                    view9.setAlpha(1.0f);
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                if (view9 instanceof u1) {
                                    u1 u1Var3 = (u1) view9;
                                    if (u1Var3.getAnimationOffsetX() != 0.0f) {
                                        d1 d1Var = u1Var3.Be;
                                        float[] fArr = new float[2];
                                        fArr[0] = u1Var3.getAnimationOffsetX();
                                        fArr[c10] = 0.0f;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(u1Var3, d1Var, fArr));
                                    }
                                    u1Var3.setPivotX(((u1Var3.getBackgroundDrawableRight() - u1Var3.getBackgroundDrawableLeft()) / 2.0f) + u1Var3.getBackgroundDrawableLeft());
                                    f7 = 0.0f;
                                    view9.animate().translationY(0.0f).setDuration(nVar.c).start();
                                } else {
                                    f7 = 0.0f;
                                    view9.animate().translationX(0.0f).translationY(0.0f).setDuration(nVar.c).start();
                                }
                                long max = (long) ((1.0f - Math.max(f7, Math.min(1.0f, view9.getBottom() / wl0Var.getMeasuredHeight()))) * 100.0f);
                                if (!(view9 instanceof u1)) {
                                    i11 = size5;
                                    arrayList = arrayList21;
                                    wl0Var2 = wl0Var;
                                    f10 = 1.0f;
                                } else if (c1Var4 == nVar.O) {
                                    ko koVar = nVar.P;
                                    if (koVar != null) {
                                        koVar.h.setAlpha(0.0f);
                                    }
                                    wl0Var2 = wl0Var;
                                    wl0Var2.setClipChildren(false);
                                    final u1 u1Var4 = (u1) view9;
                                    View view10 = (View) nVar.P.getParent();
                                    float x10 = view10.getX() + nVar.P.getX() + nVar.P.h.getX();
                                    float y3 = view10.getY() + nVar.P.getY() + nVar.P.h.getY();
                                    float x11 = u1Var4.getX() + wl0Var2.getX() + u1Var4.getPhotoImage().getImageX();
                                    float y10 = u1Var4.getY() + wl0Var2.getY() + u1Var4.getPhotoImage().getImageY();
                                    final float width = nVar.P.h.getWidth();
                                    final float height = nVar.P.h.getHeight();
                                    final float imageWidth = u1Var4.getPhotoImage().getImageWidth();
                                    final float imageHeight = u1Var4.getPhotoImage().getImageHeight();
                                    final float f12 = x10 - x11;
                                    final float f13 = y3 - y10;
                                    final float imageX = u1Var4.getPhotoImage().getImageX();
                                    final float imageY = u1Var4.getPhotoImage().getImageY();
                                    u1Var4.getTransitionParams().f0 = true;
                                    u1Var4.getTransitionParams().J1 = true;
                                    u1Var4.getPhotoImage().setImageCoords(imageX + f12, imageX + f13, width, height);
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ji.d
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            u1 u1Var5 = u1.this;
                                            u1Var5.getTransitionParams().K1 = floatValue;
                                            if (u1Var5.getTransitionParams().K1 > 1.0f) {
                                                u1Var5.getTransitionParams().K1 = 1.0f;
                                            }
                                            float f14 = 1.0f - floatValue;
                                            u1Var5.getPhotoImage().setImageCoords((f12 * f14) + imageX, (f13 * f14) + imageY, (imageWidth * floatValue) + (width * f14), (imageHeight * floatValue) + (height * f14));
                                            u1Var5.invalidate();
                                        }
                                    });
                                    i11 = size5;
                                    arrayList = arrayList21;
                                    f10 = 1.0f;
                                    nVar = this;
                                    ofFloat2.addListener(new e(nVar, u1Var4, imageX, imageY, imageWidth, imageHeight));
                                    animatorSet.play(ofFloat2);
                                    max = max;
                                    z14 = false;
                                    view9.setAlpha(0.0f);
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), f10));
                                    if (z14) {
                                        view9.setScaleX(f10);
                                        view9.setScaleY(f10);
                                    } else {
                                        view9.setScaleX(0.9f);
                                        view9.setScaleY(0.9f);
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_Y, view9.getScaleY(), f10));
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_X, view9.getScaleX(), f10));
                                    }
                                    if (c1Var4 != nVar.O) {
                                        animatorSet.setDuration(350L);
                                        animatorSet.setInterpolator(new OvershootInterpolator());
                                    } else {
                                        animatorSet.setStartDelay(max);
                                        animatorSet.setDuration(250L);
                                    }
                                    animatorSet.addListener(new f(nVar, c1Var4, view9));
                                    hashMap.put(c1Var4, animatorSet);
                                    animatorSet.start();
                                    i27 = i28;
                                    wl0Var = wl0Var2;
                                    size5 = i11;
                                    arrayList21 = arrayList;
                                    c10 = 1;
                                } else {
                                    i11 = size5;
                                    arrayList = arrayList21;
                                    wl0Var2 = wl0Var;
                                    f10 = 1.0f;
                                    MessageObject.GroupedMessages currentMessagesGroup2 = ((u1) view9).getCurrentMessagesGroup();
                                    if (currentMessagesGroup2 != null) {
                                        Long valueOf = Long.valueOf(currentMessagesGroup2.groupId);
                                        HashMap hashMap2 = nVar.M;
                                        Long l4 = (Long) hashMap2.get(valueOf);
                                        if (l4 == null) {
                                            hashMap2.put(Long.valueOf(currentMessagesGroup2.groupId), Long.valueOf(max));
                                        } else {
                                            max = l4.longValue();
                                            if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
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
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), f10));
                                if (z14) {
                                }
                                if (c1Var4 != nVar.O) {
                                }
                                animatorSet.addListener(new f(nVar, c1Var4, view9));
                                hashMap.put(c1Var4, animatorSet);
                                animatorSet.start();
                                i27 = i28;
                                wl0Var = wl0Var2;
                                size5 = i11;
                                arrayList21 = arrayList;
                                c10 = 1;
                            }
                            arrayList21.clear();
                        }
                    }
                } else {
                    z11 = isEmpty10;
                    wl0Var = wl0Var4;
                    z12 = isEmpty11;
                }
                z13 = false;
                size = arrayList4.size();
                boolean z222 = z13;
                i10 = 0;
                while (true) {
                    hashMap = nVar.J;
                    if (i10 < size) {
                    }
                }
                arrayList4.clear();
                if (!z11) {
                }
                if (!z12) {
                }
                if (!isEmpty12) {
                }
            }
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new ai.a(nVar, 29));
        ofFloat3.setDuration(nVar.d + 250);
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
        } else if (view instanceof u1) {
            ((u1) view).getTransitionParams().h = true;
        }
        this.q.add(c1Var);
    }

    @Override // s4.j, s4.f1
    public final boolean q(c1 c1Var, c1 c1Var2, q0 q0Var, int i10, int i11, int i12, int i13) {
        if (c1Var == c1Var2) {
            return r(c1Var, q0Var, i10, i11, i12, i13);
        }
        View view = c1Var.a;
        float animationOffsetX = view instanceof u1 ? ((u1) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(c1Var);
        int i14 = (int) ((i12 - i10) - animationOffsetX);
        int i15 = (int) ((i13 - i11) - translationY);
        if (view instanceof u1) {
            ((u1) view).setAnimationOffsetX(animationOffsetX);
        } else {
            view.setTranslationX(animationOffsetX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = c1Var2.a;
        R(c1Var2);
        if (view2 instanceof u1) {
            ((u1) view2).setAnimationOffsetX(-i14);
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
    public final boolean r(c1 c1Var, q0 q0Var, int i10, int i11, int i12, int i13) {
        int translationX;
        int i14;
        u1 u1Var;
        w0 w0Var;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        View view;
        int i15;
        float f14;
        boolean z10;
        MessageObject.GroupedMessages groupedMessages;
        int i16;
        boolean isOutOwner;
        View view2 = c1Var.a;
        if (view2 instanceof u1) {
            u1 u1Var2 = (u1) view2;
            translationX = i10 + ((int) u1Var2.getAnimationOffsetX());
            i14 = u1Var2.getTransitionParams().s2 != u1Var2.getTopMediaOffset() ? (u1Var2.getTransitionParams().s2 - u1Var2.getTopMediaOffset()) + i11 : i11;
            u1Var = u1Var2;
            w0Var = null;
        } else if (view2 instanceof w0) {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            w0Var = (w0) view2;
            u1Var = null;
        } else {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            u1Var = null;
            w0Var = null;
        }
        int i17 = translationX;
        int translationY = i14 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (u1Var != null) {
            float imageX = u1Var.getPhotoImage().getImageX();
            float imageY = u1Var.getPhotoImage().getImageY();
            f11 = u1Var.getPhotoImage().getImageWidth();
            float imageHeight = u1Var.getPhotoImage().getImageHeight();
            f7 = 0.0f;
            for (int i18 = 0; i18 < 4; i18++) {
                iArr[i18] = u1Var.getPhotoImage().getRoundRadius()[i18];
            }
            f12 = imageX;
            f10 = imageHeight;
            f13 = imageY;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        R(c1Var);
        int i19 = i12 - i17;
        int i20 = i13 - translationY;
        if (i20 != 0) {
            view2.setTranslationY(-i20);
        }
        float f15 = f10;
        w0 w0Var2 = w0Var;
        float f16 = f11;
        m mVar = new m(c1Var, i17, translationY, i12, i13);
        if (u1Var != null) {
            t1 transitionParams = u1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.t0;
            Rect rect = transitionParams.D0;
            MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
            if (i19 != 0) {
                u1Var.setAnimationOffsetX(-i19);
            }
            boolean z11 = q0Var instanceof l;
            wl0 wl0Var = this.G;
            if (z11) {
                ImageReceiver photoImage = u1Var.getPhotoImage();
                view = view2;
                l lVar = (l) q0Var;
                i15 = i19;
                boolean z12 = (!transitionParams.v0 || lVar.f == f7 || lVar.e == f7) ? false : true;
                mVar.n = z12;
                if (z12) {
                    wl0Var.setClipChildren(false);
                    wl0Var.invalidate();
                    transitionParams.f0 = true;
                    if (u1Var.getMessageObject().isRoundVideo()) {
                        transitionParams.m0 = f12;
                        transitionParams.n0 = f13;
                        transitionParams.o0 = f16;
                        transitionParams.p0 = f15;
                        transitionParams.A0 = iArr;
                    } else {
                        transitionParams.m0 = photoImage.getImageX();
                        transitionParams.n0 = photoImage.getImageY();
                        transitionParams.o0 = photoImage.getImageWidth();
                        transitionParams.p0 = photoImage.getImageHeight();
                        transitionParams.A0 = photoImage.getRoundRadius();
                    }
                    transitionParams.B0 = false;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= 4) {
                            break;
                        }
                        if (iArr2[i21] != transitionParams.A0[i21]) {
                            transitionParams.B0 = true;
                            break;
                        }
                        i21++;
                    }
                    float f17 = transitionParams.m0;
                    float f18 = lVar.c;
                    if (f17 == f18 && transitionParams.n0 == lVar.d && transitionParams.p0 == lVar.f && transitionParams.o0 == lVar.e && !transitionParams.B0) {
                        transitionParams.f0 = false;
                        mVar.n = false;
                    } else {
                        mVar.o = f18;
                        mVar.p = lVar.d;
                        mVar.q = lVar.e;
                        mVar.r = lVar.f;
                        if (currentMessagesGroup != null) {
                            boolean z13 = currentMessagesGroup.hasCaption;
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            boolean z14 = transitionParams2.drawCaptionLayout;
                            if (z13 != z14) {
                                transitionParams2.captionEnterProgress = z14 ? 1.0f : 0.0f;
                            }
                        }
                        if (transitionParams.B0) {
                            if (transitionParams.A0 == photoImage.getRoundRadius()) {
                                transitionParams.A0 = new int[4];
                                for (int i22 = 0; i22 < 4; i22++) {
                                    transitionParams.A0[i22] = photoImage.getRoundRadius()[i22];
                                }
                            }
                            photoImage.setRoundRadius(iArr2);
                        }
                        u1Var.U3(mVar.o, mVar.p, mVar.q, mVar.r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.v0 && (((isOutOwner = u1Var.getMessageObject().isOutOwner()) && rect.left != u1Var.getBackgroundDrawableLeft()) || ((!isOutOwner && rect.right != u1Var.getBackgroundDrawableRight()) || rect.top != u1Var.getBackgroundDrawableTop() || rect.bottom != u1Var.getBackgroundDrawableBottom()))) {
                    mVar.v = u1Var.getBackgroundDrawableBottom() - rect.bottom;
                    mVar.u = u1Var.getBackgroundDrawableTop() - rect.top;
                    if (u1Var.G8 != transitionParams.E0) {
                        mVar.s = u1Var.getBackgroundDrawableLeft() - rect.left;
                        mVar.t = u1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (isOutOwner) {
                        mVar.s = u1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        mVar.t = u1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    mVar.l = true;
                    transitionParams.w0 = true;
                    transitionParams.g0 = -mVar.s;
                    transitionParams.h0 = -mVar.t;
                    transitionParams.j0 = -mVar.u;
                    transitionParams.i0 = -mVar.v;
                    wl0Var.setClipChildren(false);
                    wl0Var.invalidate();
                }
            } else {
                view = view2;
                i15 = i19;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    wl0 wl0Var2 = (wl0) view.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                    boolean z15 = true;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    while (i23 < wl0Var2.getChildCount()) {
                        View childAt = wl0Var2.getChildAt(i23);
                        if (childAt instanceof u1) {
                            u1 u1Var3 = (u1) childAt;
                            if (u1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !u1Var3.getMessageObject().deleted) {
                                int backgroundDrawableLeft = u1Var3.getBackgroundDrawableLeft() + u1Var3.getLeft();
                                groupedMessages = currentMessagesGroup;
                                int backgroundDrawableRight = u1Var3.getBackgroundDrawableRight() + u1Var3.getLeft();
                                i16 = i23;
                                int backgroundDrawableTop = u1Var3.getBackgroundDrawableTop() + u1Var3.getPaddingTop() + u1Var3.getTop();
                                int backgroundDrawableBottom = u1Var3.getBackgroundDrawableBottom() + u1Var3.getPaddingTop() + u1Var3.getTop();
                                if (i26 == 0 || backgroundDrawableLeft < i26) {
                                    i26 = backgroundDrawableLeft;
                                }
                                if (i27 == 0 || backgroundDrawableRight > i27) {
                                    i27 = backgroundDrawableRight;
                                }
                                if (u1Var3.getTransitionParams().v0 || transitionParams3.isNewGroup) {
                                    if (i24 == 0 || backgroundDrawableTop < i24) {
                                        i24 = backgroundDrawableTop;
                                    }
                                    if (i25 == 0 || backgroundDrawableBottom > i25) {
                                        i25 = backgroundDrawableBottom;
                                    }
                                    z15 = false;
                                }
                                i23 = i16 + 1;
                                currentMessagesGroup = groupedMessages;
                            }
                        }
                        groupedMessages = currentMessagesGroup;
                        i16 = i23;
                        i23 = i16 + 1;
                        currentMessagesGroup = groupedMessages;
                    }
                    transitionParams3.isNewGroup = false;
                    if (i24 == 0 && i25 == 0 && i26 == 0 && i27 == 0) {
                        mVar.j = false;
                        transitionParams3.backgroundChangeBounds = false;
                    } else {
                        int i28 = (-i24) + transitionParams3.top;
                        mVar.f = i28;
                        int i29 = (-i25) + transitionParams3.bottom;
                        mVar.g = i29;
                        int i30 = (-i26) + transitionParams3.left;
                        mVar.h = i30;
                        int i31 = (-i27) + transitionParams3.right;
                        mVar.i = i31;
                        mVar.j = true;
                        transitionParams3.backgroundChangeBounds = true;
                        transitionParams3.offsetTop = i28;
                        transitionParams3.offsetBottom = i29;
                        transitionParams3.offsetLeft = i30;
                        transitionParams3.offsetRight = i31;
                        transitionParams3.captionEnterProgress = transitionParams3.drawCaptionLayout ? 1.0f : 0.0f;
                        wl0Var2.setClipChildren(false);
                        wl0Var2.invalidate();
                    }
                    transitionParams3.drawBackgroundForDeletedItems = z15;
                }
            }
            Integer valueOf = Integer.valueOf(u1Var.getMessageObject().getId());
            HashMap hashMap = this.H;
            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hashMap.get(valueOf);
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                hashMap.remove(Integer.valueOf(u1Var.getMessageObject().getId()));
                if (transitionParams.v0) {
                    int backgroundDrawableLeft2 = u1Var.getBackgroundDrawableLeft() + u1Var.getLeft();
                    int backgroundDrawableRight2 = u1Var.getBackgroundDrawableRight() + u1Var.getLeft();
                    int backgroundDrawableTop2 = u1Var.getBackgroundDrawableTop() + u1Var.getPaddingTop() + u1Var.getTop();
                    int backgroundDrawableBottom2 = u1Var.getBackgroundDrawableBottom() + u1Var.getPaddingTop() + u1Var.getTop();
                    mVar.w = true;
                    transitionParams.w0 = true;
                    mVar.s = backgroundDrawableLeft2 - transitionParams4.left;
                    mVar.t = backgroundDrawableRight2 - transitionParams4.right;
                    mVar.u = backgroundDrawableTop2 - transitionParams4.top;
                    mVar.v = backgroundDrawableBottom2 - transitionParams4.bottom;
                    mVar.l = false;
                    transitionParams.g0 = (int) ((-r6) - u1Var.getAnimationOffsetX());
                    transitionParams.h0 = (int) ((-mVar.t) - u1Var.getAnimationOffsetX());
                    transitionParams.j0 = (int) ((-mVar.u) - u1Var.getTranslationY());
                    transitionParams.i0 = (int) ((-mVar.v) - u1Var.getTranslationY());
                    transitionParams.C0 = true;
                    wl0Var.setClipChildren(false);
                    wl0Var.invalidate();
                } else {
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition = u1Var.L;
            if (transitionParams.y0 != (u1Var.k8 || u1Var.J || (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && u1Var.K.isDocuments))) {
                z10 = true;
                mVar.k = true;
                f14 = 0.0f;
                transitionParams.z0 = 0.0f;
            } else {
                f14 = 0.0f;
                z10 = true;
            }
            boolean f19 = transitionParams.f();
            mVar.m = f19;
            if (f19) {
                transitionParams.g = z10;
                transitionParams.K1 = f14;
            }
            if (i15 == 0 && i20 == 0 && !mVar.n && !mVar.w && !mVar.j && !mVar.k && !mVar.l && !f19) {
                v(c1Var);
                return false;
            }
        } else if (w0Var2 != null) {
            v0 transitionParams5 = w0Var2.getTransitionParams();
            transitionParams5.getClass();
            if (i19 != 0) {
                view2.setTranslationX(-i19);
            }
            boolean a2 = !transitionParams5.a ? false : transitionParams5.d.C0.a();
            mVar.m = a2;
            if (a2) {
                transitionParams5.b = true;
                transitionParams5.c = 0.0f;
            }
            if (i19 == 0 && i20 == 0 && !a2) {
                v(c1Var);
                return false;
            }
        } else if (view2 instanceof h0) {
            ((h0) view2).setAnimating(true);
        } else if (view2 instanceof bb) {
            ((bb) view2).setAnimating(true);
        } else {
            if (i19 == 0 && i20 == 0) {
                v(c1Var);
                return false;
            }
            if (i19 != 0) {
                view2.setTranslationX(-i19);
            }
        }
        this.r.add(mVar);
        F();
        return true;
    }

    @Override // s4.j, s4.f1
    public final void s(c1 c1Var, q0 q0Var) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        super.s(c1Var, q0Var);
        View view = c1Var.a;
        if (q0Var != null) {
            int i10 = q0Var.b;
            int top = view.getTop();
            int left = view.getLeft() - q0Var.a;
            if (top - i10 != 0) {
                view.setTranslationY(-r1);
            }
            if (!(view instanceof u1)) {
                if (left != 0) {
                    view.setTranslationX(-left);
                    return;
                }
                return;
            }
            u1 u1Var = (u1) view;
            if (left != 0) {
                u1Var.setAnimationOffsetX(-left);
            }
            if (q0Var instanceof l) {
                l lVar = (l) q0Var;
                u1Var.U3(lVar.c, lVar.d, lVar.e, lVar.f);
            }
        }
    }
}
