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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wf extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final vh.j D;
    public final Drawable E;
    public final Drawable F;
    public final vf G;
    public int H;
    public final RectF I;
    public final RectF J;
    public long K;
    public final Path L;
    public final float[] M;
    public final float[] N;
    public final t5 O;
    public wg.b P;
    public boolean Q;
    public vg.f R;
    public vg.f S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public vh.p2 a;
    public boolean a0;
    public vh.p2 b;
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
    public wf(ChatActivityEnterView chatActivityEnterView, Context context) {
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
        this.O = new t5(this, 0L, 350L, gr.h);
        vf vfVar = new vf(this, this);
        this.G = vfVar;
        r0.h0.j(this, vfVar);
        vh.j jVar = new vh.j(5);
        this.D = jVar;
        jVar.setCallback(this);
        jVar.d(1, chatActivityEnterView.O, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.V3 = drawable;
        org.telegram.ui.ActionBar.a7.y(this, drawable, org.telegram.ui.ActionBar.t6.Pe, chatActivityEnterView.W3, PorterDuff.Mode.MULTIPLY);
        this.c = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(5.0f), chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.eg));
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.e = org.telegram.messenger.cd.L0(2131745330, "SlideUpToLock");
        float L = org.telegram.messenger.i0.L(3.0f);
        float L2 = org.telegram.messenger.i0.L(3.0f);
        this.E = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.F = getResources().getDrawable(R.drawable.input_video).mutate();
        setWillNotDraw(false);
        updateColors();
    }

    public final void a() {
        vh.p2 p2Var = this.a;
        if (p2Var != null) {
            p2Var.l0 = new uf(this, p2Var, 1);
            p2Var.e(true);
            this.a = null;
        }
        vh.p2 p2Var2 = this.b;
        if (p2Var2 != null) {
            p2Var2.l0 = new uf(this, p2Var2, 2);
            p2Var2.e(true);
            this.b = null;
        }
    }

    public final void b() {
        a();
        vh.p2 p2Var = new vh.p2(getContext(), 2);
        this.b = p2Var;
        p2Var.l(1.0f, 0.0f);
        this.b.p(true);
        ChatActivityEnterView chatActivityEnterView = this.b0;
        this.b.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(chatActivityEnterView.c1 ? chatActivityEnterView.O ? 2131743608 : 2131743609 : chatActivityEnterView.O ? 2131743536 : 2131743537, null)));
        vh.p2 p2Var2 = this.b;
        p2Var2.h = vh.p2.a(p2Var2.getText(), this.b.getTextPaint());
        if (chatActivityEnterView.O) {
            vh.p2 p2Var3 = this.b;
            p2Var3.getClass();
            bi0 bi0Var = new bi0(R.raw.fire_on, org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(34.0f));
            bi0Var.start();
            p2Var3.j(bi0Var);
        } else {
            org.telegram.messenger.vp.d1().edit().putInt("voiceoncehint", org.telegram.messenger.vp.d1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.b, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 54.0f, 58.0f));
        vh.p2 p2Var4 = this.b;
        p2Var4.l0 = new uf(this, p2Var4, 0);
        p2Var4.u();
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
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i10;
        float f16;
        float f17;
        float f18;
        float f19;
        int i11;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        vg.f fVar;
        float f26;
        float f27;
        vh.p2 p2Var;
        float f28;
        float f29;
        float f30;
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView;
        float f31;
        Paint paint;
        boolean z10;
        boolean z11;
        float f32;
        float max;
        ChatActivityEnterView chatActivityEnterView2 = this.b0;
        RectF rectF = chatActivityEnterView2.S3;
        float f33 = chatActivityEnterView2.h4;
        float f34 = f33 <= 0.5f ? f33 / 0.5f : f33 <= 0.75f ? 1.0f - (((f33 - 0.5f) / 0.25f) * 0.1f) : (((f33 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        long currentTimeMillis = System.currentTimeMillis() - this.K;
        this.K = System.currentTimeMillis();
        float f35 = chatActivityEnterView2.l4;
        if (f35 != 10000.0f) {
            f7 = Math.max(0, (int) (chatActivityEnterView2.k4 - f35));
            if (f7 > org.telegram.messenger.i0.L(57.0f)) {
                f7 = org.telegram.messenger.i0.L(57.0f);
            }
        } else {
            f7 = 0.0f;
        }
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.M(26.0f);
        float L = 1.0f - (f7 / org.telegram.messenger.i0.L(57.0f));
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(194.0f);
        if (chatActivityEnterView2.s4) {
            float L2 = org.telegram.messenger.i0.L(36.0f);
            float d = org.telegram.ui.Cells.f1.d(14.0f, L, (((1.0f - f34) * org.telegram.messenger.i0.N(30.0f)) + (org.telegram.messenger.i0.L(60.0f) + measuredHeight)) - f7);
            float N = org.telegram.messenger.i0.N(2.0f) + (((L2 / 2.0f) + d) - org.telegram.messenger.i0.N(8.0f));
            float f36 = L > 0.4f ? 1.0f : L / 0.4f;
            float f37 = chatActivityEnterView2.n4;
            f10 = sc.e.z(1.0f, f36, f37 * 15.0f, (1.0f - L) * 9.0f * (1.0f - f37));
            f11 = L2;
            f12 = N;
            f13 = d;
            f14 = L;
        } else {
            float L3 = org.telegram.messenger.i0.L(36.0f) + ((int) (org.telegram.messenger.i0.L(14.0f) * L));
            float L4 = (chatActivityEnterView2.o4 * L * (-org.telegram.messenger.i0.L(8.0f))) + (((org.telegram.messenger.i0.L(60.0f) + measuredHeight) + ((int) ((1.0f - f34) * org.telegram.messenger.i0.L(30.0f)))) - ((int) f7));
            float d10 = org.telegram.ui.Cells.f1.d(2.0f, L, org.telegram.messenger.i0.N(2.0f) + (((L3 / 2.0f) + L4) - org.telegram.messenger.i0.N(8.0f)));
            f10 = (1.0f - L) * 9.0f;
            chatActivityEnterView2.n4 = 0.0f;
            f11 = L3;
            f12 = d10;
            f13 = L4;
            f14 = 0.0f;
        }
        float f38 = f10;
        boolean z12 = chatActivityEnterView2.e4;
        RectF rectF2 = this.I;
        if (z12) {
            f15 = 1.0f;
            i10 = measuredWidth;
            if (System.currentTimeMillis() - chatActivityEnterView2.f4 > 200) {
                f16 = 0.0f;
                if (L < 0.8f || chatActivityEnterView2.s4 || chatActivityEnterView2.m4 != f16 || chatActivityEnterView2.p4 != f16) {
                    chatActivityEnterView2.e4 = false;
                }
                if (chatActivityEnterView2.e4) {
                    float f39 = chatActivityEnterView2.g4;
                    if (f39 != f15) {
                        float f40 = (currentTimeMillis / 150.0f) + f39;
                        chatActivityEnterView2.g4 = f40;
                        if (f40 >= f15) {
                            chatActivityEnterView2.g4 = f15;
                            int i12 = org.telegram.messenger.tz.a;
                            SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                            int i13 = org.telegram.messenger.tz.O + 1;
                            org.telegram.messenger.tz.O = i13;
                            edit.putInt("lockRecordAudioVideoHint", i13);
                            edit.apply();
                        }
                    }
                } else {
                    float f41 = chatActivityEnterView2.g4 - (currentTimeMillis / 150.0f);
                    chatActivityEnterView2.g4 = f41;
                    if (f41 < 0.0f) {
                        chatActivityEnterView2.g4 = 0.0f;
                    }
                }
                int i14 = (int) (chatActivityEnterView2.g4 * 255.0f);
                this.c.setAlpha(i14);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(i14);
                this.n.setAlpha(i14);
                if (this.f != null) {
                    canvas.save();
                    f17 = f14;
                    rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.translate((getMeasuredWidth() - this.h) - org.telegram.messenger.i0.L(44.0f), org.telegram.messenger.i0.N(16.0f) + measuredHeight);
                    f18 = f12;
                    f19 = f11;
                    this.c.setBounds(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(2.0f), (int) (this.h + org.telegram.messenger.i0.L(36.0f)), (int) (org.telegram.messenger.i0.N(4.0f) + this.f.getHeight()));
                    this.c.draw(canvas);
                    this.f.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(getMeasuredWidth() - org.telegram.messenger.i0.L(26.0f), ((this.f.getHeight() / 2.0f) + (org.telegram.messenger.i0.N(17.0f) + measuredHeight)) - (org.telegram.messenger.i0.N(3.0f) * chatActivityEnterView2.o4));
                    Path path = this.x;
                    path.reset();
                    path.setLastPoint(-org.telegram.messenger.i0.N(5.0f), org.telegram.messenger.i0.N(4.0f));
                    path.lineTo(0.0f, 0.0f);
                    path.lineTo(org.telegram.messenger.i0.N(5.0f), org.telegram.messenger.i0.N(4.0f));
                    Paint paint2 = this.y;
                    paint2.setColor(-1);
                    paint2.setAlpha(i14);
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeCap(Paint.Cap.ROUND);
                    paint2.setStrokeJoin(Paint.Join.ROUND);
                    paint2.setStrokeWidth(org.telegram.messenger.i0.N(1.5f));
                    canvas.drawPath(path, paint2);
                    canvas.restore();
                    canvas.save();
                    i11 = i10;
                    drawable2.setBounds(i10 - (drawable2.getIntrinsicWidth() / 2), (int) (org.telegram.messenger.i0.N(20.0f) + this.f.getHeight() + measuredHeight), org.telegram.ui.Cells.f1.w(2, i11, drawable2), drawable2.getIntrinsicHeight() + ((int) (org.telegram.messenger.i0.N(20.0f) + this.f.getHeight() + measuredHeight)));
                    drawable2.draw(canvas);
                    canvas.restore();
                    float d11 = this.O.d(!chatActivityEnterView2.c1 && chatActivityEnterView2.i1 >= 59000);
                    f20 = chatActivityEnterView2.p4;
                    if (f20 != 0.0f || chatActivityEnterView2.h1 == null) {
                        f21 = chatActivityEnterView2.m4;
                        if (f21 == 0.0f) {
                            float f42 = f21 > 0.6f ? 1.0f : f21 / 0.6f;
                            if (!chatActivityEnterView2.g0) {
                                f21 = Math.max(0.0f, (f21 - 0.6f) / 0.4f);
                            }
                            gr grVar = gr.j;
                            float interpolation = grVar.getInterpolation(f42);
                            f22 = grVar.getInterpolation(f21);
                            f23 = interpolation;
                        } else {
                            f22 = 0.0f;
                            f23 = 0.0f;
                        }
                    } else {
                        float f43 = f20 > 0.38f ? 1.0f : f20 / 0.38f;
                        if (f20 > 0.63f) {
                            max = 1.0f;
                            f32 = 0.0f;
                        } else {
                            f32 = 0.0f;
                            max = Math.max(0.0f, (f20 - 0.38f) / 0.25f);
                        }
                        gr grVar2 = gr.j;
                        float interpolation2 = grVar2.getInterpolation(f43);
                        grVar2.getInterpolation(max);
                        f22 = f32;
                        f23 = interpolation2;
                    }
                    canvas.save();
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - chatActivityEnterView2.z1.getMeasuredHeight());
                    f24 = 1.0f - chatActivityEnterView2.i4;
                    if (f24 == 0.0f) {
                        f24 = f22 != 0.0f ? f22 : 0.0f;
                    }
                    if (chatActivityEnterView2.j4 >= 0.7f || chatActivityEnterView2.r4) {
                        chatActivityEnterView2.e4 = false;
                        f25 = chatActivityEnterView2.q4;
                        if (f25 != 0.0f) {
                            float f44 = f25 - 0.12f;
                            chatActivityEnterView2.q4 = f44;
                            if (f44 < 0.0f) {
                                chatActivityEnterView2.q4 = 0.0f;
                            }
                        }
                    } else {
                        float f45 = chatActivityEnterView2.q4;
                        if (f45 != 1.0f) {
                            float f46 = f45 + 0.12f;
                            chatActivityEnterView2.q4 = f46;
                            if (f46 > 1.0f) {
                                chatActivityEnterView2.q4 = 1.0f;
                            }
                        }
                    }
                    float N2 = org.telegram.messenger.i0.N(72.0f);
                    float z13 = c3.i0.z(1.0f, f24, org.telegram.messenger.i0.N(24.0f) * f23, N2 * f24);
                    float f47 = chatActivityEnterView2.q4;
                    float z14 = c3.i0.z(1.0f, f47, N2, z13);
                    float f48 = z14 <= N2 ? N2 : z14;
                    float A = org.telegram.messenger.m5.A(1.0f, f22, (1.0f - d11) * chatActivityEnterView2.i4, f47);
                    float f49 = i11;
                    float f50 = f18 + f48;
                    canvas.scale(A, A, f49, f50);
                    float f51 = f13 + f48;
                    int i15 = i11;
                    rectF2.set(f49 - org.telegram.messenger.i0.N(18.0f), f51, org.telegram.messenger.i0.N(18.0f) + f49, f51 + f19);
                    fVar = this.R;
                    Paint paint3 = this.r;
                    if (fVar == null) {
                        f26 = f49;
                        f27 = f48;
                        fVar.setBounds((int) (rectF2.left - org.telegram.messenger.i0.N(3.0f)), (int) (rectF2.top - org.telegram.messenger.i0.N(3.0f)), (int) (org.telegram.messenger.i0.N(3.0f) + rectF2.right), (int) (org.telegram.messenger.i0.N(3.0f) + rectF2.bottom));
                        this.R.draw(canvas);
                    } else {
                        f26 = f49;
                        f27 = f48;
                        chatActivityEnterView2.V3.setBounds((int) (rectF2.left - org.telegram.messenger.i0.N(3.0f)), (int) (rectF2.top - org.telegram.messenger.i0.N(3.0f)), (int) (org.telegram.messenger.i0.N(3.0f) + rectF2.right), (int) (org.telegram.messenger.i0.N(3.0f) + rectF2.bottom));
                        chatActivityEnterView2.V3.draw(canvas);
                        canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.N(18.0f), org.telegram.messenger.i0.N(18.0f), paint3);
                    }
                    rectF.set(rectF2);
                    float centerX = rectF.centerX();
                    float centerY = rectF.centerY();
                    rectF.left = org.telegram.messenger.i0.T1(centerX, rectF.left, A);
                    rectF.right = org.telegram.messenger.i0.T1(centerX, rectF.right, A);
                    rectF.top = org.telegram.messenger.i0.T1(centerY, rectF.top, A);
                    rectF.bottom = org.telegram.messenger.i0.T1(centerY, rectF.bottom, A);
                    p2Var = this.a;
                    if (p2Var != null) {
                        p2Var.m(0.0f, rectF2.centerY());
                        this.a.invalidate();
                    }
                    float f52 = 1.0f - f17;
                    rectF2.set((f26 - org.telegram.messenger.i0.N(6.0f)) - (org.telegram.messenger.i0.N(2.0f) * f52), f50 - (org.telegram.messenger.i0.N(2.0f) * f52), org.telegram.ui.Cells.f1.d(2.0f, f52, org.telegram.messenger.i0.L(6.0f) + i15), org.telegram.ui.Cells.f1.d(2.0f, f52, f50 + org.telegram.messenger.i0.L(12.0f)));
                    float f53 = rectF2.bottom;
                    float centerX2 = rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    canvas.save();
                    float i16 = Utilities.i(chatActivityEnterView2.p4 * 2.0f, 1.0f, 0.0f);
                    Paint paint4 = this.s;
                    int alpha = paint4.getAlpha();
                    float f54 = f13;
                    float f55 = f23;
                    f28 = f17;
                    Canvas canvas2 = canvas;
                    int saveLayerAlpha = canvas2.saveLayerAlpha(centerX2 - org.telegram.messenger.i0.L(24.0f), centerY2 - org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f) + centerX2, org.telegram.messenger.i0.L(24.0f) + centerY2, (int) (alpha * (1.0f - i16)), 31);
                    Paint paint5 = this.w;
                    paint5.setAlpha(org.telegram.messenger.zs.e4);
                    paint4.setAlpha(org.telegram.messenger.zs.e4);
                    float f56 = 1.0f - L;
                    canvas2.translate(0.0f, org.telegram.messenger.i0.N(2.0f) * f56);
                    canvas2.rotate(f38, centerX2, centerY2);
                    if (f28 == 1.0f) {
                        RectF rectF3 = org.telegram.messenger.i0.P;
                        rectF3.set(0.0f, 0.0f, org.telegram.messenger.i0.N(8.0f), org.telegram.messenger.i0.N(8.0f));
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.ui.Cells.f1.d(2.0f, f56, f27 + f53));
                        canvas2.translate(f26 - org.telegram.messenger.i0.N(4.0f), (org.telegram.messenger.i0.N(2.0f) * chatActivityEnterView2.n4) + org.telegram.ui.Cells.f1.d(12.0f, f28, (rectF2.top - org.telegram.messenger.i0.L(6.0f)) - org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(2.0f), (1.0f - chatActivityEnterView2.o4) * org.telegram.messenger.i0.N(1.5f), L)));
                        if (f38 > 0.0f) {
                            canvas2.rotate(f38, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
                        }
                        f29 = f52;
                        paint5 = paint5;
                        canvas2.drawLine(org.telegram.messenger.i0.N(8.0f), org.telegram.messenger.i0.N(4.0f), org.telegram.messenger.i0.N(8.0f), org.telegram.ui.Cells.f1.d(4.0f, f29, org.telegram.messenger.i0.N(6.0f)), paint5);
                        canvas.drawArc(rectF3, 0.0f, -180.0f, false, paint5);
                        canvas2 = canvas;
                        canvas2.drawLine(0.0f, org.telegram.messenger.i0.N(4.0f), 0.0f, c3.i0.u(org.telegram.messenger.i0.N(4.0f), chatActivityEnterView2.n4, f56, (org.telegram.messenger.i0.N(4.0f) * chatActivityEnterView2.o4 * L * (!chatActivityEnterView2.s4 ? 1 : 0)) + org.telegram.messenger.i0.N(4.0f)), paint5);
                        canvas2.restore();
                        f30 = 0.0f;
                    } else {
                        f29 = f52;
                        f30 = 0.0f;
                    }
                    drawable = i16 <= f30 ? chatActivityEnterView2.c1 ? this.F : this.E : null;
                    if (f28 <= f30) {
                        if (this.S == null) {
                            paint = paint3;
                            canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.N(3.0f), org.telegram.messenger.i0.N(3.0f), paint);
                        } else {
                            paint = paint3;
                        }
                        Path path2 = this.L;
                        path2.rewind();
                        RectF rectF4 = org.telegram.messenger.i0.P;
                        rectF4.set(rectF2);
                        rectF4.right = rectF2.centerX() - (org.telegram.messenger.i0.L(1.66f) * f28);
                        f31 = f29;
                        float W1 = org.telegram.messenger.i0.W1(f28, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(1.5f));
                        float[] fArr = this.M;
                        fArr[7] = W1;
                        fArr[6] = W1;
                        fArr[1] = W1;
                        fArr[0] = W1;
                        float L5 = org.telegram.messenger.i0.L(1.5f) * f28;
                        fArr[5] = L5;
                        fArr[4] = L5;
                        fArr[3] = L5;
                        fArr[2] = L5;
                        Path.Direction direction = Path.Direction.CW;
                        path2.addRoundRect(rectF4, fArr, direction);
                        rectF4.set(rectF2);
                        rectF4.left = (org.telegram.messenger.i0.L(1.66f) * f28) + rectF2.centerX();
                        chatActivityEnterView = chatActivityEnterView2;
                        float W12 = org.telegram.messenger.i0.W1(f28, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(1.5f));
                        float[] fArr2 = this.N;
                        fArr2[5] = W12;
                        fArr2[4] = W12;
                        fArr2[3] = W12;
                        fArr2[2] = W12;
                        float L6 = org.telegram.messenger.i0.L(1.5f) * f28;
                        fArr2[7] = L6;
                        fArr2[6] = L6;
                        fArr2[1] = L6;
                        z10 = false;
                        fArr2[0] = L6;
                        path2.addRoundRect(rectF4, fArr2, direction);
                        canvas2.drawPath(path2, paint4);
                    } else {
                        chatActivityEnterView = chatActivityEnterView2;
                        f31 = f29;
                        paint = paint3;
                        z10 = false;
                        canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.N(3.0f), org.telegram.messenger.i0.N(3.0f), paint4);
                    }
                    paint4.setAlpha(alpha);
                    paint5.setAlpha(alpha);
                    canvas2.restoreToCount(saveLayerAlpha);
                    if (drawable != null) {
                        Rect rect = org.telegram.messenger.i0.Q;
                        rect.set((int) (rectF2.centerX() - ((drawable.getIntrinsicWidth() / 2) * 0.9285f)), (int) (rectF2.centerY() - ((drawable.getIntrinsicHeight() / 2) * 0.9285f)), (int) (((drawable.getIntrinsicWidth() / 2) * 0.9285f) + rectF2.centerX()), (int) (((drawable.getIntrinsicHeight() / 2) * 0.9285f) + rectF2.centerY()));
                        drawable.setBounds(rect);
                        drawable.setAlpha((int) (i16 * 255.0f));
                        drawable.draw(canvas2);
                    }
                    if (f28 != 1.0f) {
                        canvas2.drawCircle(centerX2, centerY2, org.telegram.messenger.i0.N(2.0f) * f31, paint);
                    }
                    canvas2.restore();
                    canvas2.restore();
                    ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView;
                    float L7 = (org.telegram.messenger.i0.L(38.0f) * d11) + org.telegram.messenger.i0.T1(f54, getMeasuredHeight() - org.telegram.messenger.i0.L(118.0f), Math.max(chatActivityEnterView3.m4, Math.min(f55, chatActivityEnterView3.q4))) + f27;
                    rectF2.set(f26 - org.telegram.messenger.i0.N(18.0f), L7, org.telegram.messenger.i0.N(18.0f) + f26, L7 + f19);
                    sf sfVar = chatActivityEnterView3.Z2;
                    z11 = (sfVar == null && sfVar.Y0()) ? true : z10;
                    chatActivityEnterView3.P = z11;
                    if (z11) {
                        return;
                    }
                    float N3 = org.telegram.messenger.i0.N(12.0f);
                    rectF2.set(rectF2.left, (rectF2.top - org.telegram.messenger.i0.N(36.0f)) - N3, rectF2.right, rectF2.top - N3);
                    vh.p2 p2Var2 = this.b;
                    if (p2Var2 != null) {
                        p2Var2.m(0.0f, rectF2.centerY());
                        this.b.invalidate();
                    }
                    this.J.set(rectF2);
                    canvas2.save();
                    float f57 = (1.0f - chatActivityEnterView3.m4) * chatActivityEnterView3.i4 * chatActivityEnterView3.q4 * chatActivityEnterView3.n4;
                    canvas2.scale(f57, f57, rectF2.centerX(), rectF2.centerY());
                    vg.f fVar2 = this.S;
                    if (fVar2 != null) {
                        fVar2.setBounds((int) (rectF2.left - org.telegram.messenger.i0.N(3.0f)), (int) (rectF2.top - org.telegram.messenger.i0.N(3.0f)), (int) (org.telegram.messenger.i0.N(3.0f) + rectF2.right), (int) (org.telegram.messenger.i0.N(3.0f) + rectF2.bottom));
                        this.S.draw(canvas2);
                    } else {
                        chatActivityEnterView3.V3.setBounds((int) (rectF2.left - org.telegram.messenger.i0.N(3.0f)), (int) (rectF2.top - org.telegram.messenger.i0.N(3.0f)), (int) (org.telegram.messenger.i0.N(3.0f) + rectF2.right), (int) (org.telegram.messenger.i0.N(3.0f) + rectF2.bottom));
                        chatActivityEnterView3.V3.draw(canvas2);
                        canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.N(18.0f), org.telegram.messenger.i0.N(18.0f), paint);
                    }
                    int i17 = (int) rectF2.left;
                    int i18 = (int) rectF2.top;
                    int i19 = (int) rectF2.right;
                    int i20 = (int) rectF2.bottom;
                    vh.j jVar = this.D;
                    jVar.setBounds(i17, i18, i19, i20);
                    jVar.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                f17 = f14;
                f18 = f12;
                f19 = f11;
                i11 = i10;
                float d112 = this.O.d(!chatActivityEnterView2.c1 && chatActivityEnterView2.i1 >= 59000);
                f20 = chatActivityEnterView2.p4;
                if (f20 != 0.0f) {
                }
                f21 = chatActivityEnterView2.m4;
                if (f21 == 0.0f) {
                }
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - chatActivityEnterView2.z1.getMeasuredHeight());
                f24 = 1.0f - chatActivityEnterView2.i4;
                if (f24 == 0.0f) {
                }
                if (chatActivityEnterView2.j4 >= 0.7f) {
                }
                chatActivityEnterView2.e4 = false;
                f25 = chatActivityEnterView2.q4;
                if (f25 != 0.0f) {
                }
                float N22 = org.telegram.messenger.i0.N(72.0f);
                float z132 = c3.i0.z(1.0f, f24, org.telegram.messenger.i0.N(24.0f) * f23, N22 * f24);
                float f472 = chatActivityEnterView2.q4;
                float z142 = c3.i0.z(1.0f, f472, N22, z132);
                if (z142 <= N22) {
                }
                float A2 = org.telegram.messenger.m5.A(1.0f, f22, (1.0f - d112) * chatActivityEnterView2.i4, f472);
                float f492 = i11;
                float f502 = f18 + f48;
                canvas.scale(A2, A2, f492, f502);
                float f512 = f13 + f48;
                int i152 = i11;
                rectF2.set(f492 - org.telegram.messenger.i0.N(18.0f), f512, org.telegram.messenger.i0.N(18.0f) + f492, f512 + f19);
                fVar = this.R;
                Paint paint32 = this.r;
                if (fVar == null) {
                }
                rectF.set(rectF2);
                float centerX3 = rectF.centerX();
                float centerY3 = rectF.centerY();
                rectF.left = org.telegram.messenger.i0.T1(centerX3, rectF.left, A2);
                rectF.right = org.telegram.messenger.i0.T1(centerX3, rectF.right, A2);
                rectF.top = org.telegram.messenger.i0.T1(centerY3, rectF.top, A2);
                rectF.bottom = org.telegram.messenger.i0.T1(centerY3, rectF.bottom, A2);
                p2Var = this.a;
                if (p2Var != null) {
                }
                float f522 = 1.0f - f17;
                rectF2.set((f26 - org.telegram.messenger.i0.N(6.0f)) - (org.telegram.messenger.i0.N(2.0f) * f522), f502 - (org.telegram.messenger.i0.N(2.0f) * f522), org.telegram.ui.Cells.f1.d(2.0f, f522, org.telegram.messenger.i0.L(6.0f) + i152), org.telegram.ui.Cells.f1.d(2.0f, f522, f502 + org.telegram.messenger.i0.L(12.0f)));
                float f532 = rectF2.bottom;
                float centerX22 = rectF2.centerX();
                float centerY22 = rectF2.centerY();
                canvas.save();
                float i162 = Utilities.i(chatActivityEnterView2.p4 * 2.0f, 1.0f, 0.0f);
                Paint paint42 = this.s;
                int alpha2 = paint42.getAlpha();
                float f542 = f13;
                float f552 = f23;
                f28 = f17;
                Canvas canvas22 = canvas;
                int saveLayerAlpha2 = canvas22.saveLayerAlpha(centerX22 - org.telegram.messenger.i0.L(24.0f), centerY22 - org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f) + centerX22, org.telegram.messenger.i0.L(24.0f) + centerY22, (int) (alpha2 * (1.0f - i162)), 31);
                Paint paint52 = this.w;
                paint52.setAlpha(org.telegram.messenger.zs.e4);
                paint42.setAlpha(org.telegram.messenger.zs.e4);
                float f562 = 1.0f - L;
                canvas22.translate(0.0f, org.telegram.messenger.i0.N(2.0f) * f562);
                canvas22.rotate(f38, centerX22, centerY22);
                if (f28 == 1.0f) {
                }
                if (i162 <= f30) {
                }
                if (f28 <= f30) {
                }
                paint42.setAlpha(alpha2);
                paint52.setAlpha(alpha2);
                canvas22.restoreToCount(saveLayerAlpha2);
                if (drawable != null) {
                }
                if (f28 != 1.0f) {
                }
                canvas22.restore();
                canvas22.restore();
                ChatActivityEnterView chatActivityEnterView32 = chatActivityEnterView;
                float L72 = (org.telegram.messenger.i0.L(38.0f) * d112) + org.telegram.messenger.i0.T1(f542, getMeasuredHeight() - org.telegram.messenger.i0.L(118.0f), Math.max(chatActivityEnterView32.m4, Math.min(f552, chatActivityEnterView32.q4))) + f27;
                rectF2.set(f26 - org.telegram.messenger.i0.N(18.0f), L72, org.telegram.messenger.i0.N(18.0f) + f26, L72 + f19);
                sf sfVar2 = chatActivityEnterView32.Z2;
                if (sfVar2 == null) {
                }
                chatActivityEnterView32.P = z11;
                if (z11) {
                }
            }
        } else {
            f15 = 1.0f;
            i10 = measuredWidth;
        }
        f16 = 0.0f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(250.0f);
        if (this.H != size) {
            this.H = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.n, org.telegram.messenger.i0.L(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                float lineWidth = this.f.getLineWidth(i12);
                if (lineWidth > this.h) {
                    this.h = lineWidth;
                }
            }
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i10) {
        return super.onSetAlpha(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.b0;
        RectF rectF = chatActivityEnterView.S3;
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.J;
        int i10 = 0;
        if (action == 0) {
            if (chatActivityEnterView.s4) {
                this.a0 = rectF.contains(x10, y3);
            }
            if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.n4 > 0.1f) {
                this.W = rectF2.contains(x10, y3);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.a0 && rectF.contains(x10, y3)) {
                if (chatActivityEnterView.c1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.Z2.X0();
                } else {
                    tf tfVar = new tf(this, i10);
                    vh.p2 p2Var = this.a;
                    if (p2Var != null && p2Var.V) {
                        a();
                    }
                    nj0 nj0Var = chatActivityEnterView.h1;
                    if (nj0Var != null) {
                        nj0Var.setPlaying(false);
                    }
                    if (!MediaController.B().K() || (chatActivityEnterView.h1.getAudioLeft() <= 0.01f && chatActivityEnterView.h1.getAudioRight() >= 0.99f)) {
                        tfVar.run();
                    } else {
                        cd cdVar = new cd(4, this, tfVar);
                        if (org.telegram.messenger.vp.d1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), chatActivityEnterView.W3);
                            String L0 = org.telegram.messenger.cd.L0(2131746363, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            x1Var.T = org.telegram.messenger.cd.L0(2131746364, null);
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new t(cdVar, 19));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.p();
                        } else {
                            cdVar.run();
                        }
                    }
                }
                this.W = false;
                this.a0 = false;
                return true;
            }
            if (this.W && rectF2.contains(x10, y3)) {
                boolean z10 = !chatActivityEnterView.O;
                chatActivityEnterView.O = z10;
                this.D.d(1, z10, true);
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(chatActivityEnterView.Q);
                long j10 = chatActivityEnterView.Q2;
                org.telegram.ui.un unVar = chatActivityEnterView.P2;
                b02.e2(j10, (unVar == null || !unVar.v4) ? 0L : unVar.b(), chatActivityEnterView.O);
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
    public void setAlpha(float f7) {
        super.setAlpha(f7);
    }

    public void setBlurredBackgroundFactory(tg.b bVar) {
        this.Q = true;
        if (this.P == null) {
            this.P = new wg.b(org.telegram.ui.ActionBar.t6.Oe, this.b0.W3);
        }
        vg.f c10 = bVar.c(this, this.P, false);
        this.R = c10;
        c10.q(org.telegram.messenger.i0.L(18.0f));
        this.R.p(org.telegram.messenger.i0.L(3.0f));
        vg.f c11 = bVar.c(this, this.P, false);
        this.S = c11;
        c11.q(org.telegram.messenger.i0.L(18.0f));
        this.S.p(org.telegram.messenger.i0.L(3.0f));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        TextPaint textPaint;
        Drawable drawable;
        Drawable drawable2;
        vh.j jVar = this.D;
        if (jVar == null || (textPaint = this.n) == null || (drawable = this.E) == null || (drawable2 = this.F) == null) {
            return;
        }
        wg.b bVar = this.P;
        if (bVar != null) {
            bVar.d();
        }
        vg.f fVar = this.R;
        if (fVar != null) {
            fVar.updateColors();
        }
        vg.f fVar2 = this.S;
        if (fVar2 != null) {
            fVar2.updateColors();
        }
        int i10 = this.Q ? org.telegram.ui.ActionBar.t6.Kl : org.telegram.ui.ActionBar.t6.Ne;
        ChatActivityEnterView chatActivityEnterView = this.b0;
        jVar.e(chatActivityEnterView.e0(i10), chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.Rf), -1);
        textPaint.setColor(chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.dg));
        ShapeDrawable shapeDrawable = this.c;
        if (shapeDrawable != null) {
            org.telegram.ui.ActionBar.t6.C1(chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.eg), shapeDrawable);
        } else {
            this.c = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(5.0f), chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.eg));
        }
        int e02 = chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.eg);
        Drawable drawable3 = this.d;
        if (drawable3 != null && e02 != this.T) {
            this.T = e02;
            drawable3.setColorFilter(new PorterDuffColorFilter(e02, PorterDuff.Mode.SRC_IN));
        }
        this.r.setColor(chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.Oe));
        this.s.setColor(chatActivityEnterView.e0(this.Q ? org.telegram.ui.ActionBar.t6.Kl : org.telegram.ui.ActionBar.t6.Ne));
        this.w.setColor(chatActivityEnterView.e0(this.Q ? org.telegram.ui.ActionBar.t6.Kl : org.telegram.ui.ActionBar.t6.Ne));
        int e03 = chatActivityEnterView.e0(this.Q ? org.telegram.ui.ActionBar.t6.Kl : org.telegram.ui.ActionBar.t6.Ne);
        if (this.V && e03 == this.U) {
            return;
        }
        this.V = true;
        this.U = e03;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(e03, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(e03, mode));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.D || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
