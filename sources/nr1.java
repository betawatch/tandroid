// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class nr1 extends ChatActivityEnterView {
    public int Y7;
    public int Z7;
    public int a8;
    public final /* synthetic */ zu1 b8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr1(zu1 zu1Var, Activity activity, wma wmaVar, zu1 zu1Var2, boolean z, vnb vnbVar) {
        super(activity, wmaVar, zu1Var2, z, vnbVar);
        this.b8 = zu1Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void R0(boolean z) {
        super.R0(z);
        zu1 zu1Var = this.b8;
        hm1 hm1Var = zu1Var.cc;
        if (hm1Var != null) {
            hl.c3(hm1Var);
            zu1Var.cc = null;
        }
    }

    public final void X2() {
        a aVar;
        k43 k43Var;
        k43 k43Var2;
        zu1 zu1Var = this.b8;
        aVar = ((e) zu1Var).actionBar;
        final byte b = 0;
        if (aVar.z() || zu1Var.c8()) {
            ValueAnimator valueAnimator = zu1Var.N9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = zu1Var.M9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            zu1Var.d0 = 0;
            this.c4 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i = zu1Var.d0;
        final byte b2 = 1;
        if (i != 0 && backgroundTop != i && this.Y7 == zu1Var.m1.getMeasuredHeight()) {
            int i2 = (this.I2 + zu1Var.d0) - backgroundTop;
            setAnimatedTop(i2);
            this.n2.invalidate();
            ValueAnimator valueAnimator3 = zu1Var.M9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                zu1Var.M9.cancel();
            }
            View view = this.v2;
            if (view != null && view.getVisibility() == 0) {
                this.v2.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.v2.getLayoutParams().height) + this.I2);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i2, 0.0f);
            zu1Var.M9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: mr1
                public final /* synthetic */ nr1 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    byte b3 = b;
                    nr1 nr1Var = this.b;
                    switch (b3) {
                        case 0:
                            zu1 zu1Var2 = nr1Var.b8;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            nr1Var.setAnimatedTop((int) floatValue);
                            View view2 = nr1Var.v2;
                            if (view2 == null || view2.getVisibility() != 0) {
                                zu1Var2.O7();
                                zu1Var2.Q7();
                            } else {
                                nr1Var.v2.setTranslationY(((1.0f - nr1Var.getTopViewEnterProgress()) * nr1Var.v2.getLayoutParams().height) + floatValue);
                            }
                            nr1Var.n2.invalidate();
                            nr1Var.invalidate();
                            break;
                        default:
                            nr1Var.F0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            zu1Var.M9.addListener(new jb1((Object) this, (byte) 6));
            zu1Var.M9.setDuration(H0());
            ValueAnimator valueAnimator4 = zu1Var.M9;
            k43 k43Var3 = bb2.V;
            if (this.F1 > 0 && SystemClock.uptimeMillis() < this.F1 && (k43Var2 = this.G1) != null) {
                k43Var3 = k43Var2;
            }
            valueAnimator4.setInterpolator(k43Var3);
            zu1Var.M9.setStartDelay(getLineAnimationDelay());
            if (!zu1Var.L9) {
                zu1Var.M9.start();
            }
            zu1Var.O7();
            zu1Var.Q7();
            zu1Var.d0 = 0;
        } else if (this.Y7 != zu1Var.m1.getMeasuredHeight()) {
            zu1Var.d0 = 0;
        }
        if (this.c4) {
            float scrollY = (this.a8 - this.F0.getScrollY()) + (this.Z7 - this.F0.getMeasuredHeight());
            tx1 tx1Var = this.F0;
            tx1Var.setOffsetY(tx1Var.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: mr1
                public final /* synthetic */ nr1 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator42) {
                    byte b3 = b2;
                    nr1 nr1Var = this.b;
                    switch (b3) {
                        case 0:
                            zu1 zu1Var2 = nr1Var.b8;
                            float floatValue = ((Float) valueAnimator42.getAnimatedValue()).floatValue();
                            nr1Var.setAnimatedTop((int) floatValue);
                            View view2 = nr1Var.v2;
                            if (view2 == null || view2.getVisibility() != 0) {
                                zu1Var2.O7();
                                zu1Var2.Q7();
                            } else {
                                nr1Var.v2.setTranslationY(((1.0f - nr1Var.getTopViewEnterProgress()) * nr1Var.v2.getLayoutParams().height) + floatValue);
                            }
                            nr1Var.n2.invalidate();
                            nr1Var.invalidate();
                            break;
                        default:
                            nr1Var.F0.setOffsetY(((Float) valueAnimator42.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator5 = zu1Var.N9;
            if (valueAnimator5 != null) {
                valueAnimator5.cancel();
            }
            zu1Var.N9 = ofFloat2;
            ofFloat2.setDuration(H0());
            k43 k43Var4 = bb2.V;
            if (this.F1 > 0 && SystemClock.uptimeMillis() < this.F1 && (k43Var = this.G1) != null) {
                k43Var4 = k43Var;
            }
            ofFloat2.setInterpolator(k43Var4);
            ofFloat2.setStartDelay(getLineAnimationDelay());
            ofFloat2.start();
            this.c4 = false;
        }
        this.Y7 = zu1Var.m1.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void f1(float f) {
        this.b8.C5();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h1(int i, int i2) {
        a aVar;
        a aVar2;
        zu1 zu1Var = this.b8;
        if (zu1Var.a0 != null) {
            if (zu1Var.A0 != null) {
                if (zu1Var.bb > 0.0f) {
                    return;
                }
                aVar = ((e) zu1Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((e) zu1Var).actionBar;
                    if (aVar2.z()) {
                        return;
                    }
                }
            }
            this.c4 = true;
            this.Z7 = this.F0.getMeasuredHeight();
            this.a8 = this.F0.getScrollY();
            zu1Var.m1.invalidate();
            zu1Var.d0 = zu1Var.a0.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void o1() {
        if (this.b8.cb != null) {
            return;
        }
        super.o1();
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
        zu1 zu1Var = this.b8;
        ykf ykfVar = zu1Var.xd;
        boolean z = false;
        boolean z2 = i == 0;
        if (getMeasuredWidth() > 0 && !zu1Var.nd) {
            z = true;
        }
        ykfVar.s(1, z2, z);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean u1() {
        return this.b8.f6;
    }
}
