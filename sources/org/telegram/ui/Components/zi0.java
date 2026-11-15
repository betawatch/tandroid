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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zi0 extends View implements org.telegram.ui.ActionBar.z5 {
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
    public fh.g f0;
    public fh.g g0;
    public float h;
    public final boolean h0;
    public int i0;
    public final zj j0;
    public int k0;
    public float l0;
    public boolean m0;
    public boolean n;
    public long n0;
    public float o0;
    public float p0;
    public final /* synthetic */ uj0 q0;
    public StaticLayout r;
    public StaticLayout s;
    public StaticLayout w;
    public StaticLayout x;
    public StaticLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(uj0 uj0Var, Context context, int i7) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var = uj0Var.o2;
        this.q0 = uj0Var;
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
        this.j0 = new zj(this, 14);
        this.p0 = 1.0f;
        this.S = i7;
        if (i7 == 0) {
            textPaint.setTextSize(org.telegram.messenger.g0.L(45.0f));
            this.h0 = org.telegram.messenger.hd.a0;
        } else {
            this.h0 = false;
            textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            int i10 = org.telegram.ui.ActionBar.j6.d6;
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
            Drawable mutate = context.getDrawable(R.drawable.calendar_date).mutate();
            this.e0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.1f, org.telegram.ui.ActionBar.j6.w0(i10, e6Var), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i11 = 0; i11 < 8; i11++) {
            this.M[i11] = org.telegram.messenger.g0.L(44.0f);
        }
        int L = org.telegram.messenger.g0.L(this.h0 ? 10.0f : (i7 == 0 ? org.telegram.messenger.ns.Q1 : org.telegram.messenger.ns.P3) - 15);
        this.R = L;
        if (uj0Var.b1()) {
            this.R = org.telegram.messenger.g0.L(this.h0 ? -4.0f : 6.0f) + L;
        }
        d();
        setFocusableInTouchMode(true);
        this.c0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.d0 = context.getDrawable(R.drawable.fast_scroll_shadow);
    }

    public final void a(dh.c cVar, gh.e eVar) {
        uj0 uj0Var = this.q0;
        fh.g c10 = cVar.c(uj0Var.e1, eVar, false);
        this.f0 = c10;
        c10.q(org.telegram.messenger.g0.L(4.0f));
        this.f0.r(org.telegram.messenger.g0.L(24.0f));
        fh.g c11 = cVar.c(uj0Var.e1, eVar, false);
        this.g0 = c11;
        c11.q(org.telegram.messenger.g0.L(6.0f));
        this.g0.u(org.telegram.messenger.g0.L(4.0f));
        this.g0.r(org.telegram.messenger.g0.L(14.0f));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.m7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.l7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.n7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
    }

    public final void b(boolean z10) {
        uj0 uj0Var = this.q0;
        v4.o0 layoutManager = uj0Var.getLayoutManager();
        if (layoutManager instanceof v4.b0) {
            v4.b0 b0Var = (v4.b0) layoutManager;
            if (b0Var.o == 1) {
                v4.h0 adapter = uj0Var.getAdapter();
                if (adapter instanceof aj0) {
                    aj0 aj0Var = (aj0) adapter;
                    float f10 = this.e;
                    int[] iArr = this.a0;
                    aj0Var.G(uj0Var, f10, iArr);
                    if (z10) {
                        b0Var.h1(iArr[0], (-iArr[1]) + uj0Var.v1);
                    }
                    String F = aj0Var.F(iArr[0]);
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
                    int i7 = this.S;
                    TextPaint textPaint = this.I;
                    if (i7 == 0) {
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
                                spannableStringBuilder.setSpan(new my(false), split2[0].length(), charSequence.length(), 0);
                                this.w = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F);
                                spannableStringBuilder2.setSpan(new my(false), split[0].length(), F.length(), 0);
                                this.x = new StaticLayout(spannableStringBuilder2, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(F);
                                spannableStringBuilder3.setSpan(new my(false), 0, split[0].length(), 0);
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
                            this.N = (((org.telegram.messenger.g0.L(88.0f) - this.r.getLineWidth(0)) / 2.0f) + org.telegram.messenger.g0.L(10.0f)) - this.r.getLineLeft(0);
                        } else {
                            this.N = ((org.telegram.messenger.g0.L(88.0f) - this.r.getLineWidth(0)) / 2.0f) - this.r.getLineLeft(0);
                        }
                        this.O = (org.telegram.messenger.g0.L(88.0f) - this.r.getHeight()) / 2;
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
        zj zjVar = this.j0;
        org.telegram.messenger.g0.r(zjVar);
        org.telegram.messenger.g0.i3(zjVar, 2000L);
    }

    public final void d() {
        uj0 uj0Var = this.q0;
        int i7 = this.S;
        this.T = i7 == 0 ? org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.m7, uj0Var.o2) : i0.a.o(-16777216, org.telegram.messenger.ns.n1);
        this.U = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.l7, uj0Var.o2);
        this.c.setColor(this.T);
        TextPaint textPaint = this.I;
        if (i7 == 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.n7, uj0Var.o2));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, uj0Var.o2));
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
        return org.telegram.messenger.g0.L(17.0f) + ((int) Math.ceil((getMeasuredHeight() - org.telegram.messenger.g0.L(54.0f)) * this.e));
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return this.n;
    }

    @Override // android.view.View
    public final void layout(int i7, int i10, int i11, int i12) {
        if (this.q0.I1) {
            super.layout(i7, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        char c10;
        float f11;
        float f12;
        int i7;
        float f13;
        float f14;
        float L;
        float L2;
        int paddingTop = (this.a ? getPaddingTop() : 0) + ((int) Math.ceil(((getMeasuredHeight() - r2) - org.telegram.messenger.g0.L(54.0f)) * this.e));
        int i10 = this.R;
        float f15 = i10;
        float L3 = org.telegram.messenger.g0.L(12.0f) + paddingTop;
        float L4 = org.telegram.messenger.g0.L(5.0f) + i10;
        float L5 = org.telegram.messenger.g0.L(42.0f) + paddingTop;
        RectF rectF = this.b;
        rectF.set(f15, L3, L4, L5);
        int i11 = this.S;
        Paint paint = this.c;
        if (i11 == 0) {
            f10 = 8.0f;
            c10 = 2;
            paint.setColor(i0.a.f(this.P, this.T, this.U));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paint);
            f13 = 2.0f;
            f11 = 24.0f;
            f12 = 4.0f;
            i7 = 0;
        } else {
            f10 = 8.0f;
            c10 = 2;
            int i12 = org.telegram.ui.ActionBar.j6.d6;
            uj0 uj0Var = this.q0;
            f11 = 24.0f;
            paint.setColor(i0.a.f(0.1f, org.telegram.ui.ActionBar.j6.w0(i12, uj0Var.o2), -1));
            float L6 = org.telegram.messenger.g0.L(27.0f) + paddingTop;
            fh.g gVar = this.f0;
            if (gVar != null) {
                f12 = 4.0f;
                i7 = 0;
                gVar.setBounds(org.telegram.messenger.g0.L(-20.0f) + i10, org.telegram.messenger.g0.L(-1.0f) + paddingTop, org.telegram.messenger.g0.L(36.0f) + i10, org.telegram.messenger.g0.L(55.0f) + paddingTop);
                this.f0.draw(canvas);
                f13 = 2.0f;
            } else {
                f12 = 4.0f;
                i7 = 0;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.d0;
                f13 = 2.0f;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (L6 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (L6 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(org.telegram.messenger.g0.L(8.0f) + i10, org.telegram.messenger.g0.L(27.0f) + paddingTop, org.telegram.messenger.g0.L(24.0f), paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, uj0Var.o2));
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(f12) + i10, (org.telegram.messenger.g0.L(f13) * this.P) + org.telegram.messenger.g0.L(34.0f) + paddingTop);
            Path path = this.L;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(f12) + i10, (org.telegram.messenger.g0.L(24.0f) + paddingTop) - (org.telegram.messenger.g0.L(f13) * this.P));
            canvas.rotate(180.0f, 0.0f, -org.telegram.messenger.g0.L(f13));
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        if (i11 == 0) {
            if (this.m0 || this.P != 0.0f) {
                paint.setAlpha((int) (this.P * 255.0f));
                int L7 = org.telegram.messenger.g0.L(30.0f) + paddingTop;
                int L8 = paddingTop - org.telegram.messenger.g0.L(46.0f);
                if (L8 <= org.telegram.messenger.g0.L(12.0f)) {
                    f14 = org.telegram.messenger.g0.L(12.0f) - L8;
                    L8 = org.telegram.messenger.g0.L(12.0f);
                } else {
                    f14 = 0.0f;
                }
                canvas.translate(org.telegram.messenger.g0.L(10.0f), L8);
                if (f14 <= org.telegram.messenger.g0.L(29.0f)) {
                    L = org.telegram.messenger.g0.L(44.0f);
                    L2 = ((f14 / org.telegram.messenger.g0.L(29.0f)) * org.telegram.messenger.g0.L(40.0f)) + org.telegram.messenger.g0.L(f12);
                } else {
                    L = ((1.0f - ((f14 - org.telegram.messenger.g0.L(29.0f)) / org.telegram.messenger.g0.L(29.0f))) * org.telegram.messenger.g0.L(40.0f)) + org.telegram.messenger.g0.L(f12);
                    L2 = org.telegram.messenger.g0.L(44.0f);
                }
                boolean z10 = this.h0;
                Path path2 = this.K;
                float[] fArr = this.M;
                if ((z10 && (fArr[i7] != L || fArr[6] != L2)) || (!z10 && (fArr[c10] != L || fArr[4] != L2))) {
                    if (z10) {
                        fArr[1] = L;
                        fArr[i7] = L;
                        fArr[7] = L2;
                        fArr[6] = L2;
                    } else {
                        fArr[3] = L;
                        fArr[c10] = L;
                        fArr[5] = L2;
                        fArr[4] = L2;
                    }
                    path2.reset();
                    rectF.set(z10 ? org.telegram.messenger.g0.L(10.0f) : 0.0f, 0.0f, org.telegram.messenger.g0.L(z10 ? 98.0f : 88.0f), org.telegram.messenger.g0.L(88.0f));
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path2.close();
                }
                StaticLayout staticLayout = this.r;
                if (staticLayout == null) {
                    staticLayout = this.s;
                }
                if (staticLayout != null) {
                    canvas.save();
                    float f16 = this.P;
                    canvas.scale(f16, f16, f15, L7 - L8);
                    canvas.drawPath(path2, paint);
                    canvas.translate(this.N, this.O);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
            }
        } else if (i11 == 1) {
            if (this.r == null || this.W == 0.0f) {
                fh.g gVar2 = this.g0;
                if (gVar2 != null) {
                    gVar2.setAlpha(i7);
                }
            } else {
                canvas.save();
                float f17 = (this.W * 0.3f) + 0.7f;
                canvas.scale(f17, f17, rectF.right - org.telegram.messenger.g0.L(12.0f), rectF.centerY());
                float centerY = rectF.centerY();
                float L9 = (rectF.left - (org.telegram.messenger.g0.L(30.0f) * this.P)) - org.telegram.messenger.g0.L(f10);
                this.r.getHeight();
                org.telegram.messenger.g0.L(6.0f);
                rectF.set((L9 - (((1.0f - this.E) * this.H) + (this.E * this.r.getWidth()))) - org.telegram.messenger.g0.L(36.0f), (centerY - (this.r.getHeight() / f13)) - org.telegram.messenger.g0.L(f10), L9 - org.telegram.messenger.g0.L(12.0f), (this.r.getHeight() / f13) + centerY + org.telegram.messenger.g0.L(f10));
                Paint paint2 = this.d;
                int alpha = paint2.getAlpha();
                TextPaint textPaint = this.I;
                int alpha2 = textPaint.getAlpha();
                paint2.setAlpha((int) (alpha * this.W));
                if (this.g0 != null) {
                    Rect rect = org.telegram.messenger.g0.Q;
                    rectF.round(rect);
                    rect.inset(-org.telegram.messenger.g0.L(f12), -org.telegram.messenger.g0.L(f12));
                    this.g0.setBounds(rect);
                    this.g0.setAlpha((int) (this.W * 255.0f));
                    this.g0.draw(canvas);
                } else {
                    int i13 = (int) rectF.left;
                    int i14 = (int) rectF.top;
                    int i15 = (int) rectF.right;
                    int i16 = (int) rectF.bottom;
                    Drawable drawable2 = this.e0;
                    drawable2.setBounds(i13, i14, i15, i16);
                    drawable2.setAlpha((int) (this.W * 255.0f));
                    drawable2.draw(canvas);
                }
                float f18 = this.E;
                if (f18 != 1.0f) {
                    float f19 = f18 + 0.10666667f;
                    this.E = f19;
                    if (f19 > 1.0f) {
                        this.E = 1.0f;
                    } else {
                        invalidate();
                    }
                }
                if (this.E != 1.0f) {
                    canvas.save();
                    rectF.inset(org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f13));
                    canvas.clipRect(rectF);
                    if (this.w != null) {
                        textPaint.setAlpha((int) ((1.0f - this.E) * alpha2 * this.W));
                        canvas.save();
                        canvas.translate((L9 - this.w.getWidth()) - org.telegram.messenger.g0.L(f11), (org.telegram.messenger.g0.L(15.0f) * (this.F ? -1 : 1) * this.E) + (centerY - (this.w.getHeight() / f13)));
                        this.w.draw(canvas);
                        canvas.restore();
                    }
                    if (this.x != null) {
                        textPaint.setAlpha((int) (alpha2 * this.W * this.E));
                        canvas.save();
                        canvas.translate((L9 - this.x.getWidth()) - org.telegram.messenger.g0.L(f11), com.google.android.gms.internal.vision.e2.z(1.0f, this.E, org.telegram.messenger.g0.L(15.0f) * (this.F ? 1 : -1), centerY - (this.x.getHeight() / f13)));
                        this.x.draw(canvas);
                        canvas.restore();
                    }
                    if (this.y != null) {
                        textPaint.setAlpha((int) (alpha2 * this.W));
                        canvas.save();
                        org.telegram.messenger.i20.j(this.y.getHeight(), f13, centerY, (L9 - this.y.getWidth()) - org.telegram.messenger.g0.L(f11), canvas);
                        this.y.draw(canvas);
                        canvas.restore();
                    }
                    canvas.restore();
                } else {
                    textPaint.setAlpha((int) (alpha2 * this.W));
                    canvas.save();
                    canvas.translate((L9 - this.r.getWidth()) - org.telegram.messenger.g0.L(f11), com.google.android.gms.internal.vision.e2.z(1.0f, this.E, org.telegram.messenger.g0.L(15.0f), centerY - (this.r.getHeight() / 2.0f)));
                    this.r.draw(canvas);
                    canvas.restore();
                }
                paint2.setAlpha(alpha);
                textPaint.setAlpha(alpha2);
                canvas.restore();
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.Q;
        if (j3 < 0 || j3 > 17) {
            j3 = 17;
        }
        boolean z11 = this.m0;
        if ((z11 && this.r != null && this.P < 1.0f) || ((!z11 || this.r == null) && this.P > 0.0f)) {
            this.Q = currentTimeMillis;
            invalidate();
            if (!this.m0 || this.r == null) {
                float f20 = this.P - (j3 / 120.0f);
                this.P = f20;
                if (f20 < 0.0f) {
                    this.P = 0.0f;
                }
            } else {
                float f21 = (j3 / 120.0f) + this.P;
                this.P = f21;
                if (f21 > 1.0f) {
                    this.P = 1.0f;
                }
            }
        }
        boolean z12 = this.V;
        if (z12) {
            float f22 = this.W;
            if (f22 != 1.0f) {
                float f23 = (j3 / 120.0f) + f22;
                this.W = f23;
                if (f23 > 1.0f) {
                    this.W = 1.0f;
                }
                invalidate();
                return;
            }
        }
        if (z12) {
            return;
        }
        float f24 = this.W;
        if (f24 != 0.0f) {
            float f25 = f24 - (j3 / 120.0f);
            this.W = f25;
            if (f25 < 0.0f) {
                this.W = 0.0f;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(this.S == 0 ? 132.0f : 240.0f), View.MeasureSpec.getSize(i10));
        Path path = this.L;
        path.reset();
        path.setLastPoint(0.0f, 0.0f);
        path.lineTo(org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        path.lineTo(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        path.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0152, code lost:
    
        if (r0 <= (org.telegram.messenger.g0.L(30.0f) + r10)) goto L78;
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
        uj0 uj0Var = this.q0;
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f = y10;
            this.l0 = y10;
            float ceil = ((float) Math.ceil((getMeasuredHeight() - org.telegram.messenger.g0.L(54.0f)) * this.e)) + org.telegram.messenger.g0.L(12.0f);
            boolean z10 = this.h0;
            if ((!z10 || x10 <= org.telegram.messenger.g0.L(25.0f)) && (z10 || x10 >= org.telegram.messenger.g0.L(107.0f))) {
                float f10 = this.f;
                if (f10 >= ceil && f10 <= org.telegram.messenger.g0.L(30.0f) + ceil) {
                    if (this.S == 1 && !this.V) {
                        if ((!z10 || x10 <= org.telegram.messenger.g0.L(25.0f)) && (z10 || x10 >= getMeasuredWidth() - org.telegram.messenger.g0.L(25.0f))) {
                            float f11 = this.f;
                            if (f11 >= ceil) {
                            }
                        }
                    }
                    this.h = this.f - ceil;
                    this.n0 = System.currentTimeMillis();
                    this.n = true;
                    this.m0 = false;
                    this.Q = System.currentTimeMillis();
                    invalidate();
                    v4.h0 adapter = uj0Var.getAdapter();
                    c();
                    if (adapter instanceof aj0) {
                        ((aj0) adapter).K();
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
                    float y11 = motionEvent.getY();
                    float L = org.telegram.messenger.g0.L(12.0f) + this.h;
                    float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(42.0f)) + this.h;
                    if (y11 < L) {
                        y11 = L;
                    } else if (y11 > measuredHeight) {
                        y11 = measuredHeight;
                    }
                    float f12 = y11 - this.f;
                    this.f = y11;
                    float measuredHeight2 = (f12 / (getMeasuredHeight() - org.telegram.messenger.g0.L(54.0f))) + this.e;
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
        v4.h0 adapter2 = uj0Var.getAdapter();
        if (this.n && !this.m0 && System.currentTimeMillis() - this.n0 < 150 && (adapter2 instanceof aj0)) {
            ((aj0) adapter2).I();
        }
        this.m0 = false;
        this.n = false;
        this.Q = System.currentTimeMillis();
        invalidate();
        if (adapter2 instanceof aj0) {
            ((aj0) adapter2).J(uj0Var);
        }
        c();
        return true;
        return true;
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        if (this.p0 != f10) {
            this.p0 = f10;
            super.setAlpha(f10 * this.o0);
        }
    }

    public void setIsVisible(boolean z10) {
        if (this.b0 != z10) {
            this.b0 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            this.o0 = f10;
            super.setAlpha(this.p0 * f10);
        }
    }

    public void setProgress(float f10) {
        this.e = f10;
        invalidate();
    }

    public void setVisibilityAlpha(float f10) {
        if (this.o0 != f10) {
            this.o0 = f10;
            super.setAlpha(this.p0 * f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int f10;
        try {
            d();
            if (this.S != 0) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.q0.o2);
                this.d.setColor(w02);
                Drawable drawable = this.e0;
                if (drawable == null || (f10 = i0.a.f(0.1f, w02, -1)) == this.k0) {
                    return;
                }
                this.k0 = f10;
                drawable.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
