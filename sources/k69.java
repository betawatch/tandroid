// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class k69 extends View implements snb {
    public float E;
    public boolean F;
    public float G;
    public float H;
    public final TextPaint I;
    public String J;
    public final Path K;
    public final Path L;
    public final float[] M;
    public float N;
    public float O;
    public float P;
    public long Q;
    public final int R;
    public final int S;
    public int T;
    public int U;
    public boolean V;
    public float W;
    public boolean a;
    public final int[] a0;
    public final RectF b;
    public boolean b0;
    public final Paint c;
    public final float c0;
    public final Paint d;
    public final Drawable d0;
    public float e;
    public final Drawable e0;
    public float f;
    public jl0 f0;
    public jl0 g0;
    public float h;
    public final boolean h0;
    public int i0;
    public final ki7 j0;
    public int k0;
    public float l0;
    public boolean m0;
    public boolean n;
    public long n0;
    public float o0;
    public float p0;
    public final /* synthetic */ d79 q0;
    public StaticLayout r;
    public StaticLayout s;
    public StaticLayout w;
    public StaticLayout x;
    public StaticLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k69(d79 d79Var, Context context, int i) {
        super(context);
        vnb vnbVar = d79Var.o2;
        this.q0 = d79Var;
        this.a = true;
        this.b = new RectF();
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.E = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        this.K = new Path();
        this.L = new Path();
        this.M = new float[8];
        this.a0 = new int[2];
        this.j0 = new ki7(this, (byte) 13);
        this.p0 = 1.0f;
        this.S = i;
        if (i == 0) {
            textPaint.setTextSize(hl.L(45.0f));
            this.h0 = ob6.a0;
        } else {
            this.h0 = false;
            uh9.p(textPaint, hl.L(13.0f));
            int i2 = aob.d6;
            paint.setColor(aob.v0(i2, vnbVar));
            Drawable mutate = context.getDrawable(R.drawable.calendar_date).mutate();
            this.e0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(vm2.f(0.1f, aob.v0(i2, vnbVar), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i3 = 0; i3 < 8; i3++) {
            this.M[i3] = hl.L(44.0f);
        }
        int L = hl.L(this.h0 ? 10.0f : (i == 0 ? jn7.P1 : jn7.O3) - 15);
        this.R = L;
        if (d79Var.d1()) {
            this.R = hl.L(this.h0 ? -4.0f : 6.0f) + L;
        }
        d();
        setFocusableInTouchMode(true);
        this.c0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.d0 = context.getDrawable(R.drawable.fast_scroll_shadow);
    }

    public final void a(ll0 ll0Var, ol0 ol0Var) {
        d79 d79Var = this.q0;
        jl0 c = ll0Var.c(d79Var.e1, ol0Var, false);
        this.f0 = c;
        c.q(hl.L(4.0f));
        this.f0.r(hl.L(24.0f));
        jl0 c2 = ll0Var.c(d79Var.e1, ol0Var, false);
        this.g0 = c2;
        c2.q(hl.L(6.0f));
        this.g0.u(hl.L(4.0f));
        this.g0.r(hl.L(14.0f));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.m7));
        hashSet.add(Integer.valueOf(aob.l7));
        hashSet.add(Integer.valueOf(aob.n7));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    public final void b(boolean z) {
        d79 d79Var = this.q0;
        q79 layoutManager = d79Var.getLayoutManager();
        if (layoutManager instanceof x46) {
            x46 x46Var = (x46) layoutManager;
            char c = 1;
            char c2 = 1;
            char c3 = 1;
            if (x46Var.o) {
                j79 adapter = d79Var.getAdapter();
                if (adapter instanceof l69) {
                    l69 l69Var = (l69) adapter;
                    float f = this.e;
                    int[] iArr = this.a0;
                    l69Var.G(d79Var, f, iArr);
                    if (z) {
                        x46Var.g1(iArr[0], (-iArr[1]) + d79Var.v1);
                    }
                    String F = l69Var.F(iArr[0]);
                    if (F == null) {
                        StaticLayout staticLayout = this.r;
                        if (staticLayout != null) {
                            this.s = staticLayout;
                        }
                        this.r = null;
                        return;
                    }
                    if (F.equals(this.J)) {
                        return;
                    }
                    this.J = F;
                    int i = this.S;
                    TextPaint textPaint = this.I;
                    if (i == 0) {
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
                                spannableStringBuilder.setSpan(new fy2(c3 == true ? 1 : 0), split2[0].length(), charSequence.length(), 0);
                                this.w = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F);
                                spannableStringBuilder2.setSpan(new fy2(c2 == true ? 1 : 0), split[0].length(), F.length(), 0);
                                this.x = new StaticLayout(spannableStringBuilder2, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(F);
                                spannableStringBuilder3.setSpan(new fy2(c == true ? 1 : 0), 0, split[0].length(), 0);
                                this.y = new StaticLayout(spannableStringBuilder3, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                            } else {
                                this.x = this.r;
                                this.y = null;
                            }
                            this.H = this.w.getWidth();
                            this.E = 0.0f;
                            this.F = getProgress() > this.G;
                        }
                        this.G = getProgress();
                    }
                    this.s = null;
                    if (this.r.getLineCount() > 0) {
                        this.r.getLineWidth(0);
                        this.r.getLineLeft(0);
                        if (this.h0) {
                            this.N = (((hl.L(88.0f) - this.r.getLineWidth(0)) / 2.0f) + hl.L(10.0f)) - this.r.getLineLeft(0);
                        } else {
                            this.N = ((hl.L(88.0f) - this.r.getLineWidth(0)) / 2.0f) - this.r.getLineLeft(0);
                        }
                        this.O = (hl.L(88.0f) - this.r.getHeight()) / 2;
                    }
                }
            }
        }
    }

    public final void c() {
        if (this.S != 1) {
            return;
        }
        if (!this.V) {
            this.V = true;
            invalidate();
        }
        ki7 ki7Var = this.j0;
        hl.r(ki7Var);
        hl.d3(ki7Var, 2000L);
    }

    public final void d() {
        vnb vnbVar = this.q0.o2;
        int i = this.S;
        this.T = i == 0 ? aob.v0(aob.m7, vnbVar) : vm2.o(-16777216, jn7.m1);
        this.U = aob.v0(aob.l7, vnbVar);
        this.c.setColor(this.T);
        TextPaint textPaint = this.I;
        if (i == 0) {
            textPaint.setColor(aob.v0(aob.n7, vnbVar));
        } else {
            textPaint.setColor(aob.v0(aob.G6, vnbVar));
        }
        invalidate();
    }

    @Override // android.view.View
    public float getAlpha() {
        return this.p0;
    }

    public float getProgress() {
        return this.e;
    }

    public int getScrollBarY() {
        return hl.L(17.0f) + ((int) Math.ceil((getMeasuredHeight() - hl.L(54.0f)) * this.e));
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return this.n;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        if (this.q0.I1) {
            super.layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        char c;
        float f2;
        float f3;
        int i;
        float f4;
        float f5;
        float L;
        float L2;
        float f6;
        float f7;
        int paddingTop = (this.a ? getPaddingTop() : 0) + ((int) Math.ceil(((getMeasuredHeight() - r2) - hl.L(54.0f)) * this.e));
        int i2 = this.R;
        float f8 = i2;
        float L3 = hl.L(12.0f) + paddingTop;
        float L4 = hl.L(5.0f) + i2;
        float L5 = hl.L(42.0f) + paddingTop;
        RectF rectF = this.b;
        rectF.set(f8, L3, L4, L5);
        int i3 = this.S;
        Paint paint = this.c;
        if (i3 == 0) {
            f = 8.0f;
            c = 2;
            paint.setColor(vm2.f(this.P, this.T, this.U));
            canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), paint);
            f4 = 2.0f;
            f2 = 24.0f;
            f3 = 4.0f;
            i = 0;
        } else {
            f = 8.0f;
            c = 2;
            int i4 = aob.d6;
            d79 d79Var = this.q0;
            f2 = 24.0f;
            paint.setColor(vm2.f(0.1f, aob.v0(i4, d79Var.o2), -1));
            float L6 = hl.L(27.0f) + paddingTop;
            jl0 jl0Var = this.f0;
            if (jl0Var != null) {
                f3 = 4.0f;
                i = 0;
                jl0Var.setBounds(hl.L(-20.0f) + i2, hl.L(-1.0f) + paddingTop, hl.L(36.0f) + i2, hl.L(55.0f) + paddingTop);
                this.f0.draw(canvas);
                f4 = 2.0f;
            } else {
                f3 = 4.0f;
                i = 0;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.d0;
                f4 = 2.0f;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (L6 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (L6 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(hl.L(8.0f) + i2, hl.L(27.0f) + paddingTop, hl.L(24.0f), paint);
            }
            paint.setColor(aob.v0(aob.G6, d79Var.o2));
            canvas.save();
            canvas.translate(hl.L(f3) + i2, (hl.L(f4) * this.P) + hl.L(34.0f) + paddingTop);
            Path path = this.L;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(hl.L(f3) + i2, (hl.L(24.0f) + paddingTop) - (hl.L(f4) * this.P));
            canvas.rotate(180.0f, 0.0f, -hl.L(f4));
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        if (i3 == 0) {
            if (this.m0 || this.P != 0.0f) {
                paint.setAlpha((int) (this.P * 255.0f));
                int L7 = hl.L(30.0f) + paddingTop;
                int L8 = paddingTop - hl.L(46.0f);
                if (L8 <= hl.L(12.0f)) {
                    f5 = hl.L(12.0f) - L8;
                    L8 = hl.L(12.0f);
                } else {
                    f5 = 0.0f;
                }
                canvas.translate(hl.L(10.0f), L8);
                if (f5 <= hl.L(29.0f)) {
                    L = hl.L(44.0f);
                    L2 = ((f5 / hl.L(29.0f)) * hl.L(40.0f)) + hl.L(f3);
                } else {
                    L = ((1.0f - ((f5 - hl.L(29.0f)) / hl.L(29.0f))) * hl.L(40.0f)) + hl.L(f3);
                    L2 = hl.L(44.0f);
                }
                float[] fArr = this.M;
                boolean z = this.h0;
                Path path2 = this.K;
                if (!z ? fArr[c] != L || fArr[4] != L2 : fArr[i] != L || fArr[6] != L2) {
                    if (z) {
                        fArr[1] = L;
                        fArr[i] = L;
                        fArr[7] = L2;
                        fArr[6] = L2;
                    } else {
                        fArr[3] = L;
                        fArr[c] = L;
                        fArr[5] = L2;
                        fArr[4] = L2;
                    }
                    path2.reset();
                    if (z) {
                        f7 = hl.L(10.0f);
                        f6 = 98.0f;
                    } else {
                        f6 = 88.0f;
                        f7 = 0.0f;
                    }
                    rectF.set(f7, 0.0f, hl.L(f6), hl.L(88.0f));
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path2.close();
                }
                StaticLayout staticLayout = this.r;
                if (staticLayout == null) {
                    staticLayout = this.s;
                }
                if (staticLayout != null) {
                    canvas.save();
                    float f9 = this.P;
                    canvas.scale(f9, f9, f8, L7 - L8);
                    canvas.drawPath(path2, paint);
                    canvas.translate(this.N, this.O);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
            }
        } else if (i3 == 1) {
            if (this.r == null || this.W == 0.0f) {
                jl0 jl0Var2 = this.g0;
                if (jl0Var2 != null) {
                    jl0Var2.setAlpha(i);
                }
            } else {
                canvas.save();
                float f10 = (this.W * 0.3f) + 0.7f;
                canvas.scale(f10, f10, rectF.right - hl.L(12.0f), rectF.centerY());
                float centerY = rectF.centerY();
                float L9 = (rectF.left - (hl.L(30.0f) * this.P)) - hl.L(f);
                this.r.getHeight();
                rectF.set((L9 - (((1.0f - this.E) * this.H) + (this.E * this.r.getWidth()))) - hl.L(36.0f), (centerY - (this.r.getHeight() / f4)) - hl.L(f), L9 - hl.L(12.0f), (this.r.getHeight() / f4) + centerY + hl.L(f));
                Paint paint2 = this.d;
                int alpha = paint2.getAlpha();
                TextPaint textPaint = this.I;
                int alpha2 = textPaint.getAlpha();
                paint2.setAlpha((int) (alpha * this.W));
                if (this.g0 != null) {
                    Rect rect = hl.Q;
                    rectF.round(rect);
                    rect.inset(-hl.L(f3), -hl.L(f3));
                    this.g0.setBounds(rect);
                    this.g0.setAlpha((int) (this.W * 255.0f));
                    this.g0.draw(canvas);
                } else {
                    int i5 = (int) rectF.left;
                    int i6 = (int) rectF.top;
                    int i7 = (int) rectF.right;
                    int i8 = (int) rectF.bottom;
                    Drawable drawable2 = this.e0;
                    drawable2.setBounds(i5, i6, i7, i8);
                    drawable2.setAlpha((int) (this.W * 255.0f));
                    drawable2.draw(canvas);
                }
                float f11 = this.E;
                if (f11 != 1.0f) {
                    float f12 = f11 + 0.10666667f;
                    this.E = f12;
                    if (f12 > 1.0f) {
                        this.E = 1.0f;
                    } else {
                        invalidate();
                    }
                }
                if (this.E != 1.0f) {
                    canvas.save();
                    rectF.inset(hl.L(f3), hl.L(f4));
                    canvas.clipRect(rectF);
                    if (this.w != null) {
                        textPaint.setAlpha((int) ((1.0f - this.E) * alpha2 * this.W));
                        canvas.save();
                        canvas.translate((L9 - this.w.getWidth()) - hl.L(f2), (hl.L(15.0f) * (this.F ? -1 : 1) * this.E) + (centerY - (this.w.getHeight() / f4)));
                        this.w.draw(canvas);
                        canvas.restore();
                    }
                    if (this.x != null) {
                        textPaint.setAlpha((int) (alpha2 * this.W * this.E));
                        canvas.save();
                        canvas.translate((L9 - this.x.getWidth()) - hl.L(f2), qd4.A(1.0f, this.E, hl.L(15.0f) * (this.F ? 1 : -1), centerY - (this.x.getHeight() / f4)));
                        this.x.draw(canvas);
                        canvas.restore();
                    }
                    if (this.y != null) {
                        textPaint.setAlpha((int) (alpha2 * this.W));
                        canvas.save();
                        uh9.n(this.y.getHeight(), f4, centerY, (L9 - this.y.getWidth()) - hl.L(f2), canvas);
                        this.y.draw(canvas);
                        canvas.restore();
                    }
                    canvas.restore();
                } else {
                    textPaint.setAlpha((int) (alpha2 * this.W));
                    canvas.save();
                    canvas.translate((L9 - this.r.getWidth()) - hl.L(f2), qd4.A(1.0f, this.E, hl.L(15.0f), centerY - (this.r.getHeight() / 2.0f)));
                    this.r.draw(canvas);
                    canvas.restore();
                }
                paint2.setAlpha(alpha);
                textPaint.setAlpha(alpha2);
                canvas.restore();
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.Q;
        if (j < 0 || j > 17) {
            j = 17;
        }
        boolean z2 = this.m0;
        if ((z2 && this.r != null && this.P < 1.0f) || ((!z2 || this.r == null) && this.P > 0.0f)) {
            this.Q = currentTimeMillis;
            invalidate();
            if (!this.m0 || this.r == null) {
                float f13 = this.P - (j / 120.0f);
                this.P = f13;
                if (f13 < 0.0f) {
                    this.P = 0.0f;
                }
            } else {
                float f14 = (j / 120.0f) + this.P;
                this.P = f14;
                if (f14 > 1.0f) {
                    this.P = 1.0f;
                }
            }
        }
        boolean z3 = this.V;
        float f15 = this.W;
        if (z3) {
            if (f15 != 1.0f) {
                float f16 = (j / 120.0f) + f15;
                this.W = f16;
                if (f16 > 1.0f) {
                    this.W = 1.0f;
                }
                invalidate();
                return;
            }
            return;
        }
        if (f15 != 0.0f) {
            float f17 = f15 - (j / 120.0f);
            this.W = f17;
            if (f17 < 0.0f) {
                this.W = 0.0f;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(hl.L(this.S == 0 ? 132.0f : 240.0f), View.MeasureSpec.getSize(i2));
        Path path = this.L;
        path.reset();
        path.setLastPoint(0.0f, 0.0f);
        path.lineTo(hl.L(4.0f), -hl.L(4.0f));
        path.lineTo(-hl.L(4.0f), -hl.L(4.0f));
        path.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x013f, code lost:
    
        r0 = r9.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0143, code lost:
    
        if (r0 < r10) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014d, code lost:
    
        if (r0 > (hl.L(30.0f) + r10)) goto L79;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b0) {
            this.n = false;
            return false;
        }
        int action = motionEvent.getAction();
        d79 d79Var = this.q0;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f = y;
            this.l0 = y;
            float ceil = ((float) Math.ceil((getMeasuredHeight() - hl.L(54.0f)) * this.e)) + hl.L(12.0f);
            boolean z = this.h0;
            if (!z ? x >= hl.L(107.0f) : x <= hl.L(25.0f)) {
                float f = this.f;
                if (f >= ceil && f <= hl.L(30.0f) + ceil) {
                    if (this.S == 1 && !this.V) {
                        if (z) {
                        }
                    }
                    this.h = this.f - ceil;
                    this.n0 = System.currentTimeMillis();
                    this.n = true;
                    this.m0 = false;
                    this.Q = System.currentTimeMillis();
                    invalidate();
                    j79 adapter = d79Var.getAdapter();
                    c();
                    if (adapter instanceof l69) {
                        ((l69) adapter).K();
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
                if (Math.abs(motionEvent.getY() - this.l0) > this.c0) {
                    this.m0 = true;
                }
                if (this.m0) {
                    float y2 = motionEvent.getY();
                    float L = hl.L(12.0f) + this.h;
                    float measuredHeight = (getMeasuredHeight() - hl.L(42.0f)) + this.h;
                    if (y2 < L) {
                        y2 = L;
                    } else if (y2 > measuredHeight) {
                        y2 = measuredHeight;
                    }
                    float f2 = y2 - this.f;
                    this.f = y2;
                    float measuredHeight2 = (f2 / (getMeasuredHeight() - hl.L(54.0f))) + this.e;
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
        j79 adapter2 = d79Var.getAdapter();
        if (this.n && !this.m0 && System.currentTimeMillis() - this.n0 < 150 && (adapter2 instanceof l69)) {
            ((l69) adapter2).I();
        }
        this.m0 = false;
        this.n = false;
        this.Q = System.currentTimeMillis();
        invalidate();
        if (adapter2 instanceof l69) {
            ((l69) adapter2).J(d79Var);
        }
        c();
        return true;
        return true;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        if (this.p0 != f) {
            this.p0 = f;
            super.setAlpha(f * this.o0);
        }
    }

    public void setIsVisible(boolean z) {
        if (this.b0 != z) {
            this.b0 = z;
            float f = z ? 1.0f : 0.0f;
            this.o0 = f;
            super.setAlpha(this.p0 * f);
        }
    }

    public void setProgress(float f) {
        this.e = f;
        invalidate();
    }

    public void setVisibilityAlpha(float f) {
        if (this.o0 != f) {
            this.o0 = f;
            super.setAlpha(this.p0 * f);
        }
    }

    @Override // snb
    public final void updateColors() {
        int f;
        try {
            d();
            if (this.S != 0) {
                int v0 = aob.v0(aob.d6, this.q0.o2);
                this.d.setColor(v0);
                Drawable drawable = this.e0;
                if (drawable == null || (f = vm2.f(0.1f, v0, -1)) == this.k0) {
                    return;
                }
                this.k0 = f;
                drawable.setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
