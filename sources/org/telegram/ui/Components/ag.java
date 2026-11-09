package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ag extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final fi.l D;
    public final Drawable E;
    public final Drawable F;
    public final zf G;
    public int H;
    public final RectF I;
    public final RectF J;
    public long K;
    public final Path L;
    public final float[] M;
    public final float[] N;
    public final w5 O;
    public gh.b P;
    public boolean Q;
    public fh.g R;
    public fh.g S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public fi.m3 a;
    public boolean a0;
    public fi.m3 b;
    public final /* synthetic */ ChatActivityEnterView b0;
    public ShapeDrawable c;
    public final Drawable d;
    public final String e;
    public StaticLayout f;
    public float h;
    public final TextPaint n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Path x;
    public final Paint y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.b0 = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.n = textPaint;
        this.r = new Paint(1);
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new Paint(1);
        this.I = new RectF();
        this.J = new RectF();
        this.L = new Path();
        this.M = new float[]{r14, r14, 0.0f, 0.0f, 0.0f, 0.0f, r14, r14};
        this.N = new float[]{0.0f, 0.0f, r13, r13, r13, r13, 0.0f, 0.0f};
        this.O = new w5(this, 0L, 350L, xq.h);
        zf zfVar = new zf(this, this);
        this.G = zfVar;
        r0.i0.j(this, zfVar);
        fi.l lVar = new fi.l(5);
        this.D = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.O, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.V3 = drawable;
        org.telegram.ui.ActionBar.s6.x(this, drawable, org.telegram.ui.ActionBar.l6.Pe, chatActivityEnterView.W3, PorterDuff.Mode.MULTIPLY);
        this.c = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.f0(org.telegram.ui.ActionBar.l6.eg));
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.e = org.telegram.messenger.id.M0(2131745312, "SlideUpToLock");
        float L = org.telegram.messenger.g0.L(3.0f);
        float L2 = org.telegram.messenger.g0.L(3.0f);
        this.E = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.F = getResources().getDrawable(R.drawable.input_video).mutate();
        setWillNotDraw(false);
        updateColors();
    }

    public final void a() {
        fi.m3 m3Var = this.a;
        if (m3Var != null) {
            m3Var.q0 = new yf(this, m3Var, 1);
            m3Var.f(true);
            this.a = null;
        }
        fi.m3 m3Var2 = this.b;
        if (m3Var2 != null) {
            m3Var2.q0 = new yf(this, m3Var2, 2);
            m3Var2.f(true);
            this.b = null;
        }
    }

    public final void b() {
        a();
        fi.m3 m3Var = new fi.m3(getContext(), 2);
        this.b = m3Var;
        m3Var.o(1.0f, 0.0f);
        fi.m3 m3Var2 = this.b;
        ChatActivityEnterView chatActivityEnterView = this.b0;
        chatActivityEnterView.setHintGlass(m3Var2);
        this.b.r(true);
        this.b.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(chatActivityEnterView.c1 ? chatActivityEnterView.O ? 2131743582 : 2131743583 : chatActivityEnterView.O ? 2131743510 : 2131743511, null)));
        fi.m3 m3Var3 = this.b;
        m3Var3.h = fi.m3.a(m3Var3.getText(), this.b.getTextPaint());
        if (chatActivityEnterView.O) {
            fi.m3 m3Var4 = this.b;
            m3Var4.getClass();
            ah0 ah0Var = new ah0(R.raw.fire_on, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
            ah0Var.start();
            m3Var4.m(ah0Var);
        } else {
            org.telegram.messenger.qp.e1().edit().putInt("voiceoncehint", org.telegram.messenger.qp.e1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.b, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 54.0f, 58.0f));
        fi.m3 m3Var5 = this.b;
        m3Var5.q0 = new yf(this, m3Var5, 0);
        m3Var5.w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent) || this.G.f(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0163, code lost:
    
        if (r8.g4 != 0.0f) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0749  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i7;
        float f17;
        float f18;
        float f19;
        float f20;
        int i10;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        fh.g gVar;
        float f27;
        float f28;
        fi.m3 m3Var;
        float f29;
        float f30;
        float f31;
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView;
        float f32;
        Paint paint;
        boolean z9;
        boolean z10;
        float f33;
        float max;
        ChatActivityEnterView chatActivityEnterView2 = this.b0;
        RectF rectF = chatActivityEnterView2.S3;
        float f34 = chatActivityEnterView2.h4;
        float f35 = f34 <= 0.5f ? f34 / 0.5f : f34 <= 0.75f ? 1.0f - (((f34 - 0.5f) / 0.25f) * 0.1f) : (((f34 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        long currentTimeMillis = System.currentTimeMillis() - this.K;
        this.K = System.currentTimeMillis();
        float f36 = chatActivityEnterView2.l4;
        if (f36 != 10000.0f) {
            f10 = Math.max(0, (int) (chatActivityEnterView2.k4 - f36));
            if (f10 > org.telegram.messenger.g0.L(57.0f)) {
                f10 = org.telegram.messenger.g0.L(57.0f);
            }
        } else {
            f10 = 0.0f;
        }
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.M(26.0f);
        float L = 1.0f - (f10 / org.telegram.messenger.g0.L(57.0f));
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(194.0f);
        if (chatActivityEnterView2.s4) {
            float L2 = org.telegram.messenger.g0.L(36.0f);
            float d = org.telegram.ui.Cells.f1.d(14.0f, L, (((1.0f - f35) * org.telegram.messenger.g0.N(30.0f)) + (org.telegram.messenger.g0.L(60.0f) + measuredHeight)) - f10);
            float N = org.telegram.messenger.g0.N(2.0f) + (((L2 / 2.0f) + d) - org.telegram.messenger.g0.N(8.0f));
            float f37 = L > 0.4f ? 1.0f : L / 0.4f;
            float f38 = chatActivityEnterView2.n4;
            f11 = com.google.android.recaptcha.internal.a.v(1.0f, f37, f38 * 15.0f, (1.0f - L) * 9.0f * (1.0f - f38));
            f12 = L2;
            f13 = N;
            f14 = d;
            f15 = L;
        } else {
            float L3 = org.telegram.messenger.g0.L(36.0f) + ((int) (org.telegram.messenger.g0.L(14.0f) * L));
            float L4 = (chatActivityEnterView2.o4 * L * (-org.telegram.messenger.g0.L(8.0f))) + (((org.telegram.messenger.g0.L(60.0f) + measuredHeight) + ((int) ((1.0f - f35) * org.telegram.messenger.g0.L(30.0f)))) - ((int) f10));
            float d2 = org.telegram.ui.Cells.f1.d(2.0f, L, org.telegram.messenger.g0.N(2.0f) + (((L3 / 2.0f) + L4) - org.telegram.messenger.g0.N(8.0f)));
            f11 = (1.0f - L) * 9.0f;
            chatActivityEnterView2.n4 = 0.0f;
            f12 = L3;
            f13 = d2;
            f14 = L4;
            f15 = 0.0f;
        }
        float f39 = f11;
        boolean z11 = chatActivityEnterView2.e4;
        RectF rectF2 = this.I;
        if (z11) {
            f16 = 1.0f;
            i7 = measuredWidth;
            if (System.currentTimeMillis() - chatActivityEnterView2.f4 > 200) {
                f17 = 0.0f;
                if (L < 0.8f || chatActivityEnterView2.s4 || chatActivityEnterView2.m4 != f17 || chatActivityEnterView2.p4 != f17) {
                    chatActivityEnterView2.e4 = false;
                }
                if (chatActivityEnterView2.e4) {
                    float f40 = chatActivityEnterView2.g4;
                    if (f40 != f16) {
                        float f41 = (currentTimeMillis / 150.0f) + f40;
                        chatActivityEnterView2.g4 = f41;
                        if (f41 >= f16) {
                            chatActivityEnterView2.g4 = f16;
                            int i11 = org.telegram.messenger.iz.a;
                            SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                            int i12 = org.telegram.messenger.iz.O + 1;
                            org.telegram.messenger.iz.O = i12;
                            edit.putInt("lockRecordAudioVideoHint", i12);
                            edit.apply();
                        }
                    }
                } else {
                    float f42 = chatActivityEnterView2.g4 - (currentTimeMillis / 150.0f);
                    chatActivityEnterView2.g4 = f42;
                    if (f42 < 0.0f) {
                        chatActivityEnterView2.g4 = 0.0f;
                    }
                }
                int i13 = (int) (chatActivityEnterView2.g4 * 255.0f);
                this.c.setAlpha(i13);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(i13);
                this.n.setAlpha(i13);
                if (this.f != null) {
                    canvas.save();
                    f18 = f15;
                    rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.translate((getMeasuredWidth() - this.h) - org.telegram.messenger.g0.L(44.0f), org.telegram.messenger.g0.N(16.0f) + measuredHeight);
                    f19 = f13;
                    f20 = f12;
                    this.c.setBounds(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(2.0f), (int) (this.h + org.telegram.messenger.g0.L(36.0f)), (int) (org.telegram.messenger.g0.N(4.0f) + this.f.getHeight()));
                    this.c.draw(canvas);
                    this.f.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(getMeasuredWidth() - org.telegram.messenger.g0.L(26.0f), ((this.f.getHeight() / 2.0f) + (org.telegram.messenger.g0.N(17.0f) + measuredHeight)) - (org.telegram.messenger.g0.N(3.0f) * chatActivityEnterView2.o4));
                    Path path = this.x;
                    path.reset();
                    path.setLastPoint(-org.telegram.messenger.g0.N(5.0f), org.telegram.messenger.g0.N(4.0f));
                    path.lineTo(0.0f, 0.0f);
                    path.lineTo(org.telegram.messenger.g0.N(5.0f), org.telegram.messenger.g0.N(4.0f));
                    Paint paint2 = this.y;
                    paint2.setColor(-1);
                    paint2.setAlpha(i13);
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeCap(Paint.Cap.ROUND);
                    paint2.setStrokeJoin(Paint.Join.ROUND);
                    paint2.setStrokeWidth(org.telegram.messenger.g0.N(1.5f));
                    canvas.drawPath(path, paint2);
                    canvas.restore();
                    canvas.save();
                    i10 = i7;
                    drawable2.setBounds(i7 - (drawable2.getIntrinsicWidth() / 2), (int) (org.telegram.messenger.g0.N(20.0f) + this.f.getHeight() + measuredHeight), org.telegram.ui.Cells.f1.w(2, i10, drawable2), drawable2.getIntrinsicHeight() + ((int) (org.telegram.messenger.g0.N(20.0f) + this.f.getHeight() + measuredHeight)));
                    drawable2.draw(canvas);
                    canvas.restore();
                    float d10 = this.O.d(!chatActivityEnterView2.c1 && chatActivityEnterView2.i1 >= 59000);
                    f21 = chatActivityEnterView2.p4;
                    if (f21 != 0.0f || chatActivityEnterView2.h1 == null) {
                        f22 = chatActivityEnterView2.m4;
                        if (f22 == 0.0f) {
                            float f43 = f22 > 0.6f ? 1.0f : f22 / 0.6f;
                            if (!chatActivityEnterView2.g0) {
                                f22 = Math.max(0.0f, (f22 - 0.6f) / 0.4f);
                            }
                            xq xqVar = xq.j;
                            float interpolation = xqVar.getInterpolation(f43);
                            f23 = xqVar.getInterpolation(f22);
                            f24 = interpolation;
                        } else {
                            f23 = 0.0f;
                            f24 = 0.0f;
                        }
                    } else {
                        float f44 = f21 > 0.38f ? 1.0f : f21 / 0.38f;
                        if (f21 > 0.63f) {
                            max = 1.0f;
                            f33 = 0.0f;
                        } else {
                            f33 = 0.0f;
                            max = Math.max(0.0f, (f21 - 0.38f) / 0.25f);
                        }
                        xq xqVar2 = xq.j;
                        float interpolation2 = xqVar2.getInterpolation(f44);
                        xqVar2.getInterpolation(max);
                        f23 = f33;
                        f24 = interpolation2;
                    }
                    canvas.save();
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - chatActivityEnterView2.z1.getMeasuredHeight());
                    f25 = 1.0f - chatActivityEnterView2.i4;
                    if (f25 == 0.0f) {
                        f25 = f23 != 0.0f ? f23 : 0.0f;
                    }
                    if (chatActivityEnterView2.j4 >= 0.7f || chatActivityEnterView2.r4) {
                        chatActivityEnterView2.e4 = false;
                        f26 = chatActivityEnterView2.q4;
                        if (f26 != 0.0f) {
                            float f45 = f26 - 0.12f;
                            chatActivityEnterView2.q4 = f45;
                            if (f45 < 0.0f) {
                                chatActivityEnterView2.q4 = 0.0f;
                            }
                        }
                    } else {
                        float f46 = chatActivityEnterView2.q4;
                        if (f46 != 1.0f) {
                            float f47 = f46 + 0.12f;
                            chatActivityEnterView2.q4 = f47;
                            if (f47 > 1.0f) {
                                chatActivityEnterView2.q4 = 1.0f;
                            }
                        }
                    }
                    float N2 = org.telegram.messenger.g0.N(72.0f);
                    float z12 = com.google.android.recaptcha.internal.a.z(1.0f, f25, org.telegram.messenger.g0.N(24.0f) * f24, N2 * f25);
                    float f48 = chatActivityEnterView2.q4;
                    float z13 = com.google.android.recaptcha.internal.a.z(1.0f, f48, N2, z12);
                    float f49 = z13 <= N2 ? N2 : z13;
                    float A = org.telegram.messenger.k5.A(1.0f, f23, (1.0f - d10) * chatActivityEnterView2.i4, f48);
                    float f50 = i10;
                    float f51 = f19 + f49;
                    canvas.scale(A, A, f50, f51);
                    float f52 = f14 + f49;
                    int i14 = i10;
                    rectF2.set(f50 - org.telegram.messenger.g0.N(18.0f), f52, org.telegram.messenger.g0.N(18.0f) + f50, f52 + f20);
                    gVar = this.R;
                    Paint paint3 = this.r;
                    if (gVar == null) {
                        f27 = f50;
                        f28 = f49;
                        gVar.setBounds((int) (rectF2.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF2.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.bottom));
                        this.R.draw(canvas);
                    } else {
                        f27 = f50;
                        f28 = f49;
                        chatActivityEnterView2.V3.setBounds((int) (rectF2.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF2.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.bottom));
                        chatActivityEnterView2.V3.draw(canvas);
                        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.N(18.0f), org.telegram.messenger.g0.N(18.0f), paint3);
                    }
                    rectF.set(rectF2);
                    float centerX = rectF.centerX();
                    float centerY = rectF.centerY();
                    rectF.left = org.telegram.messenger.g0.T1(centerX, rectF.left, A);
                    rectF.right = org.telegram.messenger.g0.T1(centerX, rectF.right, A);
                    rectF.top = org.telegram.messenger.g0.T1(centerY, rectF.top, A);
                    rectF.bottom = org.telegram.messenger.g0.T1(centerY, rectF.bottom, A);
                    m3Var = this.a;
                    if (m3Var != null) {
                        m3Var.p(0.0f, rectF2.centerY());
                        this.a.invalidate();
                    }
                    float f53 = 1.0f - f18;
                    rectF2.set((f27 - org.telegram.messenger.g0.N(6.0f)) - (org.telegram.messenger.g0.N(2.0f) * f53), f51 - (org.telegram.messenger.g0.N(2.0f) * f53), org.telegram.ui.Cells.f1.d(2.0f, f53, org.telegram.messenger.g0.L(6.0f) + i14), org.telegram.ui.Cells.f1.d(2.0f, f53, f51 + org.telegram.messenger.g0.L(12.0f)));
                    float f54 = rectF2.bottom;
                    float centerX2 = rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    canvas.save();
                    float i15 = Utilities.i(chatActivityEnterView2.p4 * 2.0f, 1.0f, 0.0f);
                    Paint paint4 = this.s;
                    int alpha = paint4.getAlpha();
                    float f55 = f14;
                    float f56 = f24;
                    f29 = f18;
                    Canvas canvas2 = canvas;
                    int saveLayerAlpha = canvas2.saveLayerAlpha(centerX2 - org.telegram.messenger.g0.L(24.0f), centerY2 - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f) + centerX2, org.telegram.messenger.g0.L(24.0f) + centerY2, (int) (alpha * (1.0f - i15)), 31);
                    Paint paint5 = this.w;
                    paint5.setAlpha(org.telegram.messenger.qs.e4);
                    paint4.setAlpha(org.telegram.messenger.qs.e4);
                    float f57 = 1.0f - L;
                    canvas2.translate(0.0f, org.telegram.messenger.g0.N(2.0f) * f57);
                    canvas2.rotate(f39, centerX2, centerY2);
                    if (f29 == 1.0f) {
                        RectF rectF3 = org.telegram.messenger.g0.P;
                        rectF3.set(0.0f, 0.0f, org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.N(8.0f));
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.ui.Cells.f1.d(2.0f, f57, f28 + f54));
                        canvas2.translate(f27 - org.telegram.messenger.g0.N(4.0f), (org.telegram.messenger.g0.N(2.0f) * chatActivityEnterView2.n4) + org.telegram.ui.Cells.f1.d(12.0f, f29, (rectF2.top - org.telegram.messenger.g0.L(6.0f)) - org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(2.0f), (1.0f - chatActivityEnterView2.o4) * org.telegram.messenger.g0.N(1.5f), L)));
                        if (f39 > 0.0f) {
                            canvas2.rotate(f39, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                        }
                        f30 = f53;
                        paint5 = paint5;
                        canvas2.drawLine(org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.N(4.0f), org.telegram.messenger.g0.N(8.0f), org.telegram.ui.Cells.f1.d(4.0f, f30, org.telegram.messenger.g0.N(6.0f)), paint5);
                        canvas.drawArc(rectF3, 0.0f, -180.0f, false, paint5);
                        canvas2 = canvas;
                        canvas2.drawLine(0.0f, org.telegram.messenger.g0.N(4.0f), 0.0f, com.google.android.recaptcha.internal.a.x(org.telegram.messenger.g0.N(4.0f), chatActivityEnterView2.n4, f57, (org.telegram.messenger.g0.N(4.0f) * chatActivityEnterView2.o4 * L * (!chatActivityEnterView2.s4 ? 1 : 0)) + org.telegram.messenger.g0.N(4.0f)), paint5);
                        canvas2.restore();
                        f31 = 0.0f;
                    } else {
                        f30 = f53;
                        f31 = 0.0f;
                    }
                    drawable = i15 <= f31 ? chatActivityEnterView2.c1 ? this.F : this.E : null;
                    if (f29 <= f31) {
                        if (this.S == null) {
                            paint = paint3;
                            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(3.0f), paint);
                        } else {
                            paint = paint3;
                        }
                        Path path2 = this.L;
                        path2.rewind();
                        RectF rectF4 = org.telegram.messenger.g0.P;
                        rectF4.set(rectF2);
                        rectF4.right = rectF2.centerX() - (org.telegram.messenger.g0.L(1.66f) * f29);
                        f32 = f30;
                        float W1 = org.telegram.messenger.g0.W1(f29, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(1.5f));
                        float[] fArr = this.M;
                        fArr[7] = W1;
                        fArr[6] = W1;
                        fArr[1] = W1;
                        fArr[0] = W1;
                        float L5 = org.telegram.messenger.g0.L(1.5f) * f29;
                        fArr[5] = L5;
                        fArr[4] = L5;
                        fArr[3] = L5;
                        fArr[2] = L5;
                        Path.Direction direction = Path.Direction.CW;
                        path2.addRoundRect(rectF4, fArr, direction);
                        rectF4.set(rectF2);
                        rectF4.left = (org.telegram.messenger.g0.L(1.66f) * f29) + rectF2.centerX();
                        chatActivityEnterView = chatActivityEnterView2;
                        float W12 = org.telegram.messenger.g0.W1(f29, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(1.5f));
                        float[] fArr2 = this.N;
                        fArr2[5] = W12;
                        fArr2[4] = W12;
                        fArr2[3] = W12;
                        fArr2[2] = W12;
                        float L6 = org.telegram.messenger.g0.L(1.5f) * f29;
                        fArr2[7] = L6;
                        fArr2[6] = L6;
                        fArr2[1] = L6;
                        z9 = false;
                        fArr2[0] = L6;
                        path2.addRoundRect(rectF4, fArr2, direction);
                        canvas2.drawPath(path2, paint4);
                    } else {
                        chatActivityEnterView = chatActivityEnterView2;
                        f32 = f30;
                        paint = paint3;
                        z9 = false;
                        canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(3.0f), paint4);
                    }
                    paint4.setAlpha(alpha);
                    paint5.setAlpha(alpha);
                    canvas2.restoreToCount(saveLayerAlpha);
                    if (drawable != null) {
                        Rect rect = org.telegram.messenger.g0.Q;
                        rect.set((int) (rectF2.centerX() - ((drawable.getIntrinsicWidth() / 2) * 0.9285f)), (int) (rectF2.centerY() - ((drawable.getIntrinsicHeight() / 2) * 0.9285f)), (int) (((drawable.getIntrinsicWidth() / 2) * 0.9285f) + rectF2.centerX()), (int) (((drawable.getIntrinsicHeight() / 2) * 0.9285f) + rectF2.centerY()));
                        drawable.setBounds(rect);
                        drawable.setAlpha((int) (i15 * 255.0f));
                        drawable.draw(canvas2);
                    }
                    if (f29 != 1.0f) {
                        canvas2.drawCircle(centerX2, centerY2, org.telegram.messenger.g0.N(2.0f) * f32, paint);
                    }
                    canvas2.restore();
                    canvas2.restore();
                    ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView;
                    float L7 = (org.telegram.messenger.g0.L(38.0f) * d10) + org.telegram.messenger.g0.T1(f55, getMeasuredHeight() - org.telegram.messenger.g0.L(118.0f), Math.max(chatActivityEnterView3.m4, Math.min(f56, chatActivityEnterView3.q4))) + f28;
                    rectF2.set(f27 - org.telegram.messenger.g0.N(18.0f), L7, org.telegram.messenger.g0.N(18.0f) + f27, L7 + f20);
                    wf wfVar = chatActivityEnterView3.Z2;
                    z10 = (wfVar == null && wfVar.d1()) ? true : z9;
                    chatActivityEnterView3.P = z10;
                    if (z10) {
                        return;
                    }
                    float N3 = org.telegram.messenger.g0.N(12.0f);
                    rectF2.set(rectF2.left, (rectF2.top - org.telegram.messenger.g0.N(36.0f)) - N3, rectF2.right, rectF2.top - N3);
                    fi.m3 m3Var2 = this.b;
                    if (m3Var2 != null) {
                        m3Var2.p(0.0f, rectF2.centerY());
                        this.b.invalidate();
                    }
                    this.J.set(rectF2);
                    canvas2.save();
                    float f58 = (1.0f - chatActivityEnterView3.m4) * chatActivityEnterView3.i4 * chatActivityEnterView3.q4 * chatActivityEnterView3.n4;
                    canvas2.scale(f58, f58, rectF2.centerX(), rectF2.centerY());
                    fh.g gVar2 = this.S;
                    if (gVar2 != null) {
                        gVar2.setBounds((int) (rectF2.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF2.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.bottom));
                        this.S.draw(canvas2);
                    } else {
                        chatActivityEnterView3.V3.setBounds((int) (rectF2.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF2.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.bottom));
                        chatActivityEnterView3.V3.draw(canvas2);
                        canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.N(18.0f), org.telegram.messenger.g0.N(18.0f), paint);
                    }
                    int i16 = (int) rectF2.left;
                    int i17 = (int) rectF2.top;
                    int i18 = (int) rectF2.right;
                    int i19 = (int) rectF2.bottom;
                    fi.l lVar = this.D;
                    lVar.setBounds(i16, i17, i18, i19);
                    lVar.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                f18 = f15;
                f19 = f13;
                f20 = f12;
                i10 = i7;
                float d102 = this.O.d(!chatActivityEnterView2.c1 && chatActivityEnterView2.i1 >= 59000);
                f21 = chatActivityEnterView2.p4;
                if (f21 != 0.0f) {
                }
                f22 = chatActivityEnterView2.m4;
                if (f22 == 0.0f) {
                }
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - chatActivityEnterView2.z1.getMeasuredHeight());
                f25 = 1.0f - chatActivityEnterView2.i4;
                if (f25 == 0.0f) {
                }
                if (chatActivityEnterView2.j4 >= 0.7f) {
                }
                chatActivityEnterView2.e4 = false;
                f26 = chatActivityEnterView2.q4;
                if (f26 != 0.0f) {
                }
                float N22 = org.telegram.messenger.g0.N(72.0f);
                float z122 = com.google.android.recaptcha.internal.a.z(1.0f, f25, org.telegram.messenger.g0.N(24.0f) * f24, N22 * f25);
                float f482 = chatActivityEnterView2.q4;
                float z132 = com.google.android.recaptcha.internal.a.z(1.0f, f482, N22, z122);
                if (z132 <= N22) {
                }
                float A2 = org.telegram.messenger.k5.A(1.0f, f23, (1.0f - d102) * chatActivityEnterView2.i4, f482);
                float f502 = i10;
                float f512 = f19 + f49;
                canvas.scale(A2, A2, f502, f512);
                float f522 = f14 + f49;
                int i142 = i10;
                rectF2.set(f502 - org.telegram.messenger.g0.N(18.0f), f522, org.telegram.messenger.g0.N(18.0f) + f502, f522 + f20);
                gVar = this.R;
                Paint paint32 = this.r;
                if (gVar == null) {
                }
                rectF.set(rectF2);
                float centerX3 = rectF.centerX();
                float centerY3 = rectF.centerY();
                rectF.left = org.telegram.messenger.g0.T1(centerX3, rectF.left, A2);
                rectF.right = org.telegram.messenger.g0.T1(centerX3, rectF.right, A2);
                rectF.top = org.telegram.messenger.g0.T1(centerY3, rectF.top, A2);
                rectF.bottom = org.telegram.messenger.g0.T1(centerY3, rectF.bottom, A2);
                m3Var = this.a;
                if (m3Var != null) {
                }
                float f532 = 1.0f - f18;
                rectF2.set((f27 - org.telegram.messenger.g0.N(6.0f)) - (org.telegram.messenger.g0.N(2.0f) * f532), f512 - (org.telegram.messenger.g0.N(2.0f) * f532), org.telegram.ui.Cells.f1.d(2.0f, f532, org.telegram.messenger.g0.L(6.0f) + i142), org.telegram.ui.Cells.f1.d(2.0f, f532, f512 + org.telegram.messenger.g0.L(12.0f)));
                float f542 = rectF2.bottom;
                float centerX22 = rectF2.centerX();
                float centerY22 = rectF2.centerY();
                canvas.save();
                float i152 = Utilities.i(chatActivityEnterView2.p4 * 2.0f, 1.0f, 0.0f);
                Paint paint42 = this.s;
                int alpha2 = paint42.getAlpha();
                float f552 = f14;
                float f562 = f24;
                f29 = f18;
                Canvas canvas22 = canvas;
                int saveLayerAlpha2 = canvas22.saveLayerAlpha(centerX22 - org.telegram.messenger.g0.L(24.0f), centerY22 - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f) + centerX22, org.telegram.messenger.g0.L(24.0f) + centerY22, (int) (alpha2 * (1.0f - i152)), 31);
                Paint paint52 = this.w;
                paint52.setAlpha(org.telegram.messenger.qs.e4);
                paint42.setAlpha(org.telegram.messenger.qs.e4);
                float f572 = 1.0f - L;
                canvas22.translate(0.0f, org.telegram.messenger.g0.N(2.0f) * f572);
                canvas22.rotate(f39, centerX22, centerY22);
                if (f29 == 1.0f) {
                }
                if (i152 <= f31) {
                }
                if (f29 <= f31) {
                }
                paint42.setAlpha(alpha2);
                paint52.setAlpha(alpha2);
                canvas22.restoreToCount(saveLayerAlpha2);
                if (drawable != null) {
                }
                if (f29 != 1.0f) {
                }
                canvas22.restore();
                canvas22.restore();
                ChatActivityEnterView chatActivityEnterView32 = chatActivityEnterView;
                float L72 = (org.telegram.messenger.g0.L(38.0f) * d102) + org.telegram.messenger.g0.T1(f552, getMeasuredHeight() - org.telegram.messenger.g0.L(118.0f), Math.max(chatActivityEnterView32.m4, Math.min(f562, chatActivityEnterView32.q4))) + f28;
                rectF2.set(f27 - org.telegram.messenger.g0.N(18.0f), L72, org.telegram.messenger.g0.N(18.0f) + f27, L72 + f20);
                wf wfVar2 = chatActivityEnterView32.Z2;
                if (wfVar2 == null) {
                }
                chatActivityEnterView32.P = z10;
                if (z10) {
                }
            }
        } else {
            f16 = 1.0f;
            i7 = measuredWidth;
        }
        f17 = 0.0f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(250.0f);
        if (this.H != size) {
            this.H = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.n, org.telegram.messenger.g0.L(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i11 = 0; i11 < lineCount; i11++) {
                float lineWidth = this.f.getLineWidth(i11);
                if (lineWidth > this.h) {
                    this.h = lineWidth;
                }
            }
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i7) {
        return super.onSetAlpha(i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.b0;
        RectF rectF = chatActivityEnterView.S3;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.J;
        int i7 = 0;
        if (action == 0) {
            if (chatActivityEnterView.s4) {
                this.a0 = rectF.contains(x10, y10);
            }
            if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.n4 > 0.1f) {
                this.W = rectF2.contains(x10, y10);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.a0 && rectF.contains(x10, y10)) {
                if (chatActivityEnterView.c1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.Z2.c1();
                } else {
                    xf xfVar = new xf(this, i7);
                    fi.m3 m3Var = this.a;
                    if (m3Var != null && m3Var.V) {
                        a();
                    }
                    ki0 ki0Var = chatActivityEnterView.h1;
                    if (ki0Var != null) {
                        ki0Var.setPlaying(false);
                    }
                    if (!MediaController.B().K() || (chatActivityEnterView.h1.getAudioLeft() <= 0.01f && chatActivityEnterView.h1.getAudioRight() >= 0.99f)) {
                        xfVar.run();
                    } else {
                        f fVar = new f(10, this, xfVar);
                        if (org.telegram.messenger.qp.e1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), chatActivityEnterView.W3);
                            String M0 = org.telegram.messenger.id.M0(2131746348, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = M0;
                            u1Var.T = org.telegram.messenger.id.M0(2131746349, null);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), new u(fVar, 19));
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                        } else {
                            fVar.run();
                        }
                    }
                }
                this.W = false;
                this.a0 = false;
                return true;
            }
            if (this.W && rectF2.contains(x10, y10)) {
                boolean z9 = !chatActivityEnterView.O;
                chatActivityEnterView.O = z9;
                this.D.d(1, z9, true);
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(chatActivityEnterView.Q);
                long j3 = chatActivityEnterView.Q2;
                org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
                b02.e2(j3, (cnVar == null || !cnVar.v4) ? 0L : cnVar.b(), chatActivityEnterView.O);
                if (chatActivityEnterView.O) {
                    b();
                } else {
                    a();
                }
                invalidate();
                this.W = false;
                this.a0 = false;
                return true;
            }
            this.W = false;
            this.a0 = false;
        } else if (motionEvent.getAction() == 3) {
            this.W = false;
            this.a0 = false;
        }
        return this.a0 || this.W;
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setBlurredBackgroundFactory(dh.c cVar) {
        this.Q = true;
        if (this.P == null) {
            this.P = new gh.b(org.telegram.ui.ActionBar.l6.Oe, this.b0.W3);
        }
        fh.g c10 = cVar.c(this, this.P, false);
        this.R = c10;
        c10.r(org.telegram.messenger.g0.L(18.0f));
        this.R.q(org.telegram.messenger.g0.L(3.0f));
        fh.g c11 = cVar.c(this, this.P, false);
        this.S = c11;
        c11.r(org.telegram.messenger.g0.L(18.0f));
        this.S.q(org.telegram.messenger.g0.L(3.0f));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        TextPaint textPaint;
        Drawable drawable;
        Drawable drawable2;
        fi.l lVar = this.D;
        if (lVar == null || (textPaint = this.n) == null || (drawable = this.E) == null || (drawable2 = this.F) == null) {
            return;
        }
        gh.b bVar = this.P;
        if (bVar != null) {
            bVar.d();
        }
        fh.g gVar = this.R;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.S;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        int i7 = this.Q ? org.telegram.ui.ActionBar.l6.Kl : org.telegram.ui.ActionBar.l6.Ne;
        ChatActivityEnterView chatActivityEnterView = this.b0;
        lVar.e(chatActivityEnterView.f0(i7), chatActivityEnterView.f0(org.telegram.ui.ActionBar.l6.Rf), -1);
        textPaint.setColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.l6.dg));
        ShapeDrawable shapeDrawable = this.c;
        if (shapeDrawable != null) {
            org.telegram.ui.ActionBar.l6.C1(chatActivityEnterView.f0(org.telegram.ui.ActionBar.l6.eg), shapeDrawable);
        } else {
            this.c = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.f0(org.telegram.ui.ActionBar.l6.eg));
        }
        int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.l6.eg);
        Drawable drawable3 = this.d;
        if (drawable3 != null && f02 != this.T) {
            this.T = f02;
            drawable3.setColorFilter(new PorterDuffColorFilter(f02, PorterDuff.Mode.SRC_IN));
        }
        this.r.setColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.l6.Oe));
        this.s.setColor(chatActivityEnterView.f0(this.Q ? org.telegram.ui.ActionBar.l6.Kl : org.telegram.ui.ActionBar.l6.Ne));
        this.w.setColor(chatActivityEnterView.f0(this.Q ? org.telegram.ui.ActionBar.l6.Kl : org.telegram.ui.ActionBar.l6.Ne));
        int f03 = chatActivityEnterView.f0(this.Q ? org.telegram.ui.ActionBar.l6.Kl : org.telegram.ui.ActionBar.l6.Ne);
        if (this.V && f03 == this.U) {
            return;
        }
        this.V = true;
        this.U = f03;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(f03, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(f03, mode));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.D || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
