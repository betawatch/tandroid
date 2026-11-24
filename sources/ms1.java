// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ms1 extends ChatActivityEnterView {
    public int A7;
    public int B7;
    public int C7;
    public final /* synthetic */ yv1 D7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms1(yv1 yv1Var, Activity activity, ela elaVar, yv1 yv1Var2, boolean z, ylb ylbVar) {
        super(activity, elaVar, yv1Var2, z, ylbVar);
        this.D7 = yv1Var;
    }

    public final void M2() {
        a aVar;
        d53 d53Var;
        d53 d53Var2;
        yv1 yv1Var = this.D7;
        aVar = ((d) yv1Var).actionBar;
        final byte b = 0;
        if (aVar.y() || yv1Var.c8()) {
            ValueAnimator valueAnimator = yv1Var.N9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = yv1Var.M9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            yv1Var.d0 = 0;
            this.d4 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i = yv1Var.d0;
        final byte b2 = 1;
        if (i != 0 && backgroundTop != i && this.A7 == yv1Var.m1.getMeasuredHeight()) {
            int i2 = (this.J2 + yv1Var.d0) - backgroundTop;
            setAnimatedTop(i2);
            this.o2.invalidate();
            ValueAnimator valueAnimator3 = yv1Var.M9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                yv1Var.M9.cancel();
            }
            View view = this.w2;
            if (view != null && view.getVisibility() == 0) {
                this.w2.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.w2.getLayoutParams().height) + this.J2);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i2, 0.0f);
            yv1Var.M9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ls1
                public final /* synthetic */ ms1 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    byte b3 = b;
                    ms1 ms1Var = this.b;
                    switch (b3) {
                        case 0:
                            yv1 yv1Var2 = ms1Var.D7;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            ms1Var.setAnimatedTop((int) floatValue);
                            View view2 = ms1Var.w2;
                            if (view2 == null || view2.getVisibility() != 0) {
                                yv1Var2.O7();
                                yv1Var2.Q7();
                            } else {
                                ms1Var.w2.setTranslationY(((1.0f - ms1Var.getTopViewEnterProgress()) * ms1Var.w2.getLayoutParams().height) + floatValue);
                            }
                            ms1Var.o2.invalidate();
                            ms1Var.invalidate();
                            break;
                        default:
                            ms1Var.F0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            yv1Var.M9.addListener(new b91((Object) this, (byte) 8));
            yv1Var.M9.setDuration(D0());
            ValueAnimator valueAnimator4 = yv1Var.M9;
            d53 d53Var3 = wb2.V;
            if (this.G1 > 0 && SystemClock.uptimeMillis() < this.G1 && (d53Var2 = this.H1) != null) {
                d53Var3 = d53Var2;
            }
            valueAnimator4.setInterpolator(d53Var3);
            yv1Var.M9.setStartDelay(getLineAnimationDelay());
            if (!yv1Var.L9) {
                yv1Var.M9.start();
            }
            yv1Var.O7();
            yv1Var.Q7();
            yv1Var.d0 = 0;
        } else if (this.A7 != yv1Var.m1.getMeasuredHeight()) {
            yv1Var.d0 = 0;
        }
        if (this.d4) {
            float scrollY = (this.C7 - this.F0.getScrollY()) + (this.B7 - this.F0.getMeasuredHeight());
            sy1 sy1Var = this.F0;
            sy1Var.setOffsetY(sy1Var.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ls1
                public final /* synthetic */ ms1 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator42) {
                    byte b3 = b2;
                    ms1 ms1Var = this.b;
                    switch (b3) {
                        case 0:
                            yv1 yv1Var2 = ms1Var.D7;
                            float floatValue = ((Float) valueAnimator42.getAnimatedValue()).floatValue();
                            ms1Var.setAnimatedTop((int) floatValue);
                            View view2 = ms1Var.w2;
                            if (view2 == null || view2.getVisibility() != 0) {
                                yv1Var2.O7();
                                yv1Var2.Q7();
                            } else {
                                ms1Var.w2.setTranslationY(((1.0f - ms1Var.getTopViewEnterProgress()) * ms1Var.w2.getLayoutParams().height) + floatValue);
                            }
                            ms1Var.o2.invalidate();
                            ms1Var.invalidate();
                            break;
                        default:
                            ms1Var.F0.setOffsetY(((Float) valueAnimator42.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator5 = yv1Var.N9;
            if (valueAnimator5 != null) {
                valueAnimator5.cancel();
            }
            yv1Var.N9 = ofFloat2;
            ofFloat2.setDuration(D0());
            d53 d53Var4 = wb2.V;
            if (this.G1 > 0 && SystemClock.uptimeMillis() < this.G1 && (d53Var = this.H1) != null) {
                d53Var4 = d53Var;
            }
            ofFloat2.setInterpolator(d53Var4);
            ofFloat2.setStartDelay(getLineAnimationDelay());
            ofFloat2.start();
            this.d4 = false;
        }
        this.A7 = yv1Var.m1.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void N0(boolean z) {
        super.N0(z);
        yv1 yv1Var = this.D7;
        en1 en1Var = yv1Var.Zb;
        if (en1Var != null) {
            gm.c3(en1Var);
            yv1Var.Zb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void c1(float f) {
        this.D7.D5();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void e1(int i, int i2) {
        a aVar;
        a aVar2;
        yv1 yv1Var = this.D7;
        if (yv1Var.a0 != null) {
            if (yv1Var.A0 != null) {
                if (yv1Var.bb > 0.0f) {
                    return;
                }
                aVar = ((d) yv1Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((d) yv1Var).actionBar;
                    if (aVar2.y()) {
                        return;
                    }
                }
            }
            this.d4 = true;
            this.B7 = this.F0.getMeasuredHeight();
            this.C7 = this.F0.getScrollY();
            yv1Var.m1.invalidate();
            yv1Var.d0 = yv1Var.a0.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void j1() {
        if (this.D7.cb != null) {
            return;
        }
        super.j1();
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

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean p1() {
        return this.D7.f6;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        yv1 yv1Var = this.D7;
        jif jifVar = yv1Var.ud;
        boolean z = false;
        boolean z2 = i == 0;
        if (getMeasuredWidth() > 0 && !yv1Var.kd) {
            z = true;
        }
        jifVar.s(1, z2, z);
    }
}
