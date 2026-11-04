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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yf extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final gi.l E;
    public final Drawable F;
    public final Drawable G;
    public final xf H;
    public int I;
    public final RectF J;
    public final RectF K;
    public long L;
    public final Path M;
    public final float[] N;
    public final float[] O;
    public final u5 P;
    public hh.b Q;
    public boolean R;
    public gh.g S;
    public gh.g T;
    public int U;
    public int V;
    public boolean W;
    public gi.l3 a;
    public boolean a0;
    public gi.l3 b;
    public boolean b0;
    public ShapeDrawable c;
    public final /* synthetic */ ChatActivityEnterView c0;
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
    public yf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.c0 = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.n = textPaint;
        this.r = new Paint(1);
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new Paint(1);
        this.J = new RectF();
        this.K = new RectF();
        this.M = new Path();
        this.N = new float[]{r14, r14, 0.0f, 0.0f, 0.0f, 0.0f, r14, r14};
        this.O = new float[]{0.0f, 0.0f, r13, r13, r13, r13, 0.0f, 0.0f};
        this.P = new u5(this, 0L, 350L, xq.h);
        xf xfVar = new xf(this, this);
        this.H = xfVar;
        r0.i0.j(this, xfVar);
        gi.l lVar = new gi.l(5);
        this.E = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.P, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.W3 = drawable;
        org.telegram.ui.ActionBar.r6.y(this, drawable, org.telegram.ui.ActionBar.k6.Pe, chatActivityEnterView.X3, PorterDuff.Mode.MULTIPLY);
        this.c = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.eg));
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.e = org.telegram.messenger.bd.M0(2131745322, "SlideUpToLock");
        float L = org.telegram.messenger.g0.L(3.0f);
        float L2 = org.telegram.messenger.g0.L(3.0f);
        this.F = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.G = getResources().getDrawable(R.drawable.input_video).mutate();
        setWillNotDraw(false);
        updateColors();
    }

    public final void a() {
        gi.l3 l3Var = this.a;
        if (l3Var != null) {
            l3Var.r0 = new wf(this, l3Var, 1);
            l3Var.f(true);
            this.a = null;
        }
        gi.l3 l3Var2 = this.b;
        if (l3Var2 != null) {
            l3Var2.r0 = new wf(this, l3Var2, 2);
            l3Var2.f(true);
            this.b = null;
        }
    }

    public final void b() {
        a();
        gi.l3 l3Var = new gi.l3(getContext(), 2);
        this.b = l3Var;
        l3Var.o(1.0f, 0.0f);
        gi.l3 l3Var2 = this.b;
        ChatActivityEnterView chatActivityEnterView = this.c0;
        chatActivityEnterView.setHintGlass(l3Var2);
        this.b.r(true);
        this.b.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(chatActivityEnterView.d1 ? chatActivityEnterView.P ? 2131743592 : 2131743593 : chatActivityEnterView.P ? 2131743520 : 2131743521, null)));
        gi.l3 l3Var3 = this.b;
        l3Var3.h = gi.l3.a(l3Var3.getText(), this.b.getTextPaint());
        if (chatActivityEnterView.P) {
            gi.l3 l3Var4 = this.b;
            l3Var4.getClass();
            ch0 ch0Var = new ch0(R.raw.fire_on, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
            ch0Var.start();
            l3Var4.m(ch0Var);
        } else {
            org.telegram.messenger.hp.e1().edit().putInt("voiceoncehint", org.telegram.messenger.hp.e1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.b, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 54.0f, 58.0f));
        gi.l3 l3Var5 = this.b;
        l3Var5.r0 = new wf(this, l3Var5, 0);
        l3Var5.w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent) || this.H.f(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0163, code lost:
    
        if (r8.h4 != 0.0f) goto L33;
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
        int i3;
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
        gh.g gVar;
        float f27;
        float f28;
        gi.l3 l3Var;
        float f29;
        float f30;
        float f31;
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView;
        float f32;
        Paint paint;
        boolean z10;
        boolean z11;
        float f33;
        float max;
        ChatActivityEnterView chatActivityEnterView2 = this.c0;
        RectF rectF = chatActivityEnterView2.T3;
        float f34 = chatActivityEnterView2.i4;
        float f35 = f34 <= 0.5f ? f34 / 0.5f : f34 <= 0.75f ? 1.0f - (((f34 - 0.5f) / 0.25f) * 0.1f) : (((f34 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        long currentTimeMillis = System.currentTimeMillis() - this.L;
        this.L = System.currentTimeMillis();
        float f36 = chatActivityEnterView2.m4;
        if (f36 != 10000.0f) {
            f10 = Math.max(0, (int) (chatActivityEnterView2.l4 - f36));
            if (f10 > org.telegram.messenger.g0.L(57.0f)) {
                f10 = org.telegram.messenger.g0.L(57.0f);
            }
        } else {
            f10 = 0.0f;
        }
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.M(26.0f);
        float L = 1.0f - (f10 / org.telegram.messenger.g0.L(57.0f));
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(194.0f);
        if (chatActivityEnterView2.t4) {
            float L2 = org.telegram.messenger.g0.L(36.0f);
            float g7 = org.telegram.ui.Cells.f1.g(14.0f, L, (((1.0f - f35) * org.telegram.messenger.g0.N(30.0f)) + (org.telegram.messenger.g0.L(60.0f) + measuredHeight)) - f10);
            float N = org.telegram.messenger.g0.N(2.0f) + (((L2 / 2.0f) + g7) - org.telegram.messenger.g0.N(8.0f));
            float f37 = L > 0.4f ? 1.0f : L / 0.4f;
            float f38 = chatActivityEnterView2.o4;
            f11 = a1.g.D(1.0f, f37, f38 * 15.0f, (1.0f - L) * 9.0f * (1.0f - f38));
            f12 = L2;
            f13 = N;
            f14 = g7;
            f15 = L;
        } else {
            float L3 = org.telegram.messenger.g0.L(36.0f) + ((int) (org.telegram.messenger.g0.L(14.0f) * L));
            float L4 = (chatActivityEnterView2.p4 * L * (-org.telegram.messenger.g0.L(8.0f))) + (((org.telegram.messenger.g0.L(60.0f) + measuredHeight) + ((int) ((1.0f - f35) * org.telegram.messenger.g0.L(30.0f)))) - ((int) f10));
            float g10 = org.telegram.ui.Cells.f1.g(2.0f, L, org.telegram.messenger.g0.N(2.0f) + (((L3 / 2.0f) + L4) - org.telegram.messenger.g0.N(8.0f)));
            f11 = (1.0f - L) * 9.0f;
            chatActivityEnterView2.o4 = 0.0f;
            f12 = L3;
            f13 = g10;
            f14 = L4;
            f15 = 0.0f;
        }
        float f39 = f11;
        boolean z12 = chatActivityEnterView2.f4;
        RectF rectF2 = this.J;
        if (z12) {
            f16 = 1.0f;
            i3 = measuredWidth;
            if (System.currentTimeMillis() - chatActivityEnterView2.g4 > 200) {
                f17 = 0.0f;
                if (L < 0.8f || chatActivityEnterView2.t4 || chatActivityEnterView2.n4 != f17 || chatActivityEnterView2.q4 != f17) {
                    chatActivityEnterView2.f4 = false;
                }
                if (chatActivityEnterView2.f4) {
                    float f40 = chatActivityEnterView2.h4;
                    if (f40 != f16) {
                        float f41 = (currentTimeMillis / 150.0f) + f40;
                        chatActivityEnterView2.h4 = f41;
                        if (f41 >= f16) {
                            chatActivityEnterView2.h4 = f16;
                            int i11 = org.telegram.messenger.az.a;
                            SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                            int i12 = org.telegram.messenger.az.O + 1;
                            org.telegram.messenger.az.O = i12;
                            edit.putInt("lockRecordAudioVideoHint", i12);
                            edit.apply();
                        }
                    }
                } else {
                    float f42 = chatActivityEnterView2.h4 - (currentTimeMillis / 150.0f);
                    chatActivityEnterView2.h4 = f42;
                    if (f42 < 0.0f) {
                        chatActivityEnterView2.h4 = 0.0f;
                    }
                }
                int i13 = (int) (chatActivityEnterView2.h4 * 255.0f);
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
                    canvas.translate(getMeasuredWidth() - org.telegram.messenger.g0.L(26.0f), ((this.f.getHeight() / 2.0f) + (org.telegram.messenger.g0.N(17.0f) + measuredHeight)) - (org.telegram.messenger.g0.N(3.0f) * chatActivityEnterView2.p4));
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
                    i10 = i3;
                    drawable2.setBounds(i3 - (drawable2.getIntrinsicWidth() / 2), (int) (org.telegram.messenger.g0.N(20.0f) + this.f.getHeight() + measuredHeight), org.telegram.ui.Cells.f1.z(2, i10, drawable2), drawable2.getIntrinsicHeight() + ((int) (org.telegram.messenger.g0.N(20.0f) + this.f.getHeight() + measuredHeight)));
                    drawable2.draw(canvas);
                    canvas.restore();
                    float d = this.P.d(!chatActivityEnterView2.d1 && chatActivityEnterView2.j1 >= 59000);
                    f21 = chatActivityEnterView2.q4;
                    if (f21 != 0.0f || chatActivityEnterView2.i1 == null) {
                        f22 = chatActivityEnterView2.n4;
                        if (f22 == 0.0f) {
                            float f43 = f22 > 0.6f ? 1.0f : f22 / 0.6f;
                            if (!chatActivityEnterView2.h0) {
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
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - chatActivityEnterView2.A1.getMeasuredHeight());
                    f25 = 1.0f - chatActivityEnterView2.j4;
                    if (f25 == 0.0f) {
                        f25 = f23 != 0.0f ? f23 : 0.0f;
                    }
                    if (chatActivityEnterView2.k4 >= 0.7f || chatActivityEnterView2.s4) {
                        chatActivityEnterView2.f4 = false;
                        f26 = chatActivityEnterView2.r4;
                        if (f26 != 0.0f) {
                            float f45 = f26 - 0.12f;
                            chatActivityEnterView2.r4 = f45;
                            if (f45 < 0.0f) {
                                chatActivityEnterView2.r4 = 0.0f;
                            }
                        }
                    } else {
                        float f46 = chatActivityEnterView2.r4;
                        if (f46 != 1.0f) {
                            float f47 = f46 + 0.12f;
                            chatActivityEnterView2.r4 = f47;
                            if (f47 > 1.0f) {
                                chatActivityEnterView2.r4 = 1.0f;
                            }
                        }
                    }
                    float N2 = org.telegram.messenger.g0.N(72.0f);
                    float y9 = com.google.android.recaptcha.internal.a.y(1.0f, f25, org.telegram.messenger.g0.N(24.0f) * f24, N2 * f25);
                    float f48 = chatActivityEnterView2.r4;
                    float y10 = com.google.android.recaptcha.internal.a.y(1.0f, f48, N2, y9);
                    float f49 = y10 <= N2 ? N2 : y10;
                    float A = org.telegram.messenger.k5.A(1.0f, f23, (1.0f - d) * chatActivityEnterView2.j4, f48);
                    float f50 = i10;
                    float f51 = f19 + f49;
                    canvas.scale(A, A, f50, f51);
                    float f52 = f14 + f49;
                    int i14 = i10;
                    rectF2.set(f50 - org.telegram.messenger.g0.N(18.0f), f52, org.telegram.messenger.g0.N(18.0f) + f50, f52 + f20);
                    gVar = this.S;
                    Paint paint3 = this.r;
                    if (gVar == null) {
                        f27 = f50;
                        f28 = f49;
                        gVar.setBounds((int) (rectF2.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF2.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.bottom));
                        this.S.draw(canvas);
                    } else {
                        f27 = f50;
                        f28 = f49;
                        chatActivityEnterView2.W3.setBounds((int) (rectF2.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF2.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.bottom));
                        chatActivityEnterView2.W3.draw(canvas);
                        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.N(18.0f), org.telegram.messenger.g0.N(18.0f), paint3);
                    }
                    rectF.set(rectF2);
                    float centerX = rectF.centerX();
                    float centerY = rectF.centerY();
                    rectF.left = org.telegram.messenger.g0.T1(centerX, rectF.left, A);
                    rectF.right = org.telegram.messenger.g0.T1(centerX, rectF.right, A);
                    rectF.top = org.telegram.messenger.g0.T1(centerY, rectF.top, A);
                    rectF.bottom = org.telegram.messenger.g0.T1(centerY, rectF.bottom, A);
                    l3Var = this.a;
                    if (l3Var != null) {
                        l3Var.p(0.0f, rectF2.centerY());
                        this.a.invalidate();
                    }
                    float f53 = 1.0f - f18;
                    rectF2.set((f27 - org.telegram.messenger.g0.N(6.0f)) - (org.telegram.messenger.g0.N(2.0f) * f53), f51 - (org.telegram.messenger.g0.N(2.0f) * f53), org.telegram.ui.Cells.f1.g(2.0f, f53, org.telegram.messenger.g0.L(6.0f) + i14), org.telegram.ui.Cells.f1.g(2.0f, f53, f51 + org.telegram.messenger.g0.L(12.0f)));
                    float f54 = rectF2.bottom;
                    float centerX2 = rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    canvas.save();
                    float i15 = Utilities.i(chatActivityEnterView2.q4 * 2.0f, 1.0f, 0.0f);
                    Paint paint4 = this.s;
                    int alpha = paint4.getAlpha();
                    float f55 = f14;
                    float f56 = f24;
                    f29 = f18;
                    Canvas canvas2 = canvas;
                    int saveLayerAlpha = canvas2.saveLayerAlpha(centerX2 - org.telegram.messenger.g0.L(24.0f), centerY2 - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f) + centerX2, org.telegram.messenger.g0.L(24.0f) + centerY2, (int) (alpha * (1.0f - i15)), 31);
                    Paint paint5 = this.w;
                    paint5.setAlpha(org.telegram.messenger.hs.e4);
                    paint4.setAlpha(org.telegram.messenger.hs.e4);
                    float f57 = 1.0f - L;
                    canvas2.translate(0.0f, org.telegram.messenger.g0.N(2.0f) * f57);
                    canvas2.rotate(f39, centerX2, centerY2);
                    if (f29 == 1.0f) {
                        RectF rectF3 = org.telegram.messenger.g0.P;
                        rectF3.set(0.0f, 0.0f, org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.N(8.0f));
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.ui.Cells.f1.g(2.0f, f57, f28 + f54));
                        canvas2.translate(f27 - org.telegram.messenger.g0.N(4.0f), (org.telegram.messenger.g0.N(2.0f) * chatActivityEnterView2.o4) + org.telegram.ui.Cells.f1.g(12.0f, f29, (rectF2.top - org.telegram.messenger.g0.L(6.0f)) - org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(2.0f), (1.0f - chatActivityEnterView2.p4) * org.telegram.messenger.g0.N(1.5f), L)));
                        if (f39 > 0.0f) {
                            canvas2.rotate(f39, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                        }
                        f30 = f53;
                        paint5 = paint5;
                        canvas2.drawLine(org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.N(4.0f), org.telegram.messenger.g0.N(8.0f), org.telegram.ui.Cells.f1.g(4.0f, f30, org.telegram.messenger.g0.N(6.0f)), paint5);
                        canvas.drawArc(rectF3, 0.0f, -180.0f, false, paint5);
                        canvas2 = canvas;
                        canvas2.drawLine(0.0f, org.telegram.messenger.g0.N(4.0f), 0.0f, com.google.android.recaptcha.internal.a.v(org.telegram.messenger.g0.N(4.0f), chatActivityEnterView2.o4, f57, (org.telegram.messenger.g0.N(4.0f) * chatActivityEnterView2.p4 * L * (!chatActivityEnterView2.t4 ? 1 : 0)) + org.telegram.messenger.g0.N(4.0f)), paint5);
                        canvas2.restore();
                        f31 = 0.0f;
                    } else {
                        f30 = f53;
                        f31 = 0.0f;
                    }
                    drawable = i15 <= f31 ? chatActivityEnterView2.d1 ? this.G : this.F : null;
                    if (f29 <= f31) {
                        if (this.T == null) {
                            paint = paint3;
                            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(3.0f), paint);
                        } else {
                            paint = paint3;
                        }
                        Path path2 = this.M;
                        path2.rewind();
                        RectF rectF4 = org.telegram.messenger.g0.P;
                        rectF4.set(rectF2);
                        rectF4.right = rectF2.centerX() - (org.telegram.messenger.g0.L(1.66f) * f29);
                        f32 = f30;
                        float W1 = org.telegram.messenger.g0.W1(f29, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(1.5f));
                        float[] fArr = this.N;
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
                        float[] fArr2 = this.O;
                        fArr2[5] = W12;
                        fArr2[4] = W12;
                        fArr2[3] = W12;
                        fArr2[2] = W12;
                        float L6 = org.telegram.messenger.g0.L(1.5f) * f29;
                        fArr2[7] = L6;
                        fArr2[6] = L6;
                        fArr2[1] = L6;
                        z10 = false;
                        fArr2[0] = L6;
                        path2.addRoundRect(rectF4, fArr2, direction);
                        canvas2.drawPath(path2, paint4);
                    } else {
                        chatActivityEnterView = chatActivityEnterView2;
                        f32 = f30;
                        paint = paint3;
                        z10 = false;
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
                    float L7 = (org.telegram.messenger.g0.L(38.0f) * d) + org.telegram.messenger.g0.T1(f55, getMeasuredHeight() - org.telegram.messenger.g0.L(118.0f), Math.max(chatActivityEnterView3.n4, Math.min(f56, chatActivityEnterView3.r4))) + f28;
                    rectF2.set(f27 - org.telegram.messenger.g0.N(18.0f), L7, org.telegram.messenger.g0.N(18.0f) + f27, L7 + f20);
                    uf ufVar = chatActivityEnterView3.a3;
                    z11 = (ufVar == null && ufVar.a1()) ? true : z10;
                    chatActivityEnterView3.Q = z11;
                    if (z11) {
                        return;
                    }
                    float N3 = org.telegram.messenger.g0.N(12.0f);
                    rectF2.set(rectF2.left, (rectF2.top - org.telegram.messenger.g0.N(36.0f)) - N3, rectF2.right, rectF2.top - N3);
                    gi.l3 l3Var2 = this.b;
                    if (l3Var2 != null) {
                        l3Var2.p(0.0f, rectF2.centerY());
                        this.b.invalidate();
                    }
                    this.K.set(rectF2);
                    canvas2.save();
                    float f58 = (1.0f - chatActivityEnterView3.n4) * chatActivityEnterView3.j4 * chatActivityEnterView3.r4 * chatActivityEnterView3.o4;
                    canvas2.scale(f58, f58, rectF2.centerX(), rectF2.centerY());
                    gh.g gVar2 = this.T;
                    if (gVar2 != null) {
                        gVar2.setBounds((int) (rectF2.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF2.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.bottom));
                        this.T.draw(canvas2);
                    } else {
                        chatActivityEnterView3.W3.setBounds((int) (rectF2.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF2.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF2.bottom));
                        chatActivityEnterView3.W3.draw(canvas2);
                        canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.N(18.0f), org.telegram.messenger.g0.N(18.0f), paint);
                    }
                    int i16 = (int) rectF2.left;
                    int i17 = (int) rectF2.top;
                    int i18 = (int) rectF2.right;
                    int i19 = (int) rectF2.bottom;
                    gi.l lVar = this.E;
                    lVar.setBounds(i16, i17, i18, i19);
                    lVar.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                f18 = f15;
                f19 = f13;
                f20 = f12;
                i10 = i3;
                float d10 = this.P.d(!chatActivityEnterView2.d1 && chatActivityEnterView2.j1 >= 59000);
                f21 = chatActivityEnterView2.q4;
                if (f21 != 0.0f) {
                }
                f22 = chatActivityEnterView2.n4;
                if (f22 == 0.0f) {
                }
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - chatActivityEnterView2.A1.getMeasuredHeight());
                f25 = 1.0f - chatActivityEnterView2.j4;
                if (f25 == 0.0f) {
                }
                if (chatActivityEnterView2.k4 >= 0.7f) {
                }
                chatActivityEnterView2.f4 = false;
                f26 = chatActivityEnterView2.r4;
                if (f26 != 0.0f) {
                }
                float N22 = org.telegram.messenger.g0.N(72.0f);
                float y92 = com.google.android.recaptcha.internal.a.y(1.0f, f25, org.telegram.messenger.g0.N(24.0f) * f24, N22 * f25);
                float f482 = chatActivityEnterView2.r4;
                float y102 = com.google.android.recaptcha.internal.a.y(1.0f, f482, N22, y92);
                if (y102 <= N22) {
                }
                float A2 = org.telegram.messenger.k5.A(1.0f, f23, (1.0f - d10) * chatActivityEnterView2.j4, f482);
                float f502 = i10;
                float f512 = f19 + f49;
                canvas.scale(A2, A2, f502, f512);
                float f522 = f14 + f49;
                int i142 = i10;
                rectF2.set(f502 - org.telegram.messenger.g0.N(18.0f), f522, org.telegram.messenger.g0.N(18.0f) + f502, f522 + f20);
                gVar = this.S;
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
                l3Var = this.a;
                if (l3Var != null) {
                }
                float f532 = 1.0f - f18;
                rectF2.set((f27 - org.telegram.messenger.g0.N(6.0f)) - (org.telegram.messenger.g0.N(2.0f) * f532), f512 - (org.telegram.messenger.g0.N(2.0f) * f532), org.telegram.ui.Cells.f1.g(2.0f, f532, org.telegram.messenger.g0.L(6.0f) + i142), org.telegram.ui.Cells.f1.g(2.0f, f532, f512 + org.telegram.messenger.g0.L(12.0f)));
                float f542 = rectF2.bottom;
                float centerX22 = rectF2.centerX();
                float centerY22 = rectF2.centerY();
                canvas.save();
                float i152 = Utilities.i(chatActivityEnterView2.q4 * 2.0f, 1.0f, 0.0f);
                Paint paint42 = this.s;
                int alpha2 = paint42.getAlpha();
                float f552 = f14;
                float f562 = f24;
                f29 = f18;
                Canvas canvas22 = canvas;
                int saveLayerAlpha2 = canvas22.saveLayerAlpha(centerX22 - org.telegram.messenger.g0.L(24.0f), centerY22 - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f) + centerX22, org.telegram.messenger.g0.L(24.0f) + centerY22, (int) (alpha2 * (1.0f - i152)), 31);
                Paint paint52 = this.w;
                paint52.setAlpha(org.telegram.messenger.hs.e4);
                paint42.setAlpha(org.telegram.messenger.hs.e4);
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
                float L72 = (org.telegram.messenger.g0.L(38.0f) * d10) + org.telegram.messenger.g0.T1(f552, getMeasuredHeight() - org.telegram.messenger.g0.L(118.0f), Math.max(chatActivityEnterView32.n4, Math.min(f562, chatActivityEnterView32.r4))) + f28;
                rectF2.set(f27 - org.telegram.messenger.g0.N(18.0f), L72, org.telegram.messenger.g0.N(18.0f) + f27, L72 + f20);
                uf ufVar2 = chatActivityEnterView32.a3;
                if (ufVar2 == null) {
                }
                chatActivityEnterView32.Q = z11;
                if (z11) {
                }
            }
        } else {
            f16 = 1.0f;
            i3 = measuredWidth;
        }
        f17 = 0.0f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int L = org.telegram.messenger.g0.L(250.0f);
        if (this.I != size) {
            this.I = size;
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
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i3) {
        return super.onSetAlpha(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.c0;
        RectF rectF = chatActivityEnterView.T3;
        int x10 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.K;
        int i3 = 0;
        if (action == 0) {
            if (chatActivityEnterView.t4) {
                this.b0 = rectF.contains(x10, y9);
            }
            if (chatActivityEnterView.Q && chatActivityEnterView.O1 != null && chatActivityEnterView.o4 > 0.1f) {
                this.a0 = rectF2.contains(x10, y9);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.b0 && rectF.contains(x10, y9)) {
                if (chatActivityEnterView.d1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.l1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.a3.Z0();
                } else {
                    vf vfVar = new vf(this, i3);
                    gi.l3 l3Var = this.a;
                    if (l3Var != null && l3Var.W) {
                        a();
                    }
                    mi0 mi0Var = chatActivityEnterView.i1;
                    if (mi0Var != null) {
                        mi0Var.setPlaying(false);
                    }
                    if (!MediaController.B().K() || (chatActivityEnterView.i1.getAudioLeft() <= 0.01f && chatActivityEnterView.i1.getAudioRight() >= 0.99f)) {
                        vfVar.run();
                    } else {
                        org.telegram.ui.lo loVar = new org.telegram.ui.lo(15, this, vfVar);
                        if (org.telegram.messenger.hp.e1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), chatActivityEnterView.X3);
                            String M0 = org.telegram.messenger.bd.M0(2131746356, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = M0;
                            s1Var.U = org.telegram.messenger.bd.M0(2131746357, null);
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new t(loVar, 19));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                        } else {
                            loVar.run();
                        }
                    }
                }
                this.a0 = false;
                this.b0 = false;
                return true;
            }
            if (this.a0 && rectF2.contains(x10, y9)) {
                boolean z10 = !chatActivityEnterView.P;
                chatActivityEnterView.P = z10;
                this.E.d(1, z10, true);
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(chatActivityEnterView.R);
                long j10 = chatActivityEnterView.R2;
                org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
                b02.e2(j10, (wmVar == null || !wmVar.w4) ? 0L : wmVar.b(), chatActivityEnterView.P);
                if (chatActivityEnterView.P) {
                    b();
                } else {
                    a();
                }
                invalidate();
                this.a0 = false;
                this.b0 = false;
                return true;
            }
            this.a0 = false;
            this.b0 = false;
        } else if (motionEvent.getAction() == 3) {
            this.a0 = false;
            this.b0 = false;
        }
        return this.b0 || this.a0;
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setBlurredBackgroundFactory(eh.c cVar) {
        this.R = true;
        if (this.Q == null) {
            this.Q = new hh.b(org.telegram.ui.ActionBar.k6.Oe, this.c0.X3);
        }
        gh.g c2 = cVar.c(this, this.Q, false);
        this.S = c2;
        c2.r(org.telegram.messenger.g0.L(18.0f));
        this.S.q(org.telegram.messenger.g0.L(3.0f));
        gh.g c10 = cVar.c(this, this.Q, false);
        this.T = c10;
        c10.r(org.telegram.messenger.g0.L(18.0f));
        this.T.q(org.telegram.messenger.g0.L(3.0f));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        TextPaint textPaint;
        Drawable drawable;
        Drawable drawable2;
        gi.l lVar = this.E;
        if (lVar == null || (textPaint = this.n) == null || (drawable = this.F) == null || (drawable2 = this.G) == null) {
            return;
        }
        hh.b bVar = this.Q;
        if (bVar != null) {
            bVar.d();
        }
        gh.g gVar = this.S;
        if (gVar != null) {
            gVar.updateColors();
        }
        gh.g gVar2 = this.T;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        int i3 = this.R ? org.telegram.ui.ActionBar.k6.Kl : org.telegram.ui.ActionBar.k6.Ne;
        ChatActivityEnterView chatActivityEnterView = this.c0;
        lVar.e(chatActivityEnterView.f0(i3), chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Rf), -1);
        textPaint.setColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.dg));
        ShapeDrawable shapeDrawable = this.c;
        if (shapeDrawable != null) {
            org.telegram.ui.ActionBar.k6.C1(chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.eg), shapeDrawable);
        } else {
            this.c = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.eg));
        }
        int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.eg);
        Drawable drawable3 = this.d;
        if (drawable3 != null && f02 != this.U) {
            this.U = f02;
            drawable3.setColorFilter(new PorterDuffColorFilter(f02, PorterDuff.Mode.SRC_IN));
        }
        this.r.setColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Oe));
        this.s.setColor(chatActivityEnterView.f0(this.R ? org.telegram.ui.ActionBar.k6.Kl : org.telegram.ui.ActionBar.k6.Ne));
        this.w.setColor(chatActivityEnterView.f0(this.R ? org.telegram.ui.ActionBar.k6.Kl : org.telegram.ui.ActionBar.k6.Ne));
        int f03 = chatActivityEnterView.f0(this.R ? org.telegram.ui.ActionBar.k6.Kl : org.telegram.ui.ActionBar.k6.Ne);
        if (this.W && f03 == this.V) {
            return;
        }
        this.W = true;
        this.V = f03;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(f03, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(f03, mode));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.E || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
