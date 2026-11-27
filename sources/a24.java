// default package

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class a24 extends EditTextBoldCursor {
    public final /* synthetic */ byte N1;
    public final /* synthetic */ c24 O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a24(c24 c24Var, Context context, int i) {
        super(context);
        this.O1 = c24Var;
        this.N1 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        c24 c24Var;
        View view;
        x46 x46Var;
        ?? r16;
        d79 d79Var;
        c24 c24Var2;
        int i2;
        boolean z;
        p14 p14Var;
        c24 c24Var3 = this.O1;
        o24 o24Var = c24Var3.H;
        a24 a24Var = c24Var3.d;
        if (!a24Var.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            int i3 = 2;
            if (o24Var.u1.z()) {
                i = 2;
            } else {
                d79 d79Var2 = o24Var.E0;
                d79 d79Var3 = o24Var.Q;
                t14 t14Var = o24Var.k0;
                d79 d79Var4 = o24Var.i0;
                AnimatorSet animatorSet = o24Var.N0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    o24Var.N0 = null;
                }
                boolean z2 = false;
                o24Var.J0 = false;
                o24Var.r0 = false;
                o24Var.d0 = false;
                int i4 = 0;
                while (i4 < 3) {
                    if (i4 == 0) {
                        c24Var = o24Var.W;
                        view = o24Var.J;
                        x46Var = o24Var.R;
                        r16 = z2;
                        d79Var = d79Var3;
                    } else if (i4 == 1) {
                        c24Var = o24Var.p0;
                        view = o24Var.q0;
                        x46Var = o24Var.j0;
                        r16 = z2;
                        d79Var = d79Var4;
                    } else {
                        c24Var = o24Var.H0;
                        view = o24Var.C0;
                        x46Var = o24Var.F0;
                        r16 = z2;
                        d79Var = d79Var2;
                    }
                    if (c24Var == null) {
                        c24Var2 = c24Var3;
                        i2 = i3;
                        z = r16;
                    } else if (c24Var3 == c24Var && (p14Var = o24Var.u1) != null && p14Var.A()) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        o24Var.N0 = animatorSet2;
                        Property property = View.TRANSLATION_Y;
                        if (view == null || i4 == i3) {
                            c24Var2 = c24Var3;
                            float f = i4 == i3 ? 0.0f : -hl.L(36.0f);
                            float[] fArr = new float[1];
                            fArr[r16] = f;
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d79Var, (Property<d79, Float>) property, fArr);
                            float[] fArr2 = new float[1];
                            fArr2[r16] = hl.L(0.0f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c24Var, (Property<c24, Float>) property, fArr2);
                            Animator[] animatorArr = new Animator[2];
                            animatorArr[r16] = ofFloat;
                            animatorArr[1] = ofFloat2;
                            animatorSet2.playTogether(animatorArr);
                        } else {
                            int i5 = i3;
                            c24Var2 = c24Var3;
                            float[] fArr3 = new float[1];
                            fArr3[r16] = -hl.L(40.0f);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                            float[] fArr4 = new float[1];
                            fArr4[r16] = -hl.L(36.0f);
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(d79Var, (Property<d79, Float>) property, fArr4);
                            float[] fArr5 = new float[1];
                            fArr5[r16] = hl.L(0.0f);
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(c24Var, (Property<c24, Float>) property, fArr5);
                            Animator[] animatorArr2 = new Animator[3];
                            animatorArr2[r16] = ofFloat3;
                            animatorArr2[1] = ofFloat4;
                            animatorArr2[i5] = ofFloat5;
                            animatorSet2.playTogether(animatorArr2);
                        }
                        o24Var.N0.setDuration(220L);
                        o24Var.N0.setInterpolator(k43.f);
                        o24Var.N0.addListener(new v5(o24Var, d79Var, (byte) 20));
                        o24Var.N0.start();
                        z = r16;
                        i2 = 2;
                    } else {
                        c24Var2 = c24Var3;
                        c24Var.setTranslationY(hl.L(0.0f));
                        i2 = 2;
                        if (view != null && i4 != 2) {
                            view.setTranslationY(-hl.L(40.0f));
                        }
                        if (d79Var == d79Var2) {
                            int i6 = r16;
                            d79Var.setPadding(i6, i6, i6, o24Var.q2);
                        } else {
                            int i7 = r16;
                            if (d79Var == d79Var3) {
                                d79Var.setPadding(hl.L(5.0f), i7, hl.L(5.0f), o24Var.q2);
                            } else if (d79Var == d79Var4) {
                                d79Var.setPadding(i7, o24Var.c1, i7, o24Var.q2);
                            }
                        }
                        if (d79Var == d79Var4) {
                            boolean z3 = o24Var.o0.y.size() > 0;
                            t14Var.L = z3;
                            if (z3) {
                                t14Var.G("", true);
                                if (d79Var4.getAdapter() != t14Var) {
                                    d79Var4.setAdapter(t14Var);
                                }
                            }
                        }
                        z = false;
                        x46Var.g1(0, 0);
                    }
                    i4++;
                    i3 = i2;
                    z2 = z;
                    c24Var3 = c24Var2;
                }
                i = i3;
                o24Var.L(z2);
            }
            o24Var.u1.j(this.N1 == 1 ? i : 1);
            a24Var.requestFocus();
            hl.E3(a24Var);
        }
        return super.onTouchEvent(motionEvent);
    }
}
