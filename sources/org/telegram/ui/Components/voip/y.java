package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.u7;
import bi.wd;
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.w8;
import org.telegram.ui.c40;
import org.telegram.ui.z10;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class y extends FrameLayout implements m0 {
    public final s A0;
    public final Rect B0;
    public u7 C0;
    public final Paint D;
    public int D0;
    public boolean E;
    public int E0;
    public final r3 F;
    public int F0;
    public final c40 G;
    public ValueAnimator G0;
    public boolean H;
    public int H0;
    public float I;
    public int I0;
    public final FrameLayout J;
    public ValueAnimator J0;
    public final int K;
    public boolean K0;
    public final k5 L;
    public int M;
    public final org.telegram.ui.ActionBar.m2 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final ch0 U;
    public final ImageView V;
    public boolean W;
    public final u a;
    public float a0;
    public boolean b;
    public final x b0;
    public r c;
    public ValueAnimator c0;
    public h10 d;
    public boolean d0;
    public r e;
    public float e0;
    public boolean f;
    public float f0;
    public float g0;
    public boolean h;
    public float h0;
    public float i0;
    public boolean j0;
    public float k0;
    public final ImageReceiver l0;
    public final ArrayList m0;
    public boolean n;
    public n0 n0;
    public boolean o0;
    public float p0;
    public Bitmap q0;
    public boolean r;
    public Paint r0;
    public boolean s;
    public boolean s0;
    public float t0;
    public final uq u0;
    public final Drawable v0;
    public boolean w;
    public float w0;
    public s3 x;
    public ImageView x0;
    public final k0 y;
    public boolean y0;
    public boolean z0;

    public y(k0 k0Var, r3 r3Var, c40 c40Var) {
        super(k0Var.getContext());
        this.D = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.a0 = 1.0f;
        this.l0 = new ImageReceiver(null);
        this.m0 = new ArrayList();
        this.A0 = new s(this, 1);
        this.B0 = new Rect();
        this.F = r3Var;
        int i7 = c40Var.a;
        this.K = i7;
        uq uqVar = new uq(k0Var.getContext(), R.drawable.calls_video, -1);
        this.u0 = uqVar;
        uqVar.a(true, false);
        float f10 = -org.telegram.messenger.g0.L(4.0f);
        float L = org.telegram.messenger.g0.L(6.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        uqVar.i = f10;
        uqVar.j = L;
        uqVar.k = L2;
        uqVar.invalidateSelf();
        float N = org.telegram.messenger.g0.N(3.4f);
        uqVar.c.setStrokeWidth(N);
        uqVar.d.setStrokeWidth(N * 1.47f);
        this.v0 = k0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setColor(-1);
        String M0 = id.M0(2131743227, null);
        String M02 = id.M0(2131743224, null);
        int L3 = org.telegram.messenger.g0.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(M02, textPaint, L3, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat M03 = qp.s1(i7).M0(Long.valueOf(r3Var.c));
        StaticLayout staticLayout2 = new StaticLayout(id.a0("VoipVideoNotAvailable", null, 2131743229, id.G(qp.s1(i7).Z3, "Participants", new Object[0])), textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
        String M04 = id.M0(2131743225, null);
        u uVar = new u(this, k0Var.getContext(), r3Var, k0Var, textPaint, staticLayout2, textPaint2, M04, textPaint2.measureText(M04), staticLayout, c40Var, M0, textPaint.measureText(M0));
        this.a = uVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        j2 j2Var = uVar.d;
        j2Var.setScalingType(scalingType);
        this.y = k0Var;
        this.G = c40Var;
        j2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new v(this));
        TextureView textureView = uVar.e;
        if (textureView != null) {
            j2Var.setBackgroundRenderer(textureView);
            if (!j2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        j2Var.setAlpha(0.0f);
        addView(uVar);
        x xVar = new x(this, getContext());
        this.b0 = xVar;
        addView(xVar);
        k5 k5Var = new k5(k0Var.getContext());
        this.L = k5Var;
        k5Var.setTextSize(13);
        k5Var.setTextColor(i0.a.o(-1, qs.F3));
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setFullTextMaxLines(1);
        k5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
        this.J = frameLayout;
        frameLayout.addView(k5Var, ha.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, ha.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(k6.x0(null, k6.eh, false));
        frameLayout.setClipChildren(false);
        ch0 ch0Var = new ch0(k0Var.getContext());
        this.U = ch0Var;
        addView(ch0Var, ha.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView = new ImageView(k0Var.getContext());
        this.V = imageView;
        addView(imageView, ha.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        imageView.setImageDrawable(k0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L4 = org.telegram.messenger.g0.L(19.0f);
        int o4 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = k6.k0(L4, L4, L4, L4, 0, o4, o4);
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(4, k0Var.getContext(), this);
        this.N = m2Var;
        m2Var.setText(id.M0(2131743223, null));
        m2Var.setTextSize(1, 15.0f);
        m2Var.setTypeface(org.telegram.messenger.g0.o());
        m2Var.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        m2Var.setTextColor(-1);
        m2Var.setBackground(k02);
        m2Var.setGravity(17);
        m2Var.setOnClickListener(new ii.g(this, 17));
        addView(m2Var, ha.e(-2, 38, 51));
        TextView textView = new TextView(k0Var.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        r6.V(textView, k6.ch, null);
        textView.setBackground(k02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (t3.w(14, M03)) {
            textView.setText(org.telegram.messenger.g0.X2(id.M0(2131748164, null)));
        } else {
            org.telegram.messenger.k5.r("NoRtmpStreamFromAppViewer", null, 2131748163, new Object[]{M03.title}, textView);
        }
        addView(textView, ha.e(-2, -2, 51));
    }

    public static y c(ArrayList arrayList, z10 z10Var, r rVar, h10 h10Var, r rVar2, s3 s3Var, r3 r3Var, c40 c40Var) {
        y yVar;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                yVar = null;
                break;
            }
            if (s3Var.equals(((y) arrayList.get(i7)).x)) {
                yVar = (y) arrayList.get(i7);
                break;
            }
            i7++;
        }
        if (yVar == null) {
            yVar = new y(z10Var, r3Var, c40Var);
        }
        if (rVar != null) {
            yVar.setPrimaryView(rVar);
        }
        if (h10Var != null) {
            yVar.setSecondaryView(h10Var);
        }
        if (rVar2 != null) {
            yVar.setTabletGridView(rVar2);
        }
        return yVar;
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final void a() {
        invalidate();
        k(true);
        x xVar = this.b0;
        if (xVar.getVisibility() == 0) {
            x.a(xVar, true);
        }
    }

    public final void b(boolean z9) {
        this.P = true;
        this.w = false;
        this.y.f(this);
        if (z9) {
            if (this.x.a.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                }
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                s3 s3Var = this.x;
                sharedInstance.removeRemoteSink(s3Var.a, s3Var.b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c0.cancel();
        }
        this.a.d.release();
    }

    public final void d() {
        if (this.q0 != null) {
            return;
        }
        HashMap hashMap = this.F.h;
        s3 s3Var = this.x;
        boolean z9 = s3Var.b;
        TLRPC.GroupCallParticipant groupCallParticipant = s3Var.a;
        Bitmap bitmap = (Bitmap) hashMap.get(z9 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        this.q0 = bitmap;
        this.a.setThumb(bitmap);
        if (this.q0 == null) {
            long C1 = ij.C1(this.x.a.peer);
            s3 s3Var2 = this.x;
            boolean z10 = s3Var2.a.self;
            ImageReceiver imageReceiver = this.l0;
            if (z10 && s3Var2.b) {
                imageReceiver.w0(new qa0(true, -14602694, -13935795, -14395293, -14203560));
                return;
            }
            int i7 = this.K;
            if (C1 > 0) {
                TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(C1));
                hc l10 = hc.l(i7, 1, a22);
                int d = a22 != null ? w8.d(a22.id) : i0.a.f(0.2f, -16777216, -1);
                imageReceiver.q0(l10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d, -16777216), i0.a.f(0.4f, d, -16777216)}), null, a22, 0);
                return;
            }
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-C1));
            hc a10 = hc.a(1, M0);
            int d2 = M0 != null ? w8.d(M0.id) : i0.a.f(0.2f, -16777216, -1);
            imageReceiver.q0(a10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d2, -16777216), i0.a.f(0.4f, d2, -16777216)}), null, M0, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z9 = this.w;
        k0 k0Var = this.y;
        u uVar = this.a;
        if (z9) {
            float y10 = (uVar.getY() + uVar.getMeasuredHeight()) - uVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y10 - frameLayout.getMeasuredHeight()) + this.p0;
            boolean z10 = this.h;
            ch0 ch0Var = this.U;
            if (z10 || this.f) {
                frameLayout.setAlpha(1.0f - k0Var.n);
                ch0Var.setAlpha(1.0f - k0Var.n);
            } else if (this.b || this.r) {
                if (!c40.w5 && !c40.x5) {
                    measuredHeight = com.google.android.recaptcha.internal.a.v(1.0f, k0Var.W, org.telegram.messenger.g0.L(90.0f) * k0Var.c, measuredHeight);
                }
                frameLayout.setAlpha(1.0f);
                ch0Var.setAlpha(1.0f);
            } else if (this.d != null) {
                frameLayout.setAlpha(1.0f - k0Var.c);
                ch0Var.setAlpha(1.0f - k0Var.c);
            } else {
                frameLayout.setAlpha(1.0f);
                ch0Var.setAlpha(1.0f);
            }
            boolean z11 = this.b;
            k5 k5Var = this.L;
            if (z11 || this.r) {
                k5Var.setFullAlpha(k0Var.c);
            } else {
                k5Var.setFullAlpha(0.0f);
            }
            ch0Var.setTranslationX(frameLayout.getX());
            ch0Var.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((uVar.getMeasuredWidth() - (uVar.O * 2.0f)) - org.telegram.messenger.g0.L(32.0f));
                imageView.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - k0Var.c, 1.0f - k0Var.n));
            }
            frameLayout.setTranslationY(measuredHeight);
            frameLayout.setTranslationX(this.y0 ? 0.0f : org.telegram.messenger.g0.L(6.0f) * k0Var.c);
        }
        super.dispatchDraw(canvas);
        if (this.w) {
            n0 n0Var = this.n0;
            if (n0Var != null) {
                boolean z12 = n0Var.e;
                if (z12) {
                    float f10 = this.S;
                    if (f10 != 1.0f) {
                        float f11 = f10 + 0.053333335f;
                        this.S = f11;
                        if (f11 > 1.0f) {
                            this.S = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                if (!z12) {
                    float f12 = this.S;
                    if (f12 != 0.0f) {
                        float f13 = f12 - 0.053333335f;
                        this.S = f13;
                        if (f13 < 0.0f) {
                            this.S = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f14 = this.S;
            float f15 = (1.0f - k0Var.n) * (1.0f - k0Var.c) * f14;
            if (f14 > 0.0f) {
                int i7 = (int) (f15 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i7);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(uVar.getX() + uVar.O, uVar.getY() + uVar.N, (uVar.getX() + uVar.getMeasuredWidth()) - uVar.O, (uVar.getY() + uVar.getMeasuredHeight()) - uVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.p0);
                float f16 = uVar.b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.o0 || (view != this.a && view != this.b0)) {
            return super.drawChild(canvas, view, j3);
        }
        float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        canvas.translate(0.0f, this.p0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        this.a.d.release();
        n0 n0Var = this.n0;
        if (n0Var != null) {
            this.G.k4.add(n0Var);
            this.n0.b();
            n0 n0Var2 = this.n0;
            n0Var2.c = null;
            n0Var2.c(false);
        }
        this.n0 = null;
    }

    public final void f() {
        if (this.x != null) {
            u uVar = this.a;
            j2 j2Var = uVar.d;
            j2 j2Var2 = uVar.d;
            if (j2Var.getMeasuredHeight() == 0 || j2Var2.getMeasuredWidth() == 0) {
                return;
            }
            j2Var2.getRenderBufferBitmap(new m3(this, 1));
        }
    }

    public final void g(boolean z9, boolean z10) {
        if (this.n != z9) {
            this.n = z9;
            j(!(this.c == null && this.e == null) && z10);
        }
    }

    public String getName() {
        long C1 = ij.C1(this.x.a.peer);
        return m5.E(C1) ? t10.p(qp.s1(org.telegram.messenger.c.a(p10.s0).a).a2(Long.valueOf(C1))) : qp.s1(org.telegram.messenger.c.a(p10.s0).a).M0(Long.valueOf(-C1)).title;
    }

    public r getPrimaryView() {
        return this.c;
    }

    public final void h(boolean z9, boolean z10) {
        if (this.b != z9) {
            this.b = z9;
            this.R = true;
            j(z10);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z9) {
        if (this.e0 == f10 && this.f0 == f11 && this.g0 == f12 && this.h0 == f13 && this.i0 == f14) {
            return;
        }
        this.j0 = z9;
        this.e0 = f10;
        this.f0 = f11;
        this.g0 = f12;
        this.h0 = f13;
        this.i0 = f14;
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.a.invalidate();
        }
        r rVar = this.c;
        if (rVar != null) {
            rVar.invalidate();
            c40 c40Var = this.G;
            if (c40Var.O4 == this.c) {
                c40Var.b.invalidate();
            }
        }
        h10 h10Var = this.d;
        if (h10Var != null) {
            h10Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:336:0x01d9, code lost:
    
        if (r2 != false) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x066e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0393  */
    /* JADX WARN: Type inference failed for: r6v18, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z9) {
        boolean z10;
        boolean z11;
        s3 s3Var;
        s3 s3Var2;
        boolean z12;
        boolean z13;
        float f10;
        int i7;
        boolean z14;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        s3 s3Var3;
        boolean z15;
        j2 j2Var;
        boolean C;
        x xVar;
        long C1;
        hc a10;
        hc a11;
        TLRPC.Chat chat;
        boolean z16;
        Drawable C2;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        boolean z17;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        ValueAnimator valueAnimator;
        s3 s3Var4;
        r rVar;
        if (this.P) {
            return;
        }
        r3 r3Var = this.F;
        int i10 = 0;
        if (r3Var.b.rtmp_stream) {
            int L = org.telegram.messenger.g0.L(this.b ? 36.0f : 21.0f);
            this.O.setPadding(L, 0, L, 0);
        }
        if (this.x == null && ((rVar = this.c) != null || this.d != null || this.e != null)) {
            if (rVar != null) {
                this.x = rVar.getParticipant();
            } else {
                r rVar2 = this.e;
                if (rVar2 != null) {
                    this.x = rVar2.getParticipant();
                } else {
                    this.x = this.d.getVideoParticipant();
                }
            }
        }
        boolean z18 = this.w;
        ch0 ch0Var = this.U;
        k0 k0Var = this.y;
        String str = null;
        u uVar = this.a;
        int i11 = 1;
        if (z18 && !this.b) {
            boolean z19 = VoIPService.getSharedInstance() == null;
            if (c40.z5 || (s3Var4 = this.x) == null || (this.d == null && (!r3.C(s3Var4.a, s3Var4.b, r3Var) || (!r3Var.x && this.x != r3Var.z)))) {
                z19 = true;
            }
            if (z19 || (this.c == null && this.d == null && this.e == null && !this.h && !this.f)) {
                this.w = false;
                f();
                boolean z20 = iz.o() <= 0;
                if (uVar.b0 == null && z19) {
                    if (z20) {
                        k0Var.f(this);
                    }
                    animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new ai.g0(this, this, z20, 9)).setDuration(150L).start();
                } else {
                    if (k0Var.s) {
                        u7 u7Var = this.C0;
                        if (u7Var != null) {
                            org.telegram.messenger.g0.r(u7Var);
                            this.C0 = null;
                        }
                        u7 u7Var2 = new u7(this, z20, this, 26);
                        this.C0 = u7Var2;
                        org.telegram.messenger.g0.h3(u7Var2);
                    } else {
                        if (z20) {
                            k0Var.removeView(this);
                        }
                        setVisibility(8);
                    }
                    if (z20) {
                        k0Var.f(this);
                        e();
                    }
                }
                if (this.x.a.self) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                    }
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    s3 s3Var5 = this.x;
                    sharedInstance.removeRemoteSink(s3Var5.a, s3Var5.b);
                }
                invalidate();
                ValueAnimator valueAnimator2 = this.c0;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    this.c0.cancel();
                }
            }
        } else if (!z18) {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            r rVar3 = this.c;
            if (rVar3 != null || this.d != null || this.e != null || this.b) {
                if (rVar3 != null) {
                    this.x = rVar3.getParticipant();
                } else {
                    h10 h10Var = this.d;
                    if (h10Var != null) {
                        this.x = h10Var.getVideoParticipant();
                    } else {
                        r rVar4 = this.e;
                        if (rVar4 != null) {
                            this.x = rVar4.getParticipant();
                        }
                    }
                }
                s3 s3Var6 = this.x;
                TLRPC.GroupCallParticipant groupCallParticipant = s3Var6.a;
                boolean z21 = !groupCallParticipant.self ? !((r3Var.x || s3Var6 == r3Var.z) && r3.C(groupCallParticipant, s3Var6.b, r3Var)) : !(VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(this.x.b) == 2);
                if (!this.b) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    s3 s3Var7 = this.x;
                    if (!sharedInstance2.isFullscreen(s3Var7.a, s3Var7.b)) {
                        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                        s3 s3Var8 = this.x;
                        if (!sharedInstance3.isFullscreen(s3Var8.a, s3Var8.b)) {
                        }
                    }
                }
                this.w = true;
                c40 c40Var = this.G;
                if (c40Var.k4.size() > 0) {
                    this.n0 = (n0) org.telegram.ui.Cells.f1.k(1, c40Var.k4);
                } else {
                    this.n0 = new n0();
                }
                n0 n0Var = this.n0;
                n0Var.g = this;
                n0Var.c = ch0Var;
                n0Var.c(false);
                k(false);
                u7 u7Var3 = this.C0;
                if (u7Var3 != null) {
                    org.telegram.messenger.g0.r(u7Var3);
                    this.C0 = null;
                }
                if (getParent() == null) {
                    k0Var.addView(this, ha.e(46, 46, 51));
                    k0Var.H.add(this);
                    long C12 = ij.C1(this.x.a.peer);
                    LongSparseIntArray longSparseIntArray = k0Var.x;
                    longSparseIntArray.put(C12, longSparseIntArray.get(C12, 0) + 1);
                    setVisibility(0);
                } else if (getVisibility() == 8) {
                    setVisibility(0);
                }
                this.R = true;
                this.E = false;
                animate().setListener(null).cancel();
                if (uVar.b0 != null || this.d == null || this.c != null || uVar.D == 1.0f) {
                    setScaleY(1.0f);
                    setScaleX(1.0f);
                    setAlpha(1.0f);
                } else {
                    setScaleX(0.5f);
                    setScaleY(0.5f);
                    setAlpha(0.0f);
                    this.E = true;
                    invalidate();
                    animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(new w(this, i10)).setDuration(100L).start();
                    invalidate();
                }
                d();
                this.V.setVisibility((!this.x.b || r3Var.b.rtmp_stream) ? 8 : 0);
                z10 = false;
                z11 = true;
                s3Var = this.x;
                s3Var2 = r3Var.z;
                k5 k5Var = this.L;
                if (s3Var != s3Var2) {
                    if (k5Var.getVisibility() != 4) {
                        k5Var.setVisibility(4);
                        ch0Var.setVisibility(4);
                    }
                } else if (k5Var.getVisibility() != 0) {
                    k5Var.setVisibility(0);
                    ch0Var.setVisibility(0);
                }
                z12 = this.w;
                int i12 = this.K;
                if (z12) {
                    boolean z22 = c40.x5 && (!k0Var.b || (this.d == null && this.c == null));
                    if (!this.b) {
                        h10 h10Var2 = this.d;
                        if (h10Var2 == null || this.c != null || k0Var.b) {
                            if (!this.h) {
                                if (h10Var2 == null || this.c != null) {
                                    r rVar5 = this.e;
                                    if (rVar5 == null || !z22) {
                                        r rVar6 = this.c;
                                        if ((rVar6 == null || h10Var2 != null) && this.n) {
                                            if (rVar6 != null) {
                                                i7 = org.telegram.messenger.g0.L(80.0f);
                                            }
                                        } else if (rVar6 != null) {
                                            z13 = false;
                                            f10 = rVar6.a;
                                            z14 = true;
                                        } else {
                                            i7 = org.telegram.messenger.g0.L(46.0f);
                                        }
                                    } else {
                                        float f11 = rVar5.a;
                                        z13 = rVar5.b.e.size();
                                        z14 = true;
                                        f10 = f11;
                                    }
                                    i7 = -1;
                                    marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                    if (i7 != 0 && (marginLayoutParams.height != i7 || z11 || this.H != z14 || ((z14 && this.I != f10) || z13))) {
                                        marginLayoutParams.height = i7;
                                        if (z14) {
                                            i7 = -1;
                                        }
                                        marginLayoutParams.width = i7;
                                        this.H = z14;
                                        this.I = f10;
                                        this.R = true;
                                        if (z10) {
                                            uVar.requestLayout();
                                        } else {
                                            uVar.a();
                                            this.s = true;
                                        }
                                        org.telegram.messenger.g0.h3(new s(this, i10));
                                        k0Var.requestLayout();
                                        invalidate();
                                    }
                                    s3Var3 = this.x;
                                    if (s3Var3.a.self || s3Var3.b || VoIPService.getSharedInstance() == null) {
                                        j2 j2Var2 = uVar.d;
                                        j2 j2Var3 = uVar.d;
                                        j2Var2.setMirror(false);
                                        j2Var3.setRotateTextureWithScreen(true);
                                        j2Var3.setUseCameraRotation(false);
                                    } else {
                                        j2 j2Var4 = uVar.d;
                                        j2 j2Var5 = uVar.d;
                                        j2Var4.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
                                        j2Var5.setRotateTextureWithScreen(true);
                                        j2Var5.setUseCameraRotation(true);
                                    }
                                    z15 = uVar.a;
                                    j2Var = uVar.d;
                                    if (!z15) {
                                        ((WindowManager) uVar.getContext().getSystemService("window")).getDefaultDisplay();
                                    }
                                    if (this.x.a.self) {
                                        j2Var.setMaxTextureSize(0);
                                    } else {
                                        j2Var.setMaxTextureSize(720);
                                    }
                                    s3 s3Var9 = this.x;
                                    C = r3.C(s3Var9.a, s3Var9.b, r3Var);
                                    xVar = this.b0;
                                    if (C || !(r3Var.x || this.x == r3Var.z)) {
                                        ImageReceiver imageReceiver = xVar.a;
                                        w8 w8Var = xVar.c;
                                        imageReceiver.d = i12;
                                        C1 = ij.C1(this.x.a.peer);
                                        if (m5.E(C1)) {
                                            TLRPC.Chat M0 = qp.s1(org.telegram.messenger.c.a(p10.s0).a).M0(Long.valueOf(-C1));
                                            w8Var.q(M0);
                                            a10 = hc.a(0, M0);
                                            a11 = hc.a(1, M0);
                                            chat = M0;
                                        } else {
                                            TLRPC.User a22 = qp.s1(org.telegram.messenger.c.a(i12).a).a2(Long.valueOf(C1));
                                            w8Var.r(a22);
                                            a10 = hc.l(i12, 0, a22);
                                            a11 = hc.l(i12, 1, a22);
                                            chat = a22;
                                        }
                                        TLRPC.Chat chat2 = chat;
                                        hc hcVar = a10;
                                        xVar.a.q0(hcVar, null, (a11 != null || (C2 = gc.D().C(a11.f)) == null) ? w8Var : C2, null, chat2, 0);
                                        xVar.b.q0(hcVar, "50_50_b", new ColorDrawable(k6.x0(null, k6.hh, false)), null, chat2, 0);
                                        z16 = false;
                                    } else {
                                        z16 = true;
                                    }
                                    boolean z23 = (z10 || this.d == null || this.b || z16) ? false : true;
                                    if (z16 != this.W && !z23) {
                                        this.W = z16;
                                        valueAnimator = this.c0;
                                        if (valueAnimator != null) {
                                            valueAnimator.removeAllListeners();
                                            this.c0.cancel();
                                        }
                                        if (z10) {
                                            boolean z24 = this.W;
                                            this.a0 = z24 ? 0.0f : 1.0f;
                                            xVar.setVisibility(z24 ? 8 : 0);
                                            xVar.setAlpha(this.a0);
                                            uVar.invalidate();
                                        } else {
                                            if (!this.W && xVar.getVisibility() != 0) {
                                                xVar.setVisibility(0);
                                                xVar.setAlpha(0.0f);
                                            }
                                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, this.W ? 0.0f : 1.0f);
                                            this.c0 = ofFloat;
                                            ofFloat.addUpdateListener(new t(this, i10));
                                            this.c0.addListener(new w(this, i11));
                                            this.c0.start();
                                        }
                                        if (this.W) {
                                            x.a(xVar, false);
                                        }
                                    }
                                    if (this.x.a.self && VoIPService.getSharedInstance() != null) {
                                        VoIPService.getSharedInstance().setLocalSink(j2Var, this.x.b);
                                    }
                                    n0 n0Var2 = this.n0;
                                    n0Var2.h = this.x.a;
                                    n0Var2.c(z10);
                                    if (xVar.getVisibility() == 0) {
                                        x.a(xVar, true);
                                    }
                                    s3 s3Var10 = this.x;
                                    z17 = s3Var10.b ? !((tL_groupCallParticipantVideo = s3Var10.a.video) == null || !tL_groupCallParticipantVideo.paused) : !((tL_groupCallParticipantVideo2 = s3Var10.a.presentation) == null || !tL_groupCallParticipantVideo2.paused);
                                    if (this.s0 != z17) {
                                        this.s0 = z17;
                                        j2Var.animate().alpha(this.s0 ? 0.0f : 1.0f).setDuration(250L).start();
                                        uVar.invalidate();
                                    }
                                    if (c40.z5 && this.W) {
                                        if (!j2Var.isFirstFrameRendered()) {
                                            d();
                                        }
                                        if (this.x.a.self) {
                                            if (VoIPService.getSharedInstance() != null) {
                                                VoIPService.getSharedInstance().setLocalSink(j2Var, this.x.b);
                                            }
                                        } else if (VoIPService.getSharedInstance() != null) {
                                            VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                                            s3 s3Var11 = this.x;
                                            sharedInstance4.addRemoteSink(s3Var11.a, s3Var11.b, j2Var, null);
                                            VoIPService sharedInstance5 = VoIPService.getSharedInstance();
                                            s3 s3Var12 = this.x;
                                            sharedInstance5.addRemoteSink(s3Var12.a, s3Var12.b, j2Var, null);
                                            if (r3Var.b.rtmp_stream && !j2Var.isFirstFrameRendered() && !this.z0) {
                                                org.telegram.messenger.g0.i3(this.A0, 15000L);
                                                this.z0 = true;
                                            }
                                        }
                                        str = null;
                                    } else {
                                        if (this.x.a.self) {
                                            str = null;
                                            if (VoIPService.getSharedInstance() != null) {
                                                VoIPService sharedInstance6 = VoIPService.getSharedInstance();
                                                s3 s3Var13 = this.x;
                                                sharedInstance6.removeRemoteSink(s3Var13.a, s3Var13.b);
                                                VoIPService sharedInstance7 = VoIPService.getSharedInstance();
                                                s3 s3Var14 = this.x;
                                                sharedInstance7.removeRemoteSink(s3Var14.a, s3Var14.b);
                                            }
                                        } else if (VoIPService.getSharedInstance() != null) {
                                            str = null;
                                            VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                                        } else {
                                            str = null;
                                        }
                                        if (c40.z5 && j2Var.isFirstFrameRendered()) {
                                            f();
                                            j2Var.clearFirstFrame();
                                            j2Var.setAlpha(0.0f);
                                            uVar.e.setAlpha(0.0f);
                                        }
                                    }
                                    k(true);
                                } else {
                                    i7 = org.telegram.messenger.g0.L(80.0f);
                                }
                                z13 = false;
                                f10 = 1.0f;
                                z14 = z13;
                                marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                if (i7 != 0) {
                                    marginLayoutParams.height = i7;
                                    if (z14) {
                                    }
                                    marginLayoutParams.width = i7;
                                    this.H = z14;
                                    this.I = f10;
                                    this.R = true;
                                    if (z10) {
                                    }
                                    org.telegram.messenger.g0.h3(new s(this, i10));
                                    k0Var.requestLayout();
                                    invalidate();
                                }
                                s3Var3 = this.x;
                                if (s3Var3.a.self) {
                                }
                                j2 j2Var22 = uVar.d;
                                j2 j2Var32 = uVar.d;
                                j2Var22.setMirror(false);
                                j2Var32.setRotateTextureWithScreen(true);
                                j2Var32.setUseCameraRotation(false);
                                z15 = uVar.a;
                                j2Var = uVar.d;
                                if (!z15) {
                                }
                                if (this.x.a.self) {
                                }
                                s3 s3Var92 = this.x;
                                C = r3.C(s3Var92.a, s3Var92.b, r3Var);
                                xVar = this.b0;
                                if (C) {
                                }
                                ImageReceiver imageReceiver2 = xVar.a;
                                w8 w8Var2 = xVar.c;
                                imageReceiver2.d = i12;
                                C1 = ij.C1(this.x.a.peer);
                                if (m5.E(C1)) {
                                }
                                TLRPC.Chat chat22 = chat;
                                hc hcVar2 = a10;
                                xVar.a.q0(hcVar2, null, (a11 != null || (C2 = gc.D().C(a11.f)) == null) ? w8Var2 : C2, null, chat22, 0);
                                xVar.b.q0(hcVar2, "50_50_b", new ColorDrawable(k6.x0(null, k6.hh, false)), null, chat22, 0);
                                z16 = false;
                                if (z10) {
                                }
                                if (z16 != this.W) {
                                    this.W = z16;
                                    valueAnimator = this.c0;
                                    if (valueAnimator != null) {
                                    }
                                    if (z10) {
                                    }
                                    if (this.W) {
                                    }
                                }
                                if (this.x.a.self) {
                                    VoIPService.getSharedInstance().setLocalSink(j2Var, this.x.b);
                                }
                                n0 n0Var22 = this.n0;
                                n0Var22.h = this.x.a;
                                n0Var22.c(z10);
                                if (xVar.getVisibility() == 0) {
                                }
                                s3 s3Var102 = this.x;
                                if (s3Var102.b) {
                                }
                                if (this.s0 != z17) {
                                }
                                if (c40.z5) {
                                }
                                if (this.x.a.self) {
                                }
                                if (c40.z5) {
                                    f();
                                    j2Var.clearFirstFrame();
                                    j2Var.setAlpha(0.0f);
                                    uVar.e.setAlpha(0.0f);
                                }
                                k(true);
                            }
                        }
                        i7 = 0;
                        z13 = false;
                        f10 = 1.0f;
                        z14 = z13;
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                        if (i7 != 0) {
                        }
                        s3Var3 = this.x;
                        if (s3Var3.a.self) {
                        }
                        j2 j2Var222 = uVar.d;
                        j2 j2Var322 = uVar.d;
                        j2Var222.setMirror(false);
                        j2Var322.setRotateTextureWithScreen(true);
                        j2Var322.setUseCameraRotation(false);
                        z15 = uVar.a;
                        j2Var = uVar.d;
                        if (!z15) {
                        }
                        if (this.x.a.self) {
                        }
                        s3 s3Var922 = this.x;
                        C = r3.C(s3Var922.a, s3Var922.b, r3Var);
                        xVar = this.b0;
                        if (C) {
                        }
                        ImageReceiver imageReceiver22 = xVar.a;
                        w8 w8Var22 = xVar.c;
                        imageReceiver22.d = i12;
                        C1 = ij.C1(this.x.a.peer);
                        if (m5.E(C1)) {
                        }
                        TLRPC.Chat chat222 = chat;
                        hc hcVar22 = a10;
                        xVar.a.q0(hcVar22, null, (a11 != null || (C2 = gc.D().C(a11.f)) == null) ? w8Var22 : C2, null, chat222, 0);
                        xVar.b.q0(hcVar22, "50_50_b", new ColorDrawable(k6.x0(null, k6.hh, false)), null, chat222, 0);
                        z16 = false;
                        if (z10) {
                        }
                        if (z16 != this.W) {
                        }
                        if (this.x.a.self) {
                        }
                        n0 n0Var222 = this.n0;
                        n0Var222.h = this.x.a;
                        n0Var222.c(z10);
                        if (xVar.getVisibility() == 0) {
                        }
                        s3 s3Var1022 = this.x;
                        if (s3Var1022.b) {
                        }
                        if (this.s0 != z17) {
                        }
                        if (c40.z5) {
                        }
                        if (this.x.a.self) {
                        }
                        if (c40.z5) {
                        }
                        k(true);
                    }
                    z13 = false;
                    f10 = 1.0f;
                    i7 = -1;
                    z14 = z13;
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                    if (i7 != 0) {
                    }
                    s3Var3 = this.x;
                    if (s3Var3.a.self) {
                    }
                    j2 j2Var2222 = uVar.d;
                    j2 j2Var3222 = uVar.d;
                    j2Var2222.setMirror(false);
                    j2Var3222.setRotateTextureWithScreen(true);
                    j2Var3222.setUseCameraRotation(false);
                    z15 = uVar.a;
                    j2Var = uVar.d;
                    if (!z15) {
                    }
                    if (this.x.a.self) {
                    }
                    s3 s3Var9222 = this.x;
                    C = r3.C(s3Var9222.a, s3Var9222.b, r3Var);
                    xVar = this.b0;
                    if (C) {
                    }
                    ImageReceiver imageReceiver222 = xVar.a;
                    w8 w8Var222 = xVar.c;
                    imageReceiver222.d = i12;
                    C1 = ij.C1(this.x.a.peer);
                    if (m5.E(C1)) {
                    }
                    TLRPC.Chat chat2222 = chat;
                    hc hcVar222 = a10;
                    xVar.a.q0(hcVar222, null, (a11 != null || (C2 = gc.D().C(a11.f)) == null) ? w8Var222 : C2, null, chat2222, 0);
                    xVar.b.q0(hcVar222, "50_50_b", new ColorDrawable(k6.x0(null, k6.hh, false)), null, chat2222, 0);
                    z16 = false;
                    if (z10) {
                    }
                    if (z16 != this.W) {
                    }
                    if (this.x.a.self) {
                    }
                    n0 n0Var2222 = this.n0;
                    n0Var2222.h = this.x.a;
                    n0Var2222.c(z10);
                    if (xVar.getVisibility() == 0) {
                    }
                    s3 s3Var10222 = this.x;
                    if (s3Var10222.b) {
                    }
                    if (this.s0 != z17) {
                    }
                    if (c40.z5) {
                    }
                    if (this.x.a.self) {
                    }
                    if (c40.z5) {
                    }
                    k(true);
                }
                if (this.w) {
                    return;
                }
                long C13 = ij.C1(this.x.a.peer);
                if (m5.E(C13)) {
                    str = t10.p(qp.s1(org.telegram.messenger.c.a(i12).a).a2(Long.valueOf(C13)));
                } else {
                    TLRPC.Chat M02 = qp.s1(org.telegram.messenger.c.a(i12).a).M0(Long.valueOf(-C13));
                    if (M02 != null) {
                        str = M02.title;
                    }
                }
                k5Var.l(str, false);
                return;
            }
        }
        z10 = z9;
        z11 = false;
        s3Var = this.x;
        s3Var2 = r3Var.z;
        k5 k5Var2 = this.L;
        if (s3Var != s3Var2) {
        }
        z12 = this.w;
        int i122 = this.K;
        if (z12) {
        }
        if (this.w) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(boolean z9) {
        int x02;
        int i7;
        int x03;
        n0 n0Var = this.n0;
        if (n0Var == null) {
            return;
        }
        if (n0Var.k) {
            x03 = k6.x0(null, k6.gh, false);
        } else {
            if (!n0Var.e) {
                x02 = k6.x0(null, k6.eh, false);
                i7 = -1;
                if (this.E0 != i7) {
                    return;
                }
                ValueAnimator valueAnimator = this.G0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.G0.cancel();
                }
                if (!z9) {
                    this.F0 = x02;
                    this.T.setColor(x02);
                    return;
                }
                int i10 = this.D0;
                int i11 = this.F0;
                this.E0 = i7;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.G0 = ofFloat;
                ofFloat.addUpdateListener(new wd(this, i10, i7, i11, x02, 2));
                this.G0.addListener(new hi.p2(this, i7, x02, 3));
                this.G0.start();
                return;
            }
            x03 = k6.x0(null, k6.eh, false);
        }
        i7 = x03;
        x02 = i7;
        if (this.E0 != i7) {
        }
    }

    public final void l(int i7) {
        int measuredWidth = this.y.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f);
        if ((this.H0 == i7 || i7 <= 0) && (this.I0 == measuredWidth || measuredWidth <= 0)) {
            return;
        }
        if (i7 != 0) {
            this.H0 = i7;
        }
        if (measuredWidth != 0) {
            this.I0 = measuredWidth;
        }
        this.L.h(measuredWidth - i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l0.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l0.R();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017e  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        float A;
        int L;
        r rVar;
        float f10;
        int L2;
        FrameLayout frameLayout = this.J;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i11 = layoutParams.leftMargin;
        r3 r3Var = this.F;
        float f11 = r3Var.b.rtmp_stream ? 0.0f : 1.0f;
        boolean z9 = this.d0;
        boolean z10 = c40.w5;
        if (z9 != z10) {
            this.R = true;
            this.d0 = z10;
        }
        int L3 = org.telegram.messenger.g0.L(2.0f);
        layoutParams.rightMargin = L3;
        layoutParams.leftMargin = L3;
        boolean z11 = this.s;
        ch0 ch0Var = this.U;
        k5 k5Var = this.L;
        if (z11) {
            k5Var.animate().scaleX(f11).scaleY(f11).start();
            ch0Var.animate().scaleX(f11).scaleY(f11).start();
        } else {
            k5Var.animate().cancel();
            k5Var.setScaleX(f11);
            k5Var.setScaleY(f11);
            ch0Var.animate().cancel();
            ch0Var.setScaleX(f11);
            ch0Var.setScaleY(f11);
            frameLayout.animate().cancel();
        }
        this.s = false;
        if (this.b) {
            l(0);
            this.w0 = 1.0f;
            if (c40.x5) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(328.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(4.0f), TLObject.FLAG_30));
            } else if (c40.w5) {
                int size = View.MeasureSpec.getSize(i7);
                if (!r3Var.b.rtmp_stream) {
                    size -= org.telegram.messenger.g0.L(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
            } else {
                int size2 = View.MeasureSpec.getSize(i10);
                if (!r3Var.b.rtmp_stream) {
                    size2 -= org.telegram.messenger.g0.L(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            }
        } else if (this.h) {
            this.w0 = 1.0f;
            int A2 = org.telegram.messenger.camera.q.A(14.0f, 2, Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10)));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(A2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + A2, TLObject.FLAG_30));
        } else if (this.H) {
            this.w0 = 1.0f;
            int i12 = 6;
            if ((!c40.x5 || this.e == null) && !c40.w5) {
                i12 = 2;
            }
            if (this.e != null) {
                L = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(344.0f);
            } else if (c40.x5) {
                L = org.telegram.messenger.g0.L(320.0f);
            } else {
                A = org.telegram.messenger.camera.q.A(14.0f, 2, View.MeasureSpec.getSize(i7)) + (c40.w5 ? -org.telegram.messenger.g0.L(90.0f) : 0);
                float f12 = (this.I / i12) * A;
                rVar = this.e;
                if (rVar == null) {
                    f10 = rVar.getItemHeight() - org.telegram.messenger.g0.L(4.0f);
                    L2 = org.telegram.messenger.g0.L(4.0f);
                } else {
                    if (c40.x5) {
                        f10 = A / 2.0f;
                    } else {
                        f10 = A / (c40.w5 ? 3 : 2);
                    }
                    L2 = org.telegram.messenger.g0.L(2.0f);
                }
                float f13 = f12 - L2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                float L4 = this.V.getVisibility() != 0 ? f13 - org.telegram.messenger.g0.L(28.0f) : f13;
                l((int) L4);
                layoutParams2.width = (int) (L4 - (layoutParams2.leftMargin * 2));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30));
            }
            A = L;
            float f122 = (this.I / i12) * A;
            rVar = this.e;
            if (rVar == null) {
            }
            float f132 = f122 - L2;
            FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (this.V.getVisibility() != 0) {
            }
            l((int) L4);
            layoutParams22.width = (int) (L4 - (layoutParams22.leftMargin * 2));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f132, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30));
        } else {
            this.w0 = 0.0f;
            super.onMeasure(i7, i10);
        }
        int size3 = View.MeasureSpec.getSize(i10) + (View.MeasureSpec.getSize(i7) << 16);
        if (this.M != size3) {
            this.M = size3;
            this.D.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(120.0f), 0, i0.a.o(-16777216, 120), Shader.TileMode.CLAMP));
        }
        k5Var.setPivotX(0.0f);
        k5Var.setPivotY(k5Var.getMeasuredHeight() / 2.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAmplitude(double d) {
        this.n0.a(d);
        x xVar = this.b0;
        xVar.getClass();
        float f10 = ((float) d) / 80.0f;
        float f11 = f10 <= 1.0f ? 0.0f : 1.0f;
        f10 = f11;
        xVar.r = f10;
        xVar.s = (f10 - xVar.n) / 200.0f;
    }

    public void setPrimaryView(r rVar) {
        if (this.c != rVar) {
            this.c = rVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(h10 h10Var) {
        if (this.d != h10Var) {
            this.d = h10Var;
            this.R = true;
            j(true);
        }
    }

    public void setTabletGridView(r rVar) {
        if (this.e != rVar) {
            this.e = rVar;
            j(true);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
    }
}
