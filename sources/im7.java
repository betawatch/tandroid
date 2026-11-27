// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class im7 extends q9c implements t94 {
    public final int n3;
    public final int o3;
    public v94 p3;
    public float q3;
    public float r3;
    public float s3;
    public boolean t3;
    public boolean u3;
    public boolean v3;
    public boolean w3;
    public ValueAnimator x3;
    public boolean y3;
    public final /* synthetic */ lm7 z3;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public im7(lm7 lm7Var, Context context, int i, f fVar, bf bfVar, wg wgVar) {
        super(context, r2, r3, false, fVar, bfVar, wgVar, r8);
        int i2;
        int i3;
        vnb vnbVar;
        this.z3 = lm7Var;
        i2 = ((e) lm7Var).currentAccount;
        i3 = ((e) lm7Var).classGuid;
        vnbVar = ((e) lm7Var).resourceProvider;
        this.n3 = i;
        this.o3 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // d79
    public final boolean J0(View view, float f, float f2) {
        if (!(view instanceof v94)) {
            return true;
        }
        v94 v94Var = (v94) view;
        HorizontalScrollView horizontalScrollView = v94Var.y;
        return v94Var.R <= 0.0f || horizontalScrollView.getVisibility() != 0 || f2 < ((float) horizontalScrollView.getTop()) || f2 > ((float) horizontalScrollView.getBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d9  */
    /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M1(MotionEvent motionEvent) {
        boolean z;
        char c;
        float f;
        ?? r16;
        ValueAnimator valueAnimator;
        km7 km7Var;
        ValueAnimator valueAnimator2;
        lm7 lm7Var = this.z3;
        km7 km7Var2 = lm7Var.U;
        HashMap hashMap = lm7Var.V;
        int actionMasked = motionEvent.getActionMasked();
        float f2 = ob6.a0 ? -1.0f : 1.0f;
        int i = this.n3;
        if (actionMasked == 0) {
            this.u3 = false;
            this.t3 = false;
            float width = getWidth() * 0.35f;
            boolean z2 = !ob6.a0 ? motionEvent.getX() >= width : motionEvent.getX() <= ((float) getWidth()) - width;
            View F = F(motionEvent.getX(), motionEvent.getY());
            if (z2 && (F instanceof v94) && getScrollState() == 0 && ((valueAnimator2 = this.x3) == null || !valueAnimator2.isRunning())) {
                v94 v94Var = (v94) F;
                if (v94Var.getMessage() != null) {
                    km7 km7Var3 = (km7) hashMap.get(lm7.B0(i, v94Var.getMessage()));
                    if (!(km7Var3 != null ? km7Var3.b() : km7Var2.b())) {
                        this.p3 = v94Var;
                        this.t3 = true;
                        this.q3 = motionEvent.getX();
                        this.r3 = motionEvent.getY();
                        return false;
                    }
                }
            }
        } else if (actionMasked == 2) {
            float x = (motionEvent.getX() - this.q3) * f2;
            float y = motionEvent.getY() - this.r3;
            if (this.u3) {
                N1(x);
                return true;
            }
            if (this.t3) {
                int i2 = this.o3;
                if (x >= (-i2)) {
                    float f3 = i2;
                    if (Math.abs(y) <= f3 || Math.abs(y) < Math.abs(x)) {
                        if (x > f3 && x > Math.abs(y) * 1.5f) {
                            this.t3 = false;
                            this.u3 = true;
                            this.v3 = false;
                            this.w3 = !lm7Var.t0(i, this.p3.getMessage());
                            this.q3 = motionEvent.getX() - (f2 * f3);
                            getParent().requestDisallowInterceptTouchEvent(true);
                            K0(true);
                            N1(f3);
                            return true;
                        }
                    }
                }
                this.t3 = false;
                return false;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.t3 = false;
            if (this.u3) {
                this.u3 = false;
                boolean z3 = actionMasked == 1 && this.v3;
                v94 v94Var2 = this.p3;
                r47 message = v94Var2.getMessage();
                boolean z4 = this.w3;
                if (z3) {
                    r47 message2 = v94Var2.getMessage();
                    jm7 jm7Var = lm7Var.b[i];
                    if (message2 != null) {
                        boolean z5 = true;
                        z = z5;
                        if (jm7Var.f != null) {
                            String B0 = lm7.B0(i, message2);
                            km7 km7Var4 = (km7) hashMap.get(B0);
                            c = 0;
                            if (km7Var4 == null) {
                                f = 0.0f;
                                km7Var = new km7(lm7Var, km7Var2.a, km7Var2.b);
                                hashMap.put(B0, km7Var);
                            } else {
                                f = 0.0f;
                                km7Var = km7Var4;
                            }
                            jm7Var.f.getClass();
                            int S = RecyclerView.S(v94Var2);
                            if (S != -1) {
                                fm7 fm7Var = new fm7();
                                fm7Var.a = S;
                                fm7Var.e = v94Var2.getTop();
                                fm7Var.d = km7Var;
                                fm7Var.f = km7Var.a;
                                lm7Var.X[i] = fm7Var;
                            }
                            try {
                                View view = lm7Var.fragmentView;
                                if (view != null) {
                                    view.performHapticFeedback(3, 2);
                                }
                            } catch (Exception unused) {
                            }
                            if (km7Var.b <= 0.5f) {
                                lm7Var.F0(lm7Var.n0(i, message2, "expand", null));
                            }
                            km7Var.a(km7Var.b > 0.5f ? f : 1.0f);
                            r16 = z5;
                            valueAnimator = this.x3;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            float[] fArr = new float[2];
                            fArr[c] = this.s3;
                            fArr[r16] = f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            this.x3 = ofFloat;
                            ofFloat.addUpdateListener(new hm7(v94Var2, message, z4));
                            this.x3.setDuration(z3 ? 315L : 300L);
                            this.x3.setInterpolator(k43.h);
                            this.x3.start();
                            return r16;
                        }
                        c = 0;
                        f = 0.0f;
                        r16 = z;
                        valueAnimator = this.x3;
                        if (valueAnimator != null) {
                        }
                        float[] fArr2 = new float[2];
                        fArr2[c] = this.s3;
                        fArr2[r16] = f;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
                        this.x3 = ofFloat2;
                        ofFloat2.addUpdateListener(new hm7(v94Var2, message, z4));
                        this.x3.setDuration(z3 ? 315L : 300L);
                        this.x3.setInterpolator(k43.h);
                        this.x3.start();
                        return r16;
                    }
                }
                z = true;
                c = 0;
                f = 0.0f;
                r16 = z;
                valueAnimator = this.x3;
                if (valueAnimator != null) {
                }
                float[] fArr22 = new float[2];
                fArr22[c] = this.s3;
                fArr22[r16] = f;
                ValueAnimator ofFloat22 = ValueAnimator.ofFloat(fArr22);
                this.x3 = ofFloat22;
                ofFloat22.addUpdateListener(new hm7(v94Var2, message, z4));
                this.x3.setDuration(z3 ? 315L : 300L);
                this.x3.setInterpolator(k43.h);
                this.x3.start();
                return r16;
            }
        }
        return false;
    }

    public final void N1(float f) {
        float L = hl.L(88.0f);
        float max = Math.max(0.0f, f);
        if (max > L) {
            max = qd4.A(max, L, 0.3f, L);
        }
        this.s3 = max;
        boolean z = max >= L;
        if (z != this.v3) {
            this.v3 = z;
            if (z) {
                try {
                    View view = this.z3.fragmentView;
                    if (view != null) {
                        view.performHapticFeedback(3, 2);
                    }
                } catch (Exception unused) {
                }
            }
        }
        this.p3.o(this.w3, max);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.y3 && (view instanceof v94) && ((v94) view).n0) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView
    public final void i0(View view) {
        super.i0(view);
        if (view instanceof v94) {
            ((v94) view).p();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m(Canvas canvas, View view, long j) {
        this.y3 = true;
        drawChild(canvas, view, j);
        this.y3 = false;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (M1(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.u3) {
            M1(motionEvent);
            return true;
        }
        if (motionEvent.getActionMasked() == 0 || !M1(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
        return true;
    }
}
