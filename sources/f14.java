// default package

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class f14 extends EditTextBoldCursor {
    public final /* synthetic */ byte M1;
    public final /* synthetic */ h14 N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f14(h14 h14Var, Context context, int i) {
        super(context);
        this.N1 = h14Var;
        this.M1 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        h14 h14Var;
        View view;
        t26 t26Var;
        ?? r16;
        o39 o39Var;
        h14 h14Var2;
        int i2;
        boolean z;
        u04 u04Var;
        h14 h14Var3 = this.N1;
        t14 t14Var = h14Var3.H;
        f14 f14Var = h14Var3.d;
        if (!f14Var.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            int i3 = 2;
            if (t14Var.u1.z()) {
                i = 2;
            } else {
                o39 o39Var2 = t14Var.E0;
                o39 o39Var3 = t14Var.Q;
                y04 y04Var = t14Var.k0;
                o39 o39Var4 = t14Var.i0;
                AnimatorSet animatorSet = t14Var.N0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    t14Var.N0 = null;
                }
                boolean z2 = false;
                t14Var.J0 = false;
                t14Var.r0 = false;
                t14Var.d0 = false;
                int i4 = 0;
                while (i4 < 3) {
                    if (i4 == 0) {
                        h14Var = t14Var.W;
                        view = t14Var.J;
                        t26Var = t14Var.R;
                        r16 = z2;
                        o39Var = o39Var3;
                    } else if (i4 == 1) {
                        h14Var = t14Var.p0;
                        view = t14Var.q0;
                        t26Var = t14Var.j0;
                        r16 = z2;
                        o39Var = o39Var4;
                    } else {
                        h14Var = t14Var.H0;
                        view = t14Var.C0;
                        t26Var = t14Var.F0;
                        r16 = z2;
                        o39Var = o39Var2;
                    }
                    if (h14Var == null) {
                        h14Var2 = h14Var3;
                        i2 = i3;
                        z = r16;
                    } else if (h14Var3 == h14Var && (u04Var = t14Var.u1) != null && u04Var.A()) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        t14Var.N0 = animatorSet2;
                        Property property = View.TRANSLATION_Y;
                        if (view == null || i4 == i3) {
                            h14Var2 = h14Var3;
                            float f = i4 == i3 ? 0.0f : -gl.L(36.0f);
                            float[] fArr = new float[1];
                            fArr[r16] = f;
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o39Var, (Property<o39, Float>) property, fArr);
                            float[] fArr2 = new float[1];
                            fArr2[r16] = gl.L(0.0f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(h14Var, (Property<h14, Float>) property, fArr2);
                            Animator[] animatorArr = new Animator[2];
                            animatorArr[r16] = ofFloat;
                            animatorArr[1] = ofFloat2;
                            animatorSet2.playTogether(animatorArr);
                        } else {
                            int i5 = i3;
                            h14Var2 = h14Var3;
                            float[] fArr3 = new float[1];
                            fArr3[r16] = -gl.L(40.0f);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                            float[] fArr4 = new float[1];
                            fArr4[r16] = -gl.L(36.0f);
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(o39Var, (Property<o39, Float>) property, fArr4);
                            float[] fArr5 = new float[1];
                            fArr5[r16] = gl.L(0.0f);
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(h14Var, (Property<h14, Float>) property, fArr5);
                            Animator[] animatorArr2 = new Animator[3];
                            animatorArr2[r16] = ofFloat3;
                            animatorArr2[1] = ofFloat4;
                            animatorArr2[i5] = ofFloat5;
                            animatorSet2.playTogether(animatorArr2);
                        }
                        t14Var.N0.setDuration(220L);
                        t14Var.N0.setInterpolator(s33.f);
                        t14Var.N0.addListener(new u5(t14Var, o39Var, (byte) 20));
                        t14Var.N0.start();
                        z = r16;
                        i2 = 2;
                    } else {
                        h14Var2 = h14Var3;
                        h14Var.setTranslationY(gl.L(0.0f));
                        i2 = 2;
                        if (view != null && i4 != 2) {
                            view.setTranslationY(-gl.L(40.0f));
                        }
                        if (o39Var == o39Var2) {
                            int i6 = r16;
                            o39Var.setPadding(i6, i6, i6, t14Var.q2);
                        } else {
                            int i7 = r16;
                            if (o39Var == o39Var3) {
                                o39Var.setPadding(gl.L(5.0f), i7, gl.L(5.0f), t14Var.q2);
                            } else if (o39Var == o39Var4) {
                                o39Var.setPadding(i7, t14Var.c1, i7, t14Var.q2);
                            }
                        }
                        if (o39Var == o39Var4) {
                            boolean z3 = t14Var.o0.y.size() > 0;
                            y04Var.L = z3;
                            if (z3) {
                                y04Var.G("", true);
                                if (o39Var4.getAdapter() != y04Var) {
                                    o39Var4.setAdapter(y04Var);
                                }
                            }
                        }
                        z = false;
                        t26Var.g1(0, 0);
                    }
                    i4++;
                    i3 = i2;
                    z2 = z;
                    h14Var3 = h14Var2;
                }
                i = i3;
                t14Var.M(z2);
            }
            t14Var.u1.j(this.M1 == 1 ? i : 1);
            f14Var.requestFocus();
            gl.F3(f14Var);
        }
        return super.onTouchEvent(motionEvent);
    }
}
