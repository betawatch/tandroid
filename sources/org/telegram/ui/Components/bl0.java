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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bl0 extends View {
    public boolean B;
    public float C;
    public float D;
    public final TextPaint E;
    public String F;
    public final Path G;
    public final Path H;
    public final float[] I;
    public float J;
    public float K;
    public float L;
    public long M;
    public final int N;
    public final int O;
    public int P;
    public int Q;
    public boolean R;
    public float S;
    public final int[] T;
    public boolean U;
    public final float V;
    public final Drawable W;
    public boolean a;
    public final Drawable a0;
    public final RectF b;
    public pg.b b0;
    public final Paint c;
    public pg.b c0;
    public final Paint d;
    public final boolean d0;
    public float e;
    public int e0;
    public float f;
    public final m2.b f0;
    public float g0;
    public float h;
    public boolean h0;
    public long i0;
    public float j0;
    public float k0;
    public final /* synthetic */ sl0 l0;
    public boolean n;
    public StaticLayout r;
    public StaticLayout s;
    public StaticLayout v;
    public StaticLayout w;
    public StaticLayout x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl0(sl0 sl0Var, Context context, int i10) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var = sl0Var.m2;
        this.l0 = sl0Var;
        this.a = true;
        this.b = new RectF();
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.y = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.G = new Path();
        this.H = new Path();
        this.I = new float[8];
        this.T = new int[2];
        this.f0 = new m2.b(this, 29);
        this.k0 = 1.0f;
        this.O = i10;
        if (i10 == 0) {
            textPaint.setTextSize(AndroidUtilities.dp(45.0f));
            this.d0 = LocaleController.isRTL;
        } else {
            this.d0 = false;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            int i11 = org.telegram.ui.ActionBar.j6.d6;
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            Drawable mutate = context.getDrawable(R.drawable.calendar_date).mutate();
            this.a0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.1f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i12 = 0; i12 < 8; i12++) {
            this.I[i12] = AndroidUtilities.dp(44.0f);
        }
        int dp = AndroidUtilities.dp(this.d0 ? 10.0f : (i10 == 0 ? 132 : 240) - 15);
        this.N = dp;
        if (sl0Var.b1()) {
            this.N = AndroidUtilities.dp(this.d0 ? -4.0f : 6.0f) + dp;
        }
        c();
        setFocusableInTouchMode(true);
        this.V = ViewConfiguration.get(context).getScaledTouchSlop();
        this.W = context.getDrawable(R.drawable.fast_scroll_shadow);
    }

    public final void a(boolean z4) {
        sl0 sl0Var = this.l0;
        f2.v0 layoutManager = sl0Var.getLayoutManager();
        if (layoutManager instanceof f2.i0) {
            f2.i0 i0Var = (f2.i0) layoutManager;
            if (i0Var.o == 1) {
                f2.o0 adapter = sl0Var.getAdapter();
                if (adapter instanceof cl0) {
                    cl0 cl0Var = (cl0) adapter;
                    float f10 = this.e;
                    int[] iArr = this.T;
                    cl0Var.G(sl0Var, f10, iArr);
                    if (z4) {
                        i0Var.h1(iArr[0], (-iArr[1]) + sl0Var.t1);
                    }
                    String F = cl0Var.F(iArr[0]);
                    if (F == null) {
                        StaticLayout staticLayout = this.r;
                        if (staticLayout != null) {
                            this.s = staticLayout;
                        }
                        this.r = null;
                        return;
                    }
                    if (F.equals(this.F)) {
                        return;
                    }
                    this.F = F;
                    int i10 = this.O;
                    TextPaint textPaint = this.E;
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
                                spannableStringBuilder.setSpan(new lz(false), split2[0].length(), charSequence.length(), 0);
                                this.v = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F);
                                spannableStringBuilder2.setSpan(new lz(false), split[0].length(), F.length(), 0);
                                this.w = new StaticLayout(spannableStringBuilder2, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(F);
                                spannableStringBuilder3.setSpan(new lz(false), 0, split[0].length(), 0);
                                this.x = new StaticLayout(spannableStringBuilder3, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                            } else {
                                this.w = this.r;
                                this.x = null;
                            }
                            this.D = this.v.getWidth();
                            this.y = 0.0f;
                            this.B = getProgress() > this.C;
                        }
                        this.C = getProgress();
                    }
                    this.s = null;
                    if (this.r.getLineCount() > 0) {
                        this.r.getLineWidth(0);
                        this.r.getLineLeft(0);
                        if (this.d0) {
                            this.J = (((AndroidUtilities.dp(88.0f) - this.r.getLineWidth(0)) / 2.0f) + AndroidUtilities.dp(10.0f)) - this.r.getLineLeft(0);
                        } else {
                            this.J = ((AndroidUtilities.dp(88.0f) - this.r.getLineWidth(0)) / 2.0f) - this.r.getLineLeft(0);
                        }
                        this.K = (AndroidUtilities.dp(88.0f) - this.r.getHeight()) / 2;
                    }
                }
            }
        }
    }

    public final void b() {
        if (this.O != 1) {
            return;
        }
        if (!this.R) {
            this.R = true;
            invalidate();
        }
        m2.b bVar = this.f0;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 2000L);
    }

    public final void c() {
        sl0 sl0Var = this.l0;
        int i10 = this.O;
        this.P = i10 == 0 ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.m7, sl0Var.m2) : i0.a.k(-16777216, 102);
        this.Q = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.l7, sl0Var.m2);
        this.c.setColor(this.P);
        TextPaint textPaint = this.E;
        if (i10 == 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n7, sl0Var.m2));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, sl0Var.m2));
        }
        invalidate();
    }

    @Override // android.view.View
    public float getAlpha() {
        return this.k0;
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
        if (this.l0.G1) {
            super.layout(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        char c3;
        float f13;
        float f14;
        float f15;
        float dp;
        float dp2;
        int paddingTop = (this.a ? getPaddingTop() : 0) + ((int) Math.ceil(((getMeasuredHeight() - r2) - AndroidUtilities.dp(54.0f)) * this.e));
        int i10 = this.N;
        float f16 = i10;
        float dp3 = AndroidUtilities.dp(12.0f) + paddingTop;
        float dp4 = AndroidUtilities.dp(5.0f) + i10;
        float dp5 = AndroidUtilities.dp(42.0f) + paddingTop;
        RectF rectF = this.b;
        rectF.set(f16, dp3, dp4, dp5);
        int i11 = this.O;
        Paint paint = this.c;
        if (i11 == 0) {
            f10 = 12.0f;
            f11 = 36.0f;
            paint.setColor(i0.a.d(this.L, this.P, this.Q));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
            f12 = 8.0f;
            c3 = 2;
            f13 = 24.0f;
            f14 = 4.0f;
        } else {
            f10 = 12.0f;
            f11 = 36.0f;
            int i12 = org.telegram.ui.ActionBar.j6.d6;
            sl0 sl0Var = this.l0;
            f12 = 8.0f;
            paint.setColor(i0.a.d(0.1f, org.telegram.ui.ActionBar.j6.v0(i12, sl0Var.m2), -1));
            float dp6 = AndroidUtilities.dp(27.0f) + paddingTop;
            pg.b bVar = this.b0;
            if (bVar != null) {
                c3 = 2;
                f13 = 24.0f;
                bVar.setBounds(AndroidUtilities.dp(-20.0f) + i10, AndroidUtilities.dp(-1.0f) + paddingTop, AndroidUtilities.dp(36.0f) + i10, AndroidUtilities.dp(55.0f) + paddingTop);
                this.b0.draw(canvas);
                f14 = 4.0f;
            } else {
                c3 = 2;
                f13 = 24.0f;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.W;
                f14 = 4.0f;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (dp6 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (dp6 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(AndroidUtilities.dp(8.0f) + i10, AndroidUtilities.dp(27.0f) + paddingTop, AndroidUtilities.dp(24.0f), paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, sl0Var.m2));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f14) + i10, (AndroidUtilities.dp(2.0f) * this.L) + AndroidUtilities.dp(34.0f) + paddingTop);
            Path path = this.H;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f14) + i10, (AndroidUtilities.dp(f13) + paddingTop) - (AndroidUtilities.dp(2.0f) * this.L));
            canvas.rotate(180.0f, 0.0f, -AndroidUtilities.dp(2.0f));
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        if (i11 == 0) {
            if (this.h0 || this.L != 0.0f) {
                paint.setAlpha((int) (this.L * 255.0f));
                int dp7 = AndroidUtilities.dp(30.0f) + paddingTop;
                int dp8 = paddingTop - AndroidUtilities.dp(46.0f);
                if (dp8 <= AndroidUtilities.dp(f10)) {
                    f15 = AndroidUtilities.dp(f10) - dp8;
                    dp8 = AndroidUtilities.dp(f10);
                } else {
                    f15 = 0.0f;
                }
                canvas.translate(AndroidUtilities.dp(10.0f), dp8);
                if (f15 <= AndroidUtilities.dp(29.0f)) {
                    dp = AndroidUtilities.dp(44.0f);
                    dp2 = ((f15 / AndroidUtilities.dp(29.0f)) * AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(f14);
                } else {
                    dp = ((1.0f - ((f15 - AndroidUtilities.dp(29.0f)) / AndroidUtilities.dp(29.0f))) * AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(f14);
                    dp2 = AndroidUtilities.dp(44.0f);
                }
                boolean z4 = this.d0;
                Path path2 = this.G;
                float[] fArr = this.I;
                if ((z4 && (fArr[0] != dp || fArr[6] != dp2)) || (!z4 && (fArr[c3] != dp || fArr[4] != dp2))) {
                    if (z4) {
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
                    rectF.set(z4 ? AndroidUtilities.dp(10.0f) : 0.0f, 0.0f, AndroidUtilities.dp(z4 ? 98.0f : 88.0f), AndroidUtilities.dp(88.0f));
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path2.close();
                }
                StaticLayout staticLayout = this.r;
                if (staticLayout == null) {
                    staticLayout = this.s;
                }
                if (staticLayout != null) {
                    canvas.save();
                    float f17 = this.L;
                    canvas.scale(f17, f17, f16, dp7 - dp8);
                    canvas.drawPath(path2, paint);
                    canvas.translate(this.J, this.K);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
            }
        } else if (i11 == 1 && this.r != null && this.S != 0.0f) {
            canvas.save();
            float f18 = (this.S * 0.3f) + 0.7f;
            canvas.scale(f18, f18, rectF.right - AndroidUtilities.dp(f10), rectF.centerY());
            float centerY = rectF.centerY();
            float dp9 = (rectF.left - (AndroidUtilities.dp(30.0f) * this.L)) - AndroidUtilities.dp(f12);
            this.r.getHeight();
            AndroidUtilities.dp(6.0f);
            rectF.set((dp9 - (((1.0f - this.y) * this.D) + (this.y * this.r.getWidth()))) - AndroidUtilities.dp(f11), (centerY - (this.r.getHeight() / 2.0f)) - AndroidUtilities.dp(f12), dp9 - AndroidUtilities.dp(f10), (this.r.getHeight() / 2.0f) + centerY + AndroidUtilities.dp(f12));
            Paint paint2 = this.d;
            int alpha = paint2.getAlpha();
            TextPaint textPaint = this.E;
            int alpha2 = textPaint.getAlpha();
            paint2.setAlpha((int) (alpha * this.S));
            if (this.c0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF.round(rect);
                rect.inset(-AndroidUtilities.dp(f14), -AndroidUtilities.dp(f14));
                this.c0.setBounds(rect);
                this.c0.draw(canvas);
            } else {
                int i13 = (int) rectF.left;
                int i14 = (int) rectF.top;
                int i15 = (int) rectF.right;
                int i16 = (int) rectF.bottom;
                Drawable drawable2 = this.a0;
                drawable2.setBounds(i13, i14, i15, i16);
                drawable2.setAlpha((int) (this.S * 255.0f));
                drawable2.draw(canvas);
            }
            float f19 = this.y;
            if (f19 != 1.0f) {
                float f20 = f19 + 0.10666667f;
                this.y = f20;
                if (f20 > 1.0f) {
                    this.y = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (this.y != 1.0f) {
                canvas.save();
                rectF.inset(AndroidUtilities.dp(f14), AndroidUtilities.dp(2.0f));
                canvas.clipRect(rectF);
                if (this.v != null) {
                    textPaint.setAlpha((int) ((1.0f - this.y) * alpha2 * this.S));
                    canvas.save();
                    canvas.translate((dp9 - this.v.getWidth()) - AndroidUtilities.dp(f13), (AndroidUtilities.dp(15.0f) * (this.B ? -1 : 1) * this.y) + (centerY - (this.v.getHeight() / 2.0f)));
                    this.v.draw(canvas);
                    canvas.restore();
                }
                if (this.w != null) {
                    textPaint.setAlpha((int) (alpha2 * this.S * this.y));
                    canvas.save();
                    canvas.translate((dp9 - this.w.getWidth()) - AndroidUtilities.dp(f13), e2.c.w(1.0f, this.y, AndroidUtilities.dp(15.0f) * (this.B ? 1 : -1), centerY - (this.w.getHeight() / 2.0f)));
                    this.w.draw(canvas);
                    canvas.restore();
                }
                if (this.x != null) {
                    textPaint.setAlpha((int) (alpha2 * this.S));
                    canvas.save();
                    canvas.translate((dp9 - this.x.getWidth()) - AndroidUtilities.dp(f13), centerY - (this.x.getHeight() / 2.0f));
                    this.x.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            } else {
                textPaint.setAlpha((int) (alpha2 * this.S));
                canvas.save();
                canvas.translate((dp9 - this.r.getWidth()) - AndroidUtilities.dp(f13), e2.c.w(1.0f, this.y, AndroidUtilities.dp(15.0f), centerY - (this.r.getHeight() / 2.0f)));
                this.r.draw(canvas);
                canvas.restore();
            }
            paint2.setAlpha(alpha);
            textPaint.setAlpha(alpha2);
            canvas.restore();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.M;
        if (j10 < 0 || j10 > 17) {
            j10 = 17;
        }
        boolean z10 = this.h0;
        if ((z10 && this.r != null && this.L < 1.0f) || ((!z10 || this.r == null) && this.L > 0.0f)) {
            this.M = currentTimeMillis;
            invalidate();
            if (!this.h0 || this.r == null) {
                float f21 = this.L - (j10 / 120.0f);
                this.L = f21;
                if (f21 < 0.0f) {
                    this.L = 0.0f;
                }
            } else {
                float f22 = (j10 / 120.0f) + this.L;
                this.L = f22;
                if (f22 > 1.0f) {
                    this.L = 1.0f;
                }
            }
        }
        boolean z11 = this.R;
        if (z11) {
            float f23 = this.S;
            if (f23 != 1.0f) {
                float f24 = (j10 / 120.0f) + f23;
                this.S = f24;
                if (f24 > 1.0f) {
                    this.S = 1.0f;
                }
                invalidate();
                return;
            }
        }
        if (z11) {
            return;
        }
        float f25 = this.S;
        if (f25 != 0.0f) {
            float f26 = f25 - (j10 / 120.0f);
            this.S = f26;
            if (f26 < 0.0f) {
                this.S = 0.0f;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(this.O == 0 ? 132.0f : 240.0f), View.MeasureSpec.getSize(i11));
        Path path = this.H;
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
        if (!this.U) {
            this.n = false;
            return false;
        }
        int action = motionEvent.getAction();
        sl0 sl0Var = this.l0;
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f = y10;
            this.g0 = y10;
            float ceil = ((float) Math.ceil((getMeasuredHeight() - AndroidUtilities.dp(54.0f)) * this.e)) + AndroidUtilities.dp(12.0f);
            boolean z4 = this.d0;
            if ((!z4 || x10 <= AndroidUtilities.dp(25.0f)) && (z4 || x10 >= AndroidUtilities.dp(107.0f))) {
                float f10 = this.f;
                if (f10 >= ceil && f10 <= AndroidUtilities.dp(30.0f) + ceil) {
                    if (this.O == 1 && !this.R) {
                        if ((!z4 || x10 <= AndroidUtilities.dp(25.0f)) && (z4 || x10 >= getMeasuredWidth() - AndroidUtilities.dp(25.0f))) {
                            float f11 = this.f;
                            if (f11 >= ceil) {
                            }
                        }
                    }
                    this.h = this.f - ceil;
                    this.i0 = System.currentTimeMillis();
                    this.n = true;
                    this.h0 = false;
                    this.M = System.currentTimeMillis();
                    invalidate();
                    f2.o0 adapter = sl0Var.getAdapter();
                    b();
                    if (adapter instanceof cl0) {
                        ((cl0) adapter).K();
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
                if (Math.abs(motionEvent.getY() - this.g0) > this.V) {
                    this.h0 = true;
                }
                if (this.h0) {
                    float y11 = motionEvent.getY();
                    float dp = AndroidUtilities.dp(12.0f) + this.h;
                    float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(42.0f)) + this.h;
                    if (y11 < dp) {
                        y11 = dp;
                    } else if (y11 > measuredHeight) {
                        y11 = measuredHeight;
                    }
                    float f12 = y11 - this.f;
                    this.f = y11;
                    float measuredHeight2 = (f12 / (getMeasuredHeight() - AndroidUtilities.dp(54.0f))) + this.e;
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
        f2.o0 adapter2 = sl0Var.getAdapter();
        if (this.n && !this.h0 && System.currentTimeMillis() - this.i0 < 150 && (adapter2 instanceof cl0)) {
            ((cl0) adapter2).I();
        }
        this.h0 = false;
        this.n = false;
        this.M = System.currentTimeMillis();
        invalidate();
        if (adapter2 instanceof cl0) {
            ((cl0) adapter2).J(sl0Var);
        }
        b();
        return true;
        return true;
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        if (this.k0 != f10) {
            this.k0 = f10;
            super.setAlpha(f10 * this.j0);
        }
    }

    public void setIsVisible(boolean z4) {
        if (this.U != z4) {
            this.U = z4;
            float f10 = z4 ? 1.0f : 0.0f;
            this.j0 = f10;
            super.setAlpha(this.k0 * f10);
        }
    }

    public void setProgress(float f10) {
        this.e = f10;
        invalidate();
    }

    public void setVisibilityAlpha(float f10) {
        if (this.j0 != f10) {
            this.j0 = f10;
            super.setAlpha(this.k0 * f10);
        }
    }
}
