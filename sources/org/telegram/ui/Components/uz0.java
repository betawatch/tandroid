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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class uz0 extends View {
    public boolean A;
    public float B;
    public Animator C;
    public tp0 D;
    public boolean E;
    public Path F;
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
    public float v;
    public int w;
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
        Animator animator = this.C;
        if (animator != null) {
            animator.removeAllListeners();
            this.C.cancel();
        }
        this.A = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B, 0.0f);
        ofFloat.addUpdateListener(new tz0(this, 0));
        ofFloat.addListener(new r60(this, 27));
        this.C = ofFloat;
        ofFloat.start();
    }

    public final void c() {
        tp0 tp0Var = this.D;
        AndroidUtilities.cancelRunOnUIThread(tp0Var);
        Animator animator = this.C;
        if (animator != null) {
            animator.removeAllListeners();
            this.C.cancel();
        }
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            this.E = true;
            return;
        }
        this.A = true;
        setVisibility(0);
        this.B = 0.0f;
        this.f = 0.0f;
        this.w = this.h;
        this.x = this.n;
        this.s = 1.0f;
        this.v = 1.0f;
        invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new tz0(this, 1));
        ofFloat.setDuration(210L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new tz0(this, 2));
        ofFloat2.setStartDelay(600L);
        ofFloat2.setDuration(250L);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setStartDelay(500L);
        ofFloat3.addUpdateListener(new tz0(this, 3));
        gr grVar = gr.g;
        ofFloat3.setInterpolator(grVar);
        ofFloat3.setDuration(500L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat4.setStartDelay(400L);
        ofFloat4.addUpdateListener(new tz0(this, 4));
        ofFloat4.setInterpolator(grVar);
        ofFloat4.setDuration(900L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        this.C = animatorSet;
        animatorSet.start();
        AndroidUtilities.runOnUIThread(tp0Var, 5000L);
    }

    public float getPrepareProgress() {
        return this.B;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i9;
        float f10;
        TextPaint textPaint;
        int i10;
        Path.Direction direction;
        float f11;
        Canvas canvas2 = canvas;
        TextPaint textPaint2 = this.b;
        Paint paint = this.c;
        Path path = this.F;
        if (this.a == null) {
            return;
        }
        super.onDraw(canvas);
        canvas2.save();
        canvas2.translate(this.d, (getMeasuredHeight() - this.a.getHeight()) >> 1);
        if (this.f != 0.0f) {
            StaticLayout staticLayout = this.a;
            int i11 = this.w;
            int i12 = this.x;
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
        int dp = AndroidUtilities.dp(14.0f);
        int lineForOffset3 = this.a.getLineForOffset(this.x);
        this.a.getPrimaryHorizontal(this.x);
        int lineBottom = this.a.getLineBottom(lineForOffset3);
        int i13 = this.x;
        int i14 = this.r;
        if (i13 == i14) {
            b(path, this.a.getPrimaryHorizontal(i14), this.a.getLineTop(lineForOffset3), AndroidUtilities.dpf2(4.0f) + this.a.getPrimaryHorizontal(this.r), this.a.getLineBottom(lineForOffset3), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), false, true);
            canvas2.drawPath(path, paint);
        }
        float interpolation = this.e.getInterpolation(this.f);
        int primaryHorizontal3 = (int) (((this.a.getPrimaryHorizontal(this.n) - this.a.getPrimaryHorizontal(this.r)) * this.v) + e2.c.z(1.0f, this.v, AndroidUtilities.dpf2(4.0f), this.a.getPrimaryHorizontal(this.r)));
        canvas2.save();
        canvas2.translate(primaryHorizontal3, lineBottom);
        float f12 = dp;
        float f13 = f12 / 2.0f;
        canvas2.scale(interpolation, interpolation, f13, f13);
        path.reset();
        Path.Direction direction2 = Path.Direction.CCW;
        path.addCircle(f13, f13, f13, direction2);
        path.addRect(0.0f, 0.0f, f13, f13, direction2);
        canvas2.drawPath(path, textPaint2);
        canvas2.restore();
        int lineForOffset4 = this.a.getLineForOffset(this.w);
        this.a.getPrimaryHorizontal(this.w);
        int lineBottom2 = this.a.getLineBottom(lineForOffset4);
        if (this.w == 0) {
            i9 = dp;
            textPaint = textPaint2;
            direction = direction2;
            f11 = 1.0f;
            f10 = f12;
            i10 = lineBottom2;
            b(path, -AndroidUtilities.dp(4.0f), this.a.getLineTop(lineForOffset4), 0.0f, this.a.getLineBottom(lineForOffset4), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), true, false);
            canvas2.drawPath(path, paint);
        } else {
            i9 = dp;
            f10 = f12;
            textPaint = textPaint2;
            i10 = lineBottom2;
            direction = direction2;
            f11 = 1.0f;
        }
        canvas2.save();
        float primaryHorizontal4 = this.a.getPrimaryHorizontal(0);
        canvas2.translate(((int) (((this.a.getPrimaryHorizontal(this.h) - this.a.getPrimaryHorizontal(0)) * this.s) + j3.r0.C(f11, this.s, AndroidUtilities.dp(4.0f), primaryHorizontal4))) - i9, i10);
        canvas2.scale(interpolation, interpolation, f13, f13);
        path.reset();
        path.addCircle(f13, f13, f13, direction);
        path.addRect(f13, 0.0f, f10, f13, direction);
        canvas2.drawPath(path, textPaint);
        canvas2.restore();
        canvas2.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (getMeasuredWidth() != this.y || this.a == null) {
            Animator animator = this.C;
            if (animator != null) {
                animator.removeAllListeners();
                this.C.cancel();
            }
            String string = LocaleController.getString(R.string.TextSelectionHint);
            Matcher matcher = Pattern.compile("\\*\\*.*\\*\\*").matcher(string);
            String group = matcher.matches() ? matcher.group() : null;
            String replace = string.replace("**", "");
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
            this.w = this.h;
            this.x = this.n;
            if (this.A) {
                this.B = 1.0f;
                this.f = 1.0f;
                this.w = 0;
                this.x = offsetForHorizontal;
                this.s = 0.0f;
                this.v = 0.0f;
            } else if (this.E) {
                c();
            }
            this.E = false;
            this.y = getMeasuredWidth();
        }
        int D = org.telegram.messenger.l0.D(8.0f, 2, this.a.getHeight());
        if (D < AndroidUtilities.dp(56.0f)) {
            D = AndroidUtilities.dp(56.0f);
        }
        setMeasuredDimension(getMeasuredWidth(), D);
    }
}
