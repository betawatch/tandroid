package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sk0 extends View {
    public boolean A;
    public float B;
    public float C;
    public final TextPaint D;
    public String E;
    public final Path F;
    public final Path G;
    public final float[] H;
    public float I;
    public float J;
    public float K;
    public long L;
    public final int M;
    public final int N;
    public int O;
    public int P;
    public boolean Q;
    public float R;
    public final int[] S;
    public boolean T;
    public final float U;
    public final Drawable V;
    public final Drawable W;
    public boolean a;
    public ng.d a0;
    public final RectF b;
    public ng.d b0;
    public final Paint c;
    public final boolean c0;
    public final Paint d;
    public int d0;
    public float e;
    public final rk0 e0;
    public float f;
    public float f0;
    public boolean g0;
    public float h;
    public long h0;
    public float i0;
    public float j0;
    public final /* synthetic */ jl0 k0;
    public boolean n;
    public StaticLayout r;
    public StaticLayout s;
    public StaticLayout v;
    public StaticLayout w;
    public StaticLayout x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk0(jl0 jl0Var, Context context, int i10) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var = jl0Var.l2;
        this.k0 = jl0Var;
        this.a = true;
        this.b = new RectF();
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.y = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.D = textPaint;
        this.F = new Path();
        this.G = new Path();
        this.H = new float[8];
        this.S = new int[2];
        this.e0 = new rk0(this, 0);
        this.j0 = 1.0f;
        this.N = i10;
        if (i10 == 0) {
            textPaint.setTextSize(AndroidUtilities.dp(45.0f));
            this.c0 = LocaleController.isRTL;
        } else {
            this.c0 = false;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            int i11 = org.telegram.ui.ActionBar.g6.d6;
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            Drawable mutate = context.getDrawable(R.drawable.calendar_date).mutate();
            this.W = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.1f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i12 = 0; i12 < 8; i12++) {
            this.H[i12] = AndroidUtilities.dp(44.0f);
        }
        int dp = AndroidUtilities.dp(this.c0 ? 10.0f : (i10 == 0 ? 132 : 240) - 15);
        this.M = dp;
        if (jl0Var.b1()) {
            this.M = AndroidUtilities.dp(this.c0 ? -4.0f : 6.0f) + dp;
        }
        c();
        setFocusableInTouchMode(true);
        this.U = ViewConfiguration.get(context).getScaledTouchSlop();
        this.V = context.getDrawable(R.drawable.fast_scroll_shadow);
    }

    public final void a(boolean z10) {
        jl0 jl0Var = this.k0;
        f2.w0 layoutManager = jl0Var.getLayoutManager();
        if (layoutManager instanceof f2.j0) {
            f2.j0 j0Var = (f2.j0) layoutManager;
            if (j0Var.o == 1) {
                f2.p0 adapter = jl0Var.getAdapter();
                if (adapter instanceof tk0) {
                    tk0 tk0Var = (tk0) adapter;
                    float f9 = this.e;
                    int[] iArr = this.S;
                    tk0Var.G(jl0Var, f9, iArr);
                    if (z10) {
                        j0Var.h1(iArr[0], (-iArr[1]) + jl0Var.s1);
                    }
                    String F = tk0Var.F(iArr[0]);
                    if (F == null) {
                        StaticLayout staticLayout = this.r;
                        if (staticLayout != null) {
                            this.s = staticLayout;
                        }
                        this.r = null;
                        return;
                    }
                    if (F.equals(this.E)) {
                        return;
                    }
                    this.E = F;
                    int i10 = this.N;
                    TextPaint textPaint = this.D;
                    if (i10 == 0) {
                        this.r = new StaticLayout(F, textPaint, MediaDataController.MAX_STYLE_RUNS_COUNT, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        this.v = this.r;
                        int measureText = ((int) textPaint.measureText(F)) + 1;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        this.r = new StaticLayout(F, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                        if (this.v != null) {
                            String[] split = F.split(" ");
                            String[] split2 = this.v.getText().toString().split(" ");
                            if (split != null && split2 != null && split.length == 2 && split2.length == 2 && split[1].equals(split2[1])) {
                                String charSequence = this.v.getText().toString();
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                spannableStringBuilder.setSpan(new gz(false), split2[0].length(), charSequence.length(), 0);
                                this.v = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F);
                                spannableStringBuilder2.setSpan(new gz(false), split[0].length(), F.length(), 0);
                                this.w = new StaticLayout(spannableStringBuilder2, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(F);
                                spannableStringBuilder3.setSpan(new gz(false), 0, split[0].length(), 0);
                                this.x = new StaticLayout(spannableStringBuilder3, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                            } else {
                                this.w = this.r;
                                this.x = null;
                            }
                            this.C = this.v.getWidth();
                            this.y = 0.0f;
                            this.A = getProgress() > this.B;
                        }
                        this.B = getProgress();
                    }
                    this.s = null;
                    if (this.r.getLineCount() > 0) {
                        this.r.getLineWidth(0);
                        this.r.getLineLeft(0);
                        if (this.c0) {
                            this.I = (((AndroidUtilities.dp(88.0f) - this.r.getLineWidth(0)) / 2.0f) + AndroidUtilities.dp(10.0f)) - this.r.getLineLeft(0);
                        } else {
                            this.I = ((AndroidUtilities.dp(88.0f) - this.r.getLineWidth(0)) / 2.0f) - this.r.getLineLeft(0);
                        }
                        this.J = (AndroidUtilities.dp(88.0f) - this.r.getHeight()) / 2;
                    }
                }
            }
        }
    }

    public final void b() {
        if (this.N != 1) {
            return;
        }
        if (!this.Q) {
            this.Q = true;
            invalidate();
        }
        rk0 rk0Var = this.e0;
        AndroidUtilities.cancelRunOnUIThread(rk0Var);
        AndroidUtilities.runOnUIThread(rk0Var, 2000L);
    }

    public final void c() {
        jl0 jl0Var = this.k0;
        int i10 = this.N;
        this.O = i10 == 0 ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.m7, jl0Var.l2) : i0.a.k(-16777216, 102);
        this.P = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.l7, jl0Var.l2);
        this.c.setColor(this.O);
        TextPaint textPaint = this.D;
        if (i10 == 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.n7, jl0Var.l2));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, jl0Var.l2));
        }
        invalidate();
    }

    @Override // android.view.View
    public float getAlpha() {
        return this.j0;
    }

    public float getProgress() {
        return this.e;
    }

    public int getScrollBarY() {
        return AndroidUtilities.dp(17.0f) + ((int) Math.ceil((getMeasuredHeight() - AndroidUtilities.dp(54.0f)) * this.e));
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return this.n;
    }

    @Override // android.view.View
    public final void layout(int i10, int i11, int i12, int i13) {
        if (this.k0.F1) {
            super.layout(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        char c3;
        float f12;
        float f13;
        float f14;
        float dp;
        float dp2;
        int paddingTop = (this.a ? getPaddingTop() : 0) + ((int) Math.ceil(((getMeasuredHeight() - r2) - AndroidUtilities.dp(54.0f)) * this.e));
        int i10 = this.M;
        float f15 = i10;
        float dp3 = AndroidUtilities.dp(12.0f) + paddingTop;
        float dp4 = AndroidUtilities.dp(5.0f) + i10;
        float dp5 = AndroidUtilities.dp(42.0f) + paddingTop;
        RectF rectF = this.b;
        rectF.set(f15, dp3, dp4, dp5);
        int i11 = this.N;
        Paint paint = this.c;
        if (i11 == 0) {
            f9 = 12.0f;
            f10 = 36.0f;
            paint.setColor(i0.a.d(this.K, this.O, this.P));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
            f11 = 8.0f;
            c3 = 2;
            f12 = 24.0f;
            f13 = 4.0f;
        } else {
            f9 = 12.0f;
            f10 = 36.0f;
            int i12 = org.telegram.ui.ActionBar.g6.d6;
            jl0 jl0Var = this.k0;
            f11 = 8.0f;
            paint.setColor(i0.a.d(0.1f, org.telegram.ui.ActionBar.g6.v0(i12, jl0Var.l2), -1));
            float dp6 = AndroidUtilities.dp(27.0f) + paddingTop;
            ng.d dVar = this.a0;
            if (dVar != null) {
                c3 = 2;
                f12 = 24.0f;
                dVar.setBounds(AndroidUtilities.dp(-20.0f) + i10, AndroidUtilities.dp(-1.0f) + paddingTop, AndroidUtilities.dp(36.0f) + i10, AndroidUtilities.dp(55.0f) + paddingTop);
                this.a0.draw(canvas);
                f13 = 4.0f;
            } else {
                c3 = 2;
                f12 = 24.0f;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.V;
                f13 = 4.0f;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (dp6 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (dp6 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(AndroidUtilities.dp(8.0f) + i10, AndroidUtilities.dp(27.0f) + paddingTop, AndroidUtilities.dp(24.0f), paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, jl0Var.l2));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f13) + i10, (AndroidUtilities.dp(2.0f) * this.K) + AndroidUtilities.dp(34.0f) + paddingTop);
            Path path = this.G;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f13) + i10, (AndroidUtilities.dp(f12) + paddingTop) - (AndroidUtilities.dp(2.0f) * this.K));
            canvas.rotate(180.0f, 0.0f, -AndroidUtilities.dp(2.0f));
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        if (i11 == 0) {
            if (this.g0 || this.K != 0.0f) {
                paint.setAlpha((int) (this.K * 255.0f));
                int dp7 = AndroidUtilities.dp(30.0f) + paddingTop;
                int dp8 = paddingTop - AndroidUtilities.dp(46.0f);
                if (dp8 <= AndroidUtilities.dp(f9)) {
                    f14 = AndroidUtilities.dp(f9) - dp8;
                    dp8 = AndroidUtilities.dp(f9);
                } else {
                    f14 = 0.0f;
                }
                canvas.translate(AndroidUtilities.dp(10.0f), dp8);
                if (f14 <= AndroidUtilities.dp(29.0f)) {
                    dp = AndroidUtilities.dp(44.0f);
                    dp2 = ((f14 / AndroidUtilities.dp(29.0f)) * AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(f13);
                } else {
                    dp = ((1.0f - ((f14 - AndroidUtilities.dp(29.0f)) / AndroidUtilities.dp(29.0f))) * AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(f13);
                    dp2 = AndroidUtilities.dp(44.0f);
                }
                boolean z10 = this.c0;
                Path path2 = this.F;
                float[] fArr = this.H;
                if ((z10 && (fArr[0] != dp || fArr[6] != dp2)) || (!z10 && (fArr[c3] != dp || fArr[4] != dp2))) {
                    if (z10) {
                        fArr[1] = dp;
                        fArr[0] = dp;
                        fArr[7] = dp2;
                        fArr[6] = dp2;
                    } else {
                        fArr[3] = dp;
                        fArr[c3] = dp;
                        fArr[5] = dp2;
                        fArr[4] = dp2;
                    }
                    path2.reset();
                    rectF.set(z10 ? AndroidUtilities.dp(10.0f) : 0.0f, 0.0f, AndroidUtilities.dp(z10 ? 98.0f : 88.0f), AndroidUtilities.dp(88.0f));
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path2.close();
                }
                StaticLayout staticLayout = this.r;
                if (staticLayout == null) {
                    staticLayout = this.s;
                }
                if (staticLayout != null) {
                    canvas.save();
                    float f16 = this.K;
                    canvas.scale(f16, f16, f15, dp7 - dp8);
                    canvas.drawPath(path2, paint);
                    canvas.translate(this.I, this.J);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
            }
        } else if (i11 == 1 && this.r != null && this.R != 0.0f) {
            canvas.save();
            float f17 = (this.R * 0.3f) + 0.7f;
            canvas.scale(f17, f17, rectF.right - AndroidUtilities.dp(f9), rectF.centerY());
            float centerY = rectF.centerY();
            float dp9 = (rectF.left - (AndroidUtilities.dp(30.0f) * this.K)) - AndroidUtilities.dp(f11);
            this.r.getHeight();
            AndroidUtilities.dp(6.0f);
            rectF.set((dp9 - (((1.0f - this.y) * this.C) + (this.y * this.r.getWidth()))) - AndroidUtilities.dp(f10), (centerY - (this.r.getHeight() / 2.0f)) - AndroidUtilities.dp(f11), dp9 - AndroidUtilities.dp(f9), (this.r.getHeight() / 2.0f) + centerY + AndroidUtilities.dp(f11));
            Paint paint2 = this.d;
            int alpha = paint2.getAlpha();
            TextPaint textPaint = this.D;
            int alpha2 = textPaint.getAlpha();
            paint2.setAlpha((int) (alpha * this.R));
            if (this.b0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF.round(rect);
                rect.inset(-AndroidUtilities.dp(f13), -AndroidUtilities.dp(f13));
                this.b0.setBounds(rect);
                this.b0.draw(canvas);
            } else {
                int i13 = (int) rectF.left;
                int i14 = (int) rectF.top;
                int i15 = (int) rectF.right;
                int i16 = (int) rectF.bottom;
                Drawable drawable2 = this.W;
                drawable2.setBounds(i13, i14, i15, i16);
                drawable2.setAlpha((int) (this.R * 255.0f));
                drawable2.draw(canvas);
            }
            float f18 = this.y;
            if (f18 != 1.0f) {
                float f19 = f18 + 0.10666667f;
                this.y = f19;
                if (f19 > 1.0f) {
                    this.y = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (this.y != 1.0f) {
                canvas.save();
                rectF.inset(AndroidUtilities.dp(f13), AndroidUtilities.dp(2.0f));
                canvas.clipRect(rectF);
                if (this.v != null) {
                    textPaint.setAlpha((int) ((1.0f - this.y) * alpha2 * this.R));
                    canvas.save();
                    canvas.translate((dp9 - this.v.getWidth()) - AndroidUtilities.dp(f12), (AndroidUtilities.dp(15.0f) * (this.A ? -1 : 1) * this.y) + (centerY - (this.v.getHeight() / 2.0f)));
                    this.v.draw(canvas);
                    canvas.restore();
                }
                if (this.w != null) {
                    textPaint.setAlpha((int) (alpha2 * this.R * this.y));
                    canvas.save();
                    canvas.translate((dp9 - this.w.getWidth()) - AndroidUtilities.dp(f12), com.google.android.recaptcha.internal.a.z(1.0f, this.y, AndroidUtilities.dp(15.0f) * (this.A ? 1 : -1), centerY - (this.w.getHeight() / 2.0f)));
                    this.w.draw(canvas);
                    canvas.restore();
                }
                if (this.x != null) {
                    textPaint.setAlpha((int) (alpha2 * this.R));
                    canvas.save();
                    canvas.translate((dp9 - this.x.getWidth()) - AndroidUtilities.dp(f12), centerY - (this.x.getHeight() / 2.0f));
                    this.x.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            } else {
                textPaint.setAlpha((int) (alpha2 * this.R));
                canvas.save();
                canvas.translate((dp9 - this.r.getWidth()) - AndroidUtilities.dp(f12), com.google.android.recaptcha.internal.a.z(1.0f, this.y, AndroidUtilities.dp(15.0f), centerY - (this.r.getHeight() / 2.0f)));
                this.r.draw(canvas);
                canvas.restore();
            }
            paint2.setAlpha(alpha);
            textPaint.setAlpha(alpha2);
            canvas.restore();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.L;
        if (j10 < 0 || j10 > 17) {
            j10 = 17;
        }
        boolean z11 = this.g0;
        if ((z11 && this.r != null && this.K < 1.0f) || ((!z11 || this.r == null) && this.K > 0.0f)) {
            this.L = currentTimeMillis;
            invalidate();
            if (!this.g0 || this.r == null) {
                float f20 = this.K - (j10 / 120.0f);
                this.K = f20;
                if (f20 < 0.0f) {
                    this.K = 0.0f;
                }
            } else {
                float f21 = (j10 / 120.0f) + this.K;
                this.K = f21;
                if (f21 > 1.0f) {
                    this.K = 1.0f;
                }
            }
        }
        boolean z12 = this.Q;
        if (z12) {
            float f22 = this.R;
            if (f22 != 1.0f) {
                float f23 = (j10 / 120.0f) + f22;
                this.R = f23;
                if (f23 > 1.0f) {
                    this.R = 1.0f;
                }
                invalidate();
                return;
            }
        }
        if (z12) {
            return;
        }
        float f24 = this.R;
        if (f24 != 0.0f) {
            float f25 = f24 - (j10 / 120.0f);
            this.R = f25;
            if (f25 < 0.0f) {
                this.R = 0.0f;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(this.N == 0 ? 132.0f : 240.0f), View.MeasureSpec.getSize(i11));
        Path path = this.G;
        path.reset();
        path.setLastPoint(0.0f, 0.0f);
        path.lineTo(AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        path.lineTo(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        path.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0153, code lost:
    
        if (r0 <= (org.telegram.messenger.AndroidUtilities.dp(30.0f) + r10)) goto L78;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.T) {
            this.n = false;
            return false;
        }
        int action = motionEvent.getAction();
        jl0 jl0Var = this.k0;
        if (action == 0) {
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            this.f = y8;
            this.f0 = y8;
            float ceil = ((float) Math.ceil((getMeasuredHeight() - AndroidUtilities.dp(54.0f)) * this.e)) + AndroidUtilities.dp(12.0f);
            boolean z10 = this.c0;
            if ((!z10 || x4 <= AndroidUtilities.dp(25.0f)) && (z10 || x4 >= AndroidUtilities.dp(107.0f))) {
                float f9 = this.f;
                if (f9 >= ceil && f9 <= AndroidUtilities.dp(30.0f) + ceil) {
                    if (this.N == 1 && !this.Q) {
                        if ((!z10 || x4 <= AndroidUtilities.dp(25.0f)) && (z10 || x4 >= getMeasuredWidth() - AndroidUtilities.dp(25.0f))) {
                            float f10 = this.f;
                            if (f10 >= ceil) {
                            }
                        }
                    }
                    this.h = this.f - ceil;
                    this.h0 = System.currentTimeMillis();
                    this.n = true;
                    this.g0 = false;
                    this.L = System.currentTimeMillis();
                    invalidate();
                    f2.p0 adapter = jl0Var.getAdapter();
                    b();
                    if (adapter instanceof tk0) {
                        ((tk0) adapter).K();
                    }
                }
            }
            return false;
        }
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    return this.n;
                }
            } else if (this.n) {
                if (Math.abs(motionEvent.getY() - this.f0) > this.U) {
                    this.g0 = true;
                }
                if (this.g0) {
                    float y10 = motionEvent.getY();
                    float dp = AndroidUtilities.dp(12.0f) + this.h;
                    float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(42.0f)) + this.h;
                    if (y10 < dp) {
                        y10 = dp;
                    } else if (y10 > measuredHeight) {
                        y10 = measuredHeight;
                    }
                    float f11 = y10 - this.f;
                    this.f = y10;
                    float measuredHeight2 = (f11 / (getMeasuredHeight() - AndroidUtilities.dp(54.0f))) + this.e;
                    this.e = measuredHeight2;
                    if (measuredHeight2 < 0.0f) {
                        this.e = 0.0f;
                    } else if (measuredHeight2 > 1.0f) {
                        this.e = 1.0f;
                    }
                    a(true);
                    invalidate();
                    return true;
                }
            }
        }
        f2.p0 adapter2 = jl0Var.getAdapter();
        if (this.n && !this.g0 && System.currentTimeMillis() - this.h0 < 150 && (adapter2 instanceof tk0)) {
            ((tk0) adapter2).I();
        }
        this.g0 = false;
        this.n = false;
        this.L = System.currentTimeMillis();
        invalidate();
        if (adapter2 instanceof tk0) {
            ((tk0) adapter2).J(jl0Var);
        }
        b();
        return true;
        return true;
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        if (this.j0 != f9) {
            this.j0 = f9;
            super.setAlpha(f9 * this.i0);
        }
    }

    public void setIsVisible(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            float f9 = z10 ? 1.0f : 0.0f;
            this.i0 = f9;
            super.setAlpha(this.j0 * f9);
        }
    }

    public void setProgress(float f9) {
        this.e = f9;
        invalidate();
    }

    public void setVisibilityAlpha(float f9) {
        if (this.i0 != f9) {
            this.i0 = f9;
            super.setAlpha(this.j0 * f9);
        }
    }
}
