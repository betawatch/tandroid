// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.a;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class clc extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final /* synthetic */ dlc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clc(dlc dlcVar, Context context) {
        super(context);
        this.f = dlcVar;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new yi((byte) 22));
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        dlc dlcVar = this.f;
        hmc hmcVar = dlcVar.r;
        hmc hmcVar2 = dlcVar.s;
        hmcVar.setPivotX(hmcVar2.getMeasuredWidth());
        hmcVar.setPivotY(hmcVar2.getMeasuredHeight());
        hmcVar.setTranslationX((1.0f / getScaleX()) * (-hl.L(4.0f)) * dlcVar.w);
        hmcVar.setTranslationY((1.0f / getScaleY()) * (-hl.L(4.0f)) * dlcVar.w);
        hmcVar.setRoundCorners((1.0f / getScaleY()) * hl.L(8.0f) * dlcVar.w);
        hmcVar.setScaleX(((1.0f - dlcVar.w) * 0.6f) + 0.4f);
        hmcVar.setScaleY(((1.0f - dlcVar.w) * 0.6f) + 0.4f);
        hmcVar.setAlpha(Math.min(1.0f, 1.0f - dlcVar.w));
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = hl.L(16.0f);
        this.c = hl.L(16.0f);
        this.d = hl.L(60.0f);
        this.e = hl.L(16.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r4 != 3) goto L61;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        dlc dlcVar = this.f;
        if (dlc.T || dlc.U == null) {
            return false;
        }
        hl.r(dlcVar.O);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    dlc dlcVar2 = this.f;
                    float f = rawX - dlcVar2.J;
                    float f2 = rawY - dlcVar2.K;
                    if (!dlcVar2.L) {
                        float f3 = (f2 * f2) + (f * f);
                        float f4 = this.a;
                        if (f3 > f4 * f4) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            dlcVar2 = this.f;
                            dlcVar2.L = true;
                            dlcVar2.J = rawX;
                            dlcVar2.K = rawY;
                            f = 0.0f;
                            f2 = 0.0f;
                        }
                    }
                    if (dlcVar2.L) {
                        WindowManager.LayoutParams layoutParams = dlcVar2.d;
                        layoutParams.x = (int) (layoutParams.x + f);
                        layoutParams.y = (int) (layoutParams.y + f2);
                        dlcVar2.J = rawX;
                        dlcVar2.K = rawY;
                        hl.N3(dlcVar2.c, dlcVar2.a, layoutParams);
                        return true;
                    }
                }
            }
            AnimatorSet animatorSet = this.f.P;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (motionEvent.getAction() == 1 && !this.f.L && System.currentTimeMillis() - this.f.M < 150) {
                Context context = getContext();
                if (context instanceof LaunchActivity) {
                    if (a.x) {
                        Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                        intent.setAction("voip");
                        context.startActivity(intent);
                    } else {
                        mkc.n((Activity) context, this.f.N);
                    }
                }
                this.f.L = false;
                return false;
            }
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
                Point point = hl.q;
                int i = point.x;
                int i2 = point.y + dlc.W;
                float f5 = this.d;
                float f6 = this.e;
                dlc dlcVar3 = this.f;
                float left = dlcVar3.b.getLeft() + dlcVar3.d.x;
                float measuredWidth = this.f.b.getMeasuredWidth() + left;
                dlc dlcVar4 = this.f;
                float top = dlcVar4.b.getTop() + dlcVar4.d.y;
                float measuredHeight = this.f.b.getMeasuredHeight() + top;
                this.f.P = new AnimatorSet();
                float f7 = this.b;
                if (left < f7) {
                    dlc dlcVar5 = this.f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(dlcVar5.d.x, f7 - dlcVar5.b.getLeft());
                    ofFloat.addUpdateListener(this.f.Q);
                    this.f.P.playTogether(ofFloat);
                } else if (measuredWidth > i - this.c) {
                    dlc dlcVar6 = this.f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(dlcVar6.d.x, (i - dlcVar6.b.getRight()) - this.c);
                    ofFloat2.addUpdateListener(this.f.Q);
                    this.f.P.playTogether(ofFloat2);
                }
                if (top < f5) {
                    dlc dlcVar7 = this.f;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(dlcVar7.d.y, f5 - dlcVar7.b.getTop());
                    ofFloat3.addUpdateListener(this.f.R);
                    this.f.P.playTogether(ofFloat3);
                } else if (measuredHeight > i2 - f6) {
                    dlc dlcVar8 = this.f;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(dlcVar8.d.y, (i2 - dlcVar8.b.getMeasuredHeight()) - f6);
                    ofFloat4.addUpdateListener(this.f.R);
                    this.f.P.playTogether(ofFloat4);
                }
                this.f.P.setDuration(150L).setInterpolator(k43.f);
                this.f.P.start();
            }
            this.f.L = false;
            dlc.U.getClass();
            return true;
        }
        dlc dlcVar9 = this.f;
        dlcVar9.J = rawX;
        dlcVar9.K = rawY;
        dlcVar9.M = System.currentTimeMillis();
        AnimatorSet animatorSet2 = this.f.P;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        return true;
    }
}
