// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class og3 extends FrameLayout {
    public ema E;
    public long F;
    public boolean G;
    public boolean H;
    public boolean I;
    public long J;
    public float K;
    public float L;
    public float M;
    public float N;
    public boolean O;
    public final q6b P;
    public float Q;
    public float R;
    public g29 S;
    public hg3 T;
    public final float U;
    public boolean V;
    public boolean W;
    public boolean a;
    public boolean a0;
    public int b;
    public final mm b0;
    public boolean c;
    public final /* synthetic */ ii3 c0;
    public boolean d;
    public pv0 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final rb0 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final rb0 w;
    public boolean x;
    public final FrameLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og3(ii3 ii3Var, Context context) {
        super(context);
        this.c0 = ii3Var;
        this.n = new rb0((vnb) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.w = new rb0((vnb) null);
        this.x = true;
        q6b q6bVar = new q6b(null, true);
        this.P = q6bVar;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.U = 1.0f;
        this.b0 = new mm(this, 0L, 350L, k43.h);
        q6bVar.o = ii3Var.b == 1;
        q6bVar.D = true;
        imageReceiver.K0 = true;
        imageReceiver.A1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.O) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, tre.c(-2.0f, -1));
        imageReceiver.q0(hl.L(48.0f) / 2);
        imageReceiver2.q0(hl.L(48.0f) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipInParent(boolean z) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z);
        }
        if (getParent() == null || getParent().getParent() == null || getParent().getParent().getParent() == null) {
            return;
        }
        ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z);
    }

    public final void b() {
        ema emaVar = new ema(getContext());
        this.E = emaVar;
        emaVar.setTypeface(hl.o());
        this.E.setGravity(17);
        this.E.setTextSize(11);
        this.E.setTextColor(this.c0.getTextColor());
        jn7.i(this.E);
        this.E.setMaxLines(1);
        this.y.addView(this.E, tre.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.q0(hl.L(48.0f) / 2);
        this.s.q0(hl.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f, float f2, float f3) {
        ii3 ii3Var = this.c0;
        Paint paint = ii3Var.I;
        int i = ii3Var.b;
        Paint paint2 = ii3Var.H;
        c6b c6bVar = ii3Var.s;
        Drawable drawable = ii3Var.c;
        if (this.G && !c6bVar.J(this.F) && Utilities.x(c6bVar.E(this.F))) {
            float L = f + hl.L(16.0f);
            float L2 = f2 + hl.L(16.0f);
            paint2.setColor(aob.p1(f3, ii3Var.f(aob.Yl)));
            if (i == 0) {
                paint.setColor(aob.p1(f3, ii3Var.f(aob.s8)));
            } else {
                paint.setColor(aob.p1(f3, ii3Var.f(aob.M8)));
            }
            canvas.drawCircle(L, L2, hl.L(11.0f), paint);
            canvas.drawCircle(L, L2, hl.L(9.0f), paint2);
            int f4 = ii3Var.f(i == 0 ? aob.s8 : aob.M8);
            if (f4 != ii3Var.e) {
                ii3Var.e = f4;
                drawable.setColorFilter(new PorterDuffColorFilter(f4, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f3 * 255.0f));
            drawable.setBounds((int) (L - (drawable.getIntrinsicWidth() / 2.0f)), (int) (L2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + L), (int) ((drawable.getIntrinsicHeight() / 2.0f) + L2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f, float f2, float f3, boolean z) {
        float f4 = this.K;
        ii3 ii3Var = this.c0;
        if (f4 != f || this.L != f2 || 0.0f != f3 || this.W != z) {
            this.W = z;
            this.K = f;
            this.L = f2;
            invalidate();
            ii3Var.h.invalidate();
        }
        float i = this.O ? 0.0f : 1.0f - Utilities.i(ii3Var.O / ii3Var.C0, 1.0f, 0.0f);
        this.R = i;
        float f5 = i * this.Q;
        FrameLayout frameLayout = this.y;
        frameLayout.setAlpha(f5);
        frameLayout.setVisibility(f5 > 0.0f ? 0 : 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0221  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        float f;
        Canvas canvas2;
        q6b q6bVar;
        float f2;
        ImageReceiver imageReceiver2;
        float f3;
        ?? r11;
        float size;
        boolean z;
        int i;
        float f4;
        float f5;
        boolean z2;
        float f6;
        boolean z3;
        boolean[] zArr;
        ImageReceiver imageReceiver3;
        boolean z4;
        g29 g29Var;
        float L = hl.L(48.0f);
        float L2 = hl.L(26.33f);
        float L3 = hl.L(8.0f);
        ii3 ii3Var = this.c0;
        int i2 = ii3Var.b;
        c6b c6bVar = ii3Var.s;
        Paint paint = ii3Var.I;
        float i3 = Utilities.i(ii3Var.o0 / 0.5f, 1.0f, 0.0f) * L3;
        if (this.W) {
            i3 += Utilities.i((ii3Var.o0 - 0.5f) / 0.5f, 1.0f, 0.0f) * hl.L(16.0f);
        }
        float R1 = hl.R1(L + i3, L2, this.K);
        float f7 = R1 / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f7;
        float R12 = hl.R1(measuredWidth, 0.0f, this.K);
        float R13 = hl.R1(hl.L(5.0f), (a.getCurrentActionBarHeight() - L2) / 2.0f, this.K);
        float i4 = Utilities.i(this.K / 0.5f, 1.0f, 0.0f);
        q6b q6bVar2 = this.P;
        q6bVar2.a = true;
        RectF rectF = q6bVar2.F;
        if (!q6bVar2.p) {
            q6bVar2.e = 1.0f - ii3Var.e0;
        }
        float f8 = R13 + R1;
        rectF.set(R12, R13, R12 + R1, f8);
        q6bVar2.G = hl.N(1.33f) * this.K;
        ImageReceiver imageReceiver4 = this.r;
        imageReceiver4.setAlpha(1.0f);
        imageReceiver4.q0((int) f7);
        float f9 = R12 + f7;
        this.M = f9;
        float f10 = R13 + f7;
        this.N = f10;
        if (i2 == 0) {
            paint.setColor(ii3Var.f(aob.s8));
        } else {
            paint.setColor(ii3Var.f(aob.M8));
        }
        if (this.K != 0.0f) {
            imageReceiver = imageReceiver4;
            f = R12;
            canvas.drawCircle(this.M, this.N, hl.N(1.5f) + f7, paint);
        } else {
            imageReceiver = imageReceiver4;
            f = R12;
        }
        canvas.save();
        float f11 = this.M;
        float f12 = this.N;
        float f13 = this.U;
        canvas.scale(f13, f13, f11, f12);
        if (this.S == null) {
            this.S = ii3Var.n;
        }
        ArrayList arrayList = (ArrayList) c6bVar.c.f(this.F);
        if ((arrayList == null || arrayList.isEmpty()) ? false : true) {
            canvas2 = canvas;
            q6bVar = q6bVar2;
            f2 = f8;
            imageReceiver2 = imageReceiver;
            f3 = f;
            r11 = 0;
            float f14 = 0.0f;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                f14 += ((b6b) arrayList.get(i5)).h;
            }
            size = (c6bVar.d + f14) / (arrayList.size() + r2);
            z = ((b6b) c00.g(1, arrayList)).H;
            ii3Var.n0 = z;
        } else {
            if (!this.a0 || (g29Var = this.S) == null || g29Var.f >= 0.98f) {
                float d = this.b0.d(this.H);
                if (this.x) {
                    if (this.a0) {
                        q6bVar2.p = true;
                        q6bVar2.e = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new az1(this, (byte) 16));
                        ofFloat.addListener(new cn2(this, (byte) 6));
                        ofFloat.setDuration(100L);
                        ofFloat.start();
                    }
                    float f15 = d * q6bVar2.e;
                    q6bVar2.b = !this.a0;
                    if (!this.c && ii3Var.o0 <= 0.0f) {
                        if (hl.U1(k43.g.getInterpolation(this.K), getMeasuredWidth(), hl.L(16.0f)) < (hl.N(3.5f) + f7) * 2.0f) {
                            f6 = ((float) Math.toDegrees(Math.acos((r1 / 2.0f) / r3))) * 2.0f;
                            q6bVar2.f = f6;
                            q6bVar2.l = this.c;
                            q6bVar2.m = this.d;
                            q6bVar2.u = 1.0f - f15;
                            z3 = this.G;
                            if (z3 && this.I) {
                                q6bVar2.s = this.J;
                            } else {
                                q6bVar2.s = 0L;
                            }
                            q6bVar = q6bVar2;
                            long j = this.F;
                            if (z3) {
                                zArr = null;
                                imageReceiver3 = imageReceiver;
                                f5 = i4;
                                f2 = f8;
                                f3 = f;
                                z4 = false;
                                canvas2 = canvas;
                                t6b.i(j, canvas2, imageReceiver3, c6bVar.J(j), q6bVar);
                            } else {
                                zArr = null;
                                imageReceiver3 = imageReceiver;
                                f5 = i4;
                                canvas2 = canvas;
                                f2 = f8;
                                f3 = f;
                                z4 = false;
                                t6b.i(j, canvas2, imageReceiver3, c6bVar.I(), q6bVar);
                            }
                            if (f15 > 0.0f) {
                                if (t6b.d == null) {
                                    o15 o15Var = new o15();
                                    t6b.d = o15Var;
                                    o15Var.a = true;
                                    o15Var.b = true;
                                    o15Var.c.setStrokeWidth(hl.N(2.0f));
                                    t6b.d.c.setStyle(Paint.Style.STROKE);
                                    t6b.d.c.setStrokeCap(Paint.Cap.ROUND);
                                }
                                int w0 = aob.w0(zArr, aob.ok, z4);
                                int w02 = aob.w0(zArr, aob.q7, z4);
                                t6b.d.d(vm2.f(0.25f, w0, w02), w02, z4 ? 1 : 0, z4 ? 1 : 0);
                                t6b.d.b(imageReceiver3.L0, imageReceiver3.M0, imageReceiver3.w(), imageReceiver3.x());
                                Paint paint2 = t6b.d.c;
                                paint2.setStrokeWidth(hl.L(2.0f));
                                paint2.setAlpha((int) (255.0f * f15));
                                canvas2.drawCircle(f9, f10, q6bVar.b() * (f7 + hl.L(4.0f)), paint2);
                            }
                            d = f15;
                            z2 = z4;
                        }
                    }
                    f6 = 0.0f;
                    q6bVar2.f = f6;
                    q6bVar2.l = this.c;
                    q6bVar2.m = this.d;
                    q6bVar2.u = 1.0f - f15;
                    z3 = this.G;
                    if (z3) {
                    }
                    q6bVar2.s = 0L;
                    q6bVar = q6bVar2;
                    long j2 = this.F;
                    if (z3) {
                    }
                    if (f15 > 0.0f) {
                    }
                    d = f15;
                    z2 = z4;
                } else {
                    canvas2 = canvas;
                    q6bVar = q6bVar2;
                    f2 = f8;
                    f5 = i4;
                    f3 = f;
                    z2 = 0;
                }
                this.a0 = z2;
                i = z2;
                if (this.x) {
                    canvas2.save();
                    float f16 = 1.0f - f5;
                    canvas2.scale(f16, f16, this.M + hl.L(16.0f), this.N + hl.L(16.0f));
                    c(canvas2, this.M, this.N, 1.0f);
                    float f17 = this.M;
                    float f18 = this.N;
                    if (d > 0.0f) {
                        float L4 = f17 + hl.L(17.0f);
                        float L5 = f18 + hl.L(17.0f);
                        Paint paint3 = ii3Var.H;
                        paint3.setColor(aob.p1(d, ii3Var.f(aob.q7)));
                        if (i2 == 0) {
                            paint.setColor(aob.p1(d, ii3Var.f(aob.s8)));
                        } else {
                            paint.setColor(aob.p1(d, ii3Var.f(aob.M8)));
                        }
                        float interpolation = k43.k.getInterpolation(d) * hl.L(9.0f);
                        canvas2.drawCircle(L4, L5, hl.L(2.0f) + interpolation, paint);
                        canvas2.drawCircle(L4, L5, interpolation, paint3);
                        paint3.setColor(aob.p1(d, ii3Var.getTextColor()));
                        RectF rectF2 = hl.P;
                        rectF2.set(L4 - hl.L(1.0f), L5 - hl.N(4.6f), hl.L(1.0f) + L4, hl.N(1.6f) + L5);
                        canvas2.drawRoundRect(rectF2, hl.L(3.0f), hl.L(3.0f), paint3);
                        rectF2.set(L4 - hl.L(1.0f), hl.N(2.6f) + L5, L4 + hl.L(1.0f), hl.N(4.6f) + L5);
                        canvas2.drawRoundRect(rectF2, hl.L(3.0f), hl.L(3.0f), paint3);
                    }
                    canvas2.restore();
                    i = z2;
                }
                canvas2.restore();
                if (this.I || this.L <= 0.0f) {
                    f4 = f3;
                } else {
                    ImageReceiver imageReceiver5 = this.s;
                    f4 = f3;
                    imageReceiver5.i0(f4, R13, R1, R1);
                    imageReceiver5.setAlpha(this.L);
                    imageReceiver5.h(canvas2, null);
                }
                float L6 = ((1.0f - this.K) * hl.L(7.0f)) + f2;
                FrameLayout frameLayout = this.y;
                frameLayout.setTranslationY(L6);
                frameLayout.setTranslationX(f4 - measuredWidth);
                if (!this.O) {
                    if (this.G) {
                        this.Q = 1.0f;
                    } else {
                        r15 = q6bVar.n == 2 ? 0.7f : 1.0f;
                        this.Q = r15;
                    }
                    float f19 = this.R * r15;
                    frameLayout.setAlpha(f19);
                    frameLayout.setVisibility(f19 > 0.0f ? i : 4);
                }
                super.dispatchDraw(canvas);
            }
            z = ii3Var.n0;
            canvas2 = canvas;
            q6bVar = q6bVar2;
            f2 = f8;
            imageReceiver2 = imageReceiver;
            f3 = f;
            size = 1.0f;
            r11 = 0;
        }
        invalidate();
        if (this.S == null) {
            g29 g29Var2 = ii3Var.n;
            if (g29Var2 != null) {
                this.S = g29Var2;
            } else {
                g29 g29Var3 = new g29(this);
                this.S = g29Var3;
                ii3Var.n = g29Var3;
                g29Var3.d(null, true, r11);
            }
        }
        if (this.x) {
            canvas2.save();
            canvas2.scale(q6bVar.b(), q6bVar.b(), rectF.centerX(), rectF.centerY());
            imageReceiver2.k0(rectF);
            imageReceiver2.h(canvas2, null);
            canvas2.restore();
        }
        this.S.q = r11;
        Paint o = z ? t6b.o(imageReceiver2) : t6b.t(imageReceiver2, true);
        o.setAlpha(jn7.d4);
        g29 g29Var4 = this.S;
        g29Var4.r = o;
        g29Var4.f((int) (imageReceiver2.L0 - hl.L(3.0f)), (int) (imageReceiver2.M0 - hl.L(3.0f)), (int) (imageReceiver2.w() + hl.L(3.0f)), (int) (imageReceiver2.x() + hl.L(3.0f)));
        this.S.e(this.a0, Utilities.i(size, 1.0f, 0.0f));
        if (imageReceiver2.R0) {
            this.S.a(canvas2);
        }
        this.a0 = true;
        invalidate();
        i = r11;
        canvas2.restore();
        if (this.I) {
        }
        f4 = f3;
        float L62 = ((1.0f - this.K) * hl.L(7.0f)) + f2;
        FrameLayout frameLayout2 = this.y;
        frameLayout2.setTranslationY(L62);
        frameLayout2.setTranslationX(f4 - measuredWidth);
        if (!this.O) {
        }
        super.dispatchDraw(canvas);
    }

    public float getCy() {
        float L = hl.L(48.0f);
        float L2 = hl.L(26.33f);
        return hl.R1(hl.L(5.0f), (a.getCurrentActionBarHeight() - L2) / 2.0f, this.c0.d0) + (hl.R1(L, L2, this.K) / 2.0f);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            ii3 ii3Var = this.c0;
            jg3 jg3Var = ii3Var.r;
            if (parent == jg3Var) {
                jg3Var.invalidate();
            } else {
                ii3Var.invalidate();
            }
        }
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.I();
        this.s.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.K();
        this.s.K();
        this.P.g();
        pv0 pv0Var = this.e;
        if (pv0Var != null) {
            pv0Var.a();
            this.e = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.O ? hl.L(70.0f) : this.c0.N, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(81.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCrossfadeTo(long j) {
        TLRPC.Chat chat;
        if (this.J != j) {
            this.J = j;
            boolean z = j != -1;
            this.I = z;
            ImageReceiver imageReceiver = this.s;
            if (!z) {
                imageReceiver.f();
                return;
            }
            int i = this.c0.f;
            if (j > 0) {
                TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
                this.f = X1;
                this.h = null;
                chat = X1;
            } else {
                TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
                this.h = M0;
                this.f = null;
                chat = M0;
            }
            if (chat != null) {
                rb0 rb0Var = this.w;
                rb0Var.o(chat);
                imageReceiver.U(chat, rb0Var, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setDialogId(long j) {
        TLRPC.Chat chat;
        b6b b6bVar;
        ii3 ii3Var = this.c0;
        int i = ii3Var.f;
        c6b c6bVar = ii3Var.s;
        long j2 = this.F;
        byte b = 0;
        boolean z = j2 == j;
        if (!z && this.e != null) {
            c6bVar.g0(j2, false);
            this.e.a();
            this.e = null;
        }
        this.F = j;
        this.G = j == yac.h(i).e();
        this.H = c6bVar.P(j);
        if (j > 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
            this.f = X1;
            this.h = null;
            chat = X1;
        } else {
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
            this.h = M0;
            this.f = null;
            chat = M0;
        }
        ImageReceiver imageReceiver = this.r;
        if (chat == null) {
            this.E.l("", false);
            imageReceiver.f();
            return;
        }
        rb0 rb0Var = this.n;
        rb0Var.o(chat);
        imageReceiver.U(chat, rb0Var, null);
        if (this.O) {
            return;
        }
        this.E.i(null);
        if (c6bVar.P(j)) {
            this.E.setTextSize(10);
            this.E.l(ob6.M0(2131750810, null), false);
            this.V = false;
            return;
        }
        if (!Utilities.x(c6bVar.E(j))) {
            this.E.setTextSize(10);
            t6b.a(this.E);
            this.V = true;
            return;
        }
        HashMap hashMap = (HashMap) c6bVar.e.f(j);
        if (hashMap != null && !hashMap.isEmpty()) {
            Collection values = hashMap.values();
            if (!values.isEmpty()) {
                b6bVar = (b6b) values.iterator().next();
                if (b6bVar == null) {
                    this.E.setTextSize(10);
                    t6b.a(this.E);
                    this.V = true;
                    return;
                }
                if (this.G) {
                    if (z && this.V && !this.O) {
                        ema emaVar = this.E;
                        b();
                        ValueAnimator valueAnimator = ii3Var.k0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            ii3Var.k0 = null;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ii3Var.k0 = ofFloat;
                        ofFloat.addUpdateListener(new lk(this, emaVar, (byte) 12));
                        ii3Var.k0.addListener(new v5(this, emaVar, (byte) 17));
                        ii3Var.k0.setDuration(150L);
                        this.E.setAlpha(0.0f);
                        this.E.setTranslationY(hl.L(5.0f));
                        ii3Var.l0 = new ng3(this, b);
                    }
                    hl.d3(ii3Var.l0, 500L);
                    this.V = false;
                    this.E.setTextSize(10);
                    this.E.l(ob6.M0(2131748055, null), false);
                    return;
                }
                TLRPC.User user = this.f;
                ema emaVar2 = this.E;
                if (user == null) {
                    emaVar2.setTextSize(11);
                    this.E.l(c00.f(this.E, this.h.title, false, null, 0), false);
                    this.E.i(null);
                    return;
                }
                emaVar2.setTextSize(11);
                String str = this.f.first_name;
                String trim = str != null ? str.trim() : "";
                int indexOf = trim.indexOf(" ");
                if (indexOf > 0) {
                    trim = trim.substring(0, indexOf);
                }
                String str2 = trim;
                if (!this.f.verified) {
                    this.E.l(c00.f(this.E, str2, false, null, 0), false);
                    this.E.i(null);
                    return;
                }
                if (this.T == null) {
                    Drawable mutate = ii3Var.getContext().getDrawable(R.drawable.verified_area).mutate();
                    Drawable mutate2 = ii3Var.getContext().getDrawable(R.drawable.verified_check).mutate();
                    hg3 hg3Var = new hg3(ii3Var, mutate, mutate2, mutate, mutate2);
                    hg3Var.x = true;
                    this.T = hg3Var;
                }
                this.E.l(c00.f(this.E, str2, false, null, 0), false);
                this.E.i(this.T);
                return;
            }
        }
        b6bVar = null;
        if (b6bVar == null) {
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        q6b q6bVar = this.P;
        if (z && q6bVar.H == null) {
            q6bVar.H = new v41(this, 1.5f, 5.0f);
        }
        v41 v41Var = q6bVar.H;
        if (v41Var != null) {
            v41Var.c(z);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            ii3 ii3Var = this.c0;
            jg3 jg3Var = ii3Var.r;
            if (parent == jg3Var) {
                jg3Var.invalidate();
            }
            ii3Var.invalidate();
        }
        super.invalidate(i, i2, i3, i4);
    }
}
