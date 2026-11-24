// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ar1 extends ChatActivityEnterView {
    public int s7;
    public int t7;
    public int u7;
    public final /* synthetic */ mu1 v7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar1(mu1 mu1Var, Activity activity, cja cjaVar, mu1 mu1Var2, boolean z, wjb wjbVar) {
        super(activity, cjaVar, mu1Var2, z, wjbVar);
        this.v7 = mu1Var;
    }

    public final void H2() {
        a aVar;
        s33 s33Var;
        s33 s33Var2;
        mu1 mu1Var = this.v7;
        aVar = ((d) mu1Var).actionBar;
        final byte b = 0;
        if (aVar.y() || mu1Var.T7()) {
            ValueAnimator valueAnimator = mu1Var.N9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = mu1Var.M9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            mu1Var.d0 = 0;
            this.d4 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i = mu1Var.d0;
        final byte b2 = 1;
        if (i != 0 && backgroundTop != i && this.s7 == mu1Var.m1.getMeasuredHeight()) {
            int i2 = (this.J2 + mu1Var.d0) - backgroundTop;
            setAnimatedTop(i2);
            this.o2.invalidate();
            ValueAnimator valueAnimator3 = mu1Var.M9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                mu1Var.M9.cancel();
            }
            View view = this.w2;
            if (view != null && view.getVisibility() == 0) {
                this.w2.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.w2.getLayoutParams().height) + this.J2);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i2, 0.0f);
            mu1Var.M9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zq1
                public final /* synthetic */ ar1 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    byte b3 = b;
                    ar1 ar1Var = this.b;
                    switch (b3) {
                        case 0:
                            mu1 mu1Var2 = ar1Var.v7;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            ar1Var.setAnimatedTop((int) floatValue);
                            View view2 = ar1Var.w2;
                            if (view2 == null || view2.getVisibility() != 0) {
                                mu1Var2.G7();
                                mu1Var2.I7();
                            } else {
                                ar1Var.w2.setTranslationY(((1.0f - ar1Var.getTopViewEnterProgress()) * ar1Var.w2.getLayoutParams().height) + floatValue);
                            }
                            ar1Var.o2.invalidate();
                            ar1Var.invalidate();
                            break;
                        default:
                            ar1Var.F0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            mu1Var.M9.addListener(new bb1((Object) this, (byte) 6));
            mu1Var.M9.setDuration(D0());
            ValueAnimator valueAnimator4 = mu1Var.M9;
            s33 s33Var3 = la2.V;
            if (this.G1 > 0 && SystemClock.uptimeMillis() < this.G1 && (s33Var2 = this.H1) != null) {
                s33Var3 = s33Var2;
            }
            valueAnimator4.setInterpolator(s33Var3);
            mu1Var.M9.setStartDelay(getLineAnimationDelay());
            if (!mu1Var.L9) {
                mu1Var.M9.start();
            }
            mu1Var.G7();
            mu1Var.I7();
            mu1Var.d0 = 0;
        } else if (this.s7 != mu1Var.m1.getMeasuredHeight()) {
            mu1Var.d0 = 0;
        }
        if (this.d4) {
            float scrollY = (this.u7 - this.F0.getScrollY()) + (this.t7 - this.F0.getMeasuredHeight());
            ex1 ex1Var = this.F0;
            ex1Var.setOffsetY(ex1Var.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zq1
                public final /* synthetic */ ar1 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator42) {
                    byte b3 = b2;
                    ar1 ar1Var = this.b;
                    switch (b3) {
                        case 0:
                            mu1 mu1Var2 = ar1Var.v7;
                            float floatValue = ((Float) valueAnimator42.getAnimatedValue()).floatValue();
                            ar1Var.setAnimatedTop((int) floatValue);
                            View view2 = ar1Var.w2;
                            if (view2 == null || view2.getVisibility() != 0) {
                                mu1Var2.G7();
                                mu1Var2.I7();
                            } else {
                                ar1Var.w2.setTranslationY(((1.0f - ar1Var.getTopViewEnterProgress()) * ar1Var.w2.getLayoutParams().height) + floatValue);
                            }
                            ar1Var.o2.invalidate();
                            ar1Var.invalidate();
                            break;
                        default:
                            ar1Var.F0.setOffsetY(((Float) valueAnimator42.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator5 = mu1Var.N9;
            if (valueAnimator5 != null) {
                valueAnimator5.cancel();
            }
            mu1Var.N9 = ofFloat2;
            ofFloat2.setDuration(D0());
            s33 s33Var4 = la2.V;
            if (this.G1 > 0 && SystemClock.uptimeMillis() < this.G1 && (s33Var = this.H1) != null) {
                s33Var4 = s33Var;
            }
            ofFloat2.setInterpolator(s33Var4);
            ofFloat2.setStartDelay(getLineAnimationDelay());
            ofFloat2.start();
            this.d4 = false;
        }
        this.s7 = mu1Var.m1.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void N0(boolean z) {
        super.N0(z);
        mu1 mu1Var = this.v7;
        wl1 wl1Var = mu1Var.Rb;
        if (wl1Var != null) {
            gl.c3(wl1Var);
            mu1Var.Rb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void a1(float f) {
        this.v7.w5();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void c1(int i, int i2) {
        a aVar;
        a aVar2;
        mu1 mu1Var = this.v7;
        if (mu1Var.a0 != null) {
            if (mu1Var.A0 != null) {
                if (mu1Var.bb > 0.0f) {
                    return;
                }
                aVar = ((d) mu1Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((d) mu1Var).actionBar;
                    if (aVar2.y()) {
                        return;
                    }
                }
            }
            this.d4 = true;
            this.t7 = this.F0.getMeasuredHeight();
            this.u7 = this.F0.getScrollY();
            mu1Var.m1.invalidate();
            mu1Var.d0 = mu1Var.a0.getBackgroundTop();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h1() {
        if (this.v7.cb != null) {
            return;
        }
        super.h1();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean n1() {
        return this.v7.f6;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        mu1 mu1Var = this.v7;
        igf igfVar = mu1Var.kd;
        boolean z = false;
        boolean z2 = i == 0;
        if (getMeasuredWidth() > 0 && !mu1Var.ad) {
            z = true;
        }
        igfVar.s(1, z2, z);
    }
}
