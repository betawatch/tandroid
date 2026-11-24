// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class d28 extends qg5 {
    public final lm d;
    public final lm e;
    public final wd1 f;
    public final lm h;
    public final lm n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ w28 w;
    public final /* synthetic */ m8b x;
    public final /* synthetic */ y28 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d28(y28 y28Var, Context context, w28 w28Var, m8b m8bVar) {
        super(context);
        this.y = y28Var;
        this.w = w28Var;
        this.x = m8bVar;
        s33 s33Var = s33.f;
        this.d = new lm(150L, this, s33Var);
        this.e = new lm(150L, this, s33Var);
        this.f = new wd1(32, kk7.m1, kk7.O3);
        lm lmVar = new lm(this);
        this.h = lmVar;
        lm lmVar2 = new lm(this);
        this.n = lmVar2;
        lmVar.g = 500L;
        lmVar2.g = 100L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0155, code lost:
    
        if (r4 < 0.0f) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        TL_stories.StoryItem storyItem;
        y1b y1bVar;
        TL_stories.StoryItem storyItem2;
        int i;
        TLRPC.UserFull W1;
        float hideInterfaceAlpha;
        float f;
        float i2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        float f7;
        float f8;
        float f9;
        int i4;
        int i5;
        float f10;
        float f11;
        Paint paint;
        int i6;
        float f12;
        l8b l8bVar;
        l8b l8bVar2;
        y28 y28Var = this.y;
        float f13 = y28Var.y1;
        b28 b28Var = y28Var.Z0;
        c30 c30Var = y28Var.C2;
        x28 x28Var = y28Var.E1;
        ml mlVar = y28Var.U0;
        if (mlVar.E() || ((x28Var.e && c30Var.a) || (x28Var.f && c30Var.a))) {
            y28 y28Var2 = x28Var.k;
            TL_stories.PeerStories peerStories = y28Var2.k1;
            m8b m8bVar = y28Var2.z0;
            if (peerStories == null && (peerStories = y28Var2.I1.x(y28Var2.r1)) == null && (W1 = na7.q1(y28Var2.s2).W1(y28Var2.r1)) != null) {
                peerStories = W1.stories;
            }
            if (y28Var2.A1 && (storyItem2 = x28Var.a) != null && peerStories != null && ((!x2b.v(storyItem2) && ((i = x28Var.a.id) > peerStories.max_read_id || i > y28Var2.I1.f.get(y28Var2.r1, 0))) || y28Var2.s1)) {
                TL_stories.PeerStories peerStories2 = m8bVar.Q0;
                g2b g2bVar = y28Var2.I1;
                if (peerStories2 == null) {
                    long j = y28Var2.r1;
                    TL_stories.StoryItem storyItem3 = x28Var.a;
                    TL_stories.PeerStories x = g2bVar.x(j);
                    if (x == null) {
                        x = g2bVar.y(j);
                    }
                    if (g2bVar.X(x, storyItem3, false)) {
                        m8bVar.c1 = true;
                    }
                } else if (g2bVar.X(peerStories2, x28Var.a, true)) {
                    m8bVar.c1 = true;
                }
            } else if (y28Var2.A1 && (storyItem = x28Var.a) != null && (y1bVar = m8bVar.O0) != null && y1bVar.r(storyItem.id)) {
                m8bVar.c1 = true;
            }
        }
        hideInterfaceAlpha = y28Var.getHideInterfaceAlpha();
        if (x28Var.e) {
            l8b l8bVar3 = (l8b) c30Var.c;
            if (l8bVar3 != null) {
                i2 = Utilities.i(l8bVar3.getPlaybackProgress(y28Var.H2), 1.0f, 0.0f);
                if (c30Var.a && b28Var != null) {
                    b28Var.e();
                }
            } else {
                i2 = 0.0f;
            }
            invalidate();
            f = hideInterfaceAlpha;
        } else if (y28Var.H1 || !y28Var.A1 || y28Var.J1 || y28Var.K1 || y28Var.L1 || !mlVar.E()) {
            f = hideInterfaceAlpha;
            i2 = Utilities.i(y28Var.M0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = y28Var.N0;
            if (j2 == 0 || y28Var.Z2) {
                f = hideInterfaceAlpha;
            } else {
                f = hideInterfaceAlpha;
                if (y28Var.M0 <= 0 && currentTimeMillis - j2 > 0 && b28Var != null) {
                    b28Var.e();
                }
                y28Var.M0 += currentTimeMillis - y28Var.N0;
            }
            y28Var.N0 = currentTimeMillis;
            i2 = Utilities.i(y28Var.M0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (c30Var != null && (l8bVar2 = (l8b) c30Var.c) != null) {
            f2 = l8bVar2.currentSeek;
        }
        f2 = i2;
        if (!y28Var.O0 && i2 == 1.0f && ((!x28Var.e || !y28Var.Z2) && !y28Var.B2)) {
            y28Var.O0 = true;
            post(new oq7(this, (byte) 17));
        }
        m8b m8bVar2 = this.x;
        y1b y1bVar2 = m8bVar2.O0;
        if (y1bVar2 == null || y1bVar2.e == 3) {
            f3 = 1.0f;
            f4 = 4.0f;
            f5 = 2.0f;
            f6 = 8.0f;
        } else {
            igf igfVar = y28Var.g1;
            if (igfVar == null) {
                igfVar = new igf((byte) 3);
                y28Var.g1 = igfVar;
            }
            f4 = 4.0f;
            float f14 = (1.0f - y28Var.T3) * f * f13;
            int i7 = y28Var.B1;
            f3 = 1.0f;
            int g = m8bVar2.O0.g();
            f5 = 2.0f;
            v28 v28Var = y28Var.e1;
            f6 = 8.0f;
            gn gnVar = (gn) igfVar.d;
            int i8 = (g << 12) + i7;
            if (igfVar.a != i8) {
                igfVar.a = i8;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i7 + 1)).append((CharSequence) igfVar.b).append((CharSequence) "/").append((CharSequence) igfVar.c).append((CharSequence) String.valueOf(g));
                gnVar.t(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y = v28Var.getY();
            df0 df0Var = v28Var.b;
            float top = ((gnVar.e / 2.0f) + (y + df0Var.getTop())) - 1.0f;
            df0Var.setRightPadding((int) gnVar.c());
            canvas.translate((df0Var.getRightDrawableWidth() + (df0Var.getTextWidth() + (df0Var.getLeft() + (v28Var.getLeft() + gl.L(4.0f))))) - Utilities.j(((df0Var.getRightDrawableWidth() + df0Var.getTextWidth()) + r0) - df0Var.getWidth(), r0, 0), top);
            float L = gl.L(8.0f);
            float L2 = gl.L(2.0f);
            gl.P.set(-L, -L2, gnVar.c() + L, gnVar.e + L2);
            gnVar.C = (int) (f14 * 160.0f);
            gnVar.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, gl.L(f6) - (gl.L(f6) * y28Var.T3));
        boolean z = x28Var.e && (l8bVar = (l8b) c30Var.c) != null && l8bVar.isBuffering();
        boolean z2 = y28Var.B2;
        boolean z3 = z2 && x28Var != null && x28Var.e && m8bVar2.l0;
        float d = y28Var.F2.d(!z2 || z3);
        h4b h4bVar = y28Var.f1;
        int measuredWidth = getMeasuredWidth();
        int i9 = y28Var.C1;
        int i10 = y28Var.D1;
        float f15 = (f3 - y28Var.T3) * f13;
        TextPaint textPaint = h4bVar.c;
        if (i10 > 0) {
            boolean z4 = z && !z3;
            if (h4bVar.i != i9) {
                h4bVar.g = 0.0f;
                h4bVar.h = true;
            }
            h4bVar.i = i9;
            w28 w28Var = h4bVar.a;
            Paint paint2 = w28Var.a;
            Paint paint3 = w28Var.b;
            int L3 = i10 > 100 ? 1 : i10 >= 50 ? gl.L(f3) : gl.L(f5);
            boolean z5 = z4;
            float L4 = ((measuredWidth - gl.L(10.0f)) - ((i10 - 1) * L3)) / i10;
            float min = Math.min(L4 / f5, gl.L(f3));
            float d2 = h4bVar.b.d(z3);
            if (d2 > 0.0f) {
                float R1 = gl.R1(i2, f2, d2);
                canvas.save();
                textPaint.setAlpha((int) (d2 * 255.0f));
                i3 = L3;
                textPaint.setShadowLayer(gl.L(3.0f), 0.0f, gl.L(f3), bkb.p1(d2, 805306368));
                canvas.translate(((measuredWidth - h4bVar.f) / f5) - h4bVar.e, gl.U1(d2, gl.L(f4), gl.L(16.0f)));
                h4bVar.d.draw(canvas);
                canvas.restore();
                i2 = R1;
            } else {
                i3 = L3;
            }
            int i11 = 0;
            while (i11 < i10) {
                float L5 = (i11 * L4) + gl.L(5.0f) + (-0.0f) + (i3 * i11);
                if (L5 <= measuredWidth) {
                    float f16 = L5 + L4;
                    if (f16 >= 0.0f && f15 > 0.0f) {
                        float R12 = gl.R1(min, gl.N(f5), d2);
                        if (i11 > i9 || i11 != i9) {
                            f7 = d;
                            f8 = min;
                            f9 = i2;
                            i4 = measuredWidth;
                            i5 = i10;
                            f10 = f16;
                            f11 = f3;
                        } else {
                            f8 = min;
                            RectF rectF = gl.P;
                            f9 = i2;
                            i4 = measuredWidth;
                            i5 = i10;
                            rectF.set(L5, 0.0f, f16, gl.R1(gl.N(f5), gl.N(5.0f), (i9 == i11 ? 1 : 0) * d2));
                            if (z5) {
                                boolean z6 = h4bVar.h;
                                float f17 = h4bVar.g;
                                if (z6) {
                                    f12 = f17 + 0.026666667f;
                                    h4bVar.g = f12;
                                    if (f12 > 0.5f) {
                                        h4bVar.h = false;
                                    }
                                } else {
                                    f12 = f17 - 0.026666667f;
                                    h4bVar.g = f12;
                                    if (f12 < -0.5f) {
                                        h4bVar.h = true;
                                    }
                                }
                                f10 = f16;
                                i6 = (int) yjb.C(f15, 51.0f, d, f12);
                            } else {
                                f10 = f16;
                                i6 = 0;
                            }
                            paint2.setAlpha(((int) (f15 * 85.0f * d)) + i6);
                            if (d2 > 0.0f) {
                                int i12 = i11 - i9;
                                f7 = d;
                                rectF.left = Utilities.i(gl.R1(rectF.left, gl.L(5.0f) + (i12 * i4), d2), i4 - gl.L(5.0f), gl.L(5.0f));
                                rectF.right = Utilities.i(gl.R1(rectF.right, ((i12 + 1) * i4) - gl.L(5.0f), d2), i4 - gl.L(5.0f), gl.L(5.0f));
                            } else {
                                f7 = d;
                            }
                            canvas.drawRoundRect(rectF, R12, R12, paint2);
                            f11 = f9;
                        }
                        RectF rectF2 = gl.P;
                        rectF2.set(L5, 0.0f, f10, gl.R1(gl.N(f5), gl.N(5.0f), (i9 == i11 ? 1 : 0) * d2));
                        if (d2 > 0.0f) {
                            int i13 = i11 - i9;
                            rectF2.left = Utilities.i(gl.R1(rectF2.left, gl.L(5.0f) + (i13 * i4), d2), i4 - gl.L(5.0f), gl.L(5.0f));
                            rectF2.right = Utilities.i(gl.R1(rectF2.right, ((i13 + 1) * i4) - gl.L(5.0f), d2), i4 - gl.L(5.0f), gl.L(5.0f));
                        }
                        rectF2.right = gl.R1(rectF2.left, rectF2.right, f11);
                        if (i11 <= i9) {
                            paint3.setAlpha((int) (f15 * 255.0f * f7));
                            paint = paint3;
                        } else {
                            paint2.setAlpha((int) (85.0f * f15 * f7));
                            paint = paint2;
                        }
                        canvas.drawRoundRect(rectF2, R12, R12, paint);
                        i11++;
                        min = f8;
                        i2 = f9;
                        measuredWidth = i4;
                        i10 = i5;
                        d = f7;
                    }
                }
                f7 = d;
                f8 = min;
                f9 = i2;
                i4 = measuredWidth;
                i5 = i10;
                i11++;
                min = f8;
                i2 = f9;
                measuredWidth = i4;
                i10 = i5;
                d = f7;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x01d0, code lost:
    
        if (((l8b) r2.c).paused != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a3, code lost:
    
        if (r4.p() != false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ff  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        w28 w28Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z;
        zu3 zu3Var;
        mz9 mz9Var;
        boolean z2;
        float f5;
        boolean z3;
        lm lmVar;
        boolean E;
        lx4 lx4Var;
        l8b l8bVar;
        u4b u4bVar;
        Canvas canvas2 = canvas;
        y28 y28Var = this.y;
        d28 d28Var = y28Var.S0;
        b28 b28Var = y28Var.Z0;
        x28 x28Var = y28Var.E1;
        ml mlVar = y28Var.U0;
        c30 c30Var = y28Var.C2;
        i28 i28Var = y28Var.A0;
        if (!y28Var.A1) {
            y28Var.e1.a.getImageReceiver().v0(true, true);
        }
        boolean z4 = y28Var.S2;
        w28 w28Var2 = this.w;
        if (z4) {
            canvas2.drawColor(bm2.f(0.2f, -16777216, -1));
        } else {
            if (((ix) c30Var.e) != null || (b28Var != null && (((u4bVar = b28Var.b) != null && (u4bVar.x || u4bVar.s)) || b28Var.E.i))) {
                invalidate();
            }
            canvas2.save();
            ma8 ma8Var = y28Var.N2;
            if (ma8Var.n) {
                canvas2.save();
                float f6 = ma8Var.O;
                float f7 = ma8Var.A;
                float f8 = ((f6 * f7) + 1.0f) - f7;
                canvas2.scale(f8, f8, ma8Var.o + ma8Var.s, ma8Var.p + ma8Var.t);
                float f9 = ma8Var.o;
                float f10 = ma8Var.J;
                float f11 = ma8Var.A;
                canvas2.translate((f10 * f11) + f9, (ma8Var.K * f11) + ma8Var.p);
            }
            if (((ix) c30Var.e) != null) {
                if (c30Var.a || ((t76) c30Var.b) != null) {
                    if (!mlVar.B()) {
                        w28Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        w28Var2.f.draw(canvas2);
                    }
                    mlVar.i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    mlVar.h(canvas2, null);
                    if (y28Var.A1) {
                        m8b m8bVar = this.x;
                        boolean z5 = m8bVar.a;
                        if (z5 && (l8bVar = (l8b) c30Var.c) != null && l8bVar.paused && l8bVar.playerStubBitmap != null && l8bVar.stubAvailable) {
                            canvas2.save();
                            canvas2.scale(getMeasuredWidth() / ((l8b) c30Var.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((l8b) c30Var.c).playerStubBitmap.getHeight());
                            l8b l8bVar2 = (l8b) c30Var.c;
                            canvas2.drawBitmap(l8bVar2.playerStubBitmap, 0.0f, 0.0f, l8bVar2.playerStubPaint);
                            canvas2.restore();
                        } else {
                            boolean z6 = Build.VERSION.SDK_INT >= 29 && (lx4Var = y28Var.w3) != null && canvas2 == lx4Var.s;
                            if (!z5 || (y28Var.R0 && !m8bVar.H0 && !z6)) {
                                ((ix) c30Var.e).draw(canvas2);
                            }
                        }
                    }
                    f5 = 0.0f;
                    canvas2.restore();
                    z3 = y28Var.O2;
                    lm lmVar2 = this.h;
                    lmVar = this.n;
                    if (z3) {
                        lmVar2.e(true, f5);
                        lmVar.e(true, f5);
                    }
                    if (x28Var.f) {
                        t76 t76Var = (t76) c30Var.b;
                        if (t76Var != null) {
                            if (!c30Var.a) {
                            }
                            E = true;
                        }
                        E = false;
                    } else if (x28Var.e) {
                        if (((ix) c30Var.e) != null) {
                            l8b l8bVar3 = (l8b) c30Var.c;
                            if (l8bVar3 != null) {
                                if (c30Var.a) {
                                    if (l8bVar3.progress == 0.0f) {
                                        if (l8bVar3 != null) {
                                            if (l8bVar3.isBuffering()) {
                                            }
                                        }
                                    }
                                    E = true;
                                }
                            }
                        }
                        E = false;
                    } else {
                        E = mlVar.E();
                    }
                    lmVar2.e(false, (y28Var.A1 || E || x28Var.b != null) ? 0.0f : 1.0f);
                    lmVar.e(false, lmVar2.c == 1.0f ? 1.0f : 0.0f);
                    if (lmVar.c > 0.0f) {
                        RectF rectF = gl.P;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i = (int) (lmVar.c * 255.0f);
                        wd1 wd1Var = this.f;
                        wd1Var.a.setAlpha(i);
                        wd1Var.c.setAlpha(i);
                        wd1Var.f = getMeasuredWidth() << 1;
                        wd1Var.n = 1.3f;
                        wd1Var.a(gl.L(10.0f), canvas2, rectF, this);
                    }
                    y28Var.O2 = false;
                } else {
                    invalidate();
                }
            }
            if (x28Var.d) {
                canvas2.drawColor(bm2.f(0.2f, -16777216, -1));
                f5 = 0.0f;
                canvas2.restore();
                z3 = y28Var.O2;
                lm lmVar22 = this.h;
                lmVar = this.n;
                if (z3) {
                }
                if (x28Var.f) {
                }
                lmVar22.e(false, (y28Var.A1 || E || x28Var.b != null) ? 0.0f : 1.0f);
                lmVar.e(false, lmVar22.c == 1.0f ? 1.0f : 0.0f);
                if (lmVar.c > 0.0f) {
                }
                y28Var.O2 = false;
            } else {
                if (!mlVar.B()) {
                    w28Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    w28Var2.f.draw(canvas2);
                }
                f5 = 0.0f;
                mlVar.i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                mlVar.h(canvas2, null);
                canvas2.restore();
                z3 = y28Var.O2;
                lm lmVar222 = this.h;
                lmVar = this.n;
                if (z3) {
                }
                if (x28Var.f) {
                }
                lmVar222.e(false, (y28Var.A1 || E || x28Var.b != null) ? 0.0f : 1.0f);
                lmVar.e(false, lmVar222.c == 1.0f ? 1.0f : 0.0f);
                if (lmVar.c > 0.0f) {
                }
                y28Var.O2 = false;
            }
        }
        if (i28Var.getAlpha() > 0.0f) {
            if (i28Var.getAlpha() == 1.0f) {
                canvas2.save();
                w28Var = w28Var2;
                z2 = false;
            } else {
                z2 = false;
                w28Var = w28Var2;
                canvas2.saveLayerAlpha(0.0f, 0.0f, i28Var.getMeasuredWidth(), i28Var.getMeasuredHeight(), (int) (i28Var.getAlpha() * 255.0f), 31);
            }
            b28Var.draw(canvas2);
            canvas2.restore();
            r15 = z2;
        } else {
            w28Var = w28Var2;
            r15 = 0;
        }
        if (!y28Var.P0 && mlVar.E()) {
            y28Var.P0 = true;
            y28Var.invalidate();
        }
        hideInterfaceAlpha = y28Var.getHideInterfaceAlpha();
        Drawable drawable = w28Var.d;
        Paint paint = w28Var.c;
        Drawable drawable2 = w28Var.e;
        drawable.setAlpha(kk7.d4);
        w28Var.d.draw(canvas2);
        if (y28Var.s1 || !y28Var.n2 || i28Var.getVisibility() == 0) {
            if (i28Var.getVisibility() == 0) {
                int L = gl.L(72.0f);
                int top = i28Var.getTop() + ((int) (i28Var.getTextTop() - gl.L(24.0f)));
                int i2 = L + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / gl.L(60.0f) > 0.0f && i28Var.w0 && i28Var.r0.getBottom() - i28Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (i28Var.getTop() + ((int) (i28Var.getMaxTop() - gl.L(24.0f))))) / gl.L(60.0f) > 0.0f) {
                        y28Var.W2 = true;
                    }
                    f = 0.0f;
                } else if (y28Var.X2) {
                    y28Var.X2 = r15;
                    f = 0.0f;
                    if ((measuredHeight - (i28Var.getTop() + ((int) (i28Var.getMaxTop() - gl.L(24.0f))))) / gl.L(60.0f) > 0.0f) {
                        y28Var.W2 = true;
                    }
                } else {
                    f = 0.0f;
                    if (i28Var.getProgressToBlackout() == 0.0f) {
                        y28Var.W2 = r15;
                    }
                }
                float e = this.e.e(r15, y28Var.W2 ? 1.0f : f);
                if (e > f) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(bm2.o(-16777216, (int) (153.0f * e * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (e < 1.0f && !x28Var.f) {
                    canvas2.save();
                    float f12 = 1.0f - e;
                    paint.setColor(bm2.o(-16777216, (int) (129.03f * f12 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f12 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i2);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i2, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (e <= f || i28Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (i28Var.t0) {
                        i28Var.t0 = r15;
                        i28Var.invalidate();
                    }
                    if (i28Var.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (i28Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(i28Var.getX(), i28Var.getY() - i28Var.getScrollY());
                    i28Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z7 = e > f ? true : r15;
                if (i28Var.t0 != z7) {
                    i28Var.t0 = z7;
                    i28Var.invalidate();
                }
                if (e > f) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f2 = e;
                f3 = y28Var.c1;
                if (f3 != 0.0f || (mz9Var = y28Var.b1) == null) {
                    f4 = 1.0f;
                    z = true;
                } else {
                    float f13 = y28Var.q3;
                    int measuredWidth = getMeasuredWidth();
                    z = true;
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    nz9 nz9Var = mz9Var.f;
                    ImageReceiver imageReceiver = mz9Var.a;
                    imageReceiver.i0(0.0f, 0.0f, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f3);
                    imageReceiver.h(canvas2, null);
                    f4 = 1.0f;
                    imageReceiver.setAlpha(1.0f);
                    if (mz9Var.c != null) {
                        int i3 = (int) (f3 * 255.0f);
                        mz9Var.d.setAlpha(i3);
                        GradientDrawable gradientDrawable = nz9Var.I;
                        gradientDrawable.setAlpha(i3);
                        gradientDrawable.setBounds((int) imageReceiver.L0, (int) (imageReceiver.x() - (gl.L(24.0f) * f13)), (int) imageReceiver.w(), ((int) imageReceiver.x()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f13, f13, imageReceiver.r(), imageReceiver.x() - (gl.L(8.0f) * f13));
                        canvas2.translate(imageReceiver.r() - (nz9Var.K / 2.0f), (imageReceiver.x() - (gl.L(8.0f) * f13)) - mz9Var.c.getHeight());
                        mz9Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                this.d.e(r15, !y28Var.w2 ? f4 : 0.0f);
                if (y28Var.A1) {
                    boolean z8 = (i28Var.getVisibility() == 0 && (y28Var.W2 || i28Var.w0)) ? z : r15;
                    y28Var.Z2 = (i28Var.getVisibility() != 0 || i28Var.getProgressToBlackout() <= 0.0f) ? r15 : z;
                    m8b m8bVar2 = ((d8b) y28Var.G1).d;
                    m8bVar2.L0 = z8;
                    m8bVar2.U();
                    ((d8b) y28Var.G1).d.m1 = y28Var.Z2;
                }
                if (f2 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                zu3Var = y28Var.a1;
                if (zu3Var == null) {
                    zu3Var.e(canvas2);
                    return;
                }
                return;
            }
            if (!x28Var.f) {
                int L2 = gl.L(y28Var.n2 ? 56.0f : 110.0f);
                if ((y28Var.s1 || !y28Var.n2) && i28Var.getVisibility() == 0) {
                    L2 = (int) (L2 * 2.5f);
                }
                drawable2.setBounds(r15, d28Var.getMeasuredHeight() - L2, getMeasuredWidth(), d28Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f2 = 0.0f;
        f3 = y28Var.c1;
        if (f3 != 0.0f) {
        }
        f4 = 1.0f;
        z = true;
        this.d.e(r15, !y28Var.w2 ? f4 : 0.0f);
        if (y28Var.A1) {
        }
        if (f2 <= 0.0f) {
        }
        zu3Var = y28Var.a1;
        if (zu3Var == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        t76 t76Var;
        y28 y28Var = this.y;
        c30 c30Var = y28Var.C2;
        if (!y28Var.A1 || y28Var.S2 || ((ix) c30Var.e) == null || (t76Var = (t76) c30Var.b) == null || !t76Var.p() || !((ix) c30Var.e).dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.y.Z0) {
            return true;
        }
        if (!this.r) {
            return super.drawChild(canvas, view, j);
        }
        m21 m21Var = m21.w;
        if (m21Var == null || view != m21Var.e) {
            return super.drawChild(canvas, view, j);
        }
        if (this.s) {
            return super.drawChild(canvas, view, j);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y.a1.i();
        setTag(R.id.bulletin_delegate_tag, new s10(this, (byte) 13));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y28 y28Var = this.y;
        y28Var.a1.j();
        setTag(R.id.bulletin_delegate_tag, null);
        t28 t28Var = y28Var.G1;
        if (t28Var != null) {
            m8b m8bVar = ((d8b) t28Var).d;
            m8bVar.Y0 = false;
            m8bVar.U();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.y.o0.getLayoutParams();
        layoutParams.rightMargin = gl.L(42.0f);
        layoutParams.topMargin = gl.L(15.0f);
        super.onMeasure(i, i2);
    }
}
