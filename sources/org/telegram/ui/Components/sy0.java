package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class sy0 extends View {
    public int E;
    public boolean F;
    public float G;
    public Animator H;
    public sp0 I;
    public boolean J;
    public Path K;
    public StaticLayout a;
    public TextPaint b;
    public Paint c;
    public int d;
    public OvershootInterpolator e;
    public float f;
    public int h;
    public int n;
    public int r;
    public float s;
    public float w;
    public int x;
    public int y;

    public static void b(Path path, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11) {
        path.reset();
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        float f16 = f12 - f10;
        float f17 = f13 - f11;
        float f18 = f16 / 2.0f;
        if (f14 > f18) {
            f14 = f18;
        }
        float f19 = f17 / 2.0f;
        if (f15 > f19) {
            f15 = f19;
        }
        float f20 = f16 - (f14 * 2.0f);
        float f21 = f17 - (2.0f * f15);
        path.moveTo(f12, f11 + f15);
        if (z11) {
            float f22 = -f15;
            path.rQuadTo(0.0f, f22, -f14, f22);
        } else {
            path.rLineTo(0.0f, -f15);
            path.rLineTo(-f14, 0.0f);
        }
        path.rLineTo(-f20, 0.0f);
        if (z10) {
            float f23 = -f14;
            path.rQuadTo(f23, 0.0f, f23, f15);
        } else {
            path.rLineTo(-f14, 0.0f);
            path.rLineTo(0.0f, f15);
        }
        path.rLineTo(0.0f, f21);
        path.rLineTo(0.0f, f15);
        path.rLineTo(f14, 0.0f);
        path.rLineTo(f20, 0.0f);
        path.rLineTo(f14, 0.0f);
        path.rLineTo(0.0f, -f15);
        path.rLineTo(0.0f, -f21);
        path.close();
    }

    public final void a() {
        Animator animator = this.H;
        if (animator != null) {
            animator.removeAllListeners();
            this.H.cancel();
        }
        this.F = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
        ofFloat.addUpdateListener(new ry0(this, 0));
        ofFloat.addListener(new a60(this, 28));
        this.H = ofFloat;
        ofFloat.start();
    }

    public final void c() {
        sp0 sp0Var = this.I;
        org.telegram.messenger.g0.r(sp0Var);
        Animator animator = this.H;
        if (animator != null) {
            animator.removeAllListeners();
            this.H.cancel();
        }
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            this.J = true;
            return;
        }
        this.F = true;
        setVisibility(0);
        this.G = 0.0f;
        this.f = 0.0f;
        this.x = this.h;
        this.y = this.n;
        this.s = 1.0f;
        this.w = 1.0f;
        invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ry0(this, 1));
        ofFloat.setDuration(210L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ry0(this, 2));
        ofFloat2.setStartDelay(600L);
        ofFloat2.setDuration(250L);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setStartDelay(500L);
        ofFloat3.addUpdateListener(new ry0(this, 3));
        xq xqVar = xq.g;
        ofFloat3.setInterpolator(xqVar);
        ofFloat3.setDuration(500L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat4.setStartDelay(400L);
        ofFloat4.addUpdateListener(new ry0(this, 4));
        ofFloat4.setInterpolator(xqVar);
        ofFloat4.setDuration(900L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        this.H = animatorSet;
        animatorSet.start();
        org.telegram.messenger.g0.i3(sp0Var, 5000L);
    }

    public float getPrepareProgress() {
        return this.G;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i3;
        float f10;
        TextPaint textPaint;
        int i10;
        Path.Direction direction;
        float f11;
        Canvas canvas2 = canvas;
        TextPaint textPaint2 = this.b;
        Paint paint = this.c;
        Path path = this.K;
        if (this.a == null) {
            return;
        }
        super.onDraw(canvas);
        canvas2.save();
        canvas2.translate(this.d, (getMeasuredHeight() - this.a.getHeight()) >> 1);
        if (this.f != 0.0f) {
            StaticLayout staticLayout = this.a;
            int i11 = this.x;
            int i12 = this.y;
            int lineForOffset = staticLayout.getLineForOffset(i11);
            int lineForOffset2 = staticLayout.getLineForOffset(i12);
            int primaryHorizontal = (int) staticLayout.getPrimaryHorizontal(i11);
            int primaryHorizontal2 = (int) staticLayout.getPrimaryHorizontal(i12);
            if (lineForOffset != lineForOffset2) {
                canvas.drawRect(primaryHorizontal, staticLayout.getLineTop(lineForOffset), staticLayout.getLineWidth(lineForOffset), staticLayout.getLineBottom(lineForOffset), paint);
                canvas.drawRect(0.0f, staticLayout.getLineTop(lineForOffset2), primaryHorizontal2, staticLayout.getLineBottom(lineForOffset2), paint);
                while (true) {
                    lineForOffset++;
                    if (lineForOffset >= lineForOffset2) {
                        break;
                    } else {
                        canvas.drawRect(0.0f, staticLayout.getLineTop(lineForOffset), staticLayout.getLineWidth(lineForOffset), staticLayout.getLineBottom(lineForOffset), paint);
                    }
                }
            } else {
                canvas2.drawRect(primaryHorizontal, staticLayout.getLineTop(lineForOffset), primaryHorizontal2, staticLayout.getLineBottom(lineForOffset), paint);
            }
            canvas2 = canvas;
        }
        this.a.draw(canvas2);
        int L = org.telegram.messenger.g0.L(14.0f);
        int lineForOffset3 = this.a.getLineForOffset(this.y);
        this.a.getPrimaryHorizontal(this.y);
        int lineBottom = this.a.getLineBottom(lineForOffset3);
        int i13 = this.y;
        int i14 = this.r;
        if (i13 == i14) {
            b(path, this.a.getPrimaryHorizontal(i14), this.a.getLineTop(lineForOffset3), org.telegram.messenger.g0.N(4.0f) + this.a.getPrimaryHorizontal(this.r), this.a.getLineBottom(lineForOffset3), org.telegram.messenger.g0.N(4.0f), org.telegram.messenger.g0.N(4.0f), false, true);
            canvas2.drawPath(path, paint);
        }
        float interpolation = this.e.getInterpolation(this.f);
        int primaryHorizontal3 = (int) (((this.a.getPrimaryHorizontal(this.n) - this.a.getPrimaryHorizontal(this.r)) * this.w) + com.google.android.recaptcha.internal.a.y(1.0f, this.w, org.telegram.messenger.g0.N(4.0f), this.a.getPrimaryHorizontal(this.r)));
        canvas2.save();
        canvas2.translate(primaryHorizontal3, lineBottom);
        float f12 = L;
        float f13 = f12 / 2.0f;
        canvas2.scale(interpolation, interpolation, f13, f13);
        path.reset();
        Path.Direction direction2 = Path.Direction.CCW;
        path.addCircle(f13, f13, f13, direction2);
        path.addRect(0.0f, 0.0f, f13, f13, direction2);
        canvas2.drawPath(path, textPaint2);
        canvas2.restore();
        int lineForOffset4 = this.a.getLineForOffset(this.x);
        this.a.getPrimaryHorizontal(this.x);
        int lineBottom2 = this.a.getLineBottom(lineForOffset4);
        if (this.x == 0) {
            textPaint = textPaint2;
            f11 = 1.0f;
            i3 = L;
            direction = direction2;
            f10 = f12;
            i10 = lineBottom2;
            b(path, -org.telegram.messenger.g0.L(4.0f), this.a.getLineTop(lineForOffset4), 0.0f, this.a.getLineBottom(lineForOffset4), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), true, false);
            canvas2.drawPath(path, paint);
        } else {
            i3 = L;
            f10 = f12;
            textPaint = textPaint2;
            i10 = lineBottom2;
            direction = direction2;
            f11 = 1.0f;
        }
        canvas2.save();
        float primaryHorizontal4 = this.a.getPrimaryHorizontal(0);
        canvas2.translate(((int) (((this.a.getPrimaryHorizontal(this.h) - this.a.getPrimaryHorizontal(0)) * this.s) + a1.g.D(f11, this.s, org.telegram.messenger.g0.L(4.0f), primaryHorizontal4))) - i3, i10);
        canvas2.scale(interpolation, interpolation, f13, f13);
        path.reset();
        path.addCircle(f13, f13, f13, direction);
        path.addRect(f13, 0.0f, f10, f13, direction);
        canvas2.drawPath(path, textPaint);
        canvas2.restore();
        canvas2.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (getMeasuredWidth() != this.E || this.a == null) {
            Animator animator = this.H;
            if (animator != null) {
                animator.removeAllListeners();
                this.H.cancel();
            }
            String M0 = org.telegram.messenger.bd.M0(2131744202, null);
            Matcher matcher = Pattern.compile("\\*\\*.*\\*\\*").matcher(M0);
            String group = matcher.matches() ? matcher.group() : null;
            String replace = M0.replace("**", "");
            this.a = new StaticLayout(replace, this.b, getMeasuredWidth() - (this.d * 2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = 0;
            this.n = 0;
            if (group != null) {
                this.h = replace.indexOf(group);
            }
            int i11 = this.h;
            if (i11 > 0) {
                this.n = group.length() + i11;
            } else {
                int i12 = 0;
                for (int i13 = 0; i13 < replace.length(); i13++) {
                    if (replace.charAt(i13) == ' ') {
                        i12++;
                        if (i12 == 2) {
                            this.h = i13 + 1;
                        }
                        if (i12 == 3) {
                            this.n = i13 - 1;
                        }
                    }
                }
            }
            if (this.n == 0) {
                this.n = replace.length();
            }
            StaticLayout staticLayout = this.a;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(staticLayout.getLineForOffset(this.n), this.a.getWidth() - 1);
            this.r = offsetForHorizontal;
            this.x = this.h;
            this.y = this.n;
            if (this.F) {
                this.G = 1.0f;
                this.f = 1.0f;
                this.x = 0;
                this.y = offsetForHorizontal;
                this.s = 0.0f;
                this.w = 0.0f;
            } else if (this.J) {
                c();
            }
            this.J = false;
            this.E = getMeasuredWidth();
        }
        int D = org.telegram.messenger.k5.D(8.0f, 2, this.a.getHeight());
        if (D < org.telegram.messenger.g0.L(56.0f)) {
            D = org.telegram.messenger.g0.L(56.0f);
        }
        setMeasuredDimension(getMeasuredWidth(), D);
    }
}
