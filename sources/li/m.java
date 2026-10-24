package li;

import ah.l0;
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
import ci.n3;
import com.google.android.gms.internal.play_billing.k3;
import ei.i6;
import hg.j0;
import ig.d2;
import j9.u;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.g0;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.w11;
import org.telegram.ui.Components.x11;
import org.telegram.ui.Components.y11;
import org.telegram.ui.ea1;
import org.telegram.ui.gk;
import org.telegram.ui.rh1;
import org.telegram.ui.sn;
import org.telegram.ui.tg;
import r0.i0;
import s4.b1;
import s4.y0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public abstract class m extends s4.k {
    public static final bs V = new bs(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final sn F;
    public final mm0 G;
    public boolean N;
    public b1 O;
    public to P;
    public boolean Q;
    public final g6 R;
    public tg T;
    public tg U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public m(sn snVar, mm0 mm0Var, g6 g6Var) {
        this.R = g6Var;
        this.F = snVar;
        this.G = mm0Var;
        this.o = V;
        this.n = true;
        this.m = false;
    }

    @Override // s4.k
    public final void B(s4.i iVar) {
        s4.i iVar2;
        b1 b1Var = iVar.a;
        View view = b1Var == null ? null : b1Var.a;
        b1 b1Var2 = iVar.b;
        View view2 = b1Var2 != null ? b1Var2.a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(iVar.a);
            duration.translationX(iVar.e - iVar.c);
            duration.translationY(iVar.f - iVar.d);
            iVar2 = iVar;
            duration.alpha(0.0f).setListener(new j(this, iVar2, duration, view, 0)).start();
        } else {
            iVar2 = iVar;
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(iVar2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new j(this, iVar2, animate, view2, 1)).start();
        }
    }

    @Override // s4.k
    public final void C(b1 b1Var, s4.j jVar) {
        T(b1Var, jVar, false);
    }

    @Override // s4.k
    public final boolean J(s4.i iVar, b1 b1Var) {
        y11 y11Var;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(b1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = b1Var.a;
        if (this.K.contains(view) && (y11Var = (y11) this.U.run()) != null) {
            y11Var.a(view);
        }
        if (iVar.b == b1Var) {
            iVar.b = null;
        } else {
            if (iVar.a != b1Var) {
                return false;
            }
            iVar.a = null;
        }
        X(view);
        d(b1Var);
        return true;
    }

    @Override // s4.k
    public final long L() {
        return 0L;
    }

    @Override // s4.k
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
    /* JADX WARN: Removed duplicated region for block: B:11:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(final b1 b1Var, s4.j jVar, boolean z10) {
        b1 b1Var2;
        int i10;
        s1 s1Var;
        t1 t1Var;
        boolean z11;
        float f7;
        boolean z12;
        final l lVar;
        final t1 t1Var2;
        s1 s1Var2;
        final int i11;
        final s1 s1Var3;
        ValueAnimator valueAnimator;
        final boolean z13;
        int[] iArr;
        int i12 = jVar.c;
        int i13 = jVar.e;
        View view = b1Var.a;
        int i14 = i13 - i12;
        AnimatorSet animatorSet = new AnimatorSet();
        int i15 = 0;
        final int i16 = 1;
        if (i14 != 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.z.add(b1Var);
        final l lVar2 = (l) jVar;
        sn snVar = this.F;
        if (snVar != null && (view instanceof g0)) {
            g0 g0Var = (g0) view;
            float translationY = g0Var.getTranslationY();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new g(this, g0Var, translationY, i15));
            animatorSet.playTogether(ofFloat);
        } else {
            if (snVar == null || !(view instanceof ya)) {
                if (view instanceof t1) {
                    final t1 t1Var3 = (t1) view;
                    final s1 transitionParams = t1Var3.getTransitionParams();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(t1Var3, t1Var3.Be, 0.0f));
                    if (lVar2.n) {
                        t1Var3.T3(lVar2.o, lVar2.p, lVar2.q, lVar2.r);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        final float f10 = t1Var3.getCurrentMessagesGroup() == null ? transitionParams.u0 : t1Var3.getCurrentMessagesGroup().transitionParams.captionEnterProgress;
                        final float O2 = t1Var3.getCurrentMessagesGroup() == null ? t1Var3.O2() : t1Var3.getCurrentMessagesGroup().hasCaption;
                        if (f10 != O2) {
                            valueAnimator = ofFloat2;
                            z13 = true;
                        } else {
                            valueAnimator = ofFloat2;
                            z13 = false;
                        }
                        if (transitionParams.B0) {
                            z11 = false;
                            iArr = new int[4];
                            for (int i17 = 0; i17 < 4; i17++) {
                                iArr[i17] = t1Var3.getPhotoImage().getRoundRadius()[i17];
                            }
                        } else {
                            z11 = false;
                            iArr = null;
                        }
                        final int[] iArr2 = iArr;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        i10 = 2;
                        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: li.a
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                l lVar3 = l.this;
                                float f11 = 1.0f - floatValue;
                                float f12 = lVar3.o * f11;
                                s1 s1Var4 = transitionParams;
                                float f13 = (s1Var4.m0 * floatValue) + f12;
                                float f14 = (s1Var4.n0 * floatValue) + (lVar3.p * f11);
                                float f15 = (s1Var4.o0 * floatValue) + (lVar3.q * f11);
                                float f16 = (s1Var4.p0 * floatValue) + (lVar3.r * f11);
                                boolean z14 = z13;
                                t1 t1Var4 = t1Var3;
                                if (z14) {
                                    float f17 = (O2 * floatValue) + (f10 * f11);
                                    s1Var4.u0 = f17;
                                    if (t1Var4.getCurrentMessagesGroup() != null) {
                                        t1Var4.getCurrentMessagesGroup().transitionParams.captionEnterProgress = f17;
                                    }
                                }
                                if (s1Var4.B0) {
                                    ImageReceiver photoImage = t1Var4.getPhotoImage();
                                    int[] iArr3 = iArr2;
                                    int[] iArr4 = s1Var4.A0;
                                    photoImage.setRoundRadius((int) ((iArr4[0] * floatValue) + (iArr3[0] * f11)), (int) ((iArr4[1] * floatValue) + (iArr3[1] * f11)), (int) ((iArr4[2] * floatValue) + (iArr3[2] * f11)), (int) ((iArr4[3] * floatValue) + (iArr3[3] * f11)));
                                }
                                t1Var4.T3(f13, f14, f15, f16);
                                b1Var.a.invalidate();
                            }
                        };
                        s1Var = transitionParams;
                        t1Var = t1Var3;
                        b1Var2 = b1Var;
                        valueAnimator2.addUpdateListener(animatorUpdateListener);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[z11 ? 1 : 0] = valueAnimator2;
                        animatorSet.playTogether(animatorArr);
                    } else {
                        i10 = 2;
                        s1Var = transitionParams;
                        t1Var = t1Var3;
                        b1Var2 = b1Var;
                        z11 = false;
                    }
                    if (lVar2.v == 0 && lVar2.t == 0 && lVar2.u == 0 && lVar2.s == 0) {
                        f7 = 0.0f;
                        s1Var.k0 = 0.0f;
                        s1Var.l0 = 0.0f;
                        z12 = z11;
                    } else {
                        f7 = 0.0f;
                        mm0 mm0Var = this.G;
                        mm0Var.setClipChildren(z11);
                        mm0Var.invalidate();
                        float[] fArr = new float[i10];
                        // fill-array-data instruction
                        fArr[0] = 1.0f;
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr);
                        if (lVar2.l) {
                            s1Var.k0 = -lVar2.s;
                            s1Var.l0 = -lVar2.t;
                        } else {
                            s1Var.k0 = (-lVar2.s) - t1Var.getAnimationOffsetX();
                            s1Var.l0 = (-lVar2.t) - t1Var.getAnimationOffsetX();
                        }
                        ofFloat3.addUpdateListener(new n3(lVar2, s1Var, t1Var, 3));
                        z12 = false;
                        animatorSet.playTogether(ofFloat3);
                    }
                    MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        lVar2.j = z12;
                    }
                    if (lVar2.j) {
                        float[] fArr2 = new float[i10];
                        // fill-array-data instruction
                        fArr2[0] = 1.0f;
                        fArr2[1] = 0.0f;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr2);
                        s1 s1Var4 = s1Var;
                        final MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                        final mm0 mm0Var2 = (mm0) view.getParent();
                        final float f11 = currentMessagesGroup.transitionParams.captionEnterProgress;
                        if (currentMessagesGroup.hasCaption) {
                            f7 = 1.0f;
                        }
                        final boolean z14 = f11 != f7;
                        s1Var2 = s1Var4;
                        final float f12 = f7;
                        lVar = lVar2;
                        t1Var2 = t1Var;
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: li.b
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                l lVar3 = lVar;
                                MessageObject.GroupedMessages.TransitionParams transitionParams3 = MessageObject.GroupedMessages.TransitionParams.this;
                                transitionParams3.offsetTop = lVar3.f * floatValue;
                                transitionParams3.offsetBottom = lVar3.g * floatValue;
                                transitionParams3.offsetLeft = lVar3.h * floatValue;
                                transitionParams3.offsetRight = lVar3.i * floatValue;
                                if (z14) {
                                    transitionParams3.captionEnterProgress = k3.y(1.0f, floatValue, f12, f11 * floatValue);
                                }
                                mm0 mm0Var3 = mm0Var2;
                                if (mm0Var3 != null) {
                                    mm0Var3.invalidate();
                                }
                            }
                        });
                        ofFloat4.addListener(new h(transitionParams2));
                        i11 = 0;
                        animatorSet.playTogether(ofFloat4);
                    } else {
                        lVar = lVar2;
                        t1Var2 = t1Var;
                        s1Var2 = s1Var;
                        i11 = 0;
                    }
                    if (lVar.k) {
                        float[] fArr3 = new float[i10];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(fArr3);
                        s1Var3 = s1Var2;
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: li.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i11) {
                                    case 0:
                                        s1Var3.z0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        t1Var2.invalidate();
                                        break;
                                    default:
                                        s1Var3.K1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        t1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i11] = ofFloat5;
                        animatorSet.playTogether(animatorArr2);
                    } else {
                        s1Var3 = s1Var2;
                    }
                    if (lVar.m) {
                        float[] fArr4 = new float[i10];
                        // fill-array-data instruction
                        fArr4[0] = 0.0f;
                        fArr4[1] = 1.0f;
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(fArr4);
                        s1Var3.g = true;
                        ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: li.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i16) {
                                    case 0:
                                        s1Var3.z0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        t1Var2.invalidate();
                                        break;
                                    default:
                                        s1Var3.K1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        t1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        animatorSet.playTogether(ofFloat6);
                    }
                } else {
                    b1Var2 = b1Var;
                    if (view instanceof v0) {
                        v0 v0Var = (v0) view;
                        u0 transitionParams3 = v0Var.getTransitionParams();
                        if (lVar2.m) {
                            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            transitionParams3.b = true;
                            ofFloat7.addUpdateListener(new l0(9, transitionParams3, v0Var));
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
                    animatorSet.setInterpolator(bs.g);
                }
                animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
                animatorSet.addListener(new i(this, b1Var2, i14, view));
                animatorSet.start();
                this.J.put(b1Var2, animatorSet);
            }
            ya yaVar = (ya) view;
            float translationY2 = yaVar.getTranslationY();
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat8.addUpdateListener(new g(this, yaVar, translationY2, i16));
            animatorSet.playTogether(ofFloat8);
        }
        b1Var2 = b1Var;
        if (z10) {
        }
        animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
        animatorSet.addListener(new i(this, b1Var2, i14, view));
        animatorSet.start();
        this.J.put(b1Var2, animatorSet);
    }

    public final void U() {
        y11 y11Var;
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
        if (this.K.isEmpty() || (y11Var = (y11) this.U.run()) == null) {
            return;
        }
        ArrayList arrayList2 = y11Var.c;
        if (y11Var.e) {
            return;
        }
        y11Var.e = true;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            x11 x11Var = (x11) obj2;
            Runnable runnable = x11Var.d;
            if (runnable != null) {
                y11.b(runnable);
                x11Var.d = null;
            }
        }
        arrayList2.clear();
        w11 w11Var = y11Var.a;
        if (w11Var != null) {
            w11Var.i();
        }
        Runnable runnable2 = y11Var.d;
        if (runnable2 != null) {
            y11Var.d = null;
            y11.b(runnable2);
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
            mm0 mm0Var = this.G;
            int childCount = mm0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = mm0Var.getChildAt(i10);
                if (childAt instanceof t1) {
                    t1 t1Var = (t1) childAt;
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (t1Var.getTransitionParams().v0 && groupedMessages.messages.contains(messageObject)) {
                        groupedMessages.transitionParams.top = t1Var.getBackgroundDrawableTop() + t1Var.getPaddingTop() + t1Var.getTop();
                        groupedMessages.transitionParams.bottom = t1Var.getBackgroundDrawableBottom() + t1Var.getPaddingTop() + t1Var.getTop();
                        groupedMessages.transitionParams.left = t1Var.getBackgroundDrawableLeft() + t1Var.getLeft();
                        groupedMessages.transitionParams.right = t1Var.getBackgroundDrawableRight() + t1Var.getLeft();
                        groupedMessages.transitionParams.drawCaptionLayout = t1Var.O2();
                        groupedMessages.transitionParams.pinnedTop = t1Var.m3();
                        groupedMessages.transitionParams.pinnedBotton = t1Var.l3();
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
        boolean z10 = view instanceof g0;
        mm0 mm0Var = this.G;
        if (z10) {
            int measuredHeight = (mm0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((g0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof ya) {
            int measuredHeight2 = (mm0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((ya) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof t1) {
            t1 t1Var = (t1) view;
            t1Var.getTransitionParams().j();
            t1Var.setAnimationOffsetX(0.0f);
        } else {
            if (!(view instanceof v0)) {
                view.setTranslationX(0.0f);
                return;
            }
            u0 transitionParams = ((v0) view).getTransitionParams();
            transitionParams.b = false;
            transitionParams.c = 1.0f;
        }
    }

    public final void Y(tg tgVar, tg tgVar2) {
        this.T = tgVar;
        this.U = tgVar2;
    }

    public final boolean Z(View view) {
        b1 T;
        if (this.N || (T = this.G.T(view)) == null) {
            return false;
        }
        return this.q.contains(T) || this.y.contains(T);
    }

    @Override // s4.e1, s4.l0
    public final boolean a(b1 b1Var, b2.u0 u0Var, b2.u0 u0Var2) {
        ArrayList arrayList;
        int i10;
        boolean a2 = super.a(b1Var, u0Var, u0Var2);
        if (a2 && this.N) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.q;
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (((b1) arrayList.get(i11)).c() == 0) {
                    z10 = true;
                }
                i11++;
            }
            if (z10) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    i10 += ((b1) arrayList.get(i12)).a.getHeight();
                }
            } else {
                i10 = 0;
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((b1) arrayList.get(i13)).a.setTranslationY(i10);
            }
        }
        return a2;
    }

    public final boolean a0(View view) {
        b1 T = this.G.T(view);
        if (T != null) {
            return this.p.contains(T) || this.A.contains(T);
        }
        return false;
    }

    @Override // s4.k, s4.l0
    public final void f(b1 b1Var) {
        y11 y11Var;
        Animator animator = (Animator) this.J.remove(b1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = b1Var.a;
        if (this.K.contains(view) && (y11Var = (y11) this.U.run()) != null) {
            y11Var.a(view);
        }
        super.f(b1Var);
        X(view);
    }

    @Override // s4.k, s4.l0
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
        to toVar = this.P;
        if (toVar != null) {
            toVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.j jVar = (s4.j) arrayList2.get(size2);
            X(jVar.a.a);
            v(jVar.a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            b1 b1Var = (b1) arrayList3.get(size3);
            X(b1Var.a);
            d(b1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            b1 b1Var2 = (b1) arrayList4.get(size4);
            X(b1Var2.a);
            u(b1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((s4.i) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (k()) {
            ArrayList arrayList6 = this.u;
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
                for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                    s4.j jVar2 = (s4.j) arrayList7.get(size7);
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
                    b1 b1Var3 = (b1) arrayList9.get(size9);
                    X(b1Var3.a);
                    u(b1Var3);
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
                    I((s4.i) arrayList11.get(size11));
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
    public final b2.u0 l(y0 y0Var, b1 b1Var, int i10, List list) {
        b2.u0 l4 = super.l(y0Var, b1Var, i10, list);
        View view = b1Var.a;
        if (!(view instanceof t1)) {
            return l4;
        }
        k kVar = new k();
        kVar.a = l4.a;
        kVar.b = l4.b;
        s1 transitionParams = ((t1) view).getTransitionParams();
        kVar.c = transitionParams.a;
        kVar.d = transitionParams.b;
        kVar.e = transitionParams.c;
        kVar.f = transitionParams.d;
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0480 A[EDGE_INSN: B:226:0x0480->B:227:0x0480 BREAK  A[LOOP:9: B:195:0x03c7->B:219:0x0476], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0201  */
    @Override // s4.k, s4.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        boolean z10;
        boolean z11;
        boolean z12;
        mm0 mm0Var;
        boolean z13;
        long j10;
        boolean z14;
        int size;
        int i10;
        HashMap hashMap;
        boolean z15;
        float f7;
        int i11;
        mm0 mm0Var2;
        float f10;
        boolean z16;
        ArrayList arrayList;
        int i12;
        int i13;
        boolean z17;
        boolean z18;
        ArrayList arrayList2;
        tg tgVar;
        int i14;
        MessageObject.GroupedMessages currentMessagesGroup;
        boolean z19;
        boolean z20;
        mm0 mm0Var3;
        boolean z21;
        MessageObject messageObject;
        tg tgVar2;
        int i15;
        b1 b1Var;
        int i16;
        boolean z22;
        sn snVar;
        Runnable runnable;
        mf mfVar;
        int i17;
        ArrayList arrayList3 = this.p;
        boolean isEmpty = arrayList3.isEmpty();
        ArrayList arrayList4 = this.r;
        boolean isEmpty2 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.s;
        boolean isEmpty3 = arrayList5.isEmpty();
        ArrayList arrayList6 = this.q;
        boolean isEmpty4 = arrayList6.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        boolean z23 = this.N;
        mm0 mm0Var4 = this.G;
        int i18 = 1;
        if (z23) {
            z10 = false;
            for (0; i17 < arrayList6.size(); i17 + 1) {
                if (this.Q) {
                    i17 = ((b1) arrayList6.get(i17)).c() != (mm0Var4.getAdapter() == null ? 0 : mm0Var4.getAdapter().h()) - 1 ? i17 + 1 : 0;
                    z10 = true;
                } else {
                    if (((b1) arrayList6.get(i17)).c() != 0) {
                    }
                    z10 = true;
                }
            }
        } else {
            z10 = false;
        }
        W();
        ArrayList arrayList7 = this.y;
        float f11 = 1.0f;
        if (z10) {
            boolean isEmpty5 = arrayList3.isEmpty();
            boolean isEmpty6 = arrayList4.isEmpty();
            boolean isEmpty7 = arrayList5.isEmpty();
            boolean isEmpty8 = arrayList6.isEmpty();
            if (!isEmpty5 || !isEmpty6 || !isEmpty8 || !isEmpty7) {
                int i19 = 0;
                for (0; i15 < arrayList6.size(); i15 + 1) {
                    View view = ((b1) arrayList6.get(i15)).a;
                    if (view instanceof t1) {
                        t1 t1Var = (t1) view;
                        i15 = (t1Var.getCurrentPosition() != null && (t1Var.getCurrentPosition().flags & 1) == 0) ? i15 + 1 : 0;
                    }
                    i19 += ((b1) arrayList6.get(i15)).a.getHeight();
                }
                int size2 = arrayList3.size();
                int i20 = 0;
                while (i20 < size2) {
                    Object obj = arrayList3.get(i20);
                    i20++;
                    D((b1) obj);
                }
                arrayList3.clear();
                if (!isEmpty6) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.addAll(arrayList4);
                    arrayList4.clear();
                    int size3 = arrayList8.size();
                    int i21 = 0;
                    while (i21 < size3) {
                        Object obj2 = arrayList8.get(i21);
                        i21++;
                        s4.j jVar = (s4.j) obj2;
                        T(jVar.a, jVar, false);
                    }
                    arrayList8.clear();
                }
                if (!isEmpty8) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList6);
                    arrayList6.clear();
                    int size4 = arrayList9.size();
                    int i22 = 0;
                    while (i22 < size4) {
                        Object obj3 = arrayList9.get(i22);
                        i22++;
                        b1 b1Var2 = (b1) obj3;
                        View view2 = b1Var2.a;
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList7.add(b1Var2);
                        view2.setTranslationY(i19);
                        View view3 = b1Var2.a;
                        view3.setScaleX(f11);
                        view3.setScaleY(f11);
                        t1 t1Var2 = view3 instanceof t1 ? (t1) view3 : null;
                        if (t1Var2 == null || !t1Var2.getTransitionParams().x0) {
                            view3.setAlpha(f11);
                        }
                        sn snVar2 = this.F;
                        if (snVar2 != null) {
                            ArrayList arrayList10 = snVar2.G4;
                            if (t1Var2 != null && arrayList10.contains(t1Var2.getMessageObject())) {
                                arrayList10.remove(t1Var2.getMessageObject());
                                gk gkVar = snVar2.Y;
                                if (gkVar.f0 == null || !((mfVar = gkVar.L0) == null || mfVar.p0)) {
                                    b1Var = b1Var2;
                                } else {
                                    b1Var = b1Var2;
                                    if (System.currentTimeMillis() - gkVar.M0 > 300) {
                                        z22 = true;
                                        i16 = size4;
                                        gkVar.M0 = -1L;
                                        if (z22) {
                                            if (t1Var2.getMessageObject().isVoice()) {
                                                if (Math.abs(view2.getTranslationY()) < view2.getMeasuredHeight() * 3.0f) {
                                                    new rh1(t1Var2, snVar2.Y, this.G, snVar2.Y9, this.R).f.start();
                                                }
                                            } else if (SharedConfig.getDevicePerformanceClass() != 0 && Math.abs(view2.getTranslationY()) < mm0Var4.getMeasuredHeight()) {
                                                snVar = snVar2;
                                                ValueAnimator valueAnimator = new ea1(t1Var2, snVar2, this.G, snVar2.Y9, this.R).d;
                                                if (valueAnimator != null) {
                                                    valueAnimator.start();
                                                }
                                                gk gkVar2 = snVar.Y;
                                                runnable = gkVar2.f0;
                                                if (runnable != null) {
                                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                                    gkVar2.g0 = true;
                                                    gkVar2.f0.run();
                                                    gkVar2.f0 = null;
                                                    size4 = i16;
                                                    animate.translationY(0.0f).setDuration(250L).setInterpolator(this.o).setListener(new j0(this, b1Var, view2, animate)).start();
                                                    f11 = 1.0f;
                                                }
                                            }
                                            snVar = snVar2;
                                            gk gkVar22 = snVar.Y;
                                            runnable = gkVar22.f0;
                                            if (runnable != null) {
                                            }
                                        }
                                        size4 = i16;
                                        animate.translationY(0.0f).setDuration(250L).setInterpolator(this.o).setListener(new j0(this, b1Var, view2, animate)).start();
                                        f11 = 1.0f;
                                    }
                                }
                                z22 = false;
                                i16 = size4;
                                gkVar.M0 = -1L;
                                if (z22) {
                                }
                                size4 = i16;
                                animate.translationY(0.0f).setDuration(250L).setInterpolator(this.o).setListener(new j0(this, b1Var, view2, animate)).start();
                                f11 = 1.0f;
                            }
                        }
                        b1Var = b1Var2;
                        i16 = size4;
                        size4 = i16;
                        animate.translationY(0.0f).setDuration(250L).setInterpolator(this.o).setListener(new j0(this, b1Var, view2, animate)).start();
                        f11 = 1.0f;
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
                boolean z24 = (this.U == null || (tgVar2 = this.T) == null || !((Boolean) tgVar2.run()).booleanValue()) ? false : true;
                ArrayList arrayList11 = this.K;
                ArrayList arrayList12 = this.A;
                boolean z25 = z24;
                ArrayList arrayList13 = this.S;
                if (z25) {
                    LongSparseArray longSparseArray = null;
                    int i23 = 0;
                    j10 = 0;
                    while (i23 < arrayList3.size()) {
                        b1 b1Var3 = (b1) arrayList3.get(i23);
                        if (arrayList13.contains(b1Var3)) {
                            z19 = isEmpty10;
                            View view4 = b1Var3.a;
                            z20 = isEmpty11;
                            if ((view4 instanceof t1) && ((t1) view4).getCurrentMessagesGroup() != null && (messageObject = ((t1) b1Var3.a).getMessageObject()) != null && messageObject.getGroupId() != 0) {
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                mm0Var3 = mm0Var4;
                                z21 = isEmpty12;
                                ArrayList arrayList14 = (ArrayList) longSparseArray.get(messageObject.getGroupId());
                                if (arrayList14 == null) {
                                    long groupId = messageObject.getGroupId();
                                    ArrayList arrayList15 = new ArrayList();
                                    longSparseArray.put(groupId, arrayList15);
                                    arrayList14 = arrayList15;
                                }
                                arrayList13.remove(b1Var3);
                                arrayList3.remove(i23);
                                i23--;
                                arrayList14.add(b1Var3);
                                i23++;
                                isEmpty12 = z21;
                                isEmpty10 = z19;
                                isEmpty11 = z20;
                                mm0Var4 = mm0Var3;
                            }
                        } else {
                            z19 = isEmpty10;
                            z20 = isEmpty11;
                        }
                        mm0Var3 = mm0Var4;
                        z21 = isEmpty12;
                        i23++;
                        isEmpty12 = z21;
                        isEmpty10 = z19;
                        isEmpty11 = z20;
                        mm0Var4 = mm0Var3;
                    }
                    z11 = isEmpty10;
                    z12 = isEmpty11;
                    mm0Var = mm0Var4;
                    z13 = isEmpty12;
                    if (longSparseArray != null) {
                        int i24 = 0;
                        z14 = false;
                        while (i24 < longSparseArray.size()) {
                            ArrayList arrayList16 = (ArrayList) longSparseArray.valueAt(i24);
                            if (arrayList16.size() > 0) {
                                View view5 = ((b1) arrayList16.get(0)).a;
                                if (!(view5 instanceof t1) || (currentMessagesGroup = ((t1) view5).getCurrentMessagesGroup()) == null || currentMessagesGroup.messages.size() <= arrayList16.size()) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("animate remove group impl with thanos");
                                    }
                                    arrayList12.addAll(arrayList16);
                                    y11 y11Var = (y11) this.U.run();
                                    for (int i25 = 0; i25 < arrayList16.size(); i25++) {
                                    }
                                    ArrayList arrayList17 = new ArrayList();
                                    i14 = i24;
                                    for (int i26 = 0; i26 < arrayList16.size(); i26++) {
                                        arrayList17.add(((b1) arrayList16.get(i26)).a);
                                    }
                                    d2 d2Var = new d2(this, arrayList17, arrayList16, 7);
                                    w11 w11Var = y11Var.a;
                                    if (w11Var != null) {
                                        w11Var.f(arrayList17, d2Var);
                                        Choreographer.getInstance().postFrameCallback(y11Var.b);
                                    } else {
                                        y11Var.c.add(new x11(arrayList17, d2Var));
                                    }
                                    arrayList11.add((View) arrayList17.get(0));
                                    mm0Var.B0();
                                    z14 = true;
                                    i24 = i14 + 1;
                                } else {
                                    arrayList3.addAll(arrayList16);
                                }
                            }
                            i14 = i24;
                            i24 = i14 + 1;
                        }
                        size = arrayList3.size();
                        boolean z26 = z14;
                        i10 = 0;
                        while (true) {
                            hashMap = this.J;
                            if (i10 < size) {
                                break;
                            }
                            Object obj4 = arrayList3.get(i10);
                            int i27 = i10 + 1;
                            b1 b1Var4 = (b1) obj4;
                            boolean z27 = arrayList13.remove(b1Var4) && z25;
                            if (BuildVars.LOGS_ENABLED) {
                                arrayList = arrayList3;
                                i12 = size;
                                FileLog.d("animate remove impl ".concat(z27 ? " with thanos" : ""));
                            } else {
                                arrayList = arrayList3;
                                i12 = size;
                            }
                            View view6 = b1Var4.a;
                            arrayList12.add(b1Var4);
                            if (!z27 || (tgVar = this.U) == null) {
                                i13 = i27;
                                z17 = z13;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view6, (Property<View, Float>) View.ALPHA, view6.getAlpha(), 0.0f);
                                z18 = z27;
                                arrayList2 = arrayList11;
                                ofFloat.setDuration(this.d);
                                ofFloat.addListener(new f(this, view6, b1Var4));
                                hashMap.put(b1Var4, ofFloat);
                                ofFloat.start();
                            } else {
                                y11 y11Var2 = (y11) tgVar.run();
                                i13 = i27;
                                d2 d2Var2 = new d2(this, view6, b1Var4, 8);
                                w11 w11Var2 = y11Var2.a;
                                if (w11Var2 != null) {
                                    w11Var2.d(view6, 1.0f, d2Var2);
                                    Choreographer.getInstance().postFrameCallback(y11Var2.b);
                                } else {
                                    y11Var2.c.add(new x11(view6, d2Var2));
                                }
                                arrayList11.add(view6);
                                z17 = z13;
                                z18 = z27;
                                arrayList2 = arrayList11;
                            }
                            mm0Var.B0();
                            arrayList11 = arrayList2;
                            if (z18) {
                                z26 = true;
                            }
                            size = i12;
                            arrayList3 = arrayList;
                            i10 = i13;
                            z13 = z17;
                        }
                        z15 = z13;
                        arrayList3.clear();
                        if (!z11) {
                            ArrayList arrayList18 = new ArrayList();
                            arrayList18.addAll(arrayList4);
                            this.u.add(arrayList18);
                            arrayList4.clear();
                            ad.l lVar = new ad.l(this, arrayList18, z26, i18);
                            if (!this.C || isEmpty9) {
                                lVar.run();
                            } else {
                                View view7 = ((s4.j) arrayList18.get(0)).a.a;
                                WeakHashMap weakHashMap = i0.a;
                                view7.postOnAnimationDelayed(lVar, j10);
                            }
                        }
                        if (!z12) {
                            ArrayList arrayList19 = new ArrayList();
                            arrayList19.addAll(arrayList5);
                            this.v.add(arrayList19);
                            arrayList5.clear();
                            u uVar = new u(this, arrayList19, false, 19);
                            if (!this.C || isEmpty9) {
                                uVar.run();
                            } else {
                                View view8 = ((s4.i) arrayList19.get(0)).a.a;
                                WeakHashMap weakHashMap2 = i0.a;
                                view8.postOnAnimationDelayed(uVar, 0L);
                            }
                        }
                        if (!z15) {
                            ArrayList arrayList20 = new ArrayList();
                            arrayList20.addAll(arrayList6);
                            arrayList6.clear();
                            Collections.sort(arrayList20, new a4.d(27));
                            int size5 = arrayList20.size();
                            int i28 = 0;
                            while (i28 < size5) {
                                int i29 = i28 + 1;
                                b1 b1Var5 = (b1) arrayList20.get(i28);
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("animate add impl");
                                }
                                View view9 = b1Var5.a;
                                arrayList7.add(b1Var5);
                                if (b1Var5 == this.O) {
                                    view9.setAlpha(1.0f);
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                if (view9 instanceof t1) {
                                    t1 t1Var3 = (t1) view9;
                                    if (t1Var3.getAnimationOffsetX() != 0.0f) {
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(t1Var3, t1Var3.Be, t1Var3.getAnimationOffsetX(), 0.0f));
                                    }
                                    t1Var3.setPivotX(((t1Var3.getBackgroundDrawableRight() - t1Var3.getBackgroundDrawableLeft()) / 2.0f) + t1Var3.getBackgroundDrawableLeft());
                                    f7 = 0.0f;
                                    view9.animate().translationY(0.0f).setDuration(this.c).start();
                                } else {
                                    f7 = 0.0f;
                                    view9.animate().translationX(0.0f).translationY(0.0f).setDuration(this.c).start();
                                }
                                long max = (long) ((1.0f - Math.max(f7, Math.min(1.0f, view9.getBottom() / mm0Var.getMeasuredHeight()))) * 100.0f);
                                if (!(view9 instanceof t1)) {
                                    i11 = size5;
                                    mm0Var2 = mm0Var;
                                    f10 = 0.0f;
                                } else if (b1Var5 == this.O) {
                                    to toVar = this.P;
                                    if (toVar != null) {
                                        toVar.h.setAlpha(0.0f);
                                    }
                                    mm0 mm0Var5 = mm0Var;
                                    mm0Var5.setClipChildren(false);
                                    final t1 t1Var4 = (t1) view9;
                                    View view10 = (View) this.P.getParent();
                                    float x10 = view10.getX() + this.P.getX() + this.P.h.getX();
                                    float y3 = view10.getY() + this.P.getY() + this.P.h.getY();
                                    float x11 = t1Var4.getX() + mm0Var5.getX() + t1Var4.getPhotoImage().getImageX();
                                    float y10 = t1Var4.getY() + mm0Var5.getY() + t1Var4.getPhotoImage().getImageY();
                                    mm0Var2 = mm0Var5;
                                    final float width = this.P.h.getWidth();
                                    final float height = this.P.h.getHeight();
                                    final float imageWidth = t1Var4.getPhotoImage().getImageWidth();
                                    final float imageHeight = t1Var4.getPhotoImage().getImageHeight();
                                    final float f12 = x10 - x11;
                                    final float f13 = y3 - y10;
                                    final float imageX = t1Var4.getPhotoImage().getImageX();
                                    final float imageY = t1Var4.getPhotoImage().getImageY();
                                    t1Var4.getTransitionParams().f0 = true;
                                    t1Var4.getTransitionParams().J1 = true;
                                    t1Var4.getPhotoImage().setImageCoords(imageX + f12, imageX + f13, width, height);
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: li.d
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            t1 t1Var5 = t1.this;
                                            t1Var5.getTransitionParams().K1 = floatValue;
                                            if (t1Var5.getTransitionParams().K1 > 1.0f) {
                                                t1Var5.getTransitionParams().K1 = 1.0f;
                                            }
                                            float f14 = 1.0f - floatValue;
                                            t1Var5.getPhotoImage().setImageCoords((f12 * f14) + imageX, (f13 * f14) + imageY, (imageWidth * floatValue) + (width * f14), (imageHeight * floatValue) + (height * f14));
                                            t1Var5.invalidate();
                                        }
                                    });
                                    i11 = size5;
                                    f10 = 0.0f;
                                    ofFloat2.addListener(new e(this, t1Var4, imageX, imageY, imageWidth, imageHeight));
                                    animatorSet.play(ofFloat2);
                                    max = max;
                                    z16 = false;
                                    view9.setAlpha(f10);
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), 1.0f));
                                    if (z16) {
                                        view9.setScaleX(1.0f);
                                        view9.setScaleY(1.0f);
                                    } else {
                                        view9.setScaleX(0.9f);
                                        view9.setScaleY(0.9f);
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_Y, view9.getScaleY(), 1.0f));
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_X, view9.getScaleX(), 1.0f));
                                    }
                                    if (b1Var5 != this.O) {
                                        animatorSet.setDuration(350L);
                                        animatorSet.setInterpolator(new OvershootInterpolator());
                                    } else {
                                        animatorSet.setStartDelay(max);
                                        animatorSet.setDuration(250L);
                                    }
                                    animatorSet.addListener(new f(this, b1Var5, view9));
                                    hashMap.put(b1Var5, animatorSet);
                                    animatorSet.start();
                                    i28 = i29;
                                    size5 = i11;
                                    mm0Var = mm0Var2;
                                } else {
                                    i11 = size5;
                                    mm0Var2 = mm0Var;
                                    f10 = 0.0f;
                                    MessageObject.GroupedMessages currentMessagesGroup2 = ((t1) view9).getCurrentMessagesGroup();
                                    if (currentMessagesGroup2 != null) {
                                        Long valueOf = Long.valueOf(currentMessagesGroup2.groupId);
                                        HashMap hashMap2 = this.M;
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
                                z16 = true;
                                view9.setAlpha(f10);
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), 1.0f));
                                if (z16) {
                                }
                                if (b1Var5 != this.O) {
                                }
                                animatorSet.addListener(new f(this, b1Var5, view9));
                                hashMap.put(b1Var5, animatorSet);
                                animatorSet.start();
                                i28 = i29;
                                size5 = i11;
                                mm0Var = mm0Var2;
                            }
                            arrayList20.clear();
                        }
                    }
                } else {
                    z11 = isEmpty10;
                    z12 = isEmpty11;
                    mm0Var = mm0Var4;
                    z13 = isEmpty12;
                    j10 = 0;
                }
                z14 = false;
                size = arrayList3.size();
                boolean z262 = z14;
                i10 = 0;
                while (true) {
                    hashMap = this.J;
                    if (i10 < size) {
                    }
                    size = i12;
                    arrayList3 = arrayList;
                    i10 = i13;
                    z13 = z17;
                }
                z15 = z13;
                arrayList3.clear();
                if (!z11) {
                }
                if (!z12) {
                }
                if (!z15) {
                }
            }
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new i6(this, 7));
        ofFloat3.setDuration(this.d + 250);
        ofFloat3.start();
    }

    @Override // s4.k, s4.e1
    public final void p(b1 b1Var) {
        R(b1Var);
        View view = b1Var.a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof t1) {
            ((t1) view).getTransitionParams().h = true;
        }
        this.q.add(b1Var);
    }

    @Override // s4.k, s4.e1
    public final boolean q(b1 b1Var, b1 b1Var2, b2.u0 u0Var, int i10, int i11, int i12, int i13) {
        if (b1Var == b1Var2) {
            return r(b1Var, u0Var, i10, i11, i12, i13);
        }
        View view = b1Var.a;
        float animationOffsetX = view instanceof t1 ? ((t1) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(b1Var);
        int i14 = (int) ((i12 - i10) - animationOffsetX);
        int i15 = (int) ((i13 - i11) - translationY);
        if (view instanceof t1) {
            ((t1) view).setAnimationOffsetX(animationOffsetX);
        } else {
            view.setTranslationX(animationOffsetX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = b1Var2.a;
        R(b1Var2);
        if (view2 instanceof t1) {
            ((t1) view2).setAnimationOffsetX(-i14);
        } else {
            view2.setTranslationX(-i14);
        }
        view2.setTranslationY(-i15);
        view2.setAlpha(0.0f);
        this.s.add(new s4.i(b1Var, b1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override // s4.k, s4.e1
    public final boolean r(b1 b1Var, b2.u0 u0Var, int i10, int i11, int i12, int i13) {
        int translationX;
        int i14;
        t1 t1Var;
        v0 v0Var;
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
        View view2 = b1Var.a;
        if (view2 instanceof t1) {
            t1 t1Var2 = (t1) view2;
            translationX = i10 + ((int) t1Var2.getAnimationOffsetX());
            i14 = t1Var2.getTransitionParams().s2 != t1Var2.getTopMediaOffset() ? (t1Var2.getTransitionParams().s2 - t1Var2.getTopMediaOffset()) + i11 : i11;
            t1Var = t1Var2;
            v0Var = null;
        } else if (view2 instanceof v0) {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            v0Var = (v0) view2;
            t1Var = null;
        } else {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            t1Var = null;
            v0Var = null;
        }
        int i17 = translationX;
        int translationY = i14 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (t1Var != null) {
            float imageX = t1Var.getPhotoImage().getImageX();
            float imageY = t1Var.getPhotoImage().getImageY();
            f11 = t1Var.getPhotoImage().getImageWidth();
            float imageHeight = t1Var.getPhotoImage().getImageHeight();
            f7 = 0.0f;
            for (int i18 = 0; i18 < 4; i18++) {
                iArr[i18] = t1Var.getPhotoImage().getRoundRadius()[i18];
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
        R(b1Var);
        int i19 = i12 - i17;
        int i20 = i13 - translationY;
        if (i20 != 0) {
            view2.setTranslationY(-i20);
        }
        float f15 = f10;
        v0 v0Var2 = v0Var;
        float f16 = f11;
        l lVar = new l(b1Var, i17, translationY, i12, i13);
        if (t1Var != null) {
            s1 transitionParams = t1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.t0;
            Rect rect = transitionParams.D0;
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (i19 != 0) {
                t1Var.setAnimationOffsetX(-i19);
            }
            boolean z11 = u0Var instanceof k;
            mm0 mm0Var = this.G;
            if (z11) {
                ImageReceiver photoImage = t1Var.getPhotoImage();
                view = view2;
                k kVar = (k) u0Var;
                i15 = i19;
                boolean z12 = (!transitionParams.v0 || kVar.f == f7 || kVar.e == f7) ? false : true;
                lVar.n = z12;
                if (z12) {
                    mm0Var.setClipChildren(false);
                    mm0Var.invalidate();
                    transitionParams.f0 = true;
                    if (t1Var.getMessageObject().isRoundVideo()) {
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
                    float f18 = kVar.c;
                    if (f17 == f18 && transitionParams.n0 == kVar.d && transitionParams.p0 == kVar.f && transitionParams.o0 == kVar.e && !transitionParams.B0) {
                        transitionParams.f0 = false;
                        lVar.n = false;
                    } else {
                        lVar.o = f18;
                        lVar.p = kVar.d;
                        lVar.q = kVar.e;
                        lVar.r = kVar.f;
                        if (currentMessagesGroup != null) {
                            boolean z13 = currentMessagesGroup.hasCaption;
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            boolean z14 = transitionParams2.drawCaptionLayout;
                            if (z13 != z14) {
                                transitionParams2.captionEnterProgress = z14 ? 1.0f : f7;
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
                        t1Var.T3(lVar.o, lVar.p, lVar.q, lVar.r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.v0 && (((isOutOwner = t1Var.getMessageObject().isOutOwner()) && rect.left != t1Var.getBackgroundDrawableLeft()) || ((!isOutOwner && rect.right != t1Var.getBackgroundDrawableRight()) || rect.top != t1Var.getBackgroundDrawableTop() || rect.bottom != t1Var.getBackgroundDrawableBottom()))) {
                    lVar.v = t1Var.getBackgroundDrawableBottom() - rect.bottom;
                    lVar.u = t1Var.getBackgroundDrawableTop() - rect.top;
                    if (t1Var.G8 != transitionParams.E0) {
                        lVar.s = t1Var.getBackgroundDrawableLeft() - rect.left;
                        lVar.t = t1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (isOutOwner) {
                        lVar.s = t1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        lVar.t = t1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    lVar.l = true;
                    transitionParams.w0 = true;
                    transitionParams.g0 = -lVar.s;
                    transitionParams.h0 = -lVar.t;
                    transitionParams.j0 = -lVar.u;
                    transitionParams.i0 = -lVar.v;
                    mm0Var.setClipChildren(false);
                    mm0Var.invalidate();
                }
            } else {
                view = view2;
                i15 = i19;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    mm0 mm0Var2 = (mm0) view.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                    boolean z15 = true;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    while (i23 < mm0Var2.getChildCount()) {
                        View childAt = mm0Var2.getChildAt(i23);
                        if (childAt instanceof t1) {
                            t1 t1Var3 = (t1) childAt;
                            if (t1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !t1Var3.getMessageObject().deleted) {
                                int backgroundDrawableLeft = t1Var3.getBackgroundDrawableLeft() + t1Var3.getLeft();
                                groupedMessages = currentMessagesGroup;
                                int backgroundDrawableRight = t1Var3.getBackgroundDrawableRight() + t1Var3.getLeft();
                                i16 = i23;
                                int backgroundDrawableTop = t1Var3.getBackgroundDrawableTop() + t1Var3.getPaddingTop() + t1Var3.getTop();
                                int backgroundDrawableBottom = t1Var3.getBackgroundDrawableBottom() + t1Var3.getPaddingTop() + t1Var3.getTop();
                                if (i26 == 0 || backgroundDrawableLeft < i26) {
                                    i26 = backgroundDrawableLeft;
                                }
                                if (i27 == 0 || backgroundDrawableRight > i27) {
                                    i27 = backgroundDrawableRight;
                                }
                                if (t1Var3.getTransitionParams().v0 || transitionParams3.isNewGroup) {
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
                        lVar.j = false;
                        transitionParams3.backgroundChangeBounds = false;
                    } else {
                        int i28 = (-i24) + transitionParams3.top;
                        lVar.f = i28;
                        int i29 = (-i25) + transitionParams3.bottom;
                        lVar.g = i29;
                        int i30 = (-i26) + transitionParams3.left;
                        lVar.h = i30;
                        int i31 = (-i27) + transitionParams3.right;
                        lVar.i = i31;
                        lVar.j = true;
                        transitionParams3.backgroundChangeBounds = true;
                        transitionParams3.offsetTop = i28;
                        transitionParams3.offsetBottom = i29;
                        transitionParams3.offsetLeft = i30;
                        transitionParams3.offsetRight = i31;
                        transitionParams3.captionEnterProgress = transitionParams3.drawCaptionLayout ? 1.0f : f7;
                        mm0Var2.setClipChildren(false);
                        mm0Var2.invalidate();
                    }
                    transitionParams3.drawBackgroundForDeletedItems = z15;
                }
            }
            Integer valueOf = Integer.valueOf(t1Var.getMessageObject().getId());
            HashMap hashMap = this.H;
            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hashMap.get(valueOf);
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                hashMap.remove(Integer.valueOf(t1Var.getMessageObject().getId()));
                if (transitionParams.v0) {
                    int backgroundDrawableLeft2 = t1Var.getBackgroundDrawableLeft() + t1Var.getLeft();
                    int backgroundDrawableRight2 = t1Var.getBackgroundDrawableRight() + t1Var.getLeft();
                    int backgroundDrawableTop2 = t1Var.getBackgroundDrawableTop() + t1Var.getPaddingTop() + t1Var.getTop();
                    int backgroundDrawableBottom2 = t1Var.getBackgroundDrawableBottom() + t1Var.getPaddingTop() + t1Var.getTop();
                    lVar.w = true;
                    transitionParams.w0 = true;
                    lVar.s = backgroundDrawableLeft2 - transitionParams4.left;
                    lVar.t = backgroundDrawableRight2 - transitionParams4.right;
                    lVar.u = backgroundDrawableTop2 - transitionParams4.top;
                    lVar.v = backgroundDrawableBottom2 - transitionParams4.bottom;
                    lVar.l = false;
                    transitionParams.g0 = (int) ((-r6) - t1Var.getAnimationOffsetX());
                    transitionParams.h0 = (int) ((-lVar.t) - t1Var.getAnimationOffsetX());
                    transitionParams.j0 = (int) ((-lVar.u) - t1Var.getTranslationY());
                    transitionParams.i0 = (int) ((-lVar.v) - t1Var.getTranslationY());
                    transitionParams.C0 = true;
                    mm0Var.setClipChildren(false);
                    mm0Var.invalidate();
                } else {
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition = t1Var.L;
            if (transitionParams.y0 != (t1Var.k8 || t1Var.J || (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && t1Var.K.isDocuments))) {
                z10 = true;
                lVar.k = true;
                f14 = f7;
                transitionParams.z0 = f14;
            } else {
                f14 = f7;
                z10 = true;
            }
            boolean f19 = transitionParams.f();
            lVar.m = f19;
            if (f19) {
                transitionParams.g = z10;
                transitionParams.K1 = f14;
            }
            if (i15 == 0 && i20 == 0 && !lVar.n && !lVar.w && !lVar.j && !lVar.k && !lVar.l && !f19) {
                v(b1Var);
                return false;
            }
        } else if (v0Var2 != null) {
            u0 transitionParams5 = v0Var2.getTransitionParams();
            transitionParams5.getClass();
            if (i19 != 0) {
                view2.setTranslationX(-i19);
            }
            boolean a2 = !transitionParams5.a ? false : transitionParams5.d.E0.a();
            lVar.m = a2;
            if (a2) {
                transitionParams5.b = true;
                transitionParams5.c = 0.0f;
            }
            if (i19 == 0 && i20 == 0 && !a2) {
                v(b1Var);
                return false;
            }
        } else if (view2 instanceof g0) {
            ((g0) view2).setAnimating(true);
        } else if (view2 instanceof ya) {
            ((ya) view2).setAnimating(true);
        } else {
            if (i19 == 0 && i20 == 0) {
                v(b1Var);
                return false;
            }
            if (i19 != 0) {
                view2.setTranslationX(-i19);
            }
        }
        this.r.add(lVar);
        F();
        return true;
    }

    @Override // s4.k, s4.e1
    public final void s(b1 b1Var, b2.u0 u0Var) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        super.s(b1Var, u0Var);
        View view = b1Var.a;
        if (u0Var != null) {
            int i10 = u0Var.b;
            int top = view.getTop();
            int left = view.getLeft() - u0Var.a;
            if (top - i10 != 0) {
                view.setTranslationY(-r1);
            }
            if (!(view instanceof t1)) {
                if (left != 0) {
                    view.setTranslationX(-left);
                    return;
                }
                return;
            }
            t1 t1Var = (t1) view;
            if (left != 0) {
                t1Var.setAnimationOffsetX(-left);
            }
            if (u0Var instanceof k) {
                k kVar = (k) u0Var;
                t1Var.T3(kVar.c, kVar.d, kVar.e, kVar.f);
            }
        }
    }
}
