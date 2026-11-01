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
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ak0 extends View implements org.telegram.ui.ActionBar.k6 {
    public float D;
    public boolean E;
    public float F;
    public float G;
    public final TextPaint H;
    public String I;
    public final Path J;
    public final Path K;
    public final float[] L;
    public float M;
    public float N;
    public float O;
    public long P;
    public final int Q;
    public final int R;
    public int S;
    public int T;
    public boolean U;
    public float V;
    public final int[] W;
    public boolean a;
    public boolean a0;
    public final RectF b;
    public final float b0;
    public final Paint c;
    public final Drawable c0;
    public final Paint d;
    public final Drawable d0;
    public float e;
    public vg.f e0;
    public float f;
    public vg.f f0;
    public final boolean g0;
    public float h;
    public int h0;
    public final ew i0;
    public int j0;
    public float k0;
    public boolean l0;
    public long m0;
    public boolean n;
    public float n0;
    public float o0;
    public final /* synthetic */ uk0 p0;
    public StaticLayout r;
    public StaticLayout s;
    public StaticLayout w;
    public StaticLayout x;
    public StaticLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak0(uk0 uk0Var, Context context, int i10) {
        super(context);
        org.telegram.ui.ActionBar.p6 p6Var = uk0Var.n2;
        this.p0 = uk0Var;
        this.a = true;
        this.b = new RectF();
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.D = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.H = textPaint;
        this.J = new Path();
        this.K = new Path();
        this.L = new float[8];
        this.W = new int[2];
        this.i0 = new ew(this, 9);
        this.o0 = 1.0f;
        this.R = i10;
        if (i10 == 0) {
            textPaint.setTextSize(org.telegram.messenger.i0.L(45.0f));
            this.g0 = org.telegram.messenger.dd.X;
        } else {
            this.g0 = false;
            textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
            textPaint.setTypeface(org.telegram.messenger.i0.o());
            int i11 = org.telegram.ui.ActionBar.t6.d6;
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            Drawable mutate = context.getDrawable(R.drawable.calendar_date).mutate();
            this.d0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i0.b.f(0.1f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i12 = 0; i12 < 8; i12++) {
            this.L[i12] = org.telegram.messenger.i0.L(44.0f);
        }
        int L = org.telegram.messenger.i0.L(this.g0 ? 10.0f : (i10 == 0 ? org.telegram.messenger.at.Q1 : org.telegram.messenger.at.P3) - 15);
        this.Q = L;
        if (uk0Var.b1()) {
            this.Q = org.telegram.messenger.i0.L(this.g0 ? -4.0f : 6.0f) + L;
        }
        d();
        setFocusableInTouchMode(true);
        this.b0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c0 = context.getDrawable(R.drawable.fast_scroll_shadow);
    }

    public final void a(tg.b bVar, wg.d dVar) {
        uk0 uk0Var = this.p0;
        vg.f c10 = bVar.c(uk0Var.d1, dVar, false);
        this.e0 = c10;
        c10.p(org.telegram.messenger.i0.L(4.0f));
        this.e0.q(org.telegram.messenger.i0.L(24.0f));
        vg.f c11 = bVar.c(uk0Var.d1, dVar, false);
        this.f0 = c11;
        c11.p(org.telegram.messenger.i0.L(6.0f));
        this.f0.t(org.telegram.messenger.i0.L(4.0f));
        this.f0.q(org.telegram.messenger.i0.L(14.0f));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.l7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.n7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    public final void b(boolean z10) {
        uk0 uk0Var = this.p0;
        s4.n0 layoutManager = uk0Var.getLayoutManager();
        if (layoutManager instanceof s4.a0) {
            s4.a0 a0Var = (s4.a0) layoutManager;
            if (a0Var.o == 1) {
                s4.g0 adapter = uk0Var.getAdapter();
                if (adapter instanceof bk0) {
                    bk0 bk0Var = (bk0) adapter;
                    float f7 = this.e;
                    int[] iArr = this.W;
                    bk0Var.G(uk0Var, f7, iArr);
                    if (z10) {
                        a0Var.h1(iArr[0], (-iArr[1]) + uk0Var.u1);
                    }
                    String F = bk0Var.F(iArr[0]);
                    if (F == null) {
                        StaticLayout staticLayout = this.r;
                        if (staticLayout != null) {
                            this.s = staticLayout;
                        }
                        this.r = null;
                        return;
                    }
                    if (F.equals(this.I)) {
                        return;
                    }
                    this.I = F;
                    int i10 = this.R;
                    TextPaint textPaint = this.H;
                    if (i10 == 0) {
                        this.r = new StaticLayout(F, textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        this.w = this.r;
                        int measureText = ((int) textPaint.measureText(F)) + 1;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        this.r = new StaticLayout(F, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                        if (this.w != null) {
                            String[] split = F.split(" ");
                            String[] split2 = this.w.getText().toString().split(" ");
                            if (split != null && split2 != null && split.length == 2 && split2.length == 2 && split[1].equals(split2[1])) {
                                String charSequence = this.w.getText().toString();
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                spannableStringBuilder.setSpan(new wy(false), split2[0].length(), charSequence.length(), 0);
                                this.w = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F);
                                spannableStringBuilder2.setSpan(new wy(false), split[0].length(), F.length(), 0);
                                this.x = new StaticLayout(spannableStringBuilder2, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(F);
                                spannableStringBuilder3.setSpan(new wy(false), 0, split[0].length(), 0);
                                this.y = new StaticLayout(spannableStringBuilder3, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                            } else {
                                this.x = this.r;
                                this.y = null;
                            }
                            this.G = this.w.getWidth();
                            this.D = 0.0f;
                            this.E = getProgress() > this.F;
                        }
                        this.F = getProgress();
                    }
                    this.s = null;
                    if (this.r.getLineCount() > 0) {
                        this.r.getLineWidth(0);
                        this.r.getLineLeft(0);
                        if (this.g0) {
                            this.M = (((org.telegram.messenger.i0.L(88.0f) - this.r.getLineWidth(0)) / 2.0f) + org.telegram.messenger.i0.L(10.0f)) - this.r.getLineLeft(0);
                        } else {
                            this.M = ((org.telegram.messenger.i0.L(88.0f) - this.r.getLineWidth(0)) / 2.0f) - this.r.getLineLeft(0);
                        }
                        this.N = (org.telegram.messenger.i0.L(88.0f) - this.r.getHeight()) / 2;
                    }
                }
            }
        }
    }

    public final void c() {
        if (this.R != 1) {
            return;
        }
        if (!this.U) {
            this.U = true;
            invalidate();
        }
        ew ewVar = this.i0;
        org.telegram.messenger.i0.r(ewVar);
        org.telegram.messenger.i0.h3(ewVar, 2000L);
    }

    public final void d() {
        uk0 uk0Var = this.p0;
        int i10 = this.R;
        this.S = i10 == 0 ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.m7, uk0Var.n2) : i0.b.o(-16777216, org.telegram.messenger.at.n1);
        this.T = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.l7, uk0Var.n2);
        this.c.setColor(this.S);
        TextPaint textPaint = this.H;
        if (i10 == 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n7, uk0Var.n2));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, uk0Var.n2));
        }
        invalidate();
    }

    @Override // android.view.View
    public float getAlpha() {
        return this.o0;
    }

    public float getProgress() {
        return this.e;
    }

    public int getScrollBarY() {
        return org.telegram.messenger.i0.L(17.0f) + ((int) Math.ceil((getMeasuredHeight() - org.telegram.messenger.i0.L(54.0f)) * this.e));
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return this.n;
    }

    @Override // android.view.View
    public final void layout(int i10, int i11, int i12, int i13) {
        if (this.p0.H1) {
            super.layout(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        char c10;
        float f11;
        float f12;
        int i10;
        float f13;
        float L;
        float L2;
        int paddingTop = (this.a ? getPaddingTop() : 0) + ((int) Math.ceil(((getMeasuredHeight() - r2) - org.telegram.messenger.i0.L(54.0f)) * this.e));
        int i11 = this.Q;
        float f14 = i11;
        float L3 = org.telegram.messenger.i0.L(12.0f) + paddingTop;
        float L4 = org.telegram.messenger.i0.L(5.0f) + i11;
        float L5 = org.telegram.messenger.i0.L(42.0f) + paddingTop;
        RectF rectF = this.b;
        rectF.set(f14, L3, L4, L5);
        int i12 = this.R;
        Paint paint = this.c;
        if (i12 == 0) {
            f7 = 36.0f;
            f10 = 8.0f;
            paint.setColor(i0.b.f(this.O, this.S, this.T));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), paint);
            c10 = 2;
            f11 = 24.0f;
            f12 = 4.0f;
            i10 = 0;
        } else {
            f7 = 36.0f;
            f10 = 8.0f;
            int i13 = org.telegram.ui.ActionBar.t6.d6;
            uk0 uk0Var = this.p0;
            c10 = 2;
            paint.setColor(i0.b.f(0.1f, org.telegram.ui.ActionBar.t6.w0(i13, uk0Var.n2), -1));
            float L6 = org.telegram.messenger.i0.L(27.0f) + paddingTop;
            vg.f fVar = this.e0;
            if (fVar != null) {
                f11 = 24.0f;
                f12 = 4.0f;
                fVar.setBounds(org.telegram.messenger.i0.L(-20.0f) + i11, org.telegram.messenger.i0.L(-1.0f) + paddingTop, org.telegram.messenger.i0.L(36.0f) + i11, org.telegram.messenger.i0.L(55.0f) + paddingTop);
                this.e0.draw(canvas);
                i10 = 0;
            } else {
                f11 = 24.0f;
                f12 = 4.0f;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.c0;
                i10 = 0;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (L6 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (L6 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(org.telegram.messenger.i0.L(8.0f) + i11, org.telegram.messenger.i0.L(27.0f) + paddingTop, org.telegram.messenger.i0.L(24.0f), paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, uk0Var.n2));
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(f12) + i11, (org.telegram.messenger.i0.L(2.0f) * this.O) + org.telegram.messenger.i0.L(34.0f) + paddingTop);
            Path path = this.K;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(f12) + i11, (org.telegram.messenger.i0.L(f11) + paddingTop) - (org.telegram.messenger.i0.L(2.0f) * this.O));
            canvas.rotate(180.0f, 0.0f, -org.telegram.messenger.i0.L(2.0f));
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        if (i12 == 0) {
            if (this.l0 || this.O != 0.0f) {
                paint.setAlpha((int) (this.O * 255.0f));
                int L7 = org.telegram.messenger.i0.L(30.0f) + paddingTop;
                int L8 = paddingTop - org.telegram.messenger.i0.L(46.0f);
                if (L8 <= org.telegram.messenger.i0.L(12.0f)) {
                    f13 = org.telegram.messenger.i0.L(12.0f) - L8;
                    L8 = org.telegram.messenger.i0.L(12.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas.translate(org.telegram.messenger.i0.L(10.0f), L8);
                if (f13 <= org.telegram.messenger.i0.L(29.0f)) {
                    L = org.telegram.messenger.i0.L(44.0f);
                    L2 = ((f13 / org.telegram.messenger.i0.L(29.0f)) * org.telegram.messenger.i0.L(40.0f)) + org.telegram.messenger.i0.L(f12);
                } else {
                    L = ((1.0f - ((f13 - org.telegram.messenger.i0.L(29.0f)) / org.telegram.messenger.i0.L(29.0f))) * org.telegram.messenger.i0.L(40.0f)) + org.telegram.messenger.i0.L(f12);
                    L2 = org.telegram.messenger.i0.L(44.0f);
                }
                boolean z10 = this.g0;
                Path path2 = this.J;
                float[] fArr = this.L;
                if ((z10 && (fArr[i10] != L || fArr[6] != L2)) || (!z10 && (fArr[c10] != L || fArr[4] != L2))) {
                    if (z10) {
                        fArr[1] = L;
                        fArr[i10] = L;
                        fArr[7] = L2;
                        fArr[6] = L2;
                    } else {
                        fArr[3] = L;
                        fArr[c10] = L;
                        fArr[5] = L2;
                        fArr[4] = L2;
                    }
                    path2.reset();
                    rectF.set(z10 ? org.telegram.messenger.i0.L(10.0f) : 0.0f, 0.0f, org.telegram.messenger.i0.L(z10 ? 98.0f : 88.0f), org.telegram.messenger.i0.L(88.0f));
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path2.close();
                }
                StaticLayout staticLayout = this.r;
                if (staticLayout == null) {
                    staticLayout = this.s;
                }
                if (staticLayout != null) {
                    canvas.save();
                    float f15 = this.O;
                    canvas.scale(f15, f15, f14, L7 - L8);
                    canvas.drawPath(path2, paint);
                    canvas.translate(this.M, this.N);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
            }
        } else if (i12 == 1) {
            if (this.r == null || this.V == 0.0f) {
                vg.f fVar2 = this.f0;
                if (fVar2 != null) {
                    fVar2.setAlpha(i10);
                }
            } else {
                canvas.save();
                float f16 = (this.V * 0.3f) + 0.7f;
                canvas.scale(f16, f16, rectF.right - org.telegram.messenger.i0.L(12.0f), rectF.centerY());
                float centerY = rectF.centerY();
                float L9 = (rectF.left - (org.telegram.messenger.i0.L(30.0f) * this.O)) - org.telegram.messenger.i0.L(f10);
                this.r.getHeight();
                org.telegram.messenger.i0.L(6.0f);
                rectF.set((L9 - (((1.0f - this.D) * this.G) + (this.D * this.r.getWidth()))) - org.telegram.messenger.i0.L(f7), (centerY - (this.r.getHeight() / 2.0f)) - org.telegram.messenger.i0.L(f10), L9 - org.telegram.messenger.i0.L(12.0f), (this.r.getHeight() / 2.0f) + centerY + org.telegram.messenger.i0.L(f10));
                Paint paint2 = this.d;
                int alpha = paint2.getAlpha();
                TextPaint textPaint = this.H;
                int alpha2 = textPaint.getAlpha();
                paint2.setAlpha((int) (alpha * this.V));
                if (this.f0 != null) {
                    Rect rect = org.telegram.messenger.i0.Q;
                    rectF.round(rect);
                    rect.inset(-org.telegram.messenger.i0.L(f12), -org.telegram.messenger.i0.L(f12));
                    this.f0.setBounds(rect);
                    this.f0.setAlpha((int) (this.V * 255.0f));
                    this.f0.draw(canvas);
                } else {
                    int i14 = (int) rectF.left;
                    int i15 = (int) rectF.top;
                    int i16 = (int) rectF.right;
                    int i17 = (int) rectF.bottom;
                    Drawable drawable2 = this.d0;
                    drawable2.setBounds(i14, i15, i16, i17);
                    drawable2.setAlpha((int) (this.V * 255.0f));
                    drawable2.draw(canvas);
                }
                float f17 = this.D;
                if (f17 != 1.0f) {
                    float f18 = f17 + 0.10666667f;
                    this.D = f18;
                    if (f18 > 1.0f) {
                        this.D = 1.0f;
                    } else {
                        invalidate();
                    }
                }
                if (this.D != 1.0f) {
                    canvas.save();
                    rectF.inset(org.telegram.messenger.i0.L(f12), org.telegram.messenger.i0.L(2.0f));
                    canvas.clipRect(rectF);
                    if (this.w != null) {
                        textPaint.setAlpha((int) ((1.0f - this.D) * alpha2 * this.V));
                        canvas.save();
                        canvas.translate((L9 - this.w.getWidth()) - org.telegram.messenger.i0.L(f11), (org.telegram.messenger.i0.L(15.0f) * (this.E ? -1 : 1) * this.D) + (centerY - (this.w.getHeight() / 2.0f)));
                        this.w.draw(canvas);
                        canvas.restore();
                    }
                    if (this.x != null) {
                        textPaint.setAlpha((int) (alpha2 * this.V * this.D));
                        canvas.save();
                        canvas.translate((L9 - this.x.getWidth()) - org.telegram.messenger.i0.L(f11), c3.i0.z(1.0f, this.D, org.telegram.messenger.i0.L(15.0f) * (this.E ? 1 : -1), centerY - (this.x.getHeight() / 2.0f)));
                        this.x.draw(canvas);
                        canvas.restore();
                    }
                    if (this.y != null) {
                        textPaint.setAlpha((int) (alpha2 * this.V));
                        canvas.save();
                        canvas.translate((L9 - this.y.getWidth()) - org.telegram.messenger.i0.L(f11), centerY - (this.y.getHeight() / 2.0f));
                        this.y.draw(canvas);
                        canvas.restore();
                    }
                    canvas.restore();
                } else {
                    textPaint.setAlpha((int) (alpha2 * this.V));
                    canvas.save();
                    canvas.translate((L9 - this.r.getWidth()) - org.telegram.messenger.i0.L(f11), c3.i0.z(1.0f, this.D, org.telegram.messenger.i0.L(15.0f), centerY - (this.r.getHeight() / 2.0f)));
                    this.r.draw(canvas);
                    canvas.restore();
                }
                paint2.setAlpha(alpha);
                textPaint.setAlpha(alpha2);
                canvas.restore();
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.P;
        if (j10 < 0 || j10 > 17) {
            j10 = 17;
        }
        boolean z11 = this.l0;
        if ((z11 && this.r != null && this.O < 1.0f) || ((!z11 || this.r == null) && this.O > 0.0f)) {
            this.P = currentTimeMillis;
            invalidate();
            if (!this.l0 || this.r == null) {
                float f19 = this.O - (j10 / 120.0f);
                this.O = f19;
                if (f19 < 0.0f) {
                    this.O = 0.0f;
                }
            } else {
                float f20 = (j10 / 120.0f) + this.O;
                this.O = f20;
                if (f20 > 1.0f) {
                    this.O = 1.0f;
                }
            }
        }
        boolean z12 = this.U;
        if (z12) {
            float f21 = this.V;
            if (f21 != 1.0f) {
                float f22 = (j10 / 120.0f) + f21;
                this.V = f22;
                if (f22 > 1.0f) {
                    this.V = 1.0f;
                }
                invalidate();
                return;
            }
        }
        if (z12) {
            return;
        }
        float f23 = this.V;
        if (f23 != 0.0f) {
            float f24 = f23 - (j10 / 120.0f);
            this.V = f24;
            if (f24 < 0.0f) {
                this.V = 0.0f;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(this.R == 0 ? 132.0f : 240.0f), View.MeasureSpec.getSize(i11));
        Path path = this.K;
        path.reset();
        path.setLastPoint(0.0f, 0.0f);
        path.lineTo(org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
        path.lineTo(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
        path.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0152, code lost:
    
        if (r0 <= (org.telegram.messenger.i0.L(30.0f) + r10)) goto L78;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a0) {
            this.n = false;
            return false;
        }
        int action = motionEvent.getAction();
        uk0 uk0Var = this.p0;
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            this.f = y3;
            this.k0 = y3;
            float ceil = ((float) Math.ceil((getMeasuredHeight() - org.telegram.messenger.i0.L(54.0f)) * this.e)) + org.telegram.messenger.i0.L(12.0f);
            boolean z10 = this.g0;
            if ((!z10 || x10 <= org.telegram.messenger.i0.L(25.0f)) && (z10 || x10 >= org.telegram.messenger.i0.L(107.0f))) {
                float f7 = this.f;
                if (f7 >= ceil && f7 <= org.telegram.messenger.i0.L(30.0f) + ceil) {
                    if (this.R == 1 && !this.U) {
                        if ((!z10 || x10 <= org.telegram.messenger.i0.L(25.0f)) && (z10 || x10 >= getMeasuredWidth() - org.telegram.messenger.i0.L(25.0f))) {
                            float f10 = this.f;
                            if (f10 >= ceil) {
                            }
                        }
                    }
                    this.h = this.f - ceil;
                    this.m0 = System.currentTimeMillis();
                    this.n = true;
                    this.l0 = false;
                    this.P = System.currentTimeMillis();
                    invalidate();
                    s4.g0 adapter = uk0Var.getAdapter();
                    c();
                    if (adapter instanceof bk0) {
                        ((bk0) adapter).K();
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
                if (Math.abs(motionEvent.getY() - this.k0) > this.b0) {
                    this.l0 = true;
                }
                if (this.l0) {
                    float y10 = motionEvent.getY();
                    float L = org.telegram.messenger.i0.L(12.0f) + this.h;
                    float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.i0.L(42.0f)) + this.h;
                    if (y10 < L) {
                        y10 = L;
                    } else if (y10 > measuredHeight) {
                        y10 = measuredHeight;
                    }
                    float f11 = y10 - this.f;
                    this.f = y10;
                    float measuredHeight2 = (f11 / (getMeasuredHeight() - org.telegram.messenger.i0.L(54.0f))) + this.e;
                    this.e = measuredHeight2;
                    if (measuredHeight2 < 0.0f) {
                        this.e = 0.0f;
                    } else if (measuredHeight2 > 1.0f) {
                        this.e = 1.0f;
                    }
                    b(true);
                    invalidate();
                    return true;
                }
            }
        }
        s4.g0 adapter2 = uk0Var.getAdapter();
        if (this.n && !this.l0 && System.currentTimeMillis() - this.m0 < 150 && (adapter2 instanceof bk0)) {
            ((bk0) adapter2).I();
        }
        this.l0 = false;
        this.n = false;
        this.P = System.currentTimeMillis();
        invalidate();
        if (adapter2 instanceof bk0) {
            ((bk0) adapter2).J(uk0Var);
        }
        c();
        return true;
        return true;
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        if (this.o0 != f7) {
            this.o0 = f7;
            super.setAlpha(f7 * this.n0);
        }
    }

    public void setIsVisible(boolean z10) {
        if (this.a0 != z10) {
            this.a0 = z10;
            float f7 = z10 ? 1.0f : 0.0f;
            this.n0 = f7;
            super.setAlpha(this.o0 * f7);
        }
    }

    public void setProgress(float f7) {
        this.e = f7;
        invalidate();
    }

    public void setVisibilityAlpha(float f7) {
        if (this.n0 != f7) {
            this.n0 = f7;
            super.setAlpha(this.o0 * f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int f7;
        try {
            d();
            if (this.R != 0) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.p0.n2);
                this.d.setColor(w02);
                Drawable drawable = this.d0;
                if (drawable == null || (f7 = i0.b.f(0.1f, w02, -1)) == this.j0) {
                    return;
                }
                this.j0 = f7;
                drawable.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
