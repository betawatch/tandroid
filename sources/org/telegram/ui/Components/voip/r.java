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
import b8.mf;
import ci.nc;
import ci.v6;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.uq;
import org.telegram.ui.u10;
import org.telegram.ui.x30;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r extends FrameLayout implements z {
    public boolean A0;
    public final l B0;
    public final Rect C0;
    public v6 D0;
    public final Paint E;
    public int E0;
    public boolean F;
    public int F0;
    public final r3 G;
    public int G0;
    public final x30 H;
    public ValueAnimator H0;
    public boolean I;
    public int I0;
    public float J;
    public int J0;
    public final FrameLayout K;
    public ValueAnimator K0;
    public final int L;
    public boolean L0;
    public final k5 M;
    public int N;
    public final org.telegram.ui.ActionBar.k2 O;
    public final TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public float T;
    public final Paint U;
    public final fh0 V;
    public final ImageView W;
    public final n a;
    public boolean a0;
    public boolean b;
    public float b0;
    public k c;
    public final q c0;
    public d10 d;
    public ValueAnimator d0;
    public k e;
    public boolean e0;
    public boolean f;
    public float f0;
    public float g0;
    public boolean h;
    public float h0;
    public float i0;
    public float j0;
    public boolean k0;
    public float l0;
    public final ImageReceiver m0;
    public boolean n;
    public final ArrayList n0;
    public a0 o0;
    public boolean p0;
    public float q0;
    public boolean r;
    public Bitmap r0;
    public boolean s;
    public Paint s0;
    public boolean t0;
    public float u0;
    public final uq v0;
    public boolean w;
    public final Drawable w0;
    public s3 x;
    public float x0;
    public final x y;
    public ImageView y0;
    public boolean z0;

    public r(x xVar, r3 r3Var, x30 x30Var) {
        super(xVar.getContext());
        this.E = new Paint(1);
        Paint paint = new Paint(1);
        this.U = paint;
        this.b0 = 1.0f;
        this.m0 = new ImageReceiver(null);
        this.n0 = new ArrayList();
        this.B0 = new l(this, 1);
        this.C0 = new Rect();
        this.G = r3Var;
        int i3 = x30Var.a;
        this.L = i3;
        uq uqVar = new uq(xVar.getContext(), R.drawable.calls_video, -1);
        this.v0 = uqVar;
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
        this.w0 = xVar.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setColor(-1);
        String M0 = bd.M0(2131743234, null);
        String M02 = bd.M0(2131743231, null);
        int L3 = org.telegram.messenger.g0.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(M02, textPaint, L3, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat M03 = hp.s1(i3).M0(Long.valueOf(r3Var.c));
        StaticLayout staticLayout2 = new StaticLayout(bd.a0("VoipVideoNotAvailable", null, 2131743236, bd.G(hp.s1(i3).a4, "Participants", new Object[0])), textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
        String M04 = bd.M0(2131743232, null);
        n nVar = new n(this, xVar.getContext(), r3Var, xVar, textPaint, staticLayout2, textPaint2, M04, textPaint2.measureText(M04), staticLayout, x30Var, M0, textPaint.measureText(M0));
        this.a = nVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        y1 y1Var = nVar.d;
        y1Var.setScalingType(scalingType);
        this.y = xVar;
        this.H = x30Var;
        y1Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new o(this));
        TextureView textureView = nVar.e;
        if (textureView != null) {
            y1Var.setBackgroundRenderer(textureView);
            if (!y1Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        y1Var.setAlpha(0.0f);
        addView(nVar);
        q qVar = new q(this, getContext());
        this.c0 = qVar;
        addView(qVar);
        k5 k5Var = new k5(xVar.getContext());
        this.M = k5Var;
        k5Var.setTextSize(13);
        k5Var.setTextColor(i0.a.o(-1, hs.F3));
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setFullTextMaxLines(1);
        k5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(xVar.getContext());
        this.K = frameLayout;
        frameLayout.addView(k5Var, mf.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, mf.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(k6.x0(null, k6.eh, false));
        frameLayout.setClipChildren(false);
        fh0 fh0Var = new fh0(xVar.getContext());
        this.V = fh0Var;
        addView(fh0Var, mf.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView = new ImageView(xVar.getContext());
        this.W = imageView;
        addView(imageView, mf.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        imageView.setImageDrawable(xVar.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L4 = org.telegram.messenger.g0.L(19.0f);
        int o10 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = k6.k0(L4, L4, L4, L4, 0, o10, o10);
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2(4, xVar.getContext(), this);
        this.O = k2Var;
        k2Var.setText(bd.M0(2131743230, null));
        k2Var.setTextSize(1, 15.0f);
        k2Var.setTypeface(org.telegram.messenger.g0.o());
        k2Var.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        k2Var.setTextColor(-1);
        k2Var.setBackground(k02);
        k2Var.setGravity(17);
        k2Var.setOnClickListener(new ii.m(this, 20));
        addView(k2Var, mf.e(-2, 38, 51));
        TextView textView = new TextView(xVar.getContext());
        this.P = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        r6.V(textView, k6.ch, null);
        textView.setBackground(k02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (t3.w(14, M03)) {
            textView.setText(org.telegram.messenger.g0.X2(bd.M0(2131748171, null)));
        } else {
            org.telegram.messenger.k5.r("NoRtmpStreamFromAppViewer", null, 2131748170, new Object[]{M03.title}, textView);
        }
        addView(textView, mf.e(-2, -2, 51));
    }

    public static r c(ArrayList arrayList, u10 u10Var, k kVar, d10 d10Var, k kVar2, s3 s3Var, r3 r3Var, x30 x30Var) {
        r rVar;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                rVar = null;
                break;
            }
            if (s3Var.equals(((r) arrayList.get(i3)).x)) {
                rVar = (r) arrayList.get(i3);
                break;
            }
            i3++;
        }
        if (rVar == null) {
            rVar = new r(u10Var, r3Var, x30Var);
        }
        if (kVar != null) {
            rVar.setPrimaryView(kVar);
        }
        if (d10Var != null) {
            rVar.setSecondaryView(d10Var);
        }
        if (kVar2 != null) {
            rVar.setTabletGridView(kVar2);
        }
        return rVar;
    }

    @Override // org.telegram.ui.Components.voip.z
    public final void a() {
        invalidate();
        k(true);
        q qVar = this.c0;
        if (qVar.getVisibility() == 0) {
            q.a(qVar, true);
        }
    }

    public final void b(boolean z10) {
        this.Q = true;
        this.w = false;
        this.y.f(this);
        if (z10) {
            if (this.x.a.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                }
            } else if (VoIPService.getSharedInstance() != null && !s0.e0.W) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                s3 s3Var = this.x;
                sharedInstance.removeRemoteSink(s3Var.a, s3Var.b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.d0.cancel();
        }
        this.a.d.release();
    }

    public final void d() {
        if (this.r0 != null) {
            return;
        }
        HashMap hashMap = this.G.h;
        s3 s3Var = this.x;
        boolean z10 = s3Var.b;
        TLRPC.GroupCallParticipant groupCallParticipant = s3Var.a;
        Bitmap bitmap = (Bitmap) hashMap.get(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        this.r0 = bitmap;
        this.a.setThumb(bitmap);
        if (this.r0 == null) {
            long C1 = zi.C1(this.x.a.peer);
            s3 s3Var2 = this.x;
            boolean z11 = s3Var2.a.self;
            ImageReceiver imageReceiver = this.m0;
            if (z11 && s3Var2.b) {
                imageReceiver.w0(new la0(true, -14602694, -13935795, -14395293, -14203560));
                return;
            }
            int i3 = this.L;
            if (C1 > 0) {
                TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(C1));
                ac l10 = ac.l(i3, 1, a22);
                int d = a22 != null ? u8.d(a22.id) : i0.a.f(0.2f, -16777216, -1);
                imageReceiver.q0(l10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d, -16777216), i0.a.f(0.4f, d, -16777216)}), null, a22, 0);
                return;
            }
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-C1));
            ac a10 = ac.a(1, M0);
            int d10 = M0 != null ? u8.d(M0.id) : i0.a.f(0.2f, -16777216, -1);
            imageReceiver.q0(a10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d10, -16777216), i0.a.f(0.4f, d10, -16777216)}), null, M0, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.w;
        x xVar = this.y;
        n nVar = this.a;
        if (z10) {
            float y9 = (nVar.getY() + nVar.getMeasuredHeight()) - nVar.O;
            FrameLayout frameLayout = this.K;
            float measuredHeight = (y9 - frameLayout.getMeasuredHeight()) + this.q0;
            boolean z11 = this.h;
            fh0 fh0Var = this.V;
            if (z11 || this.f) {
                frameLayout.setAlpha(1.0f - xVar.n);
                fh0Var.setAlpha(1.0f - xVar.n);
            } else if (this.b || this.r) {
                if (!x30.x5 && !x30.y5) {
                    measuredHeight = a1.g.D(1.0f, xVar.a0, org.telegram.messenger.g0.L(90.0f) * xVar.c, measuredHeight);
                }
                frameLayout.setAlpha(1.0f);
                fh0Var.setAlpha(1.0f);
            } else if (this.d != null) {
                frameLayout.setAlpha(1.0f - xVar.c);
                fh0Var.setAlpha(1.0f - xVar.c);
            } else {
                frameLayout.setAlpha(1.0f);
                fh0Var.setAlpha(1.0f);
            }
            boolean z12 = this.b;
            k5 k5Var = this.M;
            if (z12 || this.r) {
                k5Var.setFullAlpha(xVar.c);
            } else {
                k5Var.setFullAlpha(0.0f);
            }
            fh0Var.setTranslationX(frameLayout.getX());
            fh0Var.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
            ImageView imageView = this.W;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((nVar.getMeasuredWidth() - (nVar.P * 2.0f)) - org.telegram.messenger.g0.L(32.0f));
                imageView.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - xVar.c, 1.0f - xVar.n));
            }
            frameLayout.setTranslationY(measuredHeight);
            frameLayout.setTranslationX(this.z0 ? 0.0f : org.telegram.messenger.g0.L(6.0f) * xVar.c);
        }
        super.dispatchDraw(canvas);
        if (this.w) {
            a0 a0Var = this.o0;
            if (a0Var != null) {
                boolean z13 = a0Var.e;
                if (z13) {
                    float f10 = this.T;
                    if (f10 != 1.0f) {
                        float f11 = f10 + 0.053333335f;
                        this.T = f11;
                        if (f11 > 1.0f) {
                            this.T = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                if (!z13) {
                    float f12 = this.T;
                    if (f12 != 0.0f) {
                        float f13 = f12 - 0.053333335f;
                        this.T = f13;
                        if (f13 < 0.0f) {
                            this.T = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f14 = this.T;
            float f15 = (1.0f - xVar.n) * (1.0f - xVar.c) * f14;
            if (f14 > 0.0f) {
                int i3 = (int) (f15 * 255.0f);
                Paint paint = this.U;
                paint.setAlpha(i3);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.q0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(nVar.getX() + nVar.P, nVar.getY() + nVar.O, (nVar.getX() + nVar.getMeasuredWidth()) - nVar.P, (nVar.getY() + nVar.getMeasuredHeight()) - nVar.O);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.q0);
                float f16 = nVar.b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.p0 || (view != this.a && view != this.c0)) {
            return super.drawChild(canvas, view, j10);
        }
        float max = (Math.max(0.0f, 1.0f - (Math.abs(this.q0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        canvas.translate(0.0f, this.q0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        this.a.d.release();
        a0 a0Var = this.o0;
        if (a0Var != null) {
            this.H.l4.add(a0Var);
            this.o0.b();
            a0 a0Var2 = this.o0;
            a0Var2.c = null;
            a0Var2.c(false);
        }
        this.o0 = null;
    }

    public final void f() {
        if (this.x != null) {
            n nVar = this.a;
            y1 y1Var = nVar.d;
            y1 y1Var2 = nVar.d;
            if (y1Var.getMeasuredHeight() == 0 || y1Var2.getMeasuredWidth() == 0) {
                return;
            }
            y1Var2.getRenderBufferBitmap(new e3(this, 2));
        }
    }

    public final void g(boolean z10, boolean z11) {
        if (this.n != z10) {
            this.n = z10;
            j(!(this.c == null && this.e == null) && z11);
        }
    }

    public String getName() {
        long C1 = zi.C1(this.x.a.peer);
        return m5.E(C1) ? l10.p(hp.s1(org.telegram.messenger.c.a(h10.t0).a).a2(Long.valueOf(C1))) : hp.s1(org.telegram.messenger.c.a(h10.t0).a).M0(Long.valueOf(-C1)).title;
    }

    public k getPrimaryView() {
        return this.c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.b != z10) {
            this.b = z10;
            this.S = true;
            j(z11);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        if (this.f0 == f10 && this.g0 == f11 && this.h0 == f12 && this.i0 == f13 && this.j0 == f14) {
            return;
        }
        this.k0 = z10;
        this.f0 = f10;
        this.g0 = f11;
        this.h0 = f12;
        this.i0 = f13;
        this.j0 = f14;
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (!this.R) {
            this.a.invalidate();
        }
        k kVar = this.c;
        if (kVar != null) {
            kVar.invalidate();
            x30 x30Var = this.H;
            if (x30Var.P4 == this.c) {
                x30Var.b.invalidate();
            }
        }
        d10 d10Var = this.d;
        if (d10Var != null) {
            d10Var.invalidate();
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
    public final void j(boolean z10) {
        boolean z11;
        boolean z12;
        s3 s3Var;
        s3 s3Var2;
        boolean z13;
        boolean z14;
        float f10;
        int i3;
        boolean z15;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        s3 s3Var3;
        boolean z16;
        y1 y1Var;
        boolean C;
        q qVar;
        long C1;
        ac a10;
        ac a11;
        TLRPC.Chat chat;
        boolean z17;
        Drawable C2;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        boolean z18;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        ValueAnimator valueAnimator;
        s3 s3Var4;
        k kVar;
        if (this.Q) {
            return;
        }
        r3 r3Var = this.G;
        int i10 = 0;
        if (r3Var.b.rtmp_stream) {
            int L = org.telegram.messenger.g0.L(this.b ? 36.0f : 21.0f);
            this.P.setPadding(L, 0, L, 0);
        }
        if (this.x == null && ((kVar = this.c) != null || this.d != null || this.e != null)) {
            if (kVar != null) {
                this.x = kVar.getParticipant();
            } else {
                k kVar2 = this.e;
                if (kVar2 != null) {
                    this.x = kVar2.getParticipant();
                } else {
                    this.x = this.d.getVideoParticipant();
                }
            }
        }
        boolean z19 = this.w;
        fh0 fh0Var = this.V;
        x xVar = this.y;
        String str = null;
        n nVar = this.a;
        int i11 = 1;
        if (z19 && !this.b) {
            boolean z20 = VoIPService.getSharedInstance() == null;
            if (x30.A5 || (s3Var4 = this.x) == null || (this.d == null && (!r3.C(s3Var4.a, s3Var4.b, r3Var) || (!r3Var.x && this.x != r3Var.z)))) {
                z20 = true;
            }
            if (z20 || (this.c == null && this.d == null && this.e == null && !this.h && !this.f)) {
                this.w = false;
                f();
                boolean z21 = az.o() <= 0;
                if (nVar.c0 == null && z20) {
                    if (z21) {
                        xVar.f(this);
                    }
                    animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new androidx.fragment.app.g(this, this, z21, 9)).setDuration(150L).start();
                } else {
                    if (xVar.s) {
                        v6 v6Var = this.D0;
                        if (v6Var != null) {
                            org.telegram.messenger.g0.r(v6Var);
                            this.D0 = null;
                        }
                        v6 v6Var2 = new v6(this, z21, this, 26);
                        this.D0 = v6Var2;
                        org.telegram.messenger.g0.h3(v6Var2);
                    } else {
                        if (z21) {
                            xVar.removeView(this);
                        }
                        setVisibility(8);
                    }
                    if (z21) {
                        xVar.f(this);
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
                ValueAnimator valueAnimator2 = this.d0;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    this.d0.cancel();
                }
            }
        } else if (!z19) {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            k kVar3 = this.c;
            if (kVar3 != null || this.d != null || this.e != null || this.b) {
                if (kVar3 != null) {
                    this.x = kVar3.getParticipant();
                } else {
                    d10 d10Var = this.d;
                    if (d10Var != null) {
                        this.x = d10Var.getVideoParticipant();
                    } else {
                        k kVar4 = this.e;
                        if (kVar4 != null) {
                            this.x = kVar4.getParticipant();
                        }
                    }
                }
                s3 s3Var6 = this.x;
                TLRPC.GroupCallParticipant groupCallParticipant = s3Var6.a;
                boolean z22 = !groupCallParticipant.self ? !((r3Var.x || s3Var6 == r3Var.z) && r3.C(groupCallParticipant, s3Var6.b, r3Var)) : !(VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(this.x.b) == 2);
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
                x30 x30Var = this.H;
                if (x30Var.l4.size() > 0) {
                    this.o0 = (a0) org.telegram.ui.Cells.f1.o(1, x30Var.l4);
                } else {
                    this.o0 = new a0();
                }
                a0 a0Var = this.o0;
                a0Var.g = this;
                a0Var.c = fh0Var;
                a0Var.c(false);
                k(false);
                v6 v6Var3 = this.D0;
                if (v6Var3 != null) {
                    org.telegram.messenger.g0.r(v6Var3);
                    this.D0 = null;
                }
                if (getParent() == null) {
                    xVar.addView(this, mf.e(46, 46, 51));
                    xVar.I.add(this);
                    long C12 = zi.C1(this.x.a.peer);
                    LongSparseIntArray longSparseIntArray = xVar.x;
                    longSparseIntArray.put(C12, longSparseIntArray.get(C12, 0) + 1);
                    setVisibility(0);
                } else if (getVisibility() == 8) {
                    setVisibility(0);
                }
                this.S = true;
                this.F = false;
                animate().setListener(null).cancel();
                if (nVar.c0 != null || this.d == null || this.c != null || nVar.E == 1.0f) {
                    setScaleY(1.0f);
                    setScaleX(1.0f);
                    setAlpha(1.0f);
                } else {
                    setScaleX(0.5f);
                    setScaleY(0.5f);
                    setAlpha(0.0f);
                    this.F = true;
                    invalidate();
                    animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(new p(this, i10)).setDuration(100L).start();
                    invalidate();
                }
                d();
                this.W.setVisibility((!this.x.b || r3Var.b.rtmp_stream) ? 8 : 0);
                z11 = false;
                z12 = true;
                s3Var = this.x;
                s3Var2 = r3Var.z;
                k5 k5Var = this.M;
                if (s3Var != s3Var2) {
                    if (k5Var.getVisibility() != 4) {
                        k5Var.setVisibility(4);
                        fh0Var.setVisibility(4);
                    }
                } else if (k5Var.getVisibility() != 0) {
                    k5Var.setVisibility(0);
                    fh0Var.setVisibility(0);
                }
                z13 = this.w;
                int i12 = this.L;
                if (z13) {
                    boolean z23 = x30.y5 && (!xVar.b || (this.d == null && this.c == null));
                    if (!this.b) {
                        d10 d10Var2 = this.d;
                        if (d10Var2 == null || this.c != null || xVar.b) {
                            if (!this.h) {
                                if (d10Var2 == null || this.c != null) {
                                    k kVar5 = this.e;
                                    if (kVar5 == null || !z23) {
                                        k kVar6 = this.c;
                                        if ((kVar6 == null || d10Var2 != null) && this.n) {
                                            if (kVar6 != null) {
                                                i3 = org.telegram.messenger.g0.L(80.0f);
                                            }
                                        } else if (kVar6 != null) {
                                            z14 = false;
                                            f10 = kVar6.a;
                                            z15 = true;
                                        } else {
                                            i3 = org.telegram.messenger.g0.L(46.0f);
                                        }
                                    } else {
                                        float f11 = kVar5.a;
                                        z14 = kVar5.b.e.size();
                                        z15 = true;
                                        f10 = f11;
                                    }
                                    i3 = -1;
                                    marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                    if (i3 != 0 && (marginLayoutParams.height != i3 || z12 || this.I != z15 || ((z15 && this.J != f10) || z14))) {
                                        marginLayoutParams.height = i3;
                                        if (z15) {
                                            i3 = -1;
                                        }
                                        marginLayoutParams.width = i3;
                                        this.I = z15;
                                        this.J = f10;
                                        this.S = true;
                                        if (z11) {
                                            nVar.requestLayout();
                                        } else {
                                            nVar.a();
                                            this.s = true;
                                        }
                                        org.telegram.messenger.g0.h3(new l(this, i10));
                                        xVar.requestLayout();
                                        invalidate();
                                    }
                                    s3Var3 = this.x;
                                    if (s3Var3.a.self || s3Var3.b || VoIPService.getSharedInstance() == null) {
                                        y1 y1Var2 = nVar.d;
                                        y1 y1Var3 = nVar.d;
                                        y1Var2.setMirror(false);
                                        y1Var3.setRotateTextureWithScreen(true);
                                        y1Var3.setUseCameraRotation(false);
                                    } else {
                                        y1 y1Var4 = nVar.d;
                                        y1 y1Var5 = nVar.d;
                                        y1Var4.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
                                        y1Var5.setRotateTextureWithScreen(true);
                                        y1Var5.setUseCameraRotation(true);
                                    }
                                    z16 = nVar.a;
                                    y1Var = nVar.d;
                                    if (!z16) {
                                        ((WindowManager) nVar.getContext().getSystemService("window")).getDefaultDisplay();
                                    }
                                    if (this.x.a.self) {
                                        y1Var.setMaxTextureSize(0);
                                    } else {
                                        y1Var.setMaxTextureSize(720);
                                    }
                                    s3 s3Var9 = this.x;
                                    C = r3.C(s3Var9.a, s3Var9.b, r3Var);
                                    qVar = this.c0;
                                    if (C || !(r3Var.x || this.x == r3Var.z)) {
                                        ImageReceiver imageReceiver = qVar.a;
                                        u8 u8Var = qVar.c;
                                        imageReceiver.d = i12;
                                        C1 = zi.C1(this.x.a.peer);
                                        if (m5.E(C1)) {
                                            TLRPC.Chat M0 = hp.s1(org.telegram.messenger.c.a(h10.t0).a).M0(Long.valueOf(-C1));
                                            u8Var.q(M0);
                                            a10 = ac.a(0, M0);
                                            a11 = ac.a(1, M0);
                                            chat = M0;
                                        } else {
                                            TLRPC.User a22 = hp.s1(org.telegram.messenger.c.a(i12).a).a2(Long.valueOf(C1));
                                            u8Var.r(a22);
                                            a10 = ac.l(i12, 0, a22);
                                            a11 = ac.l(i12, 1, a22);
                                            chat = a22;
                                        }
                                        TLRPC.Chat chat2 = chat;
                                        ac acVar = a10;
                                        qVar.a.q0(acVar, null, (a11 != null || (C2 = zb.D().C(a11.f)) == null) ? u8Var : C2, null, chat2, 0);
                                        qVar.b.q0(acVar, "50_50_b", new ColorDrawable(k6.x0(null, k6.hh, false)), null, chat2, 0);
                                        z17 = false;
                                    } else {
                                        z17 = true;
                                    }
                                    boolean z24 = (z11 || this.d == null || this.b || z17) ? false : true;
                                    if (z17 != this.a0 && !z24) {
                                        this.a0 = z17;
                                        valueAnimator = this.d0;
                                        if (valueAnimator != null) {
                                            valueAnimator.removeAllListeners();
                                            this.d0.cancel();
                                        }
                                        if (z11) {
                                            boolean z25 = this.a0;
                                            this.b0 = z25 ? 0.0f : 1.0f;
                                            qVar.setVisibility(z25 ? 8 : 0);
                                            qVar.setAlpha(this.b0);
                                            nVar.invalidate();
                                        } else {
                                            if (!this.a0 && qVar.getVisibility() != 0) {
                                                qVar.setVisibility(0);
                                                qVar.setAlpha(0.0f);
                                            }
                                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, this.a0 ? 0.0f : 1.0f);
                                            this.d0 = ofFloat;
                                            ofFloat.addUpdateListener(new m(this, i10));
                                            this.d0.addListener(new p(this, i11));
                                            this.d0.start();
                                        }
                                        if (this.a0) {
                                            q.a(qVar, false);
                                        }
                                    }
                                    if (this.x.a.self && VoIPService.getSharedInstance() != null) {
                                        VoIPService.getSharedInstance().setLocalSink(y1Var, this.x.b);
                                    }
                                    a0 a0Var2 = this.o0;
                                    a0Var2.h = this.x.a;
                                    a0Var2.c(z11);
                                    if (qVar.getVisibility() == 0) {
                                        q.a(qVar, true);
                                    }
                                    s3 s3Var10 = this.x;
                                    z18 = s3Var10.b ? !((tL_groupCallParticipantVideo = s3Var10.a.video) == null || !tL_groupCallParticipantVideo.paused) : !((tL_groupCallParticipantVideo2 = s3Var10.a.presentation) == null || !tL_groupCallParticipantVideo2.paused);
                                    if (this.t0 != z18) {
                                        this.t0 = z18;
                                        y1Var.animate().alpha(this.t0 ? 0.0f : 1.0f).setDuration(250L).start();
                                        nVar.invalidate();
                                    }
                                    if (x30.A5 && this.a0) {
                                        if (!y1Var.isFirstFrameRendered()) {
                                            d();
                                        }
                                        if (this.x.a.self) {
                                            if (VoIPService.getSharedInstance() != null) {
                                                VoIPService.getSharedInstance().setLocalSink(y1Var, this.x.b);
                                            }
                                        } else if (VoIPService.getSharedInstance() != null) {
                                            VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                                            s3 s3Var11 = this.x;
                                            sharedInstance4.addRemoteSink(s3Var11.a, s3Var11.b, y1Var, null);
                                            VoIPService sharedInstance5 = VoIPService.getSharedInstance();
                                            s3 s3Var12 = this.x;
                                            sharedInstance5.addRemoteSink(s3Var12.a, s3Var12.b, y1Var, null);
                                            if (r3Var.b.rtmp_stream && !y1Var.isFirstFrameRendered() && !this.A0) {
                                                org.telegram.messenger.g0.i3(this.B0, 15000L);
                                                this.A0 = true;
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
                                        if (x30.A5 && y1Var.isFirstFrameRendered()) {
                                            f();
                                            y1Var.clearFirstFrame();
                                            y1Var.setAlpha(0.0f);
                                            nVar.e.setAlpha(0.0f);
                                        }
                                    }
                                    k(true);
                                } else {
                                    i3 = org.telegram.messenger.g0.L(80.0f);
                                }
                                z14 = false;
                                f10 = 1.0f;
                                z15 = z14;
                                marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                if (i3 != 0) {
                                    marginLayoutParams.height = i3;
                                    if (z15) {
                                    }
                                    marginLayoutParams.width = i3;
                                    this.I = z15;
                                    this.J = f10;
                                    this.S = true;
                                    if (z11) {
                                    }
                                    org.telegram.messenger.g0.h3(new l(this, i10));
                                    xVar.requestLayout();
                                    invalidate();
                                }
                                s3Var3 = this.x;
                                if (s3Var3.a.self) {
                                }
                                y1 y1Var22 = nVar.d;
                                y1 y1Var32 = nVar.d;
                                y1Var22.setMirror(false);
                                y1Var32.setRotateTextureWithScreen(true);
                                y1Var32.setUseCameraRotation(false);
                                z16 = nVar.a;
                                y1Var = nVar.d;
                                if (!z16) {
                                }
                                if (this.x.a.self) {
                                }
                                s3 s3Var92 = this.x;
                                C = r3.C(s3Var92.a, s3Var92.b, r3Var);
                                qVar = this.c0;
                                if (C) {
                                }
                                ImageReceiver imageReceiver2 = qVar.a;
                                u8 u8Var2 = qVar.c;
                                imageReceiver2.d = i12;
                                C1 = zi.C1(this.x.a.peer);
                                if (m5.E(C1)) {
                                }
                                TLRPC.Chat chat22 = chat;
                                ac acVar2 = a10;
                                qVar.a.q0(acVar2, null, (a11 != null || (C2 = zb.D().C(a11.f)) == null) ? u8Var2 : C2, null, chat22, 0);
                                qVar.b.q0(acVar2, "50_50_b", new ColorDrawable(k6.x0(null, k6.hh, false)), null, chat22, 0);
                                z17 = false;
                                if (z11) {
                                }
                                if (z17 != this.a0) {
                                    this.a0 = z17;
                                    valueAnimator = this.d0;
                                    if (valueAnimator != null) {
                                    }
                                    if (z11) {
                                    }
                                    if (this.a0) {
                                    }
                                }
                                if (this.x.a.self) {
                                    VoIPService.getSharedInstance().setLocalSink(y1Var, this.x.b);
                                }
                                a0 a0Var22 = this.o0;
                                a0Var22.h = this.x.a;
                                a0Var22.c(z11);
                                if (qVar.getVisibility() == 0) {
                                }
                                s3 s3Var102 = this.x;
                                if (s3Var102.b) {
                                }
                                if (this.t0 != z18) {
                                }
                                if (x30.A5) {
                                }
                                if (this.x.a.self) {
                                }
                                if (x30.A5) {
                                    f();
                                    y1Var.clearFirstFrame();
                                    y1Var.setAlpha(0.0f);
                                    nVar.e.setAlpha(0.0f);
                                }
                                k(true);
                            }
                        }
                        i3 = 0;
                        z14 = false;
                        f10 = 1.0f;
                        z15 = z14;
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                        if (i3 != 0) {
                        }
                        s3Var3 = this.x;
                        if (s3Var3.a.self) {
                        }
                        y1 y1Var222 = nVar.d;
                        y1 y1Var322 = nVar.d;
                        y1Var222.setMirror(false);
                        y1Var322.setRotateTextureWithScreen(true);
                        y1Var322.setUseCameraRotation(false);
                        z16 = nVar.a;
                        y1Var = nVar.d;
                        if (!z16) {
                        }
                        if (this.x.a.self) {
                        }
                        s3 s3Var922 = this.x;
                        C = r3.C(s3Var922.a, s3Var922.b, r3Var);
                        qVar = this.c0;
                        if (C) {
                        }
                        ImageReceiver imageReceiver22 = qVar.a;
                        u8 u8Var22 = qVar.c;
                        imageReceiver22.d = i12;
                        C1 = zi.C1(this.x.a.peer);
                        if (m5.E(C1)) {
                        }
                        TLRPC.Chat chat222 = chat;
                        ac acVar22 = a10;
                        qVar.a.q0(acVar22, null, (a11 != null || (C2 = zb.D().C(a11.f)) == null) ? u8Var22 : C2, null, chat222, 0);
                        qVar.b.q0(acVar22, "50_50_b", new ColorDrawable(k6.x0(null, k6.hh, false)), null, chat222, 0);
                        z17 = false;
                        if (z11) {
                        }
                        if (z17 != this.a0) {
                        }
                        if (this.x.a.self) {
                        }
                        a0 a0Var222 = this.o0;
                        a0Var222.h = this.x.a;
                        a0Var222.c(z11);
                        if (qVar.getVisibility() == 0) {
                        }
                        s3 s3Var1022 = this.x;
                        if (s3Var1022.b) {
                        }
                        if (this.t0 != z18) {
                        }
                        if (x30.A5) {
                        }
                        if (this.x.a.self) {
                        }
                        if (x30.A5) {
                        }
                        k(true);
                    }
                    z14 = false;
                    f10 = 1.0f;
                    i3 = -1;
                    z15 = z14;
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                    if (i3 != 0) {
                    }
                    s3Var3 = this.x;
                    if (s3Var3.a.self) {
                    }
                    y1 y1Var2222 = nVar.d;
                    y1 y1Var3222 = nVar.d;
                    y1Var2222.setMirror(false);
                    y1Var3222.setRotateTextureWithScreen(true);
                    y1Var3222.setUseCameraRotation(false);
                    z16 = nVar.a;
                    y1Var = nVar.d;
                    if (!z16) {
                    }
                    if (this.x.a.self) {
                    }
                    s3 s3Var9222 = this.x;
                    C = r3.C(s3Var9222.a, s3Var9222.b, r3Var);
                    qVar = this.c0;
                    if (C) {
                    }
                    ImageReceiver imageReceiver222 = qVar.a;
                    u8 u8Var222 = qVar.c;
                    imageReceiver222.d = i12;
                    C1 = zi.C1(this.x.a.peer);
                    if (m5.E(C1)) {
                    }
                    TLRPC.Chat chat2222 = chat;
                    ac acVar222 = a10;
                    qVar.a.q0(acVar222, null, (a11 != null || (C2 = zb.D().C(a11.f)) == null) ? u8Var222 : C2, null, chat2222, 0);
                    qVar.b.q0(acVar222, "50_50_b", new ColorDrawable(k6.x0(null, k6.hh, false)), null, chat2222, 0);
                    z17 = false;
                    if (z11) {
                    }
                    if (z17 != this.a0) {
                    }
                    if (this.x.a.self) {
                    }
                    a0 a0Var2222 = this.o0;
                    a0Var2222.h = this.x.a;
                    a0Var2222.c(z11);
                    if (qVar.getVisibility() == 0) {
                    }
                    s3 s3Var10222 = this.x;
                    if (s3Var10222.b) {
                    }
                    if (this.t0 != z18) {
                    }
                    if (x30.A5) {
                    }
                    if (this.x.a.self) {
                    }
                    if (x30.A5) {
                    }
                    k(true);
                }
                if (this.w) {
                    return;
                }
                long C13 = zi.C1(this.x.a.peer);
                if (m5.E(C13)) {
                    str = l10.p(hp.s1(org.telegram.messenger.c.a(i12).a).a2(Long.valueOf(C13)));
                } else {
                    TLRPC.Chat M02 = hp.s1(org.telegram.messenger.c.a(i12).a).M0(Long.valueOf(-C13));
                    if (M02 != null) {
                        str = M02.title;
                    }
                }
                k5Var.l(str, false);
                return;
            }
        }
        z11 = z10;
        z12 = false;
        s3Var = this.x;
        s3Var2 = r3Var.z;
        k5 k5Var2 = this.M;
        if (s3Var != s3Var2) {
        }
        z13 = this.w;
        int i122 = this.L;
        if (z13) {
        }
        if (this.w) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(boolean z10) {
        int x02;
        int i3;
        int x03;
        a0 a0Var = this.o0;
        if (a0Var == null) {
            return;
        }
        if (a0Var.k) {
            x03 = k6.x0(null, k6.gh, false);
        } else {
            if (!a0Var.e) {
                x02 = k6.x0(null, k6.eh, false);
                i3 = -1;
                if (this.F0 != i3) {
                    return;
                }
                ValueAnimator valueAnimator = this.H0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.H0.cancel();
                }
                if (!z10) {
                    this.G0 = x02;
                    this.U.setColor(x02);
                    return;
                }
                int i10 = this.E0;
                int i11 = this.G0;
                this.F0 = i3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.H0 = ofFloat;
                ofFloat.addUpdateListener(new nc(this, i10, i3, i11, x02, 2));
                this.H0.addListener(new ii.p2(this, i3, x02, 3));
                this.H0.start();
                return;
            }
            x03 = k6.x0(null, k6.eh, false);
        }
        i3 = x03;
        x02 = i3;
        if (this.F0 != i3) {
        }
    }

    public final void l(int i3) {
        int measuredWidth = this.y.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f);
        if ((this.I0 == i3 || i3 <= 0) && (this.J0 == measuredWidth || measuredWidth <= 0)) {
            return;
        }
        if (i3 != 0) {
            this.I0 = i3;
        }
        if (measuredWidth != 0) {
            this.J0 = measuredWidth;
        }
        this.M.h(measuredWidth - i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m0.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m0.R();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017e  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i10) {
        float A;
        int L;
        k kVar;
        float f10;
        int L2;
        FrameLayout frameLayout = this.K;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i11 = layoutParams.leftMargin;
        r3 r3Var = this.G;
        float f11 = r3Var.b.rtmp_stream ? 0.0f : 1.0f;
        boolean z10 = this.e0;
        boolean z11 = x30.x5;
        if (z10 != z11) {
            this.S = true;
            this.e0 = z11;
        }
        int L3 = org.telegram.messenger.g0.L(2.0f);
        layoutParams.rightMargin = L3;
        layoutParams.leftMargin = L3;
        boolean z12 = this.s;
        fh0 fh0Var = this.V;
        k5 k5Var = this.M;
        if (z12) {
            k5Var.animate().scaleX(f11).scaleY(f11).start();
            fh0Var.animate().scaleX(f11).scaleY(f11).start();
        } else {
            k5Var.animate().cancel();
            k5Var.setScaleX(f11);
            k5Var.setScaleY(f11);
            fh0Var.animate().cancel();
            fh0Var.setScaleX(f11);
            fh0Var.setScaleY(f11);
            frameLayout.animate().cancel();
        }
        this.s = false;
        if (this.b) {
            l(0);
            this.x0 = 1.0f;
            if (x30.y5) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(328.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(4.0f), TLObject.FLAG_30));
            } else if (x30.x5) {
                int size = View.MeasureSpec.getSize(i3);
                if (!r3Var.b.rtmp_stream) {
                    size -= org.telegram.messenger.g0.L(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
            } else {
                int size2 = View.MeasureSpec.getSize(i10);
                if (!r3Var.b.rtmp_stream) {
                    size2 -= org.telegram.messenger.g0.L(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            }
        } else if (this.h) {
            this.x0 = 1.0f;
            int A2 = org.telegram.messenger.camera.q.A(14.0f, 2, Math.min(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10)));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(A2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + A2, TLObject.FLAG_30));
        } else if (this.I) {
            this.x0 = 1.0f;
            int i12 = 6;
            if ((!x30.y5 || this.e == null) && !x30.x5) {
                i12 = 2;
            }
            if (this.e != null) {
                L = View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(344.0f);
            } else if (x30.y5) {
                L = org.telegram.messenger.g0.L(320.0f);
            } else {
                A = org.telegram.messenger.camera.q.A(14.0f, 2, View.MeasureSpec.getSize(i3)) + (x30.x5 ? -org.telegram.messenger.g0.L(90.0f) : 0);
                float f12 = (this.J / i12) * A;
                kVar = this.e;
                if (kVar == null) {
                    f10 = kVar.getItemHeight() - org.telegram.messenger.g0.L(4.0f);
                    L2 = org.telegram.messenger.g0.L(4.0f);
                } else {
                    if (x30.y5) {
                        f10 = A / 2.0f;
                    } else {
                        f10 = A / (x30.x5 ? 3 : 2);
                    }
                    L2 = org.telegram.messenger.g0.L(2.0f);
                }
                float f13 = f12 - L2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                float L4 = this.W.getVisibility() != 0 ? f13 - org.telegram.messenger.g0.L(28.0f) : f13;
                l((int) L4);
                layoutParams2.width = (int) (L4 - (layoutParams2.leftMargin * 2));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30));
            }
            A = L;
            float f122 = (this.J / i12) * A;
            kVar = this.e;
            if (kVar == null) {
            }
            float f132 = f122 - L2;
            FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (this.W.getVisibility() != 0) {
            }
            l((int) L4);
            layoutParams22.width = (int) (L4 - (layoutParams22.leftMargin * 2));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f132, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30));
        } else {
            this.x0 = 0.0f;
            super.onMeasure(i3, i10);
        }
        int size3 = View.MeasureSpec.getSize(i10) + (View.MeasureSpec.getSize(i3) << 16);
        if (this.N != size3) {
            this.N = size3;
            this.E.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(120.0f), 0, i0.a.o(-16777216, 120), Shader.TileMode.CLAMP));
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
        this.o0.a(d);
        q qVar = this.c0;
        qVar.getClass();
        float f10 = ((float) d) / 80.0f;
        float f11 = f10 <= 1.0f ? 0.0f : 1.0f;
        f10 = f11;
        qVar.r = f10;
        qVar.s = (f10 - qVar.n) / 200.0f;
    }

    public void setPrimaryView(k kVar) {
        if (this.c != kVar) {
            this.c = kVar;
            this.S = true;
            j(true);
        }
    }

    public void setSecondaryView(d10 d10Var) {
        if (this.d != d10Var) {
            this.d = d10Var;
            this.S = true;
            j(true);
        }
    }

    public void setTabletGridView(k kVar) {
        if (this.e != kVar) {
            this.e = kVar;
            j(true);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
    }
}
