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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class hh3 extends FrameLayout {
    public lka E;
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
    public final v4b P;
    public float Q;
    public float R;
    public u09 S;
    public ah3 T;
    public final float U;
    public boolean V;
    public boolean W;
    public boolean a;
    public boolean a0;
    public int b;
    public final ln b0;
    public boolean c;
    public final /* synthetic */ aj3 c0;
    public boolean d;
    public ow0 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final pc0 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final pc0 w;
    public boolean x;
    public final FrameLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh3(aj3 aj3Var, Context context) {
        super(context);
        this.c0 = aj3Var;
        this.n = new pc0((ylb) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.w = new pc0((ylb) null);
        this.x = true;
        v4b v4bVar = new v4b(null, true);
        this.P = v4bVar;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.U = 1.0f;
        this.b0 = new ln(this, 0L, 350L, d53.h);
        v4bVar.o = aj3Var.b == 1;
        v4bVar.D = true;
        imageReceiver.K0 = true;
        imageReceiver.A1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.O) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, qoe.c(-2.0f, -1));
        imageReceiver.q0(gm.L(48.0f) / 2);
        imageReceiver2.q0(gm.L(48.0f) / 2);
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
        lka lkaVar = new lka(getContext());
        this.E = lkaVar;
        lkaVar.setTypeface(gm.o());
        this.E.setGravity(17);
        this.E.setTextSize(11);
        this.E.setTextColor(this.c0.getTextColor());
        nm7.i(this.E);
        this.E.setMaxLines(1);
        this.y.addView(this.E, qoe.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.q0(gm.L(48.0f) / 2);
        this.s.q0(gm.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f, float f2, float f3) {
        aj3 aj3Var = this.c0;
        Paint paint = aj3Var.I;
        int i = aj3Var.b;
        Paint paint2 = aj3Var.H;
        h4b h4bVar = aj3Var.s;
        Drawable drawable = aj3Var.c;
        if (this.G && !h4bVar.J(this.F) && Utilities.x(h4bVar.E(this.F))) {
            float L = f + gm.L(16.0f);
            float L2 = f2 + gm.L(16.0f);
            paint2.setColor(cmb.p1(f3, aj3Var.f(cmb.Xl)));
            if (i == 0) {
                paint.setColor(cmb.p1(f3, aj3Var.f(cmb.r8)));
            } else {
                paint.setColor(cmb.p1(f3, aj3Var.f(cmb.L8)));
            }
            canvas.drawCircle(L, L2, gm.L(11.0f), paint);
            canvas.drawCircle(L, L2, gm.L(9.0f), paint2);
            int f4 = aj3Var.f(i == 0 ? cmb.r8 : cmb.L8);
            if (f4 != aj3Var.e) {
                aj3Var.e = f4;
                drawable.setColorFilter(new PorterDuffColorFilter(f4, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f3 * 255.0f));
            drawable.setBounds((int) (L - (drawable.getIntrinsicWidth() / 2.0f)), (int) (L2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + L), (int) ((drawable.getIntrinsicHeight() / 2.0f) + L2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f, float f2, float f3, boolean z) {
        float f4 = this.K;
        aj3 aj3Var = this.c0;
        if (f4 != f || this.L != f2 || 0.0f != f3 || this.W != z) {
            this.W = z;
            this.K = f;
            this.L = f2;
            invalidate();
            aj3Var.h.invalidate();
        }
        float i = this.O ? 0.0f : 1.0f - Utilities.i(aj3Var.O / aj3Var.C0, 1.0f, 0.0f);
        this.R = i;
        float f5 = i * this.Q;
        FrameLayout frameLayout = this.y;
        frameLayout.setAlpha(f5);
        frameLayout.setVisibility(f5 > 0.0f ? 0 : 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0222  */
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
        v4b v4bVar;
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
        u09 u09Var;
        float L = gm.L(48.0f);
        float L2 = gm.L(26.33f);
        float L3 = gm.L(8.0f);
        aj3 aj3Var = this.c0;
        int i2 = aj3Var.b;
        h4b h4bVar = aj3Var.s;
        Paint paint = aj3Var.I;
        float i3 = Utilities.i(aj3Var.o0 / 0.5f, 1.0f, 0.0f) * L3;
        if (this.W) {
            i3 += Utilities.i((aj3Var.o0 - 0.5f) / 0.5f, 1.0f, 0.0f) * gm.L(16.0f);
        }
        float R1 = gm.R1(L + i3, L2, this.K);
        float f7 = R1 / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f7;
        float R12 = gm.R1(measuredWidth, 0.0f, this.K);
        float R13 = gm.R1(gm.L(5.0f), (a.getCurrentActionBarHeight() - L2) / 2.0f, this.K);
        float i4 = Utilities.i(this.K / 0.5f, 1.0f, 0.0f);
        v4b v4bVar2 = this.P;
        v4bVar2.a = true;
        RectF rectF = v4bVar2.F;
        if (!v4bVar2.p) {
            v4bVar2.e = 1.0f - aj3Var.e0;
        }
        float f8 = R13 + R1;
        rectF.set(R12, R13, R12 + R1, f8);
        v4bVar2.G = gm.N(1.33f) * this.K;
        ImageReceiver imageReceiver4 = this.r;
        imageReceiver4.setAlpha(1.0f);
        imageReceiver4.q0((int) f7);
        float f9 = R12 + f7;
        this.M = f9;
        float f10 = R13 + f7;
        this.N = f10;
        if (i2 == 0) {
            paint.setColor(aj3Var.f(cmb.r8));
        } else {
            paint.setColor(aj3Var.f(cmb.L8));
        }
        if (this.K != 0.0f) {
            imageReceiver = imageReceiver4;
            f = R12;
            canvas.drawCircle(this.M, this.N, gm.N(1.5f) + f7, paint);
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
            this.S = aj3Var.n;
        }
        ArrayList arrayList = (ArrayList) h4bVar.c.f(this.F);
        if ((arrayList == null || arrayList.isEmpty()) ? false : true) {
            canvas2 = canvas;
            v4bVar = v4bVar2;
            f2 = f8;
            imageReceiver2 = imageReceiver;
            f3 = f;
            r11 = 0;
            float f14 = 0.0f;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                f14 += ((g4b) arrayList.get(i5)).h;
            }
            size = (h4bVar.d + f14) / (arrayList.size() + r2);
            z = ((g4b) b10.f(1, arrayList)).H;
            aj3Var.n0 = z;
        } else {
            if (!this.a0 || (u09Var = this.S) == null || u09Var.f >= 0.98f) {
                float d = this.b0.d(this.H);
                if (this.x) {
                    if (this.a0) {
                        v4bVar2.p = true;
                        v4bVar2.e = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new et1(this, (byte) 17));
                        ofFloat.addListener(new kh2(this, (byte) 8));
                        ofFloat.setDuration(100L);
                        ofFloat.start();
                    }
                    float f15 = d * v4bVar2.e;
                    v4bVar2.b = !this.a0;
                    if (!this.c && aj3Var.o0 <= 0.0f) {
                        if (gm.U1(d53.g.getInterpolation(this.K), getMeasuredWidth(), gm.L(16.0f)) < (gm.N(3.5f) + f7) * 2.0f) {
                            f6 = ((float) Math.toDegrees(Math.acos((r1 / 2.0f) / r3))) * 2.0f;
                            v4bVar2.f = f6;
                            v4bVar2.l = this.c;
                            v4bVar2.m = this.d;
                            v4bVar2.u = 1.0f - f15;
                            z3 = this.G;
                            if (z3 && this.I) {
                                v4bVar2.s = this.J;
                            } else {
                                v4bVar2.s = 0L;
                            }
                            v4bVar = v4bVar2;
                            long j = this.F;
                            if (z3) {
                                zArr = null;
                                imageReceiver3 = imageReceiver;
                                f5 = i4;
                                f2 = f8;
                                f3 = f;
                                z4 = false;
                                canvas2 = canvas;
                                y4b.i(j, canvas2, imageReceiver3, h4bVar.J(j), v4bVar);
                            } else {
                                zArr = null;
                                imageReceiver3 = imageReceiver;
                                f5 = i4;
                                canvas2 = canvas;
                                f2 = f8;
                                f3 = f;
                                z4 = false;
                                y4b.i(j, canvas2, imageReceiver3, h4bVar.I(), v4bVar);
                            }
                            if (f15 > 0.0f) {
                                if (y4b.d == null) {
                                    j15 j15Var = new j15();
                                    y4b.d = j15Var;
                                    j15Var.a = true;
                                    j15Var.b = true;
                                    j15Var.c.setStrokeWidth(gm.N(2.0f));
                                    y4b.d.c.setStyle(Paint.Style.STROKE);
                                    y4b.d.c.setStrokeCap(Paint.Cap.ROUND);
                                }
                                int w0 = cmb.w0(zArr, cmb.nk, z4);
                                int w02 = cmb.w0(zArr, cmb.p7, z4);
                                y4b.d.d(on2.f(0.25f, w0, w02), w02, z4 ? 1 : 0, z4 ? 1 : 0);
                                y4b.d.b(imageReceiver3.L0, imageReceiver3.M0, imageReceiver3.w(), imageReceiver3.x());
                                Paint paint2 = y4b.d.c;
                                paint2.setStrokeWidth(gm.L(2.0f));
                                paint2.setAlpha((int) (255.0f * f15));
                                canvas2.drawCircle(f9, f10, v4bVar.b() * (f7 + gm.L(4.0f)), paint2);
                            }
                            d = f15;
                            z2 = z4;
                        }
                    }
                    f6 = 0.0f;
                    v4bVar2.f = f6;
                    v4bVar2.l = this.c;
                    v4bVar2.m = this.d;
                    v4bVar2.u = 1.0f - f15;
                    z3 = this.G;
                    if (z3) {
                    }
                    v4bVar2.s = 0L;
                    v4bVar = v4bVar2;
                    long j2 = this.F;
                    if (z3) {
                    }
                    if (f15 > 0.0f) {
                    }
                    d = f15;
                    z2 = z4;
                } else {
                    canvas2 = canvas;
                    v4bVar = v4bVar2;
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
                    canvas2.scale(f16, f16, this.M + gm.L(16.0f), this.N + gm.L(16.0f));
                    c(canvas2, this.M, this.N, 1.0f);
                    float f17 = this.M;
                    float f18 = this.N;
                    if (d > 0.0f) {
                        float L4 = f17 + gm.L(17.0f);
                        float L5 = f18 + gm.L(17.0f);
                        Paint paint3 = aj3Var.H;
                        paint3.setColor(cmb.p1(d, aj3Var.f(cmb.p7)));
                        if (i2 == 0) {
                            paint.setColor(cmb.p1(d, aj3Var.f(cmb.r8)));
                        } else {
                            paint.setColor(cmb.p1(d, aj3Var.f(cmb.L8)));
                        }
                        float interpolation = d53.k.getInterpolation(d) * gm.L(9.0f);
                        canvas2.drawCircle(L4, L5, gm.L(2.0f) + interpolation, paint);
                        canvas2.drawCircle(L4, L5, interpolation, paint3);
                        paint3.setColor(cmb.p1(d, aj3Var.getTextColor()));
                        RectF rectF2 = gm.P;
                        rectF2.set(L4 - gm.L(1.0f), L5 - gm.N(4.6f), gm.L(1.0f) + L4, gm.N(1.6f) + L5);
                        canvas2.drawRoundRect(rectF2, gm.L(3.0f), gm.L(3.0f), paint3);
                        rectF2.set(L4 - gm.L(1.0f), gm.N(2.6f) + L5, L4 + gm.L(1.0f), gm.N(4.6f) + L5);
                        canvas2.drawRoundRect(rectF2, gm.L(3.0f), gm.L(3.0f), paint3);
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
                float L6 = ((1.0f - this.K) * gm.L(7.0f)) + f2;
                FrameLayout frameLayout = this.y;
                frameLayout.setTranslationY(L6);
                frameLayout.setTranslationX(f4 - measuredWidth);
                if (!this.O) {
                    if (this.G) {
                        this.Q = 1.0f;
                    } else {
                        r15 = v4bVar.n == 2 ? 0.7f : 1.0f;
                        this.Q = r15;
                    }
                    float f19 = this.R * r15;
                    frameLayout.setAlpha(f19);
                    frameLayout.setVisibility(f19 > 0.0f ? i : 4);
                }
                super.dispatchDraw(canvas);
            }
            z = aj3Var.n0;
            canvas2 = canvas;
            v4bVar = v4bVar2;
            f2 = f8;
            imageReceiver2 = imageReceiver;
            f3 = f;
            size = 1.0f;
            r11 = 0;
        }
        invalidate();
        if (this.S == null) {
            u09 u09Var2 = aj3Var.n;
            if (u09Var2 != null) {
                this.S = u09Var2;
            } else {
                u09 u09Var3 = new u09(this);
                this.S = u09Var3;
                aj3Var.n = u09Var3;
                u09Var3.d(null, true, r11);
            }
        }
        if (this.x) {
            canvas2.save();
            canvas2.scale(v4bVar.b(), v4bVar.b(), rectF.centerX(), rectF.centerY());
            imageReceiver2.k0(rectF);
            imageReceiver2.h(canvas2, null);
            canvas2.restore();
        }
        this.S.q = r11;
        Paint o = z ? y4b.o(imageReceiver2) : y4b.t(imageReceiver2, true);
        o.setAlpha(nm7.d4);
        u09 u09Var4 = this.S;
        u09Var4.r = o;
        u09Var4.f((int) (imageReceiver2.L0 - gm.L(3.0f)), (int) (imageReceiver2.M0 - gm.L(3.0f)), (int) (imageReceiver2.w() + gm.L(3.0f)), (int) (imageReceiver2.x() + gm.L(3.0f)));
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
        float L62 = ((1.0f - this.K) * gm.L(7.0f)) + f2;
        FrameLayout frameLayout2 = this.y;
        frameLayout2.setTranslationY(L62);
        frameLayout2.setTranslationX(f4 - measuredWidth);
        if (!this.O) {
        }
        super.dispatchDraw(canvas);
    }

    public float getCy() {
        float L = gm.L(48.0f);
        float L2 = gm.L(26.33f);
        return gm.R1(gm.L(5.0f), (a.getCurrentActionBarHeight() - L2) / 2.0f, this.c0.d0) + (gm.R1(L, L2, this.K) / 2.0f);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            aj3 aj3Var = this.c0;
            ch3 ch3Var = aj3Var.r;
            if (parent == ch3Var) {
                ch3Var.invalidate();
            } else {
                aj3Var.invalidate();
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
        ow0 ow0Var = this.e;
        if (ow0Var != null) {
            ow0Var.a();
            this.e = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.O ? gm.L(70.0f) : this.c0.N, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(81.0f), TLObject.FLAG_30));
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
                TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
                this.f = W1;
                this.h = null;
                chat = W1;
            } else {
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
                this.h = L0;
                this.f = null;
                chat = L0;
            }
            if (chat != null) {
                pc0 pc0Var = this.w;
                pc0Var.o(chat);
                imageReceiver.U(chat, pc0Var, null);
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
        g4b g4bVar;
        aj3 aj3Var = this.c0;
        int i = aj3Var.f;
        h4b h4bVar = aj3Var.s;
        long j2 = this.F;
        byte b = 0;
        boolean z = j2 == j;
        if (!z && this.e != null) {
            h4bVar.g0(j2, false);
            this.e.a();
            this.e = null;
        }
        this.F = j;
        this.G = j == z8c.h(i).e();
        this.H = h4bVar.P(j);
        if (j > 0) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
            this.f = W1;
            this.h = null;
            chat = W1;
        } else {
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
            this.h = L0;
            this.f = null;
            chat = L0;
        }
        ImageReceiver imageReceiver = this.r;
        if (chat == null) {
            this.E.l("", false);
            imageReceiver.f();
            return;
        }
        pc0 pc0Var = this.n;
        pc0Var.o(chat);
        imageReceiver.U(chat, pc0Var, null);
        if (this.O) {
            return;
        }
        this.E.i(null);
        if (h4bVar.P(j)) {
            this.E.setTextSize(10);
            this.E.l(jb6.M0(2131750782, null), false);
            this.V = false;
            return;
        }
        if (!Utilities.x(h4bVar.E(j))) {
            this.E.setTextSize(10);
            y4b.a(this.E);
            this.V = true;
            return;
        }
        HashMap hashMap = (HashMap) h4bVar.e.f(j);
        if (hashMap != null && !hashMap.isEmpty()) {
            Collection values = hashMap.values();
            if (!values.isEmpty()) {
                g4bVar = (g4b) values.iterator().next();
                if (g4bVar == null) {
                    this.E.setTextSize(10);
                    y4b.a(this.E);
                    this.V = true;
                    return;
                }
                if (this.G) {
                    if (z && this.V && !this.O) {
                        lka lkaVar = this.E;
                        b();
                        ValueAnimator valueAnimator = aj3Var.k0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            aj3Var.k0 = null;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        aj3Var.k0 = ofFloat;
                        ofFloat.addUpdateListener(new pl(this, lkaVar, (byte) 12));
                        aj3Var.k0.addListener(new u5(this, lkaVar, (byte) 17));
                        aj3Var.k0.setDuration(150L);
                        this.E.setAlpha(0.0f);
                        this.E.setTranslationY(gm.L(5.0f));
                        aj3Var.l0 = new gh3(this, b);
                    }
                    gm.d3(aj3Var.l0, 500L);
                    this.V = false;
                    this.E.setTextSize(10);
                    this.E.l(jb6.M0(2131748058, null), false);
                    return;
                }
                TLRPC.User user = this.f;
                lka lkaVar2 = this.E;
                if (user == null) {
                    lkaVar2.setTextSize(11);
                    this.E.l(b10.e(this.E, this.h.title, false, null, 0), false);
                    this.E.i(null);
                    return;
                }
                lkaVar2.setTextSize(11);
                String str = this.f.first_name;
                String trim = str != null ? str.trim() : "";
                int indexOf = trim.indexOf(" ");
                if (indexOf > 0) {
                    trim = trim.substring(0, indexOf);
                }
                String str2 = trim;
                if (!this.f.verified) {
                    this.E.l(b10.e(this.E, str2, false, null, 0), false);
                    this.E.i(null);
                    return;
                }
                if (this.T == null) {
                    Drawable mutate = aj3Var.getContext().getDrawable(R.drawable.verified_area).mutate();
                    Drawable mutate2 = aj3Var.getContext().getDrawable(R.drawable.verified_check).mutate();
                    ah3 ah3Var = new ah3(aj3Var, mutate, mutate2, mutate, mutate2);
                    ah3Var.x = true;
                    this.T = ah3Var;
                }
                this.E.l(b10.e(this.E, str2, false, null, 0), false);
                this.E.i(this.T);
                return;
            }
        }
        g4bVar = null;
        if (g4bVar == null) {
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        v4b v4bVar = this.P;
        if (z && v4bVar.H == null) {
            v4bVar.H = new u51(this, 1.5f, 5.0f);
        }
        u51 u51Var = v4bVar.H;
        if (u51Var != null) {
            u51Var.c(z);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            aj3 aj3Var = this.c0;
            ch3 ch3Var = aj3Var.r;
            if (parent == ch3Var) {
                ch3Var.invalidate();
            }
            aj3Var.invalidate();
        }
        super.invalidate(i, i2, i3, i4);
    }
}
